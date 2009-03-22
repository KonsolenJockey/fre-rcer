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
package net.sf.rcer.jcoimport;

import java.net.URL;
import java.text.MessageFormat;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.ui.PlatformUI;

/**
 * A wizard page that leads the user to the download page for the SAP Java Connector.
 * @author vwegert
 *
 */
public class DownloadPage extends WizardPage {

	/**
	 * The ID of the plug-in - we don't have an Activator...
	 */
	public static final String PLUGIN_ID = "net.sf.rcer.jcoimport"; //$NON-NLS-1$
	
	/**
	 * The URL of the JCo download page.
	 */
	public static final String JCO_DOWNLOAD_PAGE = Messages.DownloadPage_URL;
	
	/**
	 * Default constructor.
	 */
	DownloadPage() {
		super(Messages.DownloadPage_PageName);
		setTitle(Messages.DownloadPage_PageTitle);
		setPageComplete(true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().applyTo(top);
		
		Label intro = new Label(top, SWT.WRAP);
		intro.setText(Messages.DownloadPage_Intro);
		GridDataFactory.swtDefaults().hint(parent.getSize().x, SWT.DEFAULT).applyTo(intro);
		
		Link link = new Link(top, SWT.NONE); 
		link.setText(MessageFormat.format("<A>{0}</A>", JCO_DOWNLOAD_PAGE)); //$NON-NLS-1$
		link.setEnabled(true);
		GridDataFactory.swtDefaults().applyTo(link);
		link.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent event) {
				try {
					PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser().openURL(new URL(JCO_DOWNLOAD_PAGE));
				} catch (Exception ex) {
					ErrorDialog.openError(getShell(), Messages.DownloadPage_DialogTitle, Messages.DownloadPage_OpenURLErrorMessage, 
							new Status(IStatus.ERROR, PLUGIN_ID, ex.getMessage(), ex));
				}
			}
		});
		
		Label notes = new Label(top, SWT.WRAP);
		notes.setText(Messages.DownloadPage_Notes);
		GridDataFactory.swtDefaults().hint(parent.getSize().x, SWT.DEFAULT).applyTo(notes);
		
		Label cont = new Label(top, SWT.WRAP);
		cont.setText(Messages.DownloadPage_Continue);
		GridDataFactory.swtDefaults().hint(parent.getSize().x, SWT.DEFAULT).applyTo(cont);
		
		setControl(top);
		Dialog.applyDialogFont(top);
	}

}
