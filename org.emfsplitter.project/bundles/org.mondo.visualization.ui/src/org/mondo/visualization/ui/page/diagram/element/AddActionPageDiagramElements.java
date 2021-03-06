package org.mondo.visualization.ui.page.diagram.element;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import dslHeuristicVisualization.HeuristicStrategy;
import dslHeuristicVisualization.HeuristicStrategySettings;
import dslHeuristicVisualization.StrategyLabel;
import dslHeuristicVisualization.StrategyLinkCompartment;
import dslHeuristicVisualization.StrategyPossibleElements;
import graphic_representation.AffixedCompartmentElement;
import graphic_representation.AffixedElement;
import graphic_representation.CompartmentElement;
import graphic_representation.Edge;
import graphic_representation.EdgeLabelEAttribute;
import graphic_representation.Edge_Direction;
import graphic_representation.GeneralLabel;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.IconElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.LabelOCL;
import graphic_representation.Layer;
import graphic_representation.Link;
import graphic_representation.Node;
import graphic_representation.Node_Element;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Rectangle;
import graphic_representation.RepresentationDD;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;
import graphic_representation.VirtualCompartment;
import graphic_representation.VirtualCompartmentOCL;
import graphic_representation.VirtualCompartmentReference;
import graphic_representation.WEAttribute;
import graphic_representation.impl.Graphic_representationFactoryImpl;

public class AddActionPageDiagramElements extends AActionPageDiagramElements{
	
	//Add Actions
	private Action actionName;
	private Action actionLink;
	private Action actionCompartment;
	private Action actionVirtualCompartment;
	private Action actionVirtualCompartmentOCL;
	private Action actionAffixed;//Bordered Node
	private Action actionAddAllAffixed;
	private Action actionLayer;
	private Action actionAddToLayer;	
	private Action actionShowRoot;
	
	//Edge Add name Action
	private Action actionNameEdge;
	
	public AddActionPageDiagramElements(TreeViewer treeViewer, Shell shell, HeuristicStrategy heuristicStrategy,
			HeuristicStrategySettings heuristicStrategySettings, org.eclipse.swt.widgets.List listOfWarning) {
		super(treeViewer, shell, heuristicStrategy, heuristicStrategySettings, listOfWarning);		
	}

	public void makeActions()
	{
		makeActionName();
		makeActionLink();
		makeActionCompartment();
		makeActionVirtualCompartmentReference();
		makeActionVirtualCompartmentReferenceOCL();
		makeActionAffixed();//Bordered Node	
		makeActionAddAllAffixed();
		makeActionLayer();		
		makeActionShowRoot();	
		makeActionNameEdge();
	}	
	
	private void makeActionNameEdge() {
		
		actionNameEdge = new Action() {
			
			@Override
			public void run() { //Add Label Attribute for Edges
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Edge) {
					
					Edge edge = (Edge) obj;
					if (edge.getAnEClass().getEAttributes().size()==0) {
						MessageDialog.openInformation(getShell(),"Information about add edge name",
								"The Class does not contain Attributes");
					} else {
						LabelEAttribute edgeLabel = Graphic_representationFactory.eINSTANCE.createLabelEAttribute();
						WEAttribute wAttribute = Graphic_representationFactoryImpl.eINSTANCE.createWEAttribute();
						wAttribute.setEAttribute(edge.getAnEClass().getEAllAttributes().get(0));
						edgeLabel.getLabelAttributes().add(wAttribute);
						edge.setEdgeLabel(edgeLabel);	
						getTreeViewer().refresh(obj);
					}					
				}			
				
				System.out.println("Add Label EAttribute to an Edge");
			}			
		};
		
		actionNameEdge.setId("com.wizard.visualization.addNameEdge");
		actionNameEdge.setText("Add Edge Name");
		actionNameEdge.setToolTipText("Add Edge Name");		
	}	

	public void makeActionName(){
		
		actionName = new Action() { //Add LabelEAttribute
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				
				Shape shape = null;
				EClass anEClass = null;
				if(obj instanceof Node || obj instanceof Root)
				{
					if(obj instanceof Node)
					{	
						Node nod = (Node) obj;
						anEClass = nod.getAnEClass();
						shape = nod.getNode_shape();
					}
					else if(obj instanceof Root)
					{
						Root root = (Root)obj;
						anEClass = root.getAnEClass();
						shape = root.getRoot_shape();
					}
					
					GeneralLabel generalLabel = shape.getLabelanEAttribute();
					if (generalLabel instanceof LabelOCL) {
						
						MessageDialog.openInformation(getShell(),"Information about addition of new Label",
								"There is already defined a label using OCL");
						return;
					} else if (generalLabel instanceof LabelEAttribute || generalLabel == null) {
						
						LabelEAttribute label = (LabelEAttribute) generalLabel;
						EList<EAttribute> listEAllAttributes = anEClass.getEAllAttributes();
						int countEAllAttributes = listEAllAttributes.size();
						int countLabelanEAttribute =  generalLabel==null?0:label.getLabelAttributes().size();
						if(countEAllAttributes==0)
						{
							MessageDialog.openInformation(getShell(),"Information about addition of links",
									"There are no Attributes in the EClass");
							return;
						}
						if(countEAllAttributes==countLabelanEAttribute)
							MessageDialog.openInformation(getShell(),"Information about addition",
									"All class attributes have already been selected as labels");
						else if(countEAllAttributes>countLabelanEAttribute){
							int index = 0;
							if (label != null)
								index = MissingEAttribute(listEAllAttributes,label.getLabelAttributes());
							else {
								label = Graphic_representationFactoryImpl.eINSTANCE.createLabelEAttribute();
								label.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
								shape.setLabelanEAttribute(label);
							}
								
							if(index!=-1){
								WEAttribute wAttribute = Graphic_representationFactoryImpl.eINSTANCE.createWEAttribute();
								wAttribute.setEAttribute(listEAllAttributes.get(index));
								label.getLabelAttributes().add(wAttribute);
								getTreeViewer().refresh(obj);
							}
						}
					}								
				}				
			}
		};
		
		actionName.setId("com.wizard.visualization.addName");
		actionName.setText("Add Name");
		actionName.setToolTipText("Add Name");
	};
	
	public void makeActionLink(){
		
		actionLink = new Action() {//Add EReference Link
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				Node_Element nodElement = null;
				EClass anEClass = null;
				if(obj instanceof Node || obj instanceof Root){
					
					if(obj instanceof Node)
					{	
						Node nod = (Node) obj;
						anEClass = nod.getAnEClass();
						nodElement = nod.getNode_elements();
					}
					else if(obj instanceof Root)
					{
						Root root = (Root)obj;
						anEClass = root.getAnEClass();
						nodElement = root.getRoot_node_elements();
					}					
					
					EList<EReference> full_list_references = anEClass.getEAllReferences();
					EList<PaletteDescriptionLink> list  = nodElement.getLinkPalette();	
					int countLinks = list.size();
					EList<AffixedCompartmentElement> listAffixedCompartment = nodElement.getAffixedCompartmentElements();
					int countReferences = full_list_references.size();
					//Virtual Compartments
					EList<VirtualCompartment> listVirtualCompartments = nodElement.getVirtualCompartment();
					if(countReferences==0)
					{
						MessageDialog.openInformation(getShell(),"Information about addition of links",
								"There are no References in the Class");
						return;
					}
					if(countLinks+ listAffixedCompartment.size() ==countReferences)
					{
						MessageDialog.openInformation(getShell(),"Information about addition of links",
								"All References have been selected");
						return;
					}
					else{
						int index = MissingEReference(full_list_references, list,listAffixedCompartment, listVirtualCompartments);
						if(index!=-1){
							PaletteDescriptionLink newlink = Graphic_representationFactoryImpl.eINSTANCE.createPaletteDescriptionLink();
							newlink.setAnEReference(full_list_references.get(index));
							newlink.setPalette_name("Create " + full_list_references.get(index).getName());
							nodElement.getLinkPalette().add(newlink);
							getTreeViewer().refresh(obj);
						}
					}					
				}				
			}
		};
		
		actionLink.setId("com.wizard.visualization.addLink");
		actionLink.setText("Add Link");
		actionLink.setToolTipText("Add Link");
		
	};
	
	public void makeActionCompartment(){
		
		actionCompartment = new Action() {//Add EReference Compartments
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				Node_Element nodElement = null;
				EClass anEClass = null;				
				if(obj instanceof Node || obj instanceof Root){
					
					if(obj instanceof Node)
					{	
						Node nod = (Node) obj;
						anEClass = nod.getAnEClass();
						nodElement = nod.getNode_elements();
					}
					else if(obj instanceof Root)
					{
						Root root = (Root)obj;
						anEClass = root.getAnEClass();
						nodElement = root.getRoot_node_elements();
					}					
					
					EList<EReference> full_list_references = anEClass.getEAllReferences();					
					EList<PaletteDescriptionLink> listLinks = nodElement.getLinkPalette();				
					int count_full_list_references = full_list_references.size();					
					int countAllReferences = anEClass.getEAllReferences().size(); 
					int countLinks = listLinks.size();
					EList<AffixedCompartmentElement> listAffixedCompartment = nodElement.getAffixedCompartmentElements();
					int countAffixedCompartment = listAffixedCompartment.size();
					//Virtual Compartments
					EList<VirtualCompartment> listVirtualCompartments = nodElement.getVirtualCompartment();
					int sizeVirtualCompartments = listVirtualCompartments.size();	
					
					if(count_full_list_references==0)
					{
						MessageDialog.openInformation(getShell(),"Information about addition of Compartments",
								"There are no References in the EClass");
						return;
					}			
					if(countLinks + countAffixedCompartment + sizeVirtualCompartments == countAllReferences)
					{
						MessageDialog.openInformation(getShell(),"Information about addition of Compartments",
								"All References have been selected");
						return;
					}
					int index = MissingEReference(full_list_references,listLinks ,listAffixedCompartment,listVirtualCompartments);
					if(index!=-1){
							CompartmentElement compart = Graphic_representationFactory.eINSTANCE.createCompartmentElement();
							compart.setAnEReference(full_list_references.get(index));							
							nodElement.getAffixedCompartmentElements().add(compart);
							if(obj instanceof Node) {
								Node node = (Node) obj;
								Shape shape = node.getNode_shape();
								boolean shapeIsCompartment = isShapeCompartment(shape);
								if (shapeIsCompartment == false) {
									//Change label
									GeneralLabel generalLabel = ((Node) obj).getNode_shape().getLabelanEAttribute();
									Shape shapeCompartment = Graphic_representationFactory.eINSTANCE.createShapeCompartmentParallelogram();							
									((Node) obj).setNode_shape(shapeCompartment);
									shapeCompartment.setLabelanEAttribute(generalLabel);
								}
								System.out.println("asda");
							}
							getTreeViewer().refresh(obj);
					}					
				}				
			}			
		};
		
		actionCompartment.setId("com.wizard.visualization.addCompartment");
		actionCompartment.setText("Add Compartment");
		actionCompartment.setToolTipText("Add Compartment");
	};
	
	private boolean isShapeCompartment(Shape shape) {
		
		if (shape instanceof IconElement || shape instanceof ShapeCompartmentGradient || 
				shape instanceof ShapeCompartmentParallelogram) 
			return true;
		
		return false;
	}
	
	public void makeActionVirtualCompartmentReference() {
		
		actionVirtualCompartment = new Action() {//Add EReference Virtual Compartments
			
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Node) {
					Node node = (Node) obj;
					EClass anEClass = node.getAnEClass();
					//All References
					EList<EReference> allReferences = anEClass.getEAllReferences();
					int sizeAllReferences = allReferences.size();
					//Containment References
					EList<EReference> allContainmentReferences = anEClass.getEAllContainments();					
					int sizeOfAllContainmentReferences = allContainmentReferences.size();
					//Palette Link
					EList<PaletteDescriptionLink> listLinks = node.getNode_elements().getLinkPalette();
					int sizeOflLinks = listLinks.size();
					//Affixed Compartments
					EList<AffixedCompartmentElement> listAffixedCompartment = node.getNode_elements().getAffixedCompartmentElements();
					int sizeAffixedCompartment = listAffixedCompartment.size();	
					//Virtual Compartments
					EList<VirtualCompartment> listVirtualCompartments = node.getNode_elements().getVirtualCompartment();
					int sizeVirtualCompartments = listVirtualCompartments.size();		
					
					if(sizeOfAllContainmentReferences==0)
					{
						MessageDialog.openInformation(getShell(),"Information about addition of a Virtual Compartment",
								"There are Non-Containment References in the EClass");
						return;
					}	
					if(sizeOflLinks + sizeAffixedCompartment + sizeVirtualCompartments == sizeAllReferences)
					{
						MessageDialog.openInformation(getShell(),"Information about addition of Virtual Compartment",
								"All References have been selected");
						return;
					}
					if(sizeAffixedCompartment<sizeAllReferences){
						
						int index = MissingEReference(allReferences,listLinks ,listAffixedCompartment, listVirtualCompartments);						
						VirtualCompartmentReference virtualCompartment = Graphic_representationFactory.eINSTANCE.createVirtualCompartmentReference();
						virtualCompartment.setVirtualReference(allReferences.get(index));											
						node.getNode_elements().getVirtualCompartment().add(virtualCompartment);
						Shape shape = node.getNode_shape();
						boolean shapeIsCompartment = isShapeCompartment(shape);
						if (shapeIsCompartment == false)
							((Node) obj).setNode_shape(Graphic_representationFactory.eINSTANCE.createShapeCompartmentParallelogram());				
						
						getTreeViewer().refresh(obj);
						
					} else
						MessageDialog.openInformation(getShell(),"Information about addition of Virtual Compartments",
								"All Containment References have already been selected");
				}
			}			
		};
		
		actionVirtualCompartment.setId("com.wizard.visualization.addVirtualCompartment");
		actionVirtualCompartment.setText("Add Virtual Compartment Reference");
		actionVirtualCompartment.setToolTipText("Add Virtual Compartment Reference");		
	}
	
	
	public void makeActionVirtualCompartmentReferenceOCL() {
		
		
		actionVirtualCompartmentOCL = new Action() {//Add EReference Virtual Compartments
			@Override
			public void run() {
				Object obj = GetSelectedTreeViewerObject();
				if (obj instanceof Node) {
					Node node = (Node) obj;
									
					VirtualCompartmentOCL virtualCompartment = Graphic_representationFactory.eINSTANCE.createVirtualCompartmentOCL();
					node.getNode_elements().getVirtualCompartment().add(virtualCompartment);
					Shape shape = node.getNode_shape();
					boolean shapeIsCompartment = isShapeCompartment(shape);
					if (shapeIsCompartment == false)
						((Node) obj).setNode_shape(Graphic_representationFactory.eINSTANCE.createShapeCompartmentParallelogram());				
					
					getTreeViewer().refresh(obj);
				}				
			}			
		};	
		
		actionVirtualCompartmentOCL.setId("com.wizard.visualization.addVirtualCompartment");
		actionVirtualCompartmentOCL.setText("Add Virtual Compartment Reference OCL");
		actionVirtualCompartmentOCL.setToolTipText("Add Virtual Compartment Reference OCL");		
	}
	
	public void makeActionAffixed(){
		
		actionAffixed = new Action() {//Add Affixed

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				Node_Element nodElement = null;
				EClass anEClass = null;	
				if(obj instanceof Node || obj instanceof Root)//Update the Model
				{
					if(obj instanceof Node)
					{	
						Node nod = (Node) obj;
						anEClass = nod.getAnEClass();
						nodElement = nod.getNode_elements();
					}
					else if(obj instanceof Root)
					{
						Root root = (Root)obj;
						anEClass = root.getAnEClass();
						nodElement = root.getRoot_node_elements();
					}					
					
					EList<EReference> full_list_references = anEClass.getEAllReferences();
					EList<PaletteDescriptionLink> listLinks = nodElement.getLinkPalette();
					//int count_full_list_references = full_list_references.size();
					int countAllReferences = anEClass.getEAllReferences().size(); 
					int countLinks = listLinks.size();
					EList<AffixedCompartmentElement> listAffixedCompartment = nodElement.getAffixedCompartmentElements();
					int countAffixedCompartment = listAffixedCompartment.size();
					//Virtual Compartments
					EList<VirtualCompartment> listVirtualCompartments = nodElement.getVirtualCompartment();
									
	 				if(countLinks + countAffixedCompartment == countAllReferences)
					{
						MessageDialog.openInformation(getShell(),"Information about addition of Affixed",
								"All References have been selected");
						return;
					}
					//if(countAffixedCompartment<count_full_list_references){
						int index = MissingEReference(full_list_references,listLinks ,listAffixedCompartment, listVirtualCompartments);
						if(index!=-1){
							AffixedElement affixed = Graphic_representationFactory.eINSTANCE.createAffixedElement();
							affixed.setAnEReference(full_list_references.get(index));
							nodElement.getAffixedCompartmentElements().add(affixed);
							getTreeViewer().refresh(obj);
						}
						else
							MessageDialog.openInformation(getShell(),"Information about addition of links",
									"All Containment References have already been selected");
					//}
					//else
					//	MessageDialog.openInformation(getShell(),"Information about addition of links",
					//			"All Containment References have already been selected");
					System.out.println("add affixed"+obj.toString());
				}
			}			
		};
		
		actionAffixed.setId("com.wizard.visualization.addAffixed");
		actionAffixed.setText("Add Affixed");
		actionAffixed.setToolTipText("Add Affixed");	
		
	};//Bordered Node
	
	public void makeActionLayer(){
		
		actionLayer = new Action() {//Add Additional Layer

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Layer)
				{
					Layer lay = Graphic_representationFactoryImpl.eINSTANCE.createAdditionalLayer();
					Object[] input = (Object[]) getTreeViewer().getInput();					
					lay.setName("Layer " +((RepresentationDD)input[0]).getLayers().size());
					((RepresentationDD)input[0]).getLayers().add(lay);
					getTreeViewer().refresh();					
					System.out.println("Add Additional Layer");
				}				
			}			
		};
		
		actionLayer.setId("com.wizard.visualization.AddLayer");
		actionLayer.setText("Add Additional Layer");
		actionLayer.setToolTipText("Add Additional Layer");
	};
	
	public void makeDinamycallyActionAddToLayerNode(Layer type){
		
		actionAddToLayer = new Action() {

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof EClass)
				{
					Node nod = Graphic_representationFactoryImpl.eINSTANCE.createNode();
					nod.setDiag_palette(Graphic_representationFactoryImpl.eINSTANCE.createPaletteDescription());
					nod.setNode_shape(Graphic_representationFactoryImpl.eINSTANCE.createRectangle());							
					nod.setNode_elements(Graphic_representationFactoryImpl.eINSTANCE.createNode_Element());
					nod.getDiag_palette().setPalette_name("Create " + ((EClass)obj).getName());
					nod.setAnEClass((EClass) obj);
					type.getElements().add(nod);
					Object[] input = (Object[]) getTreeViewer().getInput();
					StrategyPossibleElements strat = (StrategyPossibleElements) input[1];
					strat.getEClassNoElements().remove(obj);
					getTreeViewer().refresh();
					//Validate
					EClass rootEClass = ((RepresentationDD)input[0]).getRoot().getAnEClass();
					if(rootEClass!=null)
					{
						EClass possibleElement = (EClass)obj;
						
						boolean isDiagramElement = ActionTreePageDiagramElements.PossibleElement(rootEClass, getHeuristicStrategy().getEcoreContainment().getPathMatrix(),
														getHeuristicStrategy().getNemf().getList_classes(), possibleElement);
						
						if(isDiagramElement == false)
							getListOfWarning().add("- " + possibleElement.getName() + " - This class is not contained in the root");
						System.out.println("Validate: " + isDiagramElement);
					}							
				}						
				System.out.println(obj.toString() + type.getName());
			}			
		};
		
		actionAddToLayer.setId("com.wizard.visualization.NodeAdd" + type.getName());
		actionAddToLayer.setText("Add Node Layer: " + type.getName());
		actionAddToLayer.setToolTipText("Add Node");
		
	};
	
	public void makeDinamycallyActionAddToLayerEdge(Layer type)
	{
		actionAddToLayer = new Action() {

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof EClass)
				{
					EClass anEClass = ((EClass)obj);
					Edge edg = Graphic_representationFactoryImpl.eINSTANCE.createEdge();
					List<EReference> listReferences = anEClass.getEAllReferences();
					int count = listReferences.size();
					//Edge Creation
					boolean src = false;
					boolean trg = false;
					Edge_Direction dir = Graphic_representationFactoryImpl.eINSTANCE.createEdge_Direction();
					for (int i = 0; i < count; i++) {
						EReference eReference = listReferences.get(i);
						if(eReference.isContainment() == false)
						{
							Link linkValue = Graphic_representationFactoryImpl.eINSTANCE.createLink();
							linkValue.setAnEReference(eReference);
							if(!src){
								dir.setSourceLink(linkValue);							
								src = true;
							}
							else
								if(!trg){
									dir.setTargetLink(linkValue);
									trg = true;
									break;
								}
						}
					}
					if(src==true && trg==true){
						edg.setAnEClass(anEClass);
						edg.setDirections(dir);
						edg.setDiag_palette(Graphic_representationFactory.eINSTANCE.createPaletteDescription());
						edg.getDiag_palette().setPalette_name("Create " + anEClass.getName());									
					}
					else
					{
						MessageDialog.openInformation(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
								"Information about addition",
								"The class has no enough references.");
						return;
					}							
					//End						
					type.getElements().add(edg);
					Object[] input = (Object[]) getTreeViewer().getInput();
					StrategyPossibleElements strat = (StrategyPossibleElements) input[1];
					strat.getEClassNoElements().remove(obj);
					getTreeViewer().refresh();
					//Validate
					
					EClass rootEClass = ((RepresentationDD)input[0]).getRoot().getAnEClass();
					if(rootEClass!=null)
					{
						EClass possibleElement = (EClass)obj;
						
						boolean isDiagramElement = ActionTreePageDiagramElements.PossibleElement(rootEClass, getHeuristicStrategy().getEcoreContainment().getPathMatrix(),
														getHeuristicStrategy().getNemf().getList_classes(), possibleElement);
						
						if(isDiagramElement == false)
							getListOfWarning().add("- " + possibleElement.getName() + " - This class is not contained in the root");
						System.out.println("Validate: " + isDiagramElement);
					}
				}							
				System.out.println(obj.toString() + type.getName());
			}			
		};
		
		actionAddToLayer.setId("com.wizard.visualization.EdgeAdd" + type.getName());
		actionAddToLayer.setText("Add Edge Layer: " + type.getName());
		actionAddToLayer.setToolTipText("Add Edge");
	}
	
	public void makeActionShowRoot(){
		
		actionShowRoot = new Action() {//Show Root

			@Override
			public void run() {
				
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Layer)
				{
					Layer lay = (Layer) obj;
					Object[] input = (Object[]) getTreeViewer().getInput();					
					((RepresentationDD)input[0]).getRoot().setRootLayer(lay);
					boolean isCompartment = false;
					((RepresentationDD)input[0]).getRoot().setRoot_node_elements(Graphic_representationFactoryImpl.eINSTANCE.createNode_Element());
					StrategyLinkCompartment strat = getHeuristicStrategySettings().getStrategy_linkcompartment();							
					strat.ExecuteLinkCompartmentsHeuristics(((RepresentationDD)input[0]).getRoot().getAnEClass());
					Iterator<EReference> itLinks = strat.getListLinks().iterator();
					StrategyLabel strategy_label = getHeuristicStrategySettings().getStrategy_label();
					EAttribute attr = strategy_label.GetLabel(((RepresentationDD)input[0]).getRoot().getAnEClass());
					if(attr!=null)
					{
						LabelEAttribute labelEAttribute = Graphic_representationFactoryImpl.eINSTANCE.createLabelEAttribute();
						WEAttribute wAttribute = Graphic_representationFactoryImpl.eINSTANCE.createWEAttribute();
						wAttribute.setEAttribute(attr);
						labelEAttribute.getLabelAttributes().add(wAttribute);
						labelEAttribute.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						((RepresentationDD)input[0]).getRoot().getRoot_shape().setLabelanEAttribute(labelEAttribute);						
					}					
					while (itLinks.hasNext()) {
						EReference ref = itLinks.next();
						PaletteDescriptionLink e = Graphic_representationFactoryImpl.eINSTANCE.createPaletteDescriptionLink();
						e.setAnEReference(ref);
						e.setPalette_name("Create Link " + ref.getName());
						((RepresentationDD)input[0]).getRoot().getRoot_node_elements().getLinkPalette().add(e);
					}
					Iterator<EReference> itCompartment = strat.getListCompartment().iterator();
					while (itCompartment.hasNext()) {
						EReference ref = itCompartment.next();
						CompartmentElement compart = Graphic_representationFactory.eINSTANCE.createCompartmentElement();
						compart.setAnEReference(ref);
						((RepresentationDD)input[0]).getRoot().getRoot_node_elements().getAffixedCompartmentElements().add(compart);
						isCompartment = true;
					}
					Iterator<EReference> itAffixed = strat.getListAffixed().iterator();
					while (itAffixed.hasNext()) {
						EReference ref = itAffixed.next();
						AffixedElement affixed = Graphic_representationFactory.eINSTANCE.createAffixedElement();
						affixed.setAnEReference(ref);
						((RepresentationDD)input[0]).getRoot().getRoot_node_elements().getAffixedCompartmentElements().add(affixed);
					}
					if(isCompartment == true){
						ShapeCompartmentParallelogram shape = Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentParallelogram();
						shape.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						shape.setBorderColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors()); 
						((RepresentationDD)input[0]).getRoot().setRoot_shape(shape);						
					}
					else{
						Rectangle shape = Graphic_representationFactoryImpl.eINSTANCE.createRectangle();
						shape.setColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors());
						shape.setBorderColor(Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors()); 
						((RepresentationDD)input[0]).getRoot().setRoot_shape(shape);
					}			
					
					getTreeViewer().refresh();					
				}
			}			
			
		};
		
		actionShowRoot.setId("com.wizard.visualization.ShowRoot");
		actionShowRoot.setText("Show Root");
		actionShowRoot.setToolTipText("Add Additional Layer");
		
	};
	
	private void makeActionAddAllAffixed()
	{
		actionAddAllAffixed = new Action() {//Show Root
			
			@Override
			public void run() {
			
				Object obj = GetSelectedTreeViewerObject();
				if(obj instanceof Node)
				{
					Node nod = (Node)obj;
					AddAllAffixedNode(nod);
					getTreeViewer().refresh();
					System.out.println("All EReferences as Affixes");
				}		
				else if(obj instanceof StructuredSelection)
				{
					Iterator<?> itObejcts = ((StructuredSelection) obj).iterator();
					while (itObejcts.hasNext()) {
						Object object = itObejcts.next();
						if(object instanceof Node)
						{
							Node nod = (Node)object;
							AddAllAffixedNode(nod);
							getTreeViewer().refresh();							
						}
					}
				}
			}
		};
		
		actionAddAllAffixed.setId("com.wizard.visualization.AddAllAffixed");
		actionAddAllAffixed.setText("Add All Affixed");
		actionAddAllAffixed.setToolTipText("Add All Affixed");
	}
	
	public void AddAllAffixedNode(Node nod)
	{
		nod.getNode_elements().getAffixedCompartmentElements().clear();
		nod.getNode_elements().getLinkPalette().clear();
		Iterator<EReference> itReferences = nod.getAnEClass().getEAllReferences().iterator();
		while (itReferences.hasNext()) {
			EReference eReference = (EReference) itReferences.next();
			AffixedElement affixed = Graphic_representationFactory.eINSTANCE.createAffixedElement();
			affixed.setAnEReference(eReference);
			nod.getNode_elements().getAffixedCompartmentElements().add(affixed);
		}
	}
	
	public Action getActionAddAllAffixed()
	{
		return this.actionAddAllAffixed;
	}
		
	public Action getActionName() {
		return actionName;
	}

	public Action getActionLink() {
		return actionLink;
	}

	public Action getActionCompartment() {
		return actionCompartment;
	}
	
	public Action getActionVirtualCompartment() {
		return actionVirtualCompartment;
	}
	
	public Action getActionVirtualCompartmentOcl() {
		return actionVirtualCompartmentOCL;
	}

	public Action getActionAffixed() {
		return actionAffixed;
	}

	public Action getActionLayer() {
		return actionLayer;
	}

	public Action getActionAddToLayer() {
		return actionAddToLayer;
	}

	public Action getActionShowRoot() {
		return actionShowRoot;
	}
	
	public Action getActionNameEdge() {
		return actionNameEdge;
	}
	
}
