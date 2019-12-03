/**
 */
package graphic_representation.impl;

import graphic_representation.ConditionalEdgeStyle;
import graphic_representation.Edge;
import graphic_representation.Edge_Direction;
import graphic_representation.Edge_Style;
import graphic_representation.GeneralLabel;
import graphic_representation.Graphic_representationPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.impl.EdgeImpl#getDirections <em>Directions</em>}</li>
 *   <li>{@link graphic_representation.impl.EdgeImpl#getEdge_style <em>Edge style</em>}</li>
 *   <li>{@link graphic_representation.impl.EdgeImpl#getEdgeLabel <em>Edge Label</em>}</li>
 *   <li>{@link graphic_representation.impl.EdgeImpl#getConditionalEdgeStyle <em>Conditional Edge Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeImpl extends DiagramElementImpl implements Edge {
	/**
	 * The cached value of the '{@link #getDirections() <em>Directions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirections()
	 * @generated
	 * @ordered
	 */
	protected Edge_Direction directions;

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
	 * The cached value of the '{@link #getEdgeLabel() <em>Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected GeneralLabel edgeLabel;

	/**
	 * The cached value of the '{@link #getConditionalEdgeStyle() <em>Conditional Edge Style</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalEdgeStyle()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalEdgeStyle> conditionalEdgeStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Graphic_representationPackage.Literals.EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge_Direction getDirections() {
		return directions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirections(Edge_Direction newDirections, NotificationChain msgs) {
		Edge_Direction oldDirections = directions;
		directions = newDirections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE__DIRECTIONS, oldDirections, newDirections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirections(Edge_Direction newDirections) {
		if (newDirections != directions) {
			NotificationChain msgs = null;
			if (directions != null)
				msgs = ((InternalEObject)directions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE__DIRECTIONS, null, msgs);
			if (newDirections != null)
				msgs = ((InternalEObject)newDirections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE__DIRECTIONS, null, msgs);
			msgs = basicSetDirections(newDirections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE__DIRECTIONS, newDirections, newDirections));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE__EDGE_STYLE, oldEdge_style, newEdge_style);
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
				msgs = ((InternalEObject)edge_style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE__EDGE_STYLE, null, msgs);
			if (newEdge_style != null)
				msgs = ((InternalEObject)newEdge_style).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE__EDGE_STYLE, null, msgs);
			msgs = basicSetEdge_style(newEdge_style, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE__EDGE_STYLE, newEdge_style, newEdge_style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLabel getEdgeLabel() {
		return edgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeLabel(GeneralLabel newEdgeLabel, NotificationChain msgs) {
		GeneralLabel oldEdgeLabel = edgeLabel;
		edgeLabel = newEdgeLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE__EDGE_LABEL, oldEdgeLabel, newEdgeLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeLabel(GeneralLabel newEdgeLabel) {
		if (newEdgeLabel != edgeLabel) {
			NotificationChain msgs = null;
			if (edgeLabel != null)
				msgs = ((InternalEObject)edgeLabel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE__EDGE_LABEL, null, msgs);
			if (newEdgeLabel != null)
				msgs = ((InternalEObject)newEdgeLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Graphic_representationPackage.EDGE__EDGE_LABEL, null, msgs);
			msgs = basicSetEdgeLabel(newEdgeLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Graphic_representationPackage.EDGE__EDGE_LABEL, newEdgeLabel, newEdgeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalEdgeStyle> getConditionalEdgeStyle() {
		if (conditionalEdgeStyle == null) {
			conditionalEdgeStyle = new EObjectContainmentEList<ConditionalEdgeStyle>(ConditionalEdgeStyle.class, this, Graphic_representationPackage.EDGE__CONDITIONAL_EDGE_STYLE);
		}
		return conditionalEdgeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Graphic_representationPackage.EDGE__DIRECTIONS:
				return basicSetDirections(null, msgs);
			case Graphic_representationPackage.EDGE__EDGE_STYLE:
				return basicSetEdge_style(null, msgs);
			case Graphic_representationPackage.EDGE__EDGE_LABEL:
				return basicSetEdgeLabel(null, msgs);
			case Graphic_representationPackage.EDGE__CONDITIONAL_EDGE_STYLE:
				return ((InternalEList<?>)getConditionalEdgeStyle()).basicRemove(otherEnd, msgs);
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
			case Graphic_representationPackage.EDGE__DIRECTIONS:
				return getDirections();
			case Graphic_representationPackage.EDGE__EDGE_STYLE:
				return getEdge_style();
			case Graphic_representationPackage.EDGE__EDGE_LABEL:
				return getEdgeLabel();
			case Graphic_representationPackage.EDGE__CONDITIONAL_EDGE_STYLE:
				return getConditionalEdgeStyle();
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
			case Graphic_representationPackage.EDGE__DIRECTIONS:
				setDirections((Edge_Direction)newValue);
				return;
			case Graphic_representationPackage.EDGE__EDGE_STYLE:
				setEdge_style((Edge_Style)newValue);
				return;
			case Graphic_representationPackage.EDGE__EDGE_LABEL:
				setEdgeLabel((GeneralLabel)newValue);
				return;
			case Graphic_representationPackage.EDGE__CONDITIONAL_EDGE_STYLE:
				getConditionalEdgeStyle().clear();
				getConditionalEdgeStyle().addAll((Collection<? extends ConditionalEdgeStyle>)newValue);
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
			case Graphic_representationPackage.EDGE__DIRECTIONS:
				setDirections((Edge_Direction)null);
				return;
			case Graphic_representationPackage.EDGE__EDGE_STYLE:
				setEdge_style((Edge_Style)null);
				return;
			case Graphic_representationPackage.EDGE__EDGE_LABEL:
				setEdgeLabel((GeneralLabel)null);
				return;
			case Graphic_representationPackage.EDGE__CONDITIONAL_EDGE_STYLE:
				getConditionalEdgeStyle().clear();
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
			case Graphic_representationPackage.EDGE__DIRECTIONS:
				return directions != null;
			case Graphic_representationPackage.EDGE__EDGE_STYLE:
				return edge_style != null;
			case Graphic_representationPackage.EDGE__EDGE_LABEL:
				return edgeLabel != null;
			case Graphic_representationPackage.EDGE__CONDITIONAL_EDGE_STYLE:
				return conditionalEdgeStyle != null && !conditionalEdgeStyle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EdgeImpl
