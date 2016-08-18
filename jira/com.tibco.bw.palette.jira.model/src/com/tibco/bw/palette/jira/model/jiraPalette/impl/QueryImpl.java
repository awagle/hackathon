/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette.impl;

import com.tibco.bw.palette.jira.model.jiraPalette.JIRACustomField;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage;
import com.tibco.bw.palette.jira.model.jiraPalette.Query;
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
 * An implementation of the model object '<em><b>Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.QueryImpl#getExpandNames <em>Expand Names</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.QueryImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.QueryImpl#getCustomFields <em>Custom Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryImpl extends MinimalEObjectImpl.Container implements Query {
	/**
	 * The default value of the '{@link #getExpandNames() <em>Expand Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandNames()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPAND_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpandNames() <em>Expand Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpandNames()
	 * @generated
	 * @ordered
	 */
	protected String expandNames = EXPAND_NAMES_EDEFAULT;

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
	 * The cached value of the '{@link #getCustomFields() <em>Custom Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomFields()
	 * @generated
	 * @ordered
	 */
	protected EList<JIRACustomField> customFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPalettePackage.Literals.QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpandNames() {
		return expandNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandNames(String newExpandNames) {
		String oldExpandNames = expandNames;
		expandNames = newExpandNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.QUERY__EXPAND_NAMES, oldExpandNames, expandNames));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.QUERY__CONNECTION, oldConnection, connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JIRACustomField> getCustomFields() {
		if (customFields == null) {
			customFields = new EObjectContainmentEList<JIRACustomField>(JIRACustomField.class, this, JiraPalettePackage.QUERY__CUSTOM_FIELDS);
		}
		return customFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JiraPalettePackage.QUERY__CUSTOM_FIELDS:
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
			case JiraPalettePackage.QUERY__EXPAND_NAMES:
				return getExpandNames();
			case JiraPalettePackage.QUERY__CONNECTION:
				return getConnection();
			case JiraPalettePackage.QUERY__CUSTOM_FIELDS:
				return getCustomFields();
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
			case JiraPalettePackage.QUERY__EXPAND_NAMES:
				setExpandNames((String)newValue);
				return;
			case JiraPalettePackage.QUERY__CONNECTION:
				setConnection((String)newValue);
				return;
			case JiraPalettePackage.QUERY__CUSTOM_FIELDS:
				getCustomFields().clear();
				getCustomFields().addAll((Collection<? extends JIRACustomField>)newValue);
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
			case JiraPalettePackage.QUERY__EXPAND_NAMES:
				setExpandNames(EXPAND_NAMES_EDEFAULT);
				return;
			case JiraPalettePackage.QUERY__CONNECTION:
				setConnection(CONNECTION_EDEFAULT);
				return;
			case JiraPalettePackage.QUERY__CUSTOM_FIELDS:
				getCustomFields().clear();
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
			case JiraPalettePackage.QUERY__EXPAND_NAMES:
				return EXPAND_NAMES_EDEFAULT == null ? expandNames != null : !EXPAND_NAMES_EDEFAULT.equals(expandNames);
			case JiraPalettePackage.QUERY__CONNECTION:
				return CONNECTION_EDEFAULT == null ? connection != null : !CONNECTION_EDEFAULT.equals(connection);
			case JiraPalettePackage.QUERY__CUSTOM_FIELDS:
				return customFields != null && !customFields.isEmpty();
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
		result.append(" (expandNames: ");
		result.append(expandNames);
		result.append(", connection: ");
		result.append(connection);
		result.append(')');
		return result.toString();
	}

} //QueryImpl
