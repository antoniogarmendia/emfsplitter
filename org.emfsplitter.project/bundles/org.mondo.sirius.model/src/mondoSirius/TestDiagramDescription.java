/**
 */
package mondoSirius;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.diagram.description.DiagramDescription;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Diagram Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mondoSirius.TestDiagramDescription#getDiagramDescription <em>Diagram Description</em>}</li>
 * </ul>
 *
 * @see mondoSirius.MondoSiriusPackage#getTestDiagramDescription()
 * @model abstract="true"
 * @generated
 */
public interface TestDiagramDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagram Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Description</em>' reference.
	 * @see #setDiagramDescription(DiagramDescription)
	 * @see mondoSirius.MondoSiriusPackage#getTestDiagramDescription_DiagramDescription()
	 * @model
	 * @generated
	 */
	DiagramDescription getDiagramDescription();

	/**
	 * Sets the value of the '{@link mondoSirius.TestDiagramDescription#getDiagramDescription <em>Diagram Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Description</em>' reference.
	 * @see #getDiagramDescription()
	 * @generated
	 */
	void setDiagramDescription(DiagramDescription value);

} // TestDiagramDescription
