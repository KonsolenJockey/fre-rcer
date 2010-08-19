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
package net.sf.rcer.conn.tools;

import java.math.BigInteger;
import java.text.MessageFormat;

import net.sf.rcer.conn.Messages;

import org.eclipse.core.runtime.IStatus;

import com.sap.conn.jco.JCoRecord;

/**
 * A representation of a BAPIRET2 message, a structure used by many standard
 * and customer function modules. An instance of this class represents a single line
 * of a BAPIRET2 table. For an entire list of messages, see {@link BAPIMessages}.
 * This class also implements {@link IStatus} so that the BAPI messages can be re-used 
 * as status objects in the Eclipse environment.
 *  
 * @author vwegert
 *
 */
public class BAPIMessage implements IStatus {

	private String type;
	private String messageID;
	private int messageNumber;
	private String messageText;
	private String logNumber;
	private BigInteger logMessageNumber;
	private String messageVariable1;
	private String messageVariable2;
	private String messageVariable3;
	private String messageVariable4;
	private String parameter;
	private BigInteger rowNumber;
	private String fieldName;
	private String logicalSystem;
	
	private int severity;

	/**
	 * Creates an instance based on a BAPIRET2 table line.
	 * @param record
	 */
	public BAPIMessage(JCoRecord record) {

		// ensure this is a BAPIRET2 structure
		final String structureName = record.getMetaData().getName(); 
		if (!structureName.equals("BAPIRET2")) { //$NON-NLS-1$
			throw new UnsupportedOperationException(
					MessageFormat.format(Messages.BAPIMessage_ErrorUnsupportedStructure, structureName));
		}

		// copy the data from the structure
		this.type = record.getString("TYPE"); //$NON-NLS-1$
		this.messageID = record.getString("ID"); //$NON-NLS-1$
		this.messageNumber = record.getInt("NUMBER"); //$NON-NLS-1$
		this.messageText = record.getString("MESSAGE"); //$NON-NLS-1$
		this.logNumber = record.getString("LOG_NO"); //$NON-NLS-1$
		this.logMessageNumber = record.getBigInteger("LOG_MSG_NO"); //$NON-NLS-1$
		this.messageVariable1 = record.getString("MESSAGE_V1"); //$NON-NLS-1$
		this.messageVariable2 = record.getString("MESSAGE_V2"); //$NON-NLS-1$
		this.messageVariable3 = record.getString("MESSAGE_V3"); //$NON-NLS-1$
		this.messageVariable4 = record.getString("MESSAGE_V4"); //$NON-NLS-1$
		this.parameter = record.getString("PARAMETER"); //$NON-NLS-1$
		this.rowNumber = record.getBigInteger("ROW"); //$NON-NLS-1$
		this.fieldName = record.getString("FIELD"); //$NON-NLS-1$
		this.logicalSystem = record.getString("SYSTEM"); //$NON-NLS-1$

		// determine the severity
		if (this.type.equalsIgnoreCase("E") || this.type.equalsIgnoreCase("A") || this.type.equalsIgnoreCase("X")) { //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			this.severity = ERROR;
		} else if (this.type.equalsIgnoreCase("W")) { //$NON-NLS-1$
			this.severity = WARNING;
		} else if (this.type.equalsIgnoreCase("I")) { //$NON-NLS-1$
			this.severity = INFO;
		} else if (this.type.equalsIgnoreCase("S")) { //$NON-NLS-1$
			this.severity = OK;
		} else {
			// default severity to warnings to catch all unknown messages
			this.severity = WARNING;
		}
		
	}

	/**
	 * @return the message type (S = Success, E = Error, W = Warning, I = Information, A = Abort, X = Short Dump)
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the message ID
	 */
	public String getMessageID() {
		return messageID;
	}

	/**
	 * @return the message number
	 */
	public int getMessageNumber() {
		return messageNumber;
	}

	/**
	 * @return the message text
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * @return the BAL log number
	 */
	public String getLogNumber() {
		return logNumber;
	}

	/**
	 * @return the BAL log message number
	 */
	public BigInteger getLogMessageNumber() {
		return logMessageNumber;
	}

	/**
	 * @return the message variable 1
	 */
	public String getMessageVariable1() {
		return messageVariable1;
	}

	/**
	 * @return the message variable 2
	 */
	public String getMessageVariable2() {
		return messageVariable2;
	}

	/**
	 * @return the message variable 3
	 */
	public String getMessageVariable3() {
		return messageVariable3;
	}

	/**
	 * @return the message variable 4
	 */
	public String getMessageVariable4() {
		return messageVariable4;
	}

	/**
	 * @return the parameter name
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * @return the row number
	 */
	public BigInteger getRowNumber() {
		return rowNumber;
	}

	/**
	 * @return the field name
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @return the logical system name
	 */
	public String getLogicalSystem() {
		return logicalSystem;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#getChildren()
	 */
	public IStatus[] getChildren() {
		// Instances of this class never have children.
		return null; 
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#getCode()
	 */
	public int getCode() {
		return getMessageNumber();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#getException()
	 */
	public Throwable getException() {
		// Instances of this class never carry exception information.
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#getMessage()
	 */
	public String getMessage() {
		return getMessageText();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#getPlugin()
	 */
	public String getPlugin() {
		return getMessageID();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#getSeverity()
	 */
	public int getSeverity() {
		return severity;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#isMultiStatus()
	 */
	public boolean isMultiStatus() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#isOK()
	 */
	public boolean isOK() {
		return severity == OK;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IStatus#matches(int)
	 */
	public boolean matches(int severityMask) {
		return (severity & severityMask) != 0;
	}

}
