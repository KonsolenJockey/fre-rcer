/*******************************************************************************
 * Copyright (c) 2010 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Volker Wegert <rcer@volker-wegert.de> - initial API and implementation
 *******************************************************************************/
package net.sf.rcer.rfcgen.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class RFCMappingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return net.sf.rcer.rfcgen.ui.internal.RFCMappingActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return net.sf.rcer.rfcgen.ui.internal.RFCMappingActivator.getInstance().getInjector("net.sf.rcer.rfcgen.RFCMapping");
	}
	
}
