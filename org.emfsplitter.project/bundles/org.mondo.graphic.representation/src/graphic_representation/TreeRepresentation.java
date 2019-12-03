/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.TreeRepresentation#getInitShape <em>Init Shape</em>}</li>
 *   <li>{@link graphic_representation.TreeRepresentation#getRootShape <em>Root Shape</em>}</li>
 *   <li>{@link graphic_representation.TreeRepresentation#getNodeShape <em>Node Shape</em>}</li>
 *   <li>{@link graphic_representation.TreeRepresentation#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link graphic_representation.TreeRepresentation#getInitToRootShape <em>Init To Root Shape</em>}</li>
 *   <li>{@link graphic_representation.TreeRepresentation#getRootShapeToNode <em>Root Shape To Node</em>}</li>
 *   <li>{@link graphic_representation.TreeRepresentation#getNodeShapeToEndShape <em>Node Shape To End Shape</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation()
 * @model
 * @generated
 */
public interface TreeRepresentation extends RepresentationStyle {
	/**
	 * Returns the value of the '<em><b>Init Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Shape</em>' containment reference.
	 * @see #setInitShape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation_InitShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInitShape();

	/**
	 * Sets the value of the '{@link graphic_representation.TreeRepresentation#getInitShape <em>Init Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Shape</em>' containment reference.
	 * @see #getInitShape()
	 * @generated
	 */
	void setInitShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Root Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Shape</em>' containment reference.
	 * @see #setRootShape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation_RootShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getRootShape();

	/**
	 * Sets the value of the '{@link graphic_representation.TreeRepresentation#getRootShape <em>Root Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Shape</em>' containment reference.
	 * @see #getRootShape()
	 * @generated
	 */
	void setRootShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Node Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Shape</em>' containment reference.
	 * @see #setNodeShape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation_NodeShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getNodeShape();

	/**
	 * Sets the value of the '{@link graphic_representation.TreeRepresentation#getNodeShape <em>Node Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Shape</em>' containment reference.
	 * @see #getNodeShape()
	 * @generated
	 */
	void setNodeShape(Shape value);

	/**
	 * Returns the value of the '<em><b>End Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Shape</em>' containment reference.
	 * @see #setEndShape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation_EndShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getEndShape();

	/**
	 * Sets the value of the '{@link graphic_representation.TreeRepresentation#getEndShape <em>End Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Shape</em>' containment reference.
	 * @see #getEndShape()
	 * @generated
	 */
	void setEndShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Init To Root Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init To Root Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init To Root Shape</em>' containment reference.
	 * @see #setInitToRootShape(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation_InitToRootShape()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getInitToRootShape();

	/**
	 * Sets the value of the '{@link graphic_representation.TreeRepresentation#getInitToRootShape <em>Init To Root Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init To Root Shape</em>' containment reference.
	 * @see #getInitToRootShape()
	 * @generated
	 */
	void setInitToRootShape(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Root Shape To Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Shape To Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Shape To Node</em>' containment reference.
	 * @see #setRootShapeToNode(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation_RootShapeToNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getRootShapeToNode();

	/**
	 * Sets the value of the '{@link graphic_representation.TreeRepresentation#getRootShapeToNode <em>Root Shape To Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Shape To Node</em>' containment reference.
	 * @see #getRootShapeToNode()
	 * @generated
	 */
	void setRootShapeToNode(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Node Shape To End Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Shape To End Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Shape To End Shape</em>' containment reference.
	 * @see #setNodeShapeToEndShape(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getTreeRepresentation_NodeShapeToEndShape()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getNodeShapeToEndShape();

	/**
	 * Sets the value of the '{@link graphic_representation.TreeRepresentation#getNodeShapeToEndShape <em>Node Shape To End Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Shape To End Shape</em>' containment reference.
	 * @see #getNodeShapeToEndShape()
	 * @generated
	 */
	void setNodeShapeToEndShape(CompartmentEdge value);

} // TreeRepresentation
