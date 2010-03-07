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

import org.eclipse.osgi.util.NLS;

/**
 * The localized messages of the plug-in classes.
 * @author vwegert
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "net.sf.rcer.jcoimport.messages"; //$NON-NLS-1$
	
	public static String ArchiveFilesPage_BrowseButton;
	public static String ArchiveFilesPage_Darwin64Label;
	public static String ArchiveFilesPage_Dawin32Label;
	public static String ArchiveFilesPage_FileNameHintLabel;
	public static String ArchiveFilesPage_FileReadError;
	public static String ArchiveFilesPage_InfoLabel;
	public static String ArchiveFilesPage_Linux32Label;
	public static String ArchiveFilesPage_Linux64IALabel;
	public static String ArchiveFilesPage_Linux64x86Label;
	public static String ArchiveFilesPage_NoFilesSpecifiedError;
	public static String ArchiveFilesPage_OpenDialogTitle;
	public static String ArchiveFilesPage_PageName;
	public static String ArchiveFilesPage_Title;
	public static String ArchiveFilesPage_Win32Label;
	public static String ArchiveFilesPage_Win64IALabel;
	public static String ArchiveFilesPage_Win64x86Label;
	public static String DownloadPage_Continue;
	public static String DownloadPage_DialogTitle;
	public static String DownloadPage_Intro;
	public static String DownloadPage_Notes;
	public static String DownloadPage_OpenURLErrorMessage;
	public static String DownloadPage_PageName;
	public static String DownloadPage_PageTitle;
	public static String DownloadPage_URL;
	public static String JCoImportWizard_DialogTitle;
	public static String JCoImportWizard_ErrorMessage;
	public static String JCoImportWizard_ImportCancelledMessage;
	public static String JCoImportWizard_WindowTitle;
	public static String ProjectGenerator_CopyDocumentationTaskDescription;

	public static String ProjectGenerator_CopyingFileTaskDescription;

	public static String ProjectGenerator_CreateFragmentTaskDescription;
	public static String ProjectGenerator_CreatePluginTaskDescription;
	public static String ProjectGenerator_Darwin32Description;
	public static String ProjectGenerator_Darwin64Description;
	public static String ProjectGenerator_Linux32Description;
	public static String ProjectGenerator_Linux64IADescription;
	public static String ProjectGenerator_Linux64x86Description;
	public static String ProjectGenerator_NoInputFileError;
	public static String ProjectGenerator_TaskDescription;
	public static String ProjectGenerator_UnknownFileTypeMessage;
	public static String ProjectGenerator_Win32Description;
	public static String ProjectGenerator_Win64IADescription;
	public static String ProjectGenerator_Win64x86Description;
	public static String SummaryPage_CreateProjectLabel;
	public static String SummaryPage_ExportToDropinsLabel;
	public static String SummaryPage_InfoLabel;
	public static String SummaryPage_NoSourceLabel;
	public static String SummaryPage_PageName;
	public static String SummaryPage_PageTitle;
	public static String SummaryPage_ReplaceProjectLabel;
	public static String SummaryPage_TargetPathLabel;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// nothing to do 
	}
}
