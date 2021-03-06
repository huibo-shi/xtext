/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui.examples;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.wizard.ExampleInstallerWizard;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

/**
 * If no explicit editorID is given in the extension definition, the IDE tries to find
 * the best editor (which may be an external editor).
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class ExternalEditorAwareExampleInstallerWizard extends ExampleInstallerWizard {

	@Override
	protected void openEditor(IFile file, String editorID) throws PartInitException {
		if (editorID == null) {
			IWorkbenchPage page = getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IDE.openEditor(page, file);
		} else {
			super.openEditor(file, editorID);
		}
	}
	
}
