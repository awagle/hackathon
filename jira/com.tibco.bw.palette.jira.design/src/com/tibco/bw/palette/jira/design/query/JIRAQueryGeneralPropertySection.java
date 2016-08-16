package com.tibco.bw.palette.jira.design.query;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.field.PropertyField;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.design.util.BWDesignConstants;
import com.tibco.bw.design.util.ModelHelper;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage;
import com.tibco.bw.palette.jira.model.jiraPalette.Query;
import com.tibco.bw.sharedresource.httpclient.model.httpclient.HttpClientConfiguration;

public class JIRAQueryGeneralPropertySection extends
AbstractBWTransactionalSection {
	QName HTTP_QNAME = new QName("http://xsd.tns.tibco.com/bw/models/sharedresource/httpclient", "HttpClientConfiguration");
	private PropertyField propField;
	private Text textField;

	public JIRAQueryGeneralPropertySection() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initBindings() {
		getBindingManager().bind(propField, JiraPalettePackage.Literals.QUERY__CONNECTION, getInput(), 
				BWFieldFactory.getInstance().getPropertyTargetToModelUpdateValueStrategy(), null);

		getBindingManager().bind(textField, getInput(), JiraPalettePackage.Literals.QUERY__EXPAND_NAMES);

	}

	@Override
	protected Composite doCreateControl(Composite root) {
		Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
		BWFieldFactory.getInstance().createLabel(parent, "Connection", true);
		propField = BWFieldFactory.getInstance().createPropertyField(parent, BWDesignConstants.PROPERTY, HTTP_QNAME);

		BWFieldFactory.getInstance().createLabel(parent, "OutputFields", true);
		textField = BWFieldFactory.getInstance().createTextBox(parent);

		Button lookupFields = BWFieldFactory.getInstance().createButton(parent, "Pick Fields", "Connect to the JIRA instance to pick fields", null);
		lookupFields.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Widget selected");
				try{
					Query model = (Query)getInput();
					String value = ModelHelper.INSTANCE.getProperty(getInput(), model.getConnection()).getDefaultValue();
					EObject srConfig = ModelHelper.INSTANCE.getSharedResourceConfiguration(getInput(), value);
					if(srConfig instanceof HttpClientConfiguration){
						HttpClientConfiguration sharedConfig = (HttpClientConfiguration) srConfig;
						String host = sharedConfig.getTcpDetails().getHost();
						int port = sharedConfig.getTcpDetails().getPort();
					}
				} catch (Exception ex){
					ex.printStackTrace();
				}
			}

		});
		return parent;
	}

	@Override
	protected Class<?> getModelClass() {
		return Query.class;
	}

}
