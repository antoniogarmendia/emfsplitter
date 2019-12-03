/**
 */
package graphic_representation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Label Bordered Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see graphic_representation.Graphic_representationPackage#getLabelBorderedStyle()
 * @model
 * @generated
 */
public enum LabelBorderedStyle implements Enumerator {
	/**
	 * The '<em><b>Not Defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_DEFINED(0, "NotDefined", "NotDefined"),

	/**
	 * The '<em><b>Label Border For Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_BORDER_FOR_CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL_BORDER_FOR_CONTAINER(1, "LabelBorderForContainer", "LabelBorderForContainer"),

	/**
	 * The '<em><b>Label Border Style With Beveled Corner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_BORDER_STYLE_WITH_BEVELED_CORNER_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL_BORDER_STYLE_WITH_BEVELED_CORNER(2, "LabelBorderStyleWithBeveledCorner", "LabelBorderStyleWithBeveledCorner"),

	/**
	 * The '<em><b>No Label Border For List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_LABEL_BORDER_FOR_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	NO_LABEL_BORDER_FOR_LIST(3, "NoLabelBorderForList", "NoLabelBorderForList");

	/**
	 * The '<em><b>Not Defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT DEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFINED
	 * @model name="NotDefined"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_DEFINED_VALUE = 0;

	/**
	 * The '<em><b>Label Border For Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Label Border For Container</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL_BORDER_FOR_CONTAINER
	 * @model name="LabelBorderForContainer"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_BORDER_FOR_CONTAINER_VALUE = 1;

	/**
	 * The '<em><b>Label Border Style With Beveled Corner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Label Border Style With Beveled Corner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LABEL_BORDER_STYLE_WITH_BEVELED_CORNER
	 * @model name="LabelBorderStyleWithBeveledCorner"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_BORDER_STYLE_WITH_BEVELED_CORNER_VALUE = 2;

	/**
	 * The '<em><b>No Label Border For List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Label Border For List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_LABEL_BORDER_FOR_LIST
	 * @model name="NoLabelBorderForList"
	 * @generated
	 * @ordered
	 */
	public static final int NO_LABEL_BORDER_FOR_LIST_VALUE = 3;

	/**
	 * An array of all the '<em><b>Label Bordered Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LabelBorderedStyle[] VALUES_ARRAY =
		new LabelBorderedStyle[] {
			NOT_DEFINED,
			LABEL_BORDER_FOR_CONTAINER,
			LABEL_BORDER_STYLE_WITH_BEVELED_CORNER,
			NO_LABEL_BORDER_FOR_LIST,
		};

	/**
	 * A public read-only list of all the '<em><b>Label Bordered Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LabelBorderedStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Label Bordered Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelBorderedStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelBorderedStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Bordered Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelBorderedStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LabelBorderedStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Label Bordered Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LabelBorderedStyle get(int value) {
		switch (value) {
			case NOT_DEFINED_VALUE: return NOT_DEFINED;
			case LABEL_BORDER_FOR_CONTAINER_VALUE: return LABEL_BORDER_FOR_CONTAINER;
			case LABEL_BORDER_STYLE_WITH_BEVELED_CORNER_VALUE: return LABEL_BORDER_STYLE_WITH_BEVELED_CORNER;
			case NO_LABEL_BORDER_FOR_LIST_VALUE: return NO_LABEL_BORDER_FOR_LIST;
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
	private LabelBorderedStyle(int value, String name, String literal) {
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
	
} //LabelBorderedStyle
