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

import vn.com.fis.portal.model.ServicePackageEntry;

import java.util.List;

/**
 * The persistence utility for the service package entry service. This utility wraps {@link ServicePackageEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author loind
 * @see ServicePackageEntryPersistence
 * @see ServicePackageEntryPersistenceImpl
 * @generated
 */
public class ServicePackageEntryUtil {
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
	public static void clearCache(ServicePackageEntry servicePackageEntry) {
		getPersistence().clearCache(servicePackageEntry);
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
	public static List<ServicePackageEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServicePackageEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServicePackageEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ServicePackageEntry update(
		ServicePackageEntry servicePackageEntry, boolean merge)
		throws SystemException {
		return getPersistence().update(servicePackageEntry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ServicePackageEntry update(
		ServicePackageEntry servicePackageEntry, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(servicePackageEntry, merge, serviceContext);
	}

	/**
	* Caches the service package entry in the entity cache if it is enabled.
	*
	* @param servicePackageEntry the service package entry
	*/
	public static void cacheResult(
		vn.com.fis.portal.model.ServicePackageEntry servicePackageEntry) {
		getPersistence().cacheResult(servicePackageEntry);
	}

	/**
	* Caches the service package entries in the entity cache if it is enabled.
	*
	* @param servicePackageEntries the service package entries
	*/
	public static void cacheResult(
		java.util.List<vn.com.fis.portal.model.ServicePackageEntry> servicePackageEntries) {
		getPersistence().cacheResult(servicePackageEntries);
	}

	/**
	* Creates a new service package entry with the primary key. Does not add the service package entry to the database.
	*
	* @param servicePackageId the primary key for the new service package entry
	* @return the new service package entry
	*/
	public static vn.com.fis.portal.model.ServicePackageEntry create(
		long servicePackageId) {
		return getPersistence().create(servicePackageId);
	}

	/**
	* Removes the service package entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param servicePackageId the primary key of the service package entry
	* @return the service package entry that was removed
	* @throws vn.com.fis.portal.NoSuchServicePackageEntryException if a service package entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServicePackageEntry remove(
		long servicePackageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServicePackageEntryException {
		return getPersistence().remove(servicePackageId);
	}

	public static vn.com.fis.portal.model.ServicePackageEntry updateImpl(
		vn.com.fis.portal.model.ServicePackageEntry servicePackageEntry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(servicePackageEntry, merge);
	}

	/**
	* Returns the service package entry with the primary key or throws a {@link vn.com.fis.portal.NoSuchServicePackageEntryException} if it could not be found.
	*
	* @param servicePackageId the primary key of the service package entry
	* @return the service package entry
	* @throws vn.com.fis.portal.NoSuchServicePackageEntryException if a service package entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServicePackageEntry findByPrimaryKey(
		long servicePackageId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServicePackageEntryException {
		return getPersistence().findByPrimaryKey(servicePackageId);
	}

	/**
	* Returns the service package entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param servicePackageId the primary key of the service package entry
	* @return the service package entry, or <code>null</code> if a service package entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServicePackageEntry fetchByPrimaryKey(
		long servicePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(servicePackageId);
	}

	/**
	* Returns all the service package entries.
	*
	* @return the service package entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.ServicePackageEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the service package entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of service package entries
	* @param end the upper bound of the range of service package entries (not inclusive)
	* @return the range of service package entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.ServicePackageEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the service package entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of service package entries
	* @param end the upper bound of the range of service package entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service package entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.ServicePackageEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the service package entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service package entries.
	*
	* @return the number of service package entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServicePackageEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServicePackageEntryPersistence)PortletBeanLocatorUtil.locate(vn.com.fis.portal.service.ClpSerializer.getServletContextName(),
					ServicePackageEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(ServicePackageEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ServicePackageEntryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ServicePackageEntryUtil.class,
			"_persistence");
	}

	private static ServicePackageEntryPersistence _persistence;
}