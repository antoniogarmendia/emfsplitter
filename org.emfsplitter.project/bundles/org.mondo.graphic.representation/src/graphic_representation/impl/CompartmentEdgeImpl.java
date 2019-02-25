/**
 */
package graphic_representation.impl;

import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentLink;
import graphic_representation.Edge_Style;
import graphic_representation.Graphic_representationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compartment Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.CompartmentEdgeImpl#getEdge_style <em>Edge style</em>}</li>
 *   <li>{@link graphic_representation.impl.CompartmentEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link graphic_representation.impl.CompartmentEdgeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompartmentEdgeImpl extends MinimalEObjectImpl.Container implements CompartmentEdge {
	/**
	 * The cached value of the '{@link #getEdge_style() <em>Edge style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge_style()
	 * @generated
	 * @ordered
	 */
	protected Edge_Style edge_style;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected CompartmentLink source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected CompartmentLink target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompartmentEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.COMPARTMENT_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge_Style getEdge_style() {
		return edge_style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdge_style(Edge_Style newEdge_style, NotificationChain msgs) {
		Edge_Style oldEdge_style = edge_style;
		edge_style = newEdge_style;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE, oldEdge_style, newEdge_style);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge_style(Edge_Style newEdge_style) {
		if (newEdge_style != edge_style) {
			NotificationChain msgs = null;
			if (edge_style != null)
				msgs = ((InternalEObject)edge_style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE, null, msgs);
			if (newEdge_style != null)
				msgs = ((InternalEObject)newEdge_style).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE, null, msgs);
			msgs = basicSetEdge_style(newEdge_style, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE, newEdge_style, newEdge_style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentLink getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(CompartmentLink newSource, NotificationChain msgs) {
		CompartmentLink oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(CompartmentLink newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentLink getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(CompartmentLink newTarget, NotificationChain msgs) {
		CompartmentLink oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_EDGE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(CompartmentLink newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_EDGE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.COMPARTMENT_EDGE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.COMPARTMENT_EDGE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE:
				return basicSetEdge_style(null, msgs);
			case Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE:
				return basicSetSource(null, msgs);
			case Graphic_representationPackage.COMPARTMENT_EDGE__TARGET:
				return basicSetTarget(null, msgs);
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
			case Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE:
				return getEdge_style();
			case Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE:
				return getSource();
			case Graphic_representationPackage.COMPARTMENT_EDGE__TARGET:
				return getTarget();
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
			case Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE:
				setEdge_style((Edge_Style)newValue);
				return;
			case Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE:
				setSource((CompartmentLink)newValue);
				return;
			case Graphic_representationPackage.COMPARTMENT_EDGE__TARGET:
				setTarget((CompartmentLink)newValue);
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
			case Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE:
				setEdge_style((Edge_Style)null);
				return;
			case Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE:
				setSource((CompartmentLink)null);
				return;
			case Graphic_representationPackage.COMPARTMENT_EDGE__TARGET:
				setTarget((CompartmentLink)null);
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
			case Graphic_representationPackage.COMPARTMENT_EDGE__EDGE_STYLE:
				return edge_style != null;
			case Graphic_representationPackage.COMPARTMENT_EDGE__SOURCE:
				return source != null;
			case Graphic_representationPackage.COMPARTMENT_EDGE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //CompartmentEdgeImpl
