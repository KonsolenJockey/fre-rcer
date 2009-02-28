 
package net.sf.rcer.example.rfcgen.pojo.rr;

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
 * A class to model the input data of a RFC call to BAPI_SFLIGHT_GETLIST. Use the setters to prepare 
 * the importing parameters, then invoke {@link #execute(JCoDestination)} to execute the call. This method
 * returns an instance that contains the data returned from the SAP R/3 system.
 * <blockquote><pre>
 * GetFlightListRequest request = new GetFlightListRequest();
 * request.setFoo(...);
 * GetFlightListResponse response = call.execute(destination);
 * bar = response.getBar();
 * </pre></blockquote>
 */
public class GetFlightListRequest {

	private PropertyChangeSupport _pcs;

	private String fromCountry;
	private String fromCity;
	private String toCountry;
	private String toCity;
	
	/**
	 * Default constructor to create an instance with initial values.
	 */
	public GetFlightListRequest() {
		_pcs = new PropertyChangeSupport(this);
	}
	
	/**
	 * @return the country code of origin (FROMCOUNTRYKEY)
	 */
	public String getFromCountry() {
		return this.fromCountry;
	}
	
	/**
	 * Changes the country code of origin (FROMCOUNTRYKEY).
	 * @param newFromCountry the new country code of origin to set
	 */
	public void setFromCountry(String newFromCountry) {
		_pcs.firePropertyChange("fromCountry", this.fromCountry, newFromCountry);
		this.fromCountry = newFromCountry;
	}
	
	/**
	 * @return the city of origin (FROMCITY)
	 */
	public String getFromCity() {
		return this.fromCity;
	}
	
	/**
	 * Changes the city of origin (FROMCITY).
	 * @param newFromCity the new city of origin to set
	 */
	public void setFromCity(String newFromCity) {
		_pcs.firePropertyChange("fromCity", this.fromCity, newFromCity);
		this.fromCity = newFromCity;
	}
	
	/**
	 * @return the country code of destination (TOCOUNTRYKEY)
	 */
	public String getToCountry() {
		return this.toCountry;
	}
	
	/**
	 * Changes the country code of destination (TOCOUNTRYKEY).
	 * @param newToCountry the new country code of destination to set
	 */
	public void setToCountry(String newToCountry) {
		_pcs.firePropertyChange("toCountry", this.toCountry, newToCountry);
		this.toCountry = newToCountry;
	}
	
	/**
	 * @return the destination city (TOCITY)
	 */
	public String getToCity() {
		return this.toCity;
	}
	
	/**
	 * Changes the destination city (TOCITY).
	 * @param newToCity the new destination city to set
	 */
	public void setToCity(String newToCity) {
		_pcs.firePropertyChange("toCity", this.toCity, newToCity);
		this.toCity = newToCity;
	}
	
	/**
	 * Executes the RFC call and returns the response instance.
	 * @param destination the RFC destination to use
	 * @throws JCoException
	 */
	public GetFlightListResponse execute(JCoDestination destination) throws JCoException {
		JCoFunction function = destination.getRepository().getFunction("BAPI_SFLIGHT_GETLIST");
		function.getImportParameterList().setValue("FROMCOUNTRYKEY", fromCountry);
		function.getImportParameterList().setValue("FROMCITY", fromCity);
		function.getImportParameterList().setValue("TOCOUNTRYKEY", toCountry);
		function.getImportParameterList().setValue("TOCITY", toCity);
		function.execute(destination);
		GetFlightListResponse response = new GetFlightListResponse();
		response.setFlights(FlightData.fromTable(function.getTableParameterList().getTable("FLIGHTLIST")));
		return response;
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
	 * @return
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners()
	 */
	public PropertyChangeListener[] getPropertyChangeListeners() {
		return _pcs.getPropertyChangeListeners();
	}

	/**
	 * @param propertyName
	 * @return
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners(java.lang.String)
	 */
	public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
		return _pcs.getPropertyChangeListeners(propertyName);
	}

	/**
	 * @param propertyName
	 * @return
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
