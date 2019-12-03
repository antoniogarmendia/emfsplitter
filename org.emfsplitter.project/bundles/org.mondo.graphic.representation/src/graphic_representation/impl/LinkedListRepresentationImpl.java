/**
 */
package graphic_representation.impl;

import graphic_representation.CompartmentEdge;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.LinkedListRepresentation;
import graphic_representation.Shape;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linked List Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.LinkedListRepresentationImpl#getInit <em>Init</em>}</li>
 *   <li>{@link graphic_representation.impl.LinkedListRepresentationImpl#getNodeShape <em>Node Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.LinkedListRepresentationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link graphic_representation.impl.LinkedListRepresentationImpl#getInitToFirst <em>Init To First</em>}</li>
 *   <li>{@link graphic_representation.impl.LinkedListRepresentationImpl#getNodeToNode <em>Node To Node</em>}</li>
 *   <li>{@link graphic_representation.impl.LinkedListRepresentationImpl#getNodeToEnd <em>Node To End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkedListRepresentationImpl extends RepresentationStyleImpl implements LinkedListRepresentation {
	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected Shape init;

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
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Shape end;

	/**
	 * The cached value of the '{@link #getInitToFirst() <em>Init To First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitToFirst()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge initToFirst;

	/**
	 * The cached value of the '{@link #getNodeToNode() <em>Node To Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeToNode()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge nodeToNode;

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
	protected LinkedListRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.LINKED_LIST_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(Shape newInit, NotificationChain msgs) {
		Shape oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(Shape newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT, newInit, newInit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE, oldNodeShape, newNodeShape);
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
				msgs = ((InternalEObject)nodeShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE, null, msgs);
			if (newNodeShape != null)
				msgs = ((InternalEObject)newNodeShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE, null, msgs);
			msgs = basicSetNodeShape(newNodeShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE, newNodeShape, newNodeShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(Shape newEnd, NotificationChain msgs) {
		Shape oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Shape newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getInitToFirst() {
		return initToFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitToFirst(CompartmentEdge newInitToFirst, NotificationChain msgs) {
		CompartmentEdge oldInitToFirst = initToFirst;
		initToFirst = newInitToFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST, oldInitToFirst, newInitToFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitToFirst(CompartmentEdge newInitToFirst) {
		if (newInitToFirst != initToFirst) {
			NotificationChain msgs = null;
			if (initToFirst != null)
				msgs = ((InternalEObject)initToFirst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST, null, msgs);
			if (newInitToFirst != null)
				msgs = ((InternalEObject)newInitToFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST, null, msgs);
			msgs = basicSetInitToFirst(newInitToFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST, newInitToFirst, newInitToFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getNodeToNode() {
		return nodeToNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeToNode(CompartmentEdge newNodeToNode, NotificationChain msgs) {
		CompartmentEdge oldNodeToNode = nodeToNode;
		nodeToNode = newNodeToNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE, oldNodeToNode, newNodeToNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeToNode(CompartmentEdge newNodeToNode) {
		if (newNodeToNode != nodeToNode) {
			NotificationChain msgs = null;
			if (nodeToNode != null)
				msgs = ((InternalEObject)nodeToNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE, null, msgs);
			if (newNodeToNode != null)
				msgs = ((InternalEObject)newNodeToNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE, null, msgs);
			msgs = basicSetNodeToNode(newNodeToNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE, newNodeToNode, newNodeToNode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END, oldNodeToEnd, newNodeToEnd);
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
				msgs = ((InternalEObject)nodeToEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END, null, msgs);
			if (newNodeToEnd != null)
				msgs = ((InternalEObject)newNodeToEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END, null, msgs);
			msgs = basicSetNodeToEnd(newNodeToEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END, newNodeToEnd, newNodeToEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT:
				return basicSetInit(null, msgs);
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE:
				return basicSetNodeShape(null, msgs);
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END:
				return basicSetEnd(null, msgs);
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST:
				return basicSetInitToFirst(null, msgs);
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE:
				return basicSetNodeToNode(null, msgs);
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END:
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
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT:
				return getInit();
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE:
				return getNodeShape();
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END:
				return getEnd();
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST:
				return getInitToFirst();
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE:
				return getNodeToNode();
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END:
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
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT:
				setInit((Shape)newValue);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE:
				setNodeShape((Shape)newValue);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END:
				setEnd((Shape)newValue);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST:
				setInitToFirst((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE:
				setNodeToNode((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END:
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
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT:
				setInit((Shape)null);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE:
				setNodeShape((Shape)null);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END:
				setEnd((Shape)null);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST:
				setInitToFirst((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE:
				setNodeToNode((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END:
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
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT:
				return init != null;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_SHAPE:
				return nodeShape != null;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__END:
				return end != null;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__INIT_TO_FIRST:
				return initToFirst != null;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_NODE:
				return nodeToNode != null;
			case Graphic_representationPackage.LINKED_LIST_REPRESENTATION__NODE_TO_END:
				return nodeToEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkedListRepresentationImpl
