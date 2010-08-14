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
package net.sf.rcer.rfcgen.ui.wizard;

import java.util.List;

import com.google.common.collect.Lists;

/**
 * An adapted {@link DefaultProjectCreator} to create the mapping project
 * @author vwegert
 *
 */
public class ExtendedRFCMappingProjectCreator extends RFCMappingProjectCreator {

	private static final String JCO_PROJECT_NAME = "com.sap.conn.jco";
	
    @Override
	protected List<String> getRequiredBundles() {
		List<String> result = Lists.newArrayList(super.getRequiredBundles());
		result.add(JCO_PROJECT_NAME);
		return result;
	}
	
}
