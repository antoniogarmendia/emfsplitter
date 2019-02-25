/**
 */
package graphic_representation.impl;

import graphic_representation.Graphic_representationPackage;
import graphic_representation.VirtualCompartmentReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Compartment Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.VirtualCompartmentReferenceImpl#getContainerReference <em>Container Reference</em>}</li>
 *   <li>{@link graphic_representation.impl.VirtualCompartmentReferenceImpl#getVirtualReference <em>Virtual Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VirtualCompartmentReferenceImpl extends VirtualCompartmentImpl implements VirtualCompartmentReference {
	/**
	 * The cached value of the '{@link #getContainerReference() <em>Container Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerReference()
	 * @generated
	 * @ordered
	 */
	protected EReference containerReference;

	/**
	 * The cached value of the '{@link #getVirtualReference() <em>Virtual Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualReference()
	 * @generated
	 * @ordered
	 */
	protected EReference virtualReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualCompartmentReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.VIRTUAL_COMPARTMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerReference() {
		if (containerReference != null && containerReference.eIsProxy()) {
			InternalEObject oldContainerReference = (InternalEObject)containerReference;
			containerReference = (EReference)eResolveProxy(oldContainerReference);
			if (containerReference != oldContainerReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__CONTAINER_REFERENCE, oldContainerReference, containerReference));
			}
		}
		return containerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetContainerReference() {
		return containerReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerReference(EReference newContainerReference) {
		EReference oldContainerReference = containerReference;
		containerReference = newContainerReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__CONTAINER_REFERENCE, oldContainerReference, containerReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualReference() {
		if (virtualReference != null && virtualReference.eIsProxy()) {
			InternalEObject oldVirtualReference = (InternalEObject)virtualReference;
			virtualReference = (EReference)eResolveProxy(oldVirtualReference);
			if (virtualReference != oldVirtualReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__VIRTUAL_REFERENCE, oldVirtualReference, virtualReference));
			}
		}
		return virtualReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetVirtualReference() {
		return virtualReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualReference(EReference newVirtualReference) {
		EReference oldVirtualReference = virtualReference;
		virtualReference = newVirtualReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__VIRTUAL_REFERENCE, oldVirtualReference, virtualReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__CONTAINER_REFERENCE:
				if (resolve) return getContainerReference();
				return basicGetContainerReference();
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__VIRTUAL_REFERENCE:
				if (resolve) return getVirtualReference();
				return basicGetVirtualReference();
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
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__CONTAINER_REFERENCE:
				setContainerReference((EReference)newValue);
				return;
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__VIRTUAL_REFERENCE:
				setVirtualReference((EReference)newValue);
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
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__CONTAINER_REFERENCE:
				setContainerReference((EReference)null);
				return;
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__VIRTUAL_REFERENCE:
				setVirtualReference((EReference)null);
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
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__CONTAINER_REFERENCE:
				return containerReference != null;
			case Graphic_representationPackage.VIRTUAL_COMPARTMENT_REFERENCE__VIRTUAL_REFERENCE:
				return virtualReference != null;
		}
		return super.eIsSet(featureID);
	}

} //VirtualCompartmentReferenceImpl
