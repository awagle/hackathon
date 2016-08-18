package com.tibco.bw.palette.jira.design.create;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.design.util.ModelHelper;
import com.tibco.bw.design.util.ProcessProperty;
import com.tibco.bw.palette.jira.model.jiraPalette.Create;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPaletteFactory;

public class JIRACreateModelHelper extends BWAbstractModelHelper {

	QName HTTP_QNAME = new QName("http://xsd.tns.tibco.com/bw/models/sharedresource/httpclient", "HttpClientConfiguration");


	public JIRACreateModelHelper() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public EObject createInstance() {
		Create instance = JiraPaletteFactory.eINSTANCE.createCreate();
		return instance;
	}



	@Override
	public void setProcessProperty(EObject model, Object container) {
		if (model == null) {
			return;
		}
		if (container == null) {
			return;
		}
		boolean found = false;
		for (ProcessProperty property : ModelHelper.INSTANCE.getProperties(container)) {
			if (ModelHelper.INSTANCE.isEqual(property.getType(), HTTP_QNAME)) {
				((Create) model).setConnection(property.getName());
				found = true;
				break;
			}
		}

		if (!found) {
			ProcessProperty property = ModelHelper.INSTANCE.createProperty(container, "jiraProperty", HTTP_QNAME, "");
			if (property != null) {
				((Create) model).setConnection(property.getName());
			}
		}
	}

}
