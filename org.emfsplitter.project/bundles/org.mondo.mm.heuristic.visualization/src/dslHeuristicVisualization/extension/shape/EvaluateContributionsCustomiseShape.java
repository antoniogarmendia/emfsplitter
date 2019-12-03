package dslHeuristicVisualization.extension.shape;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.e4.core.di.annotations.Execute;

public class EvaluateContributionsCustomiseShape {
	
	private static final String CUSTOMISE_SHAPE_ID = "org.mondo.mm.heuristic.visualization.customise_shape";
	
	public EvaluateContributionsCustomiseShape() {
		// Do Nothing
	}	
	
	public static List<String> getAllExtensionsToCustomiseShape(IExtensionRegistry registry) {
		
		List<String> listOfAllExtensions = new ArrayList<String>();
		IConfigurationElement[] config = registry.getConfigurationElementsFor(CUSTOMISE_SHAPE_ID);
		 try {
	            for (IConfigurationElement e : config) {
	                final Object o = e.createExecutableExtension("class");
	                if (o instanceof ICustomiseShape) {
	                   listOfAllExtensions.add(e.getAttribute("name"));
	                }
	            }
	        } catch (CoreException ex) {
	            System.out.println(ex.getMessage());
	        }		
		return listOfAllExtensions;
	} 
	
	
	@Execute
    public ICustomiseShape execute(IExtensionRegistry registry, String customiseShapeName) {
		IConfigurationElement[] config =
                registry.getConfigurationElementsFor(CUSTOMISE_SHAPE_ID);
        try {
            for (IConfigurationElement e : config) {
                System.out.println("Evaluating extension");
                final Object o = e.createExecutableExtension("class");
                if (o instanceof ICustomiseShape && e.getAttribute("name").equals(customiseShapeName)) {
                    return executeExtension(o);
                }
            }
        } catch (CoreException ex) {
            System.out.println(ex.getMessage());
        }
		return null;		
	}
	
	private ICustomiseShape executeExtension(final Object o) {
		
		final Object[] result = new Object[1];
		
        ISafeRunnable runnable = new ISafeRunnable() {
            @Override
            public void handleException(Throwable e) {
                System.out.println("Exception in client");
            }

            @Override
            public void run() throws Exception {
                        	
            	result[0] = ((ICustomiseShape) o).getClass().getDeclaredConstructors()[0].newInstance();
            	
            }
        };
        SafeRunner.run(runnable);
        
        return (ICustomiseShape) result[0];
    }   

}
