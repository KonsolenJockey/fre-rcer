/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.rfcgen.wizard;

import java.util.Collection;

import net.sf.rcer.conn.connections.ConnectionException;
import net.sf.rcer.conn.connections.ConnectionManager;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IImportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunctionTemplate;

/**
 * A wizard to create a basic RFC mapping file from function module definitions read from a SAP R/3 system.
 * @author vwegert
 *
 */
public class CreateMappingWizard extends Wizard implements IImportWizard {

	public static final String PLUGIN_ID = "net.sf.rcer.rfcgen.editor";

	private IStructuredSelection selection;
	private JCoDestination destination;

	private FunctionModuleSelectionPage functionModulePage;
	private MappingParametersPage parametersPage;
	private WizardNewFileCreationPage targetFilePage;

	/**
	 * Default constructor.
	 */
	public CreateMappingWizard() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench wb, IStructuredSelection sel) {
		this.selection = sel;
		try {
			this.destination = ConnectionManager.getInstance().getDestination();
		} catch (ConnectionException e) {
			throw new RuntimeException(e);
		} catch (JCoException e) {
			throw new RuntimeException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();

		functionModulePage = new FunctionModuleSelectionPage(destination);
		addPage(functionModulePage);

		parametersPage = new MappingParametersPage();
		addPage(parametersPage);

		targetFilePage = new WizardNewFileCreationPage("Create Mapping File", selection);
		targetFilePage.setTitle("Mapping File");
		targetFilePage.setDescription("Select the location and enter the name of the mapping file to create.");
		targetFilePage.setFileExtension("rfc");
		addPage(targetFilePage);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		return super.canFinish() && getContainer().getCurrentPage() == targetFilePage;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		final Collection<JCoFunctionTemplate> functionModules = functionModulePage.getSelectedFunctionModules();
		final String packageName = parametersPage.getPackageName();
		final boolean useCallStyleMapping = parametersPage.useCallStyleMapping();
		final IPath filePath = targetFilePage.getContainerFullPath();
		final String fileName = targetFilePage.getFileName();
		try {
			CreateMappingRunnable runnable = new CreateMappingRunnable(destination, functionModules, 
					packageName, useCallStyleMapping, 
					filePath, fileName);
			ProgressMonitorDialog dialog = new ProgressMonitorDialog(getShell());
			dialog.run(true, false, runnable);
			return true;
		} catch (Exception e) {
			ErrorDialog.openError(getShell(), "RFC Mapping Wizard", e.getMessage(), 
					new Status(IStatus.ERROR, PLUGIN_ID, e.getMessage(), e.getCause()));
			return false;
		}
	}

}
