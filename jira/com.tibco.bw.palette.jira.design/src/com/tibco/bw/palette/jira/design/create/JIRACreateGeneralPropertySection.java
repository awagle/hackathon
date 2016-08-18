package com.tibco.bw.palette.jira.design.create;

import javax.xml.namespace.QName;

import org.eclipse.swt.widgets.Composite;

import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.field.PropertyField;
import com.tibco.bw.design.field.viewer.CustomComboViewer;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.design.util.BWDesignConstants;
import com.tibco.bw.palette.jira.model.jiraPalette.Create;
import com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage;

public class JIRACreateGeneralPropertySection extends
AbstractBWTransactionalSection {
	QName HTTP_QNAME = new QName("http://xsd.tns.tibco.com/bw/models/sharedresource/httpclient", "HttpClientConfiguration");
	private PropertyField propField;
	private CustomComboViewer issueTypeField;

	public JIRACreateGeneralPropertySection() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initBindings() {
		getBindingManager().bind(propField, JiraPalettePackage.Literals.CREATE__CONNECTION, getInput(), 
				BWFieldFactory.getInstance().getPropertyTargetToModelUpdateValueStrategy(), null);

		getBindingManager().bindCustomViewer(issueTypeField, getInput(), JiraPalettePackage.Literals.CREATE__ISSUE_TYPE);

	}

	@Override
	protected Composite doCreateControl(Composite root) {
		Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
		BWFieldFactory.getInstance().createLabel(parent, "Connection", true);
		propField = BWFieldFactory.getInstance().createPropertyField(parent, BWDesignConstants.PROPERTY, HTTP_QNAME);

		BWFieldFactory.getInstance().createLabel(parent, "IssueType", true);
		issueTypeField = BWFieldFactory.getInstance().createComboViewer(parent);
		issueTypeField.setContentProvider(new EnumeratorContentProvider());
		issueTypeField.setInput(IssueTypes.class);
		return parent;
	}

	@Override
	protected Class<?> getModelClass() {
		return Create.class;
	}

}
