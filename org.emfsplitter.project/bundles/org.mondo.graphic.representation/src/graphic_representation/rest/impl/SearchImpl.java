/**
 */
package graphic_representation.rest.impl;

import graphic_representation.rest.Parameter;
import graphic_representation.rest.RestPackage;
import graphic_representation.rest.Search;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.rest.impl.SearchImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link graphic_representation.rest.impl.SearchImpl#getExtensionName <em>Extension Name</em>}</li>
 *   <li>{@link graphic_representation.rest.impl.SearchImpl#getCandidateImages <em>Candidate Images</em>}</li>
 *   <li>{@link graphic_representation.rest.impl.SearchImpl#getPlatformPath <em>Platform Path</em>}</li>
 *   <li>{@link graphic_representation.rest.impl.SearchImpl#getFolderPath <em>Folder Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchImpl extends MinimalEObjectImpl.Container implements Search {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The default value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getExtensionName() <em>Extension Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionName()
	 * @generated
	 * @ordered
	 */
	protected String extensionName = EXTENSION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCandidateImages() <em>Candidate Images</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidateImages()
	 * @generated
	 * @ordered
	 */
	protected EList<String> candidateImages;

	/**
	 * The default value of the '{@link #getPlatformPath() <em>Platform Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatformPath() <em>Platform Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatformPath()
	 * @generated
	 * @ordered
	 */
	protected String platformPath = PLATFORM_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFolderPath() <em>Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLDER_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFolderPath() <em>Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderPath()
	 * @generated
	 * @ordered
	 */
	protected String folderPath = FOLDER_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestPackage.Literals.SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, RestPackage.SEARCH__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtensionName() {
		return extensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionName(String newExtensionName) {
		String oldExtensionName = extensionName;
		extensionName = newExtensionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.SEARCH__EXTENSION_NAME, oldExtensionName, extensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCandidateImages() {
		if (candidateImages == null) {
			candidateImages = new EDataTypeUniqueEList<String>(String.class, this, RestPackage.SEARCH__CANDIDATE_IMAGES);
		}
		return candidateImages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlatformPath() {
		return platformPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlatformPath(String newPlatformPath) {
		String oldPlatformPath = platformPath;
		platformPath = newPlatformPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.SEARCH__PLATFORM_PATH, oldPlatformPath, platformPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFolderPath() {
		return folderPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolderPath(String newFolderPath) {
		String oldFolderPath = folderPath;
		folderPath = newFolderPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestPackage.SEARCH__FOLDER_PATH, oldFolderPath, folderPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RestPackage.SEARCH__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestPackage.SEARCH__PARAMETERS:
				return getParameters();
			case RestPackage.SEARCH__EXTENSION_NAME:
				return getExtensionName();
			case RestPackage.SEARCH__CANDIDATE_IMAGES:
				return getCandidateImages();
			case RestPackage.SEARCH__PLATFORM_PATH:
				return getPlatformPath();
			case RestPackage.SEARCH__FOLDER_PATH:
				return getFolderPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestPackage.SEARCH__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case RestPackage.SEARCH__EXTENSION_NAME:
				setExtensionName((String)newValue);
				return;
			case RestPackage.SEARCH__CANDIDATE_IMAGES:
				getCandidateImages().clear();
				getCandidateImages().addAll((Collection<? extends String>)newValue);
				return;
			case RestPackage.SEARCH__PLATFORM_PATH:
				setPlatformPath((String)newValue);
				return;
			case RestPackage.SEARCH__FOLDER_PATH:
				setFolderPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestPackage.SEARCH__PARAMETERS:
				getParameters().clear();
				return;
			case RestPackage.SEARCH__EXTENSION_NAME:
				setExtensionName(EXTENSION_NAME_EDEFAULT);
				return;
			case RestPackage.SEARCH__CANDIDATE_IMAGES:
				getCandidateImages().clear();
				return;
			case RestPackage.SEARCH__PLATFORM_PATH:
				setPlatformPath(PLATFORM_PATH_EDEFAULT);
				return;
			case RestPackage.SEARCH__FOLDER_PATH:
				setFolderPath(FOLDER_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestPackage.SEARCH__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RestPackage.SEARCH__EXTENSION_NAME:
				return EXTENSION_NAME_EDEFAULT == null ? extensionName != null : !EXTENSION_NAME_EDEFAULT.equals(extensionName);
			case RestPackage.SEARCH__CANDIDATE_IMAGES:
				return candidateImages != null && !candidateImages.isEmpty();
			case RestPackage.SEARCH__PLATFORM_PATH:
				return PLATFORM_PATH_EDEFAULT == null ? platformPath != null : !PLATFORM_PATH_EDEFAULT.equals(platformPath);
			case RestPackage.SEARCH__FOLDER_PATH:
				return FOLDER_PATH_EDEFAULT == null ? folderPath != null : !FOLDER_PATH_EDEFAULT.equals(folderPath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extensionName: ");
		result.append(extensionName);
		result.append(", candidateImages: ");
		result.append(candidateImages);
		result.append(", platformPath: ");
		result.append(platformPath);
		result.append(", folderPath: ");
		result.append(folderPath);
		result.append(')');
		return result.toString();
	}

} //SearchImpl
