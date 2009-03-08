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
package net.sf.rcer.rom.abapobj;

import net.sf.rcer.conn.locales.Locale;

import net.sf.rcer.rom.RepositoryObject;
import net.sf.rcer.rom.RepositoryObjectCollection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ABAP Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getSuperClassName <em>Super Class Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getCreationScope <em>Creation Scope</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#isFinal <em>Final</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#isFixedPointArithmetics <em>Fixed Point Arithmetics</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#isUnicodeChecked <em>Unicode Checked</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getFriendClassNames <em>Friend Class Names</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getMethods <em>Methods</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPClass#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass()
 * @model
 * @generated
 */
public interface ABAPClass extends RepositoryObject, ForwardDeclarations {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' map.
	 * The key is of type {@link net.sf.rcer.conn.locales.Locale},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' map.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_Collection()
	 * @model changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectCollection getCollection();

	/**
	 * Returns the value of the '<em><b>Super Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Class Name</em>' attribute.
	 * @see #setSuperClassName(String)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_SuperClassName()
	 * @model
	 * @generated
	 */
	String getSuperClassName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ABAPClass#getSuperClassName <em>Super Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Class Name</em>' attribute.
	 * @see #getSuperClassName()
	 * @generated
	 */
	void setSuperClassName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Scope</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.abapobj.ClassCreationScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Scope</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.ClassCreationScope
	 * @see #setCreationScope(ClassCreationScope)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_CreationScope()
	 * @model default="" unique="false" required="true" ordered="false"
	 * @generated
	 */
	ClassCreationScope getCreationScope();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ABAPClass#getCreationScope <em>Creation Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Scope</em>' attribute.
	 * @see net.sf.rcer.rom.abapobj.ClassCreationScope
	 * @see #getCreationScope()
	 * @generated
	 */
	void setCreationScope(ClassCreationScope value);

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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_Final()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isFinal();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ABAPClass#isFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see #isFinal()
	 * @generated
	 */
	void setFinal(boolean value);

	/**
	 * Returns the value of the '<em><b>Fixed Point Arithmetics</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Point Arithmetics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Point Arithmetics</em>' attribute.
	 * @see #setFixedPointArithmetics(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_FixedPointArithmetics()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isFixedPointArithmetics();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ABAPClass#isFixedPointArithmetics <em>Fixed Point Arithmetics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Point Arithmetics</em>' attribute.
	 * @see #isFixedPointArithmetics()
	 * @generated
	 */
	void setFixedPointArithmetics(boolean value);

	/**
	 * Returns the value of the '<em><b>Unicode Checked</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unicode Checked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unicode Checked</em>' attribute.
	 * @see #setUnicodeChecked(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_UnicodeChecked()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isUnicodeChecked();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ABAPClass#isUnicodeChecked <em>Unicode Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unicode Checked</em>' attribute.
	 * @see #isUnicodeChecked()
	 * @generated
	 */
	void setUnicodeChecked(boolean value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.InterfaceImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_Interfaces()
	 * @model containment="true" keys="interfaceName"
	 * @generated
	 */
	EList<InterfaceImplementation> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Friend Class Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friend Class Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friend Class Names</em>' attribute list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_FriendClassNames()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	EList<String> getFriendClassNames();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.ClassAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_Attributes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ClassAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.ClassMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_Methods()
	 * @model keys="name"
	 * @generated
	 */
	EList<ClassMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.ClassEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPClass_Events()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<ClassEvent> getEvents();

} // ABAPClass
