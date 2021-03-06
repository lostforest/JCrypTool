//-----BEGIN DISCLAIMER-----
/*******************************************************************************
* Copyright (c) 2010 JCrypTool Team and Contributors
*
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
//-----END DISCLAIMER-----
package org.jcryptool.core.preferences.pages;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.PlatformUI;
import org.jcryptool.core.CorePlugin;

/**
 * The start page for all <b>Algorithms</b> preference pages.
 *
 * @author Dominik Schadow
 * @version 0.6.0
 */
public class AlgorithmsPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
    public AlgorithmsPage() {
        super(GRID);
        setPreferenceStore(CorePlugin.getDefault().getPreferenceStore());
        setDescription(Messages.AlgorithmsPage_0);
    }

    @Override
    public void createControl(Composite parent) {
        super.createControl(parent);

        PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "org.jcryptool.core.algorithmsPreferences"); //$NON-NLS-1$
    }

    @Override
    protected void createFieldEditors() {
    }

    public void init(IWorkbench workbench) {
    }
}
