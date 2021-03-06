package org.mondo.visualization.ui.page.EditingSupport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.CompartmentView;
import graphic_representation.ConditionalRepresentation;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.Edge_Style;
import graphic_representation.Ellipse;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.Layer;
import graphic_representation.Link;
import graphic_representation.LinkedListRepresentation;
import graphic_representation.LoopRepresentation;
import graphic_representation.Node;
import graphic_representation.RepresentationStyle;
import graphic_representation.TreeRepresentation;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

public class ESType extends EditingSupport{

	private ComboBoxCellEditor cellEditor;
	private ComboBoxCellEditor cellTypeCompartment;
	
	
	public ESType(ColumnViewer viewer) {
		
		super(viewer);		
		cellEditor = new ComboBoxCellEditor((Composite) getViewer().getControl(), new String[]{"Node","Edge"});
		cellTypeCompartment = new ComboBoxCellEditor((Composite) getViewer().getControl(), 
				getCompartmentViewStrings().toArray(new String[getCompartmentViewStrings().size()]));		
	}
	
	public List<String> getCompartmentViewStrings() {
		
		List<String> result = new ArrayList<String>();
		Iterator<CompartmentView> it = CompartmentView.VALUES.iterator();
		while (it.hasNext()) {
			CompartmentView compartmentView = (CompartmentView) it.next();
			result.add(compartmentView.getLiteral());
		}
		return result;
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		if (element instanceof CompartmentElement)
			return cellTypeCompartment;
		else
			return cellEditor;		 
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof DiagramElement || element instanceof CompartmentElement)
			return true;
		else
			return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof Node)
			return 0;
		if(element instanceof Edge)
			return 1;
		if (element instanceof CompartmentElement) {
			CompartmentElement compart = (CompartmentElement) element;
			return compart.getCompartmentView().getValue();
		}		
		return 0;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(value instanceof Integer){
			int val = (Integer)value;
			if (element instanceof CompartmentElement) {
				CompartmentElement compartElement = (CompartmentElement) element;
				CompartmentView oldView = compartElement.getCompartmentView();
				CompartmentView newView = CompartmentView.get(val);
				if (!oldView.equals(newView)) {
					compartElement.setCompartmentView(newView);
					if (newView.equals(CompartmentView.LINKED_LIST)) {
						createNonContainmentFeatures(compartElement);						
					} else if (newView.equals(CompartmentView.LOOP_REPRESENTATION)) {
						createLoopRepresentation(compartElement);
					} else if (newView.equals(CompartmentView.CONDITIONAL_REPRESENTATION)) {
						createConditionalRepresentation(compartElement);
					} else if (newView.equals(CompartmentView.TREE_REPRESENTATION)) {
						createTreeRepresentation(compartElement);
					}					
					else if (newView.equals(CompartmentView.NONE))
						compartElement.setRepresentationStyle(null);
					
					getViewer().refresh(element);
				}
			}		
			
			if(val==0 && element instanceof Edge){
				Edge edg = (Edge)element;
				Node nod = Graphic_representationFactoryImpl.eINSTANCE.createNode();
				nod.setAnEClass(edg.getAnEClass());
				nod.getContainerReference().clear();
				nod.getContainerReference().addAll(edg.getContainerReference());
				nod.setNode_elements(Graphic_representationFactoryImpl.eINSTANCE.createNode_Element());
				nod.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
				nod.getDiag_palette().setPalette_name("Create " + nod.getAnEClass().getName());
				nod.setNode_shape(Graphic_representationFactory.eINSTANCE.createRectangle());
				SetOldToNewEObject((Edge)element, nod);				
			}
			else if (val==1 && element instanceof Node) {
				Node nod = (Node)element;
				Edge edg = Graphic_representationFactoryImpl.eINSTANCE.createEdge();
				edg.getContainerReference().clear();
				edg.getContainerReference().addAll(nod.getContainerReference());
				Edge_Style edgStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
				edgStyle.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
				edg.setEdge_style(edgStyle);
				EClass anEClass = nod.getAnEClass();
				List<EReference> listReferences = anEClass.getEAllReferences();
				int count = listReferences.size();
				boolean src = false;
				boolean trg = false;
				Edge_Direction dir = Graphic_representationFactoryImpl.eINSTANCE.createEdge_Direction();
				for (int i = 0; i < count; i++) {
					EReference eReference = listReferences.get(i);
					if(eReference.isContainment() == false)
					{
						Link linkValue = Graphic_representationFactoryImpl.eINSTANCE.createLink();
						linkValue.setAnEReference(eReference);
						if(!src){
							dir.setSourceLink(linkValue);							
							src = true;
						}
						else
							if(!trg){
								dir.setTargetLink(linkValue);
								trg = true;
								break;
							}
					}
				}
				if(src==true && trg==true){
					edg.setAnEClass(anEClass);
					edg.setDirections(dir);
					edg.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
					edg.getDiag_palette().setPalette_name("Create " + nod.getAnEClass().getName());
					SetOldToNewEObject((DiagramElement)element, edg);	
				}
				else
				{
					MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
							"Information about addition",
							"The class has no enough references.");
					return;
				}
			}		
		}		
	}
	
	public static void createNonContainmentFeatures(CompartmentElement compart) {
		
		// Create Representation Style
		RepresentationStyle repre = compart.getRepresentationStyle();
		LinkedListRepresentation linkedListRepre = null;
		if (repre != null) {
			if (repre instanceof LinkedListRepresentation)
				return;
			else {
				linkedListRepre = Graphic_representationFactoryImpl.eINSTANCE.createLinkedListRepresentation();
				compart.setRepresentationStyle(linkedListRepre);				
			}				
		} else {
			linkedListRepre = Graphic_representationFactoryImpl.eINSTANCE.createLinkedListRepresentation();
			compart.setRepresentationStyle(linkedListRepre);
		}
		Ellipse ellipse = Graphic_representationFactory.eINSTANCE.createEllipse();
		ellipse.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderStyle("solid");		
		//Nodes
		linkedListRepre.setInit(ellipse);
		linkedListRepre.setNodeShape(EcoreUtil.copy(ellipse));
		linkedListRepre.setEnd(EcoreUtil.copy(ellipse));
		//Edges
		CompartmentEdge compartEdge = Graphic_representationFactory.eINSTANCE.createCompartmentEdge();
		Edge_Style edgeStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
		edgeStyle.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		compartEdge.setEdge_style(edgeStyle);
		compartEdge.setSource(Graphic_representationFactory.eINSTANCE.createCompartmentLink());
		compartEdge.setTarget(Graphic_representationFactory.eINSTANCE.createCompartmentLink());
		
		linkedListRepre.setInitToFirst(compartEdge);
		linkedListRepre.setNodeToNode(EcoreUtil.copy(compartEdge));
		linkedListRepre.setNodeToEnd(EcoreUtil.copy(compartEdge));
	}
	
	public static void createLoopRepresentation(CompartmentElement compart) {
		
		// Create Representation Style
		LoopRepresentation loopRepresentation = Graphic_representationFactoryImpl.eINSTANCE.createLoopRepresentation();
		compart.setRepresentationStyle(loopRepresentation);
		//Node
		Ellipse ellipse = Graphic_representationFactory.eINSTANCE.createEllipse();
		ellipse.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderStyle("solid");
		//Edge
		CompartmentEdge compartEdge = Graphic_representationFactory.eINSTANCE.createCompartmentEdge();
		Edge_Style edgeStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
		edgeStyle.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		compartEdge.setEdge_style(edgeStyle);
		compartEdge.setSource(Graphic_representationFactory.eINSTANCE.createCompartmentLink());
		compartEdge.setTarget(Graphic_representationFactory.eINSTANCE.createCompartmentLink());		
		//Nodes
		loopRepresentation.setInitShape(ellipse);
		loopRepresentation.setNodeShape(EcoreUtil.copy(ellipse));
		loopRepresentation.setEndShape(EcoreUtil.copy(ellipse));
		//Edges
		loopRepresentation.setInitToNode(compartEdge);
		loopRepresentation.setRecursiveEdge(EcoreUtil.copy(compartEdge));
		loopRepresentation.setNodeToEnd(EcoreUtil.copy(compartEdge));		
	}
	
	public static void createConditionalRepresentation(CompartmentElement compart) {
		
		// Create Representation Style
		ConditionalRepresentation conditionalRepresentation = Graphic_representationFactoryImpl.eINSTANCE.createConditionalRepresentation();
		compart.setRepresentationStyle(conditionalRepresentation);
		//Node
		Ellipse ellipse = Graphic_representationFactory.eINSTANCE.createEllipse();
		ellipse.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderStyle("solid");
		//Edge
		CompartmentEdge compartEdge = Graphic_representationFactory.eINSTANCE.createCompartmentEdge();
		Edge_Style edgeStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
		edgeStyle.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		compartEdge.setEdge_style(edgeStyle);
		compartEdge.setSource(Graphic_representationFactory.eINSTANCE.createCompartmentLink());
		compartEdge.setTarget(Graphic_representationFactory.eINSTANCE.createCompartmentLink());	
		
		//Nodes
		conditionalRepresentation.setInitShape(ellipse);
		conditionalRepresentation.setIfShape(EcoreUtil.copy(ellipse));
		conditionalRepresentation.setThenShape(EcoreUtil.copy(ellipse));
		conditionalRepresentation.setElseShape(EcoreUtil.copy(ellipse));
		conditionalRepresentation.setEndShape(EcoreUtil.copy(ellipse));
		//Edges
		conditionalRepresentation.setInitToIf(compartEdge);
		conditionalRepresentation.setIfToThenNode(EcoreUtil.copy(compartEdge));
		conditionalRepresentation.setThenNodeToEndNode(EcoreUtil.copy(compartEdge));
		conditionalRepresentation.setIfNodeToElseNode(EcoreUtil.copy(compartEdge));
		conditionalRepresentation.setElseNodeToEndNode(EcoreUtil.copy(compartEdge));		
	}	
	
	public static void createTreeRepresentation(CompartmentElement compart) {
		
		// Create Representation Style
		TreeRepresentation treeRepresentation = Graphic_representationFactoryImpl.eINSTANCE.createTreeRepresentation();
		compart.setRepresentationStyle(treeRepresentation);
		
		//Node
		Ellipse ellipse = Graphic_representationFactory.eINSTANCE.createEllipse();
		ellipse.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		ellipse.setBorderStyle("solid");
		//Edge
		CompartmentEdge compartEdge = Graphic_representationFactory.eINSTANCE.createCompartmentEdge();
		Edge_Style edgeStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
		edgeStyle.setColor(Graphic_representationFactory.eINSTANCE.createSiriusSystemColors());
		compartEdge.setEdge_style(edgeStyle);
		compartEdge.setSource(Graphic_representationFactory.eINSTANCE.createCompartmentLink());
		compartEdge.setTarget(Graphic_representationFactory.eINSTANCE.createCompartmentLink());	
		
		//Nodes
		treeRepresentation.setInitShape(ellipse);
		treeRepresentation.setRootShape(EcoreUtil.copy(ellipse));
		treeRepresentation.setNodeShape(EcoreUtil.copy(ellipse));
		treeRepresentation.setEndShape(EcoreUtil.copy(ellipse));		
		//Edges
		treeRepresentation.setInitToRootShape(compartEdge);
		treeRepresentation.setRootShapeToNode(EcoreUtil.copy(compartEdge));
		treeRepresentation.setNodeShapeToEndShape(EcoreUtil.copy(compartEdge));				
	}
	
	
	private void SetOldToNewEObject(DiagramElement element, DiagramElement newElement) {
		
		Layer parent = (Layer)element.eContainer();
		int indexOfElement = parent.getElements().indexOf(element);
		Object[] expandElements = ((TreeViewer)getViewer()).getExpandedElements();
		parent.getElements().remove(indexOfElement);
		parent.getElements().add(indexOfElement, newElement);
		((TreeViewer)getViewer()).setExpandedElements(expandElements);
		getViewer().refresh(parent);	
	}
}
