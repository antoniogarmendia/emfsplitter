/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.GraphicalCompartmentStyle;

import graphic_representation.Shape;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.ShapeCompartmentParallelogram;
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
 * An implementation of the model object '<em><b>Graphical Compartment Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalCompartmentStyleImpl#getSequenceShapes <em>Sequence Shapes</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalCompartmentStyleImpl#getSequenceLine <em>Sequence Line</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalCompartmentStyleImpl#getSequenceColor <em>Sequence Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalCompartmentStyleImpl#getIndexShape <em>Index Shape</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalCompartmentStyleImpl#getIndexColor <em>Index Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalCompartmentStyleImpl#getIndexLine <em>Index Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicalCompartmentStyleImpl extends MinimalEObjectImpl.Container implements GraphicalCompartmentStyle {
	/**
	 * The cached value of the '{@link #getSequenceShapes() <em>Sequence Shapes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> sequenceShapes;
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
	 * The default value of the '{@link #getIndexShape() <em>Index Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexShape()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_SHAPE_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getIndexShape() <em>Index Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexShape()
	 * @generated
	 * @ordered
	 */
	protected int indexShape = INDEX_SHAPE_EDEFAULT;
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
	protected GraphicalCompartmentStyleImpl() {
		super();
		//Shapes
		this.sequenceShapes = new BasicEList<Shape>();
		this.sequenceShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentGradient());
		this.sequenceShapes.add(Graphic_representationFactoryImpl.eINSTANCE.createShapeCompartmentParallelogram());
		Collections.shuffle(this.sequenceShapes);
		this.indexShape = 0;
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
		return DslHeuristicVisualizationPackage.Literals.GRAPHICAL_COMPARTMENT_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shape> getSequenceShapes() {
		if (sequenceShapes == null) {
			sequenceShapes = new EObjectResolvingEList<Shape>(Shape.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_SHAPES);
		}
		return sequenceShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSequenceLine() {
		if (sequenceLine == null) {
			sequenceLine = new EDataTypeUniqueEList<Integer>(Integer.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_LINE);
		}
		return sequenceLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndexShape() {
		return indexShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexShape(int newIndexShape) {
		int oldIndexShape = indexShape;
		indexShape = newIndexShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_SHAPE, oldIndexShape, indexShape));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_COLOR, oldIndexColor, indexColor));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_LINE, oldIndexLine, indexLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSequenceColor() {
		if (sequenceColor == null) {
			sequenceColor = new EDataTypeUniqueEList<Integer>(Integer.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_COLOR);
		}
		return sequenceColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Shape getCompartmentShape() {
		
		if (getIndexShape() >= getSequenceShapes().size()) {
			setIndexShape(0);
			Collections.shuffle(sequenceShapes);
		}
		
		Shape shape = EcoreUtil.copy(getSequenceShapes().get(getIndexShape()));
		setIndexShape(getIndexShape() + 1);
		
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
		
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SiriusSystemColors getCompartmentColor() {
		
		SiriusSystemColors compartmentColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		
		//Color
		if (getIndexColor() >= this.sequenceColor.size()) {
			setIndexColor(0);
			Collections.shuffle(this.sequenceColor);
		}
		
		SystemColors[] systemColors = SystemColors.values();
		compartmentColor.setName(systemColors[sequenceColor.get(getIndexColor())].getName());
		setIndexColor(getIndexColor() + 1);
		
		return compartmentColor;
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
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_SHAPES:
				return getSequenceShapes();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_LINE:
				return getSequenceLine();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_COLOR:
				return getSequenceColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_SHAPE:
				return getIndexShape();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_COLOR:
				return getIndexColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_SHAPES:
				getSequenceShapes().clear();
				getSequenceShapes().addAll((Collection<? extends Shape>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_LINE:
				getSequenceLine().clear();
				getSequenceLine().addAll((Collection<? extends Integer>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_COLOR:
				getSequenceColor().clear();
				getSequenceColor().addAll((Collection<? extends Integer>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_SHAPE:
				setIndexShape((Integer)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_COLOR:
				setIndexColor((Integer)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_SHAPES:
				getSequenceShapes().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_LINE:
				getSequenceLine().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_COLOR:
				getSequenceColor().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_SHAPE:
				setIndexShape(INDEX_SHAPE_EDEFAULT);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_COLOR:
				setIndexColor(INDEX_COLOR_EDEFAULT);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_SHAPES:
				return sequenceShapes != null && !sequenceShapes.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_LINE:
				return sequenceLine != null && !sequenceLine.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__SEQUENCE_COLOR:
				return sequenceColor != null && !sequenceColor.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_SHAPE:
				return indexShape != INDEX_SHAPE_EDEFAULT;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_COLOR:
				return indexColor != INDEX_COLOR_EDEFAULT;
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE___GET_COMPARTMENT_SHAPE:
				return getCompartmentShape();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE___GET_COMPARTMENT_COLOR:
				return getCompartmentColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_COMPARTMENT_STYLE___GET_COMPARTMENT_LINE:
				return getCompartmentLine();
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
		result.append(" (sequenceLine: ");
		result.append(sequenceLine);
		result.append(", sequenceColor: ");
		result.append(sequenceColor);
		result.append(", indexShape: ");
		result.append(indexShape);
		result.append(", indexColor: ");
		result.append(indexColor);
		result.append(", indexLine: ");
		result.append(indexLine);
		result.append(')');
		return result.toString();
	}

} //GraphicalCompartmentStyleImpl
