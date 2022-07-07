package org.moflon.tgg.mosl.ui.wizards;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.moflon.core.ui.UiUtilities;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.WorkspaceHelper;
import org.moflon.tgg.mosl.ui.internal.TGGActivator;

public class NewTGGRuleProjectInfoPage extends WizardPage {

	private static final Logger logger = Logger.getLogger(NewTGGRuleProjectInfoPage.class);

	private String ruleName;

	private Optional<String> schema = Optional.empty();

	private Label schemaLocationLabel;

	private Text schemaLocationTextfield;

	private Text ruleNameTextfield;

	private Optional<IResource> ruleLocation = Optional.empty();

	private Optional<IProject> project = Optional.empty();

	public NewTGGRuleProjectInfoPage() {
		super("New TGG rule");
		this.ruleName = "";
		setProjectAndRuleLocation();
		setSchema();

		// Set information on the page
		setTitle("New TGG rule wizard");
		setDescription("Create a new TGG rule");
		setImageDescriptor(UiUtilities.getImage(WorkspaceHelper.getPluginId(getClass()),
				"resources/icons/metamodelProjectWizard.gif"));
	}

	private void setProjectAndRuleLocation() {
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		final ISelection selection = window.getSelectionService().getSelection("org.eclipse.jdt.ui.PackageExplorer");
		if (selection instanceof ITreeSelection) {
			final ITreeSelection structuredSelection = (ITreeSelection) selection;
			final Object elt = structuredSelection.getFirstElement();
			this.ruleLocation = determineLocationForNewRuleInProject(elt);
			this.project = this.ruleLocation.map(IResource::getProject);
		}
	}

	private void setSchema() {
		this.schema = this.project.map(IProject::getName);
	}

	@Override
	public void createControl(final Composite parent) {
		// Create root container
		final Composite container = new Composite(parent, SWT.NULL);
		final GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;

		createControlsForRuleName(container);

		createControlsForSchemaLocation(container);

		// Place cursor in textfield
		this.ruleNameTextfield.setFocus();

		// Set controls and update
		setControl(container);
		dialogChanged();
	}

	public void createControlsForSchemaLocation(final Composite container) {
		this.schemaLocationLabel = createLabel(container);
		this.schemaLocationLabel.setText("&Schema:");
		this.schemaLocationTextfield = new Text(container, SWT.BORDER | SWT.SINGLE);
		this.schema.ifPresent(s -> this.schemaLocationTextfield.setText(s));

		final GridData gd2 = new GridData(GridData.FILL_HORIZONTAL);
		gd2.horizontalSpan = 2;
		this.schemaLocationTextfield.setLayoutData(gd2);
		this.schemaLocationTextfield.addModifyListener(e -> {
			final String text = NewTGGRuleProjectInfoPage.this.schemaLocationTextfield.getText();
			if (text.isEmpty() || text.equals("")) {
				setErrorMessage("Schema location must not be empty");
				NewTGGRuleProjectInfoPage.this.schema = Optional.empty();
			} else {
				NewTGGRuleProjectInfoPage.this.schema = Optional.of(text);
			}

			dialogChanged();
		});
	}

	public void createControlsForRuleName(final Composite container) {
		// Create control for entering project name
		final Label label = createLabel(container);
		label.setText("&Rule name:");

		this.ruleNameTextfield = new Text(container, SWT.BORDER | SWT.SINGLE);
		final GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.horizontalSpan = 2;
		this.ruleNameTextfield.setLayoutData(gd);
		this.ruleNameTextfield.addModifyListener(e -> {
			NewTGGRuleProjectInfoPage.this.ruleName = NewTGGRuleProjectInfoPage.this.ruleNameTextfield.getText();

			if (NewTGGRuleProjectInfoPage.this.ruleName.isEmpty()) {
				setErrorMessage("Rule name must not be empty.");
			}

			dialogChanged();
		});
	}

	public Label createLabel(final Composite container) {
		return new Label(container, SWT.NULL);
	}

	@Override
	public void setVisible(final boolean visible) {
		super.setVisible(visible);
	}

	@Override
	public boolean canFlipToNextPage() {
		return super.canFlipToNextPage() && (getErrorMessage() == null);
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public IResource getRuleLocation() {
		return this.ruleLocation.get();
	}

	private Optional<IResource> determineLocationForNewRuleInProject(final Object selectedElement) {
		if (selectedElement instanceof IJavaElement) {
			try {
				return Optional.of(((IJavaElement) selectedElement).getCorrespondingResource());
			} catch (final JavaModelException e) {
				LogUtils.error(logger, e);
			}
		}

		if (selectedElement instanceof IFile) {
			return Optional.of(((IFile) selectedElement).getParent());
		}

		if (selectedElement instanceof IFolder) {
			return Optional.of((IFolder) selectedElement);
		}

		return Optional.empty();
	}

	public String getSchema() {
		return this.schema.get();
	}

	private final void updateStatus(final String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	private void dialogChanged() {
		final IStatus validity = validate();

		if (validity.isOK()) {
			updateStatus(null);
		} else {
			updateStatus(validity.getMessage());
		}
	}

	private IStatus validate() {
		if (this.ruleName.isEmpty()) {
			return new Status(IStatus.ERROR, TGGActivator.ORG_MOFLON_TGG_MOSL_TGG, "Rule name must not be empty!");
		}

		if (!this.schema.isPresent()) {
			return new Status(IStatus.ERROR, TGGActivator.ORG_MOFLON_TGG_MOSL_TGG, "Schema name must not be empty!");
		}

		return new Status(IStatus.OK, TGGActivator.ORG_MOFLON_TGG_MOSL_TGG, "Rule is valid");
	}

}