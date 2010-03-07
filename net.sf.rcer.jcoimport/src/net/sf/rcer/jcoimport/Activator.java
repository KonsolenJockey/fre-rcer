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
package net.sf.rcer.jcoimport;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The class that controls the plug-in lifecycle.
 * @author vwegert
 *
 */
public class Activator extends Plugin {

	/**
	 * The ID of the plug-in.
	 */
	public static final String PLUGIN_ID = "net.sf.rcer.jcoimport"; //$NON-NLS-1$
	
	/**
	 * The de-facto singleton instance. 
	 */
	private static Activator instance;
	
	/**
	 * Default constructor.
	 */
	public Activator() {
		// nothing to do
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		instance = this;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		instance = null;
		super.stop(context);
	}
	
	/**
	 * @return the active instance
	 */
	public static Activator getDefault() {
		return instance;
	}
}
