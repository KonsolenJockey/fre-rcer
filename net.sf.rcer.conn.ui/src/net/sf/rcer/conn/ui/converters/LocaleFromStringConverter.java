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
import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.conn.locales.LocaleNotFoundException;
import net.sf.rcer.conn.locales.LocaleRegistry;

/**
 * A {@link Converter} that implements the {@link String} to {@link Locale} conversion.
 * @author vwegert
 */
public class LocaleFromStringConverter extends Converter {

	/**
	 * Default constructor.
	 */
	public LocaleFromStringConverter() {
		super(String.class, Locale.class);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
	 */
	public Object convert(Object fromObject) {
		if (fromObject == null) {
			return null;
		} else if (fromObject instanceof String) {
			String isoCode = (String) fromObject;
			if (isoCode.equals("")) { //$NON-NLS-1$
				return null;
			}
			try {
				return LocaleRegistry.getInstance().getLocaleByISO(isoCode);
			} catch (LocaleNotFoundException e1) {
				// maybe this was a string that begins with the locale code (see LocaleToStringConverter)
				try {
					return LocaleRegistry.getInstance().getLocaleByISO(isoCode.substring(0, isoCode.indexOf(' ')));
				} catch (LocaleNotFoundException e) {
					throw new IllegalArgumentException(e);
				}
			}
		}
		throw new IllegalArgumentException(MessageFormat.format(Messages.Locale_UnsupportedStringValue, fromObject));
	}
}