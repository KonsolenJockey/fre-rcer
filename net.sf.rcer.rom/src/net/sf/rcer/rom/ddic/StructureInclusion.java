/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
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
package net.sf.rcer.rom.ddic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Inclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.StructureInclusion#getIncludedStructureName <em>Included Structure Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.StructureInclusion#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.StructureInclusion#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getStructureInclusion()
 * @model
 * @generated
 */
public interface StructureInclusion extends StructureField, TableField {
	/**
	 * Returns the value of the '<em><b>Included Structure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Structure Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Structure Name</em>' attribute.
	 * @see #setIncludedStructureName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getStructureInclusion_IncludedStructureName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIncludedStructureName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.StructureInclusion#getIncludedStructureName <em>Included Structure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included Structure Name</em>' attribute.
	 * @see #getIncludedStructureName()
	 * @generated
	 */
	void setIncludedStructureName(String value);

	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getStructureInclusion_GroupName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.StructureInclusion#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix</em>' attribute.
	 * @see #setSuffix(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getStructureInclusion_Suffix()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSuffix();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.StructureInclusion#getSuffix <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suffix</em>' attribute.
	 * @see #getSuffix()
	 * @generated
	 */
	void setSuffix(String value);

} // StructureInclusion
