
package net.sf.rcer.rfcgen.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import net.sf.rcer.rfcgen.RfcgenEditorPlugin;

public class NewRfcgenFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return RfcgenEditorPlugin.getDefault().getUtilities();
	}
}
