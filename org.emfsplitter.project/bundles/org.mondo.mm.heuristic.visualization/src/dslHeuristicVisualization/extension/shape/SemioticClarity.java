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

public class SemioticClarity implements ICustomiseShape {

	//Node
	private EList<Shape> sequenceNodeShapes;
	private int indexNodeShape = 0;
	private int indexNodeColor = 0;
	private int indexBorderColor = 0;
	private int indexBorderLine = 0;
	private EList<Integer> sequenceNodeColor;
	private EList<Integer> sequenceNodeBorderColor;
	private EList<Integer> sequenceNodeBorderLine;
	
	//Compartment
	private EList<Shape> sequenceCompartmentShapes;
	private int indexCompartmentShapes = 0;	
	private int indexCompartmentColor = 0;
	private int indexCompartmentBorderColor = 0;
	private int indexCompartmentBorderLine = 0;
	private int indexCompartmentForeGroundColor = 0;
	private EList<Integer> sequenceCompartmentColor;
	private EList<Integer> sequenceCompartmentBorderColor;
	private EList<Integer> sequenceCompartmentBorderLine;
	private EList<Integer> sequenceCompartmentForegroundColor;
	
	//Edge Attributes
	private EList<Integer> sequenceEdgeColor; 
	private int indexEdgeColor = 0;
	private EList<Integer> sequenceEdgeLine;
	private int indexEdgeLine = 0;
	
	public SemioticClarity() {
		initShapes();
		initCompartmentShapes();
		initEdgeClassStyle();
	}	
	
	private void initEdgeClassStyle() {
		
		//Color
		Random random = new Random();
		int maxRandomColor = SystemColors.values().length;
		Integer[] randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceEdgeColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		
		//Line 
		int maxRandomLine = LineStyle.values().length;
		randomNumbers = random.ints(0, maxRandomLine).boxed().distinct().limit(maxRandomLine).toArray(Integer[]::new);
		this.sequenceEdgeLine = new BasicEList<Integer>(Arrays.asList(randomNumbers));		
	}

	private void initCompartmentShapes() {
		
		this.sequenceCompartmentShapes = new BasicEList<Shape>();
		this.sequenceCompartmentShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentGradient());
		this.sequenceCompartmentShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentParallelogram());
		Collections.shuffle(this.sequenceCompartmentShapes);
		
		//BackgroundColor
		Random random = new Random();
		int maxRandomColor = SystemColors.values().length;
		Integer[] randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceCompartmentColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));		
		
		//Border Color
		randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceCompartmentBorderColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		
		//Foreground Color
		randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceCompartmentForegroundColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		
		//Line Style
		int maxRandomLine = LineStyle.values().length;
		randomNumbers = random.ints(0, maxRandomLine).boxed().distinct().limit(maxRandomLine).toArray(Integer[]::new);
		this.sequenceCompartmentBorderLine = new BasicEList<Integer>(Arrays.asList(randomNumbers));
	}

	private void initShapes() {
		
		this.sequenceNodeShapes = new BasicEList<Shape>();
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createEllipse());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createRectangle());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createDiamond());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createNote());
		Collections.shuffle(this.sequenceNodeShapes);	
		
		//BackgroundColor
		Random random = new Random();
		int maxRandomColor = SystemColors.values().length;
		Integer[] randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceNodeColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		
		//Border Color
		randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceNodeBorderColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		
		//Line Style
		int maxRandomLine = LineStyle.values().length;
		randomNumbers = random.ints(0, maxRandomLine).boxed().distinct().limit(maxRandomLine).toArray(Integer[]::new);
		this.sequenceNodeBorderLine = new BasicEList<Integer>(Arrays.asList(randomNumbers));		
	}

	@Override
	public void setNodeShape(Node node, String folderPath, String platformPath) {
		
		if (getIndexNodeShape() >= getSequenceNodeShapes().size()) {
			setIndexNodeShape(0);			
		}
		
		if (getIndexNodeColor() == getIndexNodeShape() && getIndexNodeShape() == getIndexBorderColor()
				&& getIndexBorderColor() == getIndexBorderLine()) {			
			Collections.shuffle(getSequenceNodeShapes());
			Collections.shuffle(getSequenceNodeColor());
			Collections.shuffle(getSequenceNodeBorderColor());
			Collections.shuffle(getSequenceNodeBorderLine());
		}
				
		Shape shape = EcoreUtil.copy(getSequenceNodeShapes().get(getIndexNodeShape()));
		setIndexNodeShape(getIndexNodeShape() + 1);
		
		if (shape instanceof Ellipse) {
			Ellipse ellipse = (Ellipse) shape;
			ellipse.setBorderColor(getBorderColor());
			ellipse.setColor(getNodeColor());
			ellipse.setBorderStyle(getNodeLine());
		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.setBorderColor(getBorderColor());
			rectangle.setColor(getNodeColor());
			rectangle.setBorderStyle(getNodeLine());			
		} else if (shape instanceof Diamond) {
			Diamond diamond = (Diamond) shape;
			diamond.setBorderColor(getBorderColor());
			diamond.setColor(getNodeColor());
			diamond.setBorderStyle(getNodeLine());			
		} else if (shape instanceof Note) {
			Note note = (Note) shape;
			note.setBorderColor(getBorderColor());
			note.setColor(getNodeColor());
			note.setBorderStyle(getNodeLine());
		}		
		
		node.setNode_shape(shape);
		
	}

	private String getNodeLine() {
		
		//Line Style
		if (getIndexBorderLine() >= getSequenceNodeBorderLine().size()) {
			setIndexBorderLine(0);		
		}		
		
		String lineStyle = LineStyle.get(getSequenceNodeBorderLine().get(getIndexBorderLine())).getName();
		setIndexBorderLine(getIndexBorderLine() + 1);
						
		return lineStyle;
	}

	private Color getNodeColor() {
		
		SiriusSystemColors nodeColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//Color
		if (getIndexNodeColor() >= getSequenceNodeColor().size()) {
			setIndexNodeColor(0);			
		}
		
		SystemColors[] systemColors = SystemColors.values();
		nodeColor.setName(systemColors[getSequenceNodeColor().get(getIndexNodeColor())].getName());
		setIndexNodeColor(getIndexNodeColor() + 1);
		
		return nodeColor;
	}
	
	private Color getBorderColor() {
		
		SiriusSystemColors borderColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//Border Color
		if (getIndexBorderColor() >= getSequenceNodeBorderColor().size()) {
			setIndexBorderColor(0);		
		}
		
		SystemColors[] systemColors = SystemColors.values();
		borderColor.setName(systemColors[getSequenceNodeBorderColor().get(getIndexBorderColor())].getName());
		setIndexBorderColor(getIndexBorderColor() + 1);
		
		return borderColor;
	}
	

	@Override
	public void setCompartmentShape(Node node) {
		
		if (getIndexCompartmentShapes() >= getSequenceCompartmentShapes().size()) {
			setIndexCompartmentShapes(0);			
		}
		
																											
		if (getIndexCompartmentColor() == getIndexCompartmentShapes() && getIndexCompartmentShapes() == getIndexCompartmentBorderColor()
				&& getIndexCompartmentBorderColor() == getIndexBorderLine()) { //Changeee!!!			
			Collections.shuffle(getSequenceNodeShapes());
			Collections.shuffle(getSequenceNodeColor());
			Collections.shuffle(getSequenceNodeBorderColor());
			Collections.shuffle(getSequenceNodeBorderLine());
		}	
		
		
		Shape shape = EcoreUtil.copy(getSequenceCompartmentShapes().get(getIndexCompartmentShapes()));
		setIndexCompartmentShapes(getIndexCompartmentShapes() + 1);		
		
		if (shape instanceof ShapeCompartmentGradient) {
			ShapeCompartmentGradient gradient = ((ShapeCompartmentGradient) shape);
			gradient.setColor(getCompartmentColor());	
			gradient.setBorderColor(getCompartmentBorderColor());
			gradient.setForeGroundColor(getCompartmentForeGroundColor());
			gradient.setBorderStyle(getCompartmentLine());
			
		} else if (shape instanceof ShapeCompartmentParallelogram) {
			ShapeCompartmentParallelogram parallelogram = ((ShapeCompartmentParallelogram) shape);
			parallelogram.setColor(getCompartmentColor());
			parallelogram.setBorderColor(getCompartmentBorderColor());
			parallelogram.setBorderStyle(getCompartmentLine());
		}		
		
		node.setNode_shape(shape);	
	}	

	private String getCompartmentLine() {
		
		//Line Style
		if (getIndexCompartmentBorderLine() >= this.sequenceCompartmentBorderLine.size()) {
			setIndexCompartmentBorderLine(0);				
		}
		
		String lineStyle = LineStyle.get(sequenceCompartmentBorderLine.get(getIndexCompartmentBorderLine())).getName();
		setIndexCompartmentBorderLine(getIndexCompartmentBorderLine() + 1);
				
		return lineStyle;
	}

	private Color getCompartmentForeGroundColor() {
		
		SiriusSystemColors compartmentForegroundColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//ForegroundColor
		if (getIndexCompartmentForeGroundColor() >= this.sequenceCompartmentForegroundColor.size()) {
			setIndexCompartmentForeGroundColor(0);			
		}
		
		SystemColors[] systemColors = SystemColors.values();
		compartmentForegroundColor.setName(systemColors[this.sequenceCompartmentForegroundColor.get(getIndexCompartmentForeGroundColor())].getName());
		setIndexCompartmentForeGroundColor(getIndexCompartmentForeGroundColor() + 1);	
		
		return compartmentForegroundColor;
	}

	private Color getCompartmentBorderColor() {
		
		SiriusSystemColors compartmentBorderColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//BorderColor
		if (getIndexCompartmentBorderColor() >= this.sequenceCompartmentBorderColor.size()) {
				setIndexCompartmentBorderColor(0);			
		}
		
		SystemColors[] systemColors = SystemColors.values();
		compartmentBorderColor.setName(systemColors[this.sequenceCompartmentBorderColor.get(getIndexCompartmentBorderColor())].getName());
		setIndexCompartmentBorderColor(getIndexCompartmentBorderColor() + 1);		
		
		return compartmentBorderColor;
	}

	private Color getCompartmentColor() {	
		
		SiriusSystemColors compartmentColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//Color
		if (getIndexCompartmentColor() >= this.sequenceCompartmentColor.size()) {
			setIndexCompartmentColor(0);			
		}
		
		SystemColors[] systemColors = SystemColors.values();
		compartmentColor.setName(systemColors[this.sequenceCompartmentColor.get(getIndexCompartmentColor())].getName());
		setIndexCompartmentColor(getIndexCompartmentColor() + 1);
		
		return compartmentColor;
	}

	@Override
	public void setEdgeClassStyle(Edge edge) {
		Edge_Style edgStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
		
		if (getIndexEdgeColor() == getIndexEdgeLine()) {			
			Collections.shuffle(getSequenceEdgeColor());
			Collections.shuffle(getSequenceEdgeLine());			
		}		
		
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
		setIndexEdgeLine(getIndexEdgeLine() + 1);
				
		return lineStyle;
	}

	private Color getEdgeClassColor() {
		
		SiriusSystemColors edgeColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		//Color
		if (getIndexEdgeColor() >= this.sequenceEdgeColor.size()) {
			setIndexEdgeColor(0);			
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
	
	private String getSourceDecorator() {
		return "NoDecoration";
	}

	private String getTargetDecorator() {
		return "InputArrow";
	}

	public EList<Shape> getSequenceNodeShapes() {
		return sequenceNodeShapes;
	}
	
	public EList<Integer> getSequenceNodeColor() {
		return sequenceNodeColor;
	}
	
	public EList<Integer> getSequenceNodeBorderColor() {
		return sequenceNodeBorderColor;
	}	
	
	public EList<Integer> getSequenceNodeBorderLine() {
		return sequenceNodeBorderLine;
	}
	
	public int getIndexNodeShape() {
		return indexNodeShape;
	}
	
	public int getIndexNodeColor() {
		return indexNodeColor;
	}
	
	public int getIndexBorderColor() {
		return indexBorderColor;
	}
	
	public int getIndexBorderLine() {
		return indexBorderLine;
	}	
	
	public int getIndexCompartmentColor() {
		return indexCompartmentColor;
	}
	
	public EList<Shape> getSequenceCompartmentShapes() {
		return sequenceCompartmentShapes;
	}
	
	public int getIndexCompartmentShapes() {
		return indexCompartmentShapes;
	}
	
	public int getIndexCompartmentBorderColor() {
		return indexCompartmentBorderColor;
	}
	
	public int getIndexCompartmentForeGroundColor() {
		return indexCompartmentForeGroundColor;
	}
	
	public int getIndexCompartmentBorderLine() {
		return indexCompartmentBorderLine;
	}
	
	public int getIndexEdgeColor() {
		return indexEdgeColor;
	}
	
	public int getIndexEdgeLine() {
		return indexEdgeLine;
	}
	
	public EList<Integer> getSequenceEdgeColor() {
		return sequenceEdgeColor;
	}
	
	public EList<Integer> getSequenceEdgeLine() {
		return sequenceEdgeLine;
	}
	
	//Setters
	public void setIndexNodeShape(int indexNodeShape) {
		this.indexNodeShape = indexNodeShape;
	}
	
	public void setIndexNodeColor(int indexNodeColor) {
		this.indexNodeColor = indexNodeColor;
	}
	
	public void setIndexBorderColor(int indexBorderColor) {
		this.indexBorderColor = indexBorderColor;
	}
	
	public void setIndexBorderLine(int indexBorderLine) {
		this.indexBorderLine = indexBorderLine;
	}
	
	public void setIndexCompartmentShapes(int indexCompartmentShapes) {
		this.indexCompartmentShapes = indexCompartmentShapes;
	}
	
	public void setIndexCompartmentColor(int indexCompartmentColor) {
		this.indexCompartmentColor = indexCompartmentColor;
	}
	
	public void setIndexCompartmentBorderColor(int indexCompartmentBorderColor) {
		this.indexCompartmentBorderColor = indexCompartmentBorderColor;
	}
	
	public void setIndexCompartmentForeGroundColor(int indexCompartmentForeGroundColor) {
		this.indexCompartmentForeGroundColor = indexCompartmentForeGroundColor;
	}
	
	public void setIndexCompartmentBorderLine(int indexCompartmentBorderLine) {
		this.indexCompartmentBorderLine = indexCompartmentBorderLine;
	}
	
	public void setIndexEdgeColor(int indexEdgeColor) {
		this.indexEdgeColor = indexEdgeColor;
	}
	
	public void setIndexEdgeLine(int indexEdgeLine) {
		this.indexEdgeLine = indexEdgeLine;
	}
}
