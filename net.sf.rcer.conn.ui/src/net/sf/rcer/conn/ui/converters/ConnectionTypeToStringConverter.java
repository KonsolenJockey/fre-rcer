/**
 * Copyright (c) 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.ui.converters;

import java.text.MessageFormat;

import net.sf.rcer.conn.Messages;
import net.sf.rcer.conn.connections.ConnectionType;

/**
 * A {@link Converter} that implements the {@link ConnectionType} to {@link String} conversion.
 * @author vwegert
 *
 */
public class ConnectionTypeToStringConverter extends Converter  {

	/**
	 * Default constructor.
	 */
	public ConnectionTypeToStringConverter() {
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