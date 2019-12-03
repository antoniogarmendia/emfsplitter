package org.mondo.visualization.ui.page.LabelProvider;

import org.eclipse.jface.viewers.ColumnLabelProvider;

import graphic_representation.GeneralLabel;

public class CLabelAlignment extends ColumnLabelProvider{
	
	@Override
	public String getText(Object element) {
		
		if (element instanceof  GeneralLabel) {
				return ((GeneralLabel) element).getLabelAligment().getName().toLowerCase();		
		}		
		return "";
	}

}
