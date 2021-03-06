/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.IconElement;
import graphic_representation.rest.Search;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.IconElementImpl#getFilepath <em>Filepath</em>}</li>
 *   <li>{@link graphic_representation.impl.IconElementImpl#getEmbeddedImage <em>Embedded Image</em>}</li>
 *   <li>{@link graphic_representation.impl.IconElementImpl#getFigureSearch <em>Figure Search</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IconElementImpl extends ShapeImpl implements IconElement {
	/**
	 * The default value of the '{@link #getFilepath() <em>Filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilepath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILEPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilepath() <em>Filepath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilepath()
	 * @generated
	 * @ordered
	 */
	protected String filepath = FILEPATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmbeddedImage() <em>Embedded Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedImage()
	 * @generated
	 * @ordered
	 */
	protected static final String EMBEDDED_IMAGE_EDEFAULT = "null";

	/**
	 * The cached value of the '{@link #getEmbeddedImage() <em>Embedded Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedImage()
	 * @generated
	 * @ordered
	 */
	protected String embeddedImage = EMBEDDED_IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFigureSearch() <em>Figure Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigureSearch()
	 * @generated
	 * @ordered
	 */
	protected Search figureSearch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.ICON_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilepath() {
		return filepath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilepath(String newFilepath) {
		String oldFilepath = filepath;
		filepath = newFilepath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ICON_ELEMENT__FILEPATH, oldFilepath, filepath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmbeddedImage() {
		return embeddedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddedImage(String newEmbeddedImage) {
		String oldEmbeddedImage = embeddedImage;
		embeddedImage = newEmbeddedImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ICON_ELEMENT__EMBEDDED_IMAGE, oldEmbeddedImage, embeddedImage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search getFigureSearch() {
		return figureSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFigureSearch(Search newFigureSearch, NotificationChain msgs) {
		Search oldFigureSearch = figureSearch;
		figureSearch = newFigureSearch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH, oldFigureSearch, newFigureSearch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigureSearch(Search newFigureSearch) {
		if (newFigureSearch != figureSearch) {
			NotificationChain msgs = null;
			if (figureSearch != null)
				msgs = ((InternalEObject)figureSearch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH, null, msgs);
			if (newFigureSearch != null)
				msgs = ((InternalEObject)newFigureSearch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH, null, msgs);
			msgs = basicSetFigureSearch(newFigureSearch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH, newFigureSearch, newFigureSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void ImageBase64() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		String pathWS = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
		File file = new File(pathWS + filepath);
		try {
			embeddedImage = Base64.encodeBase64String(FileUtils.readFileToByteArray(file));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH:
				return basicSetFigureSearch(null, msgs);
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
			case Graphic_representationPackage.ICON_ELEMENT__FILEPATH:
				return getFilepath();
			case Graphic_representationPackage.ICON_ELEMENT__EMBEDDED_IMAGE:
				return getEmbeddedImage();
			case Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH:
				return getFigureSearch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Graphic_representationPackage.ICON_ELEMENT__FILEPATH:
				setFilepath((String)newValue);
				return;
			case Graphic_representationPackage.ICON_ELEMENT__EMBEDDED_IMAGE:
				setEmbeddedImage((String)newValue);
				return;
			case Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH:
				setFigureSearch((Search)newValue);
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
			case Graphic_representationPackage.ICON_ELEMENT__FILEPATH:
				setFilepath(FILEPATH_EDEFAULT);
				return;
			case Graphic_representationPackage.ICON_ELEMENT__EMBEDDED_IMAGE:
				setEmbeddedImage(EMBEDDED_IMAGE_EDEFAULT);
				return;
			case Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH:
				setFigureSearch((Search)null);
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
			case Graphic_representationPackage.ICON_ELEMENT__FILEPATH:
				return FILEPATH_EDEFAULT == null ? filepath != null : !FILEPATH_EDEFAULT.equals(filepath);
			case Graphic_representationPackage.ICON_ELEMENT__EMBEDDED_IMAGE:
				return EMBEDDED_IMAGE_EDEFAULT == null ? embeddedImage != null : !EMBEDDED_IMAGE_EDEFAULT.equals(embeddedImage);
			case Graphic_representationPackage.ICON_ELEMENT__FIGURE_SEARCH:
				return figureSearch != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Graphic_representationPackage.ICON_ELEMENT___IMAGE_BASE64:
				ImageBase64();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (filepath: ");
		result.append(filepath);
		result.append(", embeddedImage: ");
		result.append(embeddedImage);
		result.append(')');
		return result.toString();
	}

} //IconElementImpl
