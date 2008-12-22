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
package net.sf.rcer.rfcgen;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class RfcgenEditorPlugin extends AbstractXtextEditorPlugin {
	
	private static RfcgenEditorPlugin plugin;
	private RfcgenUtilities utilities = new RfcgenUtilities();
	
	/**
	 * Default constructor.
	 */
	public RfcgenEditorPlugin() {
		plugin = this;
	}
	
	/**
	 * @return the singleton instance
	 */
	public static RfcgenEditorPlugin getDefault() {
		return plugin;
	}

	/* (non-Javadoc)
	 * @see org.openarchitectureware.xtext.AbstractXtextEditorPlugin#getUtilities()
	 */
	@Override
	public LanguageUtilities getUtilities() {
		return utilities;
	}

	/* (non-Javadoc)
	 * @see org.openarchitectureware.xtext.AbstractXtextEditorPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}
}
