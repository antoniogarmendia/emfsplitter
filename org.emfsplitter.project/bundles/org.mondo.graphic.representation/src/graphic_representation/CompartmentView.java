/**
 */
package graphic_representation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Compartment View</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see graphic_representation.Graphic_representationPackage#getCompartmentView()
 * @model
 * @generated
 */
public enum CompartmentView implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Linked List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINKED_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LINKED_LIST(1, "LinkedList", "Linked List"), /**
	 * The '<em><b>Conditional Representation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_REPRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITIONAL_REPRESENTATION(2, "ConditionalRepresentation", "ConditionalRepresentation"), /**
	 * The '<em><b>Loop Representation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOOP_REPRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOOP_REPRESENTATION(3, "LoopRepresentation", "LoopRepresentation"), /**
	 * The '<em><b>Tree Representation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREE_REPRESENTATION_VALUE
	 * @generated
	 * @ordered
	 */
	TREE_REPRESENTATION(4, "TreeRepresentation", "TreeRepresentation");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Linked List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINKED LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINKED_LIST
	 * @model name="LinkedList" literal="Linked List"
	 * @generated
	 * @ordered
	 */
	public static final int LINKED_LIST_VALUE = 1;

	/**
	 * The '<em><b>Conditional Representation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conditional Representation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITIONAL_REPRESENTATION
	 * @model name="ConditionalRepresentation"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITIONAL_REPRESENTATION_VALUE = 2;

	/**
	 * The '<em><b>Loop Representation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Loop Representation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOOP_REPRESENTATION
	 * @model name="LoopRepresentation"
	 * @generated
	 * @ordered
	 */
	public static final int LOOP_REPRESENTATION_VALUE = 3;

	/**
	 * The '<em><b>Tree Representation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tree Representation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREE_REPRESENTATION
	 * @model name="TreeRepresentation"
	 * @generated
	 * @ordered
	 */
	public static final int TREE_REPRESENTATION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Compartment View</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompartmentView[] VALUES_ARRAY =
		new CompartmentView[] {
			NONE,
			LINKED_LIST,
			CONDITIONAL_REPRESENTATION,
			LOOP_REPRESENTATION,
			TREE_REPRESENTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Compartment View</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompartmentView> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compartment View</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompartmentView get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompartmentView result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compartment View</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompartmentView getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompartmentView result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compartment View</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompartmentView get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case LINKED_LIST_VALUE: return LINKED_LIST;
			case CONDITIONAL_REPRESENTATION_VALUE: return CONDITIONAL_REPRESENTATION;
			case LOOP_REPRESENTATION_VALUE: return LOOP_REPRESENTATION;
			case TREE_REPRESENTATION_VALUE: return TREE_REPRESENTATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CompartmentView(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //CompartmentView
