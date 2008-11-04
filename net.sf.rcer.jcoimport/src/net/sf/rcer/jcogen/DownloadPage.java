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
package net.sf.rcer.jcogen;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;

/**
 * A wizard page that leads the user to the download page for the SAP Java Connector.
 * @author vwegert
 *
 */
public class DownloadPage extends WizardPage {

	/**
	 * Default constructor.
	 */
	DownloadPage() {
		super("Download Page");
		setTitle("Download the SAP Java Connector");
		setPageComplete(true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().applyTo(top);
		
		Label intro = new Label(top, SWT.WRAP);
		intro.setText("Due to license restrictions, the SAP Java Connector (JCo) may not be delivered as part of the connector package. Please visit the following URL and download the packages for the operating systems you want to support.");
		GridDataFactory.swtDefaults().hint(parent.getSize().x, SWT.DEFAULT).applyTo(intro);
		
		Link link = new Link(top, SWT.NONE); 
		link.setText("<A HREF=\"http://service.sap.com/connectors\">http://service.sap.com/connectors</A>");
		link.setEnabled(true);
		GridDataFactory.swtDefaults().applyTo(link);
		// TODO actually do something when the user clicks that link, e. g. open the URL in a browser window
		
		Label notes = new Label(top, SWT.WRAP);
		notes.setText("Please note that you'll need a valid SAPnet user account to download the packages. Also note that JCo versions prior to 3.0.0 are not supported by the connector plug-ins.");
		GridDataFactory.swtDefaults().hint(parent.getSize().x, SWT.DEFAULT).applyTo(notes);
		
		Label cont = new Label(top, SWT.WRAP);
		cont.setText("When you have completed the download, continue to the next page.");
		GridDataFactory.swtDefaults().hint(parent.getSize().x, SWT.DEFAULT).applyTo(cont);
		
		setControl(top);
		Dialog.applyDialogFont(top);
	}

}
