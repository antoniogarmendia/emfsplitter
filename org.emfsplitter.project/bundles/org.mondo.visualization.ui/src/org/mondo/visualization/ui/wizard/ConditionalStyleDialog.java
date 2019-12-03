package org.mondo.visualization.ui.wizard;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import graphic_representation.Color;
import graphic_representation.ConditionalStyle;
import graphic_representation.Node;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.SiriusSystemColors;

public class ConditionalStyleDialog extends Dialog{
	
	private EClass eClass;
	private EAttribute eAttribute;
	private String value;
	private ConditionalStyle condStyle;
	
	//Widgets
	private Combo cmbAttribute;
	private Text txtValue;
	

	public ConditionalStyleDialog(Shell parentShell, EClass eClass, ConditionalStyle condStyle) {
		super(parentShell);
		this.eClass = eClass;
		eAttribute = null;
		value = null;
		this.condStyle = condStyle;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lblFontFormat = new Label(container, SWT.NONE);
		lblFontFormat.setText("Choose Attribute ");
		
		cmbAttribute = new Combo(container, SWT.NONE);
		cmbAttribute.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		cmbAttribute.setItems(getEAttributesString(eClass).toArray(new String[eClass.getEAllAttributes().size()]));
		
		if (geteAttribute() != null)
			cmbAttribute.select(eClass.getEAllAttributes().indexOf(geteAttribute()));
		
		Label lblValue = new Label(container, SWT.NONE);
		lblValue.setText("Value ");
		
		txtValue = new Text(container, SWT.BORDER);
		txtValue.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		if (value != null)
			txtValue.setText(value);
		
		if (condStyle.getConditionalStyle() instanceof ShapeCompartmentGradient) {
			
			ShapeCompartmentGradient shapeGradient = (ShapeCompartmentGradient) condStyle.getConditionalStyle();
			Button gradientDialog = new Button (container, SWT.PUSH);
			gradientDialog.setText ("Gradient Style");
			gradientDialog.addSelectionListener(new SelectionAdapter() {
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					ContainerDialogConditionalStyle dialog = new ContainerDialogConditionalStyle(getShell(), shapeGradient);
					if (dialog.open() == Dialog.OK) {						
						Color fColor = shapeGradient.getForeGroundColor();	
						if (fColor instanceof SiriusSystemColors)
							((SiriusSystemColors) fColor).setName(dialog.getfColor());						
						shapeGradient.setCornerHeight(dialog.getHeight());
						shapeGradient.setCornerWidth(dialog.getWidth());	
						shapeGradient.setLabelStyle(dialog.getLabelBorderedStyle());						
					}
					
					System.out.println("Button!!");
				}				
			});
			
			System.out.println("Button Para llamar al otro dialog.");
		}
			
		return container;
	}
	
	private List<String> getEAttributesString(EClass eClass) {
		
		List<String> listOfNames = new LinkedList<String>();
		Iterator<EAttribute> itEAttributes = eClass.getEAllAttributes().iterator();
		while (itEAttributes.hasNext()) {
			EAttribute eAttribute = (EAttribute) itEAttributes.next();
			listOfNames.add(eAttribute.getName());			
		}
		return listOfNames;
	}
	
	private EAttribute getEAttributeByName(String name) {
		Iterator<EAttribute> itEAllAttributes = eClass.getEAllAttributes().iterator();
		while (itEAllAttributes.hasNext()) {
			EAttribute eAttribute = (EAttribute) itEAllAttributes.next();
			if (eAttribute.getName().equals(name)) 
				return eAttribute;
		}		
		return null;
	}
	
	@Override
	protected void configureShell(Shell newShell) {
		
		super.configureShell(newShell);
	    newShell.setText("Select Conditional Style");
	}
	
	@Override
	protected void okPressed() {
		
		this.eAttribute = getEAttributeByName(cmbAttribute.getText());
		this.value = txtValue.getText();
		super.okPressed();		
	}
	
	public void seteAttribute(EAttribute eAttribute) {
		this.eAttribute = eAttribute;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public EAttribute geteAttribute() {
		return eAttribute;
	}
	
	public String getValue() {
		return value;
	}
}
