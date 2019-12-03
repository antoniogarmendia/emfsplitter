/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.LabelEAttribute;
import graphic_representation.WEAttribute;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.LabelEAttributeImpl#getLabelAttributes <em>Label Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelEAttributeImpl extends GeneralLabelImpl implements LabelEAttribute {
	/**
	 * The cached value of the '{@link #getLabelAttributes() <em>Label Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<WEAttribute> labelAttributes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelEAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.LABEL_EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WEAttribute> getLabelAttributes() {
		if (labelAttributes == null) {
			labelAttributes = new EObjectContainmentEList<WEAttribute>(WEAttribute.class, this, Graphic_representationPackage.LABEL_EATTRIBUTE__LABEL_ATTRIBUTES);
		}
		return labelAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.LABEL_EATTRIBUTE__LABEL_ATTRIBUTES:
				return ((InternalEList<?>)getLabelAttributes()).basicRemove(otherEnd, msgs);
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
			case Graphic_representationPackage.LABEL_EATTRIBUTE__LABEL_ATTRIBUTES:
				return getLabelAttributes();
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
			case Graphic_representationPackage.LABEL_EATTRIBUTE__LABEL_ATTRIBUTES:
				getLabelAttributes().clear();
				getLabelAttributes().addAll((Collection<? extends WEAttribute>)newValue);
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
			case Graphic_representationPackage.LABEL_EATTRIBUTE__LABEL_ATTRIBUTES:
				getLabelAttributes().clear();
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
			case Graphic_representationPackage.LABEL_EATTRIBUTE__LABEL_ATTRIBUTES:
				return labelAttributes != null && !labelAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabelEAttributeImpl
