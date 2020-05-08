package org.miso.wizard.instantiate.modular.pattern.wizard;

import java.io.IOException;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.ui.editor.IDiagramContainerUI;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.miso.wizard.instantiate.modular.pattern.pages.PageSelectClassProject;
import org.miso.wizard.instantiate.modular.pattern.utils.GraphToModularityPattern;
import org.miso.wizard.instantiate.modular.pattern.utils.PatternModularUtils;

import MetaModelGraph.Graph;
import dslHeuristicVisualization.DslHeuristicVisualizationFactory;
import dslHeuristicVisualization.EcoreMatrixContainment;
import dslPatterns.Pattern;
import dslPatterns.PatternSet;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.util.DSLtaoUtils;
import org.eclipse.graphiti.mm.pictograms.Diagram;

public class WizardApplyModularPattern extends DynamicWizard{
	
	static final String PATTERNS_FOLDER = "patterns";
	static final String PATTERNS_FILE_NAME = "repository.dslpatterns";

	protected ModularityPatternPage patternPage;
	protected PageSelectClassProject pageProject;
	protected EList<EClass> listEClasses;
	protected EcoreMatrixContainment ecoreContainment;
	protected Graph eGraph;
	protected Resource eResource;
	private WizardDialog dialog;
	private IProject eProject;
	private PatternInstances modularInstance;
	private PatternInstance modInstance;
					
	public WizardApplyModularPattern(Resource eResource, IProject iProject) {
		
		super();
		this.eResource = eResource;
		this.eProject = iProject;
		this.eGraph =  null;
		this.modularInstance = null;
		this.modInstance = null;
		
		obtainEClassesResource();
		
		executeContainmentMatrix();
		setForcePreviousAndNextButtons(true);
		setWindowTitle("Wizard to Apply the Modularity Pattern");
	}
	
	public Graph getGraph(){
		
		return this.eGraph;
	}	
	
	public void seteGraph(Graph eGraph) {
		
		this.eGraph = eGraph;
	}
	
	@Override
	public void addPages() {
		
		super.addPages();
				
		//Select the Roots 
		patternPage = new ModularityPatternPage("Modularity Pattern");
		pageProject = new PageSelectClassProject("Select the Class Project",getListEClasses(),ecoreContainment);
		addPage(patternPage);
		addPage(pageProject);			
	}
	
	public EList<EClass> getListEClasses(){
		return this.listEClasses;
	}
	
	private void obtainEClassesResource() {
		
		this.listEClasses = new BasicEList<EClass>();
		TreeIterator<EObject> itContents = this.eResource.getAllContents();
		while (itContents.hasNext()) {
			EObject eObject = (EObject) itContents.next();
			if(eObject instanceof EClass)
			{
				this.listEClasses.add((EClass) eObject);
			}
		}
	
	}
	
	private void executeContainmentMatrix()
	{
		this.ecoreContainment = DslHeuristicVisualizationFactory.eINSTANCE.createEcoreMatrixContainment();
		this.ecoreContainment.GetDirectMatrixContainment(this.getListEClasses());
		this.ecoreContainment.GetPathMatrix();
	}
		
	
	@Override
	public boolean performFinish() {
		
		try {
			this.eGraph.eResource().save(null);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//Obtain diagram
		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		IDiagramContainerUI editor = (IDiagramContainerUI)activePage.getActiveEditor();
		Diagram currentDiagram = editor.getDiagramTypeProvider().getDiagram();
		
		// obtain Modular Pattern
		PatternSet patternModel = this.getPatternSetModelByDiagrama(currentDiagram);
		Pattern modularPattern = DSLtaoUtils.getModularPattern(patternModel);
		//DSLtaoUtils.setPatternAbsoluteUri(this.eProject, modularPattern.eResource());
		modularInstance = DSLtaoUtils.createPatternInstances();
		
		//convert graph to runtime patterns
		GraphToModularityPattern transoPattern = new GraphToModularityPattern(modularPattern);
		transoPattern.tranformGraphToModularityPattern(eGraph, modularInstance);
		this.modInstance = modularInstance.getAppliedPatterns().get(0);
		
		// save runtime patterns
		URI uri = this.eResource.getURI().trimFileExtension().appendFileExtension("rtpat");
		boolean exisRtpat = DSLtaoUtils.existRuntimePatterns(uri);		
		
		if(exisRtpat == false) {
			//create runtime patterns
			PatternModularUtils.saveRuntimePatternModel(modularInstance, uri);
		}
		else {
			// update runtime patterns
			PatternModularUtils.savePatternInstanceInRtapt(uri,modularInstance.getAppliedPatterns().get(0),DSLtaoUtils.catModularity);
		}
		
		return true;
	}	

	/**
	 * Static method that returns the PatternSet object stored on the given project relative to the diagram
	 * @param project
	 * @return PatternSet, null if it's not possible
	 */
	
	private PatternSet getPatternSetModelByDiagrama(Diagram diagram) {
		URI diagramURI = diagram.eResource().getURI();
		URI parentURI = diagramURI.trimSegments(1);
		URI repositoryURI = parentURI.appendSegment(PATTERNS_FOLDER).appendSegment(PATTERNS_FILE_NAME);
		ResourceSet resourceSet = new ResourceSetImpl();
		try{
			Resource resource = resourceSet.getResource(repositoryURI, true);		
			if (resource != null){
				PatternSet patternSet = (PatternSet) resource.getContents().get(0);	
				//Set Relative
				//setRelativeURI(patternSet.eResource());
				return patternSet;
			}
		}catch (RuntimeException e){
		}		
		return null;
	}
	
	/**
	 * Static method that change the uri of the given Patterns resource to convert it into relative.
	 * @param resource
	 */
	public static void setPatternsRelativeURI(Resource resource){
		URI relativeURI = URI.createURI(PATTERNS_FOLDER+"/"+PATTERNS_FILE_NAME, false);
		resource.setURI(relativeURI);
	}

	public WizardDialog getDialog() {
		return dialog;
	}

	public void setDialog(WizardDialog dialog) {
		this.dialog = dialog;
	}	
	
	public PatternInstance getModularInstance() {
		return this.modInstance;
	}
	
	
	
 }
