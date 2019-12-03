package org.mondo.visualization.ui.page.LabelProvider;

import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.CompartmentLink;
import graphic_representation.ConditionalEdgeStyle;
import graphic_representation.ConditionalRepresentation;
import graphic_representation.ConditionalStyle;
import graphic_representation.DiagramElement;
import graphic_representation.Edge;
import graphic_representation.EdgeDecorator;
import graphic_representation.Edge_Direction;
import graphic_representation.LabelEAttribute;
import graphic_representation.LabelOCL;
import graphic_representation.Link;
import graphic_representation.LinkedListRepresentation;
import graphic_representation.LoopRepresentation;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.TreeRepresentation;
import graphic_representation.WEAttribute;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

public class CDiagramElement extends ColumnLabelProvider{

	public CDiagramElement() {
		
		super();		
	}

	@Override
	public Image getImage(Object element) {
		
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if(element instanceof DiagramElement)
			return ((DiagramElement)element).getAnEClass().getName();
		if(element instanceof EdgeDecorator) {
			EdgeDecorator edgeDecorator = (EdgeDecorator) element;
			String containmentFeature = edgeDecorator.eContainmentFeature().getName();
			if (containmentFeature.equals("decoratorSource"))
				return "Source Edge";
			else
				return "Target Edge";
		}
		
		if(element instanceof Link)
		{
			EObject parentElement = ((Link) element).eContainer();
			if(parentElement instanceof Edge_Direction)
			{
				EObject parentEdgeDirection = parentElement.eContainer();
				if(parentEdgeDirection instanceof Edge)
				{
					Edge edg = (Edge)parentEdgeDirection;
					if(edg.getDirections().getSourceLink().equals(element))
						return edg.getDirections().getSourceLink().getAnEReference().getName().concat("(Source)");
					else
						return edg.getDirections().getTargetLink().getAnEReference().getName().concat("(Target)");
				}				
			}
			else
				return ((Link) element).getAnEReference().getName().concat("(Link)");
		}
		
		if(element instanceof Root)
			return ((Root) element).getAnEClass().getName();
		
		if(element instanceof LabelEAttribute)
			return createLabelEAttribute(((LabelEAttribute) element).getLabelAttributes());
		if(element instanceof LabelOCL)
			return "OCL: " + ((LabelOCL) element).getOclExpression();
		
		
		if(element instanceof Object[]) {
			Object[] objs = (Object[])element;
			Object cad = objs[0];
			Object objLink = objs[1];
			if(objLink instanceof Link && cad instanceof String)
				return ((Link) objLink).getAnEReference().getName().concat("(" + ((String)cad) + ")" );
		}
		
		if(element instanceof CompartmentElement) {
			CompartmentElement compart = (CompartmentElement) element;
			return "Compartment: " + compart.getAnEReference().getName();			
		}
		
		if (element instanceof ConditionalStyle) {
			
			return "Conditional Style: ".concat(((ConditionalStyle) element).getEAttribute().getName() + "=" +
						((ConditionalStyle) element).getValue());						
		}	
		
		if (element instanceof ConditionalEdgeStyle) {
			
			return "Edge Conditional Style: OCL Constraint";
		}
		
		if (element instanceof Shape) {
			
			Shape sh = (Shape) element;
			EObject parentContainer = sh.eContainer();
			EStructuralFeature structural = sh.eContainingFeature();
			
			if (parentContainer instanceof LinkedListRepresentation) {
			
				if (structural.getName().equals("init"))		
					return "Init Node Shape";
				if (structural.getName().equals("nodeShape"))
					return "Node Shape";
				if (structural.getName().equals("end"))
					return "End Node Shape";			
			}
			
			if (parentContainer instanceof LoopRepresentation) {
				
				if (structural.getName().equals("initShape"))		
					return "Init Node Shape";
				if (structural.getName().equals("nodeShape"))
					return "Node Shape";
				if (structural.getName().equals("endShape"))
					return "End Node Shape";				
			}	
			
			if (parentContainer instanceof ConditionalRepresentation) {
				
				if (structural.getName().equals("initShape"))		
					return "Init Node Shape";
				if (structural.getName().equals("ifShape"))
					return "If Shape";
				if (structural.getName().equals("thenShape"))
					return "Then Node Shape";
				if (structural.getName().equals("elseShape"))
					return "Else Node Shape";
				if (structural.getName().equals("endShape"))
					return "End Node Shape";
			}	
			
			if (parentContainer instanceof TreeRepresentation) {
				
				if (structural.getName().equals("initShape"))
					return "Init Node Shape";
				if (structural.getName().equals("rootShape"))
					return "Root Shape";
				if (structural.getName().equals("nodeShape"))
					return "Node Shape";
				if (structural.getName().equals("endShape"))
					return "End NodeShape";
			}
		}
		
		if (element instanceof CompartmentEdge) {
			CompartmentEdge compart = (CompartmentEdge) element;
			
			EObject parentContainer = compart.eContainer();
			
			if (parentContainer instanceof LinkedListRepresentation) {			
				EStructuralFeature structural = compart.eContainingFeature();
				if (structural.getName().equals("initToFirst"))
					return "Edge from Init Node to First One";
				if (structural.getName().equals("nodeToNode"))
					return "Edge from Node to Node";
				if (structural.getName().equals("nodeToEnd"))
					return "Edge from Last Node to the End";
			}
			
			if (parentContainer instanceof LoopRepresentation) {
				EStructuralFeature structural = compart.eContainingFeature();
				if (structural.getName().equals("initToNode"))
					return "Edge from Init Node to Loop Node";
				if (structural.getName().equals("recursiveEdge"))
					return "Recursive Edge";
				if (structural.getName().equals("nodeToEnd"))
					return "Edge from Node to the End";
			}
			
			if (parentContainer instanceof ConditionalRepresentation) {
				EStructuralFeature structural = compart.eContainingFeature();
				if (structural.getName().equals("initToIf"))
					return "Edge from Init Node to If Node";
				if (structural.getName().equals("ifToThenNode"))
					return "Edge from If Node to Then Node";
				if (structural.getName().equals("thenNodeToEndNode"))
					return "Edge from Then Node to the End Node";
				if (structural.getName().equals("ifNodeToElseNode"))
					return "Edge from If Node to the Else Node";
				if (structural.getName().equals("elseNodeToEndNode"))
					return "Edge from Else Node to the End Node";				
			}
			
			if (parentContainer instanceof TreeRepresentation) {
				EStructuralFeature structural = compart.eContainingFeature();
				if (structural.getName().equals("initToRootShape"))
					return "Edge from Init Node to Root Shape";
				if (structural.getName().equals("rootShapeToNode"))
					return "Edge from Root Shape to Node Shape";
				if (structural.getName().equals("nodeShapeToEndShape"))
					return "Edge from Node Shape to End Shape";
			}
		}
		
		if (element instanceof CompartmentLink) {
			
			CompartmentLink link = (CompartmentLink) element;
			EStructuralFeature structural = link.eContainingFeature();
			if (structural.getName().equals("source"))
				return "Source Edge";
			else 
				return "Target Edge";
			
		}
		
		return super.getText(element);
	}

	private String createLabelEAttribute(EList<WEAttribute> labelAttributes) {
		
		String result = "Label(";
		Iterator<WEAttribute> itLabelWEAttributes = labelAttributes.iterator();		
		while (itLabelWEAttributes.hasNext()) {
			WEAttribute weAttribute = (WEAttribute) itLabelWEAttributes.next();
			result += weAttribute.getEAttribute().getName();
			if (itLabelWEAttributes.hasNext()) {
				result += ",";
			}
		}				
		return result+")";
	}

}
