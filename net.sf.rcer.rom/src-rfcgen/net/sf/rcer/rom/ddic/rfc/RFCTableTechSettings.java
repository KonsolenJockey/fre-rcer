 
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
 * A class representing the SAP R/3 data structure DD09L.
 */
public class RFCTableTechSettings {

	private PropertyChangeSupport _pcs;

	private String sizeCategory;
	private String dataClass;
	private String bufferSetting;
	private int bufferedKeyFields;
	private boolean changeLogActive;
	private boolean bufferCompressed;
	private boolean transparentTable;
	private boolean translated;
	private String bufferStatus;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCTableTechSettings() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * Copy constructor to create an instance and copy the values from an existing record.
	 * @param source the {@link JCoRecord} to copy the values from
	 * @throws UnsupportedOperationException if any other structure is passed as a source record
	 */
	public RFCTableTechSettings(JCoRecord source) throws UnsupportedOperationException {
		checkStructure(source);
		_pcs = new PropertyChangeSupport(this);
		this.sizeCategory = source.getString("TABKAT");
		this.dataClass = source.getString("TABART");
		this.bufferSetting = source.getString("PUFFERUNG");
		this.bufferedKeyFields = source.getInt("SCHFELDANZ");
		this.changeLogActive = source.getString("PROTOKOLL").equalsIgnoreCase("X");
		this.bufferCompressed = source.getString("SPEICHPUFF").equalsIgnoreCase("X");
		this.transparentTable = source.getString("TRANSPFLAG").equalsIgnoreCase("X");
		this.translated = source.getString("UEBERSETZ").equalsIgnoreCase("X");
		this.bufferStatus = source.getString("BUFALLOW");
	}

	/**
	 * Copy the values into a target record.
	 * @param targetStructure the {@link JCoRecord} to copy the values to
	 * @throws UnsupportedOperationException if any other structure is passed as a target record
	 */
	public void toStructure(JCoRecord targetStructure) throws UnsupportedOperationException {
		checkStructure(targetStructure);
		targetStructure.clear();
		targetStructure.setValue("TABKAT", this.sizeCategory);
		targetStructure.setValue("TABART", this.dataClass);
		targetStructure.setValue("PUFFERUNG", this.bufferSetting);
		targetStructure.setValue("SCHFELDANZ", this.bufferedKeyFields);
		targetStructure.setValue("PROTOKOLL", this.changeLogActive);
		targetStructure.setValue("SPEICHPUFF", this.bufferCompressed);
		targetStructure.setValue("TRANSPFLAG", this.transparentTable);
		targetStructure.setValue("UEBERSETZ", this.translated);
		targetStructure.setValue("BUFALLOW", this.bufferStatus);
	}

	/**
	 * Transfers the contents of a typed list to a {@link JCoTable}.
	 * @param source
	 * @param destination
	 */
	public static void toTable(List<RFCTableTechSettings> source, JCoTable destination) {
		destination.deleteAllRows();
		for (RFCTableTechSettings entry: source) {
			destination.appendRow();
			entry.toStructure(destination);
		}
	}
	
	/**
	 * Transfers the contents of a {@link JCoTable} into a typed list.
	 * @param source the {@link JCoTable} to read the data from
	 * @return a new {@link List} instance containing the data from the table
	 */
	public static List<RFCTableTechSettings> fromTable(JCoTable source) {
		List<RFCTableTechSettings> list = new ArrayList<RFCTableTechSettings>();
		if (!source.isEmpty()) {
			source.firstRow();
			do {
				list.add(new RFCTableTechSettings(source));
			} while (source.nextRow());
		}
		return list;
	}
	
	/**
	 * @throws UnsupportedOperationException if any structure other than DD09L is passed
	 */
	private void checkStructure(JCoRecord structure) throws UnsupportedOperationException {
		final String structureName = structure.getMetaData().getName(); 
		if (!structureName.equals("DD09L")) {
			throw new UnsupportedOperationException(
				MessageFormat.format("Unsupported structure {0} (expected DD09L).", structureName));
		}
	}
	
	/**
	 * @return the size category (DD09L-TABKAT)
	 */
	public String getSizeCategory() {
		return this.sizeCategory;
	}
	
	/**
	 * Changes the size category (DD09L-TABKAT).
	 * @param newSizeCategory the new size category to set
	 */
	public void setSizeCategory(String newSizeCategory) {
		_pcs.firePropertyChange("sizeCategory", this.sizeCategory, newSizeCategory);
		this.sizeCategory = newSizeCategory;
	}
	
	/**
	 * @return the data class in technical settings (DD09L-TABART)
	 */
	public String getDataClass() {
		return this.dataClass;
	}
	
	/**
	 * Changes the data class in technical settings (DD09L-TABART).
	 * @param newDataClass the new data class in technical settings to set
	 */
	public void setDataClass(String newDataClass) {
		_pcs.firePropertyChange("dataClass", this.dataClass, newDataClass);
		this.dataClass = newDataClass;
	}
	
	/**
	 * @return the buffering type indicator (DD09L-PUFFERUNG)
	 */
	public String getBufferSetting() {
		return this.bufferSetting;
	}
	
	/**
	 * Changes the buffering type indicator (DD09L-PUFFERUNG).
	 * @param newBufferSetting the new buffering type indicator to set
	 */
	public void setBufferSetting(String newBufferSetting) {
		_pcs.firePropertyChange("bufferSetting", this.bufferSetting, newBufferSetting);
		this.bufferSetting = newBufferSetting;
	}
	
	/**
	 * @return the number of key fields for generic buffers (DD09L-SCHFELDANZ)
	 */
	public int getBufferedKeyFields() {
		return this.bufferedKeyFields;
	}
	
	/**
	 * Changes the number of key fields for generic buffers (DD09L-SCHFELDANZ).
	 * @param newBufferedKeyFields the new number of key fields for generic buffers to set
	 */
	public void setBufferedKeyFields(int newBufferedKeyFields) {
		_pcs.firePropertyChange("bufferedKeyFields", this.bufferedKeyFields, newBufferedKeyFields);
		this.bufferedKeyFields = newBufferedKeyFields;
	}
	
	/**
	 * @return the whether to log data changes (DD09L-PROTOKOLL)
	 */
	public boolean isChangeLogActive() {
		return this.changeLogActive;
	}
	
	/**
	 * Changes the whether to log data changes (DD09L-PROTOKOLL).
	 * @param newChangeLogActive the new whether to log data changes to set
	 */
	public void setChangeLogActive(boolean newChangeLogActive) {
		_pcs.firePropertyChange("changeLogActive", this.changeLogActive, newChangeLogActive);
		this.changeLogActive = newChangeLogActive;
	}
	
	/**
	 * @return the whether the buffered data may be compressed (DD09L-SPEICHPUFF)
	 */
	public boolean isBufferCompressed() {
		return this.bufferCompressed;
	}
	
	/**
	 * Changes the whether the buffered data may be compressed (DD09L-SPEICHPUFF).
	 * @param newBufferCompressed the new whether the buffered data may be compressed to set
	 */
	public void setBufferCompressed(boolean newBufferCompressed) {
		_pcs.firePropertyChange("bufferCompressed", this.bufferCompressed, newBufferCompressed);
		this.bufferCompressed = newBufferCompressed;
	}
	
	/**
	 * @return the whether to convert to transparent table or maintain transparency (DD09L-TRANSPFLAG)
	 */
	public boolean isTransparentTable() {
		return this.transparentTable;
	}
	
	/**
	 * Changes the whether to convert to transparent table or maintain transparency (DD09L-TRANSPFLAG).
	 * @param newTransparentTable the new whether to convert to transparent table or maintain transparency to set
	 */
	public void setTransparentTable(boolean newTransparentTable) {
		_pcs.firePropertyChange("transparentTable", this.transparentTable, newTransparentTable);
		this.transparentTable = newTransparentTable;
	}
	
	/**
	 * @return the whether table is relevant for translation (DD09L-UEBERSETZ)
	 */
	public boolean isTranslated() {
		return this.translated;
	}
	
	/**
	 * Changes the whether table is relevant for translation (DD09L-UEBERSETZ).
	 * @param newTranslated the new whether table is relevant for translation to set
	 */
	public void setTranslated(boolean newTranslated) {
		_pcs.firePropertyChange("translated", this.translated, newTranslated);
		this.translated = newTranslated;
	}
	
	/**
	 * @return the indicator for buffering enabled/disabled/not allowed (DD09L-BUFALLOW)
	 */
	public String getBufferStatus() {
		return this.bufferStatus;
	}
	
	/**
	 * Changes the indicator for buffering enabled/disabled/not allowed (DD09L-BUFALLOW).
	 * @param newBufferStatus the new indicator for buffering enabled/disabled/not allowed to set
	 */
	public void setBufferStatus(String newBufferStatus) {
		_pcs.firePropertyChange("bufferStatus", this.bufferStatus, newBufferStatus);
		this.bufferStatus = newBufferStatus;
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
