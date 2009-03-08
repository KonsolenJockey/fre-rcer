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
 * A representation of the model object '<em><b>ABAP Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#isExitInterface <em>Exit Interface</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#isUnicodeChecked <em>Unicode Checked</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#getMethods <em>Methods</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.ABAPInterface#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface()
 * @model
 * @generated
 */
public interface ABAPInterface extends RepositoryObject, ForwardDeclarations {
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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_Description()
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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_Collection()
	 * @model changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectCollection getCollection();

	/**
	 * Returns the value of the '<em><b>Exit Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Interface</em>' attribute.
	 * @see #setExitInterface(boolean)
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_ExitInterface()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isExitInterface();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ABAPInterface#isExitInterface <em>Exit Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit Interface</em>' attribute.
	 * @see #isExitInterface()
	 * @generated
	 */
	void setExitInterface(boolean value);

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
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_UnicodeChecked()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isUnicodeChecked();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.abapobj.ABAPInterface#isUnicodeChecked <em>Unicode Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unicode Checked</em>' attribute.
	 * @see #isUnicodeChecked()
	 * @generated
	 */
	void setUnicodeChecked(boolean value);

	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.InterfaceMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_Methods()
	 * @model keys="name"
	 * @generated
	 */
	EList<InterfaceMethod> getMethods();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' attribute list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_Interfaces()
	 * @model
	 * @generated
	 */
	EList<String> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.InterfaceAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_Attributes()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<InterfaceAttribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.InterfaceEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getABAPInterface_Events()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<InterfaceEvent> getEvents();

} // ABAPInterface
