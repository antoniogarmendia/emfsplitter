/**
 */
package mondoSirius;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mondoSirius.MondoSiriusPackage
 * @generated
 */
public interface MondoSiriusFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MondoSiriusFactory eINSTANCE = mondoSirius.impl.MondoSiriusFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Table Edition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Table Edition</em>'.
	 * @generated
	 */
	TestTableEdition createTestTableEdition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MondoSiriusPackage getMondoSiriusPackage();

} //MondoSiriusFactory
