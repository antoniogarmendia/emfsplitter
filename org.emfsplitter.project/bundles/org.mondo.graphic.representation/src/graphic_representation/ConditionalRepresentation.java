/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EReference;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getInitShape <em>Init Shape</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getIfShape <em>If Shape</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getThenShape <em>Then Shape</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getElseShape <em>Else Shape</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getEndShape <em>End Shape</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getInitToIf <em>Init To If</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getIfToThenNode <em>If To Then Node</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getThenNodeToEndNode <em>Then Node To End Node</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getIfNodeToElseNode <em>If Node To Else Node</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getElseNodeToEndNode <em>Else Node To End Node</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getThenReference <em>Then Reference</em>}</li>
 *   <li>{@link graphic_representation.ConditionalRepresentation#getElseReference <em>Else Reference</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation()
 * @model
 * @generated
 */
public interface ConditionalRepresentation extends RepresentationStyle {

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
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_InitShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getInitShape();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getInitShape <em>Init Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Shape</em>' containment reference.
	 * @see #getInitShape()
	 * @generated
	 */
	void setInitShape(Shape value);

	/**
	 * Returns the value of the '<em><b>If Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Shape</em>' containment reference.
	 * @see #setIfShape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_IfShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getIfShape();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getIfShape <em>If Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Shape</em>' containment reference.
	 * @see #getIfShape()
	 * @generated
	 */
	void setIfShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Then Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Shape</em>' containment reference.
	 * @see #setThenShape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_ThenShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getThenShape();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getThenShape <em>Then Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Shape</em>' containment reference.
	 * @see #getThenShape()
	 * @generated
	 */
	void setThenShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Else Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Shape</em>' containment reference.
	 * @see #setElseShape(Shape)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_ElseShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getElseShape();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getElseShape <em>Else Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Shape</em>' containment reference.
	 * @see #getElseShape()
	 * @generated
	 */
	void setElseShape(Shape value);

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
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_EndShape()
	 * @model containment="true"
	 * @generated
	 */
	Shape getEndShape();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getEndShape <em>End Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Shape</em>' containment reference.
	 * @see #getEndShape()
	 * @generated
	 */
	void setEndShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Init To If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init To If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init To If</em>' containment reference.
	 * @see #setInitToIf(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_InitToIf()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getInitToIf();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getInitToIf <em>Init To If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init To If</em>' containment reference.
	 * @see #getInitToIf()
	 * @generated
	 */
	void setInitToIf(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>If To Then Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If To Then Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If To Then Node</em>' containment reference.
	 * @see #setIfToThenNode(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_IfToThenNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getIfToThenNode();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getIfToThenNode <em>If To Then Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If To Then Node</em>' containment reference.
	 * @see #getIfToThenNode()
	 * @generated
	 */
	void setIfToThenNode(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Then Node To End Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Node To End Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Node To End Node</em>' containment reference.
	 * @see #setThenNodeToEndNode(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_ThenNodeToEndNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getThenNodeToEndNode();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getThenNodeToEndNode <em>Then Node To End Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Node To End Node</em>' containment reference.
	 * @see #getThenNodeToEndNode()
	 * @generated
	 */
	void setThenNodeToEndNode(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>If Node To Else Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Node To Else Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Node To Else Node</em>' containment reference.
	 * @see #setIfNodeToElseNode(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_IfNodeToElseNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getIfNodeToElseNode();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getIfNodeToElseNode <em>If Node To Else Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Node To Else Node</em>' containment reference.
	 * @see #getIfNodeToElseNode()
	 * @generated
	 */
	void setIfNodeToElseNode(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Else Node To End Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Node To End Node</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Node To End Node</em>' containment reference.
	 * @see #setElseNodeToEndNode(CompartmentEdge)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_ElseNodeToEndNode()
	 * @model containment="true"
	 * @generated
	 */
	CompartmentEdge getElseNodeToEndNode();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getElseNodeToEndNode <em>Else Node To End Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Node To End Node</em>' containment reference.
	 * @see #getElseNodeToEndNode()
	 * @generated
	 */
	void setElseNodeToEndNode(CompartmentEdge value);

	/**
	 * Returns the value of the '<em><b>Then Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Reference</em>' reference.
	 * @see #setThenReference(EReference)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_ThenReference()
	 * @model
	 * @generated
	 */
	EReference getThenReference();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getThenReference <em>Then Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Reference</em>' reference.
	 * @see #getThenReference()
	 * @generated
	 */
	void setThenReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Else Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Reference</em>' reference.
	 * @see #setElseReference(EReference)
	 * @see graphic_representation.Graphic_representationPackage#getConditionalRepresentation_ElseReference()
	 * @model
	 * @generated
	 */
	EReference getElseReference();

	/**
	 * Sets the value of the '{@link graphic_representation.ConditionalRepresentation#getElseReference <em>Else Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Reference</em>' reference.
	 * @see #getElseReference()
	 * @generated
	 */
	void setElseReference(EReference value);
} // ConditionalRepresentation
