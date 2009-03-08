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

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.rom.util.ObjectLoadingException;
import net.sf.rcer.rom.util.ObjectNotFoundException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#isLoaded <em>Loaded</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getSourceSystem <em>Source System</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#isGenerated <em>Generated</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getOriginalLocale <em>Original Locale</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getSoftwareComponent <em>Software Component</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getComponentRelease <em>Component Release</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObject#getPackageName <em>Package Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject()
 * @model abstract="true"
 * @generated
 */
public interface RepositoryObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.RepositoryObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' attribute.
	 * @see net.sf.rcer.rom.RepositoryObjectType
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_ObjectType()
	 * @model default="" unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectType getObjectType();

	/**
	 * Returns the value of the '<em><b>Loaded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded</em>' attribute.
	 * @see #setLoaded(boolean)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_Loaded()
	 * @model default="false" unique="false" required="true" transient="true" ordered="false"
	 * @generated
	 */
	boolean isLoaded();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#isLoaded <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded</em>' attribute.
	 * @see #isLoaded()
	 * @generated
	 */
	void setLoaded(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getProgramID();

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Type ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	String getObjectTypeID();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false" required="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectKey getKey();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_Name()
	 * @model default="" unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source System</em>' attribute.
	 * @see #setSourceSystem(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_SourceSystem()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSourceSystem();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#getSourceSystem <em>Source System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source System</em>' attribute.
	 * @see #getSourceSystem()
	 * @generated
	 */
	void setSourceSystem(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_Author()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false" required="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectCollection getCollection();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	RepositoryPackage getPackage(boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * Returns the value of the '<em><b>Generated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated</em>' attribute.
	 * @see #setGenerated(boolean)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_Generated()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isGenerated();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#isGenerated <em>Generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generated</em>' attribute.
	 * @see #isGenerated()
	 * @generated
	 */
	void setGenerated(boolean value);

	/**
	 * Returns the value of the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Locale</em>' attribute.
	 * @see #setOriginalLocale(Locale)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_OriginalLocale()
	 * @model unique="false" dataType="net.sf.rcer.rom.Locale" ordered="false"
	 * @generated
	 */
	Locale getOriginalLocale();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#getOriginalLocale <em>Original Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Locale</em>' attribute.
	 * @see #getOriginalLocale()
	 * @generated
	 */
	void setOriginalLocale(Locale value);

	/**
	 * Returns the value of the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Component</em>' attribute.
	 * @see #setSoftwareComponent(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_SoftwareComponent()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getSoftwareComponent();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#getSoftwareComponent <em>Software Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Component</em>' attribute.
	 * @see #getSoftwareComponent()
	 * @generated
	 */
	void setSoftwareComponent(String value);

	/**
	 * Returns the value of the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Release</em>' attribute.
	 * @see #setComponentRelease(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_ComponentRelease()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getComponentRelease();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#getComponentRelease <em>Component Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Release</em>' attribute.
	 * @see #getComponentRelease()
	 * @generated
	 */
	void setComponentRelease(String value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObject_PackageName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryObject#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

} // RepositoryObject
