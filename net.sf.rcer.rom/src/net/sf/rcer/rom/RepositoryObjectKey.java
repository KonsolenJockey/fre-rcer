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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Object Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectKey#getProgramID <em>Program ID</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectKey#getObjectTypeID <em>Object Type ID</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectKey#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectKey()
 * @model
 * @generated
 */
public interface RepositoryObjectKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program ID</em>' attribute.
	 * @see #setProgramID(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectKey_ProgramID()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getProgramID();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObjectKey#getProgramID <em>Program ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program ID</em>' attribute.
	 * @see #getProgramID()
	 * @generated
	 */
	void setProgramID(String value);

	/**
	 * Returns the value of the '<em><b>Object Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type ID</em>' attribute.
	 * @see #setObjectTypeID(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectKey_ObjectTypeID()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getObjectTypeID();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObjectKey#getObjectTypeID <em>Object Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type ID</em>' attribute.
	 * @see #getObjectTypeID()
	 * @generated
	 */
	void setObjectTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectKey_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObjectKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RepositoryObjectKey
