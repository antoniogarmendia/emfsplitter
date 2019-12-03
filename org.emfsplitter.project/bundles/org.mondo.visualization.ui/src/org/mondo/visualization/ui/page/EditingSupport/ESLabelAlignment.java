package org.mondo.visualization.ui.page.EditingSupport;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.swt.widgets.Composite;

import graphic_representation.GeneralLabel;
import graphic_representation.LabelAligment;
import graphic_representation.LabelOCL;
import graphic_representation.WEAttribute;

public class ESLabelAlignment extends EditingSupport{

	private  ComboBoxCellEditor cell_Editor;
	
	public ESLabelAlignment(ColumnViewer viewer) {
		super(viewer);		
		cell_Editor = new ComboBoxCellEditor((Composite) getViewer().getControl(),getLabelAlignmentName().toArray(new String[0]));
	}

	public static List<String> getLabelAlignmentName() {
		
		List<String> result = new ArrayList<String>();
		LabelAligment[] values = LabelAligment.values();
		for (LabelAligment labelAligment : values) {
			result.add(labelAligment.getName().toLowerCase());
		}		
		return result;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if (element instanceof GeneralLabel)
			return true;
		return false;
	}

	@Override
	protected CellEditor getCellEditor(Object arg0) {
		
		return this.cell_Editor;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof GeneralLabel) {
				return getLabelAlignmentName().indexOf(((GeneralLabel) element).getLabelAligment().getName().toLowerCase());
		}
		if (element instanceof LabelOCL) {
			
			return getLabelAlignmentName().indexOf(((LabelOCL) element).getLabelAligment().getName().toLowerCase());
		}
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(element instanceof GeneralLabel) {
				((GeneralLabel) element).setLabelAligment(LabelAligment.get((Integer)value));
				getViewer().update(element, null);			
		}
		if (element instanceof LabelOCL) {
			((LabelOCL) element).setLabelAligment(LabelAligment.get((Integer)value));
			getViewer().update(element, null);
		}		
	}	
}
