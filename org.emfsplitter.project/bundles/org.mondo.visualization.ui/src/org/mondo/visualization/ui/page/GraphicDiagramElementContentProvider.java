package org.mondo.visualization.ui.page;

import graphic_representation.AffixedCompartmentElement;
import graphic_representation.CompartmentEdge;
import graphic_representation.CompartmentElement;
import graphic_representation.Edge;
import graphic_representation.Node;
import graphic_representation.PaletteDescriptionLink;
import graphic_representation.Root;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;
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
			return new Object[]{edge.getDirections().getSourceLink(),
								edge.getDirections().getTargetLink()
								};		
		}	
		if(parentElement instanceof Node)
		{
			Node nod = (Node)parentElement;
			Object[] listLabelAttributes = nod.getNode_elements().getLabelanEAttribute().toArray(new Object[]{});
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
			return root.getRoot_node_elements().getLabelanEAttribute().toArray();
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
			if (compart.getInit() != null)
				result.add(compart.getInit());
			if (compart.getInitToFirst() != null)
				result.add(compart.getInitToFirst());
			if (compart.getNodeShape() != null)
				result.add(compart.getNodeShape());
			if (compart.getNodeToNode() != null)
				result.add(compart.getNodeToNode());
			if (compart.getNodeToEnd() != null)
				result.add(compart.getNodeToEnd());
			if (compart.getEnd() != null)
				result.add(compart.getEnd());
			return result.toArray(new Object[result.size()]);
		}
		
		if (parentElement instanceof CompartmentEdge) {
			CompartmentEdge compartEdge = (CompartmentEdge) parentElement;
			return new Object[] {
				compartEdge.getSource(), compartEdge.getTarget()	
			};			
		}
		return null;
	}
	
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
				|| element instanceof CompartmentElement || element instanceof CompartmentEdge)
			return true;
		return false;
	}

}
