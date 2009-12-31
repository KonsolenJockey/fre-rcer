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

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.ui.core.util.EclipseResourceUtil;
import org.eclipse.xtext.ui.core.wizard.DefaultProjectCreator;

/**
 * An adapted {@link DefaultProjectCreator} to create the mapping project
 * @author vwegert
 *
 */
public class ExtendedRFCMappingProjectCreator extends RFCMappingProjectCreator {

	// TODO see https://bugs.eclipse.org/bugs/show_bug.cgi?id=297022
	
	private static final String DSL_GENERATOR_PROJECT_NAME = "net.sf.rcer.rfcgen.generator";

	private static final String SRC_ROOT = "src";
	private static final String SRC_GEN_ROOT = "src-gen";
	private final List<String> SRC_FOLDER_LIST = Collections.unmodifiableList(Arrays.asList(SRC_ROOT, SRC_GEN_ROOT));

	/* (non-Javadoc)
	 * @see net.sf.rcer.rfcgen.ui.wizard.RFCMappingProjectCreator#createProject(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IProject createProject(final IProgressMonitor monitor) {
		final IProject project = EclipseResourceUtil.createProject(
				getProjectInfo().getProjectName(), SRC_FOLDER_LIST, Collections
						.<IProject> emptyList(),
				new LinkedHashSet<String>(Arrays.asList(
						"com.ibm.icu",
						"com.sap.conn.jco",
						"org.eclipse.xtext.log4j;bundle-version=\"1.2.15\"",
						"org.eclipse.xtext", 
						"org.eclipse.xtext.generator",
						"org.eclipse.xtend",
						"org.eclipse.xtend.typesystem.emf",
						"org.eclipse.xpand", 
						"org.apache.commons.logging",
						"de.itemis.xtext.antlr;resolution:=optional",
						"org.eclipse.emf.codegen.ecore;resolution:=optional",
						"org.eclipse.xtend.util.stdlib",
						DSL_GENERATOR_PROJECT_NAME)), null, null, null,
				monitor, null,
				new String[] {"org.eclipse.jdt.core.javanature", "org.eclipse.pde.PluginNature"});

		return project;
	}

}
