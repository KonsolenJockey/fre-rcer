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
import net.sf.rcer.rom.ddic.DDICFactory;
import net.sf.rcer.rom.ddic.Domain;
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
public class DomainTest {
	
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
	public void testLoadDomain() throws Exception {
		Domain dom = DDICFactory.eINSTANCE.createDomain();
		dom.setName("CHAR1_X");
		collection.getObjects().add(dom);
		IStatus status = dom.load();
		
		assertTrue(status.getMessage(), status.isOK());
	}
	
}
