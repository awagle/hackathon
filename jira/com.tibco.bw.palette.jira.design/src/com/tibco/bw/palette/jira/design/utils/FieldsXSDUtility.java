package com.tibco.bw.palette.jira.design.utils;

import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDModelGroup;

import com.tibco.bw.design.util.XSDUtility;
import com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema;
import com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField;

public class FieldsXSDUtility {

	public static String []simpleTypes = {"string", "number", "datetime", "date", "number"};

	public static String ID = "id";
	public static String DESCRIPTION = "description";
	public static String SELF = "self";
	public static String NAME = "name";
	public static String AVATAR_URLS = "avatarUrls";
	public static String C_48X48 ="48x48";
	public static String C_32X32 ="32x32";
	public static String C_16X16 ="16x16";
	public static String C_24X24 ="24x24";
	public static String ICON_URL = "iconUrl";

	public static void createElementForField(XSDModelGroup parent, JIRACustomField field){
		if(isArray(field)){
			if(isSimpleType(field.getSchema())){
				//array of simple type
				XSDUtility.addSimpleTypeElement(parent, field.getId() , field.getSchema().getType(), 0, -1);
			} else {
				String item = field.getSchema().getItems();
				XSDModelGroup root = XSDUtility.addAnonymousComplexTypeElement(parent, field.getLabel(), 0, -1, XSDCompositor.ALL_LITERAL);
				createCustomTypeSchema(item, root);
			}
		} else {
			if(isSimpleType(field.getSchema())){
				XSDUtility.addSimpleTypeElement(parent, field.getId() , field.getSchema().getType(), 0, 1);
			} else {
				String type = field.getSchema().getType();
				XSDModelGroup root = XSDUtility.addAnonymousComplexTypeElement(parent, field.getLabel(), 0, 1, XSDCompositor.ALL_LITERAL);
				createCustomTypeSchema(type, root);
			}
		}
	}

	private static void createCustomTypeSchema(String item,XSDModelGroup root){
		switch (item) {
		case "issuetype" :

			createIssueTypeSchema(root);
			break;
		case "progress" :
			creatProgressSchema(root);
			break;
		case "status" :
			createStatusSchema(root);
			break;
		case "resolution" :
			createResolutionSchema(root);
			break;
		case "version" :
			createVersionSchema(root);
			break;
		case "project" :
			createProjectSchema(root);
			break;
		case "priority" :
			createPrioritySchema(root);
			break;
		case "user":
			createUserSchema(root);
			break;
		default:
			break;
		}
	}

	private static void creatProgressSchema(XSDModelGroup progressType) {
		XSDUtility.addSimpleTypeElement(progressType, "progress", "long", 0, 1);
		XSDUtility.addSimpleTypeElement(progressType, "total", "long", 0, 1);		
	}

	public static void createIssueTypeSchema(XSDModelGroup parent){
		XSDUtility.addSimpleTypeElement(parent, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ID, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, DESCRIPTION, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ICON_URL, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, NAME, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "subtask", "boolean", 0, 1);

	}

	public static void createResolutionSchema(XSDModelGroup parent){
		XSDUtility.addSimpleTypeElement(parent, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ID, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, DESCRIPTION, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, NAME, "string", 0, 1);
	}

	public static void createVersionSchema(XSDModelGroup parent){
		XSDUtility.addSimpleTypeElement(parent, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ID, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, DESCRIPTION, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, NAME, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "archived", "boolean", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "released", "boolean", 0, 1);
	}

	public static void createPrioritySchema(XSDModelGroup parent){
		XSDUtility.addSimpleTypeElement(parent, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ID, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ICON_URL, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, NAME, "string", 0, 1);
	}

	public static void createAvatarSchema(XSDModelGroup parent, JIRACustomField field){
		XSDUtility.addSimpleTypeElement(parent, C_48X48, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, C_32X32, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, C_24X24, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, C_16X16, "string", 0, 1);
	}

	public static void createUserSchema(XSDModelGroup parent){
		XSDUtility.addSimpleTypeElement(parent, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, NAME, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "key", "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "emailAddress", "string", 0, 1);
		XSDModelGroup avatar = XSDUtility.addAnonymousComplexTypeElement(parent, AVATAR_URLS, 0, 1, XSDCompositor.ALL_LITERAL);
		createAvatarSchema(avatar, null);
		XSDUtility.addSimpleTypeElement(parent, "displayName", "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "active", "boolean", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "timezone", "string", 0, 1);
	}


	public static void createProjectSchema(XSDModelGroup parent){
		XSDUtility.addSimpleTypeElement(parent, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ID, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, NAME, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, "key", "string", 0, 1);
		XSDModelGroup avatar = XSDUtility.addAnonymousComplexTypeElement(parent, AVATAR_URLS, 0, 1, XSDCompositor.ALL_LITERAL);
		createAvatarSchema(avatar, null);
		XSDModelGroup projCategory = XSDUtility.addAnonymousComplexTypeElement(parent, "projectCategory", 0, 1, XSDCompositor.ALL_LITERAL);
		XSDUtility.addSimpleTypeElement(projCategory, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(projCategory, ID, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(projCategory, NAME, "string", 0, 1);

	}


	public static void createStatusSchema(XSDModelGroup parent){

		XSDUtility.addSimpleTypeElement(parent, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, DESCRIPTION, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ICON_URL, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, NAME, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(parent, ID, "string", 0, 1);
		XSDModelGroup category = XSDUtility.addAnonymousComplexTypeElement(parent, "statusCategory", 0, 1, XSDCompositor.ALL_LITERAL);
		XSDUtility.addSimpleTypeElement(category, SELF, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(category, ID, "string", 0, 1);
		XSDUtility.addSimpleTypeElement(category, "key", "string", 0, 1);
		XSDUtility.addSimpleTypeElement(category, "colorName", "string", 0, 1);
		XSDUtility.addSimpleTypeElement(category, NAME, "string", 0, 1);

	}
	public static boolean isArray(JIRACustomField field){
		if(field.getSchema().getType().equals("array")){
			return true;
		}
		return false;
	}

	public static boolean isSimpleType(FieldSchema schema){
		for (String string : simpleTypes) {
			if(schema.getType().equalsIgnoreCase(string)){
				return true;
			}
		}
		return false;
	}

}
