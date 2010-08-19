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
package net.sf.rcer.rom.abapobj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.rom.ROMTest;
import net.sf.rcer.rom.abapobj.ABAPClass;

import org.junit.Test;

/**
 * Test for {@link ABAPClass} and its implementation.
 * @author vwegert
 *
 */
public class ClassTest extends ROMTest {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testClass() throws Exception {
		ABAPClass clazz = collection.getABAPClass("CL_GUI_CFW", true);
		assertEquals("class name", "CL_GUI_CFW", clazz.getName());
		assertTrue("attributes read", clazz.getAttributes().size() > 0);
		assertTrue("methods read", clazz.getMethods().size() > 0);
	}
	
}
