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

/**
 * A {@link Converter} that implements the {@link Locale} to {@link String} conversion.
 * @author vwegert
 *
 */
public class LocaleToStringConverter extends Converter  {

	private boolean includeDescription;

	/**
	 * Default constructor.
	 * @param includeDescription whether to include the description in the output text. 
	 */
	public LocaleToStringConverter(boolean includeDescription) {
		super(Locale.class, String.class);
		this.includeDescription = includeDescription;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.conversion.IConverter#convert(java.lang.Object)
	 */
	public Object convert(Object fromObject) {
		if (fromObject == null) {
			return ""; //$NON-NLS-1$
		} else if (fromObject instanceof Locale) {
			if (includeDescription) {
				final Locale locale = (Locale) fromObject; 
				return MessageFormat.format(Messages.Locale_StringFormat, locale.getISOCode(), locale.getDescription());
			}
			return ((Locale) fromObject).getISOCode();
		}
		throw new IllegalArgumentException(MessageFormat.format(Messages.Locale_UnsupportedClass, fromObject.getClass().getName()));
	}

}