/**
 */
package graphic_representation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Decorator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.EdgeDecorator#getDecoratorName <em>Decorator Name</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getEdgeDecorator()
 * @model
 * @generated
 */
public interface EdgeDecorator extends EObject {
	/**
	 * Returns the value of the '<em><b>Decorator Name</b></em>' attribute.
	 * The default value is <code>"NoDecoration"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decorator Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decorator Name</em>' attribute.
	 * @see #setDecoratorName(String)
	 * @see graphic_representation.Graphic_representationPackage#getEdgeDecorator_DecoratorName()
	 * @model default="NoDecoration"
	 * @generated
	 */
	String getDecoratorName();

	/**
	 * Sets the value of the '{@link graphic_representation.EdgeDecorator#getDecoratorName <em>Decorator Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decorator Name</em>' attribute.
	 * @see #getDecoratorName()
	 * @generated
	 */
	void setDecoratorName(String value);

} // EdgeDecorator
