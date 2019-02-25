package org.mondo.generate.modular.project.ext;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public interface IModularProjectResource {
	
	public Resource getCustomizeResource(URI resourceURI);
}
