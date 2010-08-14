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
	
	/**
	 * ''{0}'' is not a valid transport category.
	 */
	public static String TransportCategory_ErrorCategoryKeyInvalid;

	/**
	 * ''{0}'' is not a valid transport order type.
	 */
	public static String TransportOrderType_ErrorOrderTypeKeyInvalid;

	/**
	 * Customizing
	 */
	public static String TransportOrderType_TextCustomizing;

	/**
	 * Transport of Copies
	 */
	public static String TransportOrderType_TextTransportOfCopies;

	/**
	 * Workbench
	 */
	public static String TransportOrderType_TextWorkbench;

	/**
	 * ''{0}'' is not a valid transport order status.
	 */
	public static String TransportStatus_ErrorTransportStatusInvalid;

	/**
	 * Release Started
	 */
	public static String TransportStatus_StatusReleaseTextStarted;

	/**
	 * Modifiable
	 */
	public static String TransportStatus_StatusTextModifiable;

	/**
	 * Modifiable, protected
	 */
	public static String TransportStatus_StatusTextProtected;

	/**
	 * Released
	 */
	public static String TransportStatus_StatusTextReleased;

	/**
	 * Released (with import protection for repaired objects)
	 */
	public static String TransportStatus_StatusTextReleasedImportProtection;

	/**
	 * Error adding {0} task for user {1} to transport order {2}.
	 */
	public static String TransportSystem_ErrorAddingTaskForUser;

	/**
	 * Unable to add {0} task for user {1} to transport order {2}: {3}
	 */
	public static String TransportSystem_ErrorAddingTaskForUserWithMessage;

	/**
	 * {0} is a transport order, not a transport task.
	 */
	public static String TransportSystem_ErrorOrderNotTask;

	/**
	 * Unable to read the transport {0}: {1}
	 */
	public static String TransportSystem_ErrorReadingTransport;

	/**
	 * {0} is a transport task, not a transport order.
	 */
	public static String TransportSystem_ErrorTaskNotOrder;

	/**
	 * Adding a transport task of type {0}is not supported at the moment.
	 */
	public static String TransportSystem_ErrorTaskTypeNotSupported;

	/**
	 * ABAP exception adding {0} task for user {1} to transport order {2}.
	 */
	public static String TransportSystem_ExceptionAddingTaskForUser;

	/**
	 * ABAP exception reading the transport {0}: {1}
	 */
	public static String TransportSystem_ExceptionReadingTransport;

	/**
	 * Unable to read the contents of table E070.
	 */
	public static String TransportTableReader_ErrorReadingContents;

	/**
	 * Unable to read structure of table E070.
	 */
	public static String TransportTableReader_ErrorReadingStructure;

	/**
	 * The structure of table E070 seems to have changed - wtf?
	 */
	public static String TransportTableReader_ErrorStructureChanged;

	/**
	 * Development / Correction
	 */
	public static String TransportTaskType_Correction;

	/**
	 * Customizing
	 */
	public static String TransportTaskType_Customizing;

	/**
	 * ''{0}'' is not a valid transport task type.
	 */
	public static String TransportTaskType_ErrorNoValidTaskType;

	/**
	 * Repair
	 */
	public static String TransportTaskType_Repair;

	/**
	 * Unclassified
	 */
	public static String TransportTaskType_Unclassified;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// nothing to do 
	}

}
