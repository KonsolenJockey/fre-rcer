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
package net.sf.rcer.rfcgen;

import net.sf.rcer.rfcgen.mapping.Model;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

/**
 * TODO Write documentation for type RFCMappingQualifiedNameProvider.
 * @author a39288
 *
 */
public class RFCMappingQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider#qualifiedName(java.lang.Object)
	 */
	protected QualifiedName qualifiedName(Model m) {
		QualifiedName name = QualifiedName.create(m.eResource().getURI().toString());
		System.out.println(name);
		return name;
	}
}
