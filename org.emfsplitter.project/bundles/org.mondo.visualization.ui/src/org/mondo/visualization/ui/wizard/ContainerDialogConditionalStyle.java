package org.mondo.visualization.ui.wizard;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.sirius.viewpoint.description.SystemColors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import graphic_representation.LabelBorderedStyle;
import graphic_representation.ShapeCompartmentGradient;
import graphic_representation.SiriusSystemColors;

public class ContainerDialogConditionalStyle extends Dialog {
	
	private ShapeCompartmentGradient shapeGradient;
	
	private String fColor;
	private Integer height;
	private Integer width;
	private LabelBorderedStyle labelBorderedStyle;
	
	//Widgets if shape is instanceof Gradient
	private Combo cmbFColor;
	private Text txtCHeight;
	private Text txtCWidth;
	private Combo cmbLabelStyles;

	public ContainerDialogConditionalStyle(Shell parentShell, ShapeCompartmentGradient shapeGradient) {
		super(parentShell);		
		this.shapeGradient = shapeGradient;
		this.cmbFColor = null;
		this.txtCHeight = null;
		this.txtCWidth = null;
		this.cmbLabelStyles = null;
		this.labelBorderedStyle = null;
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NONE);		
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		container.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				
		//ForegroundColor
		Label labelForeground = new Label(container,SWT.NONE);
		labelForeground.setText("ForegroundColor: ");
			
		cmbFColor = new Combo(container, SWT.BORDER);
		cmbFColor.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		List<String> listOfColors = GetColorsName();
		cmbFColor.setItems(listOfColors.toArray(new String[GetColorsName().size()]));
		cmbFColor.select(listOfColors.indexOf(((SiriusSystemColors)shapeGradient.getForeGroundColor()).getName()));
			
		//Corner Height
		Label cornerHeight = new Label(container,SWT.NONE);
		cornerHeight.setText("Corner Height: ");
		
		txtCHeight = new Text(container, SWT.BORDER);
		txtCHeight.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtCHeight.setText(shapeGradient.getCornerHeight().toString());
			
		//Corner Width
		Label cornerWidth = new Label(container,SWT.NONE);
		cornerWidth.setText("Corner Width: "); 
					
		txtCWidth = new Text(container, SWT.BORDER);
		txtCWidth.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtCWidth.setText(shapeGradient.getCornerWidth().toString());	
			
		//Label Style
		Label labelForLabelStyle = new Label(container,SWT.NONE);
		labelForLabelStyle.setText("Label Style: ");			
			
		cmbLabelStyles = new Combo(container, SWT.BORDER);
		cmbLabelStyles.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		List<String> labelStyles = getLabelStyles();
		cmbLabelStyles.setItems(labelStyles.toArray(new String[labelStyles.size()]));
		cmbLabelStyles.select(labelStyles.indexOf(shapeGradient.getLabelStyle().getName()));			
				
		return container;
	}
	
	@Override
	protected void okPressed() {
		
		this.fColor = cmbFColor.getText(); 
		this.height = Integer.parseInt(this.txtCHeight.getText());
		this.width = Integer.parseInt(this.txtCWidth.getText());
		this.labelBorderedStyle = LabelBorderedStyle.getByName(this.cmbLabelStyles.getText());
				
		super.okPressed();
	}
		
	public static List<String> GetColorsName()
	{
		List<String> result = new ArrayList<String>();
		SystemColors[] colors = SystemColors.values();		
		for (SystemColors systemColors : colors) 
			result.add(systemColors.getName());
		return result;		
	}
	
	public static List<String> getLabelStyles() {
		
		List<String> result = new ArrayList<String>();
		LabelBorderedStyle[] labelStyles = LabelBorderedStyle.values();
		for (LabelBorderedStyle labelStyle: labelStyles)
			result.add(labelStyle.getName());		
		return result;
	}
	
	public String getfColor() {
		return fColor;
	}

	public Integer getHeight() {
		return height;
	}

	public Integer getWidth() {
		return width;
	}
	
	public LabelBorderedStyle getLabelBorderedStyle() {
		return labelBorderedStyle;
	}
	
}
