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

import org.eclipse.core.databinding.conversion.Converter;

/**
 * A {@link Converter} that implements the {@link String} to {@link ConnectionType} conversion.
 * @author vwegert
 */
public class ConnectionTypeFromStringConverter extends Converter {

	/**
	 * Default constructor.
	 */
	public ConnectionTypeFromStringConverter() {
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