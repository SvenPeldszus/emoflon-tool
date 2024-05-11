package org.moflon.ide.ui.admin.wizards.moca;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.moflon.core.moca.processing.MocaPlugin;
import org.moflon.core.plugins.manifest.ManifestFileUpdater;
import org.moflon.core.utilities.ExceptionUtil;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.ide.ui.UIActivator;
import org.moflon.moca.AbstractFileGenerator;
import org.moflon.moca.BasicFormatRenderer;

import MocaTree.MocaTreeFactory;

public class ParserUnparserGenerator extends AbstractFileGenerator {
	private static Logger logger = Logger.getLogger(UIActivator.class);

	private final AddParserAndUnparserWizardPage page;

	private final String packagePrefix;

	private StringTemplateGroup stg;

	private IFolder parserFolder;

	private IFolder unparserFolder;

	public ParserUnparserGenerator(final AddParserAndUnparserWizardPage page, final IProject project) {
		super(project);
		this.page = page;
		this.packagePrefix = "org.moflon.moca." + page.getFileExtension();
	}

	@Override
	protected void prepareCodegen() {
		addDependencies();
		ensureThatFoldersExist();
		//		addAntlrNature();
		//	}
		//
		//	public void addAntlrNature() {
		//		try {
		//			WorkspaceHelper.addNature(project, AntlrNature.getId(), new NullProgressMonitor());
		//		} catch (CoreException e) {
		//			logger.error(e);
		//		}
	}

	public void ensureThatFoldersExist() {
		final List<String> packageFolders = Arrays.asList(this.packagePrefix.split("\\."));
		String currentFolder = "src/";
		for (final String folder : packageFolders) {
			currentFolder += folder + "/";
			createFolder(currentFolder);
		}
		if (this.page.shallCreateParser()) {
			this.parserFolder = createFolder(currentFolder + "/parser");
		}
		if (this.page.shallCreateUnparser()) {
			this.unparserFolder = createFolder(currentFolder + "/unparser");
		}

		createFolder("instances");
		createFolder("instances/in");
	}

	public void addDependencies() {
		try {
			new ManifestFileUpdater().processManifest(this.project,
					manifest -> ManifestFileUpdater.updateDependencies(manifest, Arrays.asList(WorkspaceHelper.DEFAULT_LOG4J_DEPENDENCY, WorkspaceHelper.PLUGIN_ID_ECORE, WorkspaceHelper.PLUGIN_ID_EMF_COMMON, WorkspaceHelper.getPluginId(MocaTreeFactory.class), WorkspaceHelper.getPluginId(MocaPlugin.class))));
		} catch (final Exception e) {
			logger.error("Unable to add MOCA as dependency to project: " + e.getMessage());
		}
	}

	private Map<String, String> createParser(final Technology parserTechnology) throws FileNotFoundException {
		// load template group and set attributes
		loadStringTemplateGroup(parserTechnology);

		// prepare attribute map (same for all technologies):
		final Map<String, Object> attributes = new HashMap<>();
		attributes.put("name", this.page.getFileExtension());
		attributes.put("package", this.packagePrefix + ".parser");

		// create file name prefix for the Parser
		final String fileNamePrefix = this.parserFolder.getProjectRelativePath() + "/"
				+ BasicFormatRenderer.firstToUpper(this.page.getFileExtension());

		// generate code for the given parser technology
		final Map<String, String> parserFileNamesToContents = new HashMap<>();
		switch (parserTechnology) {
		case ANTLR:
			parserFileNamesToContents.put(fileNamePrefix + "Parser.g", renderTemplate("Parser", attributes));
			parserFileNamesToContents.put(fileNamePrefix + "Lexer.g", renderTemplate("Lexer", attributes));
			parserFileNamesToContents.put(fileNamePrefix + "ParserAdapter.java",
					renderTemplate("ParserAdapter", attributes));
			createTemplateFolder();
			updateGitignoreFile();
			break;
		case XML:
			parserFileNamesToContents.put(fileNamePrefix + "ParserAdapter.java",
					renderTemplate("ParserAdapter", attributes));
			break;
		case CUSTOM:
			parserFileNamesToContents.put(fileNamePrefix + "ParserAdapter.java",
					renderTemplate("ParserAdapter", attributes));
			break;
		}

		return parserFileNamesToContents;
	}

	private void updateGitignoreFile() {
		try {
			final StringBuilder content = new StringBuilder();
			for (final String ext : Arrays.asList("g", "tokens", "java")) {
				content.append(this.parserFolder.getProjectRelativePath() + "/*[Parser|Lexer]." + ext + "\n");
			}
			final IFile gitignoreFile = this.project.getFile(".gitignore");
			final String contentString = content.toString();
			if (gitignoreFile.exists()) {
				gitignoreFile.appendContents(new ByteArrayInputStream(("\n" + contentString).getBytes()), true, true,
						new NullProgressMonitor());
			} else {
				gitignoreFile.create(new ByteArrayInputStream(contentString.getBytes()), true,
						new NullProgressMonitor());
			}
		} catch (final CoreException e) {
			logger.error("Failed to update/create .gitignore file", e);
		}
	}

	private Map<String, String> createUnparser(final Technology unparserTechnology)
			throws FileNotFoundException, CoreException {
		// load template group and set attributes
		loadStringTemplateGroup(unparserTechnology);

		// prepare attribute map (same for all technologies):
		final Map<String, Object> attributes = new HashMap<>();
		attributes.put("name", this.page.getFileExtension());
		attributes.put("package", this.packagePrefix + ".unparser");

		// create file name prefix
		final String fileNamePrefix = this.unparserFolder.getProjectRelativePath() + "/"
				+ BasicFormatRenderer.firstToUpper(this.page.getFileExtension());

		final Map<String, String> unparserFileNamesToContents = new HashMap<>();
		// generate code for the given parser technology
		switch (unparserTechnology) {
		case ANTLR:
			unparserFileNamesToContents.put(fileNamePrefix + "TreeGrammar.g",
					renderTemplate("TreeGrammar", attributes));
			unparserFileNamesToContents.put(fileNamePrefix + "UnparserAdapter.java",
					renderTemplate("UnparserAdapter", attributes));
			break;
		case XML:
			unparserFileNamesToContents.put(fileNamePrefix + "UnparserAdapter.java",
					renderTemplate("UnparserAdapter", attributes));
			addDefaultXMLTemplate();
			break;
		case CUSTOM:
			unparserFileNamesToContents.put(fileNamePrefix + "UnparserAdapter.java",
					renderTemplate("UnparserAdapter", attributes));
			break;
		}
		return unparserFileNamesToContents;
	}

	private void createTemplateFolder() {
		// create folder "templates" if it does not exist
		final IFolder templateFolder = this.project.getFolder(new Path("templates/"));
		if (!templateFolder.exists()) {
			try {
				templateFolder.create(true, true, new NullProgressMonitor());
			} catch (final CoreException e) {
				LogUtils.error(logger, e, "Unable to create templates directory.");
			}
		}
	}

	private void addDefaultXMLTemplate() {
		// copy the default XML template to the project
		createTemplateFolder();
		final IFile templateFile = this.project.getFile("templates/XML.stg");
		if (!templateFile.exists()) {
			try {
				final URL url = WorkspaceHelper.getPathRelToPlugIn("resources/moca/templates/defaultTemplates/XML.stg",
						WorkspaceHelper.getPluginId(UIActivator.class));
				WorkspaceHelper.addFile(this.project, "templates/XML.stg", url,
						WorkspaceHelper.getPluginId(UIActivator.class), new NullProgressMonitor());
			} catch (CoreException | URISyntaxException | IOException e) {
				LogUtils.error(logger, e);
			}
		}
	}

	private Map<String, String> createMocaMain() throws FileNotFoundException, CoreException {
		loadStringTemplateGroup("/resources/moca/templates/CodeAdapter/MocaMain.stg");

		final Map<String, Object> attributes = new HashMap<>();
		attributes.put("name", this.page.getFileExtension().toLowerCase());
		final String fileNamePrefix = this.project.getProjectRelativePath() + "/src/org/moflon/moca/";

		// determine template for MocaMain (parser, unparser or both)
		StringBuilder templateName = new StringBuilder("MocaMain");
		if (this.page.shallCreateParser() && this.page.shallCreateUnparser()) {
			templateName.append("ParserUnparser");
		} else if (this.page.shallCreateParser()) {
			templateName.append("Parser");
		} else {
			templateName.append("Unparser");
		}

		final Map<String, String> mocaMainFileNameToContent = new HashMap<>();
		mocaMainFileNameToContent.put(fileNamePrefix + "MocaMain.java", renderTemplate(templateName.toString(), attributes));

		return mocaMainFileNameToContent;

	}

	private URL getTemplateFileURL(final String path) {
		return WorkspaceHelper.getPathRelToPlugIn(path, WorkspaceHelper.getPluginId(UIActivator.class));
	}

	private void loadStringTemplateGroup(final String path) {
		try {
			final InputStreamReader reader = new InputStreamReader(getTemplateFileURL(path).openStream());
			this.stg = new StringTemplateGroup(reader);
		} catch (final IOException e) {
			logger.debug("unable to load template file: " + getTemplateFileURL(path));
		}
	}

	private void loadStringTemplateGroup(final Technology technology) {
		loadStringTemplateGroup("/resources/moca/templates/CodeAdapter/" + technology.toString() + ".stg");
	}

	private String renderTemplate(final String templateName, final Map<String, Object> attributes)
			throws FileNotFoundException {
		final StringTemplate st = this.stg.getInstanceOf(templateName);
		st.registerRenderer(String.class, new BasicFormatRenderer());
		st.setAttributes(attributes);
		return st.toString();
	}

	private IFolder createFolder(final String path) {
		final IFolder folder = this.project.getFolder(path);
		if (!folder.exists()) {
			try {
				return WorkspaceHelper.addFolder(this.project, path, new NullProgressMonitor());
			} catch (final CoreException e) {
				LogUtils.error(logger, e, "error while creating folder: " + path);
				return null;
			}
		} else {
			return folder;
		}
	}

	@Override
	protected Map<String, String> extractFileNamesToContents() throws CoreException {
		final HashMap<String, String> fileNamesToContents = new HashMap<>();

		try {
			if (this.page.shallCreateParser()) {
				final Map<String, String> parserFileNamesToContents = createParser(this.page.getParserTechnology());
				fileNamesToContents.putAll(parserFileNamesToContents);

			}
			if (this.page.shallCreateUnparser()) {
				final Map<String, String> unparserFileNamesToContents = createUnparser(this.page.getUnparserTechnology());
				fileNamesToContents.putAll(unparserFileNamesToContents);
				createUnparser(this.page.getUnparserTechnology());
			}

			final Map<String, String> mocaMainFileNameToContent = createMocaMain();
			fileNamesToContents.putAll(mocaMainFileNameToContent);
		} catch (final FileNotFoundException e) {
			ExceptionUtil.throwCoreExceptionAsError(e.getMessage(), WorkspaceHelper.getPluginId(UIActivator.class), e);
		}

		return fileNamesToContents;
	}

}
