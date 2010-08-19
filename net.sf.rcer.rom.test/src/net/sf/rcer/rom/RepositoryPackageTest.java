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
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.locales.LocaleRegistry;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

/**
 * Test for {@link RepositoryPackage} and its implementation.
 * @author vwegert
 *
 */
public class RepositoryPackageTest extends ROMTest {
	
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testLoadPackage() throws Exception {
		RepositoryPackage pkg = collection.getPackage("SAPBC_DATAMODEL", true);
		
		assertEquals("Package Name", "SAPBC_DATAMODEL", pkg.getName());
		assertEquals("Source System", "SAP", pkg.getSourceSystem());
		assertEquals("Author", "SAP", pkg.getAuthor());

		assertEquals("Parent Package", "BASIS", pkg.getPackageName());
		assertEquals("Transport Layer", "SAP", pkg.getTransportLayer());
		assertTrue("Package description mising", 
				pkg.getDescription().get(LocaleRegistry.getInstance().getLocaleByISO("EN")).length() > 0);
		
		EList<String> subPackages = pkg.getSubPackageNames();
		assertNotNull(subPackages);
		assertEquals("Number of sub-packages", 1, subPackages.size());
		assertEquals("Name of sub-package", "SAPBC_DATAMODEL_SERVICE", subPackages.get(0));
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testLoadPackageContents() throws Exception {
		RepositoryPackage pkg = collection.getPackage("SAPBC_DATAMODEL", true);
		pkg.loadContents(false);
	}

}
