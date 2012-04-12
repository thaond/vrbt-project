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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import vn.com.fis.portal.model.UserEntry;

import java.util.List;

/**
 * The persistence utility for the user entry service. This utility wraps {@link UserEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author loind
 * @see UserEntryPersistence
 * @see UserEntryPersistenceImpl
 * @generated
 */
public class UserEntryUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(UserEntry userEntry) {
		getPersistence().clearCache(userEntry);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<UserEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UserEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UserEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static UserEntry update(UserEntry userEntry, boolean merge)
		throws SystemException {
		return getPersistence().update(userEntry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static UserEntry update(UserEntry userEntry, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(userEntry, merge, serviceContext);
	}

	/**
	* Caches the user entry in the entity cache if it is enabled.
	*
	* @param userEntry the user entry
	*/
	public static void cacheResult(vn.com.fis.portal.model.UserEntry userEntry) {
		getPersistence().cacheResult(userEntry);
	}

	/**
	* Caches the user entries in the entity cache if it is enabled.
	*
	* @param userEntries the user entries
	*/
	public static void cacheResult(
		java.util.List<vn.com.fis.portal.model.UserEntry> userEntries) {
		getPersistence().cacheResult(userEntries);
	}

	/**
	* Creates a new user entry with the primary key. Does not add the user entry to the database.
	*
	* @param userId the primary key for the new user entry
	* @return the new user entry
	*/
	public static vn.com.fis.portal.model.UserEntry create(long userId) {
		return getPersistence().create(userId);
	}

	/**
	* Removes the user entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userId the primary key of the user entry
	* @return the user entry that was removed
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a user entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry remove(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence().remove(userId);
	}

	public static vn.com.fis.portal.model.UserEntry updateImpl(
		vn.com.fis.portal.model.UserEntry userEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(userEntry, merge);
	}

	/**
	* Returns the user entry with the primary key or throws a {@link vn.com.fis.portal.NoSuchUserEntryException} if it could not be found.
	*
	* @param userId the primary key of the user entry
	* @return the user entry
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a user entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry findByPrimaryKey(
		long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence().findByPrimaryKey(userId);
	}

	/**
	* Returns the user entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userId the primary key of the user entry
	* @return the user entry, or <code>null</code> if a user entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry fetchByPrimaryKey(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userId);
	}

	/**
	* Returns the user entry where userName = &#63; or throws a {@link vn.com.fis.portal.NoSuchUserEntryException} if it could not be found.
	*
	* @param userName the user name
	* @return the matching user entry
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry findByUserName(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence().findByUserName(userName);
	}

	/**
	* Returns the user entry where userName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userName the user name
	* @return the matching user entry, or <code>null</code> if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry fetchByUserName(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserName(userName);
	}

	/**
	* Returns the user entry where userName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userName the user name
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user entry, or <code>null</code> if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry fetchByUserName(
		java.lang.String userName, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserName(userName, retrieveFromCache);
	}

	/**
	* Returns the user entry where mobileNumber = &#63; or throws a {@link vn.com.fis.portal.NoSuchUserEntryException} if it could not be found.
	*
	* @param mobileNumber the mobile number
	* @return the matching user entry
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry findByMobileNumber(
		java.lang.String mobileNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence().findByMobileNumber(mobileNumber);
	}

	/**
	* Returns the user entry where mobileNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param mobileNumber the mobile number
	* @return the matching user entry, or <code>null</code> if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry fetchByMobileNumber(
		java.lang.String mobileNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByMobileNumber(mobileNumber);
	}

	/**
	* Returns the user entry where mobileNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param mobileNumber the mobile number
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user entry, or <code>null</code> if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry fetchByMobileNumber(
		java.lang.String mobileNumber, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByMobileNumber(mobileNumber, retrieveFromCache);
	}

	/**
	* Returns the user entry where userId = &#63; or throws a {@link vn.com.fis.portal.NoSuchUserEntryException} if it could not be found.
	*
	* @param userId the user ID
	* @return the matching user entry
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry findByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns the user entry where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param userId the user ID
	* @return the matching user entry, or <code>null</code> if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry fetchByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId);
	}

	/**
	* Returns the user entry where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param userId the user ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching user entry, or <code>null</code> if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry fetchByUserId(long userId,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId(userId, retrieveFromCache);
	}

	/**
	* Returns all the user entries where status = &#63;.
	*
	* @param status the status
	* @return the matching user entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.UserEntry> findByStatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status);
	}

	/**
	* Returns a range of all the user entries where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of user entries
	* @param end the upper bound of the range of user entries (not inclusive)
	* @return the range of matching user entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.UserEntry> findByStatus(
		int status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	* Returns an ordered range of all the user entries where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of user entries
	* @param end the upper bound of the range of user entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching user entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.UserEntry> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByStatus(status, start, end, orderByComparator);
	}

	/**
	* Returns the first user entry in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching user entry
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry findByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	* Returns the last user entry in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching user entry
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a matching user entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry findByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	* Returns the user entries before and after the current user entry in the ordered set where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the primary key of the current user entry
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next user entry
	* @throws vn.com.fis.portal.NoSuchUserEntryException if a user entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.UserEntry[] findByStatus_PrevAndNext(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		return getPersistence()
				   .findByStatus_PrevAndNext(userId, status, orderByComparator);
	}

	/**
	* Returns all the user entries.
	*
	* @return the user entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.UserEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the user entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user entries
	* @param end the upper bound of the range of user entries (not inclusive)
	* @return the range of user entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.UserEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the user entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of user entries
	* @param end the upper bound of the range of user entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of user entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.UserEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the user entry where userName = &#63; from the database.
	*
	* @param userName the user name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserName(java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		getPersistence().removeByUserName(userName);
	}

	/**
	* Removes the user entry where mobileNumber = &#63; from the database.
	*
	* @param mobileNumber the mobile number
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByMobileNumber(java.lang.String mobileNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		getPersistence().removeByMobileNumber(mobileNumber);
	}

	/**
	* Removes the user entry where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchUserEntryException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes all the user entries where status = &#63; from the database.
	*
	* @param status the status
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByStatus(status);
	}

	/**
	* Removes all the user entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of user entries where userName = &#63;.
	*
	* @param userName the user name
	* @return the number of matching user entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserName(java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserName(userName);
	}

	/**
	* Returns the number of user entries where mobileNumber = &#63;.
	*
	* @param mobileNumber the mobile number
	* @return the number of matching user entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByMobileNumber(java.lang.String mobileNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByMobileNumber(mobileNumber);
	}

	/**
	* Returns the number of user entries where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching user entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the number of user entries where status = &#63;.
	*
	* @param status the status
	* @return the number of matching user entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByStatus(int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByStatus(status);
	}

	/**
	* Returns the number of user entries.
	*
	* @return the number of user entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UserEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UserEntryPersistence)PortletBeanLocatorUtil.locate(vn.com.fis.portal.service.ClpSerializer.getServletContextName(),
					UserEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(UserEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(UserEntryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(UserEntryUtil.class, "_persistence");
	}

	private static UserEntryPersistence _persistence;
}