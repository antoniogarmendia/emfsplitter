/**
 */
package dslHeuristicVisualization;

import graphic_representation.Edge_Style;
import graphic_representation.SiriusSystemColors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Edge Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.GraphicalEdgeStyle#getSequenceColor <em>Sequence Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalEdgeStyle#getIndexColor <em>Index Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalEdgeStyle#getSequenceLine <em>Sequence Line</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalEdgeStyle#getIndexLine <em>Index Line</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalEdgeStyle()
 * @model
 * @generated
 */
public interface GraphicalEdgeStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Color</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Color</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Color</em>' attribute list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalEdgeStyle_SequenceColor()
	 * @model
	 * @generated
	 */
	EList<Integer> getSequenceColor();

	/**
	 * Returns the value of the '<em><b>Index Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Color</em>' attribute.
	 * @see #setIndexColor(int)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalEdgeStyle_IndexColor()
	 * @model
	 * @generated
	 */
	int getIndexColor();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalEdgeStyle#getIndexColor <em>Index Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Color</em>' attribute.
	 * @see #getIndexColor()
	 * @generated
	 */
	void setIndexColor(int value);

	/**
	 * Returns the value of the '<em><b>Sequence Line</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Line</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Line</em>' attribute list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalEdgeStyle_SequenceLine()
	 * @model
	 * @generated
	 */
	EList<Integer> getSequenceLine();

	/**
	 * Returns the value of the '<em><b>Index Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Line</em>' attribute.
	 * @see #setIndexLine(int)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalEdgeStyle_IndexLine()
	 * @model
	 * @generated
	 */
	int getIndexLine();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalEdgeStyle#getIndexLine <em>Index Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Line</em>' attribute.
	 * @see #getIndexLine()
	 * @generated
	 */
	void setIndexLine(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Edge_Style getEdgeStyle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTargetDecorator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSourceDecorator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SiriusSystemColors getEdgeColor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getEdgeLine();

} // GraphicalEdgeStyle
