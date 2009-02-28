/**
 * Copyright (c) 2008 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 * 
 * $Id$
 *
 * $Id$
 */
package net.sf.rcer.rom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRepository Object Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.IRepositoryObjectContainer#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ROMPackage#getIRepositoryObjectContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IRepositoryObjectContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.RepositoryObject}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.RepositoryObject#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getIRepositoryObjectContainer_Objects()
	 * @see net.sf.rcer.rom.RepositoryObject#getContainer
	 * @model opposite="container" containment="true" keys="objectType name" ordered="false"
	 * @generated
	 */
	EList<RepositoryObject> getObjects();

} // IRepositoryObjectContainer
