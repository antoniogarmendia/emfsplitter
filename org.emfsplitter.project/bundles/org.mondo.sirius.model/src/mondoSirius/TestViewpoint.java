/**
 */
package mondoSirius;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mondoSirius.TestViewpoint#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @see mondoSirius.MondoSiriusPackage#getTestViewpoint()
 * @model abstract="true"
 * @generated
 */
public interface TestViewpoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewpoint</em>' reference.
	 * @see #setViewpoint(Viewpoint)
	 * @see mondoSirius.MondoSiriusPackage#getTestViewpoint_Viewpoint()
	 * @model
	 * @generated
	 */
	Viewpoint getViewpoint();

	/**
	 * Sets the value of the '{@link mondoSirius.TestViewpoint#getViewpoint <em>Viewpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' reference.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(Viewpoint value);

} // TestViewpoint
