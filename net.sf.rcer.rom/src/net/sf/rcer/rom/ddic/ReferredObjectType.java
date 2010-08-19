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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Referred Object Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ddic.DDICPackage#getReferredObjectType()
 * @model
 * @generated
 */
public enum ReferredObjectType implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", ""), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(1, "ANY", "A"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>OBJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	OBJECT(2, "OBJECT", "O"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(3, "DATA", "D"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DICTIONARY TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICTIONARY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DICTIONARY_TYPE(4, "DICTIONARY_TYPE", "B"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DATA ELEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ELEMENT(5, "DATA_ELEMENT", "E"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>STRUCTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE(6, "STRUCTURE", "S"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>TABLE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_TYPE(7, "TABLE_TYPE", "L"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS(8, "CLASS", "C"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>INTERFACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(9, "INTERFACE", "I"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANY
	 * @model literal="A"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 1;

	/**
	 * The '<em><b>OBJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OBJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBJECT
	 * @model literal="O"
	 * @generated
	 * @ordered
	 */
	public static final int OBJECT_VALUE = 2;

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model literal="D"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 3;

	/**
	 * The '<em><b>DICTIONARY TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DICTIONARY TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DICTIONARY_TYPE
	 * @model literal="B"
	 * @generated
	 * @ordered
	 */
	public static final int DICTIONARY_TYPE_VALUE = 4;

	/**
	 * The '<em><b>DATA ELEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA ELEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_ELEMENT
	 * @model literal="E"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ELEMENT_VALUE = 5;

	/**
	 * The '<em><b>STRUCTURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRUCTURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE
	 * @model literal="S"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_VALUE = 6;

	/**
	 * The '<em><b>TABLE TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TABLE TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TABLE_TYPE
	 * @model literal="L"
	 * @generated
	 * @ordered
	 */
	public static final int TABLE_TYPE_VALUE = 7;

	/**
	 * The '<em><b>CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS
	 * @model literal="C"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_VALUE = 8;

	/**
	 * The '<em><b>INTERFACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTERFACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model literal="I"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 9;

	/**
	 * An array of all the '<em><b>Referred Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferredObjectType[] VALUES_ARRAY =
		new ReferredObjectType[] {
			UNKNOWN,
			ANY,
			OBJECT,
			DATA,
			DICTIONARY_TYPE,
			DATA_ELEMENT,
			STRUCTURE,
			TABLE_TYPE,
			CLASS,
			INTERFACE,
		};

	/**
	 * A public read-only list of all the '<em><b>Referred Object Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferredObjectType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Referred Object Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferredObjectType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferredObjectType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Referred Object Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferredObjectType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferredObjectType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Referred Object Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferredObjectType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case ANY_VALUE: return ANY;
			case OBJECT_VALUE: return OBJECT;
			case DATA_VALUE: return DATA;
			case DICTIONARY_TYPE_VALUE: return DICTIONARY_TYPE;
			case DATA_ELEMENT_VALUE: return DATA_ELEMENT;
			case STRUCTURE_VALUE: return STRUCTURE;
			case TABLE_TYPE_VALUE: return TABLE_TYPE;
			case CLASS_VALUE: return CLASS;
			case INTERFACE_VALUE: return INTERFACE;
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
	private ReferredObjectType(int value, String name, String literal) {
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
	
} //ReferredObjectType
