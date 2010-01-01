 
package net.sf.rcer.rom.ddic.rfc;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;

/**
 * A class to model a RFC call to DD_DTEL_GET. Use the setters to prepare the importing parameters, 
 * then invoke {@link #execute(JCoDestination)} to execute the call. The attributes of this instance 
 * will be updated to reflect the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * RFCDataElementReader call = new RFCDataElementReader();
 * call.setFoo(...);
 * call.execute(destination);
 * bar = call.getBar();
 * </pre></blockquote>
 */
public class RFCDataElementReader {

	private PropertyChangeSupport _pcs;

	private String dataElementName;
	private String localeID;
	private RFCDataElementData dataElementData;
	private List<RFCDataElementText> texts = new ArrayList<RFCDataElementText>();
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public RFCDataElementReader() {
		_pcs = new PropertyChangeSupport(this);
	}

	/**
	 * @return the name (ROLL_NAME)
	 */
	public String getDataElementName() {
		return this.dataElementName;
	}
	
	/**
	 * Changes the name (ROLL_NAME).
	 * @param newDataElementName the new name to set
	 */
	public void setDataElementName(String newDataElementName) {
		_pcs.firePropertyChange("dataElementName", this.dataElementName, newDataElementName); //$NON-NLS-1$
		this.dataElementName = newDataElementName;
	}
	
	/**
	 * @return the locale ID (LANGU)
	 */
	public String getLocaleID() {
		return this.localeID;
	}
	
	/**
	 * Changes the locale ID (LANGU).
	 * @param newLocaleID the new locale ID to set
	 */
	public void setLocaleID(String newLocaleID) {
		_pcs.firePropertyChange("localeID", this.localeID, newLocaleID); //$NON-NLS-1$
		this.localeID = newLocaleID;
	}
	
	/**
	 * @return the the locale-independent data of the data element (DD04L_WA_A)
	 */
	public RFCDataElementData getDataElementData() {
		return this.dataElementData;
	}
	
	/**
	 * Changes the the locale-independent data of the data element (DD04L_WA_A).
	 * @param newDataElementData the new the locale-independent data of the data element to set
	 */
	public void setDataElementData(RFCDataElementData newDataElementData) {
		_pcs.firePropertyChange("dataElementData", this.dataElementData, newDataElementData); //$NON-NLS-1$
		this.dataElementData = newDataElementData;
	}
	
	/**
	 * @return the the localized texts of the data element (DD04T_TAB_A)
	 */
	public List<RFCDataElementText> getTexts() {
		return this.texts;
	}
	
	/**
	 * Changes the the localized texts of the data element (DD04T_TAB_A).
	 * @param newTexts the new the localized texts of the data element to set
	 */
	public void setTexts(List<RFCDataElementText> newTexts) {
		_pcs.firePropertyChange("texts", this.texts, newTexts); //$NON-NLS-1$
		this.texts = newTexts;
	}
	
	/**
	 * Executes the RFC call and updates the attributes accordingly.
	 * @param destination the RFC destination to use
	 * @throws JCoException
	 */
	public void execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("DD_DTEL_GET"); //$NON-NLS-1$
		function.getImportParameterList().setValue("ROLL_NAME", dataElementName); //$NON-NLS-1$
		function.getImportParameterList().setValue("LANGU", localeID); //$NON-NLS-1$
		RFCDataElementText.toTable(texts, function.getTableParameterList().getTable("DD04T_TAB_A")); //$NON-NLS-1$
		function.execute(destination);
		dataElementData = new RFCDataElementData(function.getExportParameterList().getStructure("DD04L_WA_A")); //$NON-NLS-1$
		texts = RFCDataElementText.fromTable(function.getTableParameterList().getTable("DD04T_TAB_A")); //$NON-NLS-1$
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
