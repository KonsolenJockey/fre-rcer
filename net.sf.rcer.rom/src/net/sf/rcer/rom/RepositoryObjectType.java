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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Repository Object Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ROMPackage#getRepositoryObjectType()
 * @model
 * @generated
 */
public enum RepositoryObjectType implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PACKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE(10, "PACKAGE", "PACKAGE"), /**
	 * The '<em><b>DOMAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN(20, "DOMAIN", "DOMAIN"), /**
	 * The '<em><b>DATA ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT(21, "DATA_ELEMENT", "DATA_ELEMENT"), /**
	 * The '<em><b>TABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE(22, "TABLE", "TABLE"), /**
	 * The '<em><b>STRUCTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE(23, "STRUCTURE", "STRUCTURE"), /**
	 * The '<em><b>TABLE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_TYPE(24, "TABLE_TYPE", "TABLE_TYPE"), /**
	 * The '<em><b>VIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIEW_VALUE
	 * @generated
	 * @ordered
	 */
	VIEW(25, "VIEW", "VIEW"), /**
	 * The '<em><b>SEARCH HELP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_HELP_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_HELP(26, "SEARCH_HELP", "SEARCH_HELP"), /**
	 * The '<em><b>ENQUEUE OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENQUEUE_OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	ENQUEUE_OBJECT(27, "ENQUEUE_OBJECT", "ENQUEUE_OBJECT"), /**
	 * The '<em><b>INTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(40, "INTERFACE", "INTERFACE"), /**
	 * The '<em><b>CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(41, "CLASS", "CLASS"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>PACKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACKAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACKAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_VALUE = 10;

	/**
	 * The '<em><b>DOMAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOMAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_VALUE = 20;

	/**
	 * The '<em><b>DATA ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA ELEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_VALUE = 21;

	/**
	 * The '<em><b>TABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_VALUE = 22;

	/**
	 * The '<em><b>STRUCTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRUCTURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_VALUE = 23;

	/**
	 * The '<em><b>TABLE TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLE TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_TYPE_VALUE = 24;

	/**
	 * The '<em><b>VIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIEW_VALUE = 25;

	/**
	 * The '<em><b>SEARCH HELP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEARCH HELP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH_HELP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_HELP_VALUE = 26;

	/**
	 * The '<em><b>ENQUEUE OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENQUEUE OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENQUEUE_OBJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENQUEUE_OBJECT_VALUE = 27;

	/**
	 * The '<em><b>INTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 40;

	/**
	 * The '<em><b>CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 41;

	/**
	 * An array of all the '<em><b>Repository Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RepositoryObjectType[] VALUES_ARRAY =
		new RepositoryObjectType[] {
			UNKNOWN,
			PACKAGE,
			DOMAIN,
			DATA_ELEMENT,
			TABLE,
			STRUCTURE,
			TABLE_TYPE,
			VIEW,
			SEARCH_HELP,
			ENQUEUE_OBJECT,
			INTERFACE,
			CLASS,
		};

	/**
	 * A public read-only list of all the '<em><b>Repository Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RepositoryObjectType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Repository Object Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryObjectType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryObjectType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Object Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryObjectType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RepositoryObjectType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Repository Object Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RepositoryObjectType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case PACKAGE_VALUE: return PACKAGE;
			case DOMAIN_VALUE: return DOMAIN;
			case DATA_ELEMENT_VALUE: return DATA_ELEMENT;
			case TABLE_VALUE: return TABLE;
			case STRUCTURE_VALUE: return STRUCTURE;
			case TABLE_TYPE_VALUE: return TABLE_TYPE;
			case VIEW_VALUE: return VIEW;
			case SEARCH_HELP_VALUE: return SEARCH_HELP;
			case ENQUEUE_OBJECT_VALUE: return ENQUEUE_OBJECT;
			case INTERFACE_VALUE: return INTERFACE;
			case CLASS_VALUE: return CLASS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RepositoryObjectType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RepositoryObjectType
