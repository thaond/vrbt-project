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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.com.fis.portal.model.UserEntry;
import vn.com.fis.portal.model.UserEntryModel;
import vn.com.fis.portal.model.UserEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the UserEntry service. Represents a row in the &quot;TBL_USER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.fis.portal.model.UserEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UserEntryImpl}.
 * </p>
 *
 * @author loind
 * @see UserEntryImpl
 * @see vn.com.fis.portal.model.UserEntry
 * @see vn.com.fis.portal.model.UserEntryModel
 * @generated
 */
@JSON(strict = true)
public class UserEntryModelImpl extends BaseModelImpl<UserEntry>
	implements UserEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a user entry model instance should use the {@link vn.com.fis.portal.model.UserEntry} interface instead.
	 */
	public static final String TABLE_NAME = "TBL_USER";
	public static final Object[][] TABLE_COLUMNS = {
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "mobileNumber", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TBL_USER (userId LONG not null primary key,userName VARCHAR(75) null,mobileNumber VARCHAR(75) null,companyId LONG,createDate DATE null,modifiedDate DATE null,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TBL_USER";
	public static final String ORDER_BY_JPQL = " ORDER BY userEntry.userName ASC, userEntry.mobileNumber ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TBL_USER.userName ASC, TBL_USER.mobileNumber ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.fis.portal.model.UserEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.fis.portal.model.UserEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.fis.portal.model.UserEntry"),
			true);
	public static long MOBILENUMBER_COLUMN_BITMASK = 1L;
	public static long STATUS_COLUMN_BITMASK = 2L;
	public static long USERID_COLUMN_BITMASK = 4L;
	public static long USERNAME_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static UserEntry toModel(UserEntrySoap soapModel) {
		UserEntry model = new UserEntryImpl();

		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setMobileNumber(soapModel.getMobileNumber());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<UserEntry> toModels(UserEntrySoap[] soapModels) {
		List<UserEntry> models = new ArrayList<UserEntry>(soapModels.length);

		for (UserEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.fis.portal.model.UserEntry"));

	public UserEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _userId;
	}

	public void setPrimaryKey(long primaryKey) {
		setUserId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_userId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return UserEntry.class;
	}

	public String getModelClassName() {
		return UserEntry.class.getName();
	}

	@JSON
	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_columnBitmask = -1L;

		if (_originalUserName == null) {
			_originalUserName = _userName;
		}

		_userName = userName;
	}

	public String getOriginalUserName() {
		return GetterUtil.getString(_originalUserName);
	}

	@JSON
	public String getMobileNumber() {
		if (_mobileNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _mobileNumber;
		}
	}

	public void setMobileNumber(String mobileNumber) {
		_columnBitmask = -1L;

		if (_originalMobileNumber == null) {
			_originalMobileNumber = _mobileNumber;
		}

		_mobileNumber = mobileNumber;
	}

	public String getOriginalMobileNumber() {
		return GetterUtil.getString(_originalMobileNumber);
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public UserEntry toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (UserEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					UserEntry.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		UserEntryImpl userEntryImpl = new UserEntryImpl();

		userEntryImpl.setUserId(getUserId());
		userEntryImpl.setUserName(getUserName());
		userEntryImpl.setMobileNumber(getMobileNumber());
		userEntryImpl.setCompanyId(getCompanyId());
		userEntryImpl.setCreateDate(getCreateDate());
		userEntryImpl.setModifiedDate(getModifiedDate());
		userEntryImpl.setStatus(getStatus());

		userEntryImpl.resetOriginalValues();

		return userEntryImpl;
	}

	public int compareTo(UserEntry userEntry) {
		int value = 0;

		value = getUserName().compareTo(userEntry.getUserName());

		if (value != 0) {
			return value;
		}

		value = getMobileNumber().compareTo(userEntry.getMobileNumber());

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

		UserEntry userEntry = null;

		try {
			userEntry = (UserEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = userEntry.getPrimaryKey();

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
		UserEntryModelImpl userEntryModelImpl = this;

		userEntryModelImpl._originalUserId = userEntryModelImpl._userId;

		userEntryModelImpl._setOriginalUserId = false;

		userEntryModelImpl._originalUserName = userEntryModelImpl._userName;

		userEntryModelImpl._originalMobileNumber = userEntryModelImpl._mobileNumber;

		userEntryModelImpl._originalStatus = userEntryModelImpl._status;

		userEntryModelImpl._setOriginalStatus = false;

		userEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<UserEntry> toCacheModel() {
		UserEntryCacheModel userEntryCacheModel = new UserEntryCacheModel();

		userEntryCacheModel.userId = getUserId();

		userEntryCacheModel.userName = getUserName();

		String userName = userEntryCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			userEntryCacheModel.userName = null;
		}

		userEntryCacheModel.mobileNumber = getMobileNumber();

		String mobileNumber = userEntryCacheModel.mobileNumber;

		if ((mobileNumber != null) && (mobileNumber.length() == 0)) {
			userEntryCacheModel.mobileNumber = null;
		}

		userEntryCacheModel.companyId = getCompanyId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			userEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			userEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			userEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			userEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		userEntryCacheModel.status = getStatus();

		return userEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", mobileNumber=");
		sb.append(getMobileNumber());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("vn.com.fis.portal.model.UserEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mobileNumber</column-name><column-value><![CDATA[");
		sb.append(getMobileNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = UserEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			UserEntry.class
		};
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private String _originalUserName;
	private String _mobileNumber;
	private String _originalMobileNumber;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private UserEntry _escapedModelProxy;
}