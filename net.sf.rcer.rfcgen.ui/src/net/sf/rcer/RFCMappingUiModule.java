/**
 * Copyright (c) 2009 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer;

import org.eclipse.xtext.ui.core.wizard.IProjectCreator;

/**
 * Use this class to register components to be used within the IDE.
 * @author vwegert
 */
public class RFCMappingUiModule extends net.sf.rcer.AbstractRFCMappingUiModule {

	/* (non-Javadoc)
	 * @see net.sf.rcer.AbstractRFCMappingUiModule#bindIProjectCreator()
	 */
	@Override
	public Class<? extends IProjectCreator> bindIProjectCreator() {
		return net.sf.rcer.ui.wizard.ExtendedRFCMappingProjectCreator.class;
	}
	
}
