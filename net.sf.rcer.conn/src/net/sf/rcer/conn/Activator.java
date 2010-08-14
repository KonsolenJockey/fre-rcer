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
package net.sf.rcer.conn;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

import com.sap.conn.jco.JCo;
import com.sap.conn.jco.JCoTraceListener;

/**
 * The activator is the class that controls the plug-in lifecycle.
 * @author vwegert
 *
 */
public class Activator extends Plugin {

	/**
	 * A listener to add the JCo trace events to the Eclipse / OSGi log.
	 * @author vwegert
	 *
	 */
	private class TraceListener implements JCoTraceListener {

		private ILog log;

		/**
		 * Default constructor.
		 * @param log
		 */
		public TraceListener(ILog log) {
			this.log = log;
		}

		/* (non-Javadoc)
		 * @see com.sap.conn.jco.JCoTraceListener#trace(int, java.lang.String)
		 */
		public void trace(int traceLevel, String message) {
			// The incredible JCo design does not allow us to distinguish between errors and warnings. No comment. 
			if ((traceLevel & ERROR_WARNING) > 0) {
				log.log(new Status(IStatus.WARNING, PLUGIN_ID, message));
			} else {
				log.log(new Status(IStatus.INFO, PLUGIN_ID, message));
			}			
		}
		
	}
	
	/**
	 * The ID of the plug-in.
	 */
	public static final String PLUGIN_ID = "net.sf.rcer.conn"; //$NON-NLS-1$
	
	/**
	 * The de-facto singleton instance. 
	 */
	private static Activator instance;
	
	/**
	 * A listener to 
	 */
	private TraceListener listener;
	
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
		listener = new TraceListener(getLog());
		try {
			JCo.addTraceListener(listener);
		} catch (ExceptionInInitializerError e) {
			// this happens if the JCo native library could not be loaded
			getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					Messages.Activator_TraceListenerError, e));
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		JCo.removeTraceListener(listener);
		listener = null;
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
