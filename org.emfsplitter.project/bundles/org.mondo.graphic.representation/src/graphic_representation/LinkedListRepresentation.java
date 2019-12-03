/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linked List Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.LinkedListRepresentation#getInit <em>Init</em>}</li>
 *   <li>{@link graphic_representation.LinkedListRepresentation#getNodeShape <em>Node Shape</em>}</li>
 *   <li>{@link graphic_representation.LinkedListRepresentation#getEnd <em>End</em>}</li>
 *   <li>{@link graphic_representation.LinkedListRepresentation#getInitToFirst <em>Init To First</em>}</li>
 *   <li>{@link graphic_representation.LinkedListRepresentation#getNodeToNode <em>Node To Node</em>}</li>
 *   <li>{@link graphic_representation.LinkedListRepresentation#getNodeToEnd <em>Node To End</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getLinkedListRepresentation()
 * @model
 * @generated
 */
public interface LinkedListRepresentation extends RepresentationStyle {
	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getLinkedListRepresentation_Init()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInit();

	/**
	 * Sets the value of the '{@link graphic_representation.LinkedListRepresentation#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(Shape value);

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
	 * @see graphic_representation.Graphic_representationPackage#getLinkedListRepresentation_NodeShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getNodeShape();

	/**
	 * Sets the value of the '{@link graphic_representation.LinkedListRepresentation#getNodeShape <em>Node Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Shape</em>' containment reference.
	 * @see #getNodeShape()
	 * @generated
	 */
	void setNodeShape(Shape value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getLinkedListRepresentation_End()
	 * @model containment="true"
	 * @generated
	 */
	Shape getEnd();

	/**
	 * Sets the value of the '{@link graphic_representation.LinkedListRepresentation#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Shape value);

	/**
	 * Returns the value of the '<em><b>Init To First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init To First</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init To First</em>' containment reference.
	 * @see #setInitToFirst(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getLinkedListRepresentation_InitToFirst()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getInitToFirst();

	/**
	 * Sets the value of the '{@link graphic_representation.LinkedListRepresentation#getInitToFirst <em>Init To First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init To First</em>' containment reference.
	 * @see #getInitToFirst()
	 * @generated
	 */
	void setInitToFirst(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Node To Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node To Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node To Node</em>' containment reference.
	 * @see #setNodeToNode(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getLinkedListRepresentation_NodeToNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getNodeToNode();

	/**
	 * Sets the value of the '{@link graphic_representation.LinkedListRepresentation#getNodeToNode <em>Node To Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To Node</em>' containment reference.
	 * @see #getNodeToNode()
	 * @generated
	 */
	void setNodeToNode(CompartmentEdge value);

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
	 * @see graphic_representation.Graphic_representationPackage#getLinkedListRepresentation_NodeToEnd()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getNodeToEnd();

	/**
	 * Sets the value of the '{@link graphic_representation.LinkedListRepresentation#getNodeToEnd <em>Node To End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To End</em>' containment reference.
	 * @see #getNodeToEnd()
	 * @generated
	 */
	void setNodeToEnd(CompartmentEdge value);

} // LinkedListRepresentation
