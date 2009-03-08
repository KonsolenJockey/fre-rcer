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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getObjectKeys <em>Object Keys</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getObjects <em>Objects</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getSubPackageNames <em>Sub Package Names</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#isChangeRecodingEnabled <em>Change Recoding Enabled</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getResponsibleUser <em>Responsible User</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getTransportLayer <em>Transport Layer</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getInterfacePrefix <em>Interface Prefix</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getPermittedObjectTypes <em>Permitted Object Types</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#isObjectCreationRestricted <em>Object Creation Restricted</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#isCheckedAsServer <em>Checked As Server</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#isCheckedAsClient <em>Checked As Client</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryPackage#isObjectsLoaded <em>Objects Loaded</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage()
 * @model
 * @generated
 */
public interface RepositoryPackage extends RepositoryObject {
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
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

	/**
	 * Returns the value of the '<em><b>Object Keys</b></em>' reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.RepositoryObjectKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Keys</em>' reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_ObjectKeys()
	 * @model keys="programID objectTypeID name" ordered="false"
	 * @generated
	 */
	EList<RepositoryObjectKey> getObjectKeys();

	/**
	 * Returns the value of the '<em><b>Change Recoding Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Recoding Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Recoding Enabled</em>' attribute.
	 * @see #setChangeRecodingEnabled(boolean)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_ChangeRecodingEnabled()
	 * @model default="true" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isChangeRecodingEnabled();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#isChangeRecodingEnabled <em>Change Recoding Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Recoding Enabled</em>' attribute.
	 * @see #isChangeRecodingEnabled()
	 * @generated
	 */
	void setChangeRecodingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Responsible User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible User</em>' attribute.
	 * @see #setResponsibleUser(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_ResponsibleUser()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getResponsibleUser();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#getResponsibleUser <em>Responsible User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible User</em>' attribute.
	 * @see #getResponsibleUser()
	 * @generated
	 */
	void setResponsibleUser(String value);

	/**
	 * Returns the value of the '<em><b>Transport Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Layer</em>' attribute.
	 * @see #setTransportLayer(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_TransportLayer()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTransportLayer();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#getTransportLayer <em>Transport Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Layer</em>' attribute.
	 * @see #getTransportLayer()
	 * @generated
	 */
	void setTransportLayer(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_Namespace()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Interface Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Prefix</em>' attribute.
	 * @see #setInterfacePrefix(String)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_InterfacePrefix()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getInterfacePrefix();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#getInterfacePrefix <em>Interface Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Prefix</em>' attribute.
	 * @see #getInterfacePrefix()
	 * @generated
	 */
	void setInterfacePrefix(String value);

	/**
	 * Returns the value of the '<em><b>Permitted Object Types</b></em>' attribute.
	 * The default value is <code>"ALL"</code>.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.PackagePermittedObjectTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permitted Object Types</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permitted Object Types</em>' attribute.
	 * @see net.sf.rcer.rom.PackagePermittedObjectTypes
	 * @see #setPermittedObjectTypes(PackagePermittedObjectTypes)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_PermittedObjectTypes()
	 * @model default="ALL" unique="false" required="true" ordered="false"
	 * @generated
	 */
	PackagePermittedObjectTypes getPermittedObjectTypes();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#getPermittedObjectTypes <em>Permitted Object Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permitted Object Types</em>' attribute.
	 * @see net.sf.rcer.rom.PackagePermittedObjectTypes
	 * @see #getPermittedObjectTypes()
	 * @generated
	 */
	void setPermittedObjectTypes(PackagePermittedObjectTypes value);

	/**
	 * Returns the value of the '<em><b>Object Creation Restricted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Creation Restricted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Creation Restricted</em>' attribute.
	 * @see #setObjectCreationRestricted(boolean)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_ObjectCreationRestricted()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isObjectCreationRestricted();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#isObjectCreationRestricted <em>Object Creation Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Creation Restricted</em>' attribute.
	 * @see #isObjectCreationRestricted()
	 * @generated
	 */
	void setObjectCreationRestricted(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"STANDARD"</code>.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.PackageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.rcer.rom.PackageType
	 * @see #setType(PackageType)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_Type()
	 * @model default="STANDARD" unique="false" required="true" ordered="false"
	 * @generated
	 */
	PackageType getType();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.rcer.rom.PackageType
	 * @see #getType()
	 * @generated
	 */
	void setType(PackageType value);

	/**
	 * Returns the value of the '<em><b>Checked As Server</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked As Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked As Server</em>' attribute.
	 * @see #setCheckedAsServer(boolean)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_CheckedAsServer()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedAsServer();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#isCheckedAsServer <em>Checked As Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked As Server</em>' attribute.
	 * @see #isCheckedAsServer()
	 * @generated
	 */
	void setCheckedAsServer(boolean value);

	/**
	 * Returns the value of the '<em><b>Checked As Client</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked As Client</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked As Client</em>' attribute.
	 * @see #setCheckedAsClient(boolean)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_CheckedAsClient()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedAsClient();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#isCheckedAsClient <em>Checked As Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked As Client</em>' attribute.
	 * @see #isCheckedAsClient()
	 * @generated
	 */
	void setCheckedAsClient(boolean value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.RepositoryObjectCollection#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' container reference.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_Collection()
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getPackages
	 * @model opposite="packages" transient="false" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectCollection getCollection();

	/**
	 * Returns the value of the '<em><b>Objects Loaded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects Loaded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects Loaded</em>' attribute.
	 * @see #setObjectsLoaded(boolean)
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_ObjectsLoaded()
	 * @model default="false" unique="false" required="true" transient="true" ordered="false"
	 * @generated
	 */
	boolean isObjectsLoaded();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.RepositoryPackage#isObjectsLoaded <em>Objects Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects Loaded</em>' attribute.
	 * @see #isObjectsLoaded()
	 * @generated
	 */
	void setObjectsLoaded(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" failOnErrorUnique="false" failOnErrorRequired="true" failOnErrorOrdered="false"
	 * @generated
	 */
	void loadContents(boolean failOnError) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.RepositoryObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_Objects()
	 * @model keys="objectType name" ordered="false"
	 * @generated
	 */
	EList<RepositoryObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Sub Package Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Package Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Package Names</em>' attribute list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryPackage_SubPackageNames()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getSubPackageNames();

} // RepositoryPackage
