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
package net.sf.rcer.conn.ui.login;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import net.sf.rcer.conn.connections.Credentials;
import net.sf.rcer.conn.connections.IConnectionData;
import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.conn.locales.LocaleRegistry;
import net.sf.rcer.conn.locales.Locale.ToStringConverter;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

/**
 * A universal logon dialog (with or without choosing a connection).
 * @author vwegert
 *
 */
public class LoginDialog extends TitleAreaDialog {

	// TODO ensure that client, user name and password are entered
	
	/**
	 * The connections that can be selected.
	 */
	private WritableList credentials;

	/**
	 * The {@link DataBindingContext}.
	 */
	private DataBindingContext context;
	
	/**
	 * The UI elements.
	 */
	private ComboViewer connectionComboViewer;
	private Text clientText;
	private Text userText;
	private Text passwordText;
	private Combo localeCombo;
	
	/**
	 * The selected connection.
	 */
	private Credentials selectedCredentials;

	/**
	 * Default constructor.
	 * @param connections 
	 */
	public LoginDialog(Set<IConnectionData> connections) {
		super(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
		this.credentials = createCredentials(connections);
		setBlockOnOpen(true);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Log on to the SAP R/3 system");
		Composite composite = (Composite) super.createDialogArea(parent);
		createUserInterface(composite);
		bindUserInterface();
		setFocus();
		return composite;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("SAP R/3 Logon");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		context.updateModels();
		selectedCredentials = (Credentials) ((IStructuredSelection)connectionComboViewer.getSelection()).getFirstElement();
		super.okPressed();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#cancelPressed()
	 */
	@Override
	protected void cancelPressed() {
		selectedCredentials = null;
		super.cancelPressed();
	}

	/**
	 * @return the selected {@link Credentials} instance, or <code>null</code> if the dialog was aborted
	 */
	public Credentials getSelectedCredentials() {
		return selectedCredentials;
	}
	
	/**
	 * Creates the list of {@link Credentials} instances. 
	 * @param connections
	 * @return 
	 */
	private WritableList createCredentials(Set<IConnectionData> connections) {
		assert(connections.size() > 0);
		Map<String, Credentials> map = new TreeMap<String, Credentials>();
		for (IConnectionData conn: connections) {
			map.put(conn.getDescription(), new Credentials(conn));
		}
		WritableList result = new WritableList();
		result.addAll(map.values());
		return result;
	}

	/**
	 * Creates the UI elements. 
	 * @param composite
	 */
	private void createUserInterface(Composite composite) {
		GridDataFactory.fillDefaults().grab(true, true).applyTo(composite);

		Composite grid = new Composite(composite, SWT.NONE);
		grid.setFont(composite.getFont()); 
		GridLayoutFactory.swtDefaults().numColumns(2).applyTo(grid);
		GridDataFactory.fillDefaults().grab(true, true).applyTo(grid);

		Label connectionLabel = new Label(grid, SWT.NONE);
		connectionLabel.setText("Connection:");

		connectionComboViewer = new ComboViewer(grid, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(connectionComboViewer.getControl());

		Label clientLabel = new Label(grid, SWT.NONE);
		clientLabel.setText("Client:");

		clientText = new Text(grid, SWT.BORDER | SWT.SINGLE);
		clientText.setTextLimit(3);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(clientText);

		Label userLabel = new Label(grid, SWT.NONE);
		userLabel.setText("User Name:");

		userText = new Text(grid, SWT.BORDER | SWT.SINGLE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(userText);

		Label passwordLabel = new Label(grid, SWT.NONE);
		passwordLabel.setText("Password:");

		passwordText = new Text(grid, SWT.BORDER | SWT.SINGLE);
		passwordText.setEchoChar('*');
		GridDataFactory.fillDefaults().grab(true, false).applyTo(passwordText);

		Label localeLabel = new Label(grid, SWT.NONE);
		localeLabel.setText("Locale:");

		localeCombo = new Combo(grid, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(localeCombo);
	}

	/**
	 * Connects the UI elements to the model elements. 
	 */
	private void bindUserInterface() {

		// set the values of the locales combo
		final Collection<Locale> locales = LocaleRegistry.getInstance().getLocales();
		final Iterator<Locale> it = locales.iterator();
		final ToStringConverter converter = new Locale.ToStringConverter(true);
		String[] entries = new String[locales.size() + 1];
		for (int i = 0; i < locales.size(); i++) {
			entries[i] = (String) converter.convert(it.next());
		}
		entries[locales.size()] = "";
		localeCombo.setItems(entries);

		context = new DataBindingContext();

		// observe changes in the selection of the connection combo
		IObservableValue selection = ViewersObservables.observeSingleSelection(connectionComboViewer);

		// bind the client 
		context.bindValue(SWTObservables.observeText(clientText, SWT.Modify), 
				BeansObservables.observeDetailValue(Realm.getDefault(), selection, "client", String.class), 
				new UpdateValueStrategy(), 
				new UpdateValueStrategy());
		context.bindValue(SWTObservables.observeEnabled(clientText), 
				BeansObservables.observeDetailValue(Realm.getDefault(), selection, "clientEditable", boolean.class), 
				null, new UpdateValueStrategy());

		// bind the user name
		context.bindValue(SWTObservables.observeText(userText, SWT.Modify), 
				BeansObservables.observeDetailValue(Realm.getDefault(), selection, "userName", String.class), 
				new UpdateValueStrategy(), 
				new UpdateValueStrategy());
		context.bindValue(SWTObservables.observeEnabled(userText), 
				BeansObservables.observeDetailValue(Realm.getDefault(), selection, "userEditable", boolean.class), 
				null, new UpdateValueStrategy());

		// bind the password
		context.bindValue(SWTObservables.observeText(passwordText, SWT.Modify), 
				BeansObservables.observeDetailValue(Realm.getDefault(), selection, "password", String.class), 
				new UpdateValueStrategy(), 
				new UpdateValueStrategy());

		// bind the locale 
		context.bindValue(SWTObservables.observeSelection(localeCombo), 
				BeansObservables.observeDetailValue(Realm.getDefault(), selection, "locale", Locale.class), 
				new UpdateValueStrategy().setConverter(new Locale.FromStringConverter()), 
				new UpdateValueStrategy().setConverter(new Locale.ToStringConverter(true)));
		context.bindValue(SWTObservables.observeEnabled(localeCombo), 
				BeansObservables.observeDetailValue(Realm.getDefault(), selection, "localeEditable", boolean.class), 
				null, new UpdateValueStrategy());

		// provide the connection list with input data
		connectionComboViewer.setContentProvider(new ObservableListContentProvider());
		connectionComboViewer.setInput(credentials);

		// select the first entry
		connectionComboViewer.setSelection(new StructuredSelection(credentials.get(0)));
		
		// only enable the combo box if more than one connection can be chosen
		connectionComboViewer.getCombo().setEnabled(credentials.size() > 1);

	}

	/**
	 * Sets the focus to the first element that requires input. 
	 */
	private void setFocus() {
		if (clientText.isEnabled() && clientText.getText().equals("")) {
			clientText.setFocus();
		} else if (userText.isEnabled() && userText.getText().equals("")) {
			userText.setFocus();
		} else {
			passwordText.setFocus();
		}
	}

}
