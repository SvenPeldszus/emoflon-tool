package org.moflon.ide.core.ea;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.moflon.core.utilities.MoflonUtil;
import org.moflon.core.utilities.MoflonUtilitiesActivator;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.ide.core.CoreActivator;
import org.moflon.ide.core.util.RefreshProjectJob;

public class EnterpriseArchitectHelper
{
   private static final Logger logger = Logger.getLogger(EnterpriseArchitectHelper.class);

   private static final String ERROR_MESSAGE_LATEST_VERSIONS = "Do you have the latest version of EA and of our eMoflon EA Addin?";

   private static final String ERROR_MESSAGE_PROBLEMS_EA_EXPORT = "I'm having problems executing the EA export for ";

   private static final String COMMAND_LINE_EA_EXECUTABLE = "/resources/commandLineEAExport/eMoflonCommandLine.exe";

   private static final String EXPORT_OPTION = "-e ";
   
   private static final String IMPORT_OPTION = "-i ";
   
   private static final String EAP_EXTENSIONS = "--eap ";
   
   private static final String XMI_EXTENSIONS = "--xmi ";
   
   private static EnterpriseArchitectCommandLineParser clParser = new EnterpriseArchitectCommandLineParser(logger);
   
   public static void delegateToEnterpriseArchitect(final IProject project) throws IOException, InterruptedException
   {
      delegateToEnterpriseArchitect(project, new NullProgressMonitor());
   }

   public static void delegateToEnterpriseArchitect(final IProject project, final IProgressMonitor monitor) throws IOException, InterruptedException
   {
     delegateToEnterpriseArchitect(project, monitor, generateExportCommand(WorkspaceHelper.getEapFileFromMetamodelProject(project)), "Exporting");
   }

   private static String generateExportCommand(IFile eapFile){
	   URL pathToExe = MoflonUtilitiesActivator.getPathRelToPlugIn(COMMAND_LINE_EA_EXECUTABLE, CoreActivator.getModuleID());
       return  "\"" + new File(pathToExe.getPath()).getAbsolutePath() + "\" " + EXPORT_OPTION + EAP_EXTENSIONS + "\"" + eapFile.getLocation().toOSString() + "\"";

   }
   
   public static void delegateToEnterpriseArchitect(final IProject project, final IProgressMonitor monitor,final String command, final String importExport) throws IOException, InterruptedException
   {
      try
      {
         monitor.beginTask(importExport +" project " + project.getName(), 2);
         Runtime rt = Runtime.getRuntime();
         
         logger.debug("Executing '" + command + "'");

         Process pr = rt.exec(command);
         pr.waitFor();
         monitor.worked(1);
         
         InputStream inputStream = new BufferedInputStream(pr.getInputStream());
         StringBuilder stdout = new StringBuilder();
         byte[] buffer = new byte[1024]; 
         int readBytes = -1;
         do
         {
            readBytes = inputStream.read(buffer);
            if (readBytes > 0)
            {
            	String input = new String(buffer, 0, readBytes);
               stdout.append(input);
            }
         } while (readBytes > 0);
          clParser.parse(stdout.toString());

         Job refreshProject = new RefreshProjectJob(project);
         refreshProject.schedule();
         monitor.worked(1);
      } finally
      {
         monitor.done();
      }
   }
   
   private static String generateImportCommand(IFile eapFile, IFile xmiFile){
	   URL pathToExe = MoflonUtilitiesActivator.getPathRelToPlugIn(COMMAND_LINE_EA_EXECUTABLE, CoreActivator.getModuleID());
	   return "\"" + new File(pathToExe.getPath()).getAbsolutePath() + "\" " + IMPORT_OPTION + XMI_EXTENSIONS + "\"" + xmiFile.getLocation().toOSString() + "\" "+  EAP_EXTENSIONS + "\"" + eapFile.getLocation().toOSString() + "\"";
   }
   
   public static void exportEcoreFilesFromEAP(final IProject project)
   {
      try
      {
         delegateToEnterpriseArchitect(project);
      } catch (IOException | InterruptedException e)
      {
         logger.error(ERROR_MESSAGE_PROBLEMS_EA_EXPORT + project.getName());
         logger.info(ERROR_MESSAGE_LATEST_VERSIONS);
         logger.error(MoflonUtil.displayExceptionAsString(e));
      }
   }
   
   public static void importXMIFilesToEAP(final String eapFileName, final IProject project, final IFile xmiFile){
	   try{
		   IFile eapFile = project.getFile(eapFileName);
		   delegateToEnterpriseArchitect(project, new NullProgressMonitor(), generateImportCommand(eapFile, xmiFile), "Importing");
	   }catch (IOException | InterruptedException e)
	      {
	         logger.error(ERROR_MESSAGE_PROBLEMS_EA_EXPORT + project.getName());
	         logger.info(ERROR_MESSAGE_LATEST_VERSIONS);
	         logger.error(MoflonUtil.displayExceptionAsString(e));
	      }
   }

}