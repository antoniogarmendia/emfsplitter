package org.mondo.visualization.ui.wizard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
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

import graphic_representation.CompartmentElement;
import graphic_representation.ConditionalRepresentation;
import graphic_representation.RepresentationStyle;

public class ConditionalCompartmentDialog extends Dialog{
	
	private CompartmentElement compartmentElement;
	
	//Widgets
	private Combo cmbThenReferences;
	private Combo cmbElseReferences;
	
	public ConditionalCompartmentDialog(Shell parentShell, CompartmentElement compartmentElement) {
		super(parentShell);		
		this.compartmentElement = compartmentElement;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);	
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lbThenReference = new Label(container, SWT.NONE);
		lbThenReference.setText("Then Reference: ");
		
		cmbThenReferences = new Combo(container, SWT.NONE);
		List<String> listOfReferences = getAllReferenceList((EClass)this.compartmentElement.getAnEReference().getEContainingClass());
		cmbThenReferences.setItems(listOfReferences.toArray(new String[listOfReferences.size()]));
		
		if (getConditionalRepresentation().getThenReference() != null)
			cmbThenReferences.select(listOfReferences.indexOf(getConditionalRepresentation().getThenReference().getName()));
		
		Label lbElseReference = new Label(container, SWT.NONE);
		lbElseReference.setText("Else Reference: ");
				
		cmbElseReferences = new Combo(container, SWT.NONE);
		cmbElseReferences.setItems(listOfReferences.toArray(new String[listOfReferences.size()]));
		
		if (getConditionalRepresentation().getElseReference() != null)
			cmbElseReferences.select(listOfReferences.indexOf(getConditionalRepresentation().getElseReference().getName()));
		
		return container;
	}
	
	public List<String> getAllReferenceList(EClass anEClass) {
		
		List<String> result = new ArrayList<String>();
		Iterator<EReference> itContainment = anEClass.getEAllReferences().iterator();
		while (itContainment.hasNext()) {
			EReference eReference = (EReference) itContainment.next();
			result.add(eReference.getName());
		}		
		return result;
	}
	
	private ConditionalRepresentation getConditionalRepresentation() {
		
		RepresentationStyle style = this.compartmentElement.getRepresentationStyle();
		
		if (style instanceof ConditionalRepresentation) {
			
			return (ConditionalRepresentation) style;
		}
		
		return null;
	}
	
	@Override
	protected void okPressed() {
		
		EClass eClass = (EClass)this.compartmentElement.getAnEReference().getEContainingClass();
		getConditionalRepresentation().setThenReference(eClass.getEAllReferences().get(this.cmbThenReferences.getSelectionIndex()));
		getConditionalRepresentation().setElseReference(eClass.getEAllReferences().get(this.cmbElseReferences.getSelectionIndex()));	
		
		super.okPressed();
	}
	
}
