/**
 */
package dslHeuristicVisualization;

import graphic_representation.Shape;
import graphic_representation.SiriusSystemColors;
import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Shapes Edge Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getSequenceNodeShapes <em>Sequence Node Shapes</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getIndexNodeShape <em>Index Node Shape</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getSequenceLine <em>Sequence Line</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getSequenceColor <em>Sequence Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getIndexColor <em>Index Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getIndexLine <em>Index Line</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalShapesEdgeStyle()
 * @model
 * @generated
 */
public interface GraphicalShapesEdgeStyle extends StrategyGraphicalStyle {

	/**
	 * Returns the value of the '<em><b>Sequence Node Shapes</b></em>' reference list.
	 * The list contents are of type {@link graphic_representation.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Node Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Node Shapes</em>' reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalShapesEdgeStyle_SequenceNodeShapes()
	 * @model
	 * @generated
	 */
	EList<Shape> getSequenceNodeShapes();

	/**
	 * Returns the value of the '<em><b>Index Node Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Node Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Node Shape</em>' attribute.
	 * @see #setIndexNodeShape(int)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalShapesEdgeStyle_IndexNodeShape()
	 * @model
	 * @generated
	 */
	int getIndexNodeShape();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getIndexNodeShape <em>Index Node Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Node Shape</em>' attribute.
	 * @see #getIndexNodeShape()
	 * @generated
	 */
	void setIndexNodeShape(int value);

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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalShapesEdgeStyle_SequenceLine()
	 * @model
	 * @generated
	 */
	EList<Integer> getSequenceLine();

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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalShapesEdgeStyle_SequenceColor()
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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalShapesEdgeStyle_IndexColor()
	 * @model
	 * @generated
	 */
	int getIndexColor();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getIndexColor <em>Index Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Color</em>' attribute.
	 * @see #getIndexColor()
	 * @generated
	 */
	void setIndexColor(int value);

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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalShapesEdgeStyle_IndexLine()
	 * @model
	 * @generated
	 */
	int getIndexLine();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalShapesEdgeStyle#getIndexLine <em>Index Line</em>}' attribute.
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
	SiriusSystemColors getCompartmentColor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getCompartmentLine();
} // GraphicalShapesEdgeStyle
