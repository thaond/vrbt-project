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
 * This class is a wrapper for {@link VideoUserTransactionEntryLocalService}.
 * </p>
 *
 * @author    loind
 * @see       VideoUserTransactionEntryLocalService
 * @generated
 */
public class VideoUserTransactionEntryLocalServiceWrapper
	implements VideoUserTransactionEntryLocalService,
		ServiceWrapper<VideoUserTransactionEntryLocalService> {
	public VideoUserTransactionEntryLocalServiceWrapper(
		VideoUserTransactionEntryLocalService videoUserTransactionEntryLocalService) {
		_videoUserTransactionEntryLocalService = videoUserTransactionEntryLocalService;
	}

	/**
	* Adds the video user transaction entry to the database. Also notifies the appropriate model listeners.
	*
	* @param videoUserTransactionEntry the video user transaction entry
	* @return the video user transaction entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoUserTransactionEntry addVideoUserTransactionEntry(
		vn.com.fis.portal.model.VideoUserTransactionEntry videoUserTransactionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.addVideoUserTransactionEntry(videoUserTransactionEntry);
	}

	/**
	* Creates a new video user transaction entry with the primary key. Does not add the video user transaction entry to the database.
	*
	* @param transactionId the primary key for the new video user transaction entry
	* @return the new video user transaction entry
	*/
	public vn.com.fis.portal.model.VideoUserTransactionEntry createVideoUserTransactionEntry(
		long transactionId) {
		return _videoUserTransactionEntryLocalService.createVideoUserTransactionEntry(transactionId);
	}

	/**
	* Deletes the video user transaction entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param transactionId the primary key of the video user transaction entry
	* @throws PortalException if a video user transaction entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVideoUserTransactionEntry(long transactionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_videoUserTransactionEntryLocalService.deleteVideoUserTransactionEntry(transactionId);
	}

	/**
	* Deletes the video user transaction entry from the database. Also notifies the appropriate model listeners.
	*
	* @param videoUserTransactionEntry the video user transaction entry
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVideoUserTransactionEntry(
		vn.com.fis.portal.model.VideoUserTransactionEntry videoUserTransactionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		_videoUserTransactionEntryLocalService.deleteVideoUserTransactionEntry(videoUserTransactionEntry);
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
		return _videoUserTransactionEntryLocalService.dynamicQuery(dynamicQuery);
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
		return _videoUserTransactionEntryLocalService.dynamicQuery(dynamicQuery,
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
		return _videoUserTransactionEntryLocalService.dynamicQuery(dynamicQuery,
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
		return _videoUserTransactionEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.com.fis.portal.model.VideoUserTransactionEntry fetchVideoUserTransactionEntry(
		long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.fetchVideoUserTransactionEntry(transactionId);
	}

	/**
	* Returns the video user transaction entry with the primary key.
	*
	* @param transactionId the primary key of the video user transaction entry
	* @return the video user transaction entry
	* @throws PortalException if a video user transaction entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoUserTransactionEntry getVideoUserTransactionEntry(
		long transactionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.getVideoUserTransactionEntry(transactionId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the video user transaction entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of video user transaction entries
	* @param end the upper bound of the range of video user transaction entries (not inclusive)
	* @return the range of video user transaction entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoUserTransactionEntry> getVideoUserTransactionEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.getVideoUserTransactionEntries(start,
			end);
	}

	/**
	* Returns the number of video user transaction entries.
	*
	* @return the number of video user transaction entries
	* @throws SystemException if a system exception occurred
	*/
	public int getVideoUserTransactionEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.getVideoUserTransactionEntriesCount();
	}

	/**
	* Updates the video user transaction entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoUserTransactionEntry the video user transaction entry
	* @return the video user transaction entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoUserTransactionEntry updateVideoUserTransactionEntry(
		vn.com.fis.portal.model.VideoUserTransactionEntry videoUserTransactionEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.updateVideoUserTransactionEntry(videoUserTransactionEntry);
	}

	/**
	* Updates the video user transaction entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoUserTransactionEntry the video user transaction entry
	* @param merge whether to merge the video user transaction entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the video user transaction entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoUserTransactionEntry updateVideoUserTransactionEntry(
		vn.com.fis.portal.model.VideoUserTransactionEntry videoUserTransactionEntry,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoUserTransactionEntryLocalService.updateVideoUserTransactionEntry(videoUserTransactionEntry,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _videoUserTransactionEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_videoUserTransactionEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public VideoUserTransactionEntryLocalService getWrappedVideoUserTransactionEntryLocalService() {
		return _videoUserTransactionEntryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedVideoUserTransactionEntryLocalService(
		VideoUserTransactionEntryLocalService videoUserTransactionEntryLocalService) {
		_videoUserTransactionEntryLocalService = videoUserTransactionEntryLocalService;
	}

	public VideoUserTransactionEntryLocalService getWrappedService() {
		return _videoUserTransactionEntryLocalService;
	}

	public void setWrappedService(
		VideoUserTransactionEntryLocalService videoUserTransactionEntryLocalService) {
		_videoUserTransactionEntryLocalService = videoUserTransactionEntryLocalService;
	}

	private VideoUserTransactionEntryLocalService _videoUserTransactionEntryLocalService;
}