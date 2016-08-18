/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getType <em>Type</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getCustom <em>Custom</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getFieldSchema()
 * @model
 * @generated
 */
public interface FieldSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getFieldSchema_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Custom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom</em>' attribute.
	 * @see #setCustom(String)
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getFieldSchema_Custom()
	 * @model
	 * @generated
	 */
	String getCustom();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema#getCustom <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom</em>' attribute.
	 * @see #getCustom()
	 * @generated
	 */
	void setCustom(String value);

} // FieldSchema
