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

package vn.com.fis.portal.model;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the VideoUserVideoGroupEntry service. Represents a row in the &quot;TBL_VIDEO_USER_VIDEO_GROUP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.fis.portal.model.impl.VideoUserVideoGroupEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.fis.portal.model.impl.VideoUserVideoGroupEntryImpl}.
 * </p>
 *
 * @author loind
 * @see VideoUserVideoGroupEntry
 * @see vn.com.fis.portal.model.impl.VideoUserVideoGroupEntryImpl
 * @see vn.com.fis.portal.model.impl.VideoUserVideoGroupEntryModelImpl
 * @generated
 */
public interface VideoUserVideoGroupEntryModel extends BaseModel<VideoUserVideoGroupEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a video user video group entry model instance should use the {@link VideoUserVideoGroupEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this video user video group entry.
	 *
	 * @return the primary key of this video user video group entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this video user video group entry.
	 *
	 * @param primaryKey the primary key of this video user video group entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the video user video group i d of this video user video group entry.
	 *
	 * @return the video user video group i d of this video user video group entry
	 */
	public long getVideoUserVideoGroupID();

	/**
	 * Sets the video user video group i d of this video user video group entry.
	 *
	 * @param videoUserVideoGroupID the video user video group i d of this video user video group entry
	 */
	public void setVideoUserVideoGroupID(long videoUserVideoGroupID);

	/**
	 * Returns the video user ID of this video user video group entry.
	 *
	 * @return the video user ID of this video user video group entry
	 */
	public long getVideoUserId();

	/**
	 * Sets the video user ID of this video user video group entry.
	 *
	 * @param videoUserId the video user ID of this video user video group entry
	 */
	public void setVideoUserId(long videoUserId);

	/**
	 * Returns the video user uuid of this video user video group entry.
	 *
	 * @return the video user uuid of this video user video group entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getVideoUserUuid() throws SystemException;

	/**
	 * Sets the video user uuid of this video user video group entry.
	 *
	 * @param videoUserUuid the video user uuid of this video user video group entry
	 */
	public void setVideoUserUuid(String videoUserUuid);

	/**
	 * Returns the video group ID of this video user video group entry.
	 *
	 * @return the video group ID of this video user video group entry
	 */
	public long getVideoGroupId();

	/**
	 * Sets the video group ID of this video user video group entry.
	 *
	 * @param videoGroupId the video group ID of this video user video group entry
	 */
	public void setVideoGroupId(long videoGroupId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(VideoUserVideoGroupEntry videoUserVideoGroupEntry);

	public int hashCode();

	public CacheModel<VideoUserVideoGroupEntry> toCacheModel();

	public VideoUserVideoGroupEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}