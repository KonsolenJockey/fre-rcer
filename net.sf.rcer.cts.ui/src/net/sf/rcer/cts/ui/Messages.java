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
package net.sf.rcer.cts.ui;

import org.eclipse.osgi.util.NLS;

/**
 * The localized messages of the plug-in classes.
 * @author vwegert
 *
 */
public class Messages extends NLS {
	
	private static final String BUNDLE_NAME = "net.sf.rcer.cts.ui.messages"; //$NON-NLS-1$
	
	public static String TransportSelectionDialog_ColumnDescription;
	public static String TransportSelectionDialog_ColumnOwner;
	public static String TransportSelectionDialog_ErrorMessageSelection;
	public static String TransportSelectionDialog_ErrorReadingTransports;
	public static String TransportSelectionDialog_ErrorTitle;
	public static String TransportSelectionDialog_Title;
	
	public static String TreeLevelTarget_LocalChangeRequests;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		// nothing to do
	}
}
