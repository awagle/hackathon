package com.tibco.bw.palette.jira.design.query;

import javax.xml.namespace.QName;

import org.eclipse.swt.widgets.Composite;

import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.design.util.BWDesignConstants;
import com.tibco.bw.palette.jira.model.jiraPalette.Query;

public class JIRAQueryGeneralPropertySection extends
AbstractBWTransactionalSection {
	QName HTTP_QNAME = new QName("{http://xsd.tns.tibco.com/bw/models/sharedresource/httpclient}", "HttpClientConfiguration");

	public JIRAQueryGeneralPropertySection() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initBindings() {
		// TODO Auto-generated method stub

	}

	@Override
	protected Composite doCreateControl(Composite root) {
		// TODO Auto-generated method stub
		Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
		BWFieldFactory.getInstance().createLabel(parent, "Connection", true);
		BWFieldFactory.getInstance().createPropertyField(parent, BWDesignConstants.PROPERTY, HTTP_QNAME);

		BWFieldFactory.getInstance().createLabel(parent, "OutputFields", true);
		BWFieldFactory.getInstance().createTextBox(parent);
		return parent;
	}

	@Override
	protected Class<?> getModelClass() {
		return Query.class;
	}

}
