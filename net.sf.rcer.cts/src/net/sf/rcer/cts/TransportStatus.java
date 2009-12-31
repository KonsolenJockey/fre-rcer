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
 * The status of a transport object (modifiable, released, ...).
 * This is a representation of the values of E070-TRSTATUS.
 * @author vwegert
 *
 */
public enum TransportStatus {

	/**
	 * The transport object can be modified.
	 */
	MODIFIABLE("D", Messages.TransportStatus_StatusTextModifiable), //$NON-NLS-1$

	/**
	 * The transport object is protected from modification.
	 */
	PROTECTED("L", Messages.TransportStatus_StatusTextProtected), //$NON-NLS-1$

	/**
	 * The transport object is currently being released.
	 */
	RELEASE_STARTED("O", Messages.TransportStatus_StatusReleaseTextStarted), //$NON-NLS-1$

	/**
	 * The transport object is released.
	 */
	RELEASED("R", Messages.TransportStatus_StatusTextReleased), //$NON-NLS-1$

	/**
	 * The transport object is released; the import protection for modified objects is still in place.
	 */
	RELEASED_IMPORT_PROTECTED("N", Messages.TransportStatus_StatusTextReleasedImportProtection); //$NON-NLS-1$

	private String internal;
	private String description;

	/**
	 * A {@link Collection} of all available {@link TransportStatus}es.
	 */
	public static final Collection<TransportStatus> ALL_STATUSES = Arrays.asList(
			new TransportStatus[]{MODIFIABLE, PROTECTED, RELEASE_STARTED, RELEASED, RELEASED_IMPORT_PROTECTED});

	/**
	 * Private constructor.
	 */
	private TransportStatus(String internal, String description) {
		this.internal = internal;
		this.description = description;
	}
	
	/**
	 * Parses the SAP R/3-internal string to return the enumeration value . 
	 * @param str the internal string
	 * @return the enumeration value matching the string
	 * @throws TransportException 
	 */
	public static TransportStatus fromInternalString(final String str) throws TransportException {
		for (final TransportStatus status: ALL_STATUSES) {
			if (str.equalsIgnoreCase(status.internal)) {
				return status;
			}
		}
		throw new TransportException(MessageFormat.format(Messages.TransportStatus_ErrorTransportStatusInvalid,	str));
	}

	/**
	 * @return the internal string matching the enumeration value
	 */
	public String getInternalString() {
		return internal;

	}

	/**
	 * @return the human-readable description of the status.
	 */
	public String getDescription() {
		return description;
	}
}
