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
 * The type of a transport task (correction, repair, customizing, ...).
 * This is a representation of the values of E070-TRFUNCTION for transport tasks.
 * @author vwegert
 *
 */
public enum TransportTaskType {
	
	/**
	 * Transport task type 'unclassified'. Used within workbench orders.
	 */
	UNCLASSIFIED("X", Messages.TransportTaskType_Unclassified), //$NON-NLS-1$
	
	/**
	 * Transport task type 'development / correction'. Used within workbench orders.
	 */
	CORRECTION("S", Messages.TransportTaskType_Correction), //$NON-NLS-1$
	
	/**
	 * Transport task type 'repair'. Used within workbench orders.
	 */
	REPAIR("R", Messages.TransportTaskType_Repair), //$NON-NLS-1$
	
	/**
	 * Transport task type 'customizing'. Used within customizing orders
	 */
	CUSTOMIZING("Q", Messages.TransportTaskType_Customizing); //$NON-NLS-1$
	
	private String internal;
	private String description;

	/**
	 * A {@link Collection} of all available {@link TransportTaskType}s.
	 */
	public static final Collection<TransportTaskType> ALL_TYPES = Arrays.asList(
			new TransportTaskType[]{UNCLASSIFIED, CORRECTION, REPAIR, CUSTOMIZING});
	
	/**
	 * Private constructor.
	 */
	private TransportTaskType(String internal, String description) {
		this.internal = internal;
		this.description = description;
	}
	
	/**
	 * Parses the SAP R/3-internal string to return the enumeration value.
	 * @param str the internal string
	 * @return the enumeration value matching the string
	 * @throws TransportException
	 */
	public static TransportTaskType fromInternalString(final String str) throws TransportException {
		for (final TransportTaskType type: ALL_TYPES) {
			if (str.equalsIgnoreCase(type.internal)) {
				return type;
			}
		}
		throw new TransportException(MessageFormat.format(Messages.TransportTaskType_ErrorNoValidTaskType, str));
	}

	/**
	 * @return the internal string matching the enumeration value
	 */
	public String getInternalString() {
		return internal;
	}

	/**
	 * @return the human-readable description of the order type.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Checks whether the given string is a valid internal transport task type. 
	 * @param str the string to check
	 * @return <code>true</code> if the string is a valid type
	 */
	public static boolean isValidTaskType(String str) {
		for (final TransportTaskType type: ALL_TYPES) {
			if (str.equalsIgnoreCase(type.internal)) {
				return true;
			}
		}
		return false;
	}

}
