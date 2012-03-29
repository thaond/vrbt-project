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

import vn.com.fis.portal.model.ServiceEntry;
import vn.com.fis.portal.model.ServiceEntryModel;
import vn.com.fis.portal.model.ServiceEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the ServiceEntry service. Represents a row in the &quot;TBL_SERVICE&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.fis.portal.model.ServiceEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ServiceEntryImpl}.
 * </p>
 *
 * @author loind
 * @see ServiceEntryImpl
 * @see vn.com.fis.portal.model.ServiceEntry
 * @see vn.com.fis.portal.model.ServiceEntryModel
 * @generated
 */
@JSON(strict = true)
public class ServiceEntryModelImpl extends BaseModelImpl<ServiceEntry>
	implements ServiceEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a service entry model instance should use the {@link vn.com.fis.portal.model.ServiceEntry} interface instead.
	 */
	public static final String TABLE_NAME = "TBL_SERVICE";
	public static final Object[][] TABLE_COLUMNS = {
			{ "serviceId", Types.BIGINT },
			{ "serviceCode", Types.VARCHAR },
			{ "serviceName", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TBL_SERVICE (serviceId LONG not null primary key,serviceCode VARCHAR(75) null,serviceName VARCHAR(75) null,description VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TBL_SERVICE";
	public static final String ORDER_BY_JPQL = " ORDER BY serviceEntry.serviceName ASC, serviceEntry.serviceCode ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TBL_SERVICE.serviceName ASC, TBL_SERVICE.serviceCode ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.fis.portal.model.ServiceEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.fis.portal.model.ServiceEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.fis.portal.model.ServiceEntry"),
			true);
	public static long SERVICECODE_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ServiceEntry toModel(ServiceEntrySoap soapModel) {
		ServiceEntry model = new ServiceEntryImpl();

		model.setServiceId(soapModel.getServiceId());
		model.setServiceCode(soapModel.getServiceCode());
		model.setServiceName(soapModel.getServiceName());
		model.setDescription(soapModel.getDescription());
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
	public static List<ServiceEntry> toModels(ServiceEntrySoap[] soapModels) {
		List<ServiceEntry> models = new ArrayList<ServiceEntry>(soapModels.length);

		for (ServiceEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.fis.portal.model.ServiceEntry"));

	public ServiceEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _serviceId;
	}

	public void setPrimaryKey(long primaryKey) {
		setServiceId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_serviceId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return ServiceEntry.class;
	}

	public String getModelClassName() {
		return ServiceEntry.class.getName();
	}

	@JSON
	public long getServiceId() {
		return _serviceId;
	}

	public void setServiceId(long serviceId) {
		_serviceId = serviceId;
	}

	@JSON
	public String getServiceCode() {
		if (_serviceCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _serviceCode;
		}
	}

	public void setServiceCode(String serviceCode) {
		_columnBitmask = -1L;

		if (_originalServiceCode == null) {
			_originalServiceCode = _serviceCode;
		}

		_serviceCode = serviceCode;
	}

	public String getOriginalServiceCode() {
		return GetterUtil.getString(_originalServiceCode);
	}

	@JSON
	public String getServiceName() {
		if (_serviceName == null) {
			return StringPool.BLANK;
		}
		else {
			return _serviceName;
		}
	}

	public void setServiceName(String serviceName) {
		_columnBitmask = -1L;

		_serviceName = serviceName;
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
		_status = status;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ServiceEntry toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ServiceEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ServiceEntry.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ServiceEntryImpl serviceEntryImpl = new ServiceEntryImpl();

		serviceEntryImpl.setServiceId(getServiceId());
		serviceEntryImpl.setServiceCode(getServiceCode());
		serviceEntryImpl.setServiceName(getServiceName());
		serviceEntryImpl.setDescription(getDescription());
		serviceEntryImpl.setCreateDate(getCreateDate());
		serviceEntryImpl.setModifiedDate(getModifiedDate());
		serviceEntryImpl.setStatus(getStatus());

		serviceEntryImpl.resetOriginalValues();

		return serviceEntryImpl;
	}

	public int compareTo(ServiceEntry serviceEntry) {
		int value = 0;

		value = getServiceName().compareTo(serviceEntry.getServiceName());

		if (value != 0) {
			return value;
		}

		value = getServiceCode().compareTo(serviceEntry.getServiceCode());

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

		ServiceEntry serviceEntry = null;

		try {
			serviceEntry = (ServiceEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = serviceEntry.getPrimaryKey();

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
		ServiceEntryModelImpl serviceEntryModelImpl = this;

		serviceEntryModelImpl._originalServiceCode = serviceEntryModelImpl._serviceCode;

		serviceEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ServiceEntry> toCacheModel() {
		ServiceEntryCacheModel serviceEntryCacheModel = new ServiceEntryCacheModel();

		serviceEntryCacheModel.serviceId = getServiceId();

		serviceEntryCacheModel.serviceCode = getServiceCode();

		String serviceCode = serviceEntryCacheModel.serviceCode;

		if ((serviceCode != null) && (serviceCode.length() == 0)) {
			serviceEntryCacheModel.serviceCode = null;
		}

		serviceEntryCacheModel.serviceName = getServiceName();

		String serviceName = serviceEntryCacheModel.serviceName;

		if ((serviceName != null) && (serviceName.length() == 0)) {
			serviceEntryCacheModel.serviceName = null;
		}

		serviceEntryCacheModel.description = getDescription();

		String description = serviceEntryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			serviceEntryCacheModel.description = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			serviceEntryCacheModel.createDate = createDate.getTime();
		}
		else {
			serviceEntryCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			serviceEntryCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			serviceEntryCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		serviceEntryCacheModel.status = getStatus();

		return serviceEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{serviceId=");
		sb.append(getServiceId());
		sb.append(", serviceCode=");
		sb.append(getServiceCode());
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", description=");
		sb.append(getDescription());
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
		sb.append("vn.com.fis.portal.model.ServiceEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>serviceId</column-name><column-value><![CDATA[");
		sb.append(getServiceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceCode</column-name><column-value><![CDATA[");
		sb.append(getServiceCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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

	private static ClassLoader _classLoader = ServiceEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ServiceEntry.class
		};
	private long _serviceId;
	private String _serviceCode;
	private String _originalServiceCode;
	private String _serviceName;
	private String _description;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ServiceEntry _escapedModelProxy;
}