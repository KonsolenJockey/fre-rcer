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
package net.sf.rcer.rom.abapobj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.ClassMethod#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ClassMethod#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ClassMethod#isFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getClassMethod()
 * @model
 * @generated
 */
public interface ClassMethod extends InterfaceMethod {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.abapobj.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.Visibility
	 * @see #setVisibility(Visibility)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getClassMethod_Visibility()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ClassMethod#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getClassMethod_Abstract()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ClassMethod#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see #setFinal(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getClassMethod_Final()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ClassMethod#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

} // ClassMethod
