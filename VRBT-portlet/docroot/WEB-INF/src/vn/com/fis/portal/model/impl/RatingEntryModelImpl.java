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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.com.fis.portal.model.RatingEntry;
import vn.com.fis.portal.model.RatingEntryModel;
import vn.com.fis.portal.model.RatingEntrySoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the RatingEntry service. Represents a row in the &quot;TBL_RATING&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.fis.portal.model.RatingEntryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RatingEntryImpl}.
 * </p>
 *
 * @author loind
 * @see RatingEntryImpl
 * @see vn.com.fis.portal.model.RatingEntry
 * @see vn.com.fis.portal.model.RatingEntryModel
 * @generated
 */
@JSON(strict = true)
public class RatingEntryModelImpl extends BaseModelImpl<RatingEntry>
	implements RatingEntryModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a rating entry model instance should use the {@link vn.com.fis.portal.model.RatingEntry} interface instead.
	 */
	public static final String TABLE_NAME = "TBL_RATING";
	public static final Object[][] TABLE_COLUMNS = {
			{ "ratingId", Types.BIGINT },
			{ "videoId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "code", Types.INTEGER },
			{ "date_", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table TBL_RATING (ratingId LONG not null primary key,videoId LONG,userId LONG,code INTEGER,date_ DATE null)";
	public static final String TABLE_SQL_DROP = "drop table TBL_RATING";
	public static final String ORDER_BY_JPQL = " ORDER BY ratingEntry.date_ ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TBL_RATING.date_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.fis.portal.model.RatingEntry"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.fis.portal.model.RatingEntry"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.fis.portal.model.RatingEntry"),
			true);
	public static long CODE_COLUMN_BITMASK = 1L;
	public static long DATE__COLUMN_BITMASK = 2L;
	public static long USERID_COLUMN_BITMASK = 4L;
	public static long VIDEOID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static RatingEntry toModel(RatingEntrySoap soapModel) {
		RatingEntry model = new RatingEntryImpl();

		model.setRatingId(soapModel.getRatingId());
		model.setVideoId(soapModel.getVideoId());
		model.setUserId(soapModel.getUserId());
		model.setCode(soapModel.getCode());
		model.setDate_(soapModel.getDate_());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<RatingEntry> toModels(RatingEntrySoap[] soapModels) {
		List<RatingEntry> models = new ArrayList<RatingEntry>(soapModels.length);

		for (RatingEntrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.fis.portal.model.RatingEntry"));

	public RatingEntryModelImpl() {
	}

	public long getPrimaryKey() {
		return _ratingId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRatingId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_ratingId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return RatingEntry.class;
	}

	public String getModelClassName() {
		return RatingEntry.class.getName();
	}

	@JSON
	public long getRatingId() {
		return _ratingId;
	}

	public void setRatingId(long ratingId) {
		_ratingId = ratingId;
	}

	@JSON
	public long getVideoId() {
		return _videoId;
	}

	public void setVideoId(long videoId) {
		_columnBitmask |= VIDEOID_COLUMN_BITMASK;

		if (!_setOriginalVideoId) {
			_setOriginalVideoId = true;

			_originalVideoId = _videoId;
		}

		_videoId = videoId;
	}

	public long getOriginalVideoId() {
		return _originalVideoId;
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
	public int getCode() {
		return _code;
	}

	public void setCode(int code) {
		_columnBitmask |= CODE_COLUMN_BITMASK;

		if (!_setOriginalCode) {
			_setOriginalCode = true;

			_originalCode = _code;
		}

		_code = code;
	}

	public int getOriginalCode() {
		return _originalCode;
	}

	@JSON
	public Date getDate_() {
		return _date_;
	}

	public void setDate_(Date date_) {
		_columnBitmask = -1L;

		if (_originalDate_ == null) {
			_originalDate_ = _date_;
		}

		_date_ = date_;
	}

	public Date getOriginalDate_() {
		return _originalDate_;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public RatingEntry toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (RatingEntry)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					RatingEntry.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		RatingEntryImpl ratingEntryImpl = new RatingEntryImpl();

		ratingEntryImpl.setRatingId(getRatingId());
		ratingEntryImpl.setVideoId(getVideoId());
		ratingEntryImpl.setUserId(getUserId());
		ratingEntryImpl.setCode(getCode());
		ratingEntryImpl.setDate_(getDate_());

		ratingEntryImpl.resetOriginalValues();

		return ratingEntryImpl;
	}

	public int compareTo(RatingEntry ratingEntry) {
		int value = 0;

		value = DateUtil.compareTo(getDate_(), ratingEntry.getDate_());

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

		RatingEntry ratingEntry = null;

		try {
			ratingEntry = (RatingEntry)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = ratingEntry.getPrimaryKey();

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
		RatingEntryModelImpl ratingEntryModelImpl = this;

		ratingEntryModelImpl._originalVideoId = ratingEntryModelImpl._videoId;

		ratingEntryModelImpl._setOriginalVideoId = false;

		ratingEntryModelImpl._originalUserId = ratingEntryModelImpl._userId;

		ratingEntryModelImpl._setOriginalUserId = false;

		ratingEntryModelImpl._originalCode = ratingEntryModelImpl._code;

		ratingEntryModelImpl._setOriginalCode = false;

		ratingEntryModelImpl._originalDate_ = ratingEntryModelImpl._date_;

		ratingEntryModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<RatingEntry> toCacheModel() {
		RatingEntryCacheModel ratingEntryCacheModel = new RatingEntryCacheModel();

		ratingEntryCacheModel.ratingId = getRatingId();

		ratingEntryCacheModel.videoId = getVideoId();

		ratingEntryCacheModel.userId = getUserId();

		ratingEntryCacheModel.code = getCode();

		Date date_ = getDate_();

		if (date_ != null) {
			ratingEntryCacheModel.date_ = date_.getTime();
		}
		else {
			ratingEntryCacheModel.date_ = Long.MIN_VALUE;
		}

		return ratingEntryCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{ratingId=");
		sb.append(getRatingId());
		sb.append(", videoId=");
		sb.append(getVideoId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", date_=");
		sb.append(getDate_());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("vn.com.fis.portal.model.RatingEntry");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>ratingId</column-name><column-value><![CDATA[");
		sb.append(getRatingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>videoId</column-name><column-value><![CDATA[");
		sb.append(getVideoId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>date_</column-name><column-value><![CDATA[");
		sb.append(getDate_());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = RatingEntry.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			RatingEntry.class
		};
	private long _ratingId;
	private long _videoId;
	private long _originalVideoId;
	private boolean _setOriginalVideoId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private int _code;
	private int _originalCode;
	private boolean _setOriginalCode;
	private Date _date_;
	private Date _originalDate_;
	private transient ExpandoBridge _expandoBridge;
	private long _columnBitmask;
	private RatingEntry _escapedModelProxy;
}