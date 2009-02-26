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
package net.sf.rcer.conn.ui.preferences;


import net.sf.rcer.conn.connections.ConnectionManager;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * A preference page to change the trace levels.
 * @author vwegert
 *
 */
public class TracePreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	private ConnectionManager manager;
	private Combo globalTraceLevelCombo;
	private Button connectionRFCTraceCheckbox;
	private Combo connectionCPICTraceLevelCombo;

	/**
	 * Default constructor.
	 */
	public TracePreferencePage() {
		super();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
		manager = ConnectionManager.getInstance();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		Composite master = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().applyTo(master);
		
		// --- global -----------------------------------------------------------------------------
		
		Group globalGroup = new Group(master, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(globalGroup);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(globalGroup);
		globalGroup.setText("Global Settings");
		
		Label globalTraceLevelLabel = new Label(globalGroup, SWT.NONE);
		GridDataFactory.swtDefaults().applyTo(globalTraceLevelLabel);
		globalTraceLevelLabel.setText("RFC Trace Level:");
		
		globalTraceLevelCombo = new Combo(globalGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridDataFactory.swtDefaults().grab(true, false).applyTo(globalTraceLevelCombo);
		globalTraceLevelCombo.add("0 - nothing", 0);
		globalTraceLevelCombo.add("1 - errors and warnings", 1);
		globalTraceLevelCombo.add("2 - execution path, errors and warnings", 2);
		globalTraceLevelCombo.add("3 - full execution path, errors and warnings", 3);
		globalTraceLevelCombo.add("4 - execution path, info messages, errors and warnings", 4);
		globalTraceLevelCombo.add("5", 5);
		globalTraceLevelCombo.add("6 - full execution path, info messages, errors and warnings", 6);
		globalTraceLevelCombo.add("7 - debug messages, full execution path, info messages, errors and warnings", 7);
		globalTraceLevelCombo.add("8 - verbose debug messages, full execution path, info messages, errors and warnings", 8);
		globalTraceLevelCombo.add("9", 9);
		globalTraceLevelCombo.add("10", 10);
		
		// --- connection-level -------------------------------------------------------------------
		
		Group connectionGroup = new Group(master, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(connectionGroup);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(connectionGroup);
		connectionGroup.setText("Connection-Level Settings");
		
		connectionRFCTraceCheckbox = new Button(connectionGroup, SWT.CHECK);
		GridDataFactory.swtDefaults().span(2, 1).applyTo(connectionRFCTraceCheckbox);
		connectionRFCTraceCheckbox.setText("Enable RFC Trace");
		
		Label connectionCPICTraceLevelLabel = new Label(connectionGroup, SWT.NONE);
		GridDataFactory.swtDefaults().applyTo(connectionCPICTraceLevelLabel);
		connectionCPICTraceLevelLabel.setText("CPI-C Trace Level:");
		
		connectionCPICTraceLevelCombo = new Combo(connectionGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridDataFactory.swtDefaults().grab(true, false).applyTo(connectionCPICTraceLevelCombo);
		connectionCPICTraceLevelCombo.add("0", 0);
		connectionCPICTraceLevelCombo.add("1", 1);
		connectionCPICTraceLevelCombo.add("2", 2);
		connectionCPICTraceLevelCombo.add("3", 3);
		
		// --- hint -------------------------------------------------------------------------------
		
		Label errorLogLabel = new Label(master, SWT.WRAP);
		GridDataFactory.swtDefaults().grab(true, false).applyTo(errorLogLabel);
		errorLogLabel.setText("Use the Error Log view to display the logged events. The trace levels are reset to their default values (errors and warnings only) when exiting the application.");
		
		// set the control contents
		globalTraceLevelCombo.select(manager.getGlobalRFCTraceLevel());
		connectionRFCTraceCheckbox.setSelection(manager.isConnectionRFCTraceEnabled());
		connectionCPICTraceLevelCombo.select(manager.getConnectionCPICTraceLevel());
		
		return master;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		manager.setGlobalRFCTraceLevel(globalTraceLevelCombo.getSelectionIndex());
		manager.setConnectionRFCTraceEnabled(connectionRFCTraceCheckbox.getSelection());
		manager.setConnectionCPICTraceLevel(connectionCPICTraceLevelCombo.getSelectionIndex());
		return super.performOk();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		globalTraceLevelCombo.select(1); // errors and warnings
		connectionRFCTraceCheckbox.setSelection(false);
		connectionCPICTraceLevelCombo.select(0); // off
	}

}
