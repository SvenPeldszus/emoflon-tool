package org.moflon.tgg.mosl.builder;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.moflon.core.plugins.manifest.PluginURIToResourceURIRemapper;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.MoflonConventions;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.emf.codegen.MoflonGenModelBuilder;
import org.moflon.ide.core.MoslTggConstants;
import org.moflon.tgg.algorithm.configuration.PGSavingConfigurator;
import org.moflon.tgg.language.TripleGraphGrammar;
import org.moflon.tgg.mosl.TGGStandaloneSetup;
import org.moflon.tgg.mosl.codeadapter.org.moflon.tie.CodeadapterPostProcessBackwardHelper;
import org.moflon.tgg.mosl.codeadapter.org.moflon.tie.CodeadapterPostProcessForwardHelper;
import org.moflon.tgg.mosl.codeadapter.org.moflon.tie.CodeadapterTrafo;
import org.moflon.tgg.mosl.defaults.AttrCondDefLibraryProvider;
import org.moflon.tgg.mosl.tgg.AttrCond;
import org.moflon.tgg.mosl.tgg.AttrCondDef;
import org.moflon.tgg.mosl.tgg.Rule;
import org.moflon.tgg.mosl.tgg.TripleGraphGrammarFile;
import org.moflon.tgg.tggproject.TGGProject;
import org.moflon.tgg.tggproject.TggprojectFactory;

public class MOSLTGGConversionHelper extends AbstractHandler {
	private static Logger logger = Logger.getLogger(MOSLTGGConversionHelper.class);

	/**
	 * The purpose of this {@link URIHandlerImpl} is to handle "pre.ecore" files in
	 * the same way as "ecore" files.
	 */
	public class PreEcoreHidingURIHandler extends URIHandlerImpl {
		@Override
		public URI deresolve(final URI uri) {
			if (hasLastButOnePrefix(uri, "pre")) {
				// Trim ".pre .ecore" and add ".ecore"
				return uri.trimFileExtension().trimFileExtension().appendFileExtension("ecore");
			}

			return uri;
		}

		/**
		 * Returns true if the last but one suffix equals lastButOneSuffix
		 *
		 * @param uri
		 *            the URI to check
		 * @param lastButOneSuffix
		 *            the expected suffix
		 * @return
		 */
		private boolean hasLastButOnePrefix(final URI uri, final String lastButOneSuffix) {
			return (uri.trimFileExtension().fileExtension() != null)
					&& uri.trimFileExtension().fileExtension().equals(lastButOneSuffix);
		}
	}

	public Resource generateTGGModel(final IResource resource) throws CoreException {

		final var project = resource.getProject();

		// add default attribute conditions
		AttrCondDefLibraryProvider.syncAttrCondDefLibrary(project);

		final var moslFolder = IFolder.class.cast(resource);

		TGGStandaloneSetup.doSetup();
		final var resourceSet = new XtextResourceSet();

		final Collection<TripleGraphGrammarFile> tggFiles = new HashSet<>();
		collectTGGFiles(resourceSet, moslFolder, tggFiles);

		final var tggRoot = tggFiles.stream().filter(f -> f.getSchema() != null).findAny().get();
		tggFiles.stream().forEach(f -> tggRoot.getRules().addAll(f.getRules()));
		addAttrCondDefLibraryReferencesToSchema(tggRoot);

		EcoreUtil.resolveAll(resourceSet);

		// Save intermediate result of XText parsing
		final Map<Object, Object> options = new HashMap<>();
		options.put(XMLResource.OPTION_URI_HANDLER, new PreEcoreHidingURIHandler());

		// Invoke TGG forward transformation to produce TGG model
		final var pathToThisPlugin = WorkspaceHelper.getPathRelToPlugIn("/", WorkspaceHelper.getPluginId(getClass()))
				.getFile();

		final var helper = new CodeadapterTrafo(pathToThisPlugin);
		helper.getResourceSet().getResources().add(tggRoot.eResource());
		helper.setSrc(tggRoot);
		helper.setVerbose(false);
		helper.integrateForward();

		final var postProcessHelper = new CodeadapterPostProcessForwardHelper();
		postProcessHelper.postProcessForward(helper);

		final var tggProject = (TGGProject) helper.getTrg();
		if (tggProject != null) {
			return saveInternalTGGModelToXMI(tggProject, resourceSet, options, project.getName());
		}

		return null;
	}

	private void addAttrCondDefLibraryReferencesToSchema(final TripleGraphGrammarFile tggRoot) {
		final EList<AttrCondDef> usedAttrCondDefs = new BasicEList<>();
		for (final Rule rule : tggRoot.getRules()) {
			for (final AttrCond attrCond : rule.getAttrConditions()) {
				if (!usedAttrCondDefs.contains(attrCond.getName()) && !attrCond.getName().isUserDefined()) {
					usedAttrCondDefs.add(attrCond.getName());
				}
			}
		}
		tggRoot.getSchema().getAttributeCondDefs().addAll(usedAttrCondDefs);
	}

	/**
	 * Loads a TGG grammar from the given folder.
	 *
	 * @param resourceSet
	 * @param moslFolder
	 * @return
	 * @throws IOException
	 * @throws CoreException
	 */
	private void collectTGGFiles(final XtextResourceSet resourceSet, final IFolder moslFolder,
			final Collection<TripleGraphGrammarFile> tggFiles) throws CoreException {
		if (!moslFolder.exists()) {
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Required folder for MOSL-TGG specification is missing: " + moslFolder));
		}

		for (final IResource resource : moslFolder.members()) {
			if (resource instanceof IFile) {
				final var file = IFile.class.cast(resource);
				if (file.getFileExtension().equals(MoslTggConstants.MOSL_TGG_EXTENSION)) {
					tggFiles.add(loadTggFromFile(resourceSet, file));
				}
			} else if (resource instanceof IFolder) {
				collectTGGFiles(resourceSet, IFolder.class.cast(resource), tggFiles);
			}
		}
	}

	private TripleGraphGrammarFile loadTggFromFile(final XtextResourceSet resourceSet, final IFile schemaFile)
			throws CoreException {
		final var tggResource = (XtextResource) resourceSet
				.createResource(URI.createPlatformResourceURI(schemaFile.getFullPath().toString(), false));
		try {
			tggResource.load(null);
		} catch (final IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Problem while loading TGG file from '" + tggResource + "'. Reason: " + e.getMessage(), e));
		}
		final var tggFile = (TripleGraphGrammarFile) tggResource.getContents().get(0);
		return tggFile;
	}

	/**
	 * Tries to convert the first selected item from a "tgg.xmi" file to a MOSL-TGG
	 * specification
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		try {
			final var selection = HandlerUtil.getCurrentSelection(event);

			if (selection instanceof IStructuredSelection) {
				final var file = ((IStructuredSelection) selection).getFirstElement();
				if (file instanceof IFile) {
					final var tggFile = (IFile) file;

					final var resourceSet = eMoflonEMFUtil.createDefaultResourceSet();
					PluginURIToResourceURIRemapper.createPluginToResourceMap(resourceSet);
					final var tggProject = createTGGProject(tggFile, resourceSet);
					resourceSet.getResources().forEach(r -> {
						try {
							r.load(null);
						} catch (final IOException e) {
							e.printStackTrace();
						}
					});
					EcoreUtil.resolveAll(resourceSet);

					final var pathToThisPlugin = WorkspaceHelper
							.getPathRelToPlugIn("/", WorkspaceHelper.getPluginId(getClass())).getFile();
					final var helper = new CodeadapterTrafo(pathToThisPlugin, resourceSet);

					helper.setVerbose(true);
					helper.setConfigurator(new PGSavingConfigurator(helper,
							tggFile.getProject().getLocation().toString() + "/instances/PG.xmi"));
					helper.setTrg(tggProject);
					helper.integrateBackward();

					final var postProcessHelper = new CodeadapterPostProcessBackwardHelper();
					postProcessHelper.postProcessBackward(helper);

					final var tggModel = (TripleGraphGrammarFile) helper.getSrc();
					final var projectPath = tggFile.getProject().getFullPath().toString();
					final var projectName = tggFile.getProject().getName().replaceAll(Pattern.quote("."), "/");

					final var resource = resourceSet.createResource(URI.createPlatformResourceURI(
							projectPath + "/src/" + projectName + "/org/moflon/tgg/mosl" + projectPath + ".xmi", true));
					resource.getContents().add(tggModel);
					resource.save(null);

					saveXtextTGGModelToTGGFile(tggModel, tggFile.getProject(),
							"/src/" + projectName + "/org/moflon/tgg/mosl" + projectPath + ".tgg");
				}
			}
		} catch (final Exception e) {
			LogUtils.error(logger, e);
			throw new ExecutionException("MOSL-TGG conversion failed", e);
		}

		return null;
	}

	private Resource saveInternalTGGModelToXMI(final TGGProject tggProject, final XtextResourceSet resourceSet,
			final Map<Object, Object> options, final String saveTargetName) throws CoreException {
		final var tgg = tggProject.getTgg();
		final var corrPackage = tggProject.getCorrPackage();

		var file = StringUtils.substringAfterLast(saveTargetName, ".");

		if (file.isEmpty()) {
			file = StringUtils.capitalize(saveTargetName);
		} else {
			file = StringUtils.capitalize(file);
		}

		final var project = ResourcesPlugin.getWorkspace().getRoot().getProject(saveTargetName);
		eMoflonEMFUtil.createPluginToResourceMapping(resourceSet, project);
		final var relativePreEcoreXmiURI = URI.createURI(MoflonConventions.getDefaultPathToFileInProject(file, ".pre.ecore"));
		final var projectURI = MoflonGenModelBuilder.determineProjectUriBasedOnPreferences(project);
		final var preEcoreXmiURI = relativePreEcoreXmiURI.resolve(projectURI);
		final var preEcoreResource = resourceSet.createResource(preEcoreXmiURI);
		preEcoreResource.getContents().add(corrPackage);
		final var prefix = MoflonUtil.allSegmentsButLast(corrPackage.getNsPrefix());
		if ((prefix != null) && (prefix.length() > 0)) {
			EcoreUtil.setAnnotation(corrPackage, "http://www.eclipse.org/emf/2002/GenModel", "basePackage", prefix);
		}

		try {
			preEcoreResource.save(options);
		} catch (final IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Problem while saving PreEcore resource '" + preEcoreResource + "'. Reason: " + e.getMessage(), e));
		}

		final var pretggXmiURI = URI.createPlatformResourceURI(
				saveTargetName + "/" + MoflonConventions.getDefaultPathToFileInProject(file, ".pre.tgg.xmi"), false);
		final var pretggXmiResource = resourceSet.createResource(pretggXmiURI);
		pretggXmiResource.getContents().add(tgg);
		try {
			pretggXmiResource.save(options);
		} catch (final IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Problem while saving Pre-TGG XMI resource '" + pretggXmiResource + "'. Reason: " + e.getMessage(),
					e));
		}
		return preEcoreResource;
	}

	private void saveXtextTGGModelToTGGFile(final TripleGraphGrammarFile tggModel, final IProject project, final String filePath)
			throws IOException, CoreException {
		final var tggFileURI = URI.createPlatformResourceURI(project.getFullPath().toString() + filePath, true);

		final var xtextResourceSet = new XtextResourceSet();
		final var xtextResource = (XtextResource) xtextResourceSet.createResource(tggFileURI);
		AttrCondDefLibraryProvider.syncAttrCondDefLibrary(project);

		xtextResource.getContents().add(tggModel);
		EcoreUtil.resolveAll(xtextResource);

		final var options = SaveOptions.newBuilder();
		options.format();
		xtextResource.save(options.getOptions().toOptionsMap());
	}

	private TGGProject createTGGProject(final IFile tggFile, final ResourceSet resourceSet) throws CoreException {
		final var tggFilePath = tggFile.getFullPath().toString();
		final var tggEcoreResource = resourceSet
				.createResource(URI.createPlatformResourceURI(tggFilePath.replace(".tgg.xmi", ".ecore"), true));
		try {
			tggEcoreResource.load(null);
		} catch (final IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Problem while loading TGG Ecore resource '" + tggEcoreResource + "'. Reason: " + e.getMessage(),
					e));
		}
		final var tggModelResource = resourceSet.createResource(URI.createPlatformResourceURI(tggFilePath, true));
		try {
			tggModelResource.load(null);
		} catch (final IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
					"Problem while loading TGG model resource '" + tggModelResource + "'. Reason: " + e.getMessage(),
					e));
		}
		EcoreUtil.resolveAll(resourceSet);

		final var tggProject = TggprojectFactory.eINSTANCE.createTGGProject();
		tggProject.setCorrPackage((EPackage) tggEcoreResource.getContents().get(0));
		tggProject.setTgg((TripleGraphGrammar) tggModelResource.getContents().get(0));
		final var tggProjectResource = resourceSet.createResource(URI.createURI("TGGProject"));
		tggProjectResource.getContents().add(tggProject);

		return tggProject;
	}
}
