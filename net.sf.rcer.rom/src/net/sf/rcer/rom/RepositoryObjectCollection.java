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

import com.sap.conn.jco.JCoDestination;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Object Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getSourceConnection <em>Source Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection()
 * @model
 * @generated
 */
public interface RepositoryObjectCollection extends IRepositoryObjectContainer {

	/**
	 * Returns the value of the '<em><b>Source Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Connection</em>' attribute.
	 * @see #setSourceConnection(JCoDestination)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_SourceConnection()
	 * @model unique="false" unsettable="true" dataType="net.sf.rcer.rom.JCoDestination" transient="true" ordered="false"
	 * @generated
	 */
	JCoDestination getSourceConnection();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObjectCollection#getSourceConnection <em>Source Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Connection</em>' attribute.
	 * @see #getSourceConnection()
	 * @generated
	 */
	void setSourceConnection(JCoDestination value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" nameUnique="false" nameRequired="true" nameOrdered="false"
	 * @generated
	 */
	RepositoryPackage getPackage(String name);
} // RepositoryObjectCollection
