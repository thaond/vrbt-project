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

import vn.com.fis.portal.model.ViolationEntry;
import vn.com.fis.portal.model.ViolationEntryModel;
import vn.com.fis.portal.model.ViolationEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the ViolationEntry service. Represents a row in the &quot;TBL_VIOLATION&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.fis.portal.model.ViolationEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ViolationEntryImpl}.
 * </p>
 *
 * @author loind
 * @see ViolationEntryImpl
 * @see vn.com.fis.portal.model.ViolationEntry
 * @see vn.com.fis.portal.model.ViolationEntryModel
 * @generated
 */
@JSON(strict = true)
public class ViolationEntryModelImpl extends BaseModelImpl<ViolationEntry>
	implements ViolationEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a violation entry model instance should use the {@link vn.com.fis.portal.model.ViolationEntry} interface instead.
	 */
	public static final String TABLE_NAME = "TBL_VIOLATION";
	public static final Object[][] TABLE_COLUMNS = {
			{ "violationId", Types.BIGINT },
			{ "violationTitle", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TBL_VIOLATION (violationId LONG not null primary key,violationTitle VARCHAR(75) null,description VARCHAR(75) null,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TBL_VIOLATION";
	public static final String ORDER_BY_JPQL = " ORDER BY violationEntry.violationTitle ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TBL_VIOLATION.violationTitle ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.fis.portal.model.ViolationEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.fis.portal.model.ViolationEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.fis.portal.model.ViolationEntry"),
			true);
	public static long VIOLATIONTITLE_COLUMN_BITMASK = 1L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ViolationEntry toModel(ViolationEntrySoap soapModel) {
		ViolationEntry model = new ViolationEntryImpl();

		model.setViolationId(soapModel.getViolationId());
		model.setViolationTitle(soapModel.getViolationTitle());
		model.setDescription(soapModel.getDescription());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ViolationEntry> toModels(ViolationEntrySoap[] soapModels) {
		List<ViolationEntry> models = new ArrayList<ViolationEntry>(soapModels.length);

		for (ViolationEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.fis.portal.model.ViolationEntry"));

	public ViolationEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _violationId;
	}

	public void setPrimaryKey(long primaryKey) {
		setViolationId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_violationId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return ViolationEntry.class;
	}

	public String getModelClassName() {
		return ViolationEntry.class.getName();
	}

	@JSON
	public long getViolationId() {
		return _violationId;
	}

	public void setViolationId(long violationId) {
		_violationId = violationId;
	}

	@JSON
	public String getViolationTitle() {
		if (_violationTitle == null) {
			return StringPool.BLANK;
		}
		else {
			return _violationTitle;
		}
	}

	public void setViolationTitle(String violationTitle) {
		_columnBitmask = -1L;

		if (_originalViolationTitle == null) {
			_originalViolationTitle = _violationTitle;
		}

		_violationTitle = violationTitle;
	}

	public String getOriginalViolationTitle() {
		return GetterUtil.getString(_originalViolationTitle);
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
	public ViolationEntry toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (ViolationEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					ViolationEntry.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ViolationEntryImpl violationEntryImpl = new ViolationEntryImpl();

		violationEntryImpl.setViolationId(getViolationId());
		violationEntryImpl.setViolationTitle(getViolationTitle());
		violationEntryImpl.setDescription(getDescription());
		violationEntryImpl.setStatus(getStatus());

		violationEntryImpl.resetOriginalValues();

		return violationEntryImpl;
	}

	public int compareTo(ViolationEntry violationEntry) {
		int value = 0;

		value = getViolationTitle().compareTo(violationEntry.getViolationTitle());

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

		ViolationEntry violationEntry = null;

		try {
			violationEntry = (ViolationEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = violationEntry.getPrimaryKey();

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
		ViolationEntryModelImpl violationEntryModelImpl = this;

		violationEntryModelImpl._originalViolationTitle = violationEntryModelImpl._violationTitle;

		violationEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<ViolationEntry> toCacheModel() {
		ViolationEntryCacheModel violationEntryCacheModel = new ViolationEntryCacheModel();

		violationEntryCacheModel.violationId = getViolationId();

		violationEntryCacheModel.violationTitle = getViolationTitle();

		String violationTitle = violationEntryCacheModel.violationTitle;

		if ((violationTitle != null) && (violationTitle.length() == 0)) {
			violationEntryCacheModel.violationTitle = null;
		}

		violationEntryCacheModel.description = getDescription();

		String description = violationEntryCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			violationEntryCacheModel.description = null;
		}

		violationEntryCacheModel.status = getStatus();

		return violationEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{violationId=");
		sb.append(getViolationId());
		sb.append(", violationTitle=");
		sb.append(getViolationTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("vn.com.fis.portal.model.ViolationEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>violationId</column-name><column-value><![CDATA[");
		sb.append(getViolationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>violationTitle</column-name><column-value><![CDATA[");
		sb.append(getViolationTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ViolationEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			ViolationEntry.class
		};
	private long _violationId;
	private String _violationTitle;
	private String _originalViolationTitle;
	private String _description;
	private int _status;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private ViolationEntry _escapedModelProxy;
}