package com.tibco.bw.palette.jira.design.fieldselector.dialog;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionStatusDialog;

public class FieldSelectionStatusDialog extends SelectionStatusDialog {

	public FieldSelectionStatusDialog(Shell parent) {
		super(parent);
	}

	public FieldSelectionStatusDialog(Shell parent, String host,int port) {
		super(parent);
	}
	@Override
	protected void computeResult() {
		// TODO Auto-generated method stub

	}

}
