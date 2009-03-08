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
import net.sf.rcer.rom.abapobj.ABAPClass;
import net.sf.rcer.rom.abapobj.ABAPInterface;
import net.sf.rcer.rom.ddic.DataElement;
import net.sf.rcer.rom.ddic.Domain;
import net.sf.rcer.rom.ddic.EnqueueObject;
import net.sf.rcer.rom.ddic.SearchHelp;
import net.sf.rcer.rom.ddic.Structure;
import net.sf.rcer.rom.ddic.Table;
import net.sf.rcer.rom.ddic.TableType;
import net.sf.rcer.rom.ddic.View;
import net.sf.rcer.rom.util.ObjectLoadingException;
import net.sf.rcer.rom.util.ObjectNotFoundException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository Object Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getSourceConnection <em>Source Connection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getPackages <em>Packages</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getDomains <em>Domains</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getDataElements <em>Data Elements</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getStructures <em>Structures</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getTables <em>Tables</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getTableTypes <em>Table Types</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getViews <em>Views</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getSeachHelps <em>Seach Helps</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getEnqueueObjects <em>Enqueue Objects</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link net.sf.rcer.rom.RepositoryObjectCollection#getClasses <em>Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection()
 * @model
 * @generated
 */
public interface RepositoryObjectCollection extends EObject {

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
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.RepositoryPackage}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.RepositoryPackage#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_Packages()
	 * @see net.sf.rcer.rom.RepositoryPackage#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<RepositoryPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.Domain}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.Domain#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domains</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_Domains()
	 * @see net.sf.rcer.rom.ddic.Domain#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Domain> getDomains();

	/**
	 * Returns the value of the '<em><b>Data Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.DataElement}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.DataElement#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Elements</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_DataElements()
	 * @see net.sf.rcer.rom.ddic.DataElement#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<DataElement> getDataElements();

	/**
	 * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.Structure}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.Structure#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structures</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_Structures()
	 * @see net.sf.rcer.rom.ddic.Structure#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Structure> getStructures();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.Table}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.Table#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_Tables()
	 * @see net.sf.rcer.rom.ddic.Table#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Table Types</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.TableType}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.TableType#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Types</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_TableTypes()
	 * @see net.sf.rcer.rom.ddic.TableType#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<TableType> getTableTypes();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.View}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.View#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_Views()
	 * @see net.sf.rcer.rom.ddic.View#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Seach Helps</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.SearchHelp}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.SearchHelp#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seach Helps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seach Helps</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_SeachHelps()
	 * @see net.sf.rcer.rom.ddic.SearchHelp#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<SearchHelp> getSeachHelps();

	/**
	 * Returns the value of the '<em><b>Enqueue Objects</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.ddic.EnqueueObject}.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.ddic.EnqueueObject#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enqueue Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enqueue Objects</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_EnqueueObjects()
	 * @see net.sf.rcer.rom.ddic.EnqueueObject#getCollection
	 * @model opposite="collection" containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<EnqueueObject> getEnqueueObjects();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.ABAPInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_Interfaces()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<ABAPInterface> getInterfaces();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.rcer.rom.abapobj.ABAPClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectCollection_Classes()
	 * @model containment="true" keys="name" ordered="false"
	 * @generated
	 */
	EList<ABAPClass> getClasses();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	RepositoryPackage getPackage(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	Domain getDomain(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	DataElement getDataElement(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" keyUnique="false" keyRequired="true" keyOrdered="false"
	 * @generated
	 */
	RepositoryObject loadObject(RepositoryObjectKey key) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	Structure getStructure(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	Table getTable(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	TableType getTableType(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	View getView(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	SearchHelp getSearchHelp(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	EnqueueObject getEnqueueObject(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	ABAPInterface getABAPInterface(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" exceptions="net.sf.rcer.rom.ObjectNotFoundException net.sf.rcer.rom.ObjectLoadingException" nameUnique="false" nameRequired="true" nameOrdered="false" loadUnique="false" loadRequired="true" loadOrdered="false"
	 * @generated
	 */
	ABAPClass getABAPClass(String name, boolean load) throws ObjectNotFoundException, ObjectLoadingException;
} // RepositoryObjectCollection
