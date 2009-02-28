/**
 * 
 */
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.sf.rcer.conn.connections.ConnectionManager;
import net.sf.rcer.conn.locales.LocaleRegistry;
import net.sf.rcer.test.provider.ConnectionProvider;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for {@link RepositoryPackage} and its implementation.
 * @author vwegert
 *
 */
public class RepositoryPackageTest {
	
	private RepositoryObjectCollection collection;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ConnectionProvider.setAvailableConnections(1);
		collection = ROMFactory.eINSTANCE.createRepositoryObjectCollection();
		assertNotNull(collection);
		collection.setSourceConnection(ConnectionManager.getInstance().getDestination());
		assertNotNull(collection.getSourceConnection());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		collection = null;
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testLoadPackage() throws Exception {
		RepositoryPackage pkg = ROMFactory.eINSTANCE.createRepositoryPackage();
		pkg.setName("SAPBC_DATAMODEL");
		collection.getObjects().add(pkg);
		IStatus status = pkg.load();
		
		assertTrue(status.getMessage(), status.isOK());
		assertEquals("Package Name", "SAPBC_DATAMODEL", pkg.getName());
		assertEquals("Source System", "SAP", pkg.getSourceSystem());
		assertEquals("Author", "SAP", pkg.getAuthor());

		assertTrue(status.getMessage(), status.isOK());
		assertEquals("Parent Package", "BASIS", pkg.getPackageName());
		assertEquals("Transport Layer", "SAP", pkg.getTransportLayer());
		assertTrue("Package description mising", 
				pkg.getDescription().get(LocaleRegistry.getInstance().getLocaleByISO("EN")).length() > 0);
		
		EList<RepositoryPackage> subPackages = pkg.getSubPackages();
		assertNotNull(subPackages);
		assertEquals("Number of sub-packages", 1, subPackages.size());
		assertEquals("Name of sub-package", "SAPBC_DATAMODEL_SERVICE", subPackages.get(0).getName());
		assertFalse("Sub-package should not have been loaded", subPackages.get(0).isLoaded());
	}
	
}
