package org.mondo.visualization.ui.page.diagram.decorator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Shell;
import org.mondo.visualization.ui.wizard.ConditionalStyleDialog;

import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.ConditionalStyle;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.Node;
import graphic_representation.Shape;

public class AddNodeActionPageDiagramDecorator {
	
	private TreeViewer treeViewer;	
	private Shell shell;
	
	private Action actionAddConditionalStyle;
	//CompartmentElement..reference is non containment
	private Action actionAddInitShape;
	private Action actionAddNodeShape;
	private Action actionAddEndShape;
	private Action actionAddInitToFirst;
	private Action actionAddNodeToNode;
	private Action actionAddNodeToEnd;
	//End CompartmentElement
	private Action actionDeleteConditionalStyle;
	//CompartmentElement..reference is non containment Delete
	private Action actionDeleteCompartmentEdge;
	private Action actionDeleteShape;	 
	//End
	
	public AddNodeActionPageDiagramDecorator(TreeViewer treeViewer, Shell shell) {
		this.treeViewer = treeViewer;
		this.shell = shell;
	}
	
	public void makeActions() {
		makeActionAddConditionalStyle();
		makeActionDeleteConditionalStyle();
		makeActionAddInitShape();
		makeActionAddNodeShape();
		makeActionAddEndShape();
		makeActionAddInitToFirst();
		makeActionAddNodeToNode();
		makeActionAddNodeToEnd();
		//Delete 
		makeActionDeleteInitShape();
		makeActionDeleteNodeShape();
	}
	
	public void makeActionAddInitShape() {
		actionAddInitShape = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentElement) {
					CompartmentElement compart = (CompartmentElement) obj;
					compart.setInit(Graphic_representationFactory.eINSTANCE.createEllipse());
					treeViewer.refresh(obj);
				}
			}			
		};	
		actionAddInitShape.setId("com.wizard.visualization.decorator.AddInitShape");
		actionAddInitShape.setText("Add Init Shape");
		actionAddInitShape.setToolTipText("Add Init Shape");		
	}	
	
	public void makeActionAddNodeToEnd() {
		actionAddNodeToEnd = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentElement) {
					CompartmentElement compart = (CompartmentElement) obj;
					compart.setNodeToEnd(Graphic_representationFactory.eINSTANCE.createCompartmentEdge());
					treeViewer.refresh(obj);
				}
			}			
		};	
		actionAddNodeToEnd.setId("com.wizard.visualization.decorator.AddEndNode");
		actionAddNodeToEnd.setText("Add Edge from last to the End Node");
		actionAddNodeToEnd.setToolTipText("Add End Node");		
	}

	public void makeActionAddNodeToNode() {
		actionAddNodeToNode = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentElement) {
					CompartmentElement compart = (CompartmentElement) obj;
					compart.setNodeToNode(Graphic_representationFactory.eINSTANCE.createCompartmentEdge());
					treeViewer.refresh(obj);
				}
			}			
		};	
		actionAddNodeToNode.setId("com.wizard.visualization.decorator.AddNodeToNode");
		actionAddNodeToNode.setText("Add Edge Node to Node");
		actionAddNodeToNode.setToolTipText("Add Edge Node to Node");		
	}

	public void makeActionAddInitToFirst() {
		actionAddInitToFirst = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentElement) {
					CompartmentElement compart = (CompartmentElement) obj;
					compart.setInitToFirst(Graphic_representationFactory.eINSTANCE.createCompartmentEdge());
					treeViewer.refresh(obj);
				}
			}			
		};	
		actionAddInitToFirst.setId("com.wizard.visualization.decorator.AddInitToFirst");
		actionAddInitToFirst.setText("Add Edge Init Node to First");
		actionAddInitToFirst.setToolTipText("Add Edge Init Node to First");		
	}

	public void makeActionAddEndShape() {
		actionAddEndShape = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentElement) {
					CompartmentElement compart = (CompartmentElement) obj;	
					compart.setEnd(Graphic_representationFactory.eINSTANCE.createEllipse());
					treeViewer.refresh(obj);
				}
			}			
		};	
		actionAddEndShape.setId("com.wizard.visualization.decorator.AddEndShape");
		actionAddEndShape.setText("Add End Shape");
		actionAddEndShape.setToolTipText("Add End Shape");		
	}

	public void makeActionAddNodeShape() {
		actionAddNodeShape = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentElement) {
					CompartmentElement compart = (CompartmentElement) obj;
					compart.setNodeShape(Graphic_representationFactory.eINSTANCE.createEllipse());
					treeViewer.refresh(obj);
				}
			}			
		};	
		actionAddNodeShape.setId("com.wizard.visualization.decorator.AddNodeShape");
		actionAddNodeShape.setText("Add Node Shape");
		actionAddNodeShape.setToolTipText("Add Node Shape");		
	}	

	public void makeActionDeleteConditionalStyle() {
		
		actionDeleteConditionalStyle = new Action() {
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof ConditionalStyle) {
					EObject parentEObject = ((ConditionalStyle) obj).eContainer();
					EcoreUtil.remove((EObject) obj);
					treeViewer.refresh(parentEObject);
				}
			}
			
		};
		
		actionDeleteConditionalStyle.setId("com.wizard.visualization.decorator.AddNodeConditionalStyle");
		actionDeleteConditionalStyle.setText("Delete Conditional Style");
		actionDeleteConditionalStyle.setToolTipText("Delete Conditional Style");
	}

	private void makeActionAddConditionalStyle() {
		
		actionAddConditionalStyle = new Action() {
			
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Node) {
					Node node = (Node) obj;
					ConditionalStyleDialog dialog = new ConditionalStyleDialog(shell, node.getAnEClass());
					if (dialog.open() == Dialog.OK) {
						//Create Conditional Style and get values from the dialog
						ConditionalStyle style = Graphic_representationFactory.eINSTANCE.createConditionalStyle();
						style.setEAttribute(dialog.geteAttribute());
						style.setValue(dialog.getValue());
						style.setConditionalStyle(EcoreUtil.copy(node.getNode_shape()));
						node.getConditionalStyle().add(style);
						treeViewer.refresh(obj);
					}
				}
			}			
		};
		
		actionAddConditionalStyle.setId("com.wizard.visualization.decorator.AddNodeConditionalStyle");
		actionAddConditionalStyle.setText("Add Conditional Style");
		actionAddConditionalStyle.setToolTipText("Conditional Style");		
	}
	
	public void makeActionDeleteInitShape() {
		
		actionDeleteShape = new Action() {
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Shape) {
					EcoreUtil.remove((EObject) obj);					
					treeViewer.refresh(((EObject) obj).eContainer());
				}				
			}
		};
		actionDeleteShape.setId("com.wizard.visualization.decorator.DeleteCompartmentNode");
		actionDeleteShape.setText("Delete Node");
		actionDeleteShape.setToolTipText("Delete Node");	
	}	
	
	public void makeActionDeleteNodeShape() {
		
		actionDeleteCompartmentEdge = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentEdge) {
					EcoreUtil.remove((EObject) obj);					
					treeViewer.refresh(((EObject) obj).eContainer());
				}
			}
		};
		actionDeleteCompartmentEdge.setId("com.wizard.visualization.decorator.DeleteCompartmentEdge");
		actionDeleteCompartmentEdge.setText("Delete Edge");
		actionDeleteCompartmentEdge.setToolTipText("Delete Edge");	
	}
	
	public Action getAddConditionalStyle() {
		return actionAddConditionalStyle;
	}
	
	public Action getActionAddInitShape() {
		return actionAddInitShape;
	}
	
	 public Action getActionAddNodeShape() {
		return actionAddNodeShape;
	}
	
	public Action getActionAddEndShape() {
		return actionAddEndShape;
	}
	
	public Action getActionAddInitToFirst() {
		return actionAddInitToFirst;
	}
	
	public Action getActionAddNodeToNode() {
		return actionAddNodeToNode;
	}
	
	public Action getActionAddNodeToEnd() {
		return actionAddNodeToEnd;
	}
	
	public Action getActionDeleteConditionalStyle() {
		return actionDeleteConditionalStyle;
	}
	
	public Action getActionDeleteCompartmentEdge() {
		return actionDeleteCompartmentEdge;
	}

	public Action getActionDeleteShape() {
		return actionDeleteShape;
	}
	
	public Object GetSelectedTreeViewerObject(){
		
		ISelection selection = treeViewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}

}
