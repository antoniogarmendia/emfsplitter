/**
 */
package mondoSirius;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mondoSirius.MondoSiriusFactory
 * @model kind="package"
 * @generated
 */
public interface MondoSiriusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mondoSirius";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.import.mm.sirius";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mondoSirius";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MondoSiriusPackage eINSTANCE = mondoSirius.impl.MondoSiriusPackageImpl.init();

	/**
	 * The meta object id for the '{@link mondoSirius.impl.TestDiagramDescriptionImpl <em>Test Diagram Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mondoSirius.impl.TestDiagramDescriptionImpl
	 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestDiagramDescription()
	 * @generated
	 */
	int TEST_DIAGRAM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Diagram Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Test Diagram Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Diagram Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DIAGRAM_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mondoSirius.impl.TestTableEditionImpl <em>Test Table Edition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mondoSirius.impl.TestTableEditionImpl
	 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestTableEdition()
	 * @generated
	 */
	int TEST_TABLE_EDITION = 1;

	/**
	 * The feature id for the '<em><b>Edition Table Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Test Table Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Table Edition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_TABLE_EDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mondoSirius.impl.TestViewpointImpl <em>Test Viewpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mondoSirius.impl.TestViewpointImpl
	 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestViewpoint()
	 * @generated
	 */
	int TEST_VIEWPOINT = 2;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT__VIEWPOINT = 0;

	/**
	 * The number of structural features of the '<em>Test Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Viewpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_VIEWPOINT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link mondoSirius.TestDiagramDescription <em>Test Diagram Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Diagram Description</em>'.
	 * @see mondoSirius.TestDiagramDescription
	 * @generated
	 */
	EClass getTestDiagramDescription();

	/**
	 * Returns the meta object for the reference '{@link mondoSirius.TestDiagramDescription#getDiagramDescription <em>Diagram Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Description</em>'.
	 * @see mondoSirius.TestDiagramDescription#getDiagramDescription()
	 * @see #getTestDiagramDescription()
	 * @generated
	 */
	EReference getTestDiagramDescription_DiagramDescription();

	/**
	 * Returns the meta object for class '{@link mondoSirius.TestTableEdition <em>Test Table Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Table Edition</em>'.
	 * @see mondoSirius.TestTableEdition
	 * @generated
	 */
	EClass getTestTableEdition();

	/**
	 * Returns the meta object for the reference '{@link mondoSirius.TestTableEdition#getEditionTableDescription <em>Edition Table Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edition Table Description</em>'.
	 * @see mondoSirius.TestTableEdition#getEditionTableDescription()
	 * @see #getTestTableEdition()
	 * @generated
	 */
	EReference getTestTableEdition_EditionTableDescription();

	/**
	 * Returns the meta object for class '{@link mondoSirius.TestViewpoint <em>Test Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Viewpoint</em>'.
	 * @see mondoSirius.TestViewpoint
	 * @generated
	 */
	EClass getTestViewpoint();

	/**
	 * Returns the meta object for the reference '{@link mondoSirius.TestViewpoint#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Viewpoint</em>'.
	 * @see mondoSirius.TestViewpoint#getViewpoint()
	 * @see #getTestViewpoint()
	 * @generated
	 */
	EReference getTestViewpoint_Viewpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MondoSiriusFactory getMondoSiriusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mondoSirius.impl.TestDiagramDescriptionImpl <em>Test Diagram Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mondoSirius.impl.TestDiagramDescriptionImpl
		 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestDiagramDescription()
		 * @generated
		 */
		EClass TEST_DIAGRAM_DESCRIPTION = eINSTANCE.getTestDiagramDescription();

		/**
		 * The meta object literal for the '<em><b>Diagram Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION = eINSTANCE.getTestDiagramDescription_DiagramDescription();

		/**
		 * The meta object literal for the '{@link mondoSirius.impl.TestTableEditionImpl <em>Test Table Edition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mondoSirius.impl.TestTableEditionImpl
		 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestTableEdition()
		 * @generated
		 */
		EClass TEST_TABLE_EDITION = eINSTANCE.getTestTableEdition();

		/**
		 * The meta object literal for the '<em><b>Edition Table Description</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION = eINSTANCE.getTestTableEdition_EditionTableDescription();

		/**
		 * The meta object literal for the '{@link mondoSirius.impl.TestViewpointImpl <em>Test Viewpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mondoSirius.impl.TestViewpointImpl
		 * @see mondoSirius.impl.MondoSiriusPackageImpl#getTestViewpoint()
		 * @generated
		 */
		EClass TEST_VIEWPOINT = eINSTANCE.getTestViewpoint();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_VIEWPOINT__VIEWPOINT = eINSTANCE.getTestViewpoint_Viewpoint();

	}

} //MondoSiriusPackage
