/**
 */
package mondoSirius.impl;

import mondoSirius.MondoSiriusPackage;
import mondoSirius.TestTableEdition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Table Edition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mondoSirius.impl.TestTableEditionImpl#getEditionTableDescription <em>Edition Table Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestTableEditionImpl extends MinimalEObjectImpl.Container implements TestTableEdition {
	/**
	 * The cached value of the '{@link #getEditionTableDescription() <em>Edition Table Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionTableDescription()
	 * @generated
	 * @ordered
	 */
	protected EditionTableDescription editionTableDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestTableEditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MondoSiriusPackage.Literals.TEST_TABLE_EDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EditionTableDescription getEditionTableDescription() {
		if (editionTableDescription != null && editionTableDescription.eIsProxy()) {
			InternalEObject oldEditionTableDescription = (InternalEObject)editionTableDescription;
			editionTableDescription = (EditionTableDescription)eResolveProxy(oldEditionTableDescription);
			if (editionTableDescription != oldEditionTableDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MondoSiriusPackage.TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION, oldEditionTableDescription, editionTableDescription));
			}
		}
		return editionTableDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionTableDescription basicGetEditionTableDescription() {
		return editionTableDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditionTableDescription(EditionTableDescription newEditionTableDescription) {
		EditionTableDescription oldEditionTableDescription = editionTableDescription;
		editionTableDescription = newEditionTableDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MondoSiriusPackage.TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION, oldEditionTableDescription, editionTableDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MondoSiriusPackage.TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION:
				if (resolve) return getEditionTableDescription();
				return basicGetEditionTableDescription();
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
			case MondoSiriusPackage.TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION:
				setEditionTableDescription((EditionTableDescription)newValue);
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
			case MondoSiriusPackage.TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION:
				setEditionTableDescription((EditionTableDescription)null);
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
			case MondoSiriusPackage.TEST_TABLE_EDITION__EDITION_TABLE_DESCRIPTION:
				return editionTableDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //TestTableEditionImpl
