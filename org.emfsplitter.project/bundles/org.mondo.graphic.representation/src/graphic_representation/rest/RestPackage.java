/**
 */
package graphic_representation.rest;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see graphic_representation.rest.RestFactory
 * @model kind="package"
 * @generated
 */
public interface RestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rest";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mondo.org/graphic_representation/rest/1.0.3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rest";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestPackage eINSTANCE = graphic_representation.rest.impl.RestPackageImpl.init();

	/**
	 * The meta object id for the '{@link graphic_representation.rest.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.rest.impl.SearchImpl
	 * @see graphic_representation.rest.impl.RestPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__EXTENSION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Candidate Images</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__CANDIDATE_IMAGES = 2;

	/**
	 * The feature id for the '<em><b>Platform Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__PLATFORM_PATH = 3;

	/**
	 * The feature id for the '<em><b>Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__FOLDER_PATH = 4;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link graphic_representation.rest.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graphic_representation.rest.impl.ParameterImpl
	 * @see graphic_representation.rest.impl.RestPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Parameter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Accepted Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ACCEPTED_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link graphic_representation.rest.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see graphic_representation.rest.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the containment reference list '{@link graphic_representation.rest.Search#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see graphic_representation.rest.Search#getParameters()
	 * @see #getSearch()
	 * @generated
	 */
	EReference getSearch_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.rest.Search#getExtensionName <em>Extension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Name</em>'.
	 * @see graphic_representation.rest.Search#getExtensionName()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_ExtensionName();

	/**
	 * Returns the meta object for the attribute list '{@link graphic_representation.rest.Search#getCandidateImages <em>Candidate Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Candidate Images</em>'.
	 * @see graphic_representation.rest.Search#getCandidateImages()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_CandidateImages();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.rest.Search#getPlatformPath <em>Platform Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Path</em>'.
	 * @see graphic_representation.rest.Search#getPlatformPath()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_PlatformPath();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.rest.Search#getFolderPath <em>Folder Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Path</em>'.
	 * @see graphic_representation.rest.Search#getFolderPath()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_FolderPath();

	/**
	 * Returns the meta object for class '{@link graphic_representation.rest.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see graphic_representation.rest.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.rest.Parameter#getParameterName <em>Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Name</em>'.
	 * @see graphic_representation.rest.Parameter#getParameterName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterName();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.rest.Parameter#getParameterValue <em>Parameter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Value</em>'.
	 * @see graphic_representation.rest.Parameter#getParameterValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_ParameterValue();

	/**
	 * Returns the meta object for the attribute list '{@link graphic_representation.rest.Parameter#getAcceptedValues <em>Accepted Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accepted Values</em>'.
	 * @see graphic_representation.rest.Parameter#getAcceptedValues()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_AcceptedValues();

	/**
	 * Returns the meta object for the attribute '{@link graphic_representation.rest.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see graphic_representation.rest.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestFactory getRestFactory();

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
		 * The meta object literal for the '{@link graphic_representation.rest.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.rest.impl.SearchImpl
		 * @see graphic_representation.rest.impl.RestPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH__PARAMETERS = eINSTANCE.getSearch_Parameters();

		/**
		 * The meta object literal for the '<em><b>Extension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__EXTENSION_NAME = eINSTANCE.getSearch_ExtensionName();

		/**
		 * The meta object literal for the '<em><b>Candidate Images</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__CANDIDATE_IMAGES = eINSTANCE.getSearch_CandidateImages();

		/**
		 * The meta object literal for the '<em><b>Platform Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__PLATFORM_PATH = eINSTANCE.getSearch_PlatformPath();

		/**
		 * The meta object literal for the '<em><b>Folder Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__FOLDER_PATH = eINSTANCE.getSearch_FolderPath();

		/**
		 * The meta object literal for the '{@link graphic_representation.rest.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graphic_representation.rest.impl.ParameterImpl
		 * @see graphic_representation.rest.impl.RestPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

		/**
		 * The meta object literal for the '<em><b>Parameter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PARAMETER_VALUE = eINSTANCE.getParameter_ParameterValue();

		/**
		 * The meta object literal for the '<em><b>Accepted Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__ACCEPTED_VALUES = eINSTANCE.getParameter_AcceptedValues();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

	}

} //RestPackage
