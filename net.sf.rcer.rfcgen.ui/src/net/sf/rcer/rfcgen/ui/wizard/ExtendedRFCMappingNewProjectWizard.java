/**
 * 
 */
/**
 * Copyright (c) 2009 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.rfcgen.ui.wizard;

import net.sf.rcer.conn.connections.ConnectionException;
import net.sf.rcer.conn.connections.ConnectionManager;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import org.eclipse.xtext.ui.wizard.IProjectInfo;

import com.google.inject.Inject;
import com.sap.conn.jco.JCoDestination;

/**
 * An adapted version of the New Project wizard that asks for function modules, target package name and 
 * mapping style.
 * @author vwegert
 *
 */
public class ExtendedRFCMappingNewProjectWizard extends	RFCMappingNewProjectWizard {
	
	private JCoDestination destination;

	private FunctionModuleSelectionPage functionModulePage;
	private MappingParametersPage parametersPage;
	private NoConnectionPage noConnectionPage;

	/**
	 * Default constructor.
	 * @param projectCreator
	 */
	@Inject
	public ExtendedRFCMappingNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.core.wizard.XtextNewProjectWizard#init(org.eclipse.ui.IWorkbench, org.eclipse.jface.viewers.IStructuredSelection)
	 */
	@Override
	public void init(IWorkbench workbench, IStructuredSelection theSelection) {
		super.init(workbench, theSelection);
		try {
			this.destination = ConnectionManager.getInstance().getDestination();
		} catch (ConnectionException e) {
			this.destination = null;
		} catch (NoClassDefFoundError e) {
			// this happens if the JNI library is missing
			this.destination = null;
		}
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.rfcgen.ui.wizard.RFCMappingNewProjectWizard#addPages()
	 */
	@Override
	public void addPages() {
		super.addPages();
		getMainPage().setTitle("RFC Mapping Project");
		getMainPage().setDescription("Create a new RFC Mapping project.");

		if (destination == null) {
			noConnectionPage = new NoConnectionPage();
			addPage(noConnectionPage);
		} else {
			functionModulePage = new FunctionModuleSelectionPage(destination);
			addPage(functionModulePage);
		}
		parametersPage = new MappingParametersPage();
		addPage(parametersPage);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.wizard.Wizard#canFinish()
	 */
	@Override
	public boolean canFinish() {
		return super.canFinish() && getContainer().getCurrentPage() == parametersPage;
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.rfcgen.ui.wizard.RFCMappingNewProjectWizard#getProjectInfo()
	 */
	@Override
	protected IProjectInfo getProjectInfo() {
		ExtendedRFCMappingProjectInfo projectInfo = new ExtendedRFCMappingProjectInfo();
		projectInfo.setProjectName(getMainPage().getProjectName());
		if (destination != null) {
			projectInfo.setDestination(destination);
			projectInfo.setFunctionModules(functionModulePage.getSelectedFunctionModules());
		}
		projectInfo.setPackageName(parametersPage.getPackageName());
		projectInfo.setCallStyleMappingSelected(parametersPage.isCallStyleMappingSelected());
		return projectInfo;
	}

	/**
	 * @return the first wizard page
	 */
	protected WizardNewProjectCreationPage getMainPage() {
		return (WizardNewProjectCreationPage) getPage("basicNewProjectPage");
	}
	
}
