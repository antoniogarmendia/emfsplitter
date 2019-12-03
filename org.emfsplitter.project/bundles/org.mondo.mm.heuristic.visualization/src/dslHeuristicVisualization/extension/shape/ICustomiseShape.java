package dslHeuristicVisualization.extension.shape;

import graphic_representation.Edge;
import graphic_representation.Edge_Style;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Shape;
import org.eclipse.emf.ecore.EObject;

public interface ICustomiseShape {
	
	public void setNodeShape(Node node, String folderPath, String platformPath);
	
	public void setCompartmentShape(Node node);
	
	public void setEdgeClassStyle(Edge edge);
	
	public void setLinkStyle(PaletteDescriptionLink link);

} 
