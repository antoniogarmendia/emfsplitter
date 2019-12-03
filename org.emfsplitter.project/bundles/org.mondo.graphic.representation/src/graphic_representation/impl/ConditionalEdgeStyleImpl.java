/**
 */
package graphic_representation.impl;

import graphic_representation.ConditionalEdgeStyle;
import graphic_representation.EdgeDecorator;
import graphic_representation.Edge_Style;
import graphic_representation.GeneralLabel;
import graphic_representation.Graphic_representationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Edge Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.ConditionalEdgeStyleImpl#getConditionalOCL <em>Conditional OCL</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalEdgeStyleImpl#getConditionalEdge <em>Conditional Edge</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalEdgeStyleImpl#getGeneralLabel <em>General Label</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalEdgeStyleImpl#getDecoratorSource <em>Decorator Source</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalEdgeStyleImpl#getDecoratorTarget <em>Decorator Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalEdgeStyleImpl extends MinimalEObjectImpl.Container implements ConditionalEdgeStyle {
	/**
	 * The default value of the '{@link #getConditionalOCL() <em>Conditional OCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalOCL()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONAL_OCL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionalOCL() <em>Conditional OCL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalOCL()
	 * @generated
	 * @ordered
	 */
	protected String conditionalOCL = CONDITIONAL_OCL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionalEdge() <em>Conditional Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalEdge()
	 * @generated
	 * @ordered
	 */
	protected Edge_Style conditionalEdge;

	/**
	 * The cached value of the '{@link #getGeneralLabel() <em>General Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralLabel()
	 * @generated
	 * @ordered
	 */
	protected GeneralLabel generalLabel;

	/**
	 * The cached value of the '{@link #getDecoratorSource() <em>Decorator Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorSource()
	 * @generated
	 * @ordered
	 */
	protected EdgeDecorator decoratorSource;

	/**
	 * The cached value of the '{@link #getDecoratorTarget() <em>Decorator Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecoratorTarget()
	 * @generated
	 * @ordered
	 */
	protected EdgeDecorator decoratorTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalEdgeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.CONDITIONAL_EDGE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionalOCL() {
		return conditionalOCL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalOCL(String newConditionalOCL) {
		String oldConditionalOCL = conditionalOCL;
		conditionalOCL = newConditionalOCL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_OCL, oldConditionalOCL, conditionalOCL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge_Style getConditionalEdge() {
		return conditionalEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalEdge(Edge_Style newConditionalEdge, NotificationChain msgs) {
		Edge_Style oldConditionalEdge = conditionalEdge;
		conditionalEdge = newConditionalEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE, oldConditionalEdge, newConditionalEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionalEdge(Edge_Style newConditionalEdge) {
		if (newConditionalEdge != conditionalEdge) {
			NotificationChain msgs = null;
			if (conditionalEdge != null)
				msgs = ((InternalEObject)conditionalEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE, null, msgs);
			if (newConditionalEdge != null)
				msgs = ((InternalEObject)newConditionalEdge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE, null, msgs);
			msgs = basicSetConditionalEdge(newConditionalEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE, newConditionalEdge, newConditionalEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLabel getGeneralLabel() {
		return generalLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralLabel(GeneralLabel newGeneralLabel, NotificationChain msgs) {
		GeneralLabel oldGeneralLabel = generalLabel;
		generalLabel = newGeneralLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL, oldGeneralLabel, newGeneralLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralLabel(GeneralLabel newGeneralLabel) {
		if (newGeneralLabel != generalLabel) {
			NotificationChain msgs = null;
			if (generalLabel != null)
				msgs = ((InternalEObject)generalLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL, null, msgs);
			if (newGeneralLabel != null)
				msgs = ((InternalEObject)newGeneralLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL, null, msgs);
			msgs = basicSetGeneralLabel(newGeneralLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL, newGeneralLabel, newGeneralLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeDecorator getDecoratorSource() {
		return decoratorSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecoratorSource(EdgeDecorator newDecoratorSource, NotificationChain msgs) {
		EdgeDecorator oldDecoratorSource = decoratorSource;
		decoratorSource = newDecoratorSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE, oldDecoratorSource, newDecoratorSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoratorSource(EdgeDecorator newDecoratorSource) {
		if (newDecoratorSource != decoratorSource) {
			NotificationChain msgs = null;
			if (decoratorSource != null)
				msgs = ((InternalEObject)decoratorSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE, null, msgs);
			if (newDecoratorSource != null)
				msgs = ((InternalEObject)newDecoratorSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE, null, msgs);
			msgs = basicSetDecoratorSource(newDecoratorSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE, newDecoratorSource, newDecoratorSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeDecorator getDecoratorTarget() {
		return decoratorTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecoratorTarget(EdgeDecorator newDecoratorTarget, NotificationChain msgs) {
		EdgeDecorator oldDecoratorTarget = decoratorTarget;
		decoratorTarget = newDecoratorTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET, oldDecoratorTarget, newDecoratorTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecoratorTarget(EdgeDecorator newDecoratorTarget) {
		if (newDecoratorTarget != decoratorTarget) {
			NotificationChain msgs = null;
			if (decoratorTarget != null)
				msgs = ((InternalEObject)decoratorTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET, null, msgs);
			if (newDecoratorTarget != null)
				msgs = ((InternalEObject)newDecoratorTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET, null, msgs);
			msgs = basicSetDecoratorTarget(newDecoratorTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET, newDecoratorTarget, newDecoratorTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE:
				return basicSetConditionalEdge(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL:
				return basicSetGeneralLabel(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE:
				return basicSetDecoratorSource(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET:
				return basicSetDecoratorTarget(null, msgs);
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
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_OCL:
				return getConditionalOCL();
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE:
				return getConditionalEdge();
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL:
				return getGeneralLabel();
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE:
				return getDecoratorSource();
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET:
				return getDecoratorTarget();
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
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_OCL:
				setConditionalOCL((String)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE:
				setConditionalEdge((Edge_Style)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL:
				setGeneralLabel((GeneralLabel)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE:
				setDecoratorSource((EdgeDecorator)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET:
				setDecoratorTarget((EdgeDecorator)newValue);
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
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_OCL:
				setConditionalOCL(CONDITIONAL_OCL_EDEFAULT);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE:
				setConditionalEdge((Edge_Style)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL:
				setGeneralLabel((GeneralLabel)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE:
				setDecoratorSource((EdgeDecorator)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET:
				setDecoratorTarget((EdgeDecorator)null);
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
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_OCL:
				return CONDITIONAL_OCL_EDEFAULT == null ? conditionalOCL != null : !CONDITIONAL_OCL_EDEFAULT.equals(conditionalOCL);
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__CONDITIONAL_EDGE:
				return conditionalEdge != null;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__GENERAL_LABEL:
				return generalLabel != null;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_SOURCE:
				return decoratorSource != null;
			case Graphic_representationPackage.CONDITIONAL_EDGE_STYLE__DECORATOR_TARGET:
				return decoratorTarget != null;
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
		result.append(" (conditionalOCL: ");
		result.append(conditionalOCL);
		result.append(')');
		return result.toString();
	}

} //ConditionalEdgeStyleImpl
