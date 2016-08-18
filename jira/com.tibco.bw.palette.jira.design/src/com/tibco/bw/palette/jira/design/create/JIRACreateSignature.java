package com.tibco.bw.palette.jira.design.create;

import java.util.List;

import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDSchema;

import com.tibco.bw.design.api.BWActivitySignature;
import com.tibco.bw.design.api.BWActivitySignatureUnknown;
import com.tibco.bw.design.util.XSDUtility;
import com.tibco.bw.model.activityconfig.Configuration;

public class JIRACreateSignature extends BWActivitySignature {

	protected final static String TARGET_NS = "http://www.tibco.com/namespaces/tnt/plugins/jira";

	public JIRACreateSignature() {
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
		XSDModelGroup inputGroup = XSDUtility.addAnonymousComplexTypeElement(
				schema, getInputTypeRootName(), XSDCompositor.SEQUENCE_LITERAL);

		XSDUtility.addSimpleTypeElement(inputGroup, "jql", "string", 1, 1);
		XSDUtility.addSimpleTypeElement(inputGroup, "timout", "long", 0, 1);
		XSDUtility.addSimpleTypeElement(inputGroup, "limit", "long", 0, 1);
		schema = compileSchema(schema);
		retVal = schema.resolveElementDeclaration(getInputTypeRootName());
		return retVal;
	}

	@Override
	public XSDElementDeclaration getOutputType(Configuration config)
			throws BWActivitySignatureUnknown {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInputTypeRootName() {
		return "jiraCreateActivityInput"; //$NON-NLS-1$
	}

	@Override
	public String getOutputTypeRootName() {
		return "jiraCreateOutput"; //$NON-NLS-1$
	}

	@Override
	public boolean isSynchronous() {
		return false;
	}

}
