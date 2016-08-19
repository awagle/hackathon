/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette.impl;

import com.tibco.bw.palette.jira.model.jiraPalette.Create;
import com.tibco.bw.palette.jira.model.jiraPalette.IssueTypes;
import com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl#getCustomFields <em>Custom Fields</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.CreateImpl#getProjectName <em>Project Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateImpl extends MinimalEObjectImpl.Container implements Create {
	/**
	 * The default value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected String connection = CONNECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueType() <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueType()
	 * @generated
	 * @ordered
	 */
	protected static final IssueTypes ISSUE_TYPE_EDEFAULT = IssueTypes.TASK;

	/**
	 * The cached value of the '{@link #getIssueType() <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueType()
	 * @generated
	 * @ordered
	 */
	protected IssueTypes issueType = ISSUE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomFields() <em>Custom Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomFields()
	 * @generated
	 * @ordered
	 */
	protected EList<JIRACustomField> customFields;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPalettePackage.Literals.CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(String newConnection) {
		String oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.CREATE__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTypes getIssueType() {
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueType(IssueTypes newIssueType) {
		IssueTypes oldIssueType = issueType;
		issueType = newIssueType == null ? ISSUE_TYPE_EDEFAULT : newIssueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.CREATE__ISSUE_TYPE, oldIssueType, issueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JIRACustomField> getCustomFields() {
		if (customFields == null) {
			customFields = new EObjectContainmentEList<JIRACustomField>(JIRACustomField.class, this, JiraPalettePackage.CREATE__CUSTOM_FIELDS);
		}
		return customFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.CREATE__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPalettePackage.CREATE__CUSTOM_FIELDS:
				return ((InternalEList<?>)getCustomFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPalettePackage.CREATE__CONNECTION:
				return getConnection();
			case JiraPalettePackage.CREATE__ISSUE_TYPE:
				return getIssueType();
			case JiraPalettePackage.CREATE__CUSTOM_FIELDS:
				return getCustomFields();
			case JiraPalettePackage.CREATE__PROJECT_NAME:
				return getProjectName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraPalettePackage.CREATE__CONNECTION:
				setConnection((String)newValue);
				return;
			case JiraPalettePackage.CREATE__ISSUE_TYPE:
				setIssueType((IssueTypes)newValue);
				return;
			case JiraPalettePackage.CREATE__CUSTOM_FIELDS:
				getCustomFields().clear();
				getCustomFields().addAll((Collection<? extends JIRACustomField>)newValue);
				return;
			case JiraPalettePackage.CREATE__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JiraPalettePackage.CREATE__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case JiraPalettePackage.CREATE__ISSUE_TYPE:
				setIssueType(ISSUE_TYPE_EDEFAULT);
				return;
			case JiraPalettePackage.CREATE__CUSTOM_FIELDS:
				getCustomFields().clear();
				return;
			case JiraPalettePackage.CREATE__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JiraPalettePackage.CREATE__CONNECTION:
				return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
			case JiraPalettePackage.CREATE__ISSUE_TYPE:
				return issueType != ISSUE_TYPE_EDEFAULT;
			case JiraPalettePackage.CREATE__CUSTOM_FIELDS:
				return customFields != null && !customFields.isEmpty();
			case JiraPalettePackage.CREATE__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (connection: ");
		result.append(connection);
		result.append(", issueType: ");
		result.append(issueType);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(')');
		return result.toString();
	}

} //CreateImpl
