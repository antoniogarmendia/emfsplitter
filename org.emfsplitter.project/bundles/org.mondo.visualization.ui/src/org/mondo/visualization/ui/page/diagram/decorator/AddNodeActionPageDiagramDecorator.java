package org.mondo.visualization.ui.page.diagram.decorator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Shell;
import org.mondo.visualization.ui.wizard.ConditionalStyleDialog;

import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.ConditionalEdgeStyle;
import graphic_representation.ConditionalStyle;
import graphic_representation.Edge;
import graphic_representation.Edge_Style;
import graphic_representation.GeneralLabel;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.LabelOCL;
import graphic_representation.LinkedListRepresentation;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.RepresentationStyle;
import graphic_representation.Shape;
import graphic_representation.impl.Graphic_representationFactoryImpl;

public class AddNodeActionPageDiagramDecorator {
	
	private TreeViewer treeViewer;	
	private Shell shell;
	
	private Action actionAddConditionalStyle;
	private Action actionAddConditionalEdge;
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
	//Addition/Remove of an OCL Label
	private Action actionAddLabelOcl;
	private Action actionDeleteLabelOcl;
	private Action actionAddLabelEdgeOcl;	
	private Action actionAddLabelOclConditionalEdge;
	
	public AddNodeActionPageDiagramDecorator(TreeViewer treeViewer, Shell shell) {
		this.treeViewer = treeViewer;
		this.shell = shell;
	}
	
	public void makeActions() {
		makeActionAddConditionalStyle();
		makeActionAddConditionalEdge();
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
		//Label
		makeActionAddLabelOcl();
		makeActionRemoveLabelOcl();
		makeActionAddLabelEdgeOcl();
		makeActionAddLabelOclConditionalEdge();
	}
	
	private void makeActionAddLabelOclConditionalEdge() {
		
		this.actionAddLabelOclConditionalEdge = new Action() {
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof ConditionalEdgeStyle) {
					ConditionalEdgeStyle condEdge = (ConditionalEdgeStyle)obj;
					if (condEdge.getGeneralLabel() == null) {
						LabelOCL labelOCL = Graphic_representationFactoryImpl.eINSTANCE.createLabelOCL();
						condEdge.setGeneralLabel(labelOCL);
						treeViewer.refresh(obj);
					} else {
						MessageDialog.openInformation(shell, "Information", "Cannot add the OCL Label");
						return;
					}
				}				
			}
		};
		
		this.actionAddLabelOclConditionalEdge.setId("com.wizard.visualization.decorator.AddLabelConditionalEdgeOCL");
		this.actionAddLabelOclConditionalEdge.setText("Add Label Conditional Edge OCL");
		this.actionAddLabelOclConditionalEdge.setToolTipText("Label Conditional Edge OCL");
	}
	
	private void makeActionAddLabelEdgeOcl() {
		
		this.actionAddLabelEdgeOcl = new Action() {
			
			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Edge) {
					Edge edge = (Edge)obj;
					if (edge.getEdgeLabel() == null) {
						LabelOCL labelOCL = Graphic_representationFactoryImpl.eINSTANCE.createLabelOCL();
						edge.setEdgeLabel(labelOCL);
						treeViewer.refresh(obj);
					} else {
						MessageDialog.openInformation(shell, "Information", "Cannot add the OCL Label");
						return;
					}					
				}				
			}
		};		
		
		actionAddLabelEdgeOcl.setId("com.wizard.visualization.decorator.AddLabelEdgeOCL");
		actionAddLabelEdgeOcl.setText("Add Label Edge OCL");
		actionAddLabelEdgeOcl.setToolTipText("Label Edge OCL");
	}

	private void makeActionAddConditionalEdge() {
		
		this.actionAddConditionalEdge = new Action() {
			
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Edge) {
					Edge edge = (Edge)obj;
					ConditionalEdgeStyle condEdgeStyle = Graphic_representationFactoryImpl.eINSTANCE.createConditionalEdgeStyle();
					condEdgeStyle.setDecoratorSource(Graphic_representationFactoryImpl.eINSTANCE.createEdgeDecorator());
					condEdgeStyle.setDecoratorTarget(Graphic_representationFactoryImpl.eINSTANCE.createEdgeDecorator());
					Edge_Style edgeStyle = Graphic_representationFactoryImpl.eINSTANCE.createEdge_Style();
					edgeStyle.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
					condEdgeStyle.setConditionalEdge(edgeStyle);
					edge.getConditionalEdgeStyle().add(condEdgeStyle);	
					treeViewer.refresh(obj);
				}
			}			
		};
		
		actionAddConditionalEdge.setId("com.wizard.visualization.decorator.AddEdgeConditionalStyle");
		actionAddConditionalEdge.setText("Add Edge Conditional Style");
		actionAddConditionalEdge.setToolTipText("Edge Conditional Style");	
	}
	
	private void makeActionRemoveLabelOcl() {
		this.actionDeleteLabelOcl = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof LabelOCL) {
					LabelOCL currentLabel = (LabelOCL) obj;					
					EObject parentEObject = currentLabel.eContainer();							
					EcoreUtil.remove(currentLabel);
					treeViewer.remove(obj);
				}
			}
		};		
		actionDeleteLabelOcl.setId("com.wizard.visualization.decorator.DeleteLabelOcl");
		actionDeleteLabelOcl.setText("Delete Label OCL");
		actionDeleteLabelOcl.setToolTipText("Delete Label OCL");		
	}
	
	private void makeActionAddLabelOcl() {
		this.actionAddLabelOcl = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Node) {
					Node currentNode = (Node) obj;
					if (canAddLabelOcl(currentNode)) {
						//Add
						LabelOCL newLabel = Graphic_representationFactory.eINSTANCE.createLabelOCL();
						newLabel.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						currentNode.getNode_shape().setLabelanEAttribute(newLabel);						
						treeViewer.refresh(obj);
					} else {
						MessageDialog.openInformation(shell, "Information", "Cannot add the OCL Label");
					}
				}	
				else if (obj instanceof ConditionalStyle) {
					ConditionalStyle currentCond = (ConditionalStyle) obj;
					if (currentCond.getLabelOcl() == null) {
						LabelOCL newLabelCond = Graphic_representationFactory.eINSTANCE.createLabelOCL();
						newLabelCond.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						currentCond.setLabelOcl(newLabelCond);						
						treeViewer.refresh(obj);
					}
					else
						MessageDialog.openInformation(shell, "Information", "Cannot add the OCL Label");
				} else if (obj instanceof Shape) {
					Shape sh = (Shape) obj;					
					GeneralLabel label = sh.getLabelanEAttribute();
					if (label == null) {
						LabelOCL newLabelCond = Graphic_representationFactory.eINSTANCE.createLabelOCL();
						newLabelCond.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						sh.setLabelanEAttribute(newLabelCond);
						treeViewer.refresh(obj);
					} else
						MessageDialog.openInformation(shell, "Information", "Cannot add the OCL Label");					
					System.out.println("Shape");
				}
				System.out.println("Create Label OCL");
			}
		};
		actionAddLabelOcl.setId("com.wizard.visualization.decorator.AddLabelOcl");
		actionAddLabelOcl.setText("Add Label OCL");
		actionAddLabelOcl.setToolTipText("Add Label OCL");
	}
	
	public void makeActionAddInitShape() {
		actionAddInitShape = new Action() {
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof CompartmentElement) {
					CompartmentElement compart = (CompartmentElement) obj;
					RepresentationStyle repre = compart.getRepresentationStyle();
					if (repre instanceof LinkedListRepresentation) {
						LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;
						linkedListRepre.setInit(Graphic_representationFactory.eINSTANCE.createEllipse());
						treeViewer.refresh(obj);
					}
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
					RepresentationStyle repre = compart.getRepresentationStyle();
					if (repre instanceof LinkedListRepresentation) {
						LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;
						linkedListRepre.setNodeToEnd(Graphic_representationFactory.eINSTANCE.createCompartmentEdge());
						treeViewer.refresh(obj);
					}
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
					RepresentationStyle repre = compart.getRepresentationStyle();
					if (repre instanceof LinkedListRepresentation) {
						LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;
						linkedListRepre.setNodeToNode(Graphic_representationFactory.eINSTANCE.createCompartmentEdge());
						treeViewer.refresh(obj);
					}
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
					RepresentationStyle repre = compart.getRepresentationStyle();
					if (repre instanceof LinkedListRepresentation) {
						LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;
						linkedListRepre.setInitToFirst(Graphic_representationFactory.eINSTANCE.createCompartmentEdge());
						treeViewer.refresh(obj);
					}
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
					RepresentationStyle repre = compart.getRepresentationStyle();
					if (repre instanceof LinkedListRepresentation) {
						LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;
						linkedListRepre.setEnd(Graphic_representationFactory.eINSTANCE.createEllipse());
						treeViewer.refresh(obj);
					}
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
					RepresentationStyle repre = compart.getRepresentationStyle();
					if (repre instanceof LinkedListRepresentation) {
						LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;
						linkedListRepre.setNodeShape(Graphic_representationFactory.eINSTANCE.createEllipse());
						treeViewer.refresh(obj);
					}
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
					//Create Conditional Style and get values from the dialog
					ConditionalStyle style = Graphic_representationFactory.eINSTANCE.createConditionalStyle();					
					style.setConditionalStyle(EcoreUtil.copy(node.getNode_shape()));
					ConditionalStyleDialog dialog = new ConditionalStyleDialog(shell, node.getAnEClass(),style);
					if (dialog.open() == Dialog.OK) {
						style.setEAttribute(dialog.geteAttribute());
						style.setValue(dialog.getValue());
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
	
	public Action getActionAddLabelOcl() {
		return actionAddLabelOcl;
	}
	
	public Action getActionDeleteLabelOcl() {
		return actionDeleteLabelOcl;
	}
	
	public Action getActionAddConditionalEdge() {
		return actionAddConditionalEdge;
	}
	
	public Action getActionAddLabelEdgeOcl() {
		return actionAddLabelEdgeOcl;
	}
	
	public Action getActionAddLabelOclConditionalEdge() {
		return actionAddLabelOclConditionalEdge;
	}
	
	public Object GetSelectedTreeViewerObject(){
		
		ISelection selection = treeViewer.getSelection();
		
		if(((IStructuredSelection)selection).size() == 1)
			return ((IStructuredSelection)selection).getFirstElement();
		else
			return selection;
	}
	
	public boolean canAddLabelOcl(Node node) {
		
		GeneralLabel label = node.getNode_shape().getLabelanEAttribute();
		
		if (label == null)		
			return true;
		else
			return false;
	}
	
}
