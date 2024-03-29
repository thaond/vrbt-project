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

package vn.com.fis.portal.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.fis.portal.model.NotificationEntry;

/**
 * The persistence interface for the notification entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author loind
 * @see NotificationEntryPersistenceImpl
 * @see NotificationEntryUtil
 * @generated
 */
public interface NotificationEntryPersistence extends BasePersistence<NotificationEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NotificationEntryUtil} to access the notification entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the notification entry in the entity cache if it is enabled.
	*
	* @param notificationEntry the notification entry
	*/
	public void cacheResult(
		vn.com.fis.portal.model.NotificationEntry notificationEntry);

	/**
	* Caches the notification entries in the entity cache if it is enabled.
	*
	* @param notificationEntries the notification entries
	*/
	public void cacheResult(
		java.util.List<vn.com.fis.portal.model.NotificationEntry> notificationEntries);

	/**
	* Creates a new notification entry with the primary key. Does not add the notification entry to the database.
	*
	* @param notificationId the primary key for the new notification entry
	* @return the new notification entry
	*/
	public vn.com.fis.portal.model.NotificationEntry create(long notificationId);

	/**
	* Removes the notification entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param notificationId the primary key of the notification entry
	* @return the notification entry that was removed
	* @throws vn.com.fis.portal.NoSuchNotificationEntryException if a notification entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.NotificationEntry remove(long notificationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchNotificationEntryException;

	public vn.com.fis.portal.model.NotificationEntry updateImpl(
		vn.com.fis.portal.model.NotificationEntry notificationEntry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the notification entry with the primary key or throws a {@link vn.com.fis.portal.NoSuchNotificationEntryException} if it could not be found.
	*
	* @param notificationId the primary key of the notification entry
	* @return the notification entry
	* @throws vn.com.fis.portal.NoSuchNotificationEntryException if a notification entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.NotificationEntry findByPrimaryKey(
		long notificationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchNotificationEntryException;

	/**
	* Returns the notification entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param notificationId the primary key of the notification entry
	* @return the notification entry, or <code>null</code> if a notification entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.NotificationEntry fetchByPrimaryKey(
		long notificationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the notification entries where userIdFrom = &#63; and userIdTo = &#63;.
	*
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @return the matching notification entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.NotificationEntry> findByUserIdFrom_UserIdTo(
		long userIdFrom, long userIdTo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the notification entries where userIdFrom = &#63; and userIdTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @param start the lower bound of the range of notification entries
	* @param end the upper bound of the range of notification entries (not inclusive)
	* @return the range of matching notification entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.NotificationEntry> findByUserIdFrom_UserIdTo(
		long userIdFrom, long userIdTo, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the notification entries where userIdFrom = &#63; and userIdTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @param start the lower bound of the range of notification entries
	* @param end the upper bound of the range of notification entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching notification entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.NotificationEntry> findByUserIdFrom_UserIdTo(
		long userIdFrom, long userIdTo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first notification entry in the ordered set where userIdFrom = &#63; and userIdTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching notification entry
	* @throws vn.com.fis.portal.NoSuchNotificationEntryException if a matching notification entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.NotificationEntry findByUserIdFrom_UserIdTo_First(
		long userIdFrom, long userIdTo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchNotificationEntryException;

	/**
	* Returns the last notification entry in the ordered set where userIdFrom = &#63; and userIdTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching notification entry
	* @throws vn.com.fis.portal.NoSuchNotificationEntryException if a matching notification entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.NotificationEntry findByUserIdFrom_UserIdTo_Last(
		long userIdFrom, long userIdTo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchNotificationEntryException;

	/**
	* Returns the notification entries before and after the current notification entry in the ordered set where userIdFrom = &#63; and userIdTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param notificationId the primary key of the current notification entry
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next notification entry
	* @throws vn.com.fis.portal.NoSuchNotificationEntryException if a notification entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.NotificationEntry[] findByUserIdFrom_UserIdTo_PrevAndNext(
		long notificationId, long userIdFrom, long userIdTo,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchNotificationEntryException;

	/**
	* Returns all the notification entries.
	*
	* @return the notification entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.NotificationEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the notification entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of notification entries
	* @param end the upper bound of the range of notification entries (not inclusive)
	* @return the range of notification entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.NotificationEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the notification entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of notification entries
	* @param end the upper bound of the range of notification entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notification entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.NotificationEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the notification entries where userIdFrom = &#63; and userIdTo = &#63; from the database.
	*
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserIdFrom_UserIdTo(long userIdFrom, long userIdTo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the notification entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of notification entries where userIdFrom = &#63; and userIdTo = &#63;.
	*
	* @param userIdFrom the user ID from
	* @param userIdTo the user ID to
	* @return the number of matching notification entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserIdFrom_UserIdTo(long userIdFrom, long userIdTo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of notification entries.
	*
	* @return the number of notification entries
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}