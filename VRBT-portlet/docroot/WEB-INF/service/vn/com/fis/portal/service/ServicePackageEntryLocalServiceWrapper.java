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

package vn.com.fis.portal.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ServicePackageEntryLocalService}.
 * </p>
 *
 * @author    loind
 * @see       ServicePackageEntryLocalService
 * @generated
 */
public class ServicePackageEntryLocalServiceWrapper
	implements ServicePackageEntryLocalService,
		ServiceWrapper<ServicePackageEntryLocalService> {
	public ServicePackageEntryLocalServiceWrapper(
		ServicePackageEntryLocalService servicePackageEntryLocalService) {
		_servicePackageEntryLocalService = servicePackageEntryLocalService;
	}

	/**
	* Adds the service package entry to the database. Also notifies the appropriate model listeners.
	*
	* @param servicePackageEntry the service package entry
	* @return the service package entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.ServicePackageEntry addServicePackageEntry(
		vn.com.fis.portal.model.ServicePackageEntry servicePackageEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.addServicePackageEntry(servicePackageEntry);
	}

	/**
	* Creates a new service package entry with the primary key. Does not add the service package entry to the database.
	*
	* @param servicePackageId the primary key for the new service package entry
	* @return the new service package entry
	*/
	public vn.com.fis.portal.model.ServicePackageEntry createServicePackageEntry(
		long servicePackageId) {
		return _servicePackageEntryLocalService.createServicePackageEntry(servicePackageId);
	}

	/**
	* Deletes the service package entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param servicePackageId the primary key of the service package entry
	* @throws PortalException if a service package entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteServicePackageEntry(long servicePackageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_servicePackageEntryLocalService.deleteServicePackageEntry(servicePackageId);
	}

	/**
	* Deletes the service package entry from the database. Also notifies the appropriate model listeners.
	*
	* @param servicePackageEntry the service package entry
	* @throws SystemException if a system exception occurred
	*/
	public void deleteServicePackageEntry(
		vn.com.fis.portal.model.ServicePackageEntry servicePackageEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		_servicePackageEntryLocalService.deleteServicePackageEntry(servicePackageEntry);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.com.fis.portal.model.ServicePackageEntry fetchServicePackageEntry(
		long servicePackageId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.fetchServicePackageEntry(servicePackageId);
	}

	/**
	* Returns the service package entry with the primary key.
	*
	* @param servicePackageId the primary key of the service package entry
	* @return the service package entry
	* @throws PortalException if a service package entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.ServicePackageEntry getServicePackageEntry(
		long servicePackageId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.getServicePackageEntry(servicePackageId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<vn.com.fis.portal.model.ServicePackageEntry> getServicePackageEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.getServicePackageEntries(start,
			end);
	}

	/**
	* Returns the number of service package entries.
	*
	* @return the number of service package entries
	* @throws SystemException if a system exception occurred
	*/
	public int getServicePackageEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.getServicePackageEntriesCount();
	}

	/**
	* Updates the service package entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param servicePackageEntry the service package entry
	* @return the service package entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.ServicePackageEntry updateServicePackageEntry(
		vn.com.fis.portal.model.ServicePackageEntry servicePackageEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.updateServicePackageEntry(servicePackageEntry);
	}

	/**
	* Updates the service package entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param servicePackageEntry the service package entry
	* @param merge whether to merge the service package entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the service package entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.ServicePackageEntry updateServicePackageEntry(
		vn.com.fis.portal.model.ServicePackageEntry servicePackageEntry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.updateServicePackageEntry(servicePackageEntry,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _servicePackageEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_servicePackageEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.util.List<vn.com.fis.portal.model.ServicePackageEntry> search(
		java.lang.String ser_pacCode, java.lang.String ser_pacName,
		long serviceId, int status, int start, int end, int searchTypeFlag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.search(ser_pacCode,
			ser_pacName, serviceId, status, start, end, searchTypeFlag);
	}

	public int searchCount(java.lang.String ser_pacCode,
		java.lang.String ser_pacName, long serviceId, int status,
		int searchTypeFlag)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.searchCount(ser_pacCode,
			ser_pacName, serviceId, status, searchTypeFlag);
	}

	public java.util.List<vn.com.fis.portal.model.ServicePackageEntry> findBystatus(
		int status) throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.findBystatus(status);
	}

	public java.util.List<vn.com.fis.portal.model.ServicePackageEntry> findByserviceId(
		long serviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.findByserviceId(serviceId);
	}

	public java.util.List<vn.com.fis.portal.model.ServicePackageEntry> findByserviceId_Status(
		long serviceId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.findByserviceId_Status(serviceId,
			status);
	}

	public vn.com.fis.portal.model.ServicePackageEntry findByservicePackageCode(
		java.lang.String servicePackageCode)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServicePackageEntryException {
		return _servicePackageEntryLocalService.findByservicePackageCode(servicePackageCode);
	}

	public vn.com.fis.portal.model.ServicePackageEntry findByservicePackageName(
		java.lang.String servicePackageName)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchServicePackageEntryException {
		return _servicePackageEntryLocalService.findByservicePackageName(servicePackageName);
	}

	public int countByserviceId_status(long serviceId, int status)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _servicePackageEntryLocalService.countByserviceId_status(serviceId,
			status);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ServicePackageEntryLocalService getWrappedServicePackageEntryLocalService() {
		return _servicePackageEntryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedServicePackageEntryLocalService(
		ServicePackageEntryLocalService servicePackageEntryLocalService) {
		_servicePackageEntryLocalService = servicePackageEntryLocalService;
	}

	public ServicePackageEntryLocalService getWrappedService() {
		return _servicePackageEntryLocalService;
	}

	public void setWrappedService(
		ServicePackageEntryLocalService servicePackageEntryLocalService) {
		_servicePackageEntryLocalService = servicePackageEntryLocalService;
	}

	private ServicePackageEntryLocalService _servicePackageEntryLocalService;
}