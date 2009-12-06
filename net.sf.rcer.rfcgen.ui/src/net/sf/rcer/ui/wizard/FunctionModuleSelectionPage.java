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
package net.sf.rcer.ui.wizard;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunctionTemplate;

/**
 * A page to let the user select function modules for mapping.
 * @author vwegert
 *
 */
public class FunctionModuleSelectionPage extends WizardPage {

	private static final String PLUGIN_ID = "net.sf.rcer.rfcgen.ui";
	
	private JCoDestination destination;
	private Map<String, JCoFunctionTemplate> selectedFunctionModules = new TreeMap<String, JCoFunctionTemplate>();

	private Text functionModuleText;
	private List functionModuleList;

	/**
	 * Default constructor.
	 */
	public FunctionModuleSelectionPage(JCoDestination destination) {
		super("Select Function Modules");
		setTitle("Select Function Modules");
		setDescription("Select the RFC function modules you want to include in the generated mapping file.");
		setPageComplete(false);
		this.destination = destination;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(top);

		functionModuleText = new Text(top, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).applyTo(functionModuleText);

		Button addButton = new Button(top, SWT.PUSH);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).applyTo(addButton);
		addButton.setText("Add");
		addButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				addFunctionModule(functionModuleText.getText().toUpperCase());
			}
		});

		functionModuleList = new List(top, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.FILL).grab(true, true).applyTo(functionModuleList);

		Button removeButton = new Button(top, SWT.PUSH);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.BEGINNING).applyTo(removeButton);
		removeButton.setText("Remove");
		removeButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				removeSelectedFunctionModules();
			}
		});

		setControl(top);
		Dialog.applyDialogFont(top);		
	}

	/**
	 * Checks a function module name for existence and adds the function module to the list. 
	 * @param text
	 */
	protected void addFunctionModule(String name) {
		if (!selectedFunctionModules.containsKey(name)) {
			try {
				JCoFunctionTemplate functionModule = destination.getRepository().getFunctionTemplate(name);
				if (functionModule == null) {
					final String message = MessageFormat.format(
							"The function module {0} does not exist.", name);
					ErrorDialog.openError(getShell(), "RFC Mapping Wizard", message, 
							new Status(IStatus.ERROR, PLUGIN_ID, message));
				} else {
				selectedFunctionModules.put(name, functionModule);
				updateList();
				}
			} catch (JCoException e) {
				ErrorDialog.openError(getShell(), "RFC Mapping Wizard", e.getMessage(), 
						new Status(IStatus.ERROR, PLUGIN_ID, e.getMessage(), e));
			}
		}
	}

	/**
	 * Removes the selected function modules from the list. 
	 */
	protected void removeSelectedFunctionModules() {
		for (final String functionModule: functionModuleList.getSelection()) {
			selectedFunctionModules.remove(functionModule);
		}
		updateList();
	}

	/**
	 * Updates the list display and determines whether the user may continue.
	 */
	private void updateList() {
		final Set<String> functionModules = selectedFunctionModules.keySet();
		functionModuleList.setItems(functionModules.toArray(new String[functionModules.size()]));
		setPageComplete(functionModules.size() > 0);
	}

	/**
	 * @return the list of selected function modules
	 * @see java.util.Map#values()
	 */
	public Collection<JCoFunctionTemplate> getSelectedFunctionModules() {
		return selectedFunctionModules.values();
	}

}
