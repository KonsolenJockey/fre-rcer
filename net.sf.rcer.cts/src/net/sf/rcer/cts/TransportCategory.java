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

/**
 * The category of a transport object (customizing or system). 
 * This is a representation of the values of E070-KORRDEV.
 * @author vwegert
 *
 */
public enum TransportCategory {
	
	/**
	 * Customizing transport.
	 */
	CUSTOMIZING,
	
	/**
	 * System transport.
	 */
	SYSTEM;

	/**
	 * Parses the SAP R/3-internal string to return the enumeration value.
	 * @param str the internal string
	 * @return the enumeration value matching the string
	 * @throws TransportException 
	 */
	public static TransportCategory fromInternalString(final String str) throws TransportException {
		if (str.equalsIgnoreCase("CUST")) return CUSTOMIZING; //$NON-NLS-1$
		if (str.equalsIgnoreCase("SYST")) return SYSTEM; //$NON-NLS-1$
		throw new TransportException(MessageFormat.format(Messages.TransportCategory_ErrorCategoryKeyInvalid,
				str));
	}
	
	/**
	 * @return the internal string matching the enumeration value
	 */
	public String toInternalString() {
		switch(this) {
		case CUSTOMIZING: return "CUST"; //$NON-NLS-1$
		case SYSTEM: return "SYST"; //$NON-NLS-1$
		}
		throw new UnsupportedOperationException();
	}
	
}
