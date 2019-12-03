/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.LoopRepresentation#getInitShape <em>Init Shape</em>}</li>
 *   <li>{@link graphic_representation.LoopRepresentation#getNodeShape <em>Node Shape</em>}</li>
 *   <li>{@link graphic_representation.LoopRepresentation#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link graphic_representation.LoopRepresentation#getInitToNode <em>Init To Node</em>}</li>
 *   <li>{@link graphic_representation.LoopRepresentation#getRecursiveEdge <em>Recursive Edge</em>}</li>
 *   <li>{@link graphic_representation.LoopRepresentation#getNodeToEnd <em>Node To End</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getLoopRepresentation()
 * @model
 * @generated
 */
public interface LoopRepresentation extends RepresentationStyle {

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
	 * @see graphic_representation.Graphic_representationPackage#getLoopRepresentation_InitShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInitShape();

	/**
	 * Sets the value of the '{@link graphic_representation.LoopRepresentation#getInitShape <em>Init Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Shape</em>' containment reference.
	 * @see #getInitShape()
	 * @generated
	 */
	void setInitShape(Shape value);

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
	 * @see graphic_representation.Graphic_representationPackage#getLoopRepresentation_NodeShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getNodeShape();

	/**
	 * Sets the value of the '{@link graphic_representation.LoopRepresentation#getNodeShape <em>Node Shape</em>}' containment reference.
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
	 * @see graphic_representation.Graphic_representationPackage#getLoopRepresentation_EndShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getEndShape();

	/**
	 * Sets the value of the '{@link graphic_representation.LoopRepresentation#getEndShape <em>End Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Shape</em>' containment reference.
	 * @see #getEndShape()
	 * @generated
	 */
	void setEndShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Init To Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init To Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init To Node</em>' containment reference.
	 * @see #setInitToNode(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getLoopRepresentation_InitToNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getInitToNode();

	/**
	 * Sets the value of the '{@link graphic_representation.LoopRepresentation#getInitToNode <em>Init To Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init To Node</em>' containment reference.
	 * @see #getInitToNode()
	 * @generated
	 */
	void setInitToNode(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Recursive Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recursive Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recursive Edge</em>' containment reference.
	 * @see #setRecursiveEdge(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getLoopRepresentation_RecursiveEdge()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getRecursiveEdge();

	/**
	 * Sets the value of the '{@link graphic_representation.LoopRepresentation#getRecursiveEdge <em>Recursive Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recursive Edge</em>' containment reference.
	 * @see #getRecursiveEdge()
	 * @generated
	 */
	void setRecursiveEdge(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Node To End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node To End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node To End</em>' containment reference.
	 * @see #setNodeToEnd(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getLoopRepresentation_NodeToEnd()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getNodeToEnd();

	/**
	 * Sets the value of the '{@link graphic_representation.LoopRepresentation#getNodeToEnd <em>Node To End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To End</em>' containment reference.
	 * @see #getNodeToEnd()
	 * @generated
	 */
	void setNodeToEnd(CompartmentEdge value);
} // LoopRepresentation
