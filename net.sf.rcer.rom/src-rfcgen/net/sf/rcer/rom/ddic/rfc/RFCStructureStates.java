 
package net.sf.rcer.rom.ddic.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import java.text.MessageFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoRecord;
import com.sap.conn.jco.JCoTable;

/**
 * A class representing the SAP R/3 data structure DCTABLGET.
 */
public class RFCStructureStates {

	private PropertyChangeSupport _pcs;

	private String TABL;
	private String TABD;
	private String TBHD;
	private String TBFD;
	private String TBFK;
	private String TBSH;
	private String TBIX;
	private String TABT;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCStructureStates() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCStructureStates(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.TABL = source.getString("TABL");
		this.TABD = source.getString("TABD");
		this.TBHD = source.getString("TBHD");
		this.TBFD = source.getString("TBFD");
		this.TBFK = source.getString("TBFK");
		this.TBSH = source.getString("TBSH");
		this.TBIX = source.getString("TBIX");
		this.TABT = source.getString("TABT");
	}

	/**
	 * Copy the values into a target record.
	 * @param target the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord target) throws UnsupportedOperationException {
		checkStructure(target);
		target.clear();
		target.setValue("TABL", this.TABL);
		target.setValue("TABD", this.TABD);
		target.setValue("TBHD", this.TBHD);
		target.setValue("TBFD", this.TBFD);
		target.setValue("TBFK", this.TBFK);
		target.setValue("TBSH", this.TBSH);
		target.setValue("TBIX", this.TBIX);
		target.setValue("TABT", this.TABT);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCStructureStates> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCStructureStates entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source
	 * @param destination
	 */
	public static List<RFCStructureStates> fromTable(JCoTable source) {
		List<RFCStructureStates> list = new ArrayList<RFCStructureStates>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCStructureStates(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DCTABLGET is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DCTABLGET")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DCTABLGET).", structureName));
		}
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TABL)
	 */
	public String getTABL() {
		return this.TABL;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TABL).
	 * @param newTABL the new Status of the ABAP Dictionary object to set
	 */
	public void setTABL(String newTABL) {
		_pcs.firePropertyChange("TABL", this.TABL, newTABL);
		this.TABL = newTABL;
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TABD)
	 */
	public String getTABD() {
		return this.TABD;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TABD).
	 * @param newTABD the new Status of the ABAP Dictionary object to set
	 */
	public void setTABD(String newTABD) {
		_pcs.firePropertyChange("TABD", this.TABD, newTABD);
		this.TABD = newTABD;
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TBHD)
	 */
	public String getTBHD() {
		return this.TBHD;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TBHD).
	 * @param newTBHD the new Status of the ABAP Dictionary object to set
	 */
	public void setTBHD(String newTBHD) {
		_pcs.firePropertyChange("TBHD", this.TBHD, newTBHD);
		this.TBHD = newTBHD;
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TBFD)
	 */
	public String getTBFD() {
		return this.TBFD;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TBFD).
	 * @param newTBFD the new Status of the ABAP Dictionary object to set
	 */
	public void setTBFD(String newTBFD) {
		_pcs.firePropertyChange("TBFD", this.TBFD, newTBFD);
		this.TBFD = newTBFD;
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TBFK)
	 */
	public String getTBFK() {
		return this.TBFK;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TBFK).
	 * @param newTBFK the new Status of the ABAP Dictionary object to set
	 */
	public void setTBFK(String newTBFK) {
		_pcs.firePropertyChange("TBFK", this.TBFK, newTBFK);
		this.TBFK = newTBFK;
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TBSH)
	 */
	public String getTBSH() {
		return this.TBSH;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TBSH).
	 * @param newTBSH the new Status of the ABAP Dictionary object to set
	 */
	public void setTBSH(String newTBSH) {
		_pcs.firePropertyChange("TBSH", this.TBSH, newTBSH);
		this.TBSH = newTBSH;
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TBIX)
	 */
	public String getTBIX() {
		return this.TBIX;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TBIX).
	 * @param newTBIX the new Status of the ABAP Dictionary object to set
	 */
	public void setTBIX(String newTBIX) {
		_pcs.firePropertyChange("TBIX", this.TBIX, newTBIX);
		this.TBIX = newTBIX;
	}
	
	/**
	 * @return the Status of the ABAP Dictionary object (DCTABLGET-TABT)
	 */
	public String getTABT() {
		return this.TABT;
	}
	
	/**
	 * Changes the Status of the ABAP Dictionary object (DCTABLGET-TABT).
	 * @param newTABT the new Status of the ABAP Dictionary object to set
	 */
	public void setTABT(String newTABT) {
		_pcs.firePropertyChange("TABT", this.TABT, newTABT);
		this.TABT = newTABT;
	}
	
	/**
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		_pcs.addPropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		_pcs.addPropertyChangeListener(propertyName, listener);
	}

	/**
	 * @return the list of property change listeners
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners()
	 */
	public PropertyChangeListener[] getPropertyChangeListeners() {
		return _pcs.getPropertyChangeListeners();
	}

	/**
	 * @param propertyName
	 * @return the list of property change listeners for a certain property
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners(java.lang.String)
	 */
	public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
		return _pcs.getPropertyChangeListeners(propertyName);
	}

	/**
	 * @param propertyName
	 * @return <code>true</code> if any property change listeners are registered
	 * @see java.beans.PropertyChangeSupport#hasListeners(java.lang.String)
	 */
	public boolean hasListeners(String propertyName) {
		return _pcs.hasListeners(propertyName);
	}

	/**
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		_pcs.removePropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		_pcs.removePropertyChangeListener(propertyName, listener);
	}

}
