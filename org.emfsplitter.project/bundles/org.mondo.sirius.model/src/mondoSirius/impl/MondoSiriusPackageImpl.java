/**
 */
package mondoSirius.impl;

import mondoSirius.MondoSiriusFactory;
import mondoSirius.MondoSiriusPackage;
import mondoSirius.TestDiagramDescription;
import mondoSirius.TestTableEdition;
import mondoSirius.TestViewpoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.sirius.diagram.DiagramPackage;

import org.eclipse.sirius.diagram.description.DescriptionPackage;

import org.eclipse.sirius.table.metamodel.table.TablePackage;

import org.eclipse.sirius.viewpoint.ViewpointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MondoSiriusPackageImpl extends EPackageImpl implements MondoSiriusPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testDiagramDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testTableEditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testViewpointEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mondoSirius.MondoSiriusPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MondoSiriusPackageImpl() {
		super(eNS_URI, MondoSiriusFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MondoSiriusPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MondoSiriusPackage init() {
		if (isInited) return (MondoSiriusPackage)EPackage.Registry.INSTANCE.getEPackage(MondoSiriusPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMondoSiriusPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MondoSiriusPackageImpl theMondoSiriusPackage = registeredMondoSiriusPackage instanceof MondoSiriusPackageImpl ? (MondoSiriusPackageImpl)registeredMondoSiriusPackage : new MondoSiriusPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DiagramPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();
		TablePackage.eINSTANCE.eClass();
		ViewpointPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMondoSiriusPackage.createPackageContents();

		// Initialize created meta-data
		theMondoSiriusPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMondoSiriusPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MondoSiriusPackage.eNS_URI, theMondoSiriusPackage);
		return theMondoSiriusPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestDiagramDescription() {
		return testDiagramDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestDiagramDescription_DiagramDescription() {
		return (EReference)testDiagramDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestTableEdition() {
		return testTableEditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestTableEdition_EditionTableDescription() {
		return (EReference)testTableEditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestViewpoint() {
		return testViewpointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTestViewpoint_Viewpoint() {
		return (EReference)testViewpointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MondoSiriusFactory getMondoSiriusFactory() {
		return (MondoSiriusFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testDiagramDescriptionEClass = createEClass(TEST_DIAGRAM_DESCRIPTION);
		createEReference(testDiagramDescriptionEClass, TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION);

		testTableEditionEClass = createEClass(TEST_TABLE_EDITION);
		createEReference(testTableEditionEClass, TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION);

		testViewpointEClass = createEClass(TEST_VIEWPOINT);
		createEReference(testViewpointEClass, TEST_VIEWPOINT__VIEWPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DescriptionPackage theDescriptionPackage = (DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI);
		org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage theDescriptionPackage_1 = (org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.sirius.table.metamodel.table.description.DescriptionPackage.eNS_URI);
		org.eclipse.sirius.viewpoint.description.DescriptionPackage theDescriptionPackage_2 = (org.eclipse.sirius.viewpoint.description.DescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(org.eclipse.sirius.viewpoint.description.DescriptionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(testDiagramDescriptionEClass, TestDiagramDescription.class, "TestDiagramDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestDiagramDescription_DiagramDescription(), theDescriptionPackage.getDiagramDescription(), null, "diagramDescription", null, 0, 1, TestDiagramDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testTableEditionEClass, TestTableEdition.class, "TestTableEdition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestTableEdition_EditionTableDescription(), theDescriptionPackage_1.getEditionTableDescription(), null, "editionTableDescription", null, 0, 1, TestTableEdition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testViewpointEClass, TestViewpoint.class, "TestViewpoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestViewpoint_Viewpoint(), theDescriptionPackage_2.getViewpoint(), null, "viewpoint", null, 0, 1, TestViewpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MondoSiriusPackageImpl
