package com.tetrade.eclipse.plugins.easyshell.preferences;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class PreferencePagePresets extends PreferencePage implements IWorkbenchPreferencePage {

    public PreferencePagePresets() {
        // TODO Auto-generated constructor stub
    }

    public PreferencePagePresets(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    public PreferencePagePresets(String title, ImageDescriptor image) {
        super(title, image);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(IWorkbench workbench) {
        // TODO Auto-generated method stub

    }

    @Override
    protected Control createContents(Composite parent) {
        // TODO Auto-generated method stub
        return null;
    }

}