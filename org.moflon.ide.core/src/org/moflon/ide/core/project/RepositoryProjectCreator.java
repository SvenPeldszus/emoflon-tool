package org.moflon.ide.core.project;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.moflon.core.build.MoflonProjectCreator;
import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.moflon.core.plugins.PluginProperties;
import org.moflon.core.propertycontainer.MetaModelProject;
import org.moflon.core.propertycontainer.MoflonPropertiesContainer;
import org.moflon.core.propertycontainer.PropertycontainerFactory;
import org.moflon.ide.core.runtime.builders.RepositoryBuilder;
import org.moflon.ide.core.runtime.natures.RepositoryNature;

public class RepositoryProjectCreator extends MoflonProjectCreator {

	private static final List<String> GITIGNORE_LINES = Arrays.asList(//
			"/bin", //
			"/gen/*", //
			"/model/*.ecore", "/model/*.genmodel", "/model/*.xmi", //
			"!/**/.keep*");

	/**
	 * Pass-through constructor to {@link MoflonProjectCreator}
	 *
	 * @param project
	 *            the project to create
	 * @param projectProperties
	 *            the metadata to use
	 * @param projectConfigurator
	 *            the project configurator
	 */
	public RepositoryProjectCreator(final IProject project, final PluginProperties projectProperties,
			final MoflonProjectConfigurator projectConfigurator) {
		super(project, projectProperties, projectConfigurator);
	}

	@Override
	protected List<String> getGitignoreLines() {
		return GITIGNORE_LINES;
	}

	@Override
	protected String getNatureId() throws CoreException {
		return RepositoryNature.getId();
	}

	@Override
	protected String getBuilderId() throws CoreException {
		return RepositoryBuilder.getId();
	}

	/**
	 * This method sets the {@link MetaModelProject} of the given
	 * {@link MoflonPropertiesContainer} to the given value
	 */
	public static void updateMetamodelProjectName(final MoflonPropertiesContainer moflonProperties,
			final String metamodelProjectName) {
		MetaModelProject metamodelProject = moflonProperties.getMetaModelProject();
		if (metamodelProject == null) {
			metamodelProject = PropertycontainerFactory.eINSTANCE.createMetaModelProject();
			moflonProperties.setMetaModelProject(metamodelProject);
			metamodelProject.setMetaModelProjectName(metamodelProjectName);
		}

		metamodelProject.setMetaModelProjectName(metamodelProjectName);
	}

}
