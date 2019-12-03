package org.mondo.visualization.ui.wizard;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class LabelOCLDialog extends Dialog {

	private String oclExpression;
	
	public LabelOCLDialog(Shell parentShell, String currentExpression) {
		super(parentShell);
		this.oclExpression = currentExpression;		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Label lblFontFormat = new Label(container, SWT.NONE);
		lblFontFormat.setText("OCL Expression ");
		
		StyledText txtOcl = new StyledText(container, SWT.MULTI | SWT.BORDER);
		
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
				oclExpression = txtOcl.getText();			
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				// Do nothing				
			}
		});
		
		if (this.oclExpression !=null)
			txtOcl.setText(this.oclExpression);
		
		return container;
	}
	
	public String getOclExpression() {
		return oclExpression;
	}

}
