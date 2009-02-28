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
package net.sf.rcer.example.rfcgen.pojo.rr;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * The perspective of the application.
 * @author vwegert
 *
 */
public class Perspective implements IPerspectiveFactory {

	/**
	 * The ID of the perspective
	 */
	public static final String ID = "net.sf.rcer.example.rfcgen.pojo.rr.perspective";
	
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		layout.setFixed(true);
		layout.addStandaloneView(View.ID,  false, IPageLayout.LEFT, 1.0f, editorArea);
	}

}
