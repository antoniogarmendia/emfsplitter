package org.mondo.visualization.ui.page.EditingSupport;

import graphic_representation.AffixedCompartmentElement;
import graphic_representation.AffixedElement;
import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.CompartmentView;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.Edge_Direction;
import graphic_representation.GeneralLabel;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.LabelEAttribute;
import graphic_representation.Link;
import graphic_representation.LinkedListRepresentation;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.RepresentationStyle;
import graphic_representation.Shape;
import graphic_representation.VirtualCompartment;
import graphic_representation.VirtualCompartmentOCL;
import graphic_representation.VirtualCompartmentReference;
import graphic_representation.WEAttribute;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.PlatformUI;
import org.mondo.visualization.ui.wizard.VirtualContainerOclDialog;

public class ESActivate extends EditingSupport{
	
	private ComboBoxCellEditor cmb_editor;
	private DialogCellEditor cellVirtualCompartment;
	
	public ESActivate(ColumnViewer viewer) {
		
		super(viewer);		
		cmb_editor = new ComboBoxCellEditor((Composite) getViewer().getControl(), new String[]{});
		cmb_editor.setStyle(SWT.CENTER);		 
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		
		if(element instanceof WEAttribute)//LabelEAttr
		{
			WEAttribute wattr = (WEAttribute) element;
			EClass class_attr = wattr.getEAttribute().getEContainingClass();
			AddEAllAttributes(class_attr);
			return cmb_editor;
		}
		
		if(element instanceof EdgeLabelEAttribute) { //Edge Attribute
			
			AddEAllAttributes(((EdgeLabelEAttribute)element).getLabelEAttribute().getEContainingClass());
			return cmb_editor;
		}
		
		if(element instanceof Link)
		{
			Link ref = (Link)element;
			EClass class_attr = ref.getAnEReference().getEContainingClass();
			AddEAllEReferences(class_attr);
			return cmb_editor;
		}
		
		if(element instanceof AffixedCompartmentElement)
		{
			EObject parentEObjectElement = ((AffixedCompartmentElement) element).eContainer();
			if (parentEObjectElement instanceof Node_Element) {
				Node_Element parentNodeElement = (Node_Element) parentEObjectElement;
				EObject parentEObjectNode = parentNodeElement.eContainer();
				if (parentEObjectNode instanceof Node) {
					Node parentNode = (Node) parentEObjectNode;
					EClass eClass = parentNode.getAnEClass();					
					AddEAllEReferences(eClass);	
				}
			}	
			
			return cmb_editor;
		}	
		
		if (element instanceof VirtualCompartmentReference) {
			
			EObject parentEObjectElement = ((VirtualCompartmentReference) element).eContainer();
			if (parentEObjectElement instanceof Node_Element) {
				Node_Element parentNodeElement = (Node_Element) parentEObjectElement;
				EObject parentEObjectNode = parentNodeElement.eContainer();
				if (parentEObjectNode instanceof Node) {
					Node parentNode = (Node) parentEObjectNode;
					EClass eClass = parentNode.getAnEClass();
					AddEAllEReferencesContainments(eClass);	
				}
			}
			
			return cmb_editor;
		}
		
		if (element instanceof VirtualCompartmentOCL) {
				
			cellVirtualCompartment = getCellVirtualCompartmentOcl(element);
			cellVirtualCompartment.create((Composite) getViewer().getControl());
			return cellVirtualCompartment;			
		}
		
		return null;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof LabelEAttribute || element instanceof Link || element instanceof AffixedCompartmentElement
				|| element instanceof EdgeLabelEAttribute || element instanceof VirtualCompartment || element instanceof WEAttribute)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		
		if (element instanceof WEAttribute) {
			WEAttribute attr = ((WEAttribute) element);
			return FindEAttribute(attr.getEAttribute());
		}
		
		if (element instanceof EdgeLabelEAttribute)
			return FindEAttribute(((EdgeLabelEAttribute)element).getLabelEAttribute());
		
		if(element instanceof Link)
			return this.FindEReference(((Link)element).getAnEReference());	
		
		if(element instanceof AffixedCompartmentElement)
			return this.FindEReference(((AffixedCompartmentElement)element).getAnEReference());
		
		if(element instanceof VirtualCompartmentReference)
			return this.FindEReferenceContainment(((VirtualCompartmentReference)element).getVirtualReference());
		
		if (element instanceof VirtualCompartmentOCL) {
			if (((VirtualCompartmentOCL) element).getNode() != null)
				return ((VirtualCompartmentOCL) element).getNode().getAnEClass().getName();
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {				

		if (element instanceof CompartmentElement) {
			
			CompartmentElement compartElement = (CompartmentElement) element;
			EObject parentEObjectElement = compartElement.eContainer();
			if (parentEObjectElement instanceof Node_Element) {
				Node_Element nodeElement = (Node_Element) parentEObjectElement;
				EObject parentNodeElement = nodeElement.eContainer();
				if (parentNodeElement instanceof Node) {
					Node parentNode = (Node) parentNodeElement;
					EClass eClass = parentNode.getAnEClass();
	 				EReference newReference = eClass.getEAllReferences().get((Integer) value);
	 				EReference oldReference = compartElement.getAnEReference();
	 				if (!newReference.equals(oldReference)) {
		 				compartElement.setAnEReference(newReference);
		 				if (compartElement.getCompartmentView() == CompartmentView.LINKED_LIST)
		 					createNonContainmentFeatures(compartElement);
	 				}
				}
			}
			
			System.out.println("CompartmentElement");
		}	
		
		if (element instanceof AffixedElement) {
			
			AffixedElement affixedElement = (AffixedElement) element;
			EObject parentEObjectElement = affixedElement.eContainer();
			if (parentEObjectElement instanceof Node_Element) {
				Node_Element nodeElement = (Node_Element) parentEObjectElement;
				EObject parentNodeElement = nodeElement.eContainer();
				if (parentNodeElement instanceof Node) {
					Node parentNode = (Node) parentNodeElement;
					EClass eClass = parentNode.getAnEClass();
	 				EReference newReference = eClass.getEAllReferences().get((Integer) value);
	 				EReference oldReference = affixedElement.getAnEReference();
	 				if (!newReference.equals(oldReference)) {
	 					affixedElement.setAnEReference(newReference);		 				
	 				}
				}				
			}
			System.out.println("AffixedElement");			
		}		
		
		if (element instanceof VirtualCompartmentReference) {
			
			VirtualCompartmentReference virtualCompartment = (VirtualCompartmentReference) element;
			EObject parent = virtualCompartment.eContainer();
			if (parent instanceof Node_Element) {
				Node_Element nodeElement = (Node_Element) parent;
				EObject parentNodeElement = nodeElement.eContainer();
				if (parentNodeElement instanceof Node) {
					Node parentNode = (Node) parentNodeElement;
					EClass eClass = parentNode.getAnEClass();
	 				EReference newReference = eClass.getEAllContainments().get((Integer) value);
	 				virtualCompartment.setVirtualReference(newReference);	 				
				}				
			}
			
			System.out.println("VirtualCompartment");
		}
		
		
		if(element instanceof WEAttribute)
		{
			WEAttribute wattribute = (WEAttribute) element;
			EClass class_attr = wattribute.getEAttribute().getEContainingClass();
			EAttribute newattr = class_attr.getEAllAttributes().get(((Integer)value));
			if(!newattr.equals(wattribute.getEAttribute())) {
				EObject labelEObject = wattribute.eContainer();
				if (labelEObject instanceof LabelEAttribute) {
					LabelEAttribute label = (LabelEAttribute) labelEObject;
					int index = this.MissingEAttribute(class_attr.getEAllAttributes(), label.getLabelAttributes());
					if(index!=-1)
						wattribute.setEAttribute(newattr);						
					else
						MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
								"Information about addition",
								"The attribute is already selected  as a label");
				}
				System.out.println("adsad");
			}			
		}
		
		if(element instanceof EdgeLabelEAttribute) {
			
			EdgeLabelEAttribute labelEdge = ((EdgeLabelEAttribute) element);
			EAttribute eAttribute = labelEdge.getLabelEAttribute();
			EClass eClass = eAttribute.getEContainingClass();
			EAttribute newEAttribute = eClass.getEAllAttributes().get((Integer)value);
			if(!newEAttribute.equals(eAttribute)) {
				labelEdge.setLabelEAttribute(newEAttribute);
			}			
		}
		
		if(element instanceof Link)
		{
			Link elementLink = (Link)element;
			EObject parent_elementLink = elementLink.eContainer();
			if(parent_elementLink instanceof Edge_Direction)
			{
				Edge_Direction edgDir = (Edge_Direction) parent_elementLink;
				EReference newRef = this.FindReferencebyPosition(elementLink.getAnEReference(), (Integer)value);
				if(edgDir.getSourceLink().equals(elementLink)){
					if(edgDir.getSourceLink().getAnEReference().equals(newRef) == false)
					{
						edgDir.getTargetLink().setAnEReference(edgDir.getSourceLink().getAnEReference());
						Link updateLink = edgDir.getSourceLink();
						updateLink.setAnEReference(newRef);
						getViewer().update(updateLink, null);
						getViewer().refresh();
					}
				}
				else if(edgDir.getTargetLink().equals(elementLink))
				{
					if(edgDir.getTargetLink().getAnEReference().equals(newRef) == false)
					{	
						edgDir.getSourceLink().setAnEReference(edgDir.getTargetLink().getAnEReference());
						Link updateLink = edgDir.getTargetLink();
						updateLink.setAnEReference(newRef);
						getViewer().update(updateLink, null);
						getViewer().refresh();
					}
				}				
			}	
			if(parent_elementLink instanceof Node_Element)
			{
				PaletteDescriptionLink linkref = (PaletteDescriptionLink) element;
				Node_Element parentNode_Element = (Node_Element) parent_elementLink;
				EList<PaletteDescriptionLink> full_list = parentNode_Element.getLinkPalette();
				EClass class_ref = linkref.getAnEReference().getEContainingClass();
				EReference newref = class_ref.getEAllReferences().get(((Integer)value));
				int index = FindEReferenceLinkPalette(full_list, newref);
				if(index==-1)
				{
					Iterator<AffixedCompartmentElement> itCompartAffixed = parentNode_Element.getAffixedCompartmentElements().iterator();
					while (itCompartAffixed.hasNext()) {
						AffixedCompartmentElement type = (AffixedCompartmentElement) itCompartAffixed.next();
						if(type.getAnEReference().equals(newref))
							{
								if(type instanceof AffixedElement)
									MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
											"Information about addition",
											"The Containment Reference is already selected  as an Affixed");
								else if(type instanceof CompartmentElement)
									MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
											"Information about addition",
											"The Containment Reference is already selected  as a Compartment");
								return;
							}
					}
					
					int pos = parentNode_Element.getLinkPalette().indexOf(linkref);
					PaletteDescriptionLink newlinkref  = Graphic_representationFactoryImpl.eINSTANCE.createPaletteDescriptionLink();
					newlinkref.setAnEReference(newref);
					newlinkref.setPalette_name("Create Link " + newref.getName());
					parentNode_Element.getLinkPalette().set(pos, newlinkref);
				}
				else
				{
					if(newref.equals(elementLink.getAnEReference()) == false)
						MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
																	"Information about addition",
																	"The reference is already selected  as a link");
				}
			}
		}	
		
		getViewer().update(element, null);	
		getViewer().refresh();
	}
	
	private void AddEAllAttributes(EClass class_attr) {
		
		EList<EAttribute> listEAttribute = class_attr.getEAllAttributes();
		ArrayList<String> list = new ArrayList<String>();
		int count = listEAttribute.size();
		for (int i = 0; i < count; i++) {
			list.add(listEAttribute.get(i).getName());
		}
		cmb_editor.setItems(list.toArray(new String[count]));
	}
	
	private void AddEAllEReferences(EClass class_attr) {
		
		EList<EReference> listEReference = class_attr.getEAllReferences();
		ArrayList<String> list = new ArrayList<String>();
		int count = listEReference.size();
		for (int i = 0; i < count; i++) {
			list.add(listEReference.get(i).getName());
		}
		cmb_editor.setItems(list.toArray(new String[count]));
	}
	
	private void AddEAllEReferencesContainments(EClass class_attr){
		
		EList<EReference> listEReference = class_attr.getEAllContainments();
		ArrayList<String> list = new ArrayList<String>();
		int count = listEReference.size();
		for (int i = 0; i < count; i++) {
			list.add(listEReference.get(i).getName());
		}
		cmb_editor.setItems(list.toArray(new String[count]));
		
	}	
	
	//Method for search the position of the EReference
	public int FindEReference(EReference ref){
		
		return ref.getEContainingClass().getEAllReferences().indexOf(ref);	
	}
	
	//Method for search the EReference from position
	public EReference FindReferencebyPosition(EReference ref,int pos)
	{
		EClass anEClass = ref.getEContainingClass();
		return anEClass.getEAllReferences().get(pos);
	}
	
	//Method for search the position of an EReference Containment
	public int FindEReferenceContainment(EReference ref){
	
		return ref.getEContainingClass().getEAllContainments().indexOf(ref);		
	}
	
	//Method for search the EReference Containment by position 
	public EReference FindReferenceContainmentbyPosition(EReference ref,int pos){
		
		EClass anEClass = ref.getEContainingClass();
		return anEClass.getEAllContainments().get(pos);
	}
	
	//Method for search the position of the EAttribute
	public int FindEAttribute(EAttribute attr){
		
		int indexEAttribute =  attr.getEContainingClass().getEAllAttributes().indexOf(attr);
		return indexEAttribute;		
	}
	
	public int FindEReferenceLinkPalette(EList<PaletteDescriptionLink> full_list, EReference ref){
		
		int count_list = full_list.size();
		for (int i = 0; i < count_list; i++) {
			if(full_list.get(i).getAnEReference().equals(ref))
				return i;
		}
		return -1;				
	}	
	
	public int MissingEAttribute(EList<EAttribute> fulllist, EList<WEAttribute> listLabelEAttribute)
	{
		Iterator<EAttribute> it_fullist = fulllist.iterator();
		while (it_fullist.hasNext()) {
			EAttribute attr = it_fullist.next();
			Iterator<WEAttribute> itWAttributtes = listLabelEAttribute.iterator();
			boolean find = false;
			while (itWAttributtes.hasNext()) {
				WEAttribute weAttribute = (WEAttribute) itWAttributtes.next();
				if (weAttribute.getEAttribute().equals(attr)) {
					find = true;
					break;
				}
			}
			if (find == false)
				return fulllist.indexOf(attr);
		}
		
		return -1;		
	}
	
	private DialogCellEditor getCellVirtualCompartmentOcl(Object element) {
		
		return new DialogCellEditor() {

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				if (element instanceof VirtualCompartmentOCL) {
					VirtualCompartmentOCL virtualCompartmentOcl = (VirtualCompartmentOCL) element;
					VirtualContainerOclDialog dialog = new VirtualContainerOclDialog(cellEditorWindow.getShell(), virtualCompartmentOcl);
					if (dialog.open() == Dialog.OK) {
						getViewer().update(element, null);
						getViewer().refresh();
					}												
				}				
				return null;
			}				
		};
	}
	
	
	public static void createNonContainmentFeatures(CompartmentElement compart) {
		
		RepresentationStyle repre = compart.getRepresentationStyle();
		LinkedListRepresentation linkedListRepre = null;
		if (repre instanceof LinkedListRepresentation) {
			return;			
		} else {
			linkedListRepre = Graphic_representationFactoryImpl.eINSTANCE.createLinkedListRepresentation();
			compart.setRepresentationStyle(linkedListRepre);
		}
				
		//Nodes
		linkedListRepre.setInit(Graphic_representationFactory.eINSTANCE.createEllipse());
		linkedListRepre.setNodeShape(Graphic_representationFactory.eINSTANCE.createEllipse());
		linkedListRepre.setEnd(Graphic_representationFactory.eINSTANCE.createEllipse());
		//Edges
		CompartmentEdge compartEdge = Graphic_representationFactory.eINSTANCE.createCompartmentEdge();
		compartEdge.setSource(Graphic_representationFactory.eINSTANCE.createCompartmentLink());
		compartEdge.setTarget(Graphic_representationFactory.eINSTANCE.createCompartmentLink());
		
		linkedListRepre.setInitToFirst(compartEdge);
		linkedListRepre.setNodeToNode(EcoreUtil.copy(compartEdge));
		linkedListRepre.setNodeToEnd(EcoreUtil.copy(compartEdge));
	}	
}
