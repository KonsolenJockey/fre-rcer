/**
 * Copyright (c) 2009, 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id: RFCMappingFormatter.java 235 2009-12-31 17:51:07Z vwegert $
 */
package net.sf.rcer.rfcgen.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.wizard.IProjectCreator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class RFCMappingUiModule extends net.sf.rcer.rfcgen.ui.AbstractRFCMappingUiModule {

	/**
	 * Default constructor
	 * @param plugin
	 */
	public RFCMappingUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.rcer.rfcgen.AbstractRFCMappingUiModule#bindIProjectCreator()
	 */
	@Override
	public Class<? extends IProjectCreator> bindIProjectCreator() {
		return net.sf.rcer.rfcgen.ui.wizard.ExtendedRFCMappingProjectCreator.class;
	}
}
