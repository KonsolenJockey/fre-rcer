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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.tools.tar.TarEntry;
import org.apache.tools.tar.TarInputStream;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.PluginModelManager;
import org.eclipse.pde.internal.core.exports.FeatureExportInfo;
import org.eclipse.pde.internal.ui.PDEPluginImages;
import org.eclipse.pde.internal.ui.build.PluginExportJob;
import org.eclipse.ui.progress.IProgressConstants;

/**
 * The runnable that performs the actual project generation.
 * @author vwegert
 *
 */
@SuppressWarnings("restriction")
public class ProjectGenerator implements IRunnableWithProgress {

	/**
	 * The ID of the plug-in project nature as used by the PDE. 
	 */
	public static final String PLUGIN_NATURE_ID = "org.eclipse.pde.PluginNature";
	
	private ProjectGeneratorSettings settings;
	private IWorkspaceRoot workspaceRoot;
	private ArrayList<IPluginModelBase> exportableBundles = new ArrayList<IPluginModelBase>();
	private PluginModelManager modelManager;

	/**
	 * Default constructor.
	 * @param generatorSettings
	 */
	public ProjectGenerator(ProjectGeneratorSettings generatorSettings) {
		this.settings = generatorSettings;
		workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		modelManager = PDECore.getDefault().getModelManager();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void run(IProgressMonitor monitor) throws InvocationTargetException,	InterruptedException {

		exportableBundles.clear();
		
		monitor.beginTask("Importing the SAP Java Connector", getNumberOfSteps());

		try {
			if (settings.isPluginProjectSelected()) {
				// choose the source file for the sapjco.jar from the selected files
				if (settings.isWin32FragmentSelected()) {
					createPluginProject(monitor, settings.getWin32FileName(), IProjectNames.PLUGIN_JCO);
				} else if (settings.isWin64IAFragmentSelected())  {
					createPluginProject(monitor, settings.getWin64IAFileName(), IProjectNames.PLUGIN_JCO);
				} else if (settings.isWin64x86FragmentSelected())  {
					createPluginProject(monitor, settings.getWin64x86FileName(), IProjectNames.PLUGIN_JCO);
				} else if (settings.isLinux32FragmentSelected())  {
					createPluginProject(monitor, settings.getLinux32FileName(), IProjectNames.PLUGIN_JCO);
				} else if (settings.isLinux64IAFragmentSelected())  {
					createPluginProject(monitor, settings.getLinux64IAFileName(), IProjectNames.PLUGIN_JCO);
				} else if (settings.isLinux64x86FragmentSelected())  {
					createPluginProject(monitor, settings.getLinux64x86FileName(), IProjectNames.PLUGIN_JCO);
				} else if (settings.isDarwin32FragmentSelected())  {
					createPluginProject(monitor, settings.getDarwin32FileName(), IProjectNames.PLUGIN_JCO);
				} else if (settings.isDarwin64FragmentSelected())  {
					createPluginProject(monitor, settings.getDarwin64FileName(), IProjectNames.PLUGIN_JCO);
				} else {
					throw new InvocationTargetException(null, "No input file was selected - should never have happened.");
				}
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			/*
			 * See http://www.osgi.org/Specifications/Reference for a list of arch aliases
			 * specified by OSGi.
			 */
			
			if (settings.isWin32FragmentSelected()) {
				createFragmentProject(monitor, settings.getWin32FileName(), 
						IProjectNames.FRAGMENT_WINDOWS_32,
						"sapjco3.dll", "Windows (32-bit)", "(& (osgi.os=win32) (osgi.arch=x86))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			if (settings.isWin64IAFragmentSelected())  {
				createFragmentProject(monitor, settings.getWin64IAFileName(), 
						IProjectNames.FRAGMENT_WINDOWS_64IA,
						"sapjco3.dll", "Windows (64-bit Itanium)", "(& (osgi.os=win32) (osgi.arch=ia64n))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			if (settings.isWin64x86FragmentSelected())  {
				createFragmentProject(monitor, settings.getWin64x86FileName(), 
						IProjectNames.FRAGMENT_WINDOWS_64X86,
						"sapjco3.dll", "Windows (64-bit x86)", "(& (osgi.os=win32) (osgi.arch=x86-64))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			if (settings.isLinux32FragmentSelected())  {
				createFragmentProject(monitor, settings.getLinux32FileName(), 
						IProjectNames.FRAGMENT_LINUX_32,
						"libsapjco3.so", "Linux (32-bit)", "(& (osgi.os=linux) (osgi.arch=x86))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			if (settings.isLinux64IAFragmentSelected())  {
				createFragmentProject(monitor, settings.getLinux64IAFileName(), 
						IProjectNames.FRAGMENT_LINUX_64IA,
						"libsapjco3.so", "Linux (64-bit Itanium)", "(& (osgi.os=linux) (osgi.arch=ia64n))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			if (settings.isLinux64x86FragmentSelected())  {
				createFragmentProject(monitor, settings.getLinux64x86FileName(), 
						IProjectNames.FRAGMENT_LINUX_64X86,
						"libsapjco3.so", "Linux (64-bit x86)", "(& (osgi.os=linux) (osgi.arch=x86-64))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			if (settings.isDarwin32FragmentSelected())  {
				createFragmentProject(monitor, settings.getDarwin32FileName(), 
						IProjectNames.FRAGMENT_DARWIN_32,
						"libsapjco3.jnilib", "OS X (32-bit Intel)", "(& (osgi.os=macosx) (osgi.arch=x86))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();

			if (settings.isDarwin64FragmentSelected())  {
				createFragmentProject(monitor, settings.getDarwin64FileName(), 
						IProjectNames.FRAGMENT_DARWIN_64,
						"libsapjco3.jnilib", "OS X (64-bit Intel)", "(& (osgi.os=macosx) (osgi.arch=x86-64))");
			}
			if (monitor.isCanceled()) throw new InterruptedException();
			
			if (settings.isBundleExportSelected()) {
				exportPlugins(monitor);
			}
			
		} catch (CoreException e) {
			throw new InvocationTargetException(e);
		} catch (IOException e) {
			throw new InvocationTargetException(e);
		} finally {
			monitor.done();
		}

	}

	/**
	 * Creates a plug-in project for the SAP JCo from the source file specified.
	 * @param monitor
	 * @param sourceFileName
	 * @param pluginName
	 * @throws CoreException 
	 * @throws IOException 
	 */
	private void createPluginProject(IProgressMonitor monitor, String sourceFileName, String pluginName) throws CoreException, IOException {
		monitor.subTask(MessageFormat.format("Creating plug-in project {0}...", pluginName));

		// read the source file                                                                              10
		final Map<String, byte[]> files = readArchiveFile(sourceFileName);
		monitor.worked(10);                                                

		// remove the project if it exists                                                                    5
		IProject project = workspaceRoot.getProject(pluginName);
		if (project.exists()) {
			project.delete(true, true, new SubProgressMonitor(monitor, 5));
		} else {
			monitor.worked(5);
		}

		// create and open the project                                                                       10
		project.create(new SubProgressMonitor(monitor, 5));
		project.open(new SubProgressMonitor(monitor, 5));

		// update the project description                                                                     5
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] {	JavaCore.NATURE_ID, PLUGIN_NATURE_ID });
		project.setDescription(description, new SubProgressMonitor(monitor, 5));

		// set the basic Java project properties                                                              5
		IJavaProject javaProject = JavaCore.create(project);
		IFolder binDir = project.getFolder("bin");
		IPath binPath = binDir.getFullPath();
		javaProject.setOutputLocation(binPath, new SubProgressMonitor(monitor, 5));

		// create empty jni folder                                                                            5
		project.getFolder("jni").create(true, true, new SubProgressMonitor(monitor, 5));

		// copy sapjco3.jar                                                                                  10
		project.getFile("sapjco3.jar").create(new ByteArrayInputStream(files.get("sapjco3.jar")), 
				true, new SubProgressMonitor(monitor, 10));

		// create META-INF and MANIFEST.MF                                                                   10
		// TODO use the version information from the MANIFEST.MF file in the archive
		IFolder metaInfFolder = project.getFolder("META-INF");
		metaInfFolder.create(true, true, new SubProgressMonitor(monitor, 5));
		StringBuilder manifest = new StringBuilder();
		manifest.append("Manifest-Version: 1.0\n");
		manifest.append("Bundle-ManifestVersion: 2\n");
		manifest.append("Bundle-Name: SAP Java Connector v3\n"); 
		manifest.append(MessageFormat.format("Bundle-SymbolicName: {0}\n", pluginName));
		manifest.append("Bundle-Version: 7.11.0\n");
		manifest.append("Bundle-ClassPath: bin/,\n");
		manifest.append(" sapjco3.jar,\n");
		manifest.append(" jni/\n");
		manifest.append("Bundle-Vendor: SAP AG, Walldorf (packaged using RCER)\n");
		manifest.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");
		manifest.append("Export-Package: com.sap.conn.jco,\n");
		manifest.append(" com.sap.conn.jco.ext,\n");
		manifest.append(" com.sap.conn.jco.monitor,\n");
		manifest.append(" com.sap.conn.jco.server\n");
		manifest.append("Bundle-ActivationPolicy: lazy\n");
		writeTextFile(monitor, manifest, metaInfFolder.getFile("MANIFEST.MF"));

		// set classpath                                                                                      5
		final IPath jcoPath = new Path(MessageFormat.format("/{0}/sapjco3.jar", pluginName));
		IClasspathEntry jcoEntry = JavaCore.newLibraryEntry(jcoPath, Path.EMPTY, Path.EMPTY, true);
		final IPath jniPath = new Path(MessageFormat.format("/{0}/jni", pluginName));
		IClasspathEntry jniEntry = JavaCore.newLibraryEntry(jniPath, Path.EMPTY, Path.EMPTY, true);
		javaProject.setRawClasspath(new IClasspathEntry[] { jcoEntry, jniEntry }, new SubProgressMonitor(monitor, 5));

		// create build.properties                                                                            5
		StringBuilder buildProperties = new StringBuilder();
		buildProperties.append("bin.includes = META-INF/,\\\n");
		buildProperties.append("               sapjco3.jar,\\\n");
		buildProperties.append("               jni/,\\\n");
		buildProperties.append("               .\n");
		writeTextFile(monitor, buildProperties, project.getFile("build.properties"));
		
		// collect the plug-in for export
		exportableBundles.add(modelManager.findModel(project));
	}

	/**
	 * Creates a fragment project from the source file specified.
	 * @param monitor 
	 * @param sourceFileName 
	 * @param fragmentName 
	 * @param nativeLibraryFilename 
	 * @param platformName 
	 * @param platformFilter 
	 * @throws CoreException 
	 * @throws IOException 
	 */
	private void createFragmentProject(IProgressMonitor monitor, String sourceFileName, 
			String fragmentName, String nativeLibraryFilename, String platformName, String platformFilter) 
	throws CoreException, IOException {
		monitor.subTask(MessageFormat.format("Creating fragment project {0}...", fragmentName));

		// read the source file                                                                              10
		final Map<String, byte[]> files = readArchiveFile(sourceFileName);
		monitor.worked(10);
		
		// remove the project if it exists                                                                    5
		IProject project = workspaceRoot.getProject(fragmentName);
		if (project.exists()) {
			project.delete(true, true, new SubProgressMonitor(monitor, 5));
		} else {
			monitor.worked(5);
		}

		// create and open the project                                                                       10
		project.create(new SubProgressMonitor(monitor, 5));
		project.open(new SubProgressMonitor(monitor, 5));

		// update the project description                                                                     5
		IProjectDescription description = project.getDescription();
		description.setNatureIds(new String[] {	PLUGIN_NATURE_ID });
		project.setDescription(description, new SubProgressMonitor(monitor, 5));

		// create jni folder                                                                                  5
		IFolder jniFolder = project.getFolder("jni");
		jniFolder.create(true, true, new SubProgressMonitor(monitor, 5));

		// copy native library file                                                                          10
		jniFolder.getFile(nativeLibraryFilename).create(new ByteArrayInputStream(files.get(nativeLibraryFilename)), 
				true, new SubProgressMonitor(monitor, 10));

		// create META-INF and MANIFEST.MF                                                                   10
		// TODO use the version information from the MANIFEST.MF file in the archive
		IFolder metaInfFolder = project.getFolder("META-INF");
		metaInfFolder.create(true, true, new SubProgressMonitor(monitor, 5));
		StringBuilder manifest = new StringBuilder();
		manifest.append("Manifest-Version: 1.0\n");
		manifest.append("Bundle-ManifestVersion: 2\n");
		manifest.append(MessageFormat.format("Bundle-Name: SAP Java Connector v3 - Native Libraries for {0}\n", platformName)); 
		manifest.append(MessageFormat.format("Bundle-SymbolicName: {0}\n", fragmentName));
		manifest.append("Bundle-Version: 7.11.0\n");
		manifest.append("Bundle-Vendor: SAP AG, Walldorf (packaged using RCER)\n");
		manifest.append("Fragment-Host: com.sap.conn.jco;bundle-version=\"7.11.0\"\n"); 
		manifest.append("Bundle-RequiredExecutionEnvironment: J2SE-1.5\n");
		manifest.append(MessageFormat.format("Bundle-NativeCode: jni/{0}\n", nativeLibraryFilename));
		manifest.append(MessageFormat.format("Eclipse-PlatformFilter: {0}\n", platformFilter));
		writeTextFile(monitor, manifest, metaInfFolder.getFile("MANIFEST.MF"));
		
		// create build.properties                                                                            5
		StringBuilder buildProperties = new StringBuilder();
		buildProperties.append("bin.includes = META-INF/,\\\n");
		buildProperties.append("               jni/\n");
		writeTextFile(monitor, buildProperties, project.getFile("build.properties"));

		// collect the fragment for export
		exportableBundles.add(modelManager.findModel(project));
	}

	/**
	 * Exports the generated plug-ins and fragments to the selected location.
	 * @param monitor
	 */
	private void exportPlugins(IProgressMonitor monitor) {
		FeatureExportInfo info = new FeatureExportInfo();
		info.toDirectory = true;
		info.useJarFormat = true;
		info.exportSource = false;
		info.destinationDirectory = settings.getExportPath();
		info.items = exportableBundles.toArray();
		PluginExportJob job = new PluginExportJob(info);
		job.setUser(true);
		job.schedule();
		job.setProperty(IProgressConstants.ICON_PROPERTY, PDEPluginImages.DESC_PLUGIN_OBJ);
	}
	
	/**
	 * Auxiliary method to dump a {@link StringBuilder} to a file. 
	 * @param monitor
	 * @param source
	 * @param file
	 * @throws CoreException
	 */
	private void writeTextFile(IProgressMonitor monitor, StringBuilder source, IFile file) throws CoreException {
		file.create(new ByteArrayInputStream(source.toString().getBytes()), true, new SubProgressMonitor(monitor, 5));	
	}
	
	/**
	 * @return the estimated number of steps
	 */
	private int getNumberOfSteps() {
		final int PLUGIN_STEPS = 70;
		final int FRAGMENT_STEPS = 60;
		int steps = 0;
		if (settings.isPluginProjectSelected())         steps += PLUGIN_STEPS;
		if (settings.isWin32FragmentSelected())         steps += FRAGMENT_STEPS;
		if (settings.isWin64IAFragmentSelected())       steps += FRAGMENT_STEPS;
		if (settings.isWin64x86FragmentSelected())      steps += FRAGMENT_STEPS;
		if (settings.isLinux32FragmentSelected())       steps += FRAGMENT_STEPS;
		if (settings.isLinux64IAFragmentSelected())     steps += FRAGMENT_STEPS;
		if (settings.isLinux64x86FragmentSelected())    steps += FRAGMENT_STEPS;
		if (settings.isDarwin32FragmentSelected())      steps += FRAGMENT_STEPS;
		if (settings.isDarwin64FragmentSelected())      steps += FRAGMENT_STEPS;
		return steps;
	}

	/**
	 * Reads an archive file into memory, guessing its type according to its extension.
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	private Map<String, byte[]> readArchiveFile(String filename) throws IOException {
		if (filename.toLowerCase().endsWith(".zip")) {
			return readZIPFile(filename);
		} else if (filename.toLowerCase().endsWith(".tgz")) {
			return readTGZFile(filename);
		} else if (filename.toLowerCase().endsWith(".tar.gz")) {
			return readTGZFile(filename);
		} else {
			throw new UnsupportedOperationException(MessageFormat.format("Unknown file type: {0}", filename));
		}
	}
	
	/**
	 * Reads a .tgz or .tar.gz file into memory.
	 * @param filename
	 * @return
	 * @throws IOException 
	 */
	private Map<String, byte[]> readTGZFile(String filename) throws IOException {
		HashMap<String, byte[]> result = new HashMap<String, byte[]>();
		TarInputStream tin = new TarInputStream(new GZIPInputStream(new FileInputStream(new File(filename))));
		TarEntry tarEntry = tin.getNextEntry();     
		while (tarEntry != null) {  
			if (!tarEntry.isDirectory()) {
				// tar.getName()
				ByteArrayOutputStream os = new ByteArrayOutputStream();
				tin.copyEntryContents(os);   
				os.close();
				result.put(tarEntry.getName(), os.toByteArray());
			}
			tarEntry = tin.getNextEntry(); 
		}    
		tin.close();
		return result;
	}

	/**
	 * Reads a .zip file into memory.
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	private Map<String, byte[]> readZIPFile(String filename) throws IOException {
		HashMap<String, byte[]> result = new HashMap<String, byte[]>();
        byte[] buf = new byte[32 * 1024];
		ZipFile file = new ZipFile(new File(filename));
		Enumeration<? extends ZipEntry> entries = file.entries();
		while (entries.hasMoreElements()) {
			ZipEntry entry = entries.nextElement();
			InputStream is = file.getInputStream(entry);
			ByteArrayOutputStream os = new ByteArrayOutputStream();
	        while (true) {
	            int numRead = is.read(buf, 0, buf.length);
	            if (numRead == -1) {
	                break;
	            }
	            os.write(buf, 0, numRead);
	        }
	        is.close();
	        os.close();
	        result.put(entry.getName(), os.toByteArray());
		}
		file.close();
		return result;
	}

}
