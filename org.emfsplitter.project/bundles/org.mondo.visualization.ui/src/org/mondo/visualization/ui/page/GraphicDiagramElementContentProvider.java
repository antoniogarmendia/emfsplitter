package org.mondo.visualization.ui.page;

import graphic_representation.AffixedCompartmentElement;
import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.ConditionalEdgeStyle;
import graphic_representation.ConditionalRepresentation;
import graphic_representation.ConditionalStyle;
import graphic_representation.Edge;
import graphic_representation.GeneralLabel;
import graphic_representation.LabelOCL;
import graphic_representation.LinkedListRepresentation;
import graphic_representation.LoopRepresentation;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.RepresentationStyle;
import graphic_representation.Root;
import graphic_representation.Shape;
import graphic_representation.TreeRepresentation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class GraphicDiagramElementContentProvider implements ITreeContentProvider{

	@Override
	public void dispose() {
				
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				
	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		return (Object[])inputElement;		
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		if(parentElement instanceof Edge){
			Edge edge = (Edge)parentElement;
			Object[] result = new Object[]{edge.getDirections().getSourceLink(),
												edge.getDirections().getTargetLink()					
			};					
				
			if (edge.getConditionalEdgeStyle().size() >= 1) {
				Object[] condEdges = edge.getConditionalEdgeStyle().toArray(new Object[]{});
				result = ArrayUtils.addAll(result, condEdges);			
			}
			if (edge.getEdgeLabel() != null) {
				Object[] label = new Object[] {edge.getEdgeLabel()};
				result = ArrayUtils.addAll(label, result);		
			}
			
			return result;	
		}	
		if (parentElement instanceof ConditionalEdgeStyle) {
			ConditionalEdgeStyle condEdge = (ConditionalEdgeStyle) parentElement;
			
			Object[] result = new Object[] {
					condEdge.getDecoratorSource(),condEdge.getDecoratorTarget()
			};
			
			if (condEdge.getGeneralLabel() != null) {
				Object[] label = new Object[] {condEdge.getGeneralLabel()};
				result = ArrayUtils.addAll(label,result );				
			}			
			
			return result;			
		}
		
		if(parentElement instanceof Node)
		{
			Node nod = (Node)parentElement;
			Object[] listLabelAttributes = new Object[]{};// {nod.getNode_shape().getLabelanEAttribute()};
			if (nod.getNode_shape().getLabelanEAttribute() != null)
				listLabelAttributes = new Object[]{nod.getNode_shape().getLabelanEAttribute()};
			Object[] listLink = nod.getNode_elements().getLinkPalette().toArray(new Object[]{});
			Object[] listConditionalStyles = nod.getConditionalStyle().toArray(new Object[]{}); 
			Object[] listCompartments = getCompartmentsNonContainment(nod.getNode_elements().getAffixedCompartmentElements()).toArray(new Object[]{});
			
			Object[] allObjects = ArrayUtils.addAll(listLabelAttributes, listLink);
			Object[] all = ArrayUtils.addAll(allObjects, listCompartments);
			return 	ArrayUtils.addAll(all, listConditionalStyles);								
		}
		if(parentElement instanceof Root)
		{
			Root root = (Root)parentElement;
			GeneralLabel label = root.getRoot_shape().getLabelanEAttribute();
			return new Object[] {label};							
		}
		if(parentElement instanceof PaletteDescriptionLink)
		{
			PaletteDescriptionLink link = (PaletteDescriptionLink) parentElement;
			return new Object[]{
								 new Object[]{"Source", link},
								 new Object[]{"Target", link}
								};
		}
		if (parentElement instanceof CompartmentElement) {
			
			CompartmentElement compart = (CompartmentElement) parentElement;
			List<Object> result = new ArrayList<Object>();
			
			RepresentationStyle repre = compart.getRepresentationStyle();
			if (repre instanceof LinkedListRepresentation) {
				
				LinkedListRepresentation linkedListRepre = (LinkedListRepresentation) repre;
				if (linkedListRepre.getInit() != null)
					result.add(linkedListRepre.getInit());
				if (linkedListRepre.getInitToFirst() != null)
					result.add(linkedListRepre.getInitToFirst());
				if (linkedListRepre.getNodeShape() != null)
					result.add(linkedListRepre.getNodeShape());
				if (linkedListRepre.getNodeToNode() != null)
					result.add(linkedListRepre.getNodeToNode());
				if (linkedListRepre.getNodeToEnd() != null)
					result.add(linkedListRepre.getNodeToEnd());
				if (linkedListRepre.getEnd() != null)
					result.add(linkedListRepre.getEnd());
			} else if (repre instanceof LoopRepresentation) {
				
				LoopRepresentation loopRepre = (LoopRepresentation) repre;
				
				if (loopRepre.getInitShape() != null) {
					result.add(loopRepre.getInitShape());
				}
				if (loopRepre.getNodeShape() != null) {
					result.add(loopRepre.getNodeShape());
				}
				if (loopRepre.getEndShape() != null) {
					result.add(loopRepre.getEndShape());
				}
				if (loopRepre.getInitToNode() != null) {
					result.add(loopRepre.getInitToNode());
				}
				if (loopRepre.getRecursiveEdge() != null) {
					result.add(loopRepre.getRecursiveEdge());
				} 
				if (loopRepre.getNodeToEnd() != null) {
					result.add(loopRepre.getNodeToEnd());
				}				
			} else if (repre instanceof ConditionalRepresentation) {
				
				ConditionalRepresentation condRepre = (ConditionalRepresentation) repre;
				
				if (condRepre.getInitShape() != null) {
					result.add(condRepre.getInitShape());
				}
				if (condRepre.getIfShape() != null) {
					result.add(condRepre.getIfShape());
				}
				if (condRepre.getThenShape() != null) {
					result.add(condRepre.getThenShape());
				}
				if (condRepre.getElseShape() != null) {
					result.add(condRepre.getElseShape());
				}
				if (condRepre.getEndShape() != null) {
					result.add(condRepre.getEndShape());
				}
				if (condRepre.getInitToIf() != null) {
					result.add(condRepre.getInitToIf());
				}
				if (condRepre.getIfToThenNode() != null) {
					result.add(condRepre.getIfToThenNode());
				}
				if (condRepre.getThenNodeToEndNode() != null) {
					result.add(condRepre.getThenNodeToEndNode());
				}
				if (condRepre.getIfNodeToElseNode() != null) {
					result.add(condRepre.getIfNodeToElseNode());
				}
				if (condRepre.getElseNodeToEndNode() != null) {
					result.add(condRepre.getElseNodeToEndNode());
				}
			} else if (repre instanceof TreeRepresentation) {
				
				TreeRepresentation treeRepresentation = (TreeRepresentation) repre; 
				
				if (treeRepresentation.getInitShape() != null) {
					result.add(treeRepresentation.getInitShape());
				}
				if (treeRepresentation.getRootShape() != null) {
					result.add(treeRepresentation.getRootShape());
				}
				if (treeRepresentation.getNodeShape() != null) {
					result.add(treeRepresentation.getNodeShape());
				}
				if (treeRepresentation.getEndShape() != null) {
					result.add(treeRepresentation.getEndShape());
				}
				if (treeRepresentation.getInitToRootShape() != null) {
					result.add(treeRepresentation.getInitToRootShape());
				}
				if (treeRepresentation.getRootShapeToNode() != null) {
					result.add(treeRepresentation.getRootShapeToNode());
				}
				if (treeRepresentation.getNodeShapeToEndShape() != null) {
					result.add(treeRepresentation.getNodeShapeToEndShape());
				}
			}
			return result.toArray(new Object[result.size()]);
		}
		
		if (parentElement instanceof CompartmentEdge) {
			CompartmentEdge compartEdge = (CompartmentEdge) parentElement;
			return new Object[] {
				compartEdge.getSource(), compartEdge.getTarget()	
			};			
		}
		
		if (parentElement instanceof ConditionalStyle) {
			List<Object> result = new ArrayList<Object>();
			LabelOCL labelOcl = ((ConditionalStyle) parentElement).getLabelOcl();
			if (labelOcl != null)
				result.add(labelOcl);
			return result.toArray(new Object[result.size()]);
		}
		
		if (parentElement instanceof Shape) {
			Shape sh = (Shape) parentElement;
			if (sh.getLabelanEAttribute() == null)
				return null;
			else 
				return new Object[] {sh.getLabelanEAttribute()};
		}		
		return null;
	}
	
	/*
	private Object[] childLabelEAttributes(GeneralLabel labelanEAttribute) {
		
		if (labelanEAttribute instanceof LabelEAttribute) {
			LabelEAttribute labelEAttribute = (LabelEAttribute) labelanEAttribute;
			return labelEAttribute.getLabelAttributes().toArray(new Object[] {});
		} else if (labelanEAttribute instanceof LabelOCL) {
			return new Object[] {labelanEAttribute};
		}		
		return new Object[] {};
	}
	*/
	public EList<CompartmentElement> getCompartmentsNonContainment(EList<AffixedCompartmentElement> eList){
		EList<CompartmentElement> result = new BasicEList<CompartmentElement>();
		Iterator<AffixedCompartmentElement> itCompartments = eList.iterator();
		while (itCompartments.hasNext()) {
			AffixedCompartmentElement affixedCompartmentElement = (AffixedCompartmentElement) itCompartments.next();
			if (affixedCompartmentElement instanceof CompartmentElement && 
					affixedCompartmentElement.getAnEReference().isContainment() == false)
				result.add((CompartmentElement) affixedCompartmentElement);
		}
		return result;
	}

	@Override
	public Object getParent(Object element) {
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		if(element instanceof Node || element instanceof Edge || element instanceof Root || element instanceof PaletteDescriptionLink
				|| element instanceof CompartmentElement || element instanceof CompartmentEdge || element instanceof ConditionalStyle
					|| element instanceof ConditionalEdgeStyle
						|| element instanceof Shape)
			return true;
		return false;
	}

}
