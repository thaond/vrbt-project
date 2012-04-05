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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.com.fis.portal.model.VideoUserContactEntry;
import vn.com.fis.portal.model.VideoUserContactEntryModel;
import vn.com.fis.portal.model.VideoUserContactEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the VideoUserContactEntry service. Represents a row in the &quot;TBL_VIDEO_USER_CONTACT&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.fis.portal.model.VideoUserContactEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VideoUserContactEntryImpl}.
 * </p>
 *
 * @author loind
 * @see VideoUserContactEntryImpl
 * @see vn.com.fis.portal.model.VideoUserContactEntry
 * @see vn.com.fis.portal.model.VideoUserContactEntryModel
 * @generated
 */
@JSON(strict = true)
public class VideoUserContactEntryModelImpl extends BaseModelImpl<VideoUserContactEntry>
	implements VideoUserContactEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a video user contact entry model instance should use the {@link vn.com.fis.portal.model.VideoUserContactEntry} interface instead.
	 */
	public static final String TABLE_NAME = "TBL_VIDEO_USER_CONTACT";
	public static final Object[][] TABLE_COLUMNS = {
			{ "videoUserContactId", Types.BIGINT },
			{ "videoUserId", Types.BIGINT },
			{ "contactId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "startTime", Types.TIMESTAMP },
			{ "endTime", Types.TIMESTAMP },
			{ "priority", Types.INTEGER },
			{ "status", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table TBL_VIDEO_USER_CONTACT (videoUserContactId LONG not null primary key,videoUserId LONG,contactId LONG,companyId LONG,startTime DATE null,endTime DATE null,priority INTEGER,status INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table TBL_VIDEO_USER_CONTACT";
	public static final String ORDER_BY_JPQL = " ORDER BY videoUserContactEntry.priority ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TBL_VIDEO_USER_CONTACT.priority ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.fis.portal.model.VideoUserContactEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.fis.portal.model.VideoUserContactEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.fis.portal.model.VideoUserContactEntry"),
			true);
	public static long CONTACTID_COLUMN_BITMASK = 1L;
	public static long VIDEOUSERID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static VideoUserContactEntry toModel(
		VideoUserContactEntrySoap soapModel) {
		VideoUserContactEntry model = new VideoUserContactEntryImpl();

		model.setVideoUserContactId(soapModel.getVideoUserContactId());
		model.setVideoUserId(soapModel.getVideoUserId());
		model.setContactId(soapModel.getContactId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setStartTime(soapModel.getStartTime());
		model.setEndTime(soapModel.getEndTime());
		model.setPriority(soapModel.getPriority());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<VideoUserContactEntry> toModels(
		VideoUserContactEntrySoap[] soapModels) {
		List<VideoUserContactEntry> models = new ArrayList<VideoUserContactEntry>(soapModels.length);

		for (VideoUserContactEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.fis.portal.model.VideoUserContactEntry"));

	public VideoUserContactEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _videoUserContactId;
	}

	public void setPrimaryKey(long primaryKey) {
		setVideoUserContactId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_videoUserContactId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return VideoUserContactEntry.class;
	}

	public String getModelClassName() {
		return VideoUserContactEntry.class.getName();
	}

	@JSON
	public long getVideoUserContactId() {
		return _videoUserContactId;
	}

	public void setVideoUserContactId(long videoUserContactId) {
		_videoUserContactId = videoUserContactId;
	}

	@JSON
	public long getVideoUserId() {
		return _videoUserId;
	}

	public void setVideoUserId(long videoUserId) {
		_columnBitmask |= VIDEOUSERID_COLUMN_BITMASK;

		if (!_setOriginalVideoUserId) {
			_setOriginalVideoUserId = true;

			_originalVideoUserId = _videoUserId;
		}

		_videoUserId = videoUserId;
	}

	public String getVideoUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getVideoUserId(), "uuid", _videoUserUuid);
	}

	public void setVideoUserUuid(String videoUserUuid) {
		_videoUserUuid = videoUserUuid;
	}

	public long getOriginalVideoUserId() {
		return _originalVideoUserId;
	}

	@JSON
	public long getContactId() {
		return _contactId;
	}

	public void setContactId(long contactId) {
		_columnBitmask |= CONTACTID_COLUMN_BITMASK;

		if (!_setOriginalContactId) {
			_setOriginalContactId = true;

			_originalContactId = _contactId;
		}

		_contactId = contactId;
	}

	public long getOriginalContactId() {
		return _originalContactId;
	}

	@JSON
	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	public Date getStartTime() {
		return _startTime;
	}

	public void setStartTime(Date startTime) {
		_startTime = startTime;
	}

	@JSON
	public Date getEndTime() {
		return _endTime;
	}

	public void setEndTime(Date endTime) {
		_endTime = endTime;
	}

	@JSON
	public int getPriority() {
		return _priority;
	}

	public void setPriority(int priority) {
		_columnBitmask = -1L;

		_priority = priority;
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
	public VideoUserContactEntry toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (VideoUserContactEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					VideoUserContactEntry.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		VideoUserContactEntryImpl videoUserContactEntryImpl = new VideoUserContactEntryImpl();

		videoUserContactEntryImpl.setVideoUserContactId(getVideoUserContactId());
		videoUserContactEntryImpl.setVideoUserId(getVideoUserId());
		videoUserContactEntryImpl.setContactId(getContactId());
		videoUserContactEntryImpl.setCompanyId(getCompanyId());
		videoUserContactEntryImpl.setStartTime(getStartTime());
		videoUserContactEntryImpl.setEndTime(getEndTime());
		videoUserContactEntryImpl.setPriority(getPriority());
		videoUserContactEntryImpl.setStatus(getStatus());

		videoUserContactEntryImpl.resetOriginalValues();

		return videoUserContactEntryImpl;
	}

	public int compareTo(VideoUserContactEntry videoUserContactEntry) {
		int value = 0;

		if (getPriority() < videoUserContactEntry.getPriority()) {
			value = -1;
		}
		else if (getPriority() > videoUserContactEntry.getPriority()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		VideoUserContactEntry videoUserContactEntry = null;

		try {
			videoUserContactEntry = (VideoUserContactEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = videoUserContactEntry.getPrimaryKey();

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
		VideoUserContactEntryModelImpl videoUserContactEntryModelImpl = this;

		videoUserContactEntryModelImpl._originalVideoUserId = videoUserContactEntryModelImpl._videoUserId;

		videoUserContactEntryModelImpl._setOriginalVideoUserId = false;

		videoUserContactEntryModelImpl._originalContactId = videoUserContactEntryModelImpl._contactId;

		videoUserContactEntryModelImpl._setOriginalContactId = false;

		videoUserContactEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<VideoUserContactEntry> toCacheModel() {
		VideoUserContactEntryCacheModel videoUserContactEntryCacheModel = new VideoUserContactEntryCacheModel();

		videoUserContactEntryCacheModel.videoUserContactId = getVideoUserContactId();

		videoUserContactEntryCacheModel.videoUserId = getVideoUserId();

		videoUserContactEntryCacheModel.contactId = getContactId();

		videoUserContactEntryCacheModel.companyId = getCompanyId();

		Date startTime = getStartTime();

		if (startTime != null) {
			videoUserContactEntryCacheModel.startTime = startTime.getTime();
		}
		else {
			videoUserContactEntryCacheModel.startTime = Long.MIN_VALUE;
		}

		Date endTime = getEndTime();

		if (endTime != null) {
			videoUserContactEntryCacheModel.endTime = endTime.getTime();
		}
		else {
			videoUserContactEntryCacheModel.endTime = Long.MIN_VALUE;
		}

		videoUserContactEntryCacheModel.priority = getPriority();

		videoUserContactEntryCacheModel.status = getStatus();

		return videoUserContactEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{videoUserContactId=");
		sb.append(getVideoUserContactId());
		sb.append(", videoUserId=");
		sb.append(getVideoUserId());
		sb.append(", contactId=");
		sb.append(getContactId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", startTime=");
		sb.append(getStartTime());
		sb.append(", endTime=");
		sb.append(getEndTime());
		sb.append(", priority=");
		sb.append(getPriority());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("vn.com.fis.portal.model.VideoUserContactEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>videoUserContactId</column-name><column-value><![CDATA[");
		sb.append(getVideoUserContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoUserId</column-name><column-value><![CDATA[");
		sb.append(getVideoUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactId</column-name><column-value><![CDATA[");
		sb.append(getContactId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startTime</column-name><column-value><![CDATA[");
		sb.append(getStartTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>endTime</column-name><column-value><![CDATA[");
		sb.append(getEndTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>priority</column-name><column-value><![CDATA[");
		sb.append(getPriority());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = VideoUserContactEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			VideoUserContactEntry.class
		};
	private long _videoUserContactId;
	private long _videoUserId;
	private String _videoUserUuid;
	private long _originalVideoUserId;
	private boolean _setOriginalVideoUserId;
	private long _contactId;
	private long _originalContactId;
	private boolean _setOriginalContactId;
	private long _companyId;
	private Date _startTime;
	private Date _endTime;
	private int _priority;
	private int _status;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private VideoUserContactEntry _escapedModelProxy;
}