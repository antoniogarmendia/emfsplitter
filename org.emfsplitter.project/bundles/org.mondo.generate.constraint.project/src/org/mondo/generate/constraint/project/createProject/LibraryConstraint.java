package org.mondo.generate.constraint.project.createProject;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class LibraryConstraint {
	
	// load genmodel
	public GenModel Load(String filepath, Resource res){
		
		ResourceSet rs = res.getResourceSet();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
				"genmodel", new EcoreResourceFactoryImpl()); 
		rs.getPackageRegistry().put(GenModelPackage.eNS_URI , 
				GenModelPackage.eINSTANCE);	
		GenModel model = (GenModel)rs.getResource(URI.createFileURI(filepath), 
				true).getContents().get(0);		
		EcoreUtil.resolveAll(model);
		return model;
	} 
	
	public String generateEClassImportFactoryImpl(EClass anEClass){
		
		String factory = ((EPackage)anEClass.eContainer()).getName().substring(0, 1).toUpperCase();
		factory += ((EPackage)anEClass.eContainer()).getName().substring(1) + "FactoryImpl";
		return generateEClassGeneralImport(anEClass) + ".impl." + factory;
	}
	
	public String generateEClassImportFactory(EClass eClass, String prefix) {
		
		String factory = prefix + "Factory";				
		return generateEClassGeneralImport(eClass) + "." + factory;		
	}
	
	public String generateImportFactory(GenPackage genPackage) {
		
		String factory = genPackage.getPrefix() + "Factory";		
		return generateGeneralImport(genPackage) + "." + factory;
	}
	
	private String generateEClassGeneralImport(EClassifier anEClass){
		
		String result = "";		
		EObject anEObject = anEClass;
		
		while(anEObject.eContainer()!=null){
			
			EObject currentEObject = anEObject.eContainer();
			if(currentEObject instanceof EPackage){
				EPackage anEPackage = (EPackage)currentEObject;
				if(result.equals(""))
					result = anEPackage.getName();
				else
					result = anEPackage.getName() + "." + result;				
			}
			
			anEObject = currentEObject;			
		}
		
		return result;		
	}
	
	private String generateGeneralImport(GenPackage genPackage) {
		
		String result = "";
		EObject eObject = genPackage.eContainer();
		
		while(eObject.eContainer()!=null){
			
			EObject currentEObject = eObject.eContainer();
			if(currentEObject instanceof EPackage) {
				GenPackage currentGenPackage = (GenPackage)currentEObject;
				if(result.equals(""))
					result = currentGenPackage.getNSName();
				else
					result = currentGenPackage.getNSName() + "." + result;
			}			
		}		
		
		return result;
	}
	
	public String getRootPackageString(EClass eClass) {
		return getRootPackage(eClass).getName();
	}
	
	public EPackage getRootPackage(EClass anEClass) {
		
		EObject eContainer = anEClass.eContainer();
		EObject ePack = null;
		while (eContainer != null) {
			ePack = eContainer;
			eContainer = eContainer.eContainer();
		}
		if (ePack instanceof EPackage) {
			return ((EPackage) ePack);
		}
		return null;
	}
	
	public String generateEClassImportBasePackage(EClassifier anEClass) {
		
		return generateEClassImpBasePackage(anEClass) + "." + anEClass.getName();
	}
	
	private String generateEClassImpBasePackage(EClassifier anEClass) {
		
		String result = "";		
		EObject anEObject = anEClass;
		
		while(anEObject.eContainer().eContainer()!=null){
			
			EObject currentEObject = anEObject.eContainer();
			if(currentEObject instanceof EPackage){
				EPackage anEPackage = (EPackage)currentEObject;
				if(result.equals(""))
					result = anEPackage.getName();
				else
					result = anEPackage.getName() + "." + result;				
			}
			
			anEObject = currentEObject;			
		}
		
		return result;	
	}
	
	public String generateEClassImport(EClassifier anEClass) {
		
		return generateEClassGeneralImport(anEClass) + "." + anEClass.getName();
	}

}
