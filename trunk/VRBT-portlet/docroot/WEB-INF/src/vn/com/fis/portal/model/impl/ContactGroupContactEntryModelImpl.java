/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.com.fis.portal.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.com.fis.portal.model.ContactGroupContactEntry;
import vn.com.fis.portal.model.ContactGroupContactEntryModel;
import vn.com.fis.portal.model.ContactGroupContactEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the ContactGroupContactEntry service. Represents a row in the &quot;TBL_CONTACT_GROUP_CONTACT&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.fis.portal.model.ContactGroupContactEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContactGroupContactEntryImpl}.
 * </p>
 *
 * @author loind
 * @see ContactGroupContactEntryImpl
 * @see vn.com.fis.portal.model.ContactGroupContactEntry
 * @see vn.com.fis.portal.model.ContactGroupContactEntryModel
 * @generated
 */
@JSON(strict = true)
public class ContactGroupContactEntryModelImpl extends BaseModelImpl<ContactGroupContactEntry>
	implements ContactGroupContactEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a contact group contact entry model instance should use the {@link vn.com.fis.portal.model.ContactGroupContactEntry} interface instead.
	 */
	public static final String TABLE_NAME = "TBL_CONTACT_GROUP_CONTACT";
	public static final Object[][] TABLE_COLUMNS = {
			{ "contactGroupContactId", Types.BIGINT },
			{ "contactId", Types.VARCHAR },
			{ "contactGroupId", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table TBL_CONTACT_GROUP_CONTACT (contactGroupContactId LONG not null primary key,contactId VARCHAR(75) null,contactGroupId VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table TBL_CONTACT_GROUP_CONTACT";
	public static final String ORDER_BY_JPQL = " ORDER BY contactGroupContactEntry.contactId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TBL_CONTACT_GROUP_CONTACT.contactId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.fis.portal.model.ContactGroupContactEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.fis.portal.model.ContactGroupContactEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.fis.portal.model.ContactGroupContactEntry"),
			true);
	public static long CONTACTGROUPID_COLUMN_BITMASK = 1L;
	public static long CONTACTID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ContactGroupContactEntry toModel(
		ContactGroupContactEntrySoap soapModel) {
		ContactGroupContactEntry model = new ContactGroupContactEntryImpl();

		model.setContactGroupContactId(soapModel.getContactGroupContactId());
		model.setContactId(soapModel.getContactId());
		model.setContactGroupId(soapModel.getContactGroupId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ContactGroupContactEntry> toModels(
		ContactGroupContactEntrySoap[] soapModels) {
		List<ContactGroupContactEntry> models = new ArrayList<ContactGroupContactEntry>(soapModels.length);

		for (ContactGroupContactEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.fis.portal.model.ContactGroupContactEntry"));

	public ContactGroupContactEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _contactGroupContactId;
	}

	public void setPrimaryKey(long primaryKey) {
		setContactGroupContactId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_contactGroupContactId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return ContactGroupContactEntry.class;
	}

	public String getModelClassName() {
		return ContactGroupContactEntry.class.getName();
	}

	@JSON
	public long getContactGroupContactId() {
		return _contactGroupContactId;
	}

	public void setContactGroupContactId(long contactGroupContactId) {
		_contactGroupContactId = contactGroupContactId;
	}

	@JSON
	public String getContactId() {
		if (_contactId == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactId;
		}
	}

	public void setContactId(String contactId) {
		_columnBitmask = -1L;

		if (_originalContactId == null) {
			_originalContactId = _contactId;
		}

		_contactId = contactId;
	}

	public String getOriginalContactId() {
		return GetterUtil.getString(_originalContactId);
	}

	@JSON
	public String getContactGroupId() {
		if (_contactGroupId == null) {
			return StringPool.BLANK;
		}
		else {
			return _contactGroupId;
		}
	}

	public void setContactGroupId(String contactGroupId) {
		_columnBitmask |= CONTACTGROUPID_COLUMN_BITMASK;

		if (_originalContactGroupId == null) {
			_originalContactGroupId = _contactGroupId;
		}

		_contactGroupId = contactGroupId;
	}

	public String getOriginalContactGroupId() {
		return GetterUtil.getString(_originalContactGroupId);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ContactGroupContactEntry toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ContactGroupContactEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ContactGroupContactEntry.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ContactGroupContactEntryImpl contactGroupContactEntryImpl = new ContactGroupContactEntryImpl();

		contactGroupContactEntryImpl.setContactGroupContactId(getContactGroupContactId());
		contactGroupContactEntryImpl.setContactId(getContactId());
		contactGroupContactEntryImpl.setContactGroupId(getContactGroupId());

		contactGroupContactEntryImpl.resetOriginalValues();

		return contactGroupContactEntryImpl;
	}

	public int compareTo(ContactGroupContactEntry contactGroupContactEntry) {
		int value = 0;

		value = getContactId().compareTo(contactGroupContactEntry.getContactId());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		ContactGroupContactEntry contactGroupContactEntry = null;

		try {
			contactGroupContactEntry = (ContactGroupContactEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = contactGroupContactEntry.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		ContactGroupContactEntryModelImpl contactGroupContactEntryModelImpl = this;

		contactGroupContactEntryModelImpl._originalContactId = contactGroupContactEntryModelImpl._contactId;

		contactGroupContactEntryModelImpl._originalContactGroupId = contactGroupContactEntryModelImpl._contactGroupId;

		contactGroupContactEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ContactGroupContactEntry> toCacheModel() {
		ContactGroupContactEntryCacheModel contactGroupContactEntryCacheModel = new ContactGroupContactEntryCacheModel();

		contactGroupContactEntryCacheModel.contactGroupContactId = getContactGroupContactId();

		contactGroupContactEntryCacheModel.contactId = getContactId();

		String contactId = contactGroupContactEntryCacheModel.contactId;

		if ((contactId != null) && (contactId.length() == 0)) {
			contactGroupContactEntryCacheModel.contactId = null;
		}

		contactGroupContactEntryCacheModel.contactGroupId = getContactGroupId();

		String contactGroupId = contactGroupContactEntryCacheModel.contactGroupId;

		if ((contactGroupId != null) && (contactGroupId.length() == 0)) {
			contactGroupContactEntryCacheModel.contactGroupId = null;
		}

		return contactGroupContactEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{contactGroupContactId=");
		sb.append(getContactGroupContactId());
		sb.append(", contactId=");
		sb.append(getContactId());
		sb.append(", contactGroupId=");
		sb.append(getContactGroupId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("vn.com.fis.portal.model.ContactGroupContactEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>contactGroupContactId</column-name><column-value><![CDATA[");
		sb.append(getContactGroupContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactGroupId</column-name><column-value><![CDATA[");
		sb.append(getContactGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ContactGroupContactEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ContactGroupContactEntry.class
		};
	private long _contactGroupContactId;
	private String _contactId;
	private String _originalContactId;
	private String _contactGroupId;
	private String _originalContactGroupId;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ContactGroupContactEntry _escapedModelProxy;
}