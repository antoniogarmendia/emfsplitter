package org.mondo.modular.sirius.ext;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.URI;


public class EvaluateSiriusProjectCreation {
	
	private static final String ISIRIUS_ID = "org.modular.sirius.definition.ext";
	
	@Execute
	public void executeProject(IExtensionRegistry registry,String anProjectName,String projectNature) {
	    evaluateProject(registry, projectNature, anProjectName);
	}
	
	private void evaluateProject(IExtensionRegistry registry, String projectNature,String anProjectName) {
		 
		IConfigurationElement[] config = registry.getConfigurationElementsFor(ISIRIUS_ID);
		
		try {
			
		      for (IConfigurationElement e : config) {
		        final Object o = e.createExecutableExtension("class");
		        if (o instanceof ISiriusCreation) {
		           executeExtension(o,projectNature,anProjectName);
		        }
		      }
		    } catch (CoreException ex) {
		      System.out.println(ex.getMessage());
		    }
			 
	}	
		
	private void executeExtension(Object o, String projectNature, String anProjectName) {
		
		ISafeRunnable runnable = new ISafeRunnable() {
		      @Override
		      public void handleException(Throwable e) {
		        System.out.println("Exception in client");
		      }
		      @Override
		      public void run() throws Exception {
		    	((ISiriusCreation) o).executeAfterProjectCreation(projectNature, anProjectName);
		      }
		    };
		    
		    SafeRunner.run(runnable);
		
	}
		
	/*
		@Execute
		public void executeFile(IExtensionRegistry registry,URI anfileURI){
			evaluateFile(registry, anfileURI);
		}
		
		private void evaluateFile(IExtensionRegistry registry,URI anfileURI) {
			 
			IConfigurationElement[] config = registry.getConfigurationElementsFor(ISIRIUS_ID);
			
			try {
				
			      for (IConfigurationElement e : config) {
			        final Object o = e.createExecutableExtension("class");
			        if (o instanceof ISiriusCreation) {
			           executeExtensionFile(o,anfileURI);
			        }
			      }
			    } catch (CoreException ex) {
			      System.out.println(ex.getMessage());
			    }
				 
			}	
			
			private void executeExtensionFile(Object o,URI anfileURI) {
				
				ISafeRunnable runnable = new ISafeRunnable() {
				      @Override
				      public void handleException(Throwable e) {
				        System.out.println("Exception in client");
				      }

				      @Override
				      public void run() throws Exception {
				    	((ISiriusCreation) o).ExecuteAfterCreateFile(anfileURI);
				      }
				    };
				    SafeRunner.run(runnable);				
			}	
		
	*/
}
