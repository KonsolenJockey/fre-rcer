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
package net.sf.rcer.rom.ddic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElementField#getDataElementName <em>Data Element Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElementField#getSearchHelpName <em>Search Help Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElementField#getSearchHelpField <em>Search Help Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElementField()
 * @model
 * @generated
 */
public interface DataElementField extends SingleField {
	/**
	 * Returns the value of the '<em><b>Data Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Element Name</em>' attribute.
	 * @see #setDataElementName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElementField_DataElementName()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDataElementName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElementField#getDataElementName <em>Data Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Element Name</em>' attribute.
	 * @see #getDataElementName()
	 * @generated
	 */
	void setDataElementName(String value);

	/**
	 * Returns the value of the '<em><b>Search Help Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Help Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Help Name</em>' attribute.
	 * @see #setSearchHelpName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElementField_SearchHelpName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSearchHelpName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElementField#getSearchHelpName <em>Search Help Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Help Name</em>' attribute.
	 * @see #getSearchHelpName()
	 * @generated
	 */
	void setSearchHelpName(String value);

	/**
	 * Returns the value of the '<em><b>Search Help Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Help Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Help Field</em>' attribute.
	 * @see #setSearchHelpField(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElementField_SearchHelpField()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSearchHelpField();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElementField#getSearchHelpField <em>Search Help Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Help Field</em>' attribute.
	 * @see #getSearchHelpField()
	 * @generated
	 */
	void setSearchHelpField(String value);

} // DataElementField
