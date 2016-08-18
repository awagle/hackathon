/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage
 * @generated
 */
public interface JiraPaletteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JiraPaletteFactory eINSTANCE = com.tibco.bw.palette.jira.model.jiraPalette.impl.JiraPaletteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Query</em>'.
	 * @generated
	 */
	Query createQuery();

	/**
<<<<<<< HEAD
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();
=======
	 * Returns a new object of class '<em>JIRA Custom Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JIRA Custom Field</em>'.
	 * @generated
	 */
	JIRACustomField createJIRACustomField();

	/**
	 * Returns a new object of class '<em>Field Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field Schema</em>'.
	 * @generated
	 */
	FieldSchema createFieldSchema();
>>>>>>> master

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JiraPalettePackage getJiraPalettePackage();

} //JiraPaletteFactory
