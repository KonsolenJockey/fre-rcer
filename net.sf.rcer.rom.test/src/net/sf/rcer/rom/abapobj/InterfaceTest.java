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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.rom.ROMTest;
import net.sf.rcer.rom.abapobj.ABAPInterface;

import org.junit.Test;

/**
 * Test for {@link ABAPInterface} and its implementation.
 * @author vwegert
 *
 */
public class InterfaceTest extends ROMTest {
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testInterface() throws Exception {
		ABAPInterface iface = collection.getABAPInterface("IF_PACKAGE", true);
		assertEquals("interface name", "IF_PACKAGE", iface.getName());
		assertFalse("exit interface flag", iface.isExitInterface());
		assertTrue("attributes read", iface.getAttributes().size() > 0);
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testBAdIInterface() throws Exception {
		ABAPInterface iface = collection.getABAPInterface("IF_EX_CLIF_ACTIVATED", true);
		assertEquals("interface name", "IF_EX_CLIF_ACTIVATED", iface.getName());
		assertTrue("exit interface flag", iface.isExitInterface());
	}
	
}
