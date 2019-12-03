/**
 */
package graphic_representation.impl;

import graphic_representation.GeneralLabel;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Shape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.ShapeImpl#getLabelanEAttribute <em>Labelan EAttribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapeImpl extends MinimalEObjectImpl.Container implements Shape {
	/**
	 * The cached value of the '{@link #getLabelanEAttribute() <em>Labelan EAttribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelanEAttribute()
	 * @generated
	 * @ordered
	 */
	protected GeneralLabel labelanEAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLabel getLabelanEAttribute() {
		return labelanEAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelanEAttribute(GeneralLabel newLabelanEAttribute, NotificationChain msgs) {
		GeneralLabel oldLabelanEAttribute = labelanEAttribute;
		labelanEAttribute = newLabelanEAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE, oldLabelanEAttribute, newLabelanEAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelanEAttribute(GeneralLabel newLabelanEAttribute) {
		if (newLabelanEAttribute != labelanEAttribute) {
			NotificationChain msgs = null;
			if (labelanEAttribute != null)
				msgs = ((InternalEObject)labelanEAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE, null, msgs);
			if (newLabelanEAttribute != null)
				msgs = ((InternalEObject)newLabelanEAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE, null, msgs);
			msgs = basicSetLabelanEAttribute(newLabelanEAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE, newLabelanEAttribute, newLabelanEAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE:
				return basicSetLabelanEAttribute(null, msgs);
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
			case Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE:
				return getLabelanEAttribute();
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
			case Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE:
				setLabelanEAttribute((GeneralLabel)newValue);
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
			case Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE:
				setLabelanEAttribute((GeneralLabel)null);
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
			case Graphic_representationPackage.SHAPE__LABELAN_EATTRIBUTE:
				return labelanEAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //ShapeImpl
