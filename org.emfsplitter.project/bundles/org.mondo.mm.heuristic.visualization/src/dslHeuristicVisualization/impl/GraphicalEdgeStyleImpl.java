/**
 */
package dslHeuristicVisualization.impl;

import dslHeuristicVisualization.DslHeuristicVisualizationPackage;
import dslHeuristicVisualization.GraphicalEdgeStyle;

import graphic_representation.Edge_Style;
import graphic_representation.Graphic_representationFactory;
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
import org.eclipse.sirius.diagram.LineStyle;
import org.eclipse.sirius.viewpoint.description.SystemColors;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graphical Edge Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalEdgeStyleImpl#getSequenceColor <em>Sequence Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalEdgeStyleImpl#getIndexColor <em>Index Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalEdgeStyleImpl#getSequenceLine <em>Sequence Line</em>}</li>
 *   <li>{@link dslHeuristicVisualization.impl.GraphicalEdgeStyleImpl#getIndexLine <em>Index Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphicalEdgeStyleImpl extends MinimalEObjectImpl.Container implements GraphicalEdgeStyle {
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
	 * The cached value of the '{@link #getSequenceLine() <em>Sequence Line</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> sequenceLine;
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
	protected GraphicalEdgeStyleImpl() {
		super();
		Random random = new Random();
		
		//Color
		int maxRandomColor = SystemColors.values().length;
		Integer[] randomNumbers = random.ints(0, maxRandomColor).boxed().distinct().limit(maxRandomColor).toArray(Integer[]::new);
		this.sequenceColor = new BasicEList<Integer>(Arrays.asList(randomNumbers));
		indexColor = 0;
		
		//Line 
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
		return DslHeuristicVisualizationPackage.Literals.GRAPHICAL_EDGE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSequenceColor() {
		if (sequenceColor == null) {
			sequenceColor = new EDataTypeUniqueEList<Integer>(Integer.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_COLOR);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_COLOR, oldIndexColor, indexColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSequenceLine() {
		if (sequenceLine == null) {
			sequenceLine = new EDataTypeUniqueEList<Integer>(Integer.class, this, DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_LINE);
		}
		return sequenceLine;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_LINE, oldIndexLine, indexLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Edge_Style getEdgeStyle() {
		Edge_Style edgStyle = Graphic_representationFactory.eINSTANCE.createEdge_Style();
		
		// Edge Color		
		edgStyle.setColor(getEdgeColor());
		
		//Line Style
		edgStyle.setLineStyle(getEdgeLine());
				
		return edgStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getTargetDecorator() {		
		return "InputArrow";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSourceDecorator() {
		return "NoDecoration";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SiriusSystemColors getEdgeColor() {
		
		SiriusSystemColors edgeColor = Graphic_representationFactoryImpl.eINSTANCE.createSiriusSystemColors();
		//Color
		if (getIndexColor() >= this.sequenceColor.size()) {
			setIndexColor(0);
			Collections.shuffle(this.sequenceColor);
		}
		
		SystemColors[] systemColors = SystemColors.values();
		edgeColor.setName(systemColors[sequenceColor.get(getIndexColor())].getName());
		setIndexColor(getIndexColor() + 1);
		
		return edgeColor;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEdgeLine() {
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_COLOR:
				return getSequenceColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_COLOR:
				return getIndexColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_LINE:
				return getSequenceLine();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_COLOR:
				getSequenceColor().clear();
				getSequenceColor().addAll((Collection<? extends Integer>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_COLOR:
				setIndexColor((Integer)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_LINE:
				getSequenceLine().clear();
				getSequenceLine().addAll((Collection<? extends Integer>)newValue);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_COLOR:
				getSequenceColor().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_COLOR:
				setIndexColor(INDEX_COLOR_EDEFAULT);
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_LINE:
				getSequenceLine().clear();
				return;
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_COLOR:
				return sequenceColor != null && !sequenceColor.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_COLOR:
				return indexColor != INDEX_COLOR_EDEFAULT;
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__SEQUENCE_LINE:
				return sequenceLine != null && !sequenceLine.isEmpty();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE__INDEX_LINE:
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
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE___GET_EDGE_STYLE:
				return getEdgeStyle();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE___GET_TARGET_DECORATOR:
				return getTargetDecorator();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE___GET_SOURCE_DECORATOR:
				return getSourceDecorator();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE___GET_EDGE_COLOR:
				return getEdgeColor();
			case DslHeuristicVisualizationPackage.GRAPHICAL_EDGE_STYLE___GET_EDGE_LINE:
				return getEdgeLine();
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
		result.append(" (sequenceColor: ");
		result.append(sequenceColor);
		result.append(", indexColor: ");
		result.append(indexColor);
		result.append(", sequenceLine: ");
		result.append(sequenceLine);
		result.append(", indexLine: ");
		result.append(indexLine);
		result.append(')');
		return result.toString();
	}

} //GraphicalEdgeStyleImpl
