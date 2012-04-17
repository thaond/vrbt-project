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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ContactEntry service. Represents a row in the &quot;TBL_CONTACT&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.fis.portal.model.impl.ContactEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.fis.portal.model.impl.ContactEntryImpl}.
 * </p>
 *
 * @author loind
 * @see ContactEntry
 * @see vn.com.fis.portal.model.impl.ContactEntryImpl
 * @see vn.com.fis.portal.model.impl.ContactEntryModelImpl
 * @generated
 */
public interface ContactEntryModel extends BaseModel<ContactEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a contact entry model instance should use the {@link ContactEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this contact entry.
	 *
	 * @return the primary key of this contact entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this contact entry.
	 *
	 * @param primaryKey the primary key of this contact entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the contact ID of this contact entry.
	 *
	 * @return the contact ID of this contact entry
	 */
	public long getContactId();

	/**
	 * Sets the contact ID of this contact entry.
	 *
	 * @param contactId the contact ID of this contact entry
	 */
	public void setContactId(long contactId);

	/**
	 * Returns the contact name of this contact entry.
	 *
	 * @return the contact name of this contact entry
	 */
	@AutoEscape
	public String getContactName();

	/**
	 * Sets the contact name of this contact entry.
	 *
	 * @param contactName the contact name of this contact entry
	 */
	public void setContactName(String contactName);

	/**
	 * Returns the mobile number of this contact entry.
	 *
	 * @return the mobile number of this contact entry
	 */
	@AutoEscape
	public String getMobileNumber();

	/**
	 * Sets the mobile number of this contact entry.
	 *
	 * @param mobileNumber the mobile number of this contact entry
	 */
	public void setMobileNumber(String mobileNumber);

	/**
	 * Returns the user ID of this contact entry.
	 *
	 * @return the user ID of this contact entry
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this contact entry.
	 *
	 * @param userId the user ID of this contact entry
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this contact entry.
	 *
	 * @return the user uuid of this contact entry
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this contact entry.
	 *
	 * @param userUuid the user uuid of this contact entry
	 */
	public void setUserUuid(String userUuid);

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

	public int compareTo(ContactEntry contactEntry);

	public int hashCode();

	public CacheModel<ContactEntry> toCacheModel();

	public ContactEntry toEscapedModel();

	public String toString();

	public String toXmlString();
}