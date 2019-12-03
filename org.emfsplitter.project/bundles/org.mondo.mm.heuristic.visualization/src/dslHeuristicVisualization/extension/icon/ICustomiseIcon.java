package dslHeuristicVisualization.extension.icon;

import graphic_representation.IconElement;
import graphic_representation.Node;

public interface ICustomiseIcon {
	
	public void setNodeIcon(Node node, String folderPath, String platformPath);
	public void newSearchIcons(IconElement iconElement);
} 
