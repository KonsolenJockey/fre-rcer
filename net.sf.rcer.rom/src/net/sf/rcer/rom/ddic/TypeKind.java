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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ddic.DDICPackage#getTypeKind()
 * @model
 * @generated
 */
public enum TypeKind implements Enumerator {
	/**
	 * The '<em><b>DICTIONARY TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DICTIONARY_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	DICTIONARY_TYPE(1, "DICTIONARY_TYPE", "DICTIONARY_TYPE"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BUILT IN TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUILT_IN_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	BUILT_IN_TYPE(2, "BUILT_IN_TYPE", "E"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>STRUCTURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE(3, "STRUCTURE", "S"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>TABLE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABLE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TABLE_TYPE(4, "TABLE_TYPE", "L"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(5, "REFERENCE", "R"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DOMAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN(6, "DOMAIN", "D"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DICTIONARY TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DICTIONARY TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DICTIONARY_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DICTIONARY_TYPE_VALUE = 1;

	/**
	 * The '<em><b>BUILT IN TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUILT IN TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUILT_IN_TYPE
	 * @model literal="E"
	 * @generated
	 * @ordered
	 */
	public static final int BUILT_IN_TYPE_VALUE = 2;

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
	public static final int STRUCTURE_VALUE = 3;

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
	public static final int TABLE_TYPE_VALUE = 4;

	/**
	 * The '<em><b>REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REFERENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCE
	 * @model literal="R"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 5;

	/**
	 * The '<em><b>DOMAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOMAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN
	 * @model literal="D"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeKind[] VALUES_ARRAY =
		new TypeKind[] {
			DICTIONARY_TYPE,
			BUILT_IN_TYPE,
			STRUCTURE,
			TABLE_TYPE,
			REFERENCE,
			DOMAIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeKind get(int value) {
		switch (value) {
			case DICTIONARY_TYPE_VALUE: return DICTIONARY_TYPE;
			case BUILT_IN_TYPE_VALUE: return BUILT_IN_TYPE;
			case STRUCTURE_VALUE: return STRUCTURE;
			case TABLE_TYPE_VALUE: return TABLE_TYPE;
			case REFERENCE_VALUE: return REFERENCE;
			case DOMAIN_VALUE: return DOMAIN;
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
	private TypeKind(int value, String name, String literal) {
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
	
} //TypeKind
