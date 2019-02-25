package org.mondo.visualization.ui.page.EditingSupport;

import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.mondo.visualization.ui.wizard.ContainerDialog;
import org.mondo.visualization.ui.wizard.VirtualContainerDialog;

import graphic_representation.AllElements;
import graphic_representation.Color;
import graphic_representation.Layer;
import graphic_representation.Node;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.SiriusSystemColors;
import graphic_representation.VirtualCompartment;
import graphic_representation.VirtualCompartmentReference;

public class ESEClass extends EditingSupport{

	private DialogCellEditor cellVirtualCompartment;
	
	public ESEClass(ColumnViewer viewer) {
		super(viewer);				
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
			
		if (element instanceof VirtualCompartmentReference) {
			
			cellVirtualCompartment = getCellVirtualCompartment(element);			
			cellVirtualCompartment.create((Composite) getViewer().getControl());
			return cellVirtualCompartment;
		}			
		
		return new TextCellEditor((Composite) getViewer().getControl());
	}

	private DialogCellEditor getCellVirtualCompartment(Object element) {
		
		return new DialogCellEditor() {

			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				if (element instanceof VirtualCompartmentReference) {
					
					VirtualCompartmentReference virtual = (VirtualCompartmentReference) element;
					VirtualContainerDialog dialog = new VirtualContainerDialog(cellEditorWindow.getShell(), virtual);
					if (dialog.open() == Dialog.OK) {
						
						String newContainmentReference = dialog.getContainmentReference();
						String newNode = dialog.getNode();
						if (virtual.getContainerReference() == null || 
								!virtual.getContainerReference().getName().equals(newContainmentReference))
							virtual.setContainerReference(getReferenceByName((EClass) virtual.getVirtualReference().getEType(),
									newContainmentReference));
												
						if(virtual.getNode() == null || !virtual.getNode().getAnEClass().getName().equals(newNode)) 
							virtual.setNode(getNodeByClassName(((Layer)virtual.eContainer().eContainer().eContainer()),
									newNode));					
					}									
				}				
				return null;
			}				
		};
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof Layer || element instanceof VirtualCompartmentReference)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof Layer)
			return ((Layer)element).getName();	
		if(element instanceof VirtualCompartment)
			return "EReference.VirtualCompartment";
		return true;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(element instanceof Layer)
			((Layer)element).setName((String)value);
		getViewer().update(element, null);		
	}	
	
	public EReference getReferenceByName(EClass anEClass, String referenceName) {
		
		Iterator<EReference> listOfAllReferences = anEClass.getEAllReferences().iterator();
		while (listOfAllReferences.hasNext()) {
			EReference eReference = (EReference) listOfAllReferences.next();
			if (eReference.getName().equals(referenceName))
				return eReference;
		}
		
		return null;
	}
	
	public Node getNodeByClassName(Layer layer, String className) {
		
		Iterator<AllElements> itElements = layer.getElements().iterator();
		while (itElements.hasNext()) {
			AllElements allElements = (AllElements) itElements.next();
			if (allElements instanceof Node) {
				Node node = (Node) allElements;
				if (node.getAnEClass().getName().equals(className))
					return node;
			}
		}
		
		return null;
	}
}
