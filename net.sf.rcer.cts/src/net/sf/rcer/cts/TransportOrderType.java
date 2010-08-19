/**
 * Copyright (c) 2009, 2010 The RCER Development Team.
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

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;

/**
 * The type of a transport order (workbench, customizing, ...).
 * This is a representation of the values of E070-TRFUNCTION for transport orders.
 * @author vwegert
 *
 */
public enum TransportOrderType {
	
	/**
	 * Transport order type 'workbench'. Contains client-independent objects.
	 */
	WORKBENCH("K", Messages.TransportOrderType_TextWorkbench), //$NON-NLS-1$
	
	/**
	 * Transport order type 'customizing'. Contains client-dependent settings.
	 */
	CUSTOMIZING("W", Messages.TransportOrderType_TextCustomizing), //$NON-NLS-1$
	
	/**
	 * Transport order type 'transport of copies'. Contains client-independent objects.
	 */
	TRANSPORT_OF_COPIES("T", Messages.TransportOrderType_TextTransportOfCopies); //$NON-NLS-1$
	
	private String internal;
	private String description;

	/**
	 * A {@link Collection} of all available {@link TransportOrderType}s.
	 */
	public static final Collection<TransportOrderType> ALL_TYPES = Arrays.asList(
			new TransportOrderType[]{WORKBENCH, CUSTOMIZING, TRANSPORT_OF_COPIES});
	
	/**
	 * Private constructor.
	 */
	private TransportOrderType(String internal, String description) {
		this.internal = internal;
		this.description = description;
	}

	/**
	 * Parses the SAP R/3-internal string to return the enumeration value.
	 * @param str the internal string
	 * @return the enumeration value matching the string
	 * @throws TransportException
	 */
	public static TransportOrderType fromInternalString(final String str) throws TransportException {
		for (final TransportOrderType type: ALL_TYPES) {
			if (str.equalsIgnoreCase(type.internal)) {
				return type;
			}
		}
		throw new TransportException(MessageFormat.format(Messages.TransportOrderType_ErrorOrderTypeKeyInvalid, str));
	}

	/**
	 * @return the internal string matching the enumeration value
	 */
	public String getInternalString() {
		return internal;
	}

	/**
	 * Checks whether the given string is a valid internal transport order type. 
	 * @param str the string to check
	 * @return <code>true</code> if the string is a valid type
	 */
	public static boolean isValidOrderType(String str) {
		for (final TransportOrderType type: ALL_TYPES) {
			if (str.equalsIgnoreCase(type.internal)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return the human-readable description of the order type.
	 */
	public String getDescription() {
		return description;
	}
	
// TODO Support all transport order types.
//	C  	Umzug von Objekten ohne Paketwechsel                        
//	O  	Umzug von Objekten mit Paketwechsel                         
//	E  	Umzug eines kompletten Pakets                               
	
//	G  	Stckliste fr CTS-Projekt                                  
//	M  	Auftrag fr Mandantentransport                              
//	P  	Stckliste fr Upgrade                                      
//	D  	Stckliste fr Patch                                        
//	F  	Stckliste                                                  

}
