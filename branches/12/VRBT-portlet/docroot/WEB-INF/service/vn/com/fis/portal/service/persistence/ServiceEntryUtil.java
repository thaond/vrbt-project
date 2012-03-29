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

import vn.com.fis.portal.model.ServiceEntry;

import java.util.List;

/**
 * The persistence utility for the service entry service. This utility wraps {@link ServiceEntryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author loind
 * @see ServiceEntryPersistence
 * @see ServiceEntryPersistenceImpl
 * @generated
 */
public class ServiceEntryUtil {
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
	public static void clearCache(ServiceEntry serviceEntry) {
		getPersistence().clearCache(serviceEntry);
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
	public static List<ServiceEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ServiceEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ServiceEntry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ServiceEntry update(ServiceEntry serviceEntry, boolean merge)
		throws SystemException {
		return getPersistence().update(serviceEntry, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ServiceEntry update(ServiceEntry serviceEntry, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(serviceEntry, merge, serviceContext);
	}

	/**
	* Caches the service entry in the entity cache if it is enabled.
	*
	* @param serviceEntry the service entry
	*/
	public static void cacheResult(
		vn.com.fis.portal.model.ServiceEntry serviceEntry) {
		getPersistence().cacheResult(serviceEntry);
	}

	/**
	* Caches the service entries in the entity cache if it is enabled.
	*
	* @param serviceEntries the service entries
	*/
	public static void cacheResult(
		java.util.List<vn.com.fis.portal.model.ServiceEntry> serviceEntries) {
		getPersistence().cacheResult(serviceEntries);
	}

	/**
	* Creates a new service entry with the primary key. Does not add the service entry to the database.
	*
	* @param serviceId the primary key for the new service entry
	* @return the new service entry
	*/
	public static vn.com.fis.portal.model.ServiceEntry create(long serviceId) {
		return getPersistence().create(serviceId);
	}

	/**
	* Removes the service entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceId the primary key of the service entry
	* @return the service entry that was removed
	* @throws vn.com.fis.portal.NoSuchServiceEntryException if a service entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServiceEntry remove(long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServiceEntryException {
		return getPersistence().remove(serviceId);
	}

	public static vn.com.fis.portal.model.ServiceEntry updateImpl(
		vn.com.fis.portal.model.ServiceEntry serviceEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(serviceEntry, merge);
	}

	/**
	* Returns the service entry with the primary key or throws a {@link vn.com.fis.portal.NoSuchServiceEntryException} if it could not be found.
	*
	* @param serviceId the primary key of the service entry
	* @return the service entry
	* @throws vn.com.fis.portal.NoSuchServiceEntryException if a service entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServiceEntry findByPrimaryKey(
		long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServiceEntryException {
		return getPersistence().findByPrimaryKey(serviceId);
	}

	/**
	* Returns the service entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param serviceId the primary key of the service entry
	* @return the service entry, or <code>null</code> if a service entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServiceEntry fetchByPrimaryKey(
		long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(serviceId);
	}

	/**
	* Returns the service entry where serviceCode = &#63; or throws a {@link vn.com.fis.portal.NoSuchServiceEntryException} if it could not be found.
	*
	* @param serviceCode the service code
	* @return the matching service entry
	* @throws vn.com.fis.portal.NoSuchServiceEntryException if a matching service entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServiceEntry findByserviceCode(
		java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServiceEntryException {
		return getPersistence().findByserviceCode(serviceCode);
	}

	/**
	* Returns the service entry where serviceCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param serviceCode the service code
	* @return the matching service entry, or <code>null</code> if a matching service entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServiceEntry fetchByserviceCode(
		java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByserviceCode(serviceCode);
	}

	/**
	* Returns the service entry where serviceCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param serviceCode the service code
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching service entry, or <code>null</code> if a matching service entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ServiceEntry fetchByserviceCode(
		java.lang.String serviceCode, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByserviceCode(serviceCode, retrieveFromCache);
	}

	/**
	* Returns all the service entries.
	*
	* @return the service entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.ServiceEntry> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the service entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of service entries
	* @param end the upper bound of the range of service entries (not inclusive)
	* @return the range of service entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.ServiceEntry> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the service entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of service entries
	* @param end the upper bound of the range of service entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of service entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.ServiceEntry> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes the service entry where serviceCode = &#63; from the database.
	*
	* @param serviceCode the service code
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByserviceCode(java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServiceEntryException {
		getPersistence().removeByserviceCode(serviceCode);
	}

	/**
	* Removes all the service entries from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of service entries where serviceCode = &#63;.
	*
	* @param serviceCode the service code
	* @return the number of matching service entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByserviceCode(java.lang.String serviceCode)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByserviceCode(serviceCode);
	}

	/**
	* Returns the number of service entries.
	*
	* @return the number of service entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ServiceEntryPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ServiceEntryPersistence)PortletBeanLocatorUtil.locate(vn.com.fis.portal.service.ClpSerializer.getServletContextName(),
					ServiceEntryPersistence.class.getName());

			ReferenceRegistry.registerReference(ServiceEntryUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(ServiceEntryPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(ServiceEntryUtil.class,
			"_persistence");
	}

	private static ServiceEntryPersistence _persistence;
}