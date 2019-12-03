/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.GraphicalShapesEdgeStyle;
import graphic_representation.Diamond;
import graphic_representation.Ellipse;
import graphic_representation.Node;
import graphic_representation.Note;
import graphic_representation.Rectangle;
import graphic_representation.Shape;
import graphic_representation.SiriusSystemColors;
import graphic_representation.impl.Graphic_representationFactoryImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.viewpoint.description.SystemColors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Shapes Edge Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalShapesEdgeStyleImpl#getSequenceNodeShapes <em>Sequence Node Shapes</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalShapesEdgeStyleImpl#getIndexNodeShape <em>Index Node Shape</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalShapesEdgeStyleImpl#getSequenceLine <em>Sequence Line</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalShapesEdgeStyleImpl#getSequenceColor <em>Sequence Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalShapesEdgeStyleImpl#getIndexColor <em>Index Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalShapesEdgeStyleImpl#getIndexLine <em>Index Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicalShapesEdgeStyleImpl extends MinimalEObjectImpl.Container implements GraphicalShapesEdgeStyle {
	/**
	 * The cached value of the '{@link #getSequenceNodeShapes() <em>Sequence Node Shapes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNodeShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> sequenceNodeShapes;

	/**
	 * The default value of the '{@link #getIndexNodeShape() <em>Index Node Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexNodeShape()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_NODE_SHAPE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndexNodeShape() <em>Index Node Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexNodeShape()
	 * @generated
	 * @ordered
	 */
	protected int indexNodeShape = INDEX_NODE_SHAPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSequenceLine() <em>Sequence Line</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sequenceLine;

	/**
	 * The cached value of the '{@link #getSequenceColor() <em>Sequence Color</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceColor()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sequenceColor;

	/**
	 * The default value of the '{@link #getIndexColor() <em>Index Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexColor()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_COLOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndexColor() <em>Index Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexColor()
	 * @generated
	 * @ordered
	 */
	protected int indexColor = INDEX_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexLine() <em>Index Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexLine()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_LINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndexLine() <em>Index Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexLine()
	 * @generated
	 * @ordered
	 */
	protected int indexLine = INDEX_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected GraphicalShapesEdgeStyleImpl() {
		super();
		//Shapes
		this.sequenceNodeShapes = new BasicEList<Shape>();
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createEllipse());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createRectangle());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createDiamond());
		this.sequenceNodeShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createNote());
		Collections.shuffle(this.sequenceNodeShapes);
		this.indexNodeShape = 0;
		
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
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DslHeuristicVisualizationPackage.Literals.GRAPHICAL_SHAPES_EDGE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shape> getSequenceNodeShapes() {
		if (sequenceNodeShapes == null) {
			sequenceNodeShapes = new EObjectResolvingEList<Shape>(Shape.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_NODE_SHAPES);
		}
		return sequenceNodeShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndexNodeShape() {
		return indexNodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexNodeShape(int newIndexNodeShape) {
		int oldIndexNodeShape = indexNodeShape;
		indexNodeShape = newIndexNodeShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_NODE_SHAPE, oldIndexNodeShape, indexNodeShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSequenceLine() {
		if (sequenceLine == null) {
			sequenceLine = new EDataTypeUniqueEList<Integer>(Integer.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_LINE);
		}
		return sequenceLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSequenceColor() {
		if (sequenceColor == null) {
			sequenceColor = new EDataTypeUniqueEList<Integer>(Integer.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_COLOR);
		}
		return sequenceColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndexColor() {
		return indexColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexColor(int newIndexColor) {
		int oldIndexColor = indexColor;
		indexColor = newIndexColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_COLOR, oldIndexColor, indexColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndexLine() {
		return indexLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexLine(int newIndexLine) {
		int oldIndexLine = indexLine;
		indexLine = newIndexLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_LINE, oldIndexLine, indexLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SiriusSystemColors getCompartmentColor() {
		
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCompartmentLine() {
		//Line Style
		if (getIndexLine() >= this.sequenceLine.size()) {
			setIndexLine(0);
			Collections.shuffle(this.sequenceLine);
		}		
		String lineStyle = LineStyle.get(sequenceLine.get(getIndexLine())).getName();
		setIndexLine(getIndexLine() + 1);
				
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Shape getNodeShape(Node node, String folderPath, String platformPath) {
		
		if (getIndexNodeShape() >= getSequenceNodeShapes().size()) {
			setIndexNodeShape(0);
			Collections.shuffle(this.sequenceNodeShapes);
		}
		
		Shape shape = EcoreUtil.copy(getSequenceNodeShapes().get(getIndexNodeShape()));
		setIndexNodeShape(getIndexNodeShape() + 1);
		
		if (shape instanceof Ellipse) {
			Ellipse ellipse = (Ellipse) shape;
			ellipse.setBorderColor(getCompartmentColor());
			ellipse.setColor(getCompartmentColor());
			ellipse.setBorderStyle(getCompartmentLine());
		} else if (shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.setBorderColor(getCompartmentColor());
			rectangle.setColor(getCompartmentColor());
			rectangle.setBorderStyle(getCompartmentLine());			
		} else if (shape instanceof Diamond) {
			Diamond diamond = (Diamond) shape;
			diamond.setBorderColor(getCompartmentColor());
			diamond.setColor(getCompartmentColor());
			diamond.setBorderStyle(getCompartmentLine());			
		} else if (shape instanceof Note) {
			Note note = (Note) shape;
			note.setBorderColor(getCompartmentColor());
			note.setColor(getCompartmentColor());
			note.setBorderStyle(getCompartmentLine());
		}		
		
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_NODE_SHAPES:
				return getSequenceNodeShapes();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_NODE_SHAPE:
				return getIndexNodeShape();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_LINE:
				return getSequenceLine();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_COLOR:
				return getSequenceColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_COLOR:
				return getIndexColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_LINE:
				return getIndexLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_NODE_SHAPES:
				getSequenceNodeShapes().clear();
				getSequenceNodeShapes().addAll((Collection<? extends Shape>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_NODE_SHAPE:
				setIndexNodeShape((Integer)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_LINE:
				getSequenceLine().clear();
				getSequenceLine().addAll((Collection<? extends Integer>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_COLOR:
				getSequenceColor().clear();
				getSequenceColor().addAll((Collection<? extends Integer>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_COLOR:
				setIndexColor((Integer)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_LINE:
				setIndexLine((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_NODE_SHAPES:
				getSequenceNodeShapes().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_NODE_SHAPE:
				setIndexNodeShape(INDEX_NODE_SHAPE_EDEFAULT);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_LINE:
				getSequenceLine().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_COLOR:
				getSequenceColor().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_COLOR:
				setIndexColor(INDEX_COLOR_EDEFAULT);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_LINE:
				setIndexLine(INDEX_LINE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_NODE_SHAPES:
				return sequenceNodeShapes != null && !sequenceNodeShapes.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_NODE_SHAPE:
				return indexNodeShape != INDEX_NODE_SHAPE_EDEFAULT;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_LINE:
				return sequenceLine != null && !sequenceLine.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__SEQUENCE_COLOR:
				return sequenceColor != null && !sequenceColor.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_COLOR:
				return indexColor != INDEX_COLOR_EDEFAULT;
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE__INDEX_LINE:
				return indexLine != INDEX_LINE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE___GET_COMPARTMENT_COLOR:
				return getCompartmentColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE___GET_COMPARTMENT_LINE:
				return getCompartmentLine();
			case DslHeuristicVisualizationPackage.GRAPHICAL_SHAPES_EDGE_STYLE___GET_NODE_SHAPE__NODE_STRING_STRING:
				return getNodeShape((Node)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (indexNodeShape: ");
		result.append(indexNodeShape);
		result.append(", sequenceLine: ");
		result.append(sequenceLine);
		result.append(", sequenceColor: ");
		result.append(sequenceColor);
		result.append(", indexColor: ");
		result.append(indexColor);
		result.append(", indexLine: ");
		result.append(indexLine);
		result.append(')');
		return result.toString();
	}

} //GraphicalShapesEdgeStyleImpl
