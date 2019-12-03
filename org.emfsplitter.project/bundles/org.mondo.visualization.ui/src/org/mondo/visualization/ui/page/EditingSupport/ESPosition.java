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
import graphic_representation.LabelEAttribute;
import graphic_representation.LabelOCL;
import graphic_representation.LabelPosition;
import graphic_representation.WEAttribute;

public class ESPosition extends EditingSupport {

	private  ComboBoxCellEditor cell_Editor;
	
	public ESPosition(ColumnViewer viewer) {
		super(viewer);
		cell_Editor = new ComboBoxCellEditor((Composite) getViewer().getControl(),GetLabelPositionName().toArray(new String[0]));
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		
		return cell_Editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		
		if(element instanceof GeneralLabel)
			return true;
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		
		if(element instanceof LabelEAttribute) {			
				return GetLabelPositionName().indexOf(((LabelEAttribute) element).getLabelPosition().getName());			
		}
		if (element instanceof LabelOCL) {
			
			return GetLabelPositionName().indexOf(((LabelOCL) element).getLabelPosition().getName());		
		}
		
		return null;
	}

	@Override
	protected void setValue(Object element, Object value) {
		
		if(element instanceof LabelEAttribute) {
				((LabelEAttribute) element).setLabelPosition(LabelPosition.get((Integer)value));
		}
		if(element instanceof LabelOCL)
			((LabelOCL) element).setLabelPosition(LabelPosition.get((Integer)value));
				
		getViewer().update(element, null);
	}
	
	public static List<String> GetLabelPositionName()
	{
		List<String> result = new ArrayList<String>();
		LabelPosition[] position = LabelPosition.values();
		for (LabelPosition pos : position) {
			result.add(pos.getName());
		}
		return result;
	}

}
