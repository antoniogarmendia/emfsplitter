/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.GeneralLabel#getLabelAligment <em>Label Aligment</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getGeneralLabel()
 * @model
 * @generated
 */
public interface GeneralLabel extends ShapeColor, GRLabelStyleDescription {

	/**
	 * Returns the value of the '<em><b>Label Aligment</b></em>' attribute.
	 * The literals are from the enumeration {@link graphic_representation.LabelAligment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Aligment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Aligment</em>' attribute.
	 * @see graphic_representation.LabelAligment
	 * @see #setLabelAligment(LabelAligment)
	 * @see graphic_representation.Graphic_representationPackage#getGeneralLabel_LabelAligment()
	 * @model
	 * @generated
	 */
	LabelAligment getLabelAligment();

	/**
	 * Sets the value of the '{@link graphic_representation.GeneralLabel#getLabelAligment <em>Label Aligment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Aligment</em>' attribute.
	 * @see graphic_representation.LabelAligment
	 * @see #getLabelAligment()
	 * @generated
	 */
	void setLabelAligment(LabelAligment value);
} // GeneralLabel
