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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ContactGroupVideoGroupEntry service. Represents a row in the &quot;TBL_CONTACT_GROUP_VIDEO_GROUP&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.fis.portal.model.impl.ContactGroupVideoGroupEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.fis.portal.model.impl.ContactGroupVideoGroupEntryImpl}.
 * </p>
 *
 * @author loind
 * @see ContactGroupVideoGroupEntry
 * @see vn.com.fis.portal.model.impl.ContactGroupVideoGroupEntryImpl
 * @see vn.com.fis.portal.model.impl.ContactGroupVideoGroupEntryModelImpl
 * @generated
 */
public interface ContactGroupVideoGroupEntryModel extends BaseModel<ContactGroupVideoGroupEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contact group video group entry model instance should use the {@link ContactGroupVideoGroupEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this contact group video group entry.
	 *
	 * @return the primary key of this contact group video group entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contact group video group entry.
	 *
	 * @param primaryKey the primary key of this contact group video group entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the contact group video group entry ID of this contact group video group entry.
	 *
	 * @return the contact group video group entry ID of this contact group video group entry
	 */
	public long getContactGroupVideoGroupEntryId();

	/**
	 * Sets the contact group video group entry ID of this contact group video group entry.
	 *
	 * @param contactGroupVideoGroupEntryId the contact group video group entry ID of this contact group video group entry
	 */
	public void setContactGroupVideoGroupEntryId(
		long contactGroupVideoGroupEntryId);

	/**
	 * Returns the contact group ID of this contact group video group entry.
	 *
	 * @return the contact group ID of this contact group video group entry
	 */
	public long getContactGroupId();

	/**
	 * Sets the contact group ID of this contact group video group entry.
	 *
	 * @param contactGroupId the contact group ID of this contact group video group entry
	 */
	public void setContactGroupId(long contactGroupId);

	/**
	 * Returns the video group ID of this contact group video group entry.
	 *
	 * @return the video group ID of this contact group video group entry
	 */
	public long getVideoGroupId();

	/**
	 * Sets the video group ID of this contact group video group entry.
	 *
	 * @param videoGroupId the video group ID of this contact group video group entry
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

	public int compareTo(
		ContactGroupVideoGroupEntry contactGroupVideoGroupEntry);

	public int hashCode();

	public CacheModel<ContactGroupVideoGroupEntry> toCacheModel();

	public ContactGroupVideoGroupEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}