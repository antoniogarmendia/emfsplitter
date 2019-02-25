package org.mondo.visualization.ui.wizard;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.mondo.visualization.ui.page.PageStrategySettings;
import org.mondo.visualization.ui.page.diagram.decorator.PageDefineDiagramElementDecorator;
import org.mondo.visualization.ui.page.diagram.element.PageDiagramElements;

import dslHeuristicVisualization.RepreHeurSS;
import dslHeuristicVisualization.impl.DslHeuristicVisualizationFactoryImpl;
import graphic_representation.MMGraphic_Representation;

public class DialogConcreteVisualization extends WizardDialog{

	
	private Button btnView;
	
	public DialogConcreteVisualization(Shell parentShell, IWizard newWizard) {
		
		super(parentShell, newWizard);
		setHelpAvailable(false);		
	}

	@Override
	public void updateButtons() {
		
		super.updateButtons();
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		
		super.createButtonsForButtonBar(parent);
		((GridLayout) parent.getLayout()).numColumns++;
		btnView = new Button(parent, SWT.PUSH);
		btnView.setText("Another Representation >");
		btnView.setVisible(false);						
	}	
	
	public Button getButtonView()
	{
		return btnView;
	}	
	
	@Override
	protected void nextPressed() {
		
		IWizardPage currentActivePage = getCurrentPage();
		WizardConcreteVisualization wizard = (WizardConcreteVisualization) getWizard();
		
		if (currentActivePage instanceof PageStrategySettings) {
			
			PageStrategySettings pageSettings = (PageStrategySettings) currentActivePage;
		
			/* notify current page settings that do not execute heuristics */
			if (currentActivePage.equals(wizard.getPages()[0])) {				
				
					if (wizard.isModularPattern() == true && pageSettings.getExecuteHeuristics().getSelection() == true) {
						EList<MMGraphic_Representation> mmRepresentation = wizard.getHeuristicStrategy().getGraphic_representation().getAllGraphicRepresentation();
						pageSettings.ClassRoleInstanceToMMGraphicRepresentation(pageSettings.getListUnitClassRoleInstance(), mmRepresentation);
						wizard.getHeuristicStrategy().Execute_Graphical_Elements();
						pageSettings.getExecuteHeuristics().setSelection(false);
						// Add additional pages to the wizard
						int countAllRepresentation = mmRepresentation.size();
						for (int i = 1; i < countAllRepresentation; i++) {
							PageStrategySettings strategy = new PageStrategySettings("Choose the Strategies to Define the Concrete Visualization");
							PageDiagramElements elements = new PageDiagramElements("Choose the Diagram Elements");
							PageDefineDiagramElementDecorator decorator = new PageDefineDiagramElementDecorator("Choose the Decorators for the Nodes, Edges and Links");
							//Set the Integer representation
							strategy.setCurrentMMGR(i);
							elements.setCurrentMMGR(i);
							decorator.setCurrentMMGR(i);
							//Add Pages to the wizard
							wizard.addPage(strategy);
							wizard.addPage(elements);
							wizard.addPage(decorator);						
							//Add also the Strategy Settings
							RepreHeurSS repreSS = DslHeuristicVisualizationFactoryImpl.eINSTANCE.createRepreHeurSS();
							repreSS.getHeuristicStrategySettings().add(DslHeuristicVisualizationFactoryImpl.eINSTANCE.createHeuristicStrategySettings());
							wizard.getHeuristicStrategy().getListRepresentation().add(repreSS);						
						}
						
					} else if (pageSettings.getExecuteHeuristics().getSelection() == true) {
						
						wizard.getHeuristicStrategy().setCurrentMMGR(pageSettings.getCurrentMMGR());
						wizard.getHeuristicStrategy().setCurrentRepresentation(pageSettings.getRepresentation());
						wizard.getHeuristicStrategy().ExecuteHeuristics();
											
						pageSettings.getExecuteHeuristics().setSelection(false);						
					}
					
			} else if (pageSettings.getExecuteHeuristics().getSelection() == true) {
				
					wizard.getHeuristicStrategy().setCurrentMMGR(pageSettings.getCurrentMMGR());
					wizard.getHeuristicStrategy().setCurrentRepresentation(pageSettings.getRepresentation());
					wizard.getHeuristicStrategy().Execute_Graphical_Elements();
										
					pageSettings.getExecuteHeuristics().setSelection(false);
			}
		
		}
		super.nextPressed();
	}
	
}
