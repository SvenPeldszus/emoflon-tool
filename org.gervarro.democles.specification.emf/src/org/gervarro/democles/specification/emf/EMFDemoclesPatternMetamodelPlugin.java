package org.gervarro.democles.specification.emf;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gervarro.democles.emf.util.EcoreResourceFactory;
import org.gervarro.democles.specification.emf.resource.PatternResourceFactory;

public class EMFDemoclesPatternMetamodelPlugin {
	
	public static final ResourceSet createDefaultResourceSet() {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.setPackageRegistry(EPackage.Registry.INSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		return resourceSet;
	}
	
	public static final void configureDemoclesDefaults(final ResourceSet resourceSet) {
		// Special handling of ecore file is needed to be able to load their generated counterparts
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"ecore", new EcoreResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				"pattern", new PatternResourceFactory());
	}
	
	public static final void setWorkspaceRootDirectory(ResourceSet resourceSet, String workspaceRootPath) {
		resourceSet.getURIConverter().getURIMap().put(
				URI.createPlatformResourceURI("/", true), URI.createFileURI(workspaceRootPath + File.separatorChar));
	}

}
