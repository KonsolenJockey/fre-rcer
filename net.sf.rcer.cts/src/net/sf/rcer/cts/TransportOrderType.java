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
	WORKBENCH,
	
	/**
	 * Transport order type 'customizing'. Contains client-dependent settings.
	 */
	CUSTOMIZING,
	
	/**
	 * Transport order type 'transport of copies'. Contains client-independent objects.
	 */
	TRANSPORT_OF_COPIES;
	
	/**
	 * A {@link Collection} of all avaliable {@link TransportOrderType}s.
	 */
	public static final Collection<TransportOrderType> ALL_TYPES = Arrays.asList(
			new TransportOrderType[]{WORKBENCH, CUSTOMIZING, TRANSPORT_OF_COPIES});
	
	/**
	 * Parses the SAP R/3-internal string to return the enumeration value.
	 * @param str the internal string
	 * @return the enumeration value matching the string
	 * @throws TransportException
	 */
	public static TransportOrderType fromInternalString(final String str) throws TransportException {
		if (str.equalsIgnoreCase("K")) return WORKBENCH;  //$NON-NLS-1$
		if (str.equalsIgnoreCase("W")) return CUSTOMIZING; //$NON-NLS-1$
		if (str.equalsIgnoreCase("T")) return TRANSPORT_OF_COPIES; //$NON-NLS-1$
		throw new TransportException(MessageFormat.format(Messages.TransportOrderType_ErrorOrderTypeKeyInvalid,
				str));
	}

	/**
	 * @return the internal string matching the enumeration value
	 */
	public String toInternalString() {
		switch(this) {
		case WORKBENCH: return "K"; //$NON-NLS-1$
		case CUSTOMIZING: return "W"; //$NON-NLS-1$
		case TRANSPORT_OF_COPIES: return "T"; //$NON-NLS-1$
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Checks whether the given string is a valid internal transport order type. 
	 * @param type the string to check
	 * @return <code>true</code> if the string is a valid type
	 */
	public static boolean isValidOrderType(String type) {
		return type.equalsIgnoreCase("K") || type.equalsIgnoreCase("W") || type.equalsIgnoreCase("T"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	/**
	 * @return the human-readable description of the order type.
	 */
	public String getDescription() {
		switch(this) {
		case WORKBENCH: return Messages.TransportOrderType_TextWorkbench;
		case CUSTOMIZING: return Messages.TransportOrderType_TextCustomizing;
		case TRANSPORT_OF_COPIES: return Messages.TransportOrderType_TextTransportOfCopies;
		}
		throw new UnsupportedOperationException();
	}
	
// TODO Support all transport order types.
//	C  	Umzug von Objekten ohne Paketwechsel                        
//	O  	Umzug von Objekten mit Paketwechsel                         
//	E  	Umzug eines kompletten Pakets                               
	
// TODO Support transport tasks.	
//	S  	Entwicklung/Korrektur                                       
//	R  	Reparatur                                                   
//	X  	Unklassifizierte Aufgabe                                    
//	Q  	Customizing-Aufgabe   
	
//	G  	Stckliste fr CTS-Projekt                                  
//	M  	Auftrag fr Mandantentransport                              
//	P  	Stckliste fr Upgrade                                      
//	D  	Stckliste fr Patch                                        
//	F  	Stckliste                                                  

}
