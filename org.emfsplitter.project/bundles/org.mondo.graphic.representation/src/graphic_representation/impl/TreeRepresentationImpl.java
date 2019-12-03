/**
 */
package graphic_representation.impl;

import graphic_representation.CompartmentEdge;
import graphic_representation.Graphic_representationPackage;
import graphic_representation.Shape;
import graphic_representation.TreeRepresentation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.TreeRepresentationImpl#getInitShape <em>Init Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.TreeRepresentationImpl#getRootShape <em>Root Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.TreeRepresentationImpl#getNodeShape <em>Node Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.TreeRepresentationImpl#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.TreeRepresentationImpl#getInitToRootShape <em>Init To Root Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.TreeRepresentationImpl#getRootShapeToNode <em>Root Shape To Node</em>}</li>
 *   <li>{@link graphic_representation.impl.TreeRepresentationImpl#getNodeShapeToEndShape <em>Node Shape To End Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeRepresentationImpl extends RepresentationStyleImpl implements TreeRepresentation {
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
	 * The cached value of the '{@link #getRootShape() <em>Root Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootShape()
	 * @generated
	 * @ordered
	 */
	protected Shape rootShape;

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
	 * The cached value of the '{@link #getInitToRootShape() <em>Init To Root Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitToRootShape()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge initToRootShape;

	/**
	 * The cached value of the '{@link #getRootShapeToNode() <em>Root Shape To Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootShapeToNode()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge rootShapeToNode;

	/**
	 * The cached value of the '{@link #getNodeShapeToEndShape() <em>Node Shape To End Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeShapeToEndShape()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge nodeShapeToEndShape;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.TREE_REPRESENTATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE, oldInitShape, newInitShape);
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
				msgs = ((InternalEObject)initShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE, null, msgs);
			if (newInitShape != null)
				msgs = ((InternalEObject)newInitShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE, null, msgs);
			msgs = basicSetInitShape(newInitShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE, newInitShape, newInitShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getRootShape() {
		return rootShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootShape(Shape newRootShape, NotificationChain msgs) {
		Shape oldRootShape = rootShape;
		rootShape = newRootShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE, oldRootShape, newRootShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootShape(Shape newRootShape) {
		if (newRootShape != rootShape) {
			NotificationChain msgs = null;
			if (rootShape != null)
				msgs = ((InternalEObject)rootShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE, null, msgs);
			if (newRootShape != null)
				msgs = ((InternalEObject)newRootShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE, null, msgs);
			msgs = basicSetRootShape(newRootShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE, newRootShape, newRootShape));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE, oldNodeShape, newNodeShape);
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
				msgs = ((InternalEObject)nodeShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE, null, msgs);
			if (newNodeShape != null)
				msgs = ((InternalEObject)newNodeShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE, null, msgs);
			msgs = basicSetNodeShape(newNodeShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE, newNodeShape, newNodeShape));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE, oldEndShape, newEndShape);
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
				msgs = ((InternalEObject)endShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE, null, msgs);
			if (newEndShape != null)
				msgs = ((InternalEObject)newEndShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE, null, msgs);
			msgs = basicSetEndShape(newEndShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE, newEndShape, newEndShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getInitToRootShape() {
		return initToRootShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitToRootShape(CompartmentEdge newInitToRootShape, NotificationChain msgs) {
		CompartmentEdge oldInitToRootShape = initToRootShape;
		initToRootShape = newInitToRootShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE, oldInitToRootShape, newInitToRootShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitToRootShape(CompartmentEdge newInitToRootShape) {
		if (newInitToRootShape != initToRootShape) {
			NotificationChain msgs = null;
			if (initToRootShape != null)
				msgs = ((InternalEObject)initToRootShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE, null, msgs);
			if (newInitToRootShape != null)
				msgs = ((InternalEObject)newInitToRootShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE, null, msgs);
			msgs = basicSetInitToRootShape(newInitToRootShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE, newInitToRootShape, newInitToRootShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getRootShapeToNode() {
		return rootShapeToNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootShapeToNode(CompartmentEdge newRootShapeToNode, NotificationChain msgs) {
		CompartmentEdge oldRootShapeToNode = rootShapeToNode;
		rootShapeToNode = newRootShapeToNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE, oldRootShapeToNode, newRootShapeToNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootShapeToNode(CompartmentEdge newRootShapeToNode) {
		if (newRootShapeToNode != rootShapeToNode) {
			NotificationChain msgs = null;
			if (rootShapeToNode != null)
				msgs = ((InternalEObject)rootShapeToNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE, null, msgs);
			if (newRootShapeToNode != null)
				msgs = ((InternalEObject)newRootShapeToNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE, null, msgs);
			msgs = basicSetRootShapeToNode(newRootShapeToNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE, newRootShapeToNode, newRootShapeToNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getNodeShapeToEndShape() {
		return nodeShapeToEndShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeShapeToEndShape(CompartmentEdge newNodeShapeToEndShape, NotificationChain msgs) {
		CompartmentEdge oldNodeShapeToEndShape = nodeShapeToEndShape;
		nodeShapeToEndShape = newNodeShapeToEndShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE, oldNodeShapeToEndShape, newNodeShapeToEndShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeShapeToEndShape(CompartmentEdge newNodeShapeToEndShape) {
		if (newNodeShapeToEndShape != nodeShapeToEndShape) {
			NotificationChain msgs = null;
			if (nodeShapeToEndShape != null)
				msgs = ((InternalEObject)nodeShapeToEndShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE, null, msgs);
			if (newNodeShapeToEndShape != null)
				msgs = ((InternalEObject)newNodeShapeToEndShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE, null, msgs);
			msgs = basicSetNodeShapeToEndShape(newNodeShapeToEndShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE, newNodeShapeToEndShape, newNodeShapeToEndShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE:
				return basicSetInitShape(null, msgs);
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE:
				return basicSetRootShape(null, msgs);
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE:
				return basicSetNodeShape(null, msgs);
			case Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE:
				return basicSetEndShape(null, msgs);
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE:
				return basicSetInitToRootShape(null, msgs);
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE:
				return basicSetRootShapeToNode(null, msgs);
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE:
				return basicSetNodeShapeToEndShape(null, msgs);
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
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE:
				return getInitShape();
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE:
				return getRootShape();
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE:
				return getNodeShape();
			case Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE:
				return getEndShape();
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE:
				return getInitToRootShape();
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE:
				return getRootShapeToNode();
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE:
				return getNodeShapeToEndShape();
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
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE:
				setInitShape((Shape)newValue);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE:
				setRootShape((Shape)newValue);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE:
				setNodeShape((Shape)newValue);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE:
				setEndShape((Shape)newValue);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE:
				setInitToRootShape((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE:
				setRootShapeToNode((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE:
				setNodeShapeToEndShape((CompartmentEdge)newValue);
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
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE:
				setInitShape((Shape)null);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE:
				setRootShape((Shape)null);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE:
				setNodeShape((Shape)null);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE:
				setEndShape((Shape)null);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE:
				setInitToRootShape((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE:
				setRootShapeToNode((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE:
				setNodeShapeToEndShape((CompartmentEdge)null);
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
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_SHAPE:
				return initShape != null;
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE:
				return rootShape != null;
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE:
				return nodeShape != null;
			case Graphic_representationPackage.TREE_REPRESENTATION__END_SHAPE:
				return endShape != null;
			case Graphic_representationPackage.TREE_REPRESENTATION__INIT_TO_ROOT_SHAPE:
				return initToRootShape != null;
			case Graphic_representationPackage.TREE_REPRESENTATION__ROOT_SHAPE_TO_NODE:
				return rootShapeToNode != null;
			case Graphic_representationPackage.TREE_REPRESENTATION__NODE_SHAPE_TO_END_SHAPE:
				return nodeShapeToEndShape != null;
		}
		return super.eIsSet(featureID);
	}

} //TreeRepresentationImpl
