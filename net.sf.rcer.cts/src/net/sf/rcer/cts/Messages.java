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
package net.sf.rcer.cts;

import org.eclipse.osgi.util.NLS;


/**
 * The localized messages of the plug-in classes.
 * @author vwegert
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "net.sf.rcer.cts.messages"; //$NON-NLS-1$
	
	public static String TransportCategory_ErrorCategoryKeyInvalid;

	public static String TransportOrderType_ErrorOrderTypeKeyInvalid;
	public static String TransportOrderType_TextCustomizing;
	public static String TransportOrderType_TextTransportOfCopies;
	public static String TransportOrderType_TextWorkbench;

	public static String TransportStatus_ErrorTransportStatusInvalid;
	public static String TransportStatus_StatusReleaseTextStarted;
	public static String TransportStatus_StatusTextModifiable;
	public static String TransportStatus_StatusTextProtected;
	public static String TransportStatus_StatusTextReleased;
	public static String TransportStatus_StatusTextReleasedImportProtecteion;

	public static String TransportSystem_ErrorReadingTransportOrder;
	public static String TransportSystem_ErrorTaskNotOrder;
	public static String TransportSystem_ExceptionReadingTransportOrder;

	public static String TransportTableReader_ErrorReadingContents;
	public static String TransportTableReader_ErrorReadingStructure;
	public static String TransportTableReader_ErrorStructureChanged;
	
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// nothing to do 
	}

}
