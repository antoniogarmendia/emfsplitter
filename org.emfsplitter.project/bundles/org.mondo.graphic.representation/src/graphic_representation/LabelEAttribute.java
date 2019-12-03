/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.LabelEAttribute#getLabelAttributes <em>Label Attributes</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getLabelEAttribute()
 * @model
 * @generated
 */
public interface LabelEAttribute extends GeneralLabel {
	/**
	 * Returns the value of the '<em><b>Label Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.WEAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Attributes</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getLabelEAttribute_LabelAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<WEAttribute> getLabelAttributes();

} // LabelEAttribute
