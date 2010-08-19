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
package net.sf.rcer.rfcgen;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RFCMappingStandaloneSetup extends RFCMappingStandaloneSetupGenerated {

	/**
	 * TODO Write documentation for method. 
	 */
	public static void doSetup() {
		new RFCMappingStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

