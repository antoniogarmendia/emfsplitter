/**
 */
package mondoSirius.impl;

import mondoSirius.MondoSiriusPackage;
import mondoSirius.TestDiagramDescription;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.sirius.diagram.description.DiagramDescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Diagram Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mondoSirius.impl.TestDiagramDescriptionImpl#getDiagramDescription <em>Diagram Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TestDiagramDescriptionImpl extends MinimalEObjectImpl.Container implements TestDiagramDescription {
	/**
	 * The cached value of the '{@link #getDiagramDescription() <em>Diagram Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagramDescription()
	 * @generated
	 * @ordered
	 */
	protected DiagramDescription diagramDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestDiagramDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MondoSiriusPackage.Literals.TEST_DIAGRAM_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiagramDescription getDiagramDescription() {
		if (diagramDescription != null && diagramDescription.eIsProxy()) {
			InternalEObject oldDiagramDescription = (InternalEObject)diagramDescription;
			diagramDescription = (DiagramDescription)eResolveProxy(oldDiagramDescription);
			if (diagramDescription != oldDiagramDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MondoSiriusPackage.TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION, oldDiagramDescription, diagramDescription));
			}
		}
		return diagramDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramDescription basicGetDiagramDescription() {
		return diagramDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagramDescription(DiagramDescription newDiagramDescription) {
		DiagramDescription oldDiagramDescription = diagramDescription;
		diagramDescription = newDiagramDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MondoSiriusPackage.TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION, oldDiagramDescription, diagramDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MondoSiriusPackage.TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION:
				if (resolve) return getDiagramDescription();
				return basicGetDiagramDescription();
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
			case MondoSiriusPackage.TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION:
				setDiagramDescription((DiagramDescription)newValue);
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
			case MondoSiriusPackage.TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION:
				setDiagramDescription((DiagramDescription)null);
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
			case MondoSiriusPackage.TEST_DIAGRAM_DESCRIPTION__DIAGRAM_DESCRIPTION:
				return diagramDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //TestDiagramDescriptionImpl
