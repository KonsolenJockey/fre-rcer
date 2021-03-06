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

/**
 * An interface providing the names of the projects to be created as constants.
 * @author vwegert
 *
 */
public interface IProjectNames {
	
	/**
	 * The name of the plug-in that contains the platform-independent parts of the SAP Java Connector.
	 */
	public static final String PLUGIN_JCO = "com.sap.conn.jco"; //$NON-NLS-1$
	
	/**
	 * The name of the plug-in that contains the documentation of the SAP Java Connector.
	 */
	public static final String PLUGIN_JCO_DOC = "com.sap.conn.jco.doc"; //$NON-NLS-1$
	
	/**
	 * The name of the plug-in that contains the SAP IDoc library.
	 */
	public static final String PLUGIN_IDOC = "com.sap.conn.jco.idoc"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Windows 32-bit platform. 
	 */
	public static final String FRAGMENT_WINDOWS_32 = "com.sap.conn.jco.win32.x86"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Windows 64-bit Itanium platform. 
	 */
	public static final String FRAGMENT_WINDOWS_64IA = "com.sap.conn.jco.win32.ia64"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Windows 64-bit x86 platform. 
	 */
	public static final String FRAGMENT_WINDOWS_64X86 = "com.sap.conn.jco.win32.x86_64"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Linux 32-bit platform. 
	 */
	public static final String FRAGMENT_LINUX_32 = "com.sap.conn.jco.linux.x86"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Linux 64-bit Itanium platform. 
	 */
	public static final String FRAGMENT_LINUX_64IA = "com.sap.conn.jco.linux.ia64"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Linux 64-bit x86 platform. 
	 */
	public static final String FRAGMENT_LINUX_64X86 = "com.sap.conn.jco.linux.x86_64"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Darwin 32-bit x86 platform. 
	 */
	public static final String FRAGMENT_DARWIN_32 = "com.sap.conn.jco.osx.x86"; //$NON-NLS-1$
	
	/**
	 * The name of the fragment that contains the native libraries for the Darwin 64-bit Itanium platform. 
	 */
	public static final String FRAGMENT_DARWIN_64 = "com.sap.conn.jco.osx.x86_64"; //$NON-NLS-1$
	
}
