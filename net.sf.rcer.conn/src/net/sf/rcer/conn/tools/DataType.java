/**
 * Copyright (c) 2008 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.conn.tools;

import java.text.MessageFormat;

import net.sf.rcer.conn.Messages;

/**
 * The data type of a field (see R/3 domain INTTYPE).
 * @author vwegert
 *
 */
public enum DataType {

	/**
	 * A character field of fixed length (internal type C).
	 */
	CHAR,            
	
	/**
	 * A character field containing only numbers (internal type N).
	 */
	NUM_CHAR, 

	/**
	 * A character field containing a date as YYYYMMDD (internal type D).
	 */
	DATE,

	/**
	 * A character field containing a time as HHMMSS (internal type T).
	 */
	TIME, 
	
	/**
	 * A field containing a sequence of bytes (internal type X).
	 */
	HEX,
	
	/**
	 * A 4-byte signed integer (internal type I).
	 */
	INT,
	
	/**
	 * An unsigned byte (internal type b).
	 */
	BYTE,
	
	/**
	 * A 2-byte integer (length of LCHR or LRAW only, internal type s).
	 */
	SHORT,
	
	/**
	 * A packed decimal number (internal type P).
	 */
	PACKED,
	
	/**
	 * An 8-byte floating point number (internal type F).
	 */
	FLOAT,
	
	/**
	 * A character string of variable length (internal type g).
	 */
	STRING, 
	
	/**
	 * A byte sequence of variable length (internal type y).
	 */
	XSTRING,
	
	/**
	 * A flat structure (internal type u).
	 */
	FLAT_STRUCTURE, 
	
	/**
	 * A deep structure (internal type v).
	 */
	DEEP_STRUCTURE,  
	
	/**
	 * An internal (run-time) table (internal type h).
	 */
	INT_TABLE,
	
	/**
	 * A character field of variable length (VARC, internal type V).
	 */
	VARC,
	
	/**
	 * A reference to a class or an interface (internal type r).
	 */
	REF_CLASS_IFACE,

	/**
	 * A reference to a data object (internal type l).
	 */
	REF_DATA;

	/**
	 * @param internalRepresentation the internal representation of the data type
	 * @return the enumeration value matching the internal representation
	 */
	public static DataType fromChar(char internalRepresentation) {
		switch(internalRepresentation) {
		case 'C': return CHAR;
		case 'N': return NUM_CHAR;
		case 'D': return DATE;
		case 'T': return TIME;
		case 'X': return HEX;
		case 'I': return INT;
		case 'b': return BYTE;
		case 's': return SHORT;
		case 'P': return PACKED;
		case 'F': return FLOAT;
		case 'g': return STRING;
		case 'y': return XSTRING;
		case 'u': return FLAT_STRUCTURE;
		case 'v': return DEEP_STRUCTURE;
		case 'h': return INT_TABLE;
		case 'V': return VARC;
		case 'r': return REF_CLASS_IFACE;
		case 'l': return REF_DATA;
		default: throw new IllegalArgumentException(MessageFormat.format(Messages.DataType_ErrorInvalidDataType, 
				internalRepresentation));
		}
	}

}
