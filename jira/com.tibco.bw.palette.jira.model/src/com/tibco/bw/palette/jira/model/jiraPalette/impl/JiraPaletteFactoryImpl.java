/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette.impl;

import com.tibco.bw.palette.jira.model.jiraPalette.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JiraPaletteFactoryImpl extends EFactoryImpl implements JiraPaletteFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JiraPaletteFactory init() {
		try {
			JiraPaletteFactory theJiraPaletteFactory = (JiraPaletteFactory)EPackage.Registry.INSTANCE.getEFactory(JiraPalettePackage.eNS_URI);
			if (theJiraPaletteFactory != null) {
				return theJiraPaletteFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JiraPaletteFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraPaletteFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JiraPalettePackage.QUERY: return createQuery();
			case JiraPalettePackage.JIRA_CUSTOM_FIELD: return createJIRACustomField();
			case JiraPalettePackage.FIELD_SCHEMA: return createFieldSchema();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JIRACustomField createJIRACustomField() {
		JIRACustomFieldImpl jiraCustomField = new JIRACustomFieldImpl();
		return jiraCustomField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldSchema createFieldSchema() {
		FieldSchemaImpl fieldSchema = new FieldSchemaImpl();
		return fieldSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JiraPalettePackage getJiraPalettePackage() {
		return (JiraPalettePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JiraPalettePackage getPackage() {
		return JiraPalettePackage.eINSTANCE;
	}

} //JiraPaletteFactoryImpl
