package org.uam.eps.modular.constraints.dialog.def;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class ConstraintTreeContentProvider implements ITreeContentProvider  {

	@Override
	public Object[] getElements(Object inputElement) {
		
		return ArrayContentProvider.getInstance().getElements(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		
		return false;
	}	
}
