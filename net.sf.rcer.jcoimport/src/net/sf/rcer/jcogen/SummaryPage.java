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

import java.text.MessageFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * A wizard page that presents a summary before the actual actions are performed.
 * @author vwegert
 *
 */
public class SummaryPage extends WizardPage {

	private ProjectGeneratorSettings generatorSettings;

	private IWorkspaceRoot workspaceRoot;

	private Button checkboxPlugin;
	private Button checkboxFragmentWin32;
	private Button checkboxFragmentWin64IA;
	private Button checkboxFragmentWin64x86;
	private Button checkboxFragmentLinux32;
	private Button checkboxFragmentLinux64IA;
	private Button checkboxFragmentLinux64x86;
	private Button checkboxFragmentDarwinPowerPC;
	private Button checkboxFragmentDarwinIntel;

	private DataBindingContext context;


	/**
	 * Default constructor.
	 * @param context
	 * @param generatorSettings 
	 */
	SummaryPage(DataBindingContext context, ProjectGeneratorSettings generatorSettings) {
		super("Summary Page");
		this.generatorSettings = generatorSettings;
		this.context = context;
		setTitle("Import Summary");
		setPageComplete(true);
		workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createControl(Composite parent) {
		Composite top = new Composite(parent, SWT.NONE);
		GridLayoutFactory.swtDefaults().numColumns(1).applyTo(top);
		
		Label info = new Label(top, SWT.NONE);
		info.setText("Review the actions you want the wizard to perform:");
		GridDataFactory.swtDefaults().applyTo(info);
		
		checkboxPlugin = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxPlugin), 
				BeansObservables.observeValue(generatorSettings, "pluginProjectSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentWin32 = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentWin32), 
				BeansObservables.observeValue(generatorSettings, "win32FragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentWin64IA = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentWin64IA), 
				BeansObservables.observeValue(generatorSettings, "win64IAFragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentWin64x86 = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentWin64x86), 
				BeansObservables.observeValue(generatorSettings, "win64x86FragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentLinux32 = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentLinux32), 
				BeansObservables.observeValue(generatorSettings, "linux32FragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentLinux64IA = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentLinux64IA), 
				BeansObservables.observeValue(generatorSettings, "linux64IAFragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentLinux64x86 = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentLinux64x86), 
				BeansObservables.observeValue(generatorSettings, "linux64x86FragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentDarwinPowerPC = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentDarwinPowerPC), 
				BeansObservables.observeValue(generatorSettings, "darwinPowerPCFragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		checkboxFragmentDarwinIntel = new Button(top, SWT.CHECK);
		context.bindValue(SWTObservables.observeSelection(checkboxFragmentDarwinIntel), 
				BeansObservables.observeValue(generatorSettings, "darwinIntelFragmentSelected"),
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		updateCheckboxes();
		setControl(top);
		Dialog.applyDialogFont(top);
	}

	/**
	 * Updates the state of the checkboxes so that the text and the state correspond to the selected files.
	 */
	private void updateCheckboxes() {
		// TODO use databinding mechanisms to update the checkboxes
		updateCheckbox(checkboxPlugin, "foo", IProjectNames.PLUGIN_JCO);
		updateCheckbox(checkboxFragmentWin32, 			
				generatorSettings.getWin32FileName(), 
				IProjectNames.FRAGMENT_WINDOWS_32);
		updateCheckbox(checkboxFragmentWin64IA,		
				generatorSettings.getWin64IAFileName(), 
				IProjectNames.FRAGMENT_WINDOWS_64IA);
		updateCheckbox(checkboxFragmentWin64x86,     
				generatorSettings.getWin64x86FileName(), 
				IProjectNames.FRAGMENT_WINDOWS_64X86);
		updateCheckbox(checkboxFragmentLinux32,      
				generatorSettings.getLinux32FileName(), 
				IProjectNames.FRAGMENT_LINUX_32);
		updateCheckbox(checkboxFragmentLinux64IA,    
				generatorSettings.getLinux64IAFileName(), 
				IProjectNames.FRAGMENT_LINUX_64IA);
		updateCheckbox(checkboxFragmentLinux64x86,   
				generatorSettings.getLinux64x86FileName(), 
				IProjectNames.FRAGMENT_LINUX_64X86);
		updateCheckbox(checkboxFragmentDarwinPowerPC, 
				generatorSettings.getDarwinPowerPCFileName(), 
				IProjectNames.FRAGMENT_DARWIN_POWERPC);
		updateCheckbox(checkboxFragmentDarwinIntel,  
				generatorSettings.getDarwinIntelFileName(), 
				IProjectNames.FRAGMENT_DARWIN_INTEL);
	}

	/**
	 * Updates the state of a single checkboxes so that the text and the state correspond to the selected file. 
	 * @param checkbox the checkbox to update
	 * @param fileName the name of the archive file
	 * @param projectName the name of the target project
	 */
	private void updateCheckbox(Button checkbox, String fileName, String projectName) {
		if (fileName.length() == 0) {
			checkbox.setText(MessageFormat.format("No source archive available to generate project {0}.", projectName));
			checkbox.setSelection(false);
			checkbox.setEnabled(false);
		} else {
			checkbox.setEnabled(true);
			if (workspaceRoot.getProject(projectName).exists()) {
				checkbox.setText(MessageFormat.format("Replace existing project {0}.", projectName));
				checkbox.setSelection(false);
			} else {
				checkbox.setText(MessageFormat.format("Create new project {0}.", projectName));
				checkbox.setSelection(true);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.DialogPage#setVisible(boolean)
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			updateCheckboxes();
		}
	}
	
}
