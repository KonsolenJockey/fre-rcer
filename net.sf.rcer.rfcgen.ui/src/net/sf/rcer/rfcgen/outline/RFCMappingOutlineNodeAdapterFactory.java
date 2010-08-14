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
package net.sf.rcer.rfcgen.outline;

import org.eclipse.xtext.ui.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;

/**
 * The adapter factory to add adapters to outline nodes.
 * @author vwegert
 *
 */
public class RFCMappingOutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	private static final Class[] types = { 
		// provide list of classes to adapt to, e.g.:
		// Entity.class
		// Service.class
	};

	@Override
	public Class[] getAdapterList() {
		return types;
	}

}

