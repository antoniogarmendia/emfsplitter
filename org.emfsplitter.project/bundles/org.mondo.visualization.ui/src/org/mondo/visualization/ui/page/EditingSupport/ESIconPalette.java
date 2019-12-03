package org.mondo.visualization.ui.page.EditingSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.ui.dialogs.ResourceDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TouchEvent;
import org.eclipse.swt.events.TouchListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.ide.dialogs.IDEResourceInfoUtils;
import org.eclipse.ui.internal.ide.dialogs.IFileStoreFilter;
import org.mondo.visualization.ui.wizard.WorkspaceAndPluginsResourceDialog;

import dslHeuristicVisualization.extension.icon.EvaluateContributionCustomiseIcon;
import dslHeuristicVisualization.extension.icon.ICustomiseIcon;
import dslHeuristicVisualization.extension.shape.EvaluateContributionsCustomiseShape;
import dslHeuristicVisualization.extension.shape.ICustomiseShape;
import graphic_representation.DiagramElement;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.IconElement;
import graphic_representation.Node;
import graphic_representation.PaletteDescription;
import graphic_representation.rest.Parameter;

public class ESIconPalette extends EditingSupport{

	public ESIconPalette(ColumnViewer viewer) {
		
		super(viewer);		
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
						
		DialogCellEditor dialogEditor =  new DialogCellEditor() {
			
			private Label labelPath;
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				
				IconElement iconElement = null;
				if (element instanceof DiagramElement) {
					PaletteDescription paletteDescription = ((DiagramElement) element).getDiag_palette();
					iconElement = Graphic_representationFactory.eINSTANCE.createIconElement();
					iconElement.setFilepath(paletteDescription.getIcon_filepath());
				}			
				
				LoadResourceDialog dialog = new LoadResourceDialog(cellEditorWindow.getShell(),"Select Image", SWT.NONE, 
						iconElement);
				if(dialog.open() == Window.OK)
				{
					
					return dialog.fileURI;
				}				
				return "";
			}

			@Override
			protected Button createButton(Composite parent) {
			
				Button btn = new Button(parent, SWT.NONE);
				btn.setText("...");
				return btn;
			}

			@Override
			protected Control createContents(Composite cell) {
				
				labelPath = new Label(cell, SWT.LEFT);
				labelPath.setFont(cell.getFont());
				labelPath.setBackground(cell.getBackground());
				String filepath = "";
				if(element instanceof DiagramElement)
					filepath =  ((DiagramElement) element).getDiag_palette().getIcon_filepath();
				labelPath.setText((filepath==null)?"":filepath);
				return labelPath;				
			}

			@Override
			protected void updateContents(Object value) {
				
				if(value==null)
					value = "";
				
					
				super.updateContents(value);
			}				
		};
		
		dialogEditor.create((Composite) getViewer().getControl());
		return dialogEditor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof DiagramElement)
		{
			String filePath =  ((DiagramElement) element).getDiag_palette().getIcon_filepath();
			if(filePath==null)
				return "";
			else
				return filePath;
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(element instanceof DiagramElement)
		{
			DiagramElement diagElement = (DiagramElement)element;
			diagElement.getDiag_palette().setIcon_filepath((String) value);
		}
		getViewer().update(element, null);
	}
	
	public static class LoadResourceDialog extends ResourceDialog
	{

		public Text txURI;
		public String fileURI;
		public IconElement iconElement; 
		public Label labelSelectedImage;
		public Composite compImagePreview;
		public Map<Label, String> imageToPath;
						
		public LoadResourceDialog(Shell parent, String title, int style, IconElement iconElement) {
			
			super(parent, title, style);
			this.fileURI = iconElement.getFilepath();
			this.iconElement = iconElement;
			this.labelSelectedImage = null;		
			this.imageToPath = new LinkedHashMap<Label, String>();
			this.compImagePreview = null;
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
			
			if (fileURI != null)
				txURI.setText(this.fileURI);
			
			txURI.addModifyListener(new ModifyListener() {
				
				@Override
				public void modifyText(ModifyEvent e) {
					
					fileURI = txURI.getText();
				}
			});		
			
			// show the current image
			String absolutePath = "";
			if (iconElement.getFilepath() != null)		
				absolutePath =	ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + iconElement.getFilepath().replaceAll("/", "\\\\");
			
			Composite compositePreviewImage = new Composite(container, SWT.NONE);
			compositePreviewImage.setLayoutData(new GridData(100,100));
			FillLayout compositePreviewImageLayout = new FillLayout();
			compositePreviewImageLayout.marginHeight = compositePreviewImageLayout.marginWidth = 1;
			compositePreviewImage.setLayout(compositePreviewImageLayout);	
			
			this.labelSelectedImage = new Label(compositePreviewImage, SWT.BORDER);
			
			if (iconElement.getFilepath() != null && !iconElement.getFilepath().isEmpty()) {
				Image img = new Image(getShell().getDisplay(), absolutePath);
				Image scaled = resize(img, 100, 100);								
				this.labelSelectedImage.setImage(scaled);
			}
						
			if (iconElement != null) {
				if (iconElement.getFigureSearch() != null) {
					
					// Search Configuration
					Composite containerGroupSearch = new Composite(container, SWT.NONE);
					GridLayout layoutSearch = new GridLayout();
					layoutSearch.numColumns = 1;
					
					containerGroupSearch.setLayout(layoutSearch);
					containerGroupSearch.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));					
					
					Label lb_SearchName = new Label(containerGroupSearch, SWT.NONE);
					lb_SearchName.setText("Figure Search: " + iconElement.getFigureSearch().getExtensionName());
					
					// Show the parameters
					Composite containerParameters = new Composite(container, SWT.NONE);
					GridLayout layoutParameter = new GridLayout();
					layoutParameter.numColumns = 2;					
					
					containerParameters.setLayout(layoutParameter);
					containerParameters.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
					
					Iterator<Parameter> itParameters = iconElement.getFigureSearch().getParameters().iterator();	
					while (itParameters.hasNext()) {
						Parameter parameter = (Parameter) itParameters.next();
						Label parameterName = new Label(containerParameters, SWT.NONE);
						parameterName.setText(parameter.getName());
						
						if (parameter.getAcceptedValues().size() == 0) {
							Text parameterValue = new Text(containerParameters, SWT.BORDER | SWT.SINGLE);
							parameterValue.setText(parameter.getParameterValue());		
							parameterValue.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
							
							parameterValue.addFocusListener(new FocusListener() {
								
								@Override
								public void focusLost(FocusEvent arg0) {
									parameter.setParameterValue(parameterValue.getText());										
								}
								
								@Override
								public void focusGained(FocusEvent arg0) {
									// Do nothing									
								}
							});		
							
						} else {
							Combo combo = new Combo (containerParameters, SWT.READ_ONLY);
							combo.setItems(parameter.getAcceptedValues().toArray(new String[parameter.getAcceptedValues().size()]));
							combo.select(parameter.getAcceptedValues().indexOf(parameter.getParameterValue()));
							
							combo.addFocusListener(new FocusListener() {
								
								@Override
								public void focusLost(FocusEvent arg0) {
									parameter.setParameterValue(combo.getText());																	
								}
								
								@Override
								public void focusGained(FocusEvent arg0) {
									// Do nothing									
								}
							});							
						}
					}		
				    			    
				    // Candidate Images
					this.compImagePreview = new Composite(container, SWT.NONE);
					GridLayout layoutImages = new GridLayout();
					layoutImages.numColumns = 5;					
					
					this.compImagePreview.setLayout(layoutImages);
					this.compImagePreview.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
										
					addPreviewImages();
					Composite compositeNewSearch = new Composite(container, SWT.NONE);
					GridLayout layoutNewSearch = new GridLayout();
					layoutNewSearch.numColumns = 1;					
					compositeNewSearch.setLayout(layoutNewSearch);
					compositeNewSearch.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
					
					
					Button btn_evaluate = new Button(compositeNewSearch, SWT.PUSH);
					btn_evaluate.setText("Search New Images");
					
					btn_evaluate.addSelectionListener(new SelectionAdapter() {
						
						@Override
						public void widgetSelected(SelectionEvent e) {
							
							EvaluateContributionCustomiseIcon evaluate = new EvaluateContributionCustomiseIcon();
							ICustomiseIcon customiseIcon = evaluate.execute(Platform.getExtensionRegistry(), iconElement.getFigureSearch().getExtensionName());
							String iconElementPath = iconElement.getFilepath();
							iconElement.setFilepath(fileURI);
							customiseIcon.newSearchIcons(iconElement);
							iconElement.setFilepath(iconElementPath);							
							// dispose old images
							Control[] allLabelImages = compImagePreview.getChildren();
							for (int i = 0; i < allLabelImages.length; i++) {								
								allLabelImages[i].dispose();
							}
							imageToPath.clear();
							// Reload Images
							addPreviewImages();	
							compImagePreview.requestLayout();
							// message
							MessageBox messageBox = new MessageBox(getShell(), SWT.ICON_INFORMATION);
							messageBox.setMessage("Search completed");
							messageBox.open();
						}
					});				
				}
			}						
			return container;
		}
		
		public void addPreviewImages() {
			
			Iterator<String> itCandidateImages = iconElement.getFigureSearch().getCandidateImages().iterator();
			
			while (itCandidateImages.hasNext()) {
				String imagePath = (String) itCandidateImages.next();
				addImageToContainer(imagePath, this.compImagePreview);										
			}			
			
			if (iconElement.getFigureSearch().getCandidateImages().size() == 0) {
				
				for (int i = 0; i < 20; i++) {
					Composite composite = new Composite(this.compImagePreview, SWT.NONE);
					
					composite.setLayoutData(new GridData(100,100));
					FillLayout layout = new FillLayout();
					layout.marginHeight = layout.marginWidth = 1;
					composite.setLayout(layout);				
					Label label = new Label(composite, SWT.BORDER);
					label.setVisible(false);
				}				
			}				
		}
		
		public void addImageToContainer(String imagePath, Composite parent) {
			
				String absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + imagePath.replaceAll("/", "\\\\");
				
				//Parent Composite
				Composite composite = new Composite(parent, SWT.NONE);
				
				composite.setLayoutData(new GridData(100,100));
				FillLayout layout = new FillLayout();
				layout.marginHeight = layout.marginWidth = 1;
				composite.setLayout(layout);				
				
				
				Image img = new Image(getShell().getDisplay(), absolutePath);
				Label imageLabel = new Label(composite, SWT.BORDER);
				Image scaled = resize(img, 100, 100);								
				imageLabel.setImage(scaled);
				this.imageToPath.put(imageLabel, imagePath);				
				
				imageLabel.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseUp(MouseEvent arg0) {
						// Do nothing
						
					}
					
					@Override
					public void mouseDown(MouseEvent arg0) {
						
						Object labelObject = arg0.getSource();
						if (labelObject instanceof Label) {
							
							Label currentLabel = (Label) labelObject;
							String getPath = imageToPath.get(currentLabel);
							Image currentImage = labelSelectedImage.getImage();
							labelSelectedImage.setImage(currentLabel.getImage());
							if (currentImage == null) {
								imageToPath.remove(currentLabel);
								iconElement.getFigureSearch().getCandidateImages().remove(getPath);
								List<Entry<Label,String>> entryList =
									    new ArrayList<Map.Entry<Label, String>>(imageToPath.entrySet());
								Entry<Label, String> lastEntry =
									    entryList.get(entryList.size()-1);
															
								currentLabel.setImage(lastEntry.getKey().getImage());
								imageToPath.replace(currentLabel,lastEntry.getValue());
								imageToPath.remove(lastEntry.getKey());
								
								lastEntry.getKey().dispose();
								compImagePreview.requestLayout();								
							}
							else {	
								currentLabel.setImage(currentImage);
								imageToPath.replace(currentLabel,fileURI);
							}
								
							txURI.setText(getPath);							
						}					
					}
					
					@Override
					public void mouseDoubleClick(MouseEvent arg0) {
						// Do nothing
						
					}
				});
				
		}
		
		public Image resize(Image image, int width, int height) {
			Image scaled = new Image(Display.getDefault(), width, height);
			GC gc = new GC(scaled);
			gc.setAntialias(SWT.ON);
			gc.setInterpolation(SWT.HIGH);
			gc.drawImage(image, 0, 0, 
			image.getBounds().width, image.getBounds().height, 
			0, 0, width, height);
			gc.dispose();
			image.dispose(); // don't forget about me!
			return scaled;
		}
		
		public void prepareBrowseWorkspaceButton(Button btn_selectWorkspace) {
			
			btn_selectWorkspace.addSelectionListener(new SelectionAdapter() {				
				@Override
				public void widgetSelected(SelectionEvent e) {
					String imagePath = WorkspaceAndPluginsResourceDialog.openDialogForImages(getShell());
					if (imagePath != null)
						txURI.setText(imagePath);
				}				
			});			
		}
		
		public static class FileProvider extends LabelProvider{
			
			private static final Image IMG_FILE = PlatformUI.getWorkbench()
					.getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
			
			private static final Image IMG_FOLDER = PlatformUI.getWorkbench()
					.getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);

			@Override
			public Image getImage(Object element) {
				
				if (element instanceof IFileStore) {
					IFileStore curr_fs = (IFileStore) element;
									
					if (curr_fs.fetchInfo().isDirectory())
						return IMG_FOLDER;
					else
						return IMG_FILE;
				}
				return null;
			}	
			
			
			@Override
			public String getText(Object element) {
				if (element instanceof IFileStore) {
					return ((IFileStore) element).getName();
				}
				return super.getText(element);
			}
			
		}
		
		private static class FileContentProvider implements ITreeContentProvider {

			private static final Object[] EMPTY = new Object[0];

			@SuppressWarnings("restriction")
			private IFileStoreFilter fileFilter;
			
			
			@SuppressWarnings("restriction")
			public FileContentProvider(final boolean showFiles) {
				fileFilter = new IFileStoreFilter() {
					/*
					 * (non-Javadoc)
					 * 
					 * @see org.eclipse.ui.internal.ide.dialogs.IFileStoreFilter#accept(org.eclipse.core.filesystem.IFileStore)
					 */
					@Override
					public boolean accept(IFileStore file) {
						if (!file.fetchInfo().isDirectory() && showFiles == false) {
							return false;
						}
						return true;
					}
				};
			}			
			
			@Override
			public void dispose() {
								
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
								
			}

			@Override
			public Object[] getElements(Object inputElement) {
				
				return getChildren(inputElement);
			}

			@SuppressWarnings("restriction")
			@Override
			public Object[] getChildren(Object parentElement) {
				
				if (parentElement instanceof IFileStore) {
					IFileStore[] children = IDEResourceInfoUtils.listFileStores(
							(IFileStore) parentElement, fileFilter,
							new NullProgressMonitor());
					if (children != null) {
						return children;
					}
				}
				return EMPTY;	
			}

			@Override
			public Object getParent(Object element) {
				
				if (element instanceof IFileStore) {
					return ((IFileStore) element).getParent();
				}
				return null;
			}

			@Override
			public boolean hasChildren(Object element) {
				
				return getChildren(element).length > 0;
			}			
		}		
	}

}
