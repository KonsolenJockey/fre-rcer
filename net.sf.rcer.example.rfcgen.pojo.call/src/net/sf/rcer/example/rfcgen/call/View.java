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
package net.sf.rcer.example.rfcgen.call;

import net.sf.rcer.conn.connections.ConnectionManager;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

/**
 * The view of the application.
 * @author vwegert
 *
 */
public class View extends ViewPart {

	/**
	 * The ID of the view.
	 */
	public static final String ID = "net.sf.rcer.example.rfcgen.call.view";

	private Text fromCountryText;
	private Text fromCityText;
	private Text toCountryText;
	private Text toCityText;
	private TableViewer viewer;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {

		GridLayoutFactory.fillDefaults().applyTo(parent);

		Composite query = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(query);
		GridLayoutFactory.swtDefaults().numColumns(3).applyTo(query);

		@SuppressWarnings("unused")
		Label spacer = new Label(query, SWT.NONE);

		Label countryLabel = new Label(query, SWT.NONE);
		countryLabel.setText("Country");

		Label cityLabel = new Label(query, SWT.NONE);
		cityLabel.setText("City");

		Label fromLabel = new Label(query, SWT.NONE);
		fromLabel.setText("From:");

		fromCountryText = new Text(query, SWT.SINGLE | SWT.BORDER);
		GridDataFactory.fillDefaults().applyTo(fromCountryText);
		fromCountryText.setText("DE");

		fromCityText = new Text(query, SWT.SINGLE | SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(fromCityText);
		fromCityText.setText("Frankfurt");

		Label toLabel = new Label(query, SWT.NONE);
		toLabel.setText("To:");

		toCountryText = new Text(query, SWT.SINGLE | SWT.BORDER);
		GridDataFactory.fillDefaults().applyTo(toCountryText);
		toCountryText.setText("DE");

		toCityText = new Text(query, SWT.SINGLE | SWT.BORDER);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(toCityText);
		toCityText.setText("Berlin");

		Button queryButton = new Button(query, SWT.PUSH);
		GridDataFactory.fillDefaults().span(3, 1).applyTo(queryButton);
		queryButton.setText("Search...");

		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridDataFactory.fillDefaults().span(3, 1).applyTo(separator);

		ObservableListContentProvider contentProvider = new ObservableListContentProvider();
		IObservableMap[] attributeMaps = BeansObservables.observeMaps(contentProvider.getKnownElements(), 
				FlightData.class, new String[] { "carrierID", "connectionID", "flightDate", "origin", "destination", 
			                                     "maximumSeats", "occupiedSeats" });

		viewer = new TableViewer(parent, SWT.MULTI | SWT.V_SCROLL | SWT.BORDER);
		
		Table table = viewer.getTable();
		GridDataFactory.fillDefaults().grab(true, true).applyTo(table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		addColumn(table, "Carr",       40);
		addColumn(table, "Conn",       50);
		addColumn(table, "Date",       70);
		addColumn(table, "From",       40);
		addColumn(table, "To",         40);
		addColumn(table, "max. Seats", 70);
		addColumn(table, "occ. Seats", 70);
		
		viewer.setContentProvider(contentProvider);
		viewer.setLabelProvider(new ObservableMapLabelProvider(attributeMaps));
		
		queryButton.addSelectionListener(new SelectionAdapter() {
			/* (non-Javadoc)
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent e) {
				GetFlightListCall call = new GetFlightListCall();
				call.setFromCountry(fromCountryText.getText());
				call.setFromCity(fromCityText.getText());
				call.setToCity(toCityText.getText());
				call.setToCountry(toCountryText.getText());
				try {
					call.execute(ConnectionManager.getInstance().getDestination());
					viewer.setInput(new WritableList(call.getFlights(), FlightData.class));
				} catch (Exception ex) {
					ErrorDialog.openError(getSite().getShell(), getSite().getShell().getText(), 
							"Unable to search for flights.", 
							new Status(IStatus.ERROR, Activator.PLUGIN_ID, ex.getLocalizedMessage(), ex));

				}
			}
		});
	}

	/**
	 * Auxiliary method to create a table column. 
	 * @param table
	 * @param title
	 * @param width
	 */
	private void addColumn(Table table, String title, int width) {
		TableColumn column = new TableColumn(table, SWT.LEFT);
		column.setText(title);
		column.setWidth(width);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}