package org.moflon.ide.core.project;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.moflon.core.build.MoflonProjectCreator;
import org.moflon.core.build.nature.MoflonProjectConfigurator;
import org.moflon.core.plugins.PluginProperties;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.ide.core.runtime.builders.RepositoryBuilder;
import org.moflon.ide.core.runtime.natures.RepositoryNature;

public class RepositoryProjectCreator extends MoflonProjectCreator
{

   private static final List<String> GITIGNORE_LINES = Arrays.asList(//
         "/bin", //
         "/gen/*", //
         "/model/*.ecore", "/model/*.genmodel", "/model/*.xmi", //
         "!/**/.keep*");

   /**
   * Pass-through constructor to {@link MoflonProjectCreator}
   * @param project the project to create
   * @param projectProperties the metadata to use
   * @param projectConfigurator the project configurator
   */
   public RepositoryProjectCreator(IProject project, PluginProperties projectProperties, MoflonProjectConfigurator projectConfigurator)
   {
      super(project, projectProperties, projectConfigurator);
   }

   @Override
   protected List<String> getGitignoreLines()
   {
      return GITIGNORE_LINES;
   }

   @Override
   protected String getNatureId() throws CoreException
   {
      return RepositoryNature.getId();
   }

   @Override
   protected String getBuilderId() throws CoreException
   {
      return RepositoryBuilder.getId();
   }

   /**
    * Adds a default .gitignore file to the given repository project to prevent adding generated files to the repository
    *
    * @param project the project for which to generate the .gitignore file
    * @param monitor the progress monitor
    */
   public static void addGitignoreFileForRepositoryProject(final IProject project, final IProgressMonitor monitor) throws CoreException
   {
      final SubMonitor subMon = SubMonitor.convert(monitor, "Creating .gitignore file for " + project, 1);

      WorkspaceHelper.createGitignoreFileIfNotExists(project.getFile(WorkspaceHelper.GITIGNORE_FILENAME), //
            GITIGNORE_LINES, subMon.split(1));
   }
}
