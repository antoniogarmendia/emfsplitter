package org.mondo.emf.splitter.dsl.tao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import MetaModelGraph.Graph;
import MetaModelGraph.Node;
import MetaModelGraph.SubGraph;
import dslPatterns.ClassInterface;
import dslPatterns.ComplexFeatureMain;
import dslPatterns.FeatureInterface;
import dslPatterns.FeatureType;
import dslPatterns.Pattern;
import dslPatterns.PatternMetaModel;
import dslPatterns.ReferenceInterface;
import dslPatterns.Variant;
import graphic_representation.AllElements;
import graphic_representation.Diamond;
import graphic_representation.Edge;
import graphic_representation.Ellipse;
import graphic_representation.GeneralLabel;
import graphic_representation.GraphicRepresentation;
import graphic_representation.IconElement;
import graphic_representation.LabelEAttribute;
import graphic_representation.Layer;
import graphic_representation.MMGraphic_Representation;
import graphic_representation.Node_Element;
import graphic_representation.Rectangle;
import graphic_representation.Representation;
import graphic_representation.RepresentationDD;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.WEAttribute;
import runtimePatterns.ClassRoleInstance;
import runtimePatterns.InstanceFeatureRoleInstance;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.ReferenceRoleInstance;
import runtimePatterns.TypeFeatureRoleInstance;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.util.DSLtaoUtils;

public class GRToDSLtaoGraph {
	
	private Pattern eGraphBasedPattern;
	
	//Graph-Based Notations
	private ClassInterface diagram;
	private ClassInterface edgeElement;
	private ClassInterface iconElement;
	private ClassInterface circle;
	private ClassInterface rectangle;
	private ClassInterface rhombus;
	private ClassInterface containerElement;
		
	//Feature Interface Rhombus
	private FeatureInterface widthRhombus;
	private FeatureInterface heightRhombus;
	//Feature Interface Rectangle
	private FeatureInterface widthRectangle;
	private FeatureInterface heightRectangle;	
	//Feature Interface IconElement
	private FeatureInterface filePath;
	//Feature Interface Circle
	private FeatureInterface radius;
	
	private FeatureInterface label;	
	//FeatureInterface EdgeElement
	private ReferenceInterface source;
	private ReferenceInterface target;	
	//ReferenceInterface Containment Reference
	//private ReferenceInterface elements;
	
	public GRToDSLtaoGraph(Pattern eGraphBasedPattern) {
		
		this.eGraphBasedPattern = eGraphBasedPattern;
		init();
	}


	private void init() {
		ComplexFeatureMain rootPattern = this.eGraphBasedPattern.getRootVariant();
		EList<Variant> patternVariants = rootPattern.getAndChildren();
		Variant modularVariant = patternVariants.get(0);
		
		if(modularVariant instanceof ComplexFeatureMain) {
			//Graph-Representation Pattern
			ComplexFeatureMain defaultMainGbPattern = (ComplexFeatureMain) modularVariant; 
			PatternMetaModel mainGbPattern = defaultMainGbPattern.getMetaModel();
			
			//Graph Based Pattern Notations
			this.diagram = getClassInterfaceByName(mainGbPattern, "Diagram");
			this.edgeElement = getClassInterfaceByName(mainGbPattern, "EdgeElement");
			this.iconElement = getClassInterfaceByName(mainGbPattern, "IconElement");
			this.circle = getClassInterfaceByName(mainGbPattern, "Circle");
			this.rectangle = getClassInterfaceByName(mainGbPattern, "Rectangle");
			this.rhombus = getClassInterfaceByName(mainGbPattern, "Rhombus");	
			this.containerElement = getClassInterfaceByName(mainGbPattern, "ContainerElement");
			
			//Graph Based Feature Interface
			this.widthRectangle = getFeatureTypeByName(mainGbPattern, "width", "Rectangle");
			this.heightRectangle = getFeatureTypeByName(mainGbPattern, "height", "Rectangle");
			this.widthRhombus = getFeatureTypeByName(mainGbPattern, "width", "Rhombus");
			this.heightRhombus = getFeatureTypeByName(mainGbPattern, "height", "Rhombus");
			this.radius = getFeatureTypeByName(mainGbPattern, "radius");
			this.filePath = getFeatureTypeByName(mainGbPattern, "filepath");
			this.source = getReferenceInterfaceByName(mainGbPattern, "source");
			this.target = getReferenceInterfaceByName(mainGbPattern, "target");
			this.label =  getFeatureTypeByName(mainGbPattern, "label");
			//Graph Based ReferenceInterface
			//this.elements = getReferenceInterfaceByName(mainGbPattern, "elements");
		}
	}

	public void tranformGRToGraphBasedPattern(GraphicRepresentation graph, PatternInstances patternInstances){
		
		
		Iterator<MMGraphic_Representation> itMMGraphic_Representation = graph.getAllGraphicRepresentation().iterator();
		while (itMMGraphic_Representation.hasNext()) {
			MMGraphic_Representation gR = (MMGraphic_Representation) itMMGraphic_Representation.next();
			Iterator<Representation> itRepresentations = gR.getListRepresentations().iterator();
			
			while (itRepresentations.hasNext()) {
				Representation representation = (Representation) itRepresentations.next();
				if (representation instanceof RepresentationDD) {
					Root root = ((RepresentationDD) representation).getRoot();
										
					//Create Graph Based Pattern
					PatternInstance gbInstance = DSLtaoUtils.createPatternInstance(DSLtaoUtils.catGraphRepresentation, this.eGraphBasedPattern);									
					//Add Project Class Role Instance
					ClassRoleInstance rootInterface = addClassRoleInstance(root.getAnEClass(), gbInstance, diagram);
					
					addDiagramElementsAsClassInterface((RepresentationDD)representation,gbInstance, rootInterface);			
					
					//Add Modular Pattern to Applied Patterns
					patternInstances.getAppliedPatterns().add(gbInstance);	
				}
			}					
								
			System.out.println("Transformation Graph to Runtime Patterns");
		}	
	}
	
	private void addDiagramElementsAsClassInterface(RepresentationDD representation, PatternInstance gbInstance, ClassRoleInstance rootInterface) {			
		Iterator<Layer> itlLayers = representation.getLayers().iterator();
		while (itlLayers.hasNext()) {
			Layer layer = (Layer) itlLayers.next();
			Iterator<AllElements> itAllElements = layer.getElements().iterator();
			while (itAllElements.hasNext()) {
				AllElements element = (AllElements) itAllElements.next();	
				ClassInterface classInterface = null;
				EClass eClass = null;
				if (element instanceof Edge) {
					classInterface =  this.edgeElement;	
					eClass = ((Edge) element).getAnEClass();
					ClassRoleInstance cRoleInstance = addClassRoleInstance(eClass, gbInstance, classInterface);
					// source
					ReferenceRoleInstance typeSource = RuntimePatternsFactoryImpl.eINSTANCE.createReferenceRoleInstance();
					typeSource.setRole(this.source);
					typeSource.setElement(((Edge) element).getDirections().getSourceLink().getAnEReference());
					cRoleInstance.getReferenceInstances().add(typeSource);
					// target
					ReferenceRoleInstance typeTarget = RuntimePatternsFactoryImpl.eINSTANCE.createReferenceRoleInstance();
					typeTarget.setRole(this.target);
					typeTarget.setElement(((Edge) element).getDirections().getTargetLink().getAnEReference());
					cRoleInstance.getReferenceInstances().add(typeTarget);
				} else if (element instanceof graphic_representation.Node) {
					eClass = ((graphic_representation.Node) element).getAnEClass();
					graphic_representation.Node node = (graphic_representation.Node) element;
					Shape sh = ((graphic_representation.Node) element).getNode_shape();
					if (sh instanceof Rectangle) {
						ClassRoleInstance cRoleInstance = addClassRoleInstance(eClass, gbInstance, this.rectangle);
						addFeatureInstanceRectangle(cRoleInstance,(Rectangle) sh,node);
					}
					else if (sh instanceof IconElement) {
						ClassRoleInstance cRoleInstance = addClassRoleInstance(eClass, gbInstance, this.iconElement);
						addFeatureInstanceIconElement(cRoleInstance,(IconElement) sh, node);
					}
					else if (sh instanceof Diamond) {
						ClassRoleInstance cRoleInstance = addClassRoleInstance(eClass, gbInstance, this.rhombus);
						addFeatureInstanceRhombus(cRoleInstance,(Diamond) sh, node);
					}
					else if (sh instanceof Ellipse) {
						ClassRoleInstance cRoleInstance = addClassRoleInstance(eClass, gbInstance, this.circle);
						addFeatureInstanceCircle(cRoleInstance,(Ellipse) sh,node);
					}
				}				
			}			
		}		
	}
	
	private ClassRoleInstance getClassRoleInstanceByClass(PatternInstance gbInstance, EClass eClass) {
		
		Iterator<ClassRoleInstance> itClassRoleInstances = gbInstance.getClassInstances().iterator();
		while (itClassRoleInstances.hasNext()) {
			ClassRoleInstance classRoleInstance = (ClassRoleInstance) itClassRoleInstances.next();
			if (classRoleInstance.equals(eClass))
				return classRoleInstance;
		}
		return null;		
	}
	
	private void addFeatureInstanceCircle(ClassRoleInstance cRoleInstance, Ellipse sh, graphic_representation.Node node) {
		//set radius
		InstanceFeatureRoleInstance featRadius = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featRadius.setRole(this.radius);
		featRadius.setValue(sh.getHorizontalDiameter().toString());
		cRoleInstance.getFeatureInstances().add(featRadius);
		//set label
		addLabel(node, cRoleInstance);
	}

	private void addFeatureInstanceRectangle(ClassRoleInstance cRoleInstance, Rectangle sh, graphic_representation.Node node) {
		//set width
		InstanceFeatureRoleInstance featWidth = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featWidth.setRole(this.widthRectangle);
		featWidth.setValue(sh.getWidth().toString());
		cRoleInstance.getFeatureInstances().add(featWidth);		
				
		//set height
		InstanceFeatureRoleInstance featHeight = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featHeight.setRole(this.heightRectangle);
		featHeight.setValue(sh.getHeight().toString());
		cRoleInstance.getFeatureInstances().add(featHeight);		
		
		//set label
		addLabel(node, cRoleInstance);
	}

	private void addFeatureInstanceIconElement(ClassRoleInstance cRoleInstance, IconElement sh, graphic_representation.Node node) {
		//set filePath
		InstanceFeatureRoleInstance featPath = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featPath.setRole(this.filePath);
		featPath.setValue(sh.getFilepath());
		cRoleInstance.getFeatureInstances().add(featPath);
		
		//set label
		addLabel(node, cRoleInstance);
	}


	private void addFeatureInstanceRhombus(ClassRoleInstance cRoleInstance, Diamond sh, graphic_representation.Node node) {		
		//set width
		InstanceFeatureRoleInstance featWidth = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featWidth.setRole(this.widthRhombus);
		featWidth.setValue(sh.getSize().toString());
		cRoleInstance.getFeatureInstances().add(featWidth);		
		
		//set height
		InstanceFeatureRoleInstance featHeight = RuntimePatternsFactoryImpl.eINSTANCE.createInstanceFeatureRoleInstance();
		featHeight.setRole(this.heightRhombus);
		featHeight.setValue(sh.getSize().toString());
		cRoleInstance.getFeatureInstances().add(featHeight);	
		
		//set label
		addLabel(node, cRoleInstance);
	}
	
	private void addLabel(graphic_representation.Node node, ClassRoleInstance cRoleInstance) {
		
		GeneralLabel label = node.getNode_shape().getLabelanEAttribute();
		if (label instanceof LabelEAttribute) {
			LabelEAttribute labelEAttributes = (LabelEAttribute) label;
			Iterator<WEAttribute> itAttributes = labelEAttributes.getLabelAttributes().iterator();
			while (itAttributes.hasNext()) {
				WEAttribute eAttribute = (WEAttribute) itAttributes.next();
				TypeFeatureRoleInstance typeFeat = RuntimePatternsFactoryImpl.eINSTANCE.createTypeFeatureRoleInstance();
				typeFeat.setElement(eAttribute.getEAttribute());
				typeFeat.setRole((FeatureType) this.label);
				cRoleInstance.getFeatureInstances().add(typeFeat);
			}
		}		
	}

	private void addReferenceInstance() {
		
	}
	

	private ClassRoleInstance addClassRoleInstance(EClass eClass, PatternInstance patternInstance, ClassInterface classInterface) {
		
		// create class role instance 
		ClassRoleInstance classInstance = RuntimePatternsFactoryImpl.eINSTANCE.createClassRoleInstance();
		classInstance.setRole(classInterface);
		classInstance.setElement(eClass);
			
		patternInstance.getClassInstances().add(classInstance);
		
		return classInstance;		
	}


	private ClassInterface getClassInterfaceByName(PatternMetaModel mainModularPattern, String name){
		
		Iterator<ClassInterface> itClassInstances = mainModularPattern.getClassInterfaces().iterator();
		
		while (itClassInstances.hasNext()) {
			
			ClassInterface classRoleInstance = itClassInstances.next();
			EClass eClass = ((ClassInterface) classRoleInstance).getRef().get(0);
			
			if(eClass.getName().equals(name))
				return ((ClassInterface) classRoleInstance);						
		}
		
		return null;
	}
	
	private FeatureInterface getFeatureTypeByName(PatternMetaModel modularPattern, String name){
		
		Iterator<FeatureInterface> itFeatInstances = modularPattern.getAttrInterfaces().iterator();
		while (itFeatInstances.hasNext()) {
			FeatureInterface featureInterface = (FeatureInterface) itFeatInstances.next();
			
			EAttribute eAttribute = featureInterface.getRef().get(0);
				if(eAttribute.getName().equals(name))
					return featureInterface;	
		}	
		
		return null;
	} 
	
	private FeatureInterface getFeatureTypeByName(PatternMetaModel pattern, String name, String className) {
		
		Iterator<FeatureInterface> itFeatInstances = pattern.getAttrInterfaces().iterator();
		while (itFeatInstances.hasNext()) {
			FeatureInterface featureInterface = (FeatureInterface) itFeatInstances.next();
			
			EAttribute eAttribute = featureInterface.getRef().get(0);
			String asd =eAttribute.getEContainingClass().getName();
				if(eAttribute.getName().equals(name) && eAttribute.getEContainingClass().getName().equals(className))
					return featureInterface;	
		}		
		
		return null;
	}
	
	
	private ReferenceInterface getReferenceInterfaceByName(PatternMetaModel modularPattern, String name){
		
		Iterator<ReferenceInterface> itRefInterfaces = modularPattern.getRefInterfaces().iterator();
		while (itRefInterfaces.hasNext()) {
			
			ReferenceInterface refInterface = itRefInterfaces.next();
			EReference eReference = refInterface.getRef();
			
				if(eReference.getName().equals(name))
					return refInterface;			
		}		
		
		return null;
	}	

}
