package org.mondo.emf.splitter.parse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import MetaModelGraph.EnumModular;
import MetaModelGraph.Graph;
import MetaModelGraph.Node;
import MetaModelGraph.SubGraph;

public class ParseMMGraph implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub		
	}

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if(window!=null)
		{
			ISelectionService selectionservice = (ISelectionService)window.getSelectionService();
			ISelection selection = selectionservice.getSelection();
			TreeSelection treeselection = (TreeSelection)selection;
			Object firstelement = treeselection.getFirstElement();
			if(firstelement instanceof IResource) {
				IResource resource = (IResource)firstelement;
				ResourceSet reset = new ResourceSetImpl();
				Resource res = reset.getResource(URI.createURI(resource.getLocationURI().toString(),true), true);
				
				Graph graph = (Graph) res.getContents().get(0);
				Iterator<SubGraph> listOfSubgraphs = graph.getSubgraph().iterator();
				
				while (listOfSubgraphs.hasNext()) {
					SubGraph subGraph = (SubGraph) listOfSubgraphs.next();
					Iterator<Node> itNodes = subGraph.getNodes().iterator();
					while (itNodes.hasNext()) {
						Node node = (Node) itNodes.next();
						ListIterator<EnumModular> iterOfEnumModular =  node.getEnumModularNotation().listIterator();
						while (iterOfEnumModular.hasNext()) {
							EnumModular enumModular = (EnumModular) iterOfEnumModular.next();
							if (enumModular.equals(EnumModular.INSIDE_UNIT)) {//4
								iterOfEnumModular.remove();
								System.out.println("Inside Unit");
							} else if (enumModular.equals(EnumModular.INSIDE_PACKAGE)) {//5
								iterOfEnumModular.remove();
								System.out.println("Inside Package");
							} else if (enumModular.equals(EnumModular.INSIDE_PROJECT)) {//6
								iterOfEnumModular.remove();
								System.out.println("Inside Project");								
							} else if (enumModular.equals(EnumModular.ABSTRACT_PACKAGE_UNIT)) {//7
								iterOfEnumModular.remove();
								System.out.println("ABSTRACT_PACKAGE_UNIT");					
							} else if (enumModular.equals(EnumModular.ABSTRACT_PACKAGE)) {//8
								iterOfEnumModular.remove();
								System.out.println("ABSTRACT_PACKAGE");					
							} else if (enumModular.equals(EnumModular.ABSTRACT_UNIT)) {//9
								iterOfEnumModular.remove();
								System.out.println("ABSTRACT_UNIT");					
							} else if (enumModular.equals(EnumModular.RECURSION_PACKAGE)) {//10
								iterOfEnumModular.remove();
								if ( node.getEnumModularNotation().indexOf(EnumModular.PACKAGE) == -1)
									iterOfEnumModular.add(EnumModular.PACKAGE);							
								System.out.println("RECURSION_PACKAGE");
							} else if (enumModular.equals(EnumModular.RECURSION_UNIT)) {//12
								iterOfEnumModular.remove();
								if (node.getEnumModularNotation().indexOf(EnumModular.UNIT) == -1)
									iterOfEnumModular.add(EnumModular.UNIT);								
								System.out.println("RECURSION_UNIT");
							} else if (enumModular.equals(EnumModular.RECURSION_ABSTRACT_PACKAGE)) {//11
								iterOfEnumModular.remove();
								//iterOfEnumModular.add(EnumModular.PACKAGE);
								System.out.println("RECURSION_ABSTRACT_PACKAGE");
							} else if (enumModular.equals(EnumModular.RECURSION_ABSTRACT_UNIT)) {//13
								iterOfEnumModular.remove();
								//iterOfEnumModular.add(EnumModular.UNIT);
								System.out.println("RECURSION_ABSTRACT_UNIT");
							}							
						}	
						try {
							res.save(null);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}	
				
				try {
					res.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("Finalizado");				
			}
		}
		
		return null;
	}

	@Override
	public boolean isEnabled() {
		
		return true;
	}

	@Override
	public boolean isHandled() {
		
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener arg0) {
		// TODO Auto-generated method stub
		
	}

}
