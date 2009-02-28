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
package net.sf.rcer.example.rfcgen.pojo.call;

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 * @author vwegert
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction exitAction;
	private IWorkbenchAction preferenceAction;

	/**
	 * Default constructor.
	 * @param configurer
	 * @see ActionBarAdvisor#ActionBarAdvisor(IActionBarConfigurer)
	 */
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.application.ActionBarAdvisor#makeActions(org.eclipse.ui.IWorkbenchWindow)
	 */
	@Override
	protected void makeActions(final IWorkbenchWindow window) {
		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);
		preferenceAction = ActionFactory.PREFERENCES.create(window);
		register(preferenceAction);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.application.ActionBarAdvisor#fillMenuBar(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager fileMenu = new MenuManager("&File", IWorkbenchActionConstants.M_FILE);
		ActionContributionItem preferencesItem = new ActionContributionItem(preferenceAction);
		preferencesItem.setVisible(!SWT.getPlatform().equals("carbon"));
		fileMenu.add(preferencesItem);
		menuBar.add(fileMenu);
		fileMenu.add(exitAction);
	}

}
