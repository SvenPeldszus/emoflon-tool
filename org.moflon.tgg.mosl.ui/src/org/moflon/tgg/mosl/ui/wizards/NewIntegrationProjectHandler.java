package org.moflon.tgg.mosl.ui.wizards;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.moflon.core.ui.AbstractCommandHandler;
import org.moflon.core.ui.UiUtilities;
import org.moflon.core.utilities.LogUtils;

public class NewIntegrationProjectHandler extends AbstractCommandHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);

		try {
			UiUtilities.openWizard(NewIntegrationWizard.NEW_INTEGRATION_PROJECT_WIZARD_ID, window);
		} catch (final Exception e) {
			LogUtils.error(logger, e, "Unable to open 'new integration' wizard");
		}

		return null;
	}

}
