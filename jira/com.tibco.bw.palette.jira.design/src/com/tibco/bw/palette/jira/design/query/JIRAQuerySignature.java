package com.tibco.bw.palette.jira.design.query;

import java.util.List;

import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDSchema;

import com.tibco.bw.design.api.BWActivitySignature;
import com.tibco.bw.design.api.BWActivitySignatureUnknown;
import com.tibco.bw.design.util.XSDUtility;
import com.tibco.bw.model.activityconfig.Configuration;
import com.tibco.bw.palette.jira.design.utils.FieldsXSDUtility;
import com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField;
import com.tibco.bw.palette.jira.model.jiraPalette.Query;

public class JIRAQuerySignature extends BWActivitySignature {

	protected final static String TARGET_NS = "http://www.tibco.com/namespaces/tnt/plugins/jira"; 

	public JIRAQuerySignature() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<XSDElementDeclaration> getFaultTypes(Configuration config)
			throws BWActivitySignatureUnknown {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XSDElementDeclaration getInputType(Configuration config)
			throws BWActivitySignatureUnknown {
		String namespace = createNamespace(new Object[] { TARGET_NS, config,
		"input" });
		XSDSchema schema = XSDUtility.createSchema(namespace);
		XSDElementDeclaration retVal = null;
		XSDModelGroup inputGroup = XSDUtility.addAnonymousComplexTypeElement(schema, getInputTypeRootName(), XSDCompositor.SEQUENCE_LITERAL);

		XSDUtility.addSimpleTypeElement(inputGroup, "jql", "string", 1, 1);
		XSDUtility.addSimpleTypeElement(inputGroup, "timeout", "long", 0, 1);
		XSDUtility.addSimpleTypeElement(inputGroup, "limit", "long", 0, 1);
		schema = compileSchema(schema);
		retVal = schema.resolveElementDeclaration(getInputTypeRootName());
		return retVal;
	}

	@Override
	public XSDElementDeclaration getOutputType(Configuration config)
			throws BWActivitySignatureUnknown {
		String namespace = createNamespace(new Object[] { TARGET_NS, config,
		"output" });
		XSDSchema schema = XSDUtility.createSchema(namespace);
		XSDElementDeclaration retVal = null;
		XSDModelGroup inputGroup = XSDUtility.addAnonymousComplexTypeElement(schema, getOutputTypeRootName(), XSDCompositor.SEQUENCE_LITERAL);
		XSDModelGroup issues = XSDUtility.addAnonymousComplexTypeElement(inputGroup, "Issues", 0, 1, XSDCompositor.SEQUENCE_LITERAL);
		XSDModelGroup issue = XSDUtility.addAnonymousComplexTypeElement(issues, "issue", 0, -1, XSDCompositor.SEQUENCE_LITERAL);

		Query model = (Query) getDefaultEMFConfigObject(config);
		for (JIRACustomField field : model.getCustomFields()) {
			FieldsXSDUtility.createElementForField(issue, field);
		}
		schema = compileSchema(schema);
		retVal = schema.resolveElementDeclaration(getOutputTypeRootName());
		return retVal;
	}

	@Override
	public String getInputTypeRootName() {
		return "jiraQueryActivityInput"; //$NON-NLS-1$
	}

	@Override
	public String getOutputTypeRootName() {
		return "jiraQueryOutput"; //$NON-NLS-1$
	}


	@Override
	public boolean isSynchronous() {
		return false;
	}


}
