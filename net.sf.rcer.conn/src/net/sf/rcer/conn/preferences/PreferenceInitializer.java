/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.preferences;

import net.sf.rcer.conn.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

/**
 * Class to initialize the preferences.
 * @author vwegert
 *
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer implements IPreferenceConstants {

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		Activator.getDefault().getPluginPreferences().setDefault(CONNECTION_NUMBER, 0);
	}

}
