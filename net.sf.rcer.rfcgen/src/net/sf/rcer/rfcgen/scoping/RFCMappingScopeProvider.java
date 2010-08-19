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
package net.sf.rcer.rfcgen.scoping;

import java.util.Vector;

import net.sf.rcer.rfcgen.mapping.Model;
import net.sf.rcer.rfcgen.mapping.Structure;
import net.sf.rcer.rfcgen.mapping.StructureMapping;
import net.sf.rcer.rfcgen.mapping.StructurePOJOMapping;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 * @author vwegert
 */
public class RFCMappingScopeProvider extends AbstractDeclarativeScopeProvider {
	
	/**
	 * Global scoping for all structure mappings on a file level.
	 * @param ctx
	 * @param ref
	 * @return the scope
	 */
	IScope scope_StructurePOJOMapping(Model ctx, EReference ref) {
		Vector<IEObjectDescription> mappings = new Vector<IEObjectDescription>();
		for (Structure structure: ctx.getStructures()) {
			StructureMapping mapping = structure.getMapping();
			if (mapping instanceof StructurePOJOMapping) {
				StructurePOJOMapping pmapping = (StructurePOJOMapping) mapping;
				mappings.add(new EObjectDescription(pmapping.getName(), pmapping, null));
			}
		}
		return new SimpleScope(mappings);
	}
	
}
