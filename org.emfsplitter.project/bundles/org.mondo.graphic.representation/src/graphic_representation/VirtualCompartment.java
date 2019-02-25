/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Compartment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.VirtualCompartment#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getVirtualCompartment()
 * @model abstract="true"
 * @generated
 */
public interface VirtualCompartment extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link graphic_representation.Node#getVirtualCompartments <em>Virtual Compartments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see graphic_representation.Graphic_representationPackage#getVirtualCompartment_Node()
	 * @see graphic_representation.Node#getVirtualCompartments
	 * @model opposite="virtualCompartments"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link graphic_representation.VirtualCompartment#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // VirtualCompartment
