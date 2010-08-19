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
package net.sf.rcer.conn.connections;

import java.text.MessageFormat;

import net.sf.rcer.conn.Messages;

import org.eclipse.core.databinding.conversion.Converter;

/**
 * The connection type (direct or load balanced).
 * @author vwegert
 *
 */
public enum ConnectionType {

	/**
	 * Direct connection to an application server with application server address or name and system number.
	 */
	DIRECT, 

	/**
	 * Load-balanced connection using a message server (name or address and port) and the logon group.
	 */
	LOAD_BALANCED;

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		switch (this) {
		case DIRECT:
			return Messages.ConnectionType_Direct;
		case LOAD_BALANCED:
			return Messages.ConnectionType_LoadBalanced;
		default:
			return super.toString();
		}
	}

	/**
	 * @return the connection types available
	 */
	public static ConnectionType[] getValues() {
		return new ConnectionType[] { DIRECT, LOAD_BALANCED };
	}

	/**
	 * @return the strings describing the connection types available
	 */
	public static String[] getStrings() {
		return new String[] { DIRECT.toString(), LOAD_BALANCED.toString() };
	}

	/**
	 * A {@link Converter} that implements the {@link String} to {@link ConnectionType} conversion.
	 * @author vwegert
	 */
	public static class FromStringConverter extends Converter {

		/**
		 * Default constructor.
		 */
		public FromStringConverter() {
			super(String.class, ConnectionType.class);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
		 */
		public Object convert(Object fromObject) {
			if ((fromObject == null) || ("".equals(fromObject))) { //$NON-NLS-1$
				return null;
			} else if (ConnectionType.DIRECT.toString().equals(fromObject)) {
				return ConnectionType.DIRECT;
			} else if (ConnectionType.LOAD_BALANCED.toString().equals(fromObject)) {
				return ConnectionType.LOAD_BALANCED;
			} else {
				throw new IllegalArgumentException(MessageFormat.format(Messages.ConnectionType_UnsupportedValue, fromObject));
			}
		}
	}

	/**
	 * A {@link Converter} that implements the {@link ConnectionType} to {@link String} conversion.
	 * @author vwegert
	 *
	 */
	public static class ToStringConverter extends Converter  {

		/**
		 * Default constructor.
		 */
		public ToStringConverter() {
			super(ConnectionType.class, String.class);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
		 */
		public Object convert(Object fromObject) {
			if (fromObject == null) {
				return ""; //$NON-NLS-1$
			} else if (fromObject instanceof ConnectionType) {
				return fromObject.toString();
			} else {
				throw new IllegalArgumentException(MessageFormat.format(Messages.ConnectionType_UnsupportedValue, fromObject));
			}
		}

	}
}
