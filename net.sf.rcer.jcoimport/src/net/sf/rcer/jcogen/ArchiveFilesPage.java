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

import java.io.File;
import java.text.MessageFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * A wizard page that lets the user specify where to load the SAP JCo files from.
 * @author vwegert
 *
 */
public class ArchiveFilesPage extends WizardPage {

	private ProjectGeneratorSettings generatorSettings;
	
	private Text win32FilenameText;
	private Text win64IAFilenameText;
	private Text win64x86FilenameText;
	private Text linux32FilenameText;
	private Text linux64IAFilenameText;
	private Text linux64x86FilenameText;
	private Text darwin32FilenameText;
	private Text darwin64FilenameText;

	private ModifyListener filenameModifyListener;

	private DataBindingContext context;

	/**
	 * Default constructor.
	 * @param context 
	 * @param generatorSettings 
	 */
	protected ArchiveFilesPage(DataBindingContext context, ProjectGeneratorSettings generatorSettings) {
		super("Archive Files");
		this.context = context;
		this.generatorSettings = generatorSettings;
		setTitle("Specify JCo Archive Files");
		setPageComplete(false);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(3).applyTo(top);

		Label info = new Label(top, SWT.NONE);
		info.setText("Please specify the location of the downloaded packages.");
		GridDataFactory.swtDefaults().span(3, 1).applyTo(info);

		// TODO use databinding mechanisms for this
		filenameModifyListener = new ModifyListener() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.events.ModifyEvent)
			 */
			public void modifyText(ModifyEvent e) {
				if ((win32FilenameText.getText().length() == 0) && 
						(win64IAFilenameText.getText().length() == 0) && 
						(win64x86FilenameText.getText().length() == 0) && 
						(linux32FilenameText.getText().length() == 0) && 
						(linux64IAFilenameText.getText().length() == 0) && 
						(linux64x86FilenameText.getText().length() == 0) && 
						(darwin32FilenameText.getText().length() == 0) && 
						(darwin64FilenameText.getText().length() == 0)) {
					setErrorMessage("You must specify at least one package file.");
					setPageComplete(false);
				} else {
					setErrorMessage(null);
					setPageComplete(true);
					checkFile(win32FilenameText.getText());
					checkFile(win64IAFilenameText.getText()); 
					checkFile(win64x86FilenameText.getText());
					checkFile(linux32FilenameText.getText()); 
					checkFile(linux64IAFilenameText.getText());
					checkFile(linux64x86FilenameText.getText()); 
					checkFile(darwin32FilenameText.getText()); 
					checkFile(darwin64FilenameText.getText());
				}
			}

			/**
			 * Auxiliary method to check the existence of a file.
			 * @param name the name of the file
			 */
			private void checkFile(String name) {
				if (name.length() > 0) {
					File f = new File(name);
					if (!f.canRead()) {
						setErrorMessage(MessageFormat.format("Unable to read file {0}.", name));
						setPageComplete(false);
					}
				}
			}
		};
		
		win32FilenameText = addFileRow(top, "win32FileName", "Windows (32-bit)",
				"sapjco3-ntintel-3.x.x.zip", "*.zip");
		win64IAFilenameText = addFileRow(top, "win64IAFileName",
				"Windows (64-bit Itanium)", "sapjco3-ntia64-3.x.x.zip", "*.zip");
		win64x86FilenameText = addFileRow(top, "win64x86FileName", "Windows (64-bit x86)",
				"sapjco3-ntamd64-3.x.x.zip", "*.zip");

		linux32FilenameText = addFileRow(top, "linux32FileName", "Linux (32-bit)",
				"sapjco3-linuxintel-3.x.x.tgz", "*.tgz");
		linux64IAFilenameText = addFileRow(top, "linux64IAFileName",
				"Linux (64-bit Itanium)", "sapjco3-linuxia64-3.x.x.tgz", "*.tgz");
		linux64x86FilenameText = addFileRow(top, "linux64x86FileName",
				"Linux (64-bit x86)", "sapjco3-linuxx86_64-3.x.x.tgz", "*.tgz");

		darwin32FilenameText = addFileRow(top, "darwin32FileName",
				"Max OS X (32-bit Intel)", "sapjco3-darwinintel-3.x.x.zip", "*.zip");
		darwin64FilenameText = addFileRow(top, "darwin64FileName",
				"Mac OS X (64-bit Intel)", "sapjco3-darwinx64-3.x.x.zip", "*.zip");

		setControl(top);
		Dialog.applyDialogFont(top);
	}

	/**
	 * Auxiliary method to setup a line of controls for a platform. 
	 * @param parent
	 * @param property 
	 * @param platform
	 * @param filenameHint
	 * @param filenameFilter
	 * @return
	 */
	private Text addFileRow(Composite parent, String property, 
			String platform, String filenameHint, final String filenameFilter) {
		
		Label rowLabel = new Label(parent, SWT.NONE);
		rowLabel.setText(MessageFormat.format("{0}:", platform));
		GridDataFactory.swtDefaults().applyTo(rowLabel);

		final Text filenameText = new Text(parent, SWT.BORDER | SWT.SINGLE);
		filenameText.addModifyListener(filenameModifyListener);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(filenameText);
		context.bindValue(SWTObservables.observeText(filenameText, SWT.Modify), 
				BeansObservables.observeValue(generatorSettings, property), 
				new UpdateValueStrategy(), 
				new UpdateValueStrategy());

		Button browseButton = new Button(parent, SWT.PUSH);
		browseButton.setText("Browse...");
		GridDataFactory.swtDefaults().applyTo(browseButton);
		browseButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				dialog.setText("Browse for SAP JCo Archive");
				dialog.setFilterExtensions(new String[] { filenameFilter });
				String result = dialog.open();
				if (result != null) {
					filenameText.setText(result);
				}
			}
		});

		@SuppressWarnings("unused")
		Label spacer = new Label(parent, SWT.NONE);

		Label hintLabel = new Label(parent, SWT.NONE);
		hintLabel.setText(MessageFormat.format("(should be {0})", filenameHint));
		GridDataFactory.swtDefaults().span(2, 1).applyTo(hintLabel);

		return filenameText;
	}

}
