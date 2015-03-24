/*
 * generated by Xtext
 */
package net.sf.rcer.rfcgen.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.sf.rcer.rfcgen.ui.internal.RFCMappingActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RFCMappingExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RFCMappingActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RFCMappingActivator.getInstance().getInjector(RFCMappingActivator.NET_SF_RCER_RFCGEN_RFCMAPPING);
	}
	
}
