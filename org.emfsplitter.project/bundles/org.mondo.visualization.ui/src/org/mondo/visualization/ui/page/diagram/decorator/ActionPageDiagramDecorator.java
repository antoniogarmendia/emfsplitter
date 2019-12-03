package org.mondo.visualization.ui.page.diagram.decorator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.ConditionalEdgeStyle;
import graphic_representation.ConditionalStyle;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.LabelOCL;
import graphic_representation.LinkedListRepresentation;
import graphic_representation.Node;
import graphic_representation.RepresentationStyle;
import graphic_representation.Shape;

public class ActionPageDiagramDecorator {
	
	private TreeViewer treeViewer;	
	private MenuManager menuMgr;
		
	private ChangeActionPageDiagramDecorator changeDecorator;
	
	//Add Node Actions
	private AddNodeActionPageDiagramDecorator addNodeActions;
	

	public ActionPageDiagramDecorator(TreeViewer treeViewer,Shell shell) {
		super();
		this.treeViewer = treeViewer;
				
		this.menuMgr = new MenuManager(){
			// Do not accept items from other plug-ins.
						@Override
						public IContributionItem[] getItems() {
										
							 IContributionItem[] items = super.getItems();
							 List<IContributionItem> filteredItems = new ArrayList<IContributionItem>();
								 for (IContributionItem item : items) {
									 if( item != null
									           && item.getId() != null
									           && item.getId().startsWith( "com.wizard.visualization.decorator" ))
									         filteredItems.add( item );					 
								 }
							 
								 items = new IContributionItem[ filteredItems.size()];
								 return filteredItems.toArray( items );
						}
		};
		
		menuMgr.setRemoveAllWhenShown(true);
		changeDecorator = new ChangeActionPageDiagramDecorator(treeViewer);
		addNodeActions = new AddNodeActionPageDiagramDecorator(treeViewer,shell);
	}
	
	public void Execute()
	{
		changeDecorator.makeActions();
		addNodeActions.makeActions();
		
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				ActionPageDiagramDecorator.this.fillContextMenu(manager);
			}
		});
		
		Menu menu = menuMgr.createContextMenu(treeViewer.getControl());
		treeViewer.getControl().setMenu(menu);
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite().
		registerContextMenu(menuMgr, treeViewer);
	}
	
	protected void fillContextMenu(IMenuManager manager) {
		
		Object obj = this.GetSelectedTreeViewerObject();
		
		if (obj instanceof DiagramElement) {
			manager.add(changeDecorator.getActionCopyLayout());
		}
		if (obj instanceof Edge) {
			manager.add(addNodeActions.getActionAddConditionalEdge());
			manager.add(addNodeActions.getActionAddLabelEdgeOcl());
		}
		if (obj instanceof Node) {
			manager.add(addNodeActions.getAddConditionalStyle());	
			manager.add(addNodeActions.getActionAddLabelOcl());
		} else if(obj instanceof ConditionalStyle) {
			manager.add(addNodeActions.getActionDeleteConditionalStyle());
			manager.add(addNodeActions.getActionAddLabelOcl());
		} else if (obj instanceof CompartmentElement) {
			CompartmentElement compart = (CompartmentElement) obj;
			if (compart.getAnEReference().isContainment() == false) {
				RepresentationStyle repre = compart.getRepresentationStyle();
				if (repre instanceof LinkedListRepresentation) {
					LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;				
					if (linkedListRepre.getInit() == null)
						manager.add(addNodeActions.getActionAddInitShape());
					if (linkedListRepre.getNodeShape() == null)				
						manager.add(addNodeActions.getActionAddNodeShape());
					if (linkedListRepre.getEnd() == null)				
						manager.add(addNodeActions.getActionAddEndShape());
					if (linkedListRepre.getInitToFirst() == null)				
						manager.add(addNodeActions.getActionAddInitToFirst());
					if (linkedListRepre.getNodeToNode() == null)					
						manager.add(addNodeActions.getActionAddNodeToNode());
					if (linkedListRepre.getNodeToEnd() == null)	
						manager.add(addNodeActions.getActionAddNodeToEnd());	
				}
			}
		} else if (obj instanceof Shape) {
			manager.add(addNodeActions.getActionDeleteShape());
			manager.add(addNodeActions.getActionAddLabelOcl());
		} else if (obj instanceof CompartmentEdge) {
			manager.add(addNodeActions.getActionDeleteCompartmentEdge());
		} else if (obj instanceof LabelOCL) {
			manager.add(addNodeActions.getActionDeleteLabelOcl());
		} else if (obj instanceof ConditionalEdgeStyle)
			manager.add(addNodeActions.getActionAddLabelOclConditionalEdge());
	}

	private Object GetSelectedTreeViewerObject() {
		
		ISelection selection = treeViewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}
	

}
