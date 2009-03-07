/**
 * Copyright (c) 2008 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 * 
 * $Id: rom.genmodel 171 2009-03-06 10:46:43Z vwegert $
 *
 * $Id$
 */
package net.sf.rcer.rom.ddic;

import net.sf.rcer.rom.RepositoryObject;

import net.sf.rcer.rom.RepositoryObjectCollection;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.Table#getFields <em>Fields</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.Table#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends RepositoryObject {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.TableField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getTable_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableField> getFields();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.RepositoryObjectCollection#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' container reference.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getTable_Collection()
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getTables
	 * @model opposite="tables" resolveProxies="false" transient="false" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectCollection getCollection();

} // Table
