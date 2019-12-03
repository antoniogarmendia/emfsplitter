/**
 */
package graphic_representation.impl;

import graphic_representation.CompartmentEdge;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.LoopRepresentation;

import graphic_representation.Shape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.LoopRepresentationImpl#getInitShape <em>Init Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.LoopRepresentationImpl#getNodeShape <em>Node Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.LoopRepresentationImpl#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.LoopRepresentationImpl#getInitToNode <em>Init To Node</em>}</li>
 *   <li>{@link graphic_representation.impl.LoopRepresentationImpl#getRecursiveEdge <em>Recursive Edge</em>}</li>
 *   <li>{@link graphic_representation.impl.LoopRepresentationImpl#getNodeToEnd <em>Node To End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopRepresentationImpl extends RepresentationStyleImpl implements LoopRepresentation {
	/**
	 * The cached value of the '{@link #getInitShape() <em>Init Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitShape()
	 * @generated
	 * @ordered
	 */
	protected Shape initShape;
	/**
	 * The cached value of the '{@link #getNodeShape() <em>Node Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeShape()
	 * @generated
	 * @ordered
	 */
	protected Shape nodeShape;
	/**
	 * The cached value of the '{@link #getEndShape() <em>End Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndShape()
	 * @generated
	 * @ordered
	 */
	protected Shape endShape;
	/**
	 * The cached value of the '{@link #getInitToNode() <em>Init To Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitToNode()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge initToNode;
	/**
	 * The cached value of the '{@link #getRecursiveEdge() <em>Recursive Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecursiveEdge()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge recursiveEdge;
	/**
	 * The cached value of the '{@link #getNodeToEnd() <em>Node To End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeToEnd()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge nodeToEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.LOOP_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getInitShape() {
		return initShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitShape(Shape newInitShape, NotificationChain msgs) {
		Shape oldInitShape = initShape;
		initShape = newInitShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE, oldInitShape, newInitShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitShape(Shape newInitShape) {
		if (newInitShape != initShape) {
			NotificationChain msgs = null;
			if (initShape != null)
				msgs = ((InternalEObject)initShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE, null, msgs);
			if (newInitShape != null)
				msgs = ((InternalEObject)newInitShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE, null, msgs);
			msgs = basicSetInitShape(newInitShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE, newInitShape, newInitShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getNodeShape() {
		return nodeShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeShape(Shape newNodeShape, NotificationChain msgs) {
		Shape oldNodeShape = nodeShape;
		nodeShape = newNodeShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE, oldNodeShape, newNodeShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeShape(Shape newNodeShape) {
		if (newNodeShape != nodeShape) {
			NotificationChain msgs = null;
			if (nodeShape != null)
				msgs = ((InternalEObject)nodeShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE, null, msgs);
			if (newNodeShape != null)
				msgs = ((InternalEObject)newNodeShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE, null, msgs);
			msgs = basicSetNodeShape(newNodeShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE, newNodeShape, newNodeShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getEndShape() {
		return endShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndShape(Shape newEndShape, NotificationChain msgs) {
		Shape oldEndShape = endShape;
		endShape = newEndShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE, oldEndShape, newEndShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndShape(Shape newEndShape) {
		if (newEndShape != endShape) {
			NotificationChain msgs = null;
			if (endShape != null)
				msgs = ((InternalEObject)endShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE, null, msgs);
			if (newEndShape != null)
				msgs = ((InternalEObject)newEndShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE, null, msgs);
			msgs = basicSetEndShape(newEndShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE, newEndShape, newEndShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getInitToNode() {
		return initToNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitToNode(CompartmentEdge newInitToNode, NotificationChain msgs) {
		CompartmentEdge oldInitToNode = initToNode;
		initToNode = newInitToNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE, oldInitToNode, newInitToNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitToNode(CompartmentEdge newInitToNode) {
		if (newInitToNode != initToNode) {
			NotificationChain msgs = null;
			if (initToNode != null)
				msgs = ((InternalEObject)initToNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE, null, msgs);
			if (newInitToNode != null)
				msgs = ((InternalEObject)newInitToNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE, null, msgs);
			msgs = basicSetInitToNode(newInitToNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE, newInitToNode, newInitToNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getRecursiveEdge() {
		return recursiveEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecursiveEdge(CompartmentEdge newRecursiveEdge, NotificationChain msgs) {
		CompartmentEdge oldRecursiveEdge = recursiveEdge;
		recursiveEdge = newRecursiveEdge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE, oldRecursiveEdge, newRecursiveEdge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecursiveEdge(CompartmentEdge newRecursiveEdge) {
		if (newRecursiveEdge != recursiveEdge) {
			NotificationChain msgs = null;
			if (recursiveEdge != null)
				msgs = ((InternalEObject)recursiveEdge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE, null, msgs);
			if (newRecursiveEdge != null)
				msgs = ((InternalEObject)newRecursiveEdge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE, null, msgs);
			msgs = basicSetRecursiveEdge(newRecursiveEdge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE, newRecursiveEdge, newRecursiveEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getNodeToEnd() {
		return nodeToEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeToEnd(CompartmentEdge newNodeToEnd, NotificationChain msgs) {
		CompartmentEdge oldNodeToEnd = nodeToEnd;
		nodeToEnd = newNodeToEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END, oldNodeToEnd, newNodeToEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeToEnd(CompartmentEdge newNodeToEnd) {
		if (newNodeToEnd != nodeToEnd) {
			NotificationChain msgs = null;
			if (nodeToEnd != null)
				msgs = ((InternalEObject)nodeToEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END, null, msgs);
			if (newNodeToEnd != null)
				msgs = ((InternalEObject)newNodeToEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END, null, msgs);
			msgs = basicSetNodeToEnd(newNodeToEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END, newNodeToEnd, newNodeToEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE:
				return basicSetInitShape(null, msgs);
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE:
				return basicSetNodeShape(null, msgs);
			case Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE:
				return basicSetEndShape(null, msgs);
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE:
				return basicSetInitToNode(null, msgs);
			case Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE:
				return basicSetRecursiveEdge(null, msgs);
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END:
				return basicSetNodeToEnd(null, msgs);
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
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE:
				return getInitShape();
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE:
				return getNodeShape();
			case Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE:
				return getEndShape();
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE:
				return getInitToNode();
			case Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE:
				return getRecursiveEdge();
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END:
				return getNodeToEnd();
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
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE:
				setInitShape((Shape)newValue);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE:
				setNodeShape((Shape)newValue);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE:
				setEndShape((Shape)newValue);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE:
				setInitToNode((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE:
				setRecursiveEdge((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END:
				setNodeToEnd((CompartmentEdge)newValue);
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
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE:
				setInitShape((Shape)null);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE:
				setNodeShape((Shape)null);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE:
				setEndShape((Shape)null);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE:
				setInitToNode((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE:
				setRecursiveEdge((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END:
				setNodeToEnd((CompartmentEdge)null);
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
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_SHAPE:
				return initShape != null;
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_SHAPE:
				return nodeShape != null;
			case Graphic_representationPackage.LOOP_REPRESENTATION__END_SHAPE:
				return endShape != null;
			case Graphic_representationPackage.LOOP_REPRESENTATION__INIT_TO_NODE:
				return initToNode != null;
			case Graphic_representationPackage.LOOP_REPRESENTATION__RECURSIVE_EDGE:
				return recursiveEdge != null;
			case Graphic_representationPackage.LOOP_REPRESENTATION__NODE_TO_END:
				return nodeToEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopRepresentationImpl
