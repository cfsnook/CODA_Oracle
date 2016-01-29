/*******************************************************************************
 * Copyright (c) 2015 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     University of Southampton - initial API and implementation
 *******************************************************************************/

package ac.soton.eventb.emf.oracle.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ac.soton.eventb.emf.oracle.Oracle;
import ac.soton.eventb.emf.oracle.Run;

/**
 * <p>
 *
 * </p>
 *
 * @author htson
 * @version
 * @see
 * @since
 */
public class OracleUtils {

	/**
	 * @param mchRoot
	 */
	public static Resource[] getOracles(IProject project, String mchName,
			TransactionalEditingDomain editingDomain)
			{
		IFolder folder = project.getFolder("Oracle");
		if (folder.exists()) {
			try {
				IResource[] members = folder.members();
				Collection<Resource> resources = new ArrayList<Resource>(
						members.length);
				for (IResource member : members) {
					if (member instanceof IFile) {
						String fileName = member.getName();
						if (fileName.startsWith(mchName + ".test.")
								&& fileName.endsWith(".gold.oracle")) {
							IFile file = (IFile) member;
							IPath path = new Path("platform:/resource");
							path = path.append(file.getFullPath());
							URI uri = URI.createURI(path.toString());
							ResourceSet rset = editingDomain.getResourceSet();
							Resource resource = rset.getResource(uri, true);
							resources.add(resource);
						}
					}
				}
				return resources.toArray(new Resource[resources.size()]);
			} catch (CoreException e) {
				e.printStackTrace();
				return new Resource[0];
			}
		} else {
			return new Resource[0];
		}

	}

	/**
	 * Returns a run from the given resource or <code>null</code>.
	 * 
	 * @param resource
	 *            a given resource
	 * 
	 * @return a run from the resource of <code>null</code>
	 */
	public static Run loadRun(Resource resource) throws IOException {
		resource.load(Collections.EMPTY_MAP);
		EList<EObject> contents = resource.getContents();
		for (EObject content : contents) {
			if (content instanceof Oracle) {
				for (Run run : ((Oracle) content).getRuns()) {
					return run;
				}
			}
		}
		return null;
	}

}
