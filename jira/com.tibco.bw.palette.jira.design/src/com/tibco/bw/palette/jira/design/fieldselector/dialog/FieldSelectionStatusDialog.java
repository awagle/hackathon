package com.tibco.bw.palette.jira.design.fieldselector.dialog;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionStatusDialog;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.palette.jira.design.Activator;
import com.tibco.bw.palette.jira.design.fieldselector.model.CustomField;
import com.tibco.bw.palette.jira.design.preferences.PreferenceConstants;
import com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPaletteFactory;

public class FieldSelectionStatusDialog extends SelectionStatusDialog {

	String host;
	int port;
	URL uri;
	private Text username;
	private Text password; 

	ArrayList<JIRACustomField> result = new ArrayList<>();
	List<JIRACustomField> existingFields = null;

	public FieldSelectionStatusDialog(Shell parent, String host,int port,String endpointUrl,List<JIRACustomField> existingFields) {
		super(parent);
		this.host = host;
		this.port = port;
		this.existingFields = existingFields;
		String scheme = "http://";
		if(port  == 443){
			scheme = "https://";
		}
		try {
			uri = new URL(scheme + host +":" + port + endpointUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayoutData(data);
		Composite tableComposite = BWFieldFactory.getInstance().createComposite(root, 1);
		final Table table = new Table (tableComposite, SWT.CHECK | SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		data.heightHint = 300;
		table.setLayoutData(data);
		final String[] titles = {"Label","Field Id"};

		Composite userPass = new Composite(tableComposite,SWT.NONE);
		userPass.setLayout(new FillLayout());
		Label usernameLabel = new Label(userPass, SWT.BOLD);
		usernameLabel.setText("Username");
		username = new Text(userPass, SWT.SINGLE);
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String prefUsername = store.getString(PreferenceConstants.P_USER);
		if(prefUsername != null){
			username.setText(prefUsername);
		}
		Label passLabel = new Label(userPass, SWT.BOLD);
		passLabel.setText("Password");
		password = new Text(userPass, SWT.PASSWORD);
		String prefPassword = store.getString(PreferenceConstants.P_PASSWORD);
		if(prefPassword != null){
			password.setText(prefPassword);
		}
		Button get = BWFieldFactory.getInstance().createButton(userPass, "GetFields", "", null);
		get.addSelectionListener(new SelectionAdapter() {
			private ArrayList<CustomField> pojoFieldModels;

			@Override
			public void widgetSelected(SelectionEvent e) {
				try {
					table.removeAll();
					result.clear();
					pojoFieldModels.clear();
					pojoFieldModels = getFields();
					for (CustomField customField : pojoFieldModels) {
						TableItem item = new TableItem (table, SWT.NONE);
						item.setText (0, customField.getName());
						item.setText (1, customField.getId());
					}
					for (int i=0; i<titles.length; i++) {
						table.getColumn (i).pack ();
					}	
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		if(existingFields.size() > 0){
			for (JIRACustomField field : existingFields) {
				TableItem item = new TableItem (table, SWT.NONE);
				item.setText (0, field.getLabel());
				item.setText (1, field.getId());
			}
		}

		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (table, SWT.NONE);
			column.setWidth(100);
			column.setText (titles [i]);
		}	

		table.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if(e.item instanceof TableItem){
					TableItem source = (TableItem)e.item;
					JIRACustomField field = JiraPaletteFactory.eINSTANCE.createJIRACustomField();
					field.setLabel(source.getText(1));
					field.setId(source.getText(0));
					result.add(field);
				}
			}

		});
		return parent;
	}

	private ArrayList<CustomField> getFields(){
		if(uri != null){
			HttpURLConnection connection = null;
			try{
				connection = (HttpURLConnection)uri.openConnection();
				connection.setRequestMethod("GET");
				connection.setRequestProperty("Accept", "application/json");
				String authString = username.getText() + ":" + password.getText();
				byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
				String authStringEnc = new String(authEncBytes);;
				connection.setRequestProperty("Authorization", "Basic " + authStringEnc);
				connection.connect();
				InputStream is = connection.getInputStream();
				if(is.available() <= 0){
					connection.disconnect();
					return null;
				}
				final BufferedReader reader = new BufferedReader(new InputStreamReader(is));
				Type collectionType = new TypeToken<ArrayList<CustomField>>(){}.getType();

				String line = null;
				StringBuffer buffer = new StringBuffer();
				while((line = reader.readLine()) != null) {
					buffer.append(line);
				}  
				System.out.println(buffer.toString());
				Gson gson = new Gson();
				Object obj = gson.fromJson(buffer.toString(), collectionType);
				System.out.println(obj.toString());
				return (ArrayList<CustomField>) obj;
			}
			catch (Exception e){
			}
			finally{
				if(connection != null) {
					connection.disconnect();
				}
			}
		}
		return null;
	}

	@Override
	protected void computeResult() {
		// TODO Auto-generated method stub
	}

	public ArrayList<JIRACustomField> getFieldsList(){
		return result;
	}

}
