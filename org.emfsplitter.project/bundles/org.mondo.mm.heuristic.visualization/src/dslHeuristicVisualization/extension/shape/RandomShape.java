package dslHeuristicVisualization.extension.shape;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.viewpoint.description.SystemColors;

import graphic_representation.Color;
import graphic_representation.Diamond;
import graphic_representation.Edge;
import graphic_representation.Edge_Style;
import graphic_representation.Ellipse;
import graphic_representation.Graphic_representationFactory;
import graphic_representation.Node;
import graphic_representation.Note;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Rectangle;
import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;
import graphic_representation.SiriusSystemColors;
import graphic_representation.impl.Graphic_representationFactoryImpl;

public class RandomShape implements ICustomiseShape {
	
	// Node attributes
	private EList<Shape> sequenceNodeShapes;
	private int indexNodeShape = 0;
	private EList<Integer> sequenceColor;
	private int indexColor = 0;
	private EList<Integer> sequenceLine;
	private int indexLine = 0;
	
	//Compartment attributes
	private EList<Shape> sequenceCompartmentShapes;
	private int indexCompartmentShape = 0;
	private EList<Integer> sequenceCompartmentColor;
	private int indexCompartmentColor = 0;
	private EList<Integer> sequenceCompartmentLine;
	private int indexCompartmentLine = 0;
	
	//Edge Attributes
	private EList<Integer> sequenceEdgeColor; 
	private int indexEdgeColor = 0;
	private EList<Integer> sequenceEdgeLine;
	private int indexEdgeLine = 0;
	
	public RandomShape() {
		//Node Shapes		
		//Shapes
		this.sequenceNodeShapes = new BasicEList<Shape>();
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createEllipse());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createRectangle());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createDiamond());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createNote());
		Collections.shuffle(this.sequenceNodeShapes);
					
		//Color
		Random random = new Random();
		int maxRandomColor = SystemColors.values().length;
		Integer[] randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		indexColor = 0;
		
		//Border Line
		int maxRandomLine = LineStyle.values().length;
		randomNumbers = random.ints(0, maxRandomLine).boxed().distinct().limit(maxRandomLine).toArray(Integer[]::new);
		this.sequenceLine = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		indexLine = 0;	
		
		//Compartment
		//Shapes
		this.sequenceCompartmentShapes = new BasicEList<Shape>();
		this.sequenceCompartmentShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentGradient());
		this.sequenceCompartmentShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentParallelogram());
		Collections.shuffle(this.sequenceCompartmentShapes);
		//Color
		randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceCompartmentColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		//Border Line
		randomNumbers = random.ints(0, maxRandomLine).boxed().distinct().limit(maxRandomLine).toArray(Integer[]::new);
		this.sequenceCompartmentLine = new BasicEList<Integer>(Arrays.asList(randomNumbers));		
		
		//Edge
		//Color
		randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceEdgeColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
				
		//Line 
		randomNumbers = random.ints(0, maxRandomLine).boxed().distinct().limit(maxRandomLine).toArray(Integer[]::new);
		this.sequenceEdgeLine = new BasicEList<Integer>(Arrays.asList(randomNumbers));				
	}	

	@Override
	public void setNodeShape(Node node, String folderPath, String platformPath) {

		if (getIndexNodeShape() >= getSequenceNodeShapes().size()) {
			setIndexNodeShape(0);
			Collections.shuffle(this.sequenceNodeShapes);
		}		
		
		Shape shape = EcoreUtil.copy(getSequenceNodeShapes().get(getIndexNodeShape()));
		setIndexNodeShape(getIndexNodeShape() + 1);
		
		if (shape instanceof Ellipse) {
			Ellipse ellipse = (Ellipse) shape;
			ellipse.setBorderColor(getNodeColor());
			ellipse.setColor(getNodeColor());
			ellipse.setBorderStyle(getNodeLine());
		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.setBorderColor(getNodeColor());
			rectangle.setColor(getNodeColor());
			rectangle.setBorderStyle(getNodeLine());			
		} else if (shape instanceof Diamond) {
			Diamond diamond = (Diamond) shape;
			diamond.setBorderColor(getNodeColor());
			diamond.setColor(getNodeColor());
			diamond.setBorderStyle(getNodeLine());			
		} else if (shape instanceof Note) {
			Note note = (Note) shape;
			note.setBorderColor(getNodeColor());
			note.setColor(getNodeColor());
			note.setBorderStyle(getNodeLine());
		}		
		
		node.setNode_shape(shape);		
	}

	private String getNodeLine() {
		//Line Style
		if (getIndexLine() >= this.sequenceLine.size()) {
			setIndexLine(0);
			Collections.shuffle(this.sequenceLine);
		}		
		String lineStyle = LineStyle.get(sequenceLine.get(getIndexLine())).getName();
		setIndexLine(getIndexLine() + 1);
						
		return lineStyle;
	}

	private Color getNodeColor() {
		SiriusSystemColors nodeColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//Color
		if (getIndexColor() >= this.sequenceColor.size()) {
			setIndexColor(0);
			Collections.shuffle(this.sequenceColor);
		}
		
		SystemColors[] systemColors = SystemColors.values();
		nodeColor.setName(systemColors[sequenceColor.get(getIndexColor())].getName());
		setIndexColor(getIndexColor() + 1);
		
		return nodeColor;
	}

	@Override
	public void setCompartmentShape(Node node) {
		
		if (getIndexCompartmentShape() >= getSequenceCompartmentShapes().size()) {
			setIndexCompartmentShape(0);
			Collections.shuffle(this.sequenceCompartmentShapes);
		}
		
		Shape shape = EcoreUtil.copy(getSequenceCompartmentShapes().get(getIndexCompartmentShape()));
		setIndexCompartmentShape(getIndexCompartmentShape() + 1);
		
		if (shape instanceof ShapeCompartmentGradient) {
			ShapeCompartmentGradient gradient = ((ShapeCompartmentGradient) shape);
			gradient.setColor(getCompartmentColor());	
			gradient.setBorderColor(getCompartmentColor());
			gradient.setForeGroundColor(getCompartmentColor());
			gradient.setBorderStyle(getCompartmentLine());
			
		} else if (shape instanceof ShapeCompartmentParallelogram) {
			ShapeCompartmentParallelogram parallelogram = ((ShapeCompartmentParallelogram) shape);
			parallelogram.setColor(getCompartmentColor());
			parallelogram.setBorderColor(getCompartmentColor());
			parallelogram.setBorderStyle(getCompartmentLine());
		}
		
		node.setNode_shape(shape);		
	}

	private String getCompartmentLine() {
		
		//Line Style
		if (getIndexCompartmentLine() >= this.sequenceCompartmentLine.size()) {
			setIndexCompartmentLine(0);
			Collections.shuffle(this.sequenceCompartmentLine);
		}		
		String lineStyle = LineStyle.get(sequenceCompartmentLine.get(getIndexCompartmentLine())).getName();
		setIndexCompartmentLine(getIndexCompartmentLine() + 1);
				
		return lineStyle;		
	}

	private Color getCompartmentColor() {

		SiriusSystemColors compartmentColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//Color
		if (getIndexCompartmentColor() >= this.sequenceCompartmentColor.size()) {
			setIndexCompartmentColor(0);
			Collections.shuffle(this.sequenceCompartmentColor);
		}
		
		SystemColors[] systemColors = SystemColors.values();
		compartmentColor.setName(systemColors[this.sequenceCompartmentColor.get(getIndexCompartmentColor())].getName());
		setIndexCompartmentColor(getIndexCompartmentColor() + 1);
		
		return compartmentColor;
	}

	@Override
	public void setEdgeClassStyle(Edge edge) {
		
		Edge_Style edgStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
		
		// Edge Color		
		edgStyle.setColor(getEdgeClassColor());
		
		//Line Style
		edgStyle.setLineStyle(getEdgeClassLine());
			
		edge.setEdge_style(edgStyle);		
	}	

	private String getEdgeClassLine() {
		
		//Line Style
		if (getIndexEdgeLine() >= this.sequenceEdgeLine.size()) {
			setIndexEdgeLine(0);
			Collections.shuffle(this.sequenceEdgeLine);
		}		
		String lineStyle = LineStyle.get(sequenceEdgeLine.get(getIndexEdgeLine())).getName();
		setIndexEdgeLine(getIndexLine() + 1);
				
		return lineStyle;		
	}

	private Color getEdgeClassColor() {
		
		SiriusSystemColors edgeColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		//Color
		if (getIndexEdgeColor() >= this.sequenceEdgeColor.size()) {
			setIndexEdgeColor(0);
			Collections.shuffle(this.sequenceEdgeColor);
		}
		
		SystemColors[] systemColors = SystemColors.values();
		edgeColor.setName(systemColors[sequenceEdgeColor.get(getIndexEdgeColor())].getName());
		setIndexEdgeColor(getIndexEdgeColor() + 1);
		
		return edgeColor;	
	}

	@Override
	public void setLinkStyle(PaletteDescriptionLink link) {
		
		link.setColor(getEdgeClassColor());
		link.setDecoratorName(getTargetDecorator());
		link.setSourceDecoratorName(getSourceDecorator());
		link.setLineStyle(getEdgeClassLine());
	}	
	
	//Getters
	public int getIndexNodeShape() {
		return indexNodeShape;
	}
	
	public EList<Shape> getSequenceNodeShapes() {
		return sequenceNodeShapes;
	}
	
	public int getIndexLine() {
		return indexLine;
	}
	
	public int getIndexColor() {
		return indexColor;
	}
	
	public int getIndexCompartmentShape() {
		return indexCompartmentShape;
	}
	
	public EList<Shape> getSequenceCompartmentShapes() {
		return sequenceCompartmentShapes;
	}
	
	public int getIndexCompartmentLine() {
		return indexCompartmentLine;
	}
	
	public int getIndexCompartmentColor() {
		return indexCompartmentColor;
	}
	
	public int getIndexEdgeColor() {
		return indexEdgeColor;
	}
	
	public int getIndexEdgeLine() {
		return indexEdgeLine;
	}
	
	public String getTargetDecorator() {		
		return "InputArrow";
	}
	
	public String getSourceDecorator() {
		return "NoDecoration";
	}
	
	//Setters
	public void setIndexNodeShape(int indexNodeShape) {
		this.indexNodeShape = indexNodeShape;
	}
	
	public void setIndexLine(int indexLine) {
		this.indexLine = indexLine;
	}
	
	public void setIndexColor(int indexColor) {
		this.indexColor = indexColor;
	}
	
	public void setIndexCompartmentShape(int indexCompartmentShape) {
		this.indexCompartmentShape = indexCompartmentShape;
	}	
	
	public void setIndexCompartmentLine(int indexCompartmentLine) {
		this.indexCompartmentLine = indexCompartmentLine;
	}
	
	public void setIndexCompartmentColor(int indexCompartmentColor) {
		this.indexCompartmentColor = indexCompartmentColor;
	}
	
	public void setIndexEdgeColor(int indexEdgeColor) {
		this.indexEdgeColor = indexEdgeColor;
	}
	
	public void setIndexEdgeLine(int indexEdgeLine) {
		this.indexEdgeLine = indexEdgeLine;
	}
}
