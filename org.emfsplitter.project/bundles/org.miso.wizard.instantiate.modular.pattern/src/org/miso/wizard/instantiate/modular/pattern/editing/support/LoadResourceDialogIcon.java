package org.miso.wizard.instantiate.modular.pattern.editing.support;

import java.io.File;
import java.net.URI;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.mondo.visualization.ui.wizard.WorkspaceAndPluginsResourceDialog;

public class LoadResourceDialogIcon extends ResourceDialog{

	private String fileURI;
	private Text txURI;
	
	public LoadResourceDialogIcon(Shell parent, String title, int style) {
		super(parent, title, style);		
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new GridLayout());
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		Composite containerGroupImage = new Composite(container, SWT.NONE);
		
		GridLayout layout = new GridLayout();			
		layout.numColumns = 2;
		containerGroupImage.setLayout(layout);
		containerGroupImage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
					
		Label lb_name = new Label(containerGroupImage, SWT.NONE);
		lb_name.setText("Image URI:");			
		
		Button btn_selectWorkspace = new Button(containerGroupImage, SWT.PUSH);
		btn_selectWorkspace.setText("Browse Workspace...");
		prepareBrowseWorkspaceButton(btn_selectWorkspace);
		
		Composite containerGroupText = new Composite(container, SWT.NONE);
		GridLayout layoutText = new GridLayout();
		layoutText.numColumns = 1;	
		containerGroupText.setLayout(layoutText);
		containerGroupText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		txURI = new Text(containerGroupText, SWT.BORDER | SWT.SINGLE );			
		txURI.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		txURI.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				
				fileURI = txURI.getText();
			}
		});
								
		return container;
		
	}
	
	public void setFileURI(String fileURI) {
		this.fileURI = fileURI;
	}
	
	public String getFileURI() {
		return fileURI;
	}
	
	@Override
	protected void prepareBrowseWorkspaceButton(Button browseWorkspaceButton) {
		
		browseWorkspaceButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {				
				
				String imagePath = WorkspaceAndPluginsResourceDialog.openDialogForImages(getShell());
				if (imagePath != null)
					txURI.setText(imagePath);
			}				
		});	
	}
}
