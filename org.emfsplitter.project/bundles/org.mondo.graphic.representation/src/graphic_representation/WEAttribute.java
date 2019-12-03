/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WE Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.WEAttribute#getEAttribute <em>EAttribute</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getWEAttribute()
 * @model
 * @generated
 */
public interface WEAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>EAttribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EAttribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EAttribute</em>' reference.
	 * @see #setEAttribute(EAttribute)
	 * @see graphic_representation.Graphic_representationPackage#getWEAttribute_EAttribute()
	 * @model required="true"
	 * @generated
	 */
	EAttribute getEAttribute();

	/**
	 * Sets the value of the '{@link graphic_representation.WEAttribute#getEAttribute <em>EAttribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EAttribute</em>' reference.
	 * @see #getEAttribute()
	 * @generated
	 */
	void setEAttribute(EAttribute value);

} // WEAttribute
