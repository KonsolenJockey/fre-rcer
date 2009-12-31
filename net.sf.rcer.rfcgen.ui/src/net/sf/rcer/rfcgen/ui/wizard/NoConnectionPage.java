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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * A wizard page that is displayed when no connection to a SAP R/3 system an be made.
 * This page just informs the user that a sample model will be imported.
 * @author vwegert
 *
 */
public class NoConnectionPage extends WizardPage {

	/**
	 * Default constructor.
	 * @param pageName
	 */
	protected NoConnectionPage() {
		super("noConnectionPage");
		setTitle("RFC Mapping Project");
		setDescription("Import Sample Model");
		setPageComplete(true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().applyTo(top);
		
		Label text = new Label(top, SWT.WRAP);
		text.setText("The wizard was unable to connect to a SAP R/3 system. Therefore, a sample model that shows the capabilities of the mapping language will be imported. If you connect to a SAP R/3 system before running this wizard, you can select a function module and have the mapping generated for you instead.");
		GridDataFactory.swtDefaults().hint(parent.getSize().x, SWT.DEFAULT).applyTo(text);
		
		setControl(top);
		Dialog.applyDialogFont(top);
	}

}
