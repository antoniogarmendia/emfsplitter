package org.mondo.visualization.ui.save.vpchanges;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.ChangeFactory;
import org.eclipse.emf.ecore.change.ResourceChange;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.editor.tools.internal.presentation.CustomSiriusEditor;
import org.eclipse.sirius.ui.tools.internal.actions.analysis.RemoveRepresentationResourceAction;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IURIEditorInput;

public class CustomSiriusEditorWrapper extends CustomSiriusEditor {

   public ChangeRecorder recorder;
   public Map<EObject, URI> eObjectToProxyURIMap;
         
   @SuppressWarnings("restriction")
   @Override
   public void createModel() {
	  super.createModel();
	  Resource odesignResource = this.findOdesignResource();
	  //Find change resource
	  ChangeDescription changeDescription = findChangeDescription(odesignResource);
	  // Start recording changes
	  if (odesignResource !=null) {
		  this.recorder = new ChangeRecorder(); 
		  this.recorder.setRecordingTransientFeatures(true);
		  this.eObjectToProxyURIMap = new HashMap<EObject, URI>();
		  this.recorder.setEObjectToProxyURIMap(eObjectToProxyURIMap);
		  this.recorder.beginRecording(changeDescription, Collections.singleton(odesignResource));
		  System.out.println("Start recording *.odesign changes");
	  }	  
   }
   
   private ChangeDescription findChangeDescription(Resource odesignResource) {
	  // ResourceSet reset = editingDomain.getResourceSet();
	   ResourceSet reset = new ResourceSetImpl();
	   URI changeResourceURI = odesignResource.getURI().trimFileExtension().appendFileExtension("change");
	   Resource changeResource = null;
	   ChangeDescription changeDescription = null;
	   if (reset.getURIConverter().exists(changeResourceURI, Collections.EMPTY_MAP)) {	
			changeResource = reset.getResource(changeResourceURI, true);			
	   } else {
		   changeResource = reset.createResource(changeResourceURI);
	   }
	   if (changeResource.getContents().size() == 0) {
		   changeDescription = ChangeFactory.eINSTANCE.createChangeDescription();
		   changeResource.getContents().add(changeDescription); 
	   } else {
		   changeDescription = (ChangeDescription) changeResource.getContents().get(0);		   
	   } 
	   return changeDescription;	   
   }

   private Resource findOdesignResource() {
	  URI odesignURI = this.getURIFromInput(getEditorInput()); 
	  return editingDomain.getResourceSet().getResource(odesignURI, true);
   }   
   
   private URI getURIFromInput(IEditorInput input) {
       final URI result;
       if (input == null) {
           result = null;
       } else if (input instanceof IFileEditorInput) {
           result = URI.createPlatformResourceURI(((IFileEditorInput) getEditorInput()).getFile().getFullPath().toString(), false);
       } else if (input instanceof URIEditorInput) {
           result = ((URIEditorInput) input).getURI();
       } else if (input instanceof IPathEditorInput) {
           result = URI.createFileURI(((IPathEditorInput) input).getPath().toOSString());
       } else if (input instanceof IURIEditorInput) {
           result = URI.createURI(((IURIEditorInput) input).getURI().toString());
       } else {
           result = input.getAdapter(URI.class);
       }
       return result;
   }   
      
   @SuppressWarnings("restriction")
   @Override
   public void doSave(IProgressMonitor progressMonitor) {
	   ChangeDescription changeDescription = this.recorder.summarize();
	   try {
		changeDescription.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}	   
	   System.out.println("Summarize and continue recording");
	   super.doSave(progressMonitor);	   	      
   }   
   
   @Override
	public void dispose() {
	    ChangeDescription changeDescription = this.recorder.endRecording();
	    //Copy 
	    ChangeDescription reverseChangeDescription = EcoreUtil.copy(changeDescription);
	    reverseChangeDescription.copyAndReverse(this.eObjectToProxyURIMap);
	    ResourceSet reset = changeDescription.eResource().getResourceSet();
	    Resource reverseResource = reset.createResource(changeDescription.eResource().getURI().appendFileExtension("reverse"));
	    reverseResource.getContents().add(reverseChangeDescription);
	    
	    //Save reverse resource
	    try {
			reverseResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {			
			e.printStackTrace();
		}
	    
		super.dispose();		
	}
   
   
}
