package net.sf.rcer.rfcgen;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import net.sf.rcer.rfcgen.parser.XtextParser;

public class RfcgenUtilities extends AbstractLanguageUtilities {

	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "rfc";
	}

	public EPackage getEPackage() {
		return net.sf.rcer.rfcgen.MetaModelRegistration.getEPackage();
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("table");
		r.add("function");
		r.add("comment");
		r.add("structure");
		r.add("response");
		r.add("import");
		r.add("class");
		r.add("inactive");
		r.add("change");
		r.add("export");
		r.add("field");
		r.add("request");
		r.add("package");
		r.add("module");
	}
	public List<String> allKeywords() {
		return r;
	}

	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new GeneratedPartitionScanner();
	}

	@Override
	public AbstractXtextEditorPlugin getXtextEditorPlugin() {
		return RfcgenEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "net::sf::rcer::rfcgen";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
}
