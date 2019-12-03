/**
 */
package graphic_representation;

import graphic_representation.rest.Search;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.IconElement#getFilepath <em>Filepath</em>}</li>
 *   <li>{@link graphic_representation.IconElement#getEmbeddedImage <em>Embedded Image</em>}</li>
 *   <li>{@link graphic_representation.IconElement#getFigureSearch <em>Figure Search</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getIconElement()
 * @model
 * @generated
 */
public interface IconElement extends Shape {
	/**
	 * Returns the value of the '<em><b>Filepath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filepath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filepath</em>' attribute.
	 * @see #setFilepath(String)
	 * @see graphic_representation.Graphic_representationPackage#getIconElement_Filepath()
	 * @model
	 * @generated
	 */
	String getFilepath();

	/**
	 * Sets the value of the '{@link graphic_representation.IconElement#getFilepath <em>Filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filepath</em>' attribute.
	 * @see #getFilepath()
	 * @generated
	 */
	void setFilepath(String value);

	/**
	 * Returns the value of the '<em><b>Embedded Image</b></em>' attribute.
	 * The default value is <code>"null"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded Image</em>' attribute.
	 * @see #setEmbeddedImage(String)
	 * @see graphic_representation.Graphic_representationPackage#getIconElement_EmbeddedImage()
	 * @model default="null"
	 * @generated
	 */
	String getEmbeddedImage();

	/**
	 * Sets the value of the '{@link graphic_representation.IconElement#getEmbeddedImage <em>Embedded Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded Image</em>' attribute.
	 * @see #getEmbeddedImage()
	 * @generated
	 */
	void setEmbeddedImage(String value);

	/**
	 * Returns the value of the '<em><b>Figure Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Figure Search</em>' containment reference.
	 * @see #setFigureSearch(Search)
	 * @see graphic_representation.Graphic_representationPackage#getIconElement_FigureSearch()
	 * @model containment="true"
	 * @generated
	 */
	Search getFigureSearch();

	/**
	 * Sets the value of the '{@link graphic_representation.IconElement#getFigureSearch <em>Figure Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Figure Search</em>' containment reference.
	 * @see #getFigureSearch()
	 * @generated
	 */
	void setFigureSearch(Search value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ImageBase64();

} // IconElement
