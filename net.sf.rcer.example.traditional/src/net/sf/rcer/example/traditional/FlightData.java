/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 *
 * $Id$
 */
package net.sf.rcer.example.traditional;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;

/**
 * The flight data loaded from the SAP R/3 system using BAPI_SFLIGHT_GETLIST. This class corresponds to the
 * data dictionary structure BAPISFLIST.
 * @author vwegert
 *
 */
public class FlightData {

	private PropertyChangeSupport propertyChangeSupport;

	private String carrier;
	private String connection;
	private Date departure;
	private String airportFrom;
	private String airportTo;
	private Integer maximumSeats;
	private Integer occupiedSeats;

	/**
	 * Default constructor.
	 */
	public FlightData() {
		propertyChangeSupport = new PropertyChangeSupport(this);
	}

	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier the carrier to set
	 */
	public void setCarrier(String carrier) {
		final String oldValue = this.carrier;
		this.carrier = carrier;
		propertyChangeSupport.firePropertyChange("carrier", oldValue, this.carrier);
	}


	/**
	 * @return the connection
	 */
	public String getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(String connection) {
		final String oldValue = this.connection;
		this.connection = connection;
		propertyChangeSupport.firePropertyChange("connection", oldValue, this.connection);
	}


	/**
	 * @return the departure date and time
	 */
	public Date getDeparture() {
		return departure;
	}

	/**
	 * @param departure the departure date and time to set
	 */
	public void setDeparture(Date departure) {
		final Date oldValue = this.departure;
		this.departure = departure;
		propertyChangeSupport.firePropertyChange("departure", oldValue, this.departure);
	}


	/**
	 * @return the airport of departure
	 */
	public String getAirportFrom() {
		return airportFrom;
	}

	/**
	 * @param airportFrom the airport of departure to set
	 */
	public void setAirportFrom(String airportFrom) {
		final String oldValue = this.airportFrom;
		this.airportFrom = airportFrom;
		propertyChangeSupport.firePropertyChange("airportFrom", oldValue, this.airportFrom);
	}


	/**
	 * @return the destination airport
	 */
	public String getAirportTo() {
		return airportTo;
	}

	/**
	 * @param airportTo the destination airport to set
	 */
	public void setAirportTo(String airportTo) {
		final String oldValue = this.airportTo;
		this.airportTo = airportTo;
		propertyChangeSupport.firePropertyChange("airportTo", oldValue, this.airportTo);
	}


	/**
	 * @return the maximum seats
	 */
	public Integer getMaximumSeats() {
		return maximumSeats;
	}

	/**
	 * @param maximumSeats the maximum seats to set
	 */
	public void setMaximumSeats(Integer maximumSeats) {
		final Integer oldValue = this.maximumSeats;
		this.maximumSeats = maximumSeats;
		propertyChangeSupport.firePropertyChange("maximumSeats", oldValue, this.maximumSeats);
	}


	/**
	 * @return the occupied seats
	 */
	public Integer getOccupiedSeats() {
		return occupiedSeats;
	}

	/**
	 * @param occupiedSeats the occupied seats to set
	 */
	public void setOccupiedSeats(Integer occupiedSeats) {
		final Integer oldValue = this.occupiedSeats;
		this.occupiedSeats = occupiedSeats;
		propertyChangeSupport.firePropertyChange("occupiedSeats", oldValue, this.occupiedSeats);
	}

	/**
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	/**
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 * @param listener
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String, java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String propertyName,
			PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName,
				listener);
	}

}
