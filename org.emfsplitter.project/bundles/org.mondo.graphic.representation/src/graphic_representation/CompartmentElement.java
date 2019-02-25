/**
 */
package graphic_representation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compartment Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.CompartmentElement#getCompartmentView <em>Compartment View</em>}</li>
 *   <li>{@link graphic_representation.CompartmentElement#getInit <em>Init</em>}</li>
 *   <li>{@link graphic_representation.CompartmentElement#getNodeShape <em>Node Shape</em>}</li>
 *   <li>{@link graphic_representation.CompartmentElement#getEnd <em>End</em>}</li>
 *   <li>{@link graphic_representation.CompartmentElement#getInitToFirst <em>Init To First</em>}</li>
 *   <li>{@link graphic_representation.CompartmentElement#getNodeToNode <em>Node To Node</em>}</li>
 *   <li>{@link graphic_representation.CompartmentElement#getNodeToEnd <em>Node To End</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement()
 * @model
 * @generated
 */
public interface CompartmentElement extends AffixedCompartmentElement {

	/**
	 * Returns the value of the '<em><b>Compartment View</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link graphic_representation.CompartmentView}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment View</em>' attribute.
	 * @see graphic_representation.CompartmentView
	 * @see #setCompartmentView(CompartmentView)
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_CompartmentView()
	 * @model default="None"
	 * @generated
	 */
	CompartmentView getCompartmentView();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getCompartmentView <em>Compartment View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compartment View</em>' attribute.
	 * @see graphic_representation.CompartmentView
	 * @see #getCompartmentView()
	 * @generated
	 */
	void setCompartmentView(CompartmentView value);

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
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_Init()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInit();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getInit <em>Init</em>}' containment reference.
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
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_NodeShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getNodeShape();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getNodeShape <em>Node Shape</em>}' containment reference.
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
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_End()
	 * @model containment="true"
	 * @generated
	 */
	Shape getEnd();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getEnd <em>End</em>}' containment reference.
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
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_InitToFirst()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getInitToFirst();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getInitToFirst <em>Init To First</em>}' containment reference.
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
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_NodeToNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getNodeToNode();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getNodeToNode <em>Node To Node</em>}' containment reference.
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
	 * @see graphic_representation.Graphic_representationPackage#getCompartmentElement_NodeToEnd()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getNodeToEnd();

	/**
	 * Sets the value of the '{@link graphic_representation.CompartmentElement#getNodeToEnd <em>Node To End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To End</em>' containment reference.
	 * @see #getNodeToEnd()
	 * @generated
	 */
	void setNodeToEnd(CompartmentEdge value);
} // CompartmentElement
