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
package net.sf.rcer.jcoimport;

import org.eclipse.osgi.util.NLS;

/**
 * The localized messages of the plug-in classes.
 * @author vwegert
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "net.sf.rcer.jcoimport.messages"; //$NON-NLS-1$

	/**
	 * Browse...
	 */
	public static String ArchiveFilesPage_BrowseButton;

	/**
	 * Mac OS X (64-bit Intel)
	 */
	public static String ArchiveFilesPage_Darwin64Label;

	/**
	 * Max OS X (32-bit Intel)
	 */
	public static String ArchiveFilesPage_Dawin32Label;

	/**
	 * (should be {0})
	 */
	public static String ArchiveFilesPage_FileNameHintLabel;

	/**
	 * Unable to read file {0}.
	 */
	public static String ArchiveFilesPage_FileReadError;

	/**
	 * IDoc Library
	 */
	public static String ArchiveFilesPage_IDocLabel;

	/**
	 * Please specify the location of the downloaded packages.
	 */
	public static String ArchiveFilesPage_InfoLabel;

	/**
	 * Linux (32-bit)
	 */
	public static String ArchiveFilesPage_Linux32Label;

	/**
	 * Linux (64-bit Itanium)
	 */
	public static String ArchiveFilesPage_Linux64IALabel;

	/**
	 * Linux (64-bit x86)
	 */
	public static String ArchiveFilesPage_Linux64x86Label;

	/**
	 * You must specify at least one package file.
	 */
	public static String ArchiveFilesPage_NoFilesSpecifiedError;

	/**
	 * Browse for SAP JCo Archive
	 */
	public static String ArchiveFilesPage_OpenDialogTitle;

	/**
	 * Archive Files
	 */
	public static String ArchiveFilesPage_PageName;

	/**
	 * Specify JCo Archive Files
	 */
	public static String ArchiveFilesPage_Title;

	/**
	 * Windows (32-bit)
	 */
	public static String ArchiveFilesPage_Win32Label;

	/**
	 * Windows (64-bit Itanium)
	 */
	public static String ArchiveFilesPage_Win64IALabel;

	/**
	 * Windows (64-bit x86)
	 */
	public static String ArchiveFilesPage_Win64x86Label;

	/**
	 * When you have completed the download, continue to the next page.
	 */
	public static String DownloadPage_Continue;

	/**
	 * JCo Import Wizard
	 */
	public static String DownloadPage_DialogTitle;

	/**
	 * Be aware that SAP has started to deliver the JCo as a zipped zipped file. This is not a typo, you get to download a zipped file that only contains a single zipped file. This import wizard can't handle this construct, so you need to unzip the "outer" file first, until you get to the real contents. This does NOT apply to the iDOC library. 
	 */
	public static String DownloadPage_Extract;
	
	/**
	 * Due to license restrictions, the SAP Java Connector (JCo) may not be delivered as part of the connector package. 
	 * Please visit the following URL and download the packages for the operating systems you want to support. You can 
	 * also download the SAP IDoc library and have the plug-ins for this library generated automatically.
	 */
	public static String DownloadPage_Intro;

	/**
	 * Please note that you'll need a valid SAPnet user account to download the packages. Also note that JCo versions 
	 * prior to 3.0.0 are not supported by the connector plug-ins.
	 */
	public static String DownloadPage_Notes;

	/**
	 * Error opening the JCo download page.
	 */
	public static String DownloadPage_OpenURLErrorMessage;

	/**
	 * Download Page
	 */
	public static String DownloadPage_PageName;

	/**
	 * Download the SAP Java Connector
	 */
	public static String DownloadPage_PageTitle;

	/**
	 * http://service.sap.com/connectors
	 */
	public static String DownloadPage_URL;

	/**
	 * SAP JCo Import
	 */
	public static String JCoImportWizard_DialogTitle;

	/**
	 * Error importing the SAP Java Connector.
	 */
	public static String JCoImportWizard_ErrorMessage;

	/**
	 * The import was canceled. You may have to remove incomplete plug-in projects manually.
	 */
	public static String JCoImportWizard_ImportCancelledMessage;

	/**
	 * Java Connector Import Wizard
	 */
	public static String JCoImportWizard_WindowTitle;

	/**
	 * Copying documentation and examples...
	 */
	public static String ProjectGenerator_CopyDocumentationTaskDescription;

	/**
	 * Copying file {0}...
	 */
	public static String ProjectGenerator_CopyingFileTaskDescription;

	/**
	 * Creating fragment project {0}...
	 */
	public static String ProjectGenerator_CreateFragmentTaskDescription;

	/**
	 * Creating plug-in project {0}...
	 */
	public static String ProjectGenerator_CreatePluginTaskDescription;

	/**
	 * OS X (32-bit Intel)
	 */
	public static String ProjectGenerator_Darwin32Description;

	/**
	 * OS X (64-bit Intel)
	 */
	public static String ProjectGenerator_Darwin64Description;

	/**
	 * Linux (32-bit)
	 */
	public static String ProjectGenerator_Linux32Description;

	/**
	 * Linux (64-bit Itanium)
	 */
	public static String ProjectGenerator_Linux64IADescription;

	/**
	 * Linux (64-bit x86)
	 */
	public static String ProjectGenerator_Linux64x86Description;

	/**
	 * No input file was selected - should never have happened.
	 */
	public static String ProjectGenerator_NoInputFileError;

	/**
	 * Importing the SAP Java Connector
	 */
	public static String ProjectGenerator_TaskDescription;

	/**
	 * Unknown file type: {0}
	 */
	public static String ProjectGenerator_UnknownFileTypeMessage;

	/**
	 * Windows (32-bit)
	 */
	public static String ProjectGenerator_Win32Description;

	/**
	 * Windows (64-bit Itanium)
	 */
	public static String ProjectGenerator_Win64IADescription;

	/**
	 * Windows (64-bit x86)
	 */
	public static String ProjectGenerator_Win64x86Description;

	/**
	 * Create new project {0}.
	 */
	public static String SummaryPage_CreateProjectLabel;

	/**
	 * Export plug-ins and fragments to dropins folder of current installation.
	 */
	public static String SummaryPage_ExportToDropinsLabel;

	/**
	 * Review the actions you want the wizard to perform:
	 */
	public static String SummaryPage_InfoLabel;

	/**
	 * No source archive available to generate project {0}.
	 */
	public static String SummaryPage_NoSourceLabel;

	/**
	 * Summary Page
	 */
	public static String SummaryPage_PageName;

	/**
	 * Import Summary
	 */
	public static String SummaryPage_PageTitle;

	/**
	 * Replace existing project {0}.
	 */
	public static String SummaryPage_ReplaceProjectLabel;

	/**
	 * Target Path:
	 */
	public static String SummaryPage_TargetPathLabel;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// nothing to do 
	}
}
