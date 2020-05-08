/**
 */
package mondoSirius;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Table Edition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mondoSirius.TestTableEdition#getEditionTableDescription <em>Edition Table Description</em>}</li>
 * </ul>
 *
 * @see mondoSirius.MondoSiriusPackage#getTestTableEdition()
 * @model
 * @generated
 */
public interface TestTableEdition extends EObject {
	/**
	 * Returns the value of the '<em><b>Edition Table Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition Table Description</em>' reference.
	 * @see #setEditionTableDescription(EditionTableDescription)
	 * @see mondoSirius.MondoSiriusPackage#getTestTableEdition_EditionTableDescription()
	 * @model
	 * @generated
	 */
	EditionTableDescription getEditionTableDescription();

	/**
	 * Sets the value of the '{@link mondoSirius.TestTableEdition#getEditionTableDescription <em>Edition Table Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition Table Description</em>' reference.
	 * @see #getEditionTableDescription()
	 * @generated
	 */
	void setEditionTableDescription(EditionTableDescription value);

} // TestTableEdition
