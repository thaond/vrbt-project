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

import vn.com.fis.portal.model.ServicePackageEntry;
import vn.com.fis.portal.model.ServicePackageEntryModel;
import vn.com.fis.portal.model.ServicePackageEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the ServicePackageEntry service. Represents a row in the &quot;TBL_SERVICE_PACKAGE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.fis.portal.model.ServicePackageEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServicePackageEntryImpl}.
 * </p>
 *
 * @author loind
 * @see ServicePackageEntryImpl
 * @see vn.com.fis.portal.model.ServicePackageEntry
 * @see vn.com.fis.portal.model.ServicePackageEntryModel
 * @generated
 */
@JSON(strict = true)
public class ServicePackageEntryModelImpl extends BaseModelImpl<ServicePackageEntry>
	implements ServicePackageEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service package entry model instance should use the {@link vn.com.fis.portal.model.ServicePackageEntry} interface instead.
	 */
	public static final String TABLE_NAME = "TBL_SERVICE_PACKAGE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "servicePackageId", Types.BIGINT },
			{ "servicePackageName", Types.VARCHAR },
			{ "servicePackageCode", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "totalFile", Types.INTEGER },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "serviceId", Types.BIGINT },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TBL_SERVICE_PACKAGE (servicePackageId LONG not null primary key,servicePackageName VARCHAR(75) null,servicePackageCode VARCHAR(75) null,description VARCHAR(75) null,totalFile INTEGER,createDate DATE null,modifiedDate DATE null,serviceId LONG,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TBL_SERVICE_PACKAGE";
	public static final String ORDER_BY_JPQL = " ORDER BY servicePackageEntry.servicePackageName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TBL_SERVICE_PACKAGE.servicePackageName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.fis.portal.model.ServicePackageEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.fis.portal.model.ServicePackageEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.fis.portal.model.ServicePackageEntry"),
			true);
	public static long SERVICEID_COLUMN_BITMASK = 1L;
	public static long SERVICEPACKAGECODE_COLUMN_BITMASK = 2L;
	public static long SERVICEPACKAGENAME_COLUMN_BITMASK = 4L;
	public static long STATUS_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ServicePackageEntry toModel(ServicePackageEntrySoap soapModel) {
		ServicePackageEntry model = new ServicePackageEntryImpl();

		model.setServicePackageId(soapModel.getServicePackageId());
		model.setServicePackageName(soapModel.getServicePackageName());
		model.setServicePackageCode(soapModel.getServicePackageCode());
		model.setDescription(soapModel.getDescription());
		model.setTotalFile(soapModel.getTotalFile());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setServiceId(soapModel.getServiceId());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ServicePackageEntry> toModels(
		ServicePackageEntrySoap[] soapModels) {
		List<ServicePackageEntry> models = new ArrayList<ServicePackageEntry>(soapModels.length);

		for (ServicePackageEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.fis.portal.model.ServicePackageEntry"));

	public ServicePackageEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _servicePackageId;
	}

	public void setPrimaryKey(long primaryKey) {
		setServicePackageId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_servicePackageId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return ServicePackageEntry.class;
	}

	public String getModelClassName() {
		return ServicePackageEntry.class.getName();
	}

	@JSON
	public long getServicePackageId() {
		return _servicePackageId;
	}

	public void setServicePackageId(long servicePackageId) {
		_servicePackageId = servicePackageId;
	}

	@JSON
	public String getServicePackageName() {
		if (_servicePackageName == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicePackageName;
		}
	}

	public void setServicePackageName(String servicePackageName) {
		_columnBitmask = -1L;

		if (_originalServicePackageName == null) {
			_originalServicePackageName = _servicePackageName;
		}

		_servicePackageName = servicePackageName;
	}

	public String getOriginalServicePackageName() {
		return GetterUtil.getString(_originalServicePackageName);
	}

	@JSON
	public String getServicePackageCode() {
		if (_servicePackageCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _servicePackageCode;
		}
	}

	public void setServicePackageCode(String servicePackageCode) {
		_columnBitmask |= SERVICEPACKAGECODE_COLUMN_BITMASK;

		if (_originalServicePackageCode == null) {
			_originalServicePackageCode = _servicePackageCode;
		}

		_servicePackageCode = servicePackageCode;
	}

	public String getOriginalServicePackageCode() {
		return GetterUtil.getString(_originalServicePackageCode);
	}

	@JSON
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	public int getTotalFile() {
		return _totalFile;
	}

	public void setTotalFile(int totalFile) {
		_totalFile = totalFile;
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
	public long getServiceId() {
		return _serviceId;
	}

	public void setServiceId(long serviceId) {
		_columnBitmask |= SERVICEID_COLUMN_BITMASK;

		if (!_setOriginalServiceId) {
			_setOriginalServiceId = true;

			_originalServiceId = _serviceId;
		}

		_serviceId = serviceId;
	}

	public long getOriginalServiceId() {
		return _originalServiceId;
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
	public ServicePackageEntry toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ServicePackageEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ServicePackageEntry.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ServicePackageEntryImpl servicePackageEntryImpl = new ServicePackageEntryImpl();

		servicePackageEntryImpl.setServicePackageId(getServicePackageId());
		servicePackageEntryImpl.setServicePackageName(getServicePackageName());
		servicePackageEntryImpl.setServicePackageCode(getServicePackageCode());
		servicePackageEntryImpl.setDescription(getDescription());
		servicePackageEntryImpl.setTotalFile(getTotalFile());
		servicePackageEntryImpl.setCreateDate(getCreateDate());
		servicePackageEntryImpl.setModifiedDate(getModifiedDate());
		servicePackageEntryImpl.setServiceId(getServiceId());
		servicePackageEntryImpl.setStatus(getStatus());

		servicePackageEntryImpl.resetOriginalValues();

		return servicePackageEntryImpl;
	}

	public int compareTo(ServicePackageEntry servicePackageEntry) {
		int value = 0;

		value = getServicePackageName()
					.compareTo(servicePackageEntry.getServicePackageName());

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

		ServicePackageEntry servicePackageEntry = null;

		try {
			servicePackageEntry = (ServicePackageEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = servicePackageEntry.getPrimaryKey();

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
		ServicePackageEntryModelImpl servicePackageEntryModelImpl = this;

		servicePackageEntryModelImpl._originalServicePackageName = servicePackageEntryModelImpl._servicePackageName;

		servicePackageEntryModelImpl._originalServicePackageCode = servicePackageEntryModelImpl._servicePackageCode;

		servicePackageEntryModelImpl._originalServiceId = servicePackageEntryModelImpl._serviceId;

		servicePackageEntryModelImpl._setOriginalServiceId = false;

		servicePackageEntryModelImpl._originalStatus = servicePackageEntryModelImpl._status;

		servicePackageEntryModelImpl._setOriginalStatus = false;

		servicePackageEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ServicePackageEntry> toCacheModel() {
		ServicePackageEntryCacheModel servicePackageEntryCacheModel = new ServicePackageEntryCacheModel();

		servicePackageEntryCacheModel.servicePackageId = getServicePackageId();

		servicePackageEntryCacheModel.servicePackageName = getServicePackageName();

		String servicePackageName = servicePackageEntryCacheModel.servicePackageName;

		if ((servicePackageName != null) && (servicePackageName.length() == 0)) {
			servicePackageEntryCacheModel.servicePackageName = null;
		}

		servicePackageEntryCacheModel.servicePackageCode = getServicePackageCode();

		String servicePackageCode = servicePackageEntryCacheModel.servicePackageCode;

		if ((servicePackageCode != null) && (servicePackageCode.length() == 0)) {
			servicePackageEntryCacheModel.servicePackageCode = null;
		}

		servicePackageEntryCacheModel.description = getDescription();

		String description = servicePackageEntryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			servicePackageEntryCacheModel.description = null;
		}

		servicePackageEntryCacheModel.totalFile = getTotalFile();

		Date createDate = getCreateDate();

		if (createDate != null) {
			servicePackageEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			servicePackageEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			servicePackageEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			servicePackageEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		servicePackageEntryCacheModel.serviceId = getServiceId();

		servicePackageEntryCacheModel.status = getStatus();

		return servicePackageEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{servicePackageId=");
		sb.append(getServicePackageId());
		sb.append(", servicePackageName=");
		sb.append(getServicePackageName());
		sb.append(", servicePackageCode=");
		sb.append(getServicePackageCode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", totalFile=");
		sb.append(getTotalFile());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", serviceId=");
		sb.append(getServiceId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("vn.com.fis.portal.model.ServicePackageEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>servicePackageId</column-name><column-value><![CDATA[");
		sb.append(getServicePackageId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicePackageName</column-name><column-value><![CDATA[");
		sb.append(getServicePackageName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicePackageCode</column-name><column-value><![CDATA[");
		sb.append(getServicePackageCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>totalFile</column-name><column-value><![CDATA[");
		sb.append(getTotalFile());
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
			"<column><column-name>serviceId</column-name><column-value><![CDATA[");
		sb.append(getServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ServicePackageEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ServicePackageEntry.class
		};
	private long _servicePackageId;
	private String _servicePackageName;
	private String _originalServicePackageName;
	private String _servicePackageCode;
	private String _originalServicePackageCode;
	private String _description;
	private int _totalFile;
	private Date _createDate;
	private Date _modifiedDate;
	private long _serviceId;
	private long _originalServiceId;
	private boolean _setOriginalServiceId;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ServicePackageEntry _escapedModelProxy;
}