/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.CompartmentElement#getCompartmentView <em>Compartment View</em>}</li>
 *   <li>{@link graphic_representation.CompartmentElement#getRepresentationStyle <em>Representation Style</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement()
 * @model
 * @generated
 */
public interface CompartmentElement extends AffixedCompartmentElement {

	/**
	 * Returns the value of the '<em><b>Compartment View</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link graphic_representation.CompartmentView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment View</em>' attribute.
	 * @see graphic_representation.CompartmentView
	 * @see #setCompartmentView(CompartmentView)
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_CompartmentView()
	 * @model default="None"
	 * @generated
	 */
	CompartmentView getCompartmentView();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getCompartmentView <em>Compartment View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment View</em>' attribute.
	 * @see graphic_representation.CompartmentView
	 * @see #getCompartmentView()
	 * @generated
	 */
	void setCompartmentView(CompartmentView value);

	/**
	 * Returns the value of the '<em><b>Representation Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation Style</em>' containment reference.
	 * @see #setRepresentationStyle(RepresentationStyle)
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_RepresentationStyle()
	 * @model containment="true"
	 * @generated
	 */
	RepresentationStyle getRepresentationStyle();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getRepresentationStyle <em>Representation Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation Style</em>' containment reference.
	 * @see #getRepresentationStyle()
	 * @generated
	 */
	void setRepresentationStyle(RepresentationStyle value);
} // CompartmentElement
