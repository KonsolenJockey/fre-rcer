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
package net.sf.rcer.jcoimport;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * The "model class" behind the import wizard.
 * 
 * @author vwegert
 * 
 */
public class ProjectGeneratorSettings {

	private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	private String win32FileName = ""; //$NON-NLS-1$
	private String win64IAFileName = ""; //$NON-NLS-1$
	private String win64x86FileName = ""; //$NON-NLS-1$
	private String linux32FileName = ""; //$NON-NLS-1$
	private String linux64IAFileName = ""; //$NON-NLS-1$
	private String linux64x86FileName = ""; //$NON-NLS-1$
	private String darwin32FileName = ""; //$NON-NLS-1$
	private String darwin64FileName = ""; //$NON-NLS-1$

	private boolean pluginProjectSelected;
	private boolean win32FragmentSelected;
	private boolean win64IAFragmentSelected;
	private boolean win64x86FragmentSelected;
	private boolean linux32FragmentSelected;
	private boolean linux64IAFragmentSelected;
	private boolean linux64x86FragmentSelected;
	private boolean darwin32FragmentSelected;
	private boolean darwin64FragmentSelected;
	
	private boolean bundleExportSelected;
	private String exportPath;

	/**
	 * @return the name of the archive file for the Windows 32-bit platform, or
	 *         an empty string if none was selected
	 */
	public String getWin32FileName() {
		return win32FileName;
	}

	/**
	 * @param win32FileName
	 *            the file name to set
	 * @see #getWin32FileName()
	 */
	public void setWin32FileName(String win32FileName) {
		String oldValue = win32FileName;
		this.win32FileName = win32FileName;
		propertyChangeSupport.firePropertyChange("win32FileName", oldValue, win32FileName); //$NON-NLS-1$
	}

	/**
	 * @return the name of the archive file for the Windows 64-bit Itanium
	 *         platform, or an empty string if none was selected
	 */
	public String getWin64IAFileName() {
		return win64IAFileName;
	}

	/**
	 * @param win64IAFileName
	 *            the file name to set
	 * @see #getWin64IAFileName()
	 */
	public void setWin64IAFileName(String win64IAFileName) {
		String oldValue = win64IAFileName;
		this.win64IAFileName = win64IAFileName;
		propertyChangeSupport.firePropertyChange("win64IAFileName", oldValue, win64IAFileName); //$NON-NLS-1$
	}

	/**
	 * @return the name of the archive file for the Windows 64-bit x86 platform,
	 *         or an empty string if none was selected
	 */
	public String getWin64x86FileName() {
		return win64x86FileName;
	}

	/**
	 * @param win64x86FileName
	 *            the file name to set
	 * @see #getWin64x86FileName()
	 */
	public void setWin64x86FileName(String win64x86FileName) {
		String oldValue = win64x86FileName;
		this.win64x86FileName = win64x86FileName;
		propertyChangeSupport.firePropertyChange("win64x86FileName", oldValue, win64x86FileName); //$NON-NLS-1$
	}

	/**
	 * @return the name of the archive file for the Linux 32-bit platform, or an
	 *         empty string if none was selected
	 */
	public String getLinux32FileName() {
		return linux32FileName;
	}

	/**
	 * @param linux32FileName
	 *            the file name to set
	 * @see #getLinux32FileName()
	 */
	public void setLinux32FileName(String linux32FileName) {
		String oldValue = linux32FileName;
		this.linux32FileName = linux32FileName;
		propertyChangeSupport.firePropertyChange("linux32FileName", oldValue, linux32FileName); //$NON-NLS-1$
	}

	/**
	 * @return the name of the archive file for the Linux 64-bit Itanium
	 *         platform, or an empty string if none was selected
	 */
	public String getLinux64IAFileName() {
		return linux64IAFileName;
	}

	/**
	 * @param linux64IAFileName
	 *            the file name to set
	 * @see #getLinux64IAFileName()
	 */
	public void setLinux64IAFileName(String linux64IAFileName) {
		String oldValue = linux64IAFileName;
		this.linux64IAFileName = linux64IAFileName;
		propertyChangeSupport.firePropertyChange("linux64IAFileName", oldValue, linux64IAFileName); //$NON-NLS-1$
	}

	/**
	 * @return the name of the archive file for the Linux 64-bit x86 platform,
	 *         or an empty string if none was selected
	 */
	public String getLinux64x86FileName() {
		return linux64x86FileName;
	}

	/**
	 * @param linux64x86FileName
	 *            the file name to set
	 * @see #getLinux64x86FileName()
	 */
	public void setLinux64x86FileName(String linux64x86FileName) {
		String oldValue = linux64x86FileName;
		this.linux64x86FileName = linux64x86FileName;
		propertyChangeSupport
				.firePropertyChange("linux64x86FileName", oldValue, linux64x86FileName); //$NON-NLS-1$
	}

	/**
	 * @return the name of the archive file for the Darwin x86 platform, or
	 *         an empty string if none was selected
	 */
	public String getDarwin32FileName() {
		return darwin32FileName;
	}

	/**
	 * @param darwin32FileName
	 *            the file name to set
	 * @see #getDarwin32FileName()
	 */
	public void setDarwin32FileName(String darwin32FileName) {
		String oldValue = darwin32FileName;
		this.darwin32FileName = darwin32FileName;
		propertyChangeSupport.firePropertyChange("darwin32FileName", oldValue, //$NON-NLS-1$
				darwin32FileName);
	}

	/**
	 * @return the name of the archive file for the Darwin x86-64 platform, or an
	 *         empty string if none was selected
	 */
	public String getDarwin64FileName() {
		return darwin64FileName;
	}

	/**
	 * @param darwin64FileName
	 *            the file name to set
	 * @see #getDarwin64FileName()
	 */
	public void setDarwin64FileName(String darwin64FileName) {
		String oldValue = darwin64FileName;
		this.darwin64FileName = darwin64FileName;
		propertyChangeSupport.firePropertyChange("darwin64FileName", oldValue, //$NON-NLS-1$
				darwin64FileName);
	}

	/**
	 * @return whether the plugin project is selected
	 */
	public boolean isPluginProjectSelected() {
		return pluginProjectSelected;
	}

	/**
	 * @param pluginProjectSelected
	 *            the pluginProjectSelected to set
	 */
	public void setPluginProjectSelected(boolean pluginProjectSelected) {
		boolean oldValue = pluginProjectSelected;
		this.pluginProjectSelected = pluginProjectSelected;
		propertyChangeSupport.firePropertyChange("pluginProjectSelected", oldValue, //$NON-NLS-1$
				pluginProjectSelected);
	}

	/**
	 * @return whether the win32 fragment is selected
	 */
	public boolean isWin32FragmentSelected() {
		return win32FragmentSelected;
	}

	/**
	 * @param win32FragmentSelected
	 *            whether the win32 fragment is selected to set
	 */
	public void setWin32FragmentSelected(boolean win32FragmentSelected) {
		boolean oldValue = win32FragmentSelected;
		this.win32FragmentSelected = win32FragmentSelected;
		propertyChangeSupport.firePropertyChange("win32FragmentSelected", oldValue, //$NON-NLS-1$
				win32FragmentSelected);
	}

	/**
	 * @return whether the win64IA fragment is selected
	 */
	public boolean isWin64IAFragmentSelected() {
		return win64IAFragmentSelected;
	}

	/**
	 * @param win64IAFragmentSelected
	 *            whether the win64IA fragment is selected to set
	 */
	public void setWin64IAFragmentSelected(boolean win64IAFragmentSelected) {
		boolean oldValue = win64IAFragmentSelected;
		this.win64IAFragmentSelected = win64IAFragmentSelected;
		propertyChangeSupport.firePropertyChange("win64IAFragmentSelected", oldValue, //$NON-NLS-1$
				win64IAFragmentSelected);
	}

	/**
	 * @return whether the win64x86 fragment is selected
	 */
	public boolean isWin64x86FragmentSelected() {
		return win64x86FragmentSelected;
	}

	/**
	 * @param win64x86FragmentSelected
	 *            whether the win64x86 fragment is selected to set
	 */
	public void setWin64x86FragmentSelected(boolean win64x86FragmentSelected) {
		boolean oldValue = win64x86FragmentSelected;
		this.win64x86FragmentSelected = win64x86FragmentSelected;
		propertyChangeSupport.firePropertyChange("win64x86FragmentSelected", oldValue, //$NON-NLS-1$
				win64x86FragmentSelected);
	}

	/**
	 * @return whether the linux32 fragment is selected
	 */
	public boolean isLinux32FragmentSelected() {
		return linux32FragmentSelected;
	}

	/**
	 * @param linux32FragmentSelected
	 *            whether the linux32 fragment is selected to set
	 */
	public void setLinux32FragmentSelected(boolean linux32FragmentSelected) {
		boolean oldValue = linux32FragmentSelected;
		this.linux32FragmentSelected = linux32FragmentSelected;
		propertyChangeSupport.firePropertyChange("linux32FragmentSelected", oldValue, //$NON-NLS-1$
				linux32FragmentSelected);
	}

	/**
	 * @return whether the linux64IA fragment is selected
	 */
	public boolean isLinux64IAFragmentSelected() {
		return linux64IAFragmentSelected;
	}

	/**
	 * @param linux64IAFragmentSelected
	 *            whether the linux64IA fragment is selected to set
	 */
	public void setLinux64IAFragmentSelected(boolean linux64IAFragmentSelected) {
		boolean oldValue = linux64IAFragmentSelected;
		this.linux64IAFragmentSelected = linux64IAFragmentSelected;
		propertyChangeSupport.firePropertyChange("linux64IAFragmentSelected", oldValue, //$NON-NLS-1$
				linux64IAFragmentSelected);
	}

	/**
	 * @return whether the linux64x86 fragment is selected
	 */
	public boolean isLinux64x86FragmentSelected() {
		return linux64x86FragmentSelected;
	}

	/**
	 * @param linux64x86FragmentSelected
	 *            whether the linux64x86 fragment is selected to set
	 */
	public void setLinux64x86FragmentSelected(boolean linux64x86FragmentSelected) {
		boolean oldValue = linux64x86FragmentSelected;
		this.linux64x86FragmentSelected = linux64x86FragmentSelected;
		propertyChangeSupport.firePropertyChange("linux64x86FragmentSelected", oldValue, //$NON-NLS-1$
				linux64x86FragmentSelected);
	}

	/**
	 * @return whether the darwin32 fragment is selected
	 */
	public boolean isDarwin32FragmentSelected() {
		return darwin32FragmentSelected;
	}

	/**
	 * @param darwin32FragmentSelected
	 *            whether the darwin32 fragment is selected to set
	 */
	public void setDarwin32FragmentSelected(boolean darwin32FragmentSelected) {
		boolean oldValue = darwin32FragmentSelected;
		this.darwin32FragmentSelected = darwin32FragmentSelected;
		propertyChangeSupport.firePropertyChange("darwin32FragmentSelected", oldValue, //$NON-NLS-1$
				darwin32FragmentSelected);
	}

	/**
	 * @return whether the darwin64 fragment is selected
	 */
	public boolean isDarwin64FragmentSelected() {
		return darwin64FragmentSelected;
	}

	/**
	 * @param darwin64FragmentSelected
	 *            whether the darwin64 fragment is selected to set
	 */
	public void setDarwin64FragmentSelected(boolean darwin64FragmentSelected) {
		boolean oldValue = darwin64FragmentSelected;
		this.darwin64FragmentSelected = darwin64FragmentSelected;
		propertyChangeSupport.firePropertyChange("darwin64FragmentSelected", oldValue, //$NON-NLS-1$
				darwin64FragmentSelected);
	}

	/**
	 * @return whether bundle export was selected
	 */
	public boolean isBundleExportSelected() {
		return bundleExportSelected;
	}
	
	/**
	 * @param bundleExportSelected the bundleExportSelected to set
	 */
	public void setBundleExportSelected(boolean bundleExportSelected) {
		boolean oldValue = bundleExportSelected;
		this.bundleExportSelected = bundleExportSelected;
		propertyChangeSupport.firePropertyChange("bundleExportSelected", oldValue, //$NON-NLS-1$
				bundleExportSelected);
	}
	
	/**
	 * @return the export path
	 */
	public String getExportPath() {
		return exportPath;
	}
	
	/**
	 * @param exportPath the exportPath to set
	 */
	public void setExportPath(String exportPath) {
		String oldValue = exportPath;
		this.exportPath = exportPath;
		propertyChangeSupport.firePropertyChange("exportPath", oldValue, exportPath); //$NON-NLS-1$
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
	 * @see java.beans.PropertyChangeSupport#addPropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	/**
	 * @return all of the <code>PropertyChangeListeners</code> added or an empty
	 *         array if no listeners have been added
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners()
	 */
	public PropertyChangeListener[] getPropertyChangeListeners() {
		return propertyChangeSupport.getPropertyChangeListeners();
	}

	/**
	 * @param propertyName
	 *            The name of the property being listened to
	 * @return all of the <code>PropertyChangeListeners</code> associated with
	 *         the named property. If no such listeners have been added, or if
	 *         <code>propertyName</code> is null, an empty array is returned.
	 * @see java.beans.PropertyChangeSupport#getPropertyChangeListeners(java.lang.String)
	 */
	public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
		return propertyChangeSupport.getPropertyChangeListeners(propertyName);
	}

	/**
	 * @param propertyName
	 *            the property name.
	 * @return true if there are one or more listeners for the given property
	 * @see java.beans.PropertyChangeSupport#hasListeners(java.lang.String)
	 */
	public boolean hasListeners(String propertyName) {
		return propertyChangeSupport.hasListeners(propertyName);
	}

	/**
	 * @param listener
	 *            The PropertyChangeListener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	/**
	 * @param propertyName
	 *            The name of the property that was listened on.
	 * @param listener
	 *            The PropertyChangeListener to be removed
	 * @see java.beans.PropertyChangeSupport#removePropertyChangeListener(java.lang.String,
	 *      java.beans.PropertyChangeListener)
	 */
	public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(propertyName, listener);
	}

}
