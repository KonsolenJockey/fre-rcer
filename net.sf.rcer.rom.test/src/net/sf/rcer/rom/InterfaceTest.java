/**
 * 
 */
package net.sf.rcer.rom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
		ABAPInterface iface = collection.getInterface("IF_PACKAGE", true);
		assertEquals("interface name", "IF_PACKAGE", iface.getName());
		assertFalse("exit interface flag", iface.isExitInterface());
		assertTrue("attributes read", iface.getAttributes().size() > 0);
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void testBAdIInterface() throws Exception {
		ABAPInterface iface = collection.getInterface("IF_EX_CLIF_ACTIVATED", true);
		assertEquals("interface name", "IF_EX_CLIF_ACTIVATED", iface.getName());
		assertTrue("exit interface flag", iface.isExitInterface());
	}
	
}
