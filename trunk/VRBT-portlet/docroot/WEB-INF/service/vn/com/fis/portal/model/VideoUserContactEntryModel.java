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

import java.util.Date;

/**
 * The base model interface for the VideoUserContactEntry service. Represents a row in the &quot;TBL_VIDEO_USER_CONTACT&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.fis.portal.model.impl.VideoUserContactEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.fis.portal.model.impl.VideoUserContactEntryImpl}.
 * </p>
 *
 * @author loind
 * @see VideoUserContactEntry
 * @see vn.com.fis.portal.model.impl.VideoUserContactEntryImpl
 * @see vn.com.fis.portal.model.impl.VideoUserContactEntryModelImpl
 * @generated
 */
public interface VideoUserContactEntryModel extends BaseModel<VideoUserContactEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a video user contact entry model instance should use the {@link VideoUserContactEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this video user contact entry.
	 *
	 * @return the primary key of this video user contact entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this video user contact entry.
	 *
	 * @param primaryKey the primary key of this video user contact entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the video user contact ID of this video user contact entry.
	 *
	 * @return the video user contact ID of this video user contact entry
	 */
	public long getVideoUserContactId();

	/**
	 * Sets the video user contact ID of this video user contact entry.
	 *
	 * @param videoUserContactId the video user contact ID of this video user contact entry
	 */
	public void setVideoUserContactId(long videoUserContactId);

	/**
	 * Returns the video user ID of this video user contact entry.
	 *
	 * @return the video user ID of this video user contact entry
	 */
	public long getVideoUserId();

	/**
	 * Sets the video user ID of this video user contact entry.
	 *
	 * @param videoUserId the video user ID of this video user contact entry
	 */
	public void setVideoUserId(long videoUserId);

	/**
	 * Returns the video user uuid of this video user contact entry.
	 *
	 * @return the video user uuid of this video user contact entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getVideoUserUuid() throws SystemException;

	/**
	 * Sets the video user uuid of this video user contact entry.
	 *
	 * @param videoUserUuid the video user uuid of this video user contact entry
	 */
	public void setVideoUserUuid(String videoUserUuid);

	/**
	 * Returns the contact ID of this video user contact entry.
	 *
	 * @return the contact ID of this video user contact entry
	 */
	public long getContactId();

	/**
	 * Sets the contact ID of this video user contact entry.
	 *
	 * @param contactId the contact ID of this video user contact entry
	 */
	public void setContactId(long contactId);

	/**
	 * Returns the company ID of this video user contact entry.
	 *
	 * @return the company ID of this video user contact entry
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this video user contact entry.
	 *
	 * @param companyId the company ID of this video user contact entry
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the start time of this video user contact entry.
	 *
	 * @return the start time of this video user contact entry
	 */
	public Date getStartTime();

	/**
	 * Sets the start time of this video user contact entry.
	 *
	 * @param startTime the start time of this video user contact entry
	 */
	public void setStartTime(Date startTime);

	/**
	 * Returns the end time of this video user contact entry.
	 *
	 * @return the end time of this video user contact entry
	 */
	public Date getEndTime();

	/**
	 * Sets the end time of this video user contact entry.
	 *
	 * @param endTime the end time of this video user contact entry
	 */
	public void setEndTime(Date endTime);

	/**
	 * Returns the priority of this video user contact entry.
	 *
	 * @return the priority of this video user contact entry
	 */
	public int getPriority();

	/**
	 * Sets the priority of this video user contact entry.
	 *
	 * @param priority the priority of this video user contact entry
	 */
	public void setPriority(int priority);

	/**
	 * Returns the status of this video user contact entry.
	 *
	 * @return the status of this video user contact entry
	 */
	public int getStatus();

	/**
	 * Sets the status of this video user contact entry.
	 *
	 * @param status the status of this video user contact entry
	 */
	public void setStatus(int status);

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

	public int compareTo(VideoUserContactEntry videoUserContactEntry);

	public int hashCode();

	public CacheModel<VideoUserContactEntry> toCacheModel();

	public VideoUserContactEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}