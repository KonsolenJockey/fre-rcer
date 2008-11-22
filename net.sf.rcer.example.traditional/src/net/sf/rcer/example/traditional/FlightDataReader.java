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
package net.sf.rcer.example.traditional;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import net.sf.rcer.conn.connections.ConnectionException;
import net.sf.rcer.conn.connections.ConnectionManager;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoStructure;
import com.sap.conn.jco.JCoTable;

/**
 * A wrapper around BAPI_SFLIGHT_GETLIST.
 * @author vwegert
 *
 */
public class FlightDataReader {

	private List<FlightData> result = new Vector<FlightData>();

	/**
	 * Executes BAPI_SFLIGHT_GETLIST.
	 * @param fromCountry
	 * @param fromCity
	 * @param toCountry
	 * @param toCity
	 * @return a status object 
	 */
	@SuppressWarnings("deprecation")
	public IStatus readFlights(String fromCountry, String fromCity, String toCountry, String toCity) {

		// do not reuse the old list - someone might be referencing it
		result = new Vector<FlightData>();

		// get the destination
		JCoDestination destination;
		try {
			destination = ConnectionManager.getInstance().getDestination();
			if (destination == null) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
				"Unable to connect to the SAP R/3 system.");				
			}
		} catch (ConnectionException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					"Unable to connect to the SAP R/3 system.", e);
		} catch (JCoException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					"Unable to connect to the SAP R/3 system.", e);
		}		

		// get the function object
		JCoFunction function;
		try {
			function = destination.getRepository().getFunction("BAPI_SFLIGHT_GETLIST");
			if (function == null) {
				return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
				"Unable to load function module BAPI_SFLIGHT_GETLIST.");				
			}
		} catch (JCoException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					"Unable to load function module BAPI_SFLIGHT_GETLIST.", e);
		}

		// transfer the input parameters
		function.getImportParameterList().setValue("FROMCOUNTRYKEY", fromCountry);
		function.getImportParameterList().setValue("FROMCITY",       fromCity);
		function.getImportParameterList().setValue("TOCOUNTRYKEY",   toCountry);
		function.getImportParameterList().setValue("TOCITY",         toCity);

		// execute the query
		try {
			function.execute(destination);
		} catch (JCoException e) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					"Unable to execute function module BAPI_SFLIGHT_GETLIST.", e);
		}

		// check the message
		JCoStructure message = function.getExportParameterList().getStructure("RETURN");
		final String messageType = message.getString("TYPE");
		if (!(messageType.equals("") || messageType.equals("S") || messageType.equals("W"))) {
			return new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
					message.getString("MESSAGE"));
		}

		// transfer the returned values
		JCoTable flightList = function.getTableParameterList().getTable("FLIGHTLIST");
		if (!flightList.isEmpty()) {
			for (int i = 1; i <= flightList.getNumRows(); i++) {
				flightList.setRow(i);
				FlightData data = new FlightData();
				data.setCarrier(flightList.getString("CARRID"));
				data.setConnection(flightList.getString("CONNID"));
				final Date date = flightList.getDate("FLDATE");
				final Date time = flightList.getTime("DEPTIME");
				data.setDeparture(new Date(date.getYear(), date.getMonth(), date.getDate(), 
						time.getHours(), time.getMinutes(), time.getSeconds()));
				data.setAirportFrom(flightList.getString("AIRPFROM"));
				data.setAirportTo(flightList.getString("AIRPTO"));
				data.setMaximumSeats(flightList.getInt("SEATSMAX"));
				data.setOccupiedSeats(flightList.getInt("SEATSOCC"));
				result.add(data);
			}
		}

		return Status.OK_STATUS;
	}		

	/**
	 * @return the list of flights, or an empty list if the query was not executed.
	 */
	public List<FlightData> getResult() {
		return result;
	}

}
