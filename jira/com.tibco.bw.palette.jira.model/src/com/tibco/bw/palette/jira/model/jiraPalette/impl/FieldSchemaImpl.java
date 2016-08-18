/**
 */
package com.tibco.bw.palette.jira.model.jiraPalette.impl;

import com.tibco.bw.palette.jira.model.jiraPalette.FieldSchema;
import com.tibco.bw.palette.jira.model.jiraPalette.JiraPalettePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.FieldSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.FieldSchemaImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link com.tibco.bw.palette.jira.model.jiraPalette.impl.FieldSchemaImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldSchemaImpl extends MinimalEObjectImpl.Container implements FieldSchema {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustom() <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustom() <em>Custom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustom()
	 * @generated
	 * @ordered
	 */
	protected String custom = CUSTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getItems() <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected String items = ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JiraPalettePackage.Literals.FIELD_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.FIELD_SCHEMA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustom() {
		return custom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustom(String newCustom) {
		String oldCustom = custom;
		custom = newCustom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.FIELD_SCHEMA__CUSTOM, oldCustom, custom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(String newItems) {
		String oldItems = items;
		items = newItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JiraPalettePackage.FIELD_SCHEMA__ITEMS, oldItems, items));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JiraPalettePackage.FIELD_SCHEMA__TYPE:
				return getType();
			case JiraPalettePackage.FIELD_SCHEMA__CUSTOM:
				return getCustom();
			case JiraPalettePackage.FIELD_SCHEMA__ITEMS:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JiraPalettePackage.FIELD_SCHEMA__TYPE:
				setType((String)newValue);
				return;
			case JiraPalettePackage.FIELD_SCHEMA__CUSTOM:
				setCustom((String)newValue);
				return;
			case JiraPalettePackage.FIELD_SCHEMA__ITEMS:
				setItems((String)newValue);
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
			case JiraPalettePackage.FIELD_SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case JiraPalettePackage.FIELD_SCHEMA__CUSTOM:
				setCustom(CUSTOM_EDEFAULT);
				return;
			case JiraPalettePackage.FIELD_SCHEMA__ITEMS:
				setItems(ITEMS_EDEFAULT);
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
			case JiraPalettePackage.FIELD_SCHEMA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case JiraPalettePackage.FIELD_SCHEMA__CUSTOM:
				return CUSTOM_EDEFAULT == null ? custom != null : !CUSTOM_EDEFAULT.equals(custom);
			case JiraPalettePackage.FIELD_SCHEMA__ITEMS:
				return ITEMS_EDEFAULT == null ? items != null : !ITEMS_EDEFAULT.equals(items);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", custom: ");
		result.append(custom);
		result.append(", items: ");
		result.append(items);
		result.append(')');
		return result.toString();
	}

} //FieldSchemaImpl
