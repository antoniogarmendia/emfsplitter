/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Shape#getLabelanEAttribute <em>Labelan EAttribute</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends EObject {

	/**
	 * Returns the value of the '<em><b>Labelan EAttribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labelan EAttribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labelan EAttribute</em>' containment reference.
	 * @see #setLabelanEAttribute(GeneralLabel)
	 * @see graphic_representation.Graphic_representationPackage#getShape_LabelanEAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeneralLabel getLabelanEAttribute();

	/**
	 * Sets the value of the '{@link graphic_representation.Shape#getLabelanEAttribute <em>Labelan EAttribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labelan EAttribute</em>' containment reference.
	 * @see #getLabelanEAttribute()
	 * @generated
	 */
	void setLabelanEAttribute(GeneralLabel value);
} // Shape
