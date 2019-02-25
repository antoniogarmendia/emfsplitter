/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.CompartmentEdge#getEdge_style <em>Edge style</em>}</li>
 *   <li>{@link graphic_representation.CompartmentEdge#getSource <em>Source</em>}</li>
 *   <li>{@link graphic_representation.CompartmentEdge#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getCompartmentEdge()
 * @model
 * @generated
 */
public interface CompartmentEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>Edge style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge style</em>' containment reference.
	 * @see #setEdge_style(Edge_Style)
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentEdge_Edge_style()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Edge_Style getEdge_style();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentEdge#getEdge_style <em>Edge style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge style</em>' containment reference.
	 * @see #getEdge_style()
	 * @generated
	 */
	void setEdge_style(Edge_Style value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(CompartmentLink)
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentEdge_Source()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentLink getSource();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentEdge#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(CompartmentLink value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(CompartmentLink)
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentEdge_Target()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentLink getTarget();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentEdge#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(CompartmentLink value);

} // CompartmentEdge
