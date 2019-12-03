/**
 */
package graphic_representation.rest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.rest.Search#getParameters <em>Parameters</em>}</li>
 *   <li>{@link graphic_representation.rest.Search#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link graphic_representation.rest.Search#getCandidateImages <em>Candidate Images</em>}</li>
 *   <li>{@link graphic_representation.rest.Search#getPlatformPath <em>Platform Path</em>}</li>
 *   <li>{@link graphic_representation.rest.Search#getFolderPath <em>Folder Path</em>}</li>
 * </ul>
 *
 * @see graphic_representation.rest.RestPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.rest.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see graphic_representation.rest.RestPackage#getSearch_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Name</em>' attribute.
	 * @see #setExtensionName(String)
	 * @see graphic_representation.rest.RestPackage#getSearch_ExtensionName()
	 * @model
	 * @generated
	 */
	String getExtensionName();

	/**
	 * Sets the value of the '{@link graphic_representation.rest.Search#getExtensionName <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Name</em>' attribute.
	 * @see #getExtensionName()
	 * @generated
	 */
	void setExtensionName(String value);

	/**
	 * Returns the value of the '<em><b>Candidate Images</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Candidate Images</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate Images</em>' attribute list.
	 * @see graphic_representation.rest.RestPackage#getSearch_CandidateImages()
	 * @model
	 * @generated
	 */
	EList<String> getCandidateImages();

	/**
	 * Returns the value of the '<em><b>Platform Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Path</em>' attribute.
	 * @see #setPlatformPath(String)
	 * @see graphic_representation.rest.RestPackage#getSearch_PlatformPath()
	 * @model
	 * @generated
	 */
	String getPlatformPath();

	/**
	 * Sets the value of the '{@link graphic_representation.rest.Search#getPlatformPath <em>Platform Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Path</em>' attribute.
	 * @see #getPlatformPath()
	 * @generated
	 */
	void setPlatformPath(String value);

	/**
	 * Returns the value of the '<em><b>Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Path</em>' attribute.
	 * @see #setFolderPath(String)
	 * @see graphic_representation.rest.RestPackage#getSearch_FolderPath()
	 * @model
	 * @generated
	 */
	String getFolderPath();

	/**
	 * Sets the value of the '{@link graphic_representation.rest.Search#getFolderPath <em>Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Path</em>' attribute.
	 * @see #getFolderPath()
	 * @generated
	 */
	void setFolderPath(String value);

} // Search
