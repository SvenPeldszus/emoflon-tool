package org.moflon.ide.core.runtime.builders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.moflon.core.propertycontainer.MoflonPropertiesContainer;
import org.moflon.core.propertycontainer.MoflonPropertiesContainerHelper;
import org.moflon.core.propertycontainer.TGGBuildMode;
import org.moflon.core.utilities.ExceptionUtil;
import org.moflon.core.utilities.MoflonConventions;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.core.utilities.eMoflonEMFUtil;
import org.moflon.emf.build.MonitoredMetamodelLoader;
import org.moflon.emf.codegen.dependency.PackageRemappingDependency;
import org.moflon.emf.codegen.dependency.SDMEnhancedEcoreResource;
import org.moflon.ide.core.MoslTggConstants;
import org.moflon.ide.core.runtime.MetamodelLoader;
import org.moflon.moca.MocaUtil;
import org.moflon.moca.tggUserDefinedConstraint.unparser.TGGUserDefinedConstraintUnparserAdapter;
import org.moflon.moca.tie.RunIntegrationGeneratorBatch;
import org.moflon.moca.tie.RunIntegrationGeneratorCC;
import org.moflon.moca.tie.RunIntegrationGeneratorSync;
import org.moflon.moca.tie.RunModelGenerationGenerator;
import org.moflon.tgg.csp.CSPNotSolvableException;
import org.moflon.tgg.cspcodeadapter.CspcodeadapterFactory;
import org.moflon.tgg.cspcodeadapter.VariableTypeManager;
import org.moflon.tgg.language.TGGRule;
import org.moflon.tgg.language.TripleGraphGrammar;
import org.moflon.tgg.language.algorithm.ApplicationTypes;
import org.moflon.tgg.language.analysis.StaticAnalysis;
import org.moflon.tgg.language.compiler.CompilerFactory;
import org.moflon.tgg.language.compiler.TGGCompiler;
import org.moflon.tgg.language.compiler.compilerfacade.CompilerfacadeFactory;
import org.moflon.tgg.language.compiler.compilerfacade.InjectionHelper;
import org.moflon.tgg.language.csp.CSP;
import org.moflon.tgg.language.csp.TGGConstraint;
import org.moflon.tgg.language.modelgenerator.RuleAnalyzerResult;
import org.moflon.tgg.language.precompiler.CyclicContextMessage;
import org.moflon.tgg.language.precompiler.PrecompileLog;
import org.moflon.tgg.language.precompiler.PrecompileMessage;
import org.moflon.tgg.language.precompiler.PrecompilerFactory;
import org.moflon.tgg.language.precompiler.RuleProcessingMessage;
import org.moflon.tgg.language.precompiler.TGGPrecompiler;

import SDMLanguage.sdmUtil.CompilerInjection;
import SDMLanguage.sdmUtil.SdmUtilFactory;

public class IntegrationBuilder extends RepositoryBuilder {
	private static final String SUFFIX_SMA = ".sma.xmi";

	private static final Logger logger = Logger.getLogger(IntegrationBuilder.class);

	private final List<TGGConstraint> userDefinedConstraints = new ArrayList<>();

	private TripleGraphGrammar tgg;

	public static String getId() {
		return "org.moflon.ide.core.runtime.builders.IntegrationBuilder";
	}

	@Override
	protected void processResource(final IResource resource, final int kind, final Map<String, String> args, final IProgressMonitor monitor) {
		if (resource.getProjectRelativePath().toString().equals(MoflonConventions
				.getDefaultPathToFileInProject(getProject().getName(), MoslTggConstants.PRE_ECORE_FILE_EXTENSION))) {
			try {
				final SubMonitor subMon = SubMonitor.convert(monitor, "Generating code", 500);
				final IStatus tggCompilationStatus = processTGG(subMon.split(250));
				if (tggCompilationStatus.matches(IStatus.ERROR)) {
					handleErrorsInEclipse(tggCompilationStatus, (IFile) resource);
				}

				final IFile ecoreFile = WorkspaceHelper.getModelFolder(getProject())
						.getFile(MoflonUtil.lastCapitalizedSegmentOf(getProject().getName())
								+ WorkspaceHelper.ECORE_FILE_EXTENSION);

				super.processResource(ecoreFile, kind, args, subMon.split(250));
			} catch (final CoreException e) {
				final IStatus status = new Status(e.getStatus().getSeverity(), WorkspaceHelper.getPluginId(getClass()),
						e.getMessage(), e);
				handleErrorsInEclipse(status, (IFile) resource);
			} catch (final Exception e) {
				final IStatus status = new Status(IStatus.ERROR, WorkspaceHelper.getPluginId(getClass()),
						e.getMessage(), e);
				handleErrorsInEclipse(status, (IFile) resource);
			}
		}
	}

	private IStatus processTGG(final IProgressMonitor monitor) throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Processing TGGs", 66);

		final ResourceSet set = eMoflonEMFUtil.createDefaultResourceSet();
		eMoflonEMFUtil.installCrossReferencers(set);
		final MoflonPropertiesContainer moflonProperties = MoflonPropertiesContainerHelper.load(getProject(),
				subMon.split(5));

		// Load TGG file
		final IFolder modelFolder = getProject().getFolder(WorkspaceHelper.MODEL_FOLDER);
		final String defaultFileName = MoflonUtil.lastCapitalizedSegmentOf(getProject().getName());
		final IFile tggFile = modelFolder.getFile(defaultFileName + MoslTggConstants.TGG_FILE_EXTENSION);

		final URI projectURI = eMoflonEMFUtil.lookupProjectURI(getProject());
		final URI workspaceProjectURI = URI.createURI(getProject().getName() + "/", true)
				.resolve(URI.createPlatformResourceURI("/", true));
		final URI modelFolderURI = URI.createURI(WorkspaceHelper.MODEL_FOLDER + "/", true);
		final URI tggFileURI = URI.createURI(defaultFileName + MoslTggConstants.TGG_FILE_EXTENSION, true)
				.resolve(modelFolderURI.resolve(workspaceProjectURI));
		final URI preTGGFileURI = URI.createURI(defaultFileName + MoslTggConstants.PRE_TGG_FILE_EXTENSION, true)
				.resolve(modelFolderURI.resolve(workspaceProjectURI));
		final URI ecoreFileURI = URI.createURI(defaultFileName + WorkspaceHelper.ECORE_FILE_EXTENSION, true)
				.resolve(modelFolderURI.resolve(projectURI));
		final URI preEcoreFileURI = URI.createURI(defaultFileName + MoslTggConstants.PRE_ECORE_FILE_EXTENSION, true)
				.resolve(modelFolderURI.resolve(projectURI));
		final Map<URI, URI> uriMapping = set.getURIConverter().getURIMap();
		uriMapping.put(tggFileURI, preTGGFileURI);
		uriMapping.put(ecoreFileURI, preEcoreFileURI);

		final MonitoredMetamodelLoader metamodelLoader = new PreEcoreAwareMonitoredMetamodelLoader(set, tggFile,
				moflonProperties);
		metamodelLoader.run(subMon.split(10));
		final Resource tggResource = metamodelLoader.getMainResource();
		final Resource ecoreResource = set.getResource(ecoreFileURI, false);
		MetamodelLoader.setEPackageURI((EPackage) ecoreResource.getContents().get(0));
		this.tgg = (TripleGraphGrammar) tggResource.getContents().get(0);
		uriMapping.remove(tggFileURI);
		uriMapping.remove(ecoreFileURI);
		subMon.worked(5);

		if (this.tgg.getTggRule().isEmpty()) {
			return new Status(IStatus.WARNING, WorkspaceHelper.getPluginId(getClass()), IStatus.WARNING,
					"Your TGG does not contain any rules, aborting attempt to generate code...", null);
		}

		subMon.subTask(getProject().getName() + ": Translating TGG model to SDMs...");
		// Create and add precompiler to resourceSet so reverse navigation of links
		// works
		final TGGPrecompiler precompiler = PrecompilerFactory.eINSTANCE.createTGGPrecompiler();
		eMoflonEMFUtil.createParentResourceAndInsertIntoResourceSet(precompiler, set);

		// Precompile rules
		precompiler.setUseNewImpl(true);
		try {
			precompiler.precompileTGG(this.tgg);
		} catch (final RuntimeException e) {
			return ExceptionUtil.createDefaultErrorStatus(getClass(), e);
		}

		// print refinement precompiling log
		printPrecompilerLog(precompiler.getRefinementPrecompiler().getPrecompilelog());
		subMon.worked(5);

		try {
			// this has to be done here because it requires "flat" tgg rules instead of
			// refined ones
			enrichCspsWithTypeInformation();
		} catch (final RuntimeException e) {
			return ExceptionUtil.createDefaultErrorStatus(getClass(), e);
		}

		// Persist tgg model after precompilation
		final HashMap<String, Object> saveOptions = new HashMap<>();
		saveOptions.put(SDMEnhancedEcoreResource.SAVE_GENERATED_PACKAGE_CROSSREF_URIS, Boolean.valueOf(true));
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		try {
			tggResource.save(saveOptions);
		} catch (final IOException e) {
			return ExceptionUtil.createDefaultErrorStatus(getClass(), e);
		}
		subMon.worked(5);

		// Prepare injection resource compiler injections
		final URI compilerInjectionFileURI = URI.createURI(
				tggResource.getURI().toString().replace(MoslTggConstants.TGG_FILE_EXTENSION, ".injection.xmi"));
		final PackageRemappingDependency compilerInjectionFile = new PackageRemappingDependency(compilerInjectionFileURI);
		final Resource compilerInjectionResource = compilerInjectionFile.getResource(set, false);
		final InjectionHelper injectionHelper = CompilerfacadeFactory.eINSTANCE.createInjectionHelper();
		final CompilerInjection compilerInjection = SdmUtilFactory.eINSTANCE.createCompilerInjection();
		injectionHelper.setCompilerInjection(compilerInjection);
		subMon.worked(5);

		if (isSynchronizationMode(moflonProperties)) {
			final TGGCompiler compiler = CompilerFactory.eINSTANCE.createTGGCompiler();
			eMoflonEMFUtil.createParentResourceAndInsertIntoResourceSet(compiler, set);

			compiler.setProperties(moflonProperties);
			compiler.setInjectionHelper(injectionHelper);
			try {
				compiler.deriveOperationalRules(this.tgg,
						ApplicationTypes.get(moflonProperties.getTGGBuildMode().getBuildMode().getValue()));
			} catch (final RuntimeException e) {
				return ExceptionUtil.createDefaultErrorStatus(getClass(), e);
			}
			final StaticAnalysis staticAnalysis = compiler.getStaticAnalysis();

			// Persist results of static analysis
			final URI smaFileURI = URI.createURI(
					tggResource.getURI().toString().replace(MoslTggConstants.TGG_FILE_EXTENSION, SUFFIX_SMA));
			final PackageRemappingDependency smaFile = new PackageRemappingDependency(smaFileURI);
			final Resource smaResource = smaFile.getResource(set, false);
			if (staticAnalysis != null) {
				smaResource.getContents().add(staticAnalysis);
			}
			try {
				smaResource.save(saveOptions);
			} catch (final IOException e) {
				return ExceptionUtil.createDefaultErrorStatus(getClass(), e);
			}

			// Persist compiler injections
			saveInjectionFiles(saveOptions, compiler, compilerInjectionResource);
		}
		subMon.worked(5);

		if (isModelGenMode(moflonProperties)) {
			try {
				final org.moflon.tgg.language.modelgenerator.Compiler compiler = org.moflon.tgg.language.modelgenerator.ModelgeneratorFactory.eINSTANCE
						.createCompiler();
				eMoflonEMFUtil.createParentResourceAndInsertIntoResourceSet(compiler, set);
				compiler.setProperties(moflonProperties);
				compiler.setInjectionHelper(injectionHelper);
				try {
					compiler.compileModelgenerationSdms(this.tgg);
				} catch (final RuntimeException e) {
					return ExceptionUtil.createDefaultErrorStatus(getClass(), e);
				}
				for (final RuleAnalyzerResult analyzerResult : compiler.getRuleAnalyzer().getRuleAnalyzerResult()) {
					logger.warn(analyzerResult.getMessage() + ": " + analyzerResult.getEObject());
				}

				// Persist compiler injections
				saveInjectionFiles(saveOptions, compiler, compilerInjectionResource);
			} catch (final CSPNotSolvableException e) {
				logger.warn("CSPs could not be solved for modelgenerator: " + e.getMessage(), e);
			}
		}
		subMon.worked(5);

		try {
			// Persist ecore resource
			ecoreResource.save(saveOptions);
		} catch (final IOException e) {
			return ExceptionUtil.createDefaultErrorStatus(getClass(), e);
		}
		subMon.worked(5);

		generateUserDefinedConstraints(this.userDefinedConstraints);

		new RunIntegrationGeneratorBatch(getProject()).doFinish();
		new RunIntegrationGeneratorSync(getProject()).doFinish();
		new RunIntegrationGeneratorCC(getProject()).doFinish();
		new RunModelGenerationGenerator(getProject()).doFinish();
		subMon.worked(5);
		return Status.OK_STATUS;
	}

	private void enrichCspsWithTypeInformation() {
		for (final TGGRule rule : this.tgg.getTggRule()) {
			final VariableTypeManager varTypeManager = CspcodeadapterFactory.eINSTANCE.createVariableTypeManager();
			varTypeManager.setTggrule(rule);
			final CSP csp = rule.getCsp();
			final List<TGGConstraint> constraintsWithMissingName = csp.getConstraints().stream().filter(constraint -> constraint.getName() == null).collect(Collectors.toList());
			if (!constraintsWithMissingName.isEmpty()) {
				throw new IllegalStateException(
						String.format("TGG rule %s contains %d constraints without name", rule.getName(), constraintsWithMissingName.size()));
			}

			if (csp != null) {
				try {
					varTypeManager.deriveVariableTypes(csp);
				} catch (final IllegalStateException e) {
					throw new IllegalStateException(
							"Unable to infer types of attribute constraints used in TGG rule: " + rule.getName());
				}
				for (final TGGConstraint constraint : csp.getConstraints()) {
					if (constraint.isUserDefined()) {
						this.userDefinedConstraints.add(constraint);
					}
				}
			}
		}
	}

	/**
	 * Generates the files to implement user defined constraints and fills them with
	 * basic content. <br>
	 * An existing file won't be changed even if the definition of the constraint
	 * has been changed.
	 *
	 * @throws CoreException
	 */
	private void generateUserDefinedConstraints(final List<TGGConstraint> userDefinedConstraints) throws CoreException {
		final TGGUserDefinedConstraintUnparserAdapter unparser = new TGGUserDefinedConstraintUnparserAdapter();
		final String pkgPath = "src/" + getProject().getName().replace(".", "/") + "/csp/constraints/";

		// Create required folder structure
		WorkspaceHelper.addAllFolders(getProject(), pkgPath, new NullProgressMonitor());

		if (userDefinedConstraints.size() != 0) {

			for (final TGGConstraint constraint : userDefinedConstraints) {
				final String content = unparser.unparseCspConstraint(getProject().getName(), constraint);

				final String nameInUpperCase = MocaUtil.firstToUpper(constraint.getName());
				final String path = pkgPath + nameInUpperCase + ".java";

				// Ignore existing files
				if (!getProject().getFile(path).exists()) {
					WorkspaceHelper.addFile(getProject(), path, content, new NullProgressMonitor());
				}
			}

		}
	}

	private void saveInjectionFiles(final HashMap<String, Object> saveOptions, final TGGCompiler compiler,
			final Resource compilerInjectionResource) {
		if (compiler.getInjectionHelper().getCompilerInjection() != null) {
			compilerInjectionResource.getContents().add(compiler.getInjectionHelper().getCompilerInjection());
		}

		try {
			compilerInjectionResource.save(saveOptions);
		} catch (final IOException e) {
			logger.error("Unable to persist compiler injection model for project: " + getProject().getName());
		}
	}

	private boolean isModelGenMode(final MoflonPropertiesContainer moflonProperties) {
		switch (moflonProperties.getTGGBuildMode().getBuildMode()) {
		case ALL:
			return true;
		case SIMULTANEOUS:
			return true;
		default:
			return false;
		}
	}

	private boolean isSynchronizationMode(final MoflonPropertiesContainer moflonProperties) {
		final TGGBuildMode tggBuildMode = moflonProperties.getTGGBuildMode();
		if(tggBuildMode == null) {
			logger.warn("TGG build mode not set, assuming ALL");
			return true;
		}
		switch (tggBuildMode.getBuildMode()) {
		case ALL:
		case FORWARD_AND_BACKWARD:
		case BACKWARD:
		case FORWARD:
			return true;
		default:
			return false;
		}
	}

	private void printPrecompilerLog(final PrecompileLog log) {
		String errorMessage = "";
		for (final PrecompileMessage error : log.getPrecompileerror()) {
			if (error instanceof CyclicContextMessage) {
				final CyclicContextMessage cycle = (CyclicContextMessage) error;
				errorMessage += cycle.getMessage() + ": " + error.getRefinementrule() + " cycle found: ";

				for (final TGGRule cyclicRule : cycle.getRefineablerules().getTggrule()) {
					errorMessage += cyclicRule.getName() + " ";
				}

				errorMessage += "\n";
			}

			if (error instanceof RuleProcessingMessage) {
				final RuleProcessingMessage rule = (RuleProcessingMessage) error;
				errorMessage += rule.getMessage() + ": " + error.getRefinementrule() + " basis: " + rule.getBaserule()
				+ " | Error at " + rule.getTggobjectvariable() + "\n";
			}
		}
		if (!errorMessage.equals("")) {
			errorMessage = " ------------ PreCompiler Errorlog ------------ \n" + errorMessage
					+ " --------------------------------------";
			logger.error("TGGLanguage Precompiler (Refinements) - " + errorMessage);
		}

		String warningMessage = "";
		for (final PrecompileMessage warning : log.getPrecompilewarning()) {
			if (warning instanceof RuleProcessingMessage) {
				final RuleProcessingMessage rule = (RuleProcessingMessage) warning;
				warningMessage += rule.getMessage() + ": " + warning.getRefinementrule() + " basis: "
						+ rule.getBaserule() + " | Refining: " + rule.getTggobjectvariable() + "\n";
			}
		}
		if (!errorMessage.equals("")) {
			warningMessage = " ------------ PreCompiler Warninglog ------------ \n" + warningMessage
					+ " --------------------------------------";
			logger.warn("TGGLanguage Precompiler (Refinements) - " + warningMessage);
		}
	}
}
