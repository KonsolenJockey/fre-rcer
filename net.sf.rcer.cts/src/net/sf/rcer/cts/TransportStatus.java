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
 * The status of a transport object (modifiable, released, ...).
 * This is a representation of the values of E070-TRSTATUS.
 * @author vwegert
 *
 */
public enum TransportStatus {

	/**
	 * The transport object can be modified.
	 */
	MODIFIABLE,

	/**
	 * The transport object is protected from modification.
	 */
	PROTECTED,

	/**
	 * The transport object is currently being released.
	 */
	RELEASE_STARTED,

	/**
	 * The transport object is released.
	 */
	RELEASED,

	/**
	 * The transport object is released; the import protection for modified objects is still in place.
	 */
	RELEASED_IMPORT_PROTECTED;

	/**
	 * Parses the SAP R/3-internal string to return the enumeration value . 
	 * @param str the internal string
	 * @return the enumeration value matching the string
	 * @throws TransportException 
	 */
	public static TransportStatus fromInternalString(final String str) throws TransportException {
		if (str.equalsIgnoreCase("D")) return MODIFIABLE; //$NON-NLS-1$
		if (str.equalsIgnoreCase("L")) return PROTECTED; //$NON-NLS-1$
		if (str.equalsIgnoreCase("O")) return RELEASE_STARTED; //$NON-NLS-1$
		if (str.equalsIgnoreCase("R")) return RELEASED; //$NON-NLS-1$
		if (str.equalsIgnoreCase("N")) return RELEASED_IMPORT_PROTECTED; //$NON-NLS-1$
		throw new TransportException(MessageFormat.format(Messages.TransportStatus_ErrorTransportStatusInvalid,
				str));
	}

	/**
	 * @return the internal string matching the enumeration value
	 */
	public String toInternalString() {
		switch (this) {
		case MODIFIABLE: return "D"; //$NON-NLS-1$
		case PROTECTED: return "L"; //$NON-NLS-1$
		case RELEASE_STARTED: return "O"; //$NON-NLS-1$
		case RELEASED: return "R"; //$NON-NLS-1$
		case RELEASED_IMPORT_PROTECTED: return "N"; //$NON-NLS-1$
		}
		throw new UnsupportedOperationException();

	}

	/**
	 * @return the human-readable description of the status.
	 */
	public String getDescription() {
		switch (this) {
		case MODIFIABLE: return Messages.TransportStatus_StatusTextModifiable;
		case PROTECTED: return Messages.TransportStatus_StatusTextProtected;
		case RELEASE_STARTED: return Messages.TransportStatus_StatusReleaseTextStarted;
		case RELEASED: return Messages.TransportStatus_StatusTextReleased;
		case RELEASED_IMPORT_PROTECTED: return Messages.TransportStatus_StatusTextReleasedImportProtecteion;
		}
		throw new UnsupportedOperationException();
	}
}
