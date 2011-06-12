package org.eclipse.twig.ui.preferences;

import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class TwigBasePreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	public TwigBasePreferencePage() {

		super();
		setPreferenceStore(DLTKUIPlugin.getDefault().getPreferenceStore());
		setDescription("Twig");
	}

	public TwigBasePreferencePage(String title) {
		super(title);

	}

	public TwigBasePreferencePage(String title, ImageDescriptor image) {
		super(title, image);

	}

	@Override
	public void init(IWorkbench workbench) {


	}

	@Override
	protected Control createContents(Composite parent) {

		initializeDialogUnits(parent);
		
		Composite result = new Composite(parent, SWT.NONE);
		
		GridLayout layout = new GridLayout();
		layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
		layout.marginWidth = 0;
		layout.verticalSpacing = convertVerticalDLUsToPixels(10);
		layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
		result.setLayout(layout);
		
		
		return result;
	}

}
