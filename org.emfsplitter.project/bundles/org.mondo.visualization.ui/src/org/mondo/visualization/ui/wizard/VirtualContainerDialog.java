package org.mondo.visualization.ui.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import graphic_representation.AllElements;
import graphic_representation.Layer;
import graphic_representation.Node;
import graphic_representation.VirtualCompartment;
import graphic_representation.VirtualCompartmentReference;

public class VirtualContainerDialog extends Dialog {

	private VirtualCompartmentReference virtualCompartment;
	
	//Widgets
	private Combo cmbContainmentReferences;
	private Combo cmbNodes;
	
	//Results
	private String containmentReference;
	private String Node;
		
	public VirtualContainerDialog(Shell parentShell, VirtualCompartmentReference virtualCompartment) {
		super(parentShell);	
		this.virtualCompartment = virtualCompartment;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);	
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lbContainmentReference = new Label(container, SWT.NONE);
		lbContainmentReference.setText(virtualCompartment.getVirtualReference().getEType().getName() + ".Containment References");
		
		cmbContainmentReferences = new Combo(container, SWT.NONE);
		List<String> listOfContainment = getContainmentReferenceList((EClass)this.virtualCompartment.getVirtualReference().getEType());
		cmbContainmentReferences.setItems(listOfContainment.toArray(new String[listOfContainment.size()]));
		if (virtualCompartment.getContainerReference()!=null)
			cmbContainmentReferences.setText(virtualCompartment.getContainerReference().getName());
		
		Label lbNode = new Label(container, SWT.NONE);
		lbNode.setText("Node");
		
		cmbNodes = new Combo(container, SWT.NONE);
		List<String> listOfNodes = getListOfNodes();
		cmbNodes.setItems(listOfNodes.toArray(new String[listOfNodes.size()]));
		if (virtualCompartment.getNode()!=null)
			cmbNodes.setText(virtualCompartment.getNode().getAnEClass().getName());		
						
		return container;
	}
	
	private List<String> getListOfNodes() {
		
		List<String> result = new ArrayList<String>();
		Iterator<Node> itNodes = getNodes().iterator();
		while (itNodes.hasNext()) {
			Node node = (Node) itNodes.next();
			result.add(node.getAnEClass().getName());
		}
		return result;
	}
	
	private EList<Node> getNodes() {
		
		EObject eContainer = virtualCompartment.eContainer().eContainer().eContainer();
		EList<Node> nodes = new BasicEList<Node>();
		if (eContainer instanceof Layer) {
			Layer layer = (Layer) eContainer;
			Iterator<AllElements> allElements = layer.getElements().iterator();
			while (allElements.hasNext()) {
				AllElements elements = allElements.next();
				if (elements instanceof Node) 
					nodes.add((Node) elements);
			}			
		}	
		
		return nodes;
	}

	public List<String> getContainmentReferenceList(EClass anEClass) {
		
		List<String> result = new ArrayList<String>();
		Iterator<EReference> itContainment = anEClass.getEAllContainments().iterator();
		while (itContainment.hasNext()) {
			EReference eReference = (EReference) itContainment.next();
			result.add(eReference.getName());
		}		
		return result;
	}
	
	@Override
	protected void okPressed() {
		
		this.containmentReference = this.cmbContainmentReferences.getText();
		this.Node = this.cmbNodes.getText();
		super.okPressed();
	}
	
	public String getContainmentReference() {
		return containmentReference;
	}
	
	public String getNode() {
		return Node;
	}
}
