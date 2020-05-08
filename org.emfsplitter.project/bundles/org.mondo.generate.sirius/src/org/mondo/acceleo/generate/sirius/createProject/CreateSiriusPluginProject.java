package org.mondo.acceleo.generate.sirius.createProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.graphictoviewpoint.files.GraphicToViewPoint;

import org.mondo.acceleo.generate.sirius.main.WorkFlowSiriusProject;

import dslPatterns.impl.DslPatternsFactoryImpl;
import runtimePatterns.PatternInstance;
import runtimePatterns.PatternInstances;
import runtimePatterns.impl.PatternInstanceImpl;
import runtimePatterns.impl.PatternInstancesImpl;
import runtimePatterns.impl.RuntimePatternsFactoryImpl;
import splitterLibrary.EcoreEMF;
import splitterLibrary.impl.CreateEclipseProjectImpl;

public class CreateSiriusPluginProject extends CreateEclipseProjectImpl{

	final private String prop_address = "/org/mondo/acceleo/generate/sirius/properties/default_sirius.properties";
	static final public String plug_path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	static final public String work_path = CreateSiriusPluginProject.class.getProtectionDomain().getCodeSource().getLocation().getPath();
	static final public String runtime_pattern_ext = runtimePatterns.RuntimePatternsPackage.eINSTANCE.getNsPrefix();
	static final public String graphic_ext = graphic_representation.Graphic_representationPackage.eNS_PREFIX;
	private String current_project_name;
	private EcoreEMF nemf;
	

	public CreateSiriusPluginProject() {
		super();				
	}	
	
	public CreateSiriusPluginProject(String anprojectname,EcoreEMF annemf, IProgressMonitor anmonitor){
		
		Properties config = new Properties();
		InputStream is = CreateSiriusPluginProject.class.getResourceAsStream(prop_address);
		try {
			config.load(is);
			String add_name = config.getProperty("prefix_name");
			is.close();
			this.current_project_name = anprojectname;
			this.projectName = anprojectname.concat("."+add_name);
			this.monitor = anmonitor;
			this.isPlugin = true;
			this.isMavenProject = false;
			this.nemf = annemf;
		} catch (IOException e) {
			
			e.printStackTrace();
		}		
		
	}

	public void CreateAllFoldersProject() {
		// TODO Auto-generated method stub
		CreateFolder("src");	
		CreateFolder("icons");
		CreateFolder("META-INF");
		CreateFolder("description");
	}
	
	public void Copy_Icons(){
		Copy_Image(work_path.concat("/icons/sirius_icon.png"),"sirius_icon.png", "icons");
	}

	@Override
	public void CreateProject() {
		
		super.CreateProject();
		final IWorkspaceRunnable create = new IWorkspaceRunnable(){

			@Override
			public void run(IProgressMonitor monitor) throws CoreException {
				project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				 if (!project.exists()) {
					 final IJavaProject javaproc = JavaCore.create(project);
					 final IProjectDescription desc = project.getWorkspace().newProjectDescription(projectName);
					 desc.setLocation(null);
					 project.create(desc, monitor);
	                 project.open(monitor);
	                 AddNatureToProject(AddPluginNature(),desc);
	                 Required_Builder_Project(desc);
	                 project.setDescription(desc, monitor);
	                 CreateAllFoldersProject();
	                 Create_Src(monitor,javaproc);
	                 CreateAllPackages(javaproc);
	                 Copy_Icons();
	                 boolean before = switchSuccessNotification(false);
		             Generate_Files();
		             switchSuccessNotification(before);
	                 executeTransformation();
	                 project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				 }
			}			
		};
		
		try {
			ResourcesPlugin.getWorkspace().run(create, monitor);
		} catch (CoreException e) {
			
			e.printStackTrace();
		}
	}
	
	public void Required_Builder_Project(IProjectDescription desc){
		
		List<ICommand> builders = new ArrayList<>();
		
		final ICommand java = desc.newCommand();
	    java.setBuilderName(JavaCore.BUILDER_ID);
	    builders.add(java);
	    
	    final ICommand manifest = desc.newCommand();
        manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");
        builders.add(manifest);

        final ICommand schema = desc.newCommand();
        schema.setBuilderName("org.eclipse.pde.SchemaBuilder");
        builders.add(schema);
        
        if (isMavenProject)
        {
            final ICommand mvn_schema = desc.newCommand();
            mvn_schema.setBuilderName("org.eclipse.m2e.core.maven2Builder");
            builders.add(mvn_schema);
        }
        
        desc.setBuildSpec(builders.toArray(new ICommand[builders.size()]));
	}
	
	public void Create_Src(IProgressMonitor monitor,IJavaProject anJavaProject){
		
		EList<IClasspathEntry> classpathEntries = new BasicEList<IClasspathEntry>();
		final IFolder src = project.getFolder("src");
		final IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(src.getFullPath());
		
		classpathEntries.add(srcClasspathEntry);
		
		classpathEntries.addAll(Arrays.asList(PreferenceConstants.getDefaultJRELibrary()));
		classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
		
		Create_Src_Classpath(anJavaProject,monitor,classpathEntries);		
	}
	
	public void CreateAllPackages(IJavaProject anJavaProject){
		
		//CreateJavaPackages(anJavaProject, "");
		//CreateJavaPackages(anJavaProject,"editor");
		//CreateJavaPackages(anJavaProject, "ext");		
	}
	
	public EList<String> AddPluginNature()
	{
		EList<String> natures = new BasicEList<String>();
		return natures;
	}
	
	public void Generate_Files(){
		
		/*
		 * Get the data of what are the classes inside the package and the units.
		 * */
		PatternInstance modularPattern = this.getModularPattern();
		
		//Get Workspace Path
		File targetFolder = new File(plug_path + '/' + project.getName() + "/");
		try {
			final List<Object> generatorargs = new ArrayList<Object>();
			generatorargs.add(current_project_name);
			generatorargs.add(nemf.GetIFile().getFullPath().toString());
			generatorargs.add(modularPattern);//
			WorkFlowSiriusProject sirius_files = null;
			sirius_files = new WorkFlowSiriusProject(getLoadModel(), targetFolder,generatorargs);
					
			sirius_files.doGenerate(BasicMonitor.toMonitor(monitor));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	private PatternInstance getModularPattern() {
		URI rtpatUri = URI.createURI(nemf.getRs().getURI().toString().substring(0, nemf.getFileuri().lastIndexOf('.')).concat(".rtpat"));		
		ResourceSet reset = new ResourceSetImpl();
		Resource res = reset.getResource(rtpatUri,true);
		
		PatternInstances instances = (PatternInstances) res.getContents().get(0);
		
		Iterator<PatternInstance> itPatterns = instances.getAppliedPatterns().iterator();
		while (itPatterns.hasNext()) {
			PatternInstance patternInstance = (PatternInstance) itPatterns.next();
			if (patternInstance.getIdent().equals("Modularity"))
				return patternInstance;
		}
		
		return RuntimePatternsFactoryImpl.eINSTANCE.createPatternInstance();
	}

	public void executeTransformation(){
			//Run ATL Transformation Java			
			try {
			GraphicToViewPoint cgraph = new GraphicToViewPoint();
			
			cgraph.loadModels(GetGraphicRepresentationModel());
			cgraph.doGraphicToViewPoint(monitor);
			String odesingPath = project.getFullPath().toString().
					concat("/description/"+current_project_name+".odesign");
			cgraph.saveModels(odesingPath);
			applyChanges();			
			} catch (ATLCoreException | ATLExecutionException | IOException | CoreException e) {
				
				e.printStackTrace();
			}		
	}	
	
	public void applyChanges() throws FileNotFoundException, CoreException {
		
		// find file *.change
		ResourceSet reset = new ResourceSetImpl();
		URI changeURI = URI.createURI(getChangeDescriptionURI(),true);
		if (reset.getURIConverter().exists(changeURI, Collections.EMPTY_MAP)) {			
			//copy changes into the odesign folder
			IFolder odesignFolder = project.getFolder("description");
			FileInputStream fileStream = new FileInputStream(getChangeDescriptionURI().substring(5, getChangeDescriptionURI().length()));
			IFile newChangeDescription = odesignFolder.getFile(changeURI.lastSegment());
			if (newChangeDescription.exists() == false)
				newChangeDescription.create(fileStream, false, null);
			//Apply Transformation			
			URI uriNewChangeDescription = URI.createURI(newChangeDescription.getLocationURI().toString(),true);
			Resource changeResource = reset.getResource(uriNewChangeDescription, true);
			ChangeDescription changeDescription = (ChangeDescription) changeResource.getContents().get(0);
			changeDescription.applyAndReverse();
			saveAllResources(reset);
		}		
	}
	
	private void saveAllResources(ResourceSet reset) {
		Iterator<Resource> itResources = reset.getResources().iterator();
		while (itResources.hasNext()) {
			Resource resource = (Resource) itResources.next();
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
	}

	public String GetModel(){
		return nemf.getFileuri().substring(0, nemf.getFileuri().lastIndexOf('.')).concat("." + runtime_pattern_ext);
	}
	
	public String GetGraphicRepresentationModel(){
		return nemf.getFileuri().substring(0, nemf.getFileuri().lastIndexOf('.')).concat("." + graphic_ext);
	}
	
	public String getChangeDescriptionURI() {
		return nemf.getFileuri().substring(0, nemf.getFileuri().lastIndexOf('/')).concat("/" + current_project_name + ".change");
	}
		
	public EObject getLoadModel() {
		ResourceSet set = new ResourceSetImpl();
		String ipath = GetGraphicRepresentationModel();
		//Convert File URI to platform URI
		URIConverter converter = new ExtensibleURIConverterImpl();
		URI fileUri = URI.createFileURI(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString() + File.separator);
		URI platformURI = URI.createPlatformResourceURI("/", false);
		converter.getURIMap().put(fileUri, platformURI);
		
		URI theURI = converter.normalize(URI.createURI(ipath));
		
		Resource res = set.createResource(theURI);
		try {
			res.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res.getContents().get(0);
	}	
	
	private boolean switchSuccessNotification(boolean notify) {
		boolean successNotifications = AcceleoPreferences.areSuccessNotificationsEnabled();
		if(successNotifications != notify)
		{
			AcceleoPreferences.switchSuccessNotifications(notify);
			return successNotifications;
		}
		return successNotifications;
	}
	
}
