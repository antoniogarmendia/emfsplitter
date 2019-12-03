package org.mondo.visualization.ui.page.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import graphic_representation.LabelEAttribute;
import graphic_representation.LabelOCL;

public class CPosition extends ColumnLabelProvider {

	@Override
	public String getText(Object element) {
		
		if(element instanceof LabelEAttribute) {
			
				return ((LabelEAttribute) element).getLabelPosition().getName();
			
		}
		if (element instanceof LabelOCL) 
			return ((LabelOCL) element).getLabelPosition().getName();
		
		return "";
	}

}
