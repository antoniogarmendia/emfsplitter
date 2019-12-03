/**
 */
package dslHeuristicVisualization;

import graphic_representation.Node;
import graphic_representation.Shape;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Graphical Style</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see dslHeuristicVisualization.DslHeuristicVisualizationPackage#getStrategyGraphicalStyle()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface StrategyGraphicalStyle extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Shape getNodeShape(Node node, String folderPath, String platformPath);

} // StrategyGraphicalStyle
