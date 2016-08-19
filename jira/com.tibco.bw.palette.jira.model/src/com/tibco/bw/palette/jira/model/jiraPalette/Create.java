/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getCustomFields <em>Custom Fields</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getCreate()
 * @model
 * @generated
 */
public interface Create extends EObject {
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
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getCreate_Connection()
	 * @model required="true"
	 * @generated
	 */
	String getConnection();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getConnection <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' attribute.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(String value);

	/**
	 * Returns the value of the '<em><b>Issue Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Type</em>' attribute.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes
	 * @see #setIssueType(IssueTypes)
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getCreate_IssueType()
	 * @model required="true"
	 * @generated
	 */
	IssueTypes getIssueType();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getIssueType <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Type</em>' attribute.
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes
	 * @see #getIssueType()
	 * @generated
	 */
	void setIssueType(IssueTypes value);

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
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getCreate_CustomFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<JIRACustomField> getCustomFields();

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage#getCreate_ProjectName()
	 * @model required="true"
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.jira.model.jiraPalette.Create#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

} // Create
