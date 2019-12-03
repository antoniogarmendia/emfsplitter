/**
 */
package dslHeuristicVisualization;

import graphic_representation.Shape;

import graphic_representation.SiriusSystemColors;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphical Compartment Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getSequenceShapes <em>Sequence Shapes</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getSequenceLine <em>Sequence Line</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getSequenceColor <em>Sequence Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getIndexShape <em>Index Shape</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getIndexColor <em>Index Color</em>}</li>
 *   <li>{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getIndexLine <em>Index Line</em>}</li>
 * </ul>
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalCompartmentStyle()
 * @model
 * @generated
 */
public interface GraphicalCompartmentStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequence Shapes</b></em>' reference list.
	 * The list contents are of type {@link graphic_representation.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Shapes</em>' reference list.
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalCompartmentStyle_SequenceShapes()
	 * @model
	 * @generated
	 */
	EList<Shape> getSequenceShapes();

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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalCompartmentStyle_SequenceLine()
	 * @model
	 * @generated
	 */
	EList<Integer> getSequenceLine();

	/**
	 * Returns the value of the '<em><b>Index Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Shape</em>' attribute.
	 * @see #setIndexShape(int)
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalCompartmentStyle_IndexShape()
	 * @model
	 * @generated
	 */
	int getIndexShape();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getIndexShape <em>Index Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Shape</em>' attribute.
	 * @see #getIndexShape()
	 * @generated
	 */
	void setIndexShape(int value);

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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalCompartmentStyle_IndexColor()
	 * @model
	 * @generated
	 */
	int getIndexColor();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getIndexColor <em>Index Color</em>}' attribute.
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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalCompartmentStyle_IndexLine()
	 * @model
	 * @generated
	 */
	int getIndexLine();

	/**
	 * Sets the value of the '{@link dslHeuristicVisualization.GraphicalCompartmentStyle#getIndexLine <em>Index Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Line</em>' attribute.
	 * @see #getIndexLine()
	 * @generated
	 */
	void setIndexLine(int value);

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
	 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getGraphicalCompartmentStyle_SequenceColor()
	 * @model
	 * @generated
	 */
	EList<Integer> getSequenceColor();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Shape getCompartmentShape();

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

} // GraphicalCompartmentStyle
