/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
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
import net.sf.rcer.conn.ui.Messages;

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
		globalGroup.setText(Messages.TracePreferencePage_GlobalSettingsGroup);
		
		Label globalTraceLevelLabel = new Label(globalGroup, SWT.NONE);
		GridDataFactory.swtDefaults().applyTo(globalTraceLevelLabel);
		globalTraceLevelLabel.setText(Messages.TracePreferencePage_RFCTraceLevelLabel);
		
		globalTraceLevelCombo = new Combo(globalGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridDataFactory.swtDefaults().grab(true, false).applyTo(globalTraceLevelCombo);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel0Description, 0);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel1Description, 1);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel2Description, 2);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel3Description, 3);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel4Description, 4);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel5Description, 5);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel6Description, 6);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel7Description, 7);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel8Description, 8);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel9Description, 9);
		globalTraceLevelCombo.add(Messages.TracePreferencePage_RFCTraceLevel10Description, 10);
		
		// --- connection-level -------------------------------------------------------------------
		
		Group connectionGroup = new Group(master, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(connectionGroup);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(connectionGroup);
		connectionGroup.setText(Messages.TracePreferencePage_ConnectionSettingsGroup);
		
		connectionRFCTraceCheckbox = new Button(connectionGroup, SWT.CHECK);
		GridDataFactory.swtDefaults().span(2, 1).applyTo(connectionRFCTraceCheckbox);
		connectionRFCTraceCheckbox.setText(Messages.TracePreferencePage_EnableRFCTraceLabel);
		
		Label connectionCPICTraceLevelLabel = new Label(connectionGroup, SWT.NONE);
		GridDataFactory.swtDefaults().applyTo(connectionCPICTraceLevelLabel);
		connectionCPICTraceLevelLabel.setText(Messages.TracePreferencePage_CPICTraceLevelLabel);
		
		connectionCPICTraceLevelCombo = new Combo(connectionGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		GridDataFactory.swtDefaults().grab(true, false).applyTo(connectionCPICTraceLevelCombo);
		connectionCPICTraceLevelCombo.add(Messages.TracePreferencePage_CPICTraceLevel0Description, 0);
		connectionCPICTraceLevelCombo.add(Messages.TracePreferencePage_CPICTraceLevel1Description, 1);
		connectionCPICTraceLevelCombo.add(Messages.TracePreferencePage_CPICTraceLevel2Description, 2);
		connectionCPICTraceLevelCombo.add(Messages.TracePreferencePage_CPICTraceLevel3Description, 3);
		
		// --- hint -------------------------------------------------------------------------------
		
		Label errorLogLabel = new Label(master, SWT.WRAP);
		GridDataFactory.swtDefaults().grab(true, false).applyTo(errorLogLabel);
		errorLogLabel.setText(Messages.TracePreferencePage_TracingHintsLabel);
		
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
