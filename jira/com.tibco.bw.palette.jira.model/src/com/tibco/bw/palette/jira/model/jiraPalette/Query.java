/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getExpandNames <em>Expand Names</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getCustomFields <em>Custom Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getQuery()
 * @model
 * @generated
 */
public interface Query extends EObject {
	/**
	 * Returns the value of the '<em><b>Expand Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expand Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expand Names</em>' attribute.
	 * @see #setExpandNames(String)
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getQuery_ExpandNames()
	 * @model
	 * @generated
	 */
	String getExpandNames();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getExpandNames <em>Expand Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand Names</em>' attribute.
	 * @see #getExpandNames()
	 * @generated
	 */
	void setExpandNames(String value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' attribute.
	 * @see #setConnection(String)
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getQuery_Connection()
	 * @model
	 * @generated
	 */
	String getConnection();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.jira.model.jiraPalette.Query#getConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(String value);

	/**
	 * Returns the value of the '<em><b>Custom Fields</b></em>' containment reference list.
	 * The list contents are of type {@link com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Fields</em>' containment reference list.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getQuery_CustomFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<JIRACustomField> getCustomFields();

} // Query
