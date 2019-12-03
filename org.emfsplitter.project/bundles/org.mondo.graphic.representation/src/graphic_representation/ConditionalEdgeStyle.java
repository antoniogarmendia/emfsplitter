/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Edge Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.ConditionalEdgeStyle#getConditionalOCL <em>Conditional OCL</em>}</li>
 *   <li>{@link graphic_representation.ConditionalEdgeStyle#getConditionalEdge <em>Conditional Edge</em>}</li>
 *   <li>{@link graphic_representation.ConditionalEdgeStyle#getGeneralLabel <em>General Label</em>}</li>
 *   <li>{@link graphic_representation.ConditionalEdgeStyle#getDecoratorSource <em>Decorator Source</em>}</li>
 *   <li>{@link graphic_representation.ConditionalEdgeStyle#getDecoratorTarget <em>Decorator Target</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getConditionalEdgeStyle()
 * @model
 * @generated
 */
public interface ConditionalEdgeStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Conditional OCL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional OCL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional OCL</em>' attribute.
	 * @see #setConditionalOCL(String)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalEdgeStyle_ConditionalOCL()
	 * @model
	 * @generated
	 */
	String getConditionalOCL();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalEdgeStyle#getConditionalOCL <em>Conditional OCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional OCL</em>' attribute.
	 * @see #getConditionalOCL()
	 * @generated
	 */
	void setConditionalOCL(String value);

	/**
	 * Returns the value of the '<em><b>Conditional Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Edge</em>' containment reference.
	 * @see #setConditionalEdge(Edge_Style)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalEdgeStyle_ConditionalEdge()
	 * @model containment="true"
	 * @generated
	 */
	Edge_Style getConditionalEdge();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalEdgeStyle#getConditionalEdge <em>Conditional Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Edge</em>' containment reference.
	 * @see #getConditionalEdge()
	 * @generated
	 */
	void setConditionalEdge(Edge_Style value);

	/**
	 * Returns the value of the '<em><b>General Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Label</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Label</em>' containment reference.
	 * @see #setGeneralLabel(GeneralLabel)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalEdgeStyle_GeneralLabel()
	 * @model containment="true"
	 * @generated
	 */
	GeneralLabel getGeneralLabel();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalEdgeStyle#getGeneralLabel <em>General Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Label</em>' containment reference.
	 * @see #getGeneralLabel()
	 * @generated
	 */
	void setGeneralLabel(GeneralLabel value);

	/**
	 * Returns the value of the '<em><b>Decorator Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorator Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator Source</em>' containment reference.
	 * @see #setDecoratorSource(EdgeDecorator)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalEdgeStyle_DecoratorSource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EdgeDecorator getDecoratorSource();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalEdgeStyle#getDecoratorSource <em>Decorator Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator Source</em>' containment reference.
	 * @see #getDecoratorSource()
	 * @generated
	 */
	void setDecoratorSource(EdgeDecorator value);

	/**
	 * Returns the value of the '<em><b>Decorator Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorator Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator Target</em>' containment reference.
	 * @see #setDecoratorTarget(EdgeDecorator)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalEdgeStyle_DecoratorTarget()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EdgeDecorator getDecoratorTarget();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalEdgeStyle#getDecoratorTarget <em>Decorator Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator Target</em>' containment reference.
	 * @see #getDecoratorTarget()
	 * @generated
	 */
	void setDecoratorTarget(EdgeDecorator value);

} // ConditionalEdgeStyle
