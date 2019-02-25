/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Compartment Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.VirtualCompartmentReference#getContainerReference <em>Container Reference</em>}</li>
 *   <li>{@link graphic_representation.VirtualCompartmentReference#getVirtualReference <em>Virtual Reference</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getVirtualCompartmentReference()
 * @model
 * @generated
 */
public interface VirtualCompartmentReference extends VirtualCompartment {
	/**
	 * Returns the value of the '<em><b>Container Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Reference</em>' reference.
	 * @see #setContainerReference(EReference)
	 * @see graphic_representation.Graphic_representationPackage#getVirtualCompartmentReference_ContainerReference()
	 * @model
	 * @generated
	 */
	EReference getContainerReference();

	/**
	 * Sets the value of the '{@link graphic_representation.VirtualCompartmentReference#getContainerReference <em>Container Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Reference</em>' reference.
	 * @see #getContainerReference()
	 * @generated
	 */
	void setContainerReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Virtual Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Reference</em>' reference.
	 * @see #setVirtualReference(EReference)
	 * @see graphic_representation.Graphic_representationPackage#getVirtualCompartmentReference_VirtualReference()
	 * @model
	 * @generated
	 */
	EReference getVirtualReference();

	/**
	 * Sets the value of the '{@link graphic_representation.VirtualCompartmentReference#getVirtualReference <em>Virtual Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Reference</em>' reference.
	 * @see #getVirtualReference()
	 * @generated
	 */
	void setVirtualReference(EReference value);

} // VirtualCompartmentReference
