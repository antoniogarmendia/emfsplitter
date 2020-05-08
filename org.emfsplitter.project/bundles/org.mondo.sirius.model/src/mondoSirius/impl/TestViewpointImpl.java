/**
 */
package mondoSirius.impl;

import mondoSirius.MondoSiriusPackage;
import mondoSirius.TestViewpoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Viewpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mondoSirius.impl.TestViewpointImpl#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TestViewpointImpl extends MinimalEObjectImpl.Container implements TestViewpoint {
	/**
	 * The cached value of the '{@link #getViewpoint() <em>Viewpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewpoint()
	 * @generated
	 * @ordered
	 */
	protected Viewpoint viewpoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestViewpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MondoSiriusPackage.Literals.TEST_VIEWPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Viewpoint getViewpoint() {
		if (viewpoint != null && viewpoint.eIsProxy()) {
			InternalEObject oldViewpoint = (InternalEObject)viewpoint;
			viewpoint = (Viewpoint)eResolveProxy(oldViewpoint);
			if (viewpoint != oldViewpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MondoSiriusPackage.TEST_VIEWPOINT__VIEWPOINT, oldViewpoint, viewpoint));
			}
		}
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viewpoint basicGetViewpoint() {
		return viewpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setViewpoint(Viewpoint newViewpoint) {
		Viewpoint oldViewpoint = viewpoint;
		viewpoint = newViewpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MondoSiriusPackage.TEST_VIEWPOINT__VIEWPOINT, oldViewpoint, viewpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MondoSiriusPackage.TEST_VIEWPOINT__VIEWPOINT:
				if (resolve) return getViewpoint();
				return basicGetViewpoint();
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
			case MondoSiriusPackage.TEST_VIEWPOINT__VIEWPOINT:
				setViewpoint((Viewpoint)newValue);
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
			case MondoSiriusPackage.TEST_VIEWPOINT__VIEWPOINT:
				setViewpoint((Viewpoint)null);
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
			case MondoSiriusPackage.TEST_VIEWPOINT__VIEWPOINT:
				return viewpoint != null;
		}
		return super.eIsSet(featureID);
	}

} //TestViewpointImpl
