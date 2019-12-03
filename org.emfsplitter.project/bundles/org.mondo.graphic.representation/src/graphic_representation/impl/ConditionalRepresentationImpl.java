/**
 */
package graphic_representation.impl;

import graphic_representation.CompartmentEdge;
import graphic_representation.ConditionalRepresentation;
import graphic_representation.Graphic_representationPackage;

import graphic_representation.Shape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getInitShape <em>Init Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getIfShape <em>If Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getThenShape <em>Then Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getElseShape <em>Else Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getInitToIf <em>Init To If</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getIfToThenNode <em>If To Then Node</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getThenNodeToEndNode <em>Then Node To End Node</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getIfNodeToElseNode <em>If Node To Else Node</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getElseNodeToEndNode <em>Else Node To End Node</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getThenReference <em>Then Reference</em>}</li>
 *   <li>{@link graphic_representation.impl.ConditionalRepresentationImpl#getElseReference <em>Else Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalRepresentationImpl extends RepresentationStyleImpl implements ConditionalRepresentation {
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
	 * The cached value of the '{@link #getIfShape() <em>If Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfShape()
	 * @generated
	 * @ordered
	 */
	protected Shape ifShape;
	/**
	 * The cached value of the '{@link #getThenShape() <em>Then Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenShape()
	 * @generated
	 * @ordered
	 */
	protected Shape thenShape;
	/**
	 * The cached value of the '{@link #getElseShape() <em>Else Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseShape()
	 * @generated
	 * @ordered
	 */
	protected Shape elseShape;
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
	 * The cached value of the '{@link #getInitToIf() <em>Init To If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitToIf()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge initToIf;
	/**
	 * The cached value of the '{@link #getIfToThenNode() <em>If To Then Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfToThenNode()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge ifToThenNode;
	/**
	 * The cached value of the '{@link #getThenNodeToEndNode() <em>Then Node To End Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenNodeToEndNode()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge thenNodeToEndNode;
	/**
	 * The cached value of the '{@link #getIfNodeToElseNode() <em>If Node To Else Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfNodeToElseNode()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge ifNodeToElseNode;
	/**
	 * The cached value of the '{@link #getElseNodeToEndNode() <em>Else Node To End Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseNodeToEndNode()
	 * @generated
	 * @ordered
	 */
	protected CompartmentEdge elseNodeToEndNode;
	/**
	 * The cached value of the '{@link #getThenReference() <em>Then Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenReference()
	 * @generated
	 * @ordered
	 */
	protected EReference thenReference;
	/**
	 * The cached value of the '{@link #getElseReference() <em>Else Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseReference()
	 * @generated
	 * @ordered
	 */
	protected EReference elseReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.CONDITIONAL_REPRESENTATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE, oldInitShape, newInitShape);
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
				msgs = ((InternalEObject)initShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE, null, msgs);
			if (newInitShape != null)
				msgs = ((InternalEObject)newInitShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE, null, msgs);
			msgs = basicSetInitShape(newInitShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE, newInitShape, newInitShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getIfShape() {
		return ifShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfShape(Shape newIfShape, NotificationChain msgs) {
		Shape oldIfShape = ifShape;
		ifShape = newIfShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE, oldIfShape, newIfShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfShape(Shape newIfShape) {
		if (newIfShape != ifShape) {
			NotificationChain msgs = null;
			if (ifShape != null)
				msgs = ((InternalEObject)ifShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE, null, msgs);
			if (newIfShape != null)
				msgs = ((InternalEObject)newIfShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE, null, msgs);
			msgs = basicSetIfShape(newIfShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE, newIfShape, newIfShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getThenShape() {
		return thenShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenShape(Shape newThenShape, NotificationChain msgs) {
		Shape oldThenShape = thenShape;
		thenShape = newThenShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE, oldThenShape, newThenShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenShape(Shape newThenShape) {
		if (newThenShape != thenShape) {
			NotificationChain msgs = null;
			if (thenShape != null)
				msgs = ((InternalEObject)thenShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE, null, msgs);
			if (newThenShape != null)
				msgs = ((InternalEObject)newThenShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE, null, msgs);
			msgs = basicSetThenShape(newThenShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE, newThenShape, newThenShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getElseShape() {
		return elseShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseShape(Shape newElseShape, NotificationChain msgs) {
		Shape oldElseShape = elseShape;
		elseShape = newElseShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE, oldElseShape, newElseShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseShape(Shape newElseShape) {
		if (newElseShape != elseShape) {
			NotificationChain msgs = null;
			if (elseShape != null)
				msgs = ((InternalEObject)elseShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE, null, msgs);
			if (newElseShape != null)
				msgs = ((InternalEObject)newElseShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE, null, msgs);
			msgs = basicSetElseShape(newElseShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE, newElseShape, newElseShape));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE, oldEndShape, newEndShape);
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
				msgs = ((InternalEObject)endShape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE, null, msgs);
			if (newEndShape != null)
				msgs = ((InternalEObject)newEndShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE, null, msgs);
			msgs = basicSetEndShape(newEndShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE, newEndShape, newEndShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getInitToIf() {
		return initToIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitToIf(CompartmentEdge newInitToIf, NotificationChain msgs) {
		CompartmentEdge oldInitToIf = initToIf;
		initToIf = newInitToIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF, oldInitToIf, newInitToIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitToIf(CompartmentEdge newInitToIf) {
		if (newInitToIf != initToIf) {
			NotificationChain msgs = null;
			if (initToIf != null)
				msgs = ((InternalEObject)initToIf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF, null, msgs);
			if (newInitToIf != null)
				msgs = ((InternalEObject)newInitToIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF, null, msgs);
			msgs = basicSetInitToIf(newInitToIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF, newInitToIf, newInitToIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getIfToThenNode() {
		return ifToThenNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfToThenNode(CompartmentEdge newIfToThenNode, NotificationChain msgs) {
		CompartmentEdge oldIfToThenNode = ifToThenNode;
		ifToThenNode = newIfToThenNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE, oldIfToThenNode, newIfToThenNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfToThenNode(CompartmentEdge newIfToThenNode) {
		if (newIfToThenNode != ifToThenNode) {
			NotificationChain msgs = null;
			if (ifToThenNode != null)
				msgs = ((InternalEObject)ifToThenNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE, null, msgs);
			if (newIfToThenNode != null)
				msgs = ((InternalEObject)newIfToThenNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE, null, msgs);
			msgs = basicSetIfToThenNode(newIfToThenNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE, newIfToThenNode, newIfToThenNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getThenNodeToEndNode() {
		return thenNodeToEndNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThenNodeToEndNode(CompartmentEdge newThenNodeToEndNode, NotificationChain msgs) {
		CompartmentEdge oldThenNodeToEndNode = thenNodeToEndNode;
		thenNodeToEndNode = newThenNodeToEndNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE, oldThenNodeToEndNode, newThenNodeToEndNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenNodeToEndNode(CompartmentEdge newThenNodeToEndNode) {
		if (newThenNodeToEndNode != thenNodeToEndNode) {
			NotificationChain msgs = null;
			if (thenNodeToEndNode != null)
				msgs = ((InternalEObject)thenNodeToEndNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE, null, msgs);
			if (newThenNodeToEndNode != null)
				msgs = ((InternalEObject)newThenNodeToEndNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE, null, msgs);
			msgs = basicSetThenNodeToEndNode(newThenNodeToEndNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE, newThenNodeToEndNode, newThenNodeToEndNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getIfNodeToElseNode() {
		return ifNodeToElseNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfNodeToElseNode(CompartmentEdge newIfNodeToElseNode, NotificationChain msgs) {
		CompartmentEdge oldIfNodeToElseNode = ifNodeToElseNode;
		ifNodeToElseNode = newIfNodeToElseNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE, oldIfNodeToElseNode, newIfNodeToElseNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfNodeToElseNode(CompartmentEdge newIfNodeToElseNode) {
		if (newIfNodeToElseNode != ifNodeToElseNode) {
			NotificationChain msgs = null;
			if (ifNodeToElseNode != null)
				msgs = ((InternalEObject)ifNodeToElseNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE, null, msgs);
			if (newIfNodeToElseNode != null)
				msgs = ((InternalEObject)newIfNodeToElseNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE, null, msgs);
			msgs = basicSetIfNodeToElseNode(newIfNodeToElseNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE, newIfNodeToElseNode, newIfNodeToElseNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentEdge getElseNodeToEndNode() {
		return elseNodeToEndNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElseNodeToEndNode(CompartmentEdge newElseNodeToEndNode, NotificationChain msgs) {
		CompartmentEdge oldElseNodeToEndNode = elseNodeToEndNode;
		elseNodeToEndNode = newElseNodeToEndNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE, oldElseNodeToEndNode, newElseNodeToEndNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseNodeToEndNode(CompartmentEdge newElseNodeToEndNode) {
		if (newElseNodeToEndNode != elseNodeToEndNode) {
			NotificationChain msgs = null;
			if (elseNodeToEndNode != null)
				msgs = ((InternalEObject)elseNodeToEndNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE, null, msgs);
			if (newElseNodeToEndNode != null)
				msgs = ((InternalEObject)newElseNodeToEndNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE, null, msgs);
			msgs = basicSetElseNodeToEndNode(newElseNodeToEndNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE, newElseNodeToEndNode, newElseNodeToEndNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThenReference() {
		if (thenReference != null && thenReference.eIsProxy()) {
			InternalEObject oldThenReference = (InternalEObject)thenReference;
			thenReference = (EReference)eResolveProxy(oldThenReference);
			if (thenReference != oldThenReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_REFERENCE, oldThenReference, thenReference));
			}
		}
		return thenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetThenReference() {
		return thenReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenReference(EReference newThenReference) {
		EReference oldThenReference = thenReference;
		thenReference = newThenReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_REFERENCE, oldThenReference, thenReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElseReference() {
		if (elseReference != null && elseReference.eIsProxy()) {
			InternalEObject oldElseReference = (InternalEObject)elseReference;
			elseReference = (EReference)eResolveProxy(oldElseReference);
			if (elseReference != oldElseReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_REFERENCE, oldElseReference, elseReference));
			}
		}
		return elseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetElseReference() {
		return elseReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElseReference(EReference newElseReference) {
		EReference oldElseReference = elseReference;
		elseReference = newElseReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_REFERENCE, oldElseReference, elseReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE:
				return basicSetInitShape(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE:
				return basicSetIfShape(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE:
				return basicSetThenShape(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE:
				return basicSetElseShape(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE:
				return basicSetEndShape(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF:
				return basicSetInitToIf(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE:
				return basicSetIfToThenNode(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE:
				return basicSetThenNodeToEndNode(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE:
				return basicSetIfNodeToElseNode(null, msgs);
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE:
				return basicSetElseNodeToEndNode(null, msgs);
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
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE:
				return getInitShape();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE:
				return getIfShape();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE:
				return getThenShape();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE:
				return getElseShape();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE:
				return getEndShape();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF:
				return getInitToIf();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE:
				return getIfToThenNode();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE:
				return getThenNodeToEndNode();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE:
				return getIfNodeToElseNode();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE:
				return getElseNodeToEndNode();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_REFERENCE:
				if (resolve) return getThenReference();
				return basicGetThenReference();
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_REFERENCE:
				if (resolve) return getElseReference();
				return basicGetElseReference();
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
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE:
				setInitShape((Shape)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE:
				setIfShape((Shape)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE:
				setThenShape((Shape)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE:
				setElseShape((Shape)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE:
				setEndShape((Shape)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF:
				setInitToIf((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE:
				setIfToThenNode((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE:
				setThenNodeToEndNode((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE:
				setIfNodeToElseNode((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE:
				setElseNodeToEndNode((CompartmentEdge)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_REFERENCE:
				setThenReference((EReference)newValue);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_REFERENCE:
				setElseReference((EReference)newValue);
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
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE:
				setInitShape((Shape)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE:
				setIfShape((Shape)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE:
				setThenShape((Shape)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE:
				setElseShape((Shape)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE:
				setEndShape((Shape)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF:
				setInitToIf((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE:
				setIfToThenNode((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE:
				setThenNodeToEndNode((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE:
				setIfNodeToElseNode((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE:
				setElseNodeToEndNode((CompartmentEdge)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_REFERENCE:
				setThenReference((EReference)null);
				return;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_REFERENCE:
				setElseReference((EReference)null);
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
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_SHAPE:
				return initShape != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_SHAPE:
				return ifShape != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_SHAPE:
				return thenShape != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_SHAPE:
				return elseShape != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__END_SHAPE:
				return endShape != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__INIT_TO_IF:
				return initToIf != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_TO_THEN_NODE:
				return ifToThenNode != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_NODE_TO_END_NODE:
				return thenNodeToEndNode != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__IF_NODE_TO_ELSE_NODE:
				return ifNodeToElseNode != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_NODE_TO_END_NODE:
				return elseNodeToEndNode != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__THEN_REFERENCE:
				return thenReference != null;
			case Graphic_representationPackage.CONDITIONAL_REPRESENTATION__ELSE_REFERENCE:
				return elseReference != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalRepresentationImpl
