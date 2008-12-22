package net.sf.rcer.rfcgen.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import net.sf.rcer.rfcgen.RfcgenEditorPlugin;

public class NewRfcgenProjectWizard extends AbstractNewProjectWizard {

	public NewRfcgenProjectWizard() {
		super();
		setLangName("rfcgen");
		setGeneratorProjectName("net.sf.rcer.rfcgen.generator");
		setDslProjectName("net.sf.rcer.rfcgen");
		setFileExtension("rfc");
		setPackageName("net/sf/rcer/rfcgen/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return RfcgenEditorPlugin.getDefault().getUtilities();
	}
}

