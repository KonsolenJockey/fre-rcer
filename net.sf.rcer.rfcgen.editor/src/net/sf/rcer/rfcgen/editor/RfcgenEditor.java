/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.rfcgen.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import net.sf.rcer.rfcgen.RfcgenEditorPlugin;

public class RfcgenEditor extends AbstractXtextEditor {

	/* (non-Javadoc)
	 * @see org.openarchitectureware.xtext.editor.AbstractXtextEditor#getPlugin()
	 */
	@Override
	public AbstractXtextEditorPlugin getPlugin() {
		return RfcgenEditorPlugin.getDefault();
	}
}
