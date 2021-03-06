/**
 */
package graphic_representation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graphic_representation.Node_Element#getLinkPalette <em>Link Palette</em>}</li>
 *   <li>{@link graphic_representation.Node_Element#getAffixedCompartmentElements <em>Affixed Compartment Elements</em>}</li>
 *   <li>{@link graphic_representation.Node_Element#getExpandableItems <em>Expandable Items</em>}</li>
 *   <li>{@link graphic_representation.Node_Element#getVirtualCompartment <em>Virtual Compartment</em>}</li>
 * </ul>
 *
 * @see graphic_representation.Graphic_representationPackage#getNode_Element()
 * @model
 * @generated
 */
public interface Node_Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Palette</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.PaletteDescriptionLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Palette</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Palette</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getNode_Element_LinkPalette()
	 * @model containment="true"
	 * @generated
	 */
	EList<PaletteDescriptionLink> getLinkPalette();

	/**
	 * Returns the value of the '<em><b>Affixed Compartment Elements</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.AffixedCompartmentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affixed Compartment Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affixed Compartment Elements</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getNode_Element_AffixedCompartmentElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AffixedCompartmentElement> getAffixedCompartmentElements();

	/**
	 * Returns the value of the '<em><b>Expandable Items</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.ExpandableItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expandable Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expandable Items</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getNode_Element_ExpandableItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExpandableItem> getExpandableItems();

	/**
	 * Returns the value of the '<em><b>Virtual Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link graphic_representation.VirtualCompartment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Compartment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Compartment</em>' containment reference list.
	 * @see graphic_representation.Graphic_representationPackage#getNode_Element_VirtualCompartment()
	 * @model containment="true"
	 * @generated
	 */
	EList<VirtualCompartment> getVirtualCompartment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOnlyCompartment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isCompartmentAffixed();

} // Node_Element
