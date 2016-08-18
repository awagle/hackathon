/**
 * 
 */
package com.tibco.plugin.jira;


/**
 * @author hnembhwa
 *
 */
public interface JiraPluginConstants {

	// XML NS
    String JSON_XML_NS = "http://www.tibco.com/namespaces/tnt/plugins/json";

    String ACTIVITY_OUTPUT_CLASS = "ActivityOutputClass";

    String ACTIVITY_INPUT_CLASS = "ActivityInputClass";

    String ACTIVITY_OUTPUT_EDITOR = "ActivityOutputEditor";

    String ACTIVITY_INPUT_EDITOR = "ActivityInputEditor";

    String SCHEMA_ROOT = "SchemaRoot";

    String SCHEMA_FILE_NAME = "SchemaFileName";

    String EXCLUDE_SCHEMA_ROOT = "ExcludeSchemaRoot";

    String ADD_ROOT_ELEMENT = "addRootElementForOutput";

    String REMOVE_ROOT_ELEMENT = "removeRootElementForInput";

    String FIELD_BADGERFISH_CHECK = "BadgerfishCheck";

    String ROOT_ELEMENT_NAME = "genericTyeRootElementName";

    String DEFAULT_JSON_ROOT = "JSON";

    String SCHEMA_TYPE = "SchemaType";

    String SCHEMA_XSDTYPE = "xsdType";
    String SCHEMA_CLASSTYPE = "classType";
    String SCHEMA_JSONTYPE = "jsonSchema";
    String GENERIC_XML = "generic";

    // parser config, input and ouput schema starts
    String[] SCHEMA_TYPE_CHOICES = { "Generic", "Xsd", "Java Classes"/* , "JSON schema" */};
    String[] SCHEMA_TYPE_VALUES = { JiraPluginConstants.GENERIC_XML, JiraPluginConstants.SCHEMA_XSDTYPE,
    		JiraPluginConstants.SCHEMA_CLASSTYPE /* , JSONPluginConstants.SCHEMA_JSONTYPE */};

    String VALIDATE_OUTPUT_ENABLE = "ValidateOutputEnable";

    String FIELD_ROOT_CLASS = "RootClass";
    String FIELD_POJO_JAR_PATH = "PojoJarPath";
    String FIELD_POJO_BYTES = "PojoBytes";
    String FIELD_JSD_URI = "JSDURI";

    String XML_SCHEMA_ROOT = "Root";

    public final static String VALIDATE_INPUT_ENABLE = "ValidateIntputEnable";

    // activity name
    public final static String JIRA_QUERY_ACTIVITY = "JIRA Query";
   

}
