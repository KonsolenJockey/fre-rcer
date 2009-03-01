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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * A page to determine the parameters to generate the mapping.
 * @author vwegert
 *
 */
public class MappingParametersPage extends WizardPage {

	private String packageName = "";
	private boolean useCallStyleMapping = true;
	
	private Text packageText;
	private Button callMappingButton;
	private Button requestResponseMappingButton;

	/**
	 * Default constructor.
	 */
	public MappingParametersPage() {
		super("Set Mapping Parameters");
		setTitle("Set Mapping Parameters");
		setDescription("Select the target package and the mapping mode.");
		setPageComplete(false);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(top);

		Label packageLabel = new Label(top, SWT.NONE);
		packageLabel.setText("Target Java Package:");
		
		packageText = new Text(top, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).applyTo(packageText);
		packageText.addModifyListener(new ModifyListener() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				packageName = packageText.getText();
				setPageComplete(packageName.length() > 0);
			}
		});
		
		callMappingButton = new Button(top, SWT.RADIO);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).span(2, 1).applyTo(callMappingButton);
		callMappingButton.setText("Call-style Mapping (one class for input and output data)");
		callMappingButton.setSelection(useCallStyleMapping);
		callMappingButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				useCallStyleMapping = true;
			}
		});
		
		requestResponseMappingButton = new Button(top, SWT.RADIO);
		GridDataFactory.swtDefaults().align(SWT.FILL, SWT.CENTER).grab(true, false).span(2, 1).applyTo(requestResponseMappingButton);
		requestResponseMappingButton.setText("Request-Response-style Mapping (separate classes for input and output data)");
		requestResponseMappingButton.setSelection(!useCallStyleMapping);
		requestResponseMappingButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				useCallStyleMapping = false;
			}
		});
		
		setControl(top);
		Dialog.applyDialogFont(top);		
	}
	
	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}
	
	/**
	 * @return whether call-style mapping should be sued
	 */
	public boolean useCallStyleMapping() {
		return useCallStyleMapping;
	}

}
