/**
 */
package graphic_representation.impl;

import graphic_representation.CompartmentElement;
import graphic_representation.CompartmentView;
import graphic_representation.Graphic_representationPackage;

import graphic_representation.RepresentationStyle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.CompartmentElementImpl#getCompartmentView <em>Compartment View</em>}</li>
 *   <li>{@link graphic_representation.impl.CompartmentElementImpl#getRepresentationStyle <em>Representation Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentElementImpl extends AffixedCompartmentElementImpl implements CompartmentElement {
	/**
	 * The default value of the '{@link #getCompartmentView() <em>Compartment View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentView()
	 * @generated
	 * @ordered
	 */
	protected static final CompartmentView COMPARTMENT_VIEW_EDEFAULT = CompartmentView.NONE;
	/**
	 * The cached value of the '{@link #getCompartmentView() <em>Compartment View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompartmentView()
	 * @generated
	 * @ordered
	 */
	protected CompartmentView compartmentView = COMPARTMENT_VIEW_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRepresentationStyle() <em>Representation Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentationStyle()
	 * @generated
	 * @ordered
	 */
	protected RepresentationStyle representationStyle;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.COMPARTMENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentView getCompartmentView() {
		return compartmentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentView(CompartmentView newCompartmentView) {
		CompartmentView oldCompartmentView = compartmentView;
		compartmentView = newCompartmentView == null ? COMPARTMENT_VIEW_EDEFAULT : newCompartmentView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_ELEMENT__COMPARTMENT_VIEW, oldCompartmentView, compartmentView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationStyle getRepresentationStyle() {
		return representationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepresentationStyle(RepresentationStyle newRepresentationStyle, NotificationChain msgs) {
		RepresentationStyle oldRepresentationStyle = representationStyle;
		representationStyle = newRepresentationStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE, oldRepresentationStyle, newRepresentationStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentationStyle(RepresentationStyle newRepresentationStyle) {
		if (newRepresentationStyle != representationStyle) {
			NotificationChain msgs = null;
			if (representationStyle != null)
				msgs = ((InternalEObject)representationStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE, null, msgs);
			if (newRepresentationStyle != null)
				msgs = ((InternalEObject)newRepresentationStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE, null, msgs);
			msgs = basicSetRepresentationStyle(newRepresentationStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE, newRepresentationStyle, newRepresentationStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE:
				return basicSetRepresentationStyle(null, msgs);
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
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__COMPARTMENT_VIEW:
				return getCompartmentView();
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE:
				return getRepresentationStyle();
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
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__COMPARTMENT_VIEW:
				setCompartmentView((CompartmentView)newValue);
				return;
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE:
				setRepresentationStyle((RepresentationStyle)newValue);
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
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__COMPARTMENT_VIEW:
				setCompartmentView(COMPARTMENT_VIEW_EDEFAULT);
				return;
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE:
				setRepresentationStyle((RepresentationStyle)null);
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
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__COMPARTMENT_VIEW:
				return compartmentView != COMPARTMENT_VIEW_EDEFAULT;
			case Graphic_representationPackage.COMPARTMENT_ELEMENT__REPRESENTATION_STYLE:
				return representationStyle != null;
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
		result.append(" (compartmentView: ");
		result.append(compartmentView);
		result.append(')');
		return result.toString();
	}

} //CompartmentElementImpl
