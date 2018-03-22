package org.moflon.ide.ui.admin.handlers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobGroup;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.gervarro.eclipse.task.ITask;
import org.moflon.core.ui.AbstractCommandHandler;
import org.moflon.core.utilities.MoflonConventions;
import org.moflon.ide.core.CoreActivator;
import org.moflon.ide.ui.preferences.EMoflonPreferenceInitializer;

/**
 * Implementation base for validation with and without dumping the intermediate
 * models
 * 
 * @author Roland Kluge - Initial implementation
 *
 */
public abstract class AbstractValidateHandler extends AbstractCommandHandler {

	/**
	 * Validates the given Ecore file, is known to exist
	 * 
	 * @param ecoreFile
	 *            the Ecore file
	 * @param monitor
	 *            the progress monitor
	 * @throws CoreException
	 *             in case of any problem
	 */
	protected abstract void validateFile(final IFile ecoreFile, final IProgressMonitor monitor) throws CoreException;

	/**
	 * Invokes {@link #validateProjects(Collection, IProgressMonitor)} for all
	 * projects than can be found in the selection of the given event
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		try {
			if (selection instanceof TreeSelection) {
				final TreeSelection treeSelection = (TreeSelection) selection;
				for (final Iterator<?> selectionIterator = treeSelection.iterator(); selectionIterator.hasNext();) {
					final Object element = selectionIterator.next();
					if (element instanceof IFile) {
						validateFile((IFile) element, new NullProgressMonitor());
					} else if (element instanceof IJavaProject) {
						validateProject(((IJavaProject) element).getProject(), new NullProgressMonitor());
					} else if (element instanceof IWorkingSet) {
						final List<IProject> projects = new ArrayList<>();
						final IWorkingSet workingSet = (IWorkingSet) element;
						for (final IAdaptable elementInWorkingSet : workingSet.getElements()) {
							if (elementInWorkingSet instanceof IProject) {
								projects.add((IProject) elementInWorkingSet);
							}
						}
						validateProjects(projects, new NullProgressMonitor());
					}
				}
			}
		} catch (final CoreException e) {
			throw new ExecutionException(e.getMessage());
		}
		return null;
	}

	/**
	 * Invokes {@link #validateProject(IProject, IProgressMonitor)} for each project
	 * 
	 * @param projects
	 * @param monitor
	 * @throws CoreException
	 */
	private void validateProjects(final Collection<IProject> projects, final IProgressMonitor monitor)
			throws CoreException {
		final SubMonitor subMon = SubMonitor.convert(monitor, "Validating projects", projects.size());

		for (final IProject project : projects) {
			this.validateProject(project, subMon.split(1));
		}
	}

	/**
	 * Invokes {@link #validateFile(IFile, IProgressMonitor)} for each project that
	 * is a Moflon project
	 * 
	 * @param project
	 * @param monitor
	 * @throws CoreException
	 */
	private void validateProject(final IProject project, final IProgressMonitor monitor) throws CoreException {
		if (CoreActivator.isMoflonProject(project)) {
			final IFile ecoreFile = MoflonConventions.getDefaultEcoreFile(project);
			validateFile(ecoreFile, monitor);
		}
	}

	@SuppressWarnings("deprecation")
	protected void runValidation(final ITask validationTask) {
		final long validationTimeoutMillis = EMoflonPreferenceInitializer.getValidationTimeoutMillis();
		final String validationTimeoutMessage = "Validation took longer than " + validationTimeoutMillis / 1000
				+ "s. This could(!) mean that some of your patterns have no valid search plan. You may increase the timeout value using the eMoflon property page";
	
		final Job job = new Job(validationTask.getTaskName()) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				return validationTask.run(monitor);
			}
		};
	
		final boolean runInBackground = PlatformUI.getPreferenceStore().getBoolean("RUN_IN_BACKGROUND");
		if (!runInBackground) {
			PlatformUI.getWorkbench().getProgressService().showInDialog(null, job);
		}
	
		final JobGroup jobGroup = new JobGroup("Validation job group", 1, 1);
		job.setJobGroup(jobGroup);
		job.schedule();
		try {
			boolean completed = jobGroup.join(validationTimeoutMillis, new NullProgressMonitor());
			if (!completed) {
				job.getThread().stop();
				logger.error(validationTimeoutMessage);
				throw new OperationCanceledException(validationTimeoutMessage);
			}
		} catch (InterruptedException e) {
			throw new OperationCanceledException(validationTimeoutMessage);
		}
	}
}
