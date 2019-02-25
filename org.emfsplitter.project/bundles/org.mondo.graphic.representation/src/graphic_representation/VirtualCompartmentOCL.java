/**
 */
package graphic_representation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Compartment OCL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.VirtualCompartmentOCL#getOclExpression <em>Ocl Expression</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getVirtualCompartmentOCL()
 * @model
 * @generated
 */
public interface VirtualCompartmentOCL extends VirtualCompartment {
	/**
	 * Returns the value of the '<em><b>Ocl Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Expression</em>' attribute.
	 * @see #setOclExpression(String)
	 * @see graphic_representation.Graphic_representationPackage#getVirtualCompartmentOCL_OclExpression()
	 * @model
	 * @generated
	 */
	String getOclExpression();

	/**
	 * Sets the value of the '{@link graphic_representation.VirtualCompartmentOCL#getOclExpression <em>Ocl Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Expression</em>' attribute.
	 * @see #getOclExpression()
	 * @generated
	 */
	void setOclExpression(String value);

} // VirtualCompartmentOCL
