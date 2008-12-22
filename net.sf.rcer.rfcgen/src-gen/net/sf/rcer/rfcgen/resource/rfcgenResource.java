package net.sf.rcer.rfcgen.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import net.sf.rcer.rfcgen.parser.XtextParser;

public class rfcgenResource extends AbstractXtextResource {
	public rfcgenResource(URI uri) {
		super(uri);
		setFormattingExtension("net::sf::rcer::rfcgen::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

