/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPaletteFactory
 * @model kind="package"
 * @generated
 */
public interface JiraPalettePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jiraPalette";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.tibco.com/bw/palette/jira";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jiraPalette";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JiraPalettePackage eINSTANCE = com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.QueryImpl
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 0;

	/**
	 * The feature id for the '<em><b>Expand Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__EXPAND_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Custom Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__CUSTOM_FIELDS = 2;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.JIRACustomFieldImpl <em>JIRA Custom Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JIRACustomFieldImpl
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getJIRACustomField()
	 * @generated
	 */
	int JIRA_CUSTOM_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_CUSTOM_FIELD__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_CUSTOM_FIELD__ID = 1;

	/**
	 * The number of structural features of the '<em>JIRA Custom Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JIRA_CUSTOM_FIELD_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.FieldSchemaImpl <em>Field Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.FieldSchemaImpl
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getFieldSchema()
	 * @generated
	 */
	int FIELD_SCHEMA = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCHEMA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCHEMA__CUSTOM = 1;

	/**
	 * The number of structural features of the '<em>Field Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SCHEMA_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ISSUE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes <em>Issue Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getIssueTypes()
	 * @generated
	 */
	int ISSUE_TYPES = 2;


	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.jira.model.jiraPalette.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getExpandNames <em>Expand Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expand Names</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.Query#getExpandNames()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_ExpandNames();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.Query#getConnection()
	 * @see #getQuery()
	 * @generated
	 */
	EAttribute getQuery_Connection();

	/**
<<<<<<< HEAD
	 * Returns the meta object for class '{@link com.tibco.bw.palette.jira.model.jiraPalette.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.Create#getConnection()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_Connection();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Type</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.Create#getIssueType()
	 * @see #getCreate()
	 * @generated
	 */
	EAttribute getCreate_IssueType();

	/**
	 * Returns the meta object for enum '{@link com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes <em>Issue Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Types</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes
	 * @generated
	 */
	EEnum getIssueTypes();
=======
	 * Returns the meta object for the containment reference list '{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getCustomFields <em>Custom Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Fields</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.Query#getCustomFields()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_CustomFields();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField <em>JIRA Custom Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JIRA Custom Field</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField
	 * @generated
	 */
	EClass getJIRACustomField();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField#getLabel()
	 * @see #getJIRACustomField()
	 * @generated
	 */
	EAttribute getJIRACustomField_Label();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField#getId()
	 * @see #getJIRACustomField()
	 * @generated
	 */
	EAttribute getJIRACustomField_Id();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema <em>Field Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Schema</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema
	 * @generated
	 */
	EClass getFieldSchema();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getType()
	 * @see #getFieldSchema()
	 * @generated
	 */
	EAttribute getFieldSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getCustom <em>Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom</em>'.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getCustom()
	 * @see #getFieldSchema()
	 * @generated
	 */
	EAttribute getFieldSchema_Custom();
>>>>>>> master

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JiraPaletteFactory getJiraPaletteFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.QueryImpl
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Expand Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__EXPAND_NAMES = eINSTANCE.getQuery_ExpandNames();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY__CONNECTION = eINSTANCE.getQuery_Connection();

		/**
<<<<<<< HEAD
		 * The meta object literal for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE__CONNECTION = eINSTANCE.getCreate_Connection();

		/**
		 * The meta object literal for the '<em><b>Issue Type</b></em>' attribute feature.
=======
		 * The meta object literal for the '<em><b>Custom Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__CUSTOM_FIELDS = eINSTANCE.getQuery_CustomFields();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.JIRACustomFieldImpl <em>JIRA Custom Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JIRACustomFieldImpl
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getJIRACustomField()
		 * @generated
		 */
		EClass JIRA_CUSTOM_FIELD = eINSTANCE.getJIRACustomField();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
>>>>>>> master
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
<<<<<<< HEAD
		EAttribute CREATE__ISSUE_TYPE = eINSTANCE.getCreate_IssueType();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes <em>Issue Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getIssueTypes()
		 * @generated
		 */
		EEnum ISSUE_TYPES = eINSTANCE.getIssueTypes();
=======
		EAttribute JIRA_CUSTOM_FIELD__LABEL = eINSTANCE.getJIRACustomField_Label();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JIRA_CUSTOM_FIELD__ID = eINSTANCE.getJIRACustomField_Id();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.FieldSchemaImpl <em>Field Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.FieldSchemaImpl
		 * @see com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPalettePackageImpl#getFieldSchema()
		 * @generated
		 */
		EClass FIELD_SCHEMA = eINSTANCE.getFieldSchema();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SCHEMA__TYPE = eINSTANCE.getFieldSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Custom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SCHEMA__CUSTOM = eINSTANCE.getFieldSchema_Custom();
>>>>>>> master

	}

} //JiraPalettePackage
