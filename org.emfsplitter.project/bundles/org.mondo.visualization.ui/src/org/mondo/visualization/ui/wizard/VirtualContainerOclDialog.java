package org.mondo.visualization.ui.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import graphic_representation.AllElements;
import graphic_representation.Layer;
import graphic_representation.Node;
import graphic_representation.VirtualCompartmentOCL;

public class VirtualContainerOclDialog extends Dialog {

	private VirtualCompartmentOCL virtualCompartmentOcl;
	
	//Widgets
	private Combo cmbNodes;
	private StyledText txtOcl;
	
	public VirtualContainerOclDialog(Shell parentShell, VirtualCompartmentOCL virtualCompartmentOcl) {
		super(parentShell);		
		this.virtualCompartmentOcl = virtualCompartmentOcl;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {		
		Composite container = new Composite(parent, SWT.NONE);	
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lbNode = new Label(container, SWT.NONE);
		lbNode.setText("Node");
		
		cmbNodes = new Combo(container, SWT.NONE);
		
		List<String> listOfNodes = getListOfNodes();
		cmbNodes.setItems(listOfNodes.toArray(new String[listOfNodes.size()]));
		if (virtualCompartmentOcl.getNode()!=null)
			cmbNodes.setText(virtualCompartmentOcl.getNode().getAnEClass().getName());
		
		cmbNodes.addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				Layer currentLayer = (Layer) (virtualCompartmentOcl).eContainer().eContainer().eContainer();
				String newNode = cmbNodes.getItem(cmbNodes.getSelectionIndex());
				virtualCompartmentOcl.setNode(getNodeByClassName(currentLayer, newNode));				
			}
		});
		
		Label lbOcl = new Label(container, SWT.NONE);
		lbOcl.setText("OCL");
		
		txtOcl = new StyledText(container, SWT.MULTI | SWT.BORDER);
		
		GridData dataContent = new GridData(GridData.FILL_BOTH);
		dataContent.verticalAlignment = SWT.CENTER;
		dataContent.grabExcessHorizontalSpace = true;
		dataContent.grabExcessVerticalSpace = true;
		dataContent.heightHint = 150;	
		dataContent.widthHint = 300;
		txtOcl.setLayoutData(dataContent);		
		
		txtOcl.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				virtualCompartmentOcl.setOclExpression(txtOcl.getText());				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				// Do nothing				
			}
		});
		
		if (virtualCompartmentOcl.getOclExpression() != null)
			txtOcl.setText(virtualCompartmentOcl.getOclExpression());
		
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
		
		EObject eContainer = virtualCompartmentOcl.eContainer().eContainer().eContainer();
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
