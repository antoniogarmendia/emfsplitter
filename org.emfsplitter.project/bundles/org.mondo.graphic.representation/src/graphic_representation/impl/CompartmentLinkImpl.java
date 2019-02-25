/**
 */
package graphic_representation.impl;

import graphic_representation.CompartmentLink;
import graphic_representation.Graphic_representationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.CompartmentLinkImpl#getDecoratorName <em>Decorator Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentLinkImpl extends MinimalEObjectImpl.Container implements CompartmentLink {
	/**
	 * The default value of the '{@link #getDecoratorName() <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected static final String DECORATOR_NAME_EDEFAULT = "NoDecoration";

	/**
	 * The cached value of the '{@link #getDecoratorName() <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorName()
	 * @generated
	 * @ordered
	 */
	protected String decoratorName = DECORATOR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.COMPARTMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecoratorName() {
		return decoratorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoratorName(String newDecoratorName) {
		String oldDecoratorName = decoratorName;
		decoratorName = newDecoratorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_LINK__DECORATOR_NAME, oldDecoratorName, decoratorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.COMPARTMENT_LINK__DECORATOR_NAME:
				return getDecoratorName();
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
			case Graphic_representationPackage.COMPARTMENT_LINK__DECORATOR_NAME:
				setDecoratorName((String)newValue);
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
			case Graphic_representationPackage.COMPARTMENT_LINK__DECORATOR_NAME:
				setDecoratorName(DECORATOR_NAME_EDEFAULT);
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
			case Graphic_representationPackage.COMPARTMENT_LINK__DECORATOR_NAME:
				return DECORATOR_NAME_EDEFAULT == null ? decoratorName != null : !DECORATOR_NAME_EDEFAULT.equals(decoratorName);
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
		result.append(" (decoratorName: ");
		result.append(decoratorName);
		result.append(')');
		return result.toString();
	}

} //CompartmentLinkImpl
