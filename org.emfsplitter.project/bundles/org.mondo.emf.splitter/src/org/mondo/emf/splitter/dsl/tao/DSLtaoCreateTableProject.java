package org.mondo.emf.splitter.dsl.tao;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.mondo.editor.extensionpoints.IPatternImplementation;
import org.mondo.editor.extensionpoints.ValidationInfo;
import org.mondo.editor.graphiti.diagram.utils.ModelUtils;
import org.mondo.miso.table.ui.wizard.DialogConcreteTableVisualization;
import org.mondo.miso.table.ui.wizard.WizardDefineTableVisualization;

import dslPatterns.MMInterface;
import dslPatterns.Pattern;
import graphic_representation.GraphicRepresentation;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Representation;
import graphic_representation.RepresentationTable;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.SplitterLibraryFactoryImpl;

public class DSLtaoCreateTableProject implements IPatternImplementation {

	public DSLtaoCreateTableProject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute(EPackage ePack, PatternInstance pattern, IPath iPath) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ValidationInfo validate(EPackage ePack, PatternInstance pattern) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ENamedElement> getOptimalElements(EPackage ePack, MMInterface mminterface) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean applyPattern(EPackage ePack, Pattern pattern, PatternInstances patternInstances, IPath iPath) {
		
		EcoreEMF nemf = SplitterLibraryFactoryImpl.eINSTANCE.createEcoreEMF();
		//File uri of the ecore Meta-Model
		IPath ecorePath = iPath.removeFileExtension().addFileExtension("ecore");
		//If *.ecore doesn't exist Create it!!
		IResource resEcore = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(ecorePath);
		if(!resEcore.exists())
			try {
				  Copier copier = new Copier();
				  EObject result = copier.copy(ePack);
				  copier.copyReferences();			  
				  ModelUtils.saveModel(resEcore.getLocationURI().toString(), result);
			} catch (IOException e) {
					
				e.printStackTrace();
			}
		//END
		nemf.setFileuri(resEcore.getLocationURI().toString());
		
		WizardDefineTableVisualization wizard = new WizardDefineTableVisualization();
		
		DialogConcreteTableVisualization dialog = new DialogConcreteTableVisualization(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
				, wizard);
			
		wizard.setNemf(nemf);
		
		//Search a graphic representation
		IPath graphicRPath = iPath.removeFileExtension().addFileExtension("graphicR");
		URI graphicRUri = URI.createFileURI(graphicRPath.toString());
		
		boolean fileExist = new ExtensibleURIConverterImpl().exists(graphicRUri, null);
		
		if (fileExist == true) {
			
			Resource res = nemf.getRs().getResourceSet().getResource(graphicRUri, true);
			EObject rootEObject = res.getContents().get(0);
			
			if (rootEObject instanceof GraphicRepresentation) {
			
				GraphicRepresentation graphicRepre = (GraphicRepresentation) rootEObject;
				EList<RepresentationTable> listOfTables = getListOfRepresentationTable(graphicRepre);
				
				if (listOfTables.size()>0) {
				
					boolean result = MessageDialog.openQuestion(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Update/Override", 
									"A file with the Table pattern definition has been detected. "
									+ "Would you like to update the pattern?");
					
					if (result == true) {
						wizard.setListRepresentations(listOfTables);						
					}					
				}				
			}			
		}		
			
		dialog.open();
		
		return true;
	}
	
	public EList<RepresentationTable> getListOfRepresentationTable(GraphicRepresentation graphicRepresentation) {
		
		EList<RepresentationTable> result = new BasicEList<RepresentationTable>();
		
		Iterator<MMGraphic_Representation> allRepresentations = graphicRepresentation.getAllGraphicRepresentation().iterator();
		while (allRepresentations.hasNext()) {
			MMGraphic_Representation mmGraphic_Representation = (MMGraphic_Representation) allRepresentations.next();
			
			Iterator<Representation> itRepresentations = mmGraphic_Representation.getListRepresentations().iterator();
			while (itRepresentations.hasNext()) {
				Representation representation = (Representation) itRepresentations.next();
				if (representation instanceof RepresentationTable) 
					result.add((RepresentationTable) representation);
			}			
		}
		
		return result;
	}

}
