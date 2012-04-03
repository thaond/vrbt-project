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
 * This class is a wrapper for {@link VideoEntryLocalService}.
 * </p>
 *
 * @author    loind
 * @see       VideoEntryLocalService
 * @generated
 */
public class VideoEntryLocalServiceWrapper implements VideoEntryLocalService,
	ServiceWrapper<VideoEntryLocalService> {
	public VideoEntryLocalServiceWrapper(
		VideoEntryLocalService videoEntryLocalService) {
		_videoEntryLocalService = videoEntryLocalService;
	}

	/**
	* Adds the video entry to the database. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @return the video entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoEntry addVideoEntry(
		vn.com.fis.portal.model.VideoEntry videoEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.addVideoEntry(videoEntry);
	}

	/**
	* Creates a new video entry with the primary key. Does not add the video entry to the database.
	*
	* @param videoId the primary key for the new video entry
	* @return the new video entry
	*/
	public vn.com.fis.portal.model.VideoEntry createVideoEntry(long videoId) {
		return _videoEntryLocalService.createVideoEntry(videoId);
	}

	/**
	* Deletes the video entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param videoId the primary key of the video entry
	* @throws PortalException if a video entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVideoEntry(long videoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_videoEntryLocalService.deleteVideoEntry(videoId);
	}

	/**
	* Deletes the video entry from the database. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVideoEntry(vn.com.fis.portal.model.VideoEntry videoEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		_videoEntryLocalService.deleteVideoEntry(videoEntry);
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
		return _videoEntryLocalService.dynamicQuery(dynamicQuery);
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
		return _videoEntryLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _videoEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _videoEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public vn.com.fis.portal.model.VideoEntry fetchVideoEntry(long videoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.fetchVideoEntry(videoId);
	}

	/**
	* Returns the video entry with the primary key.
	*
	* @param videoId the primary key of the video entry
	* @return the video entry
	* @throws PortalException if a video entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoEntry getVideoEntry(long videoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.getVideoEntry(videoId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the video entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of video entries
	* @param end the upper bound of the range of video entries (not inclusive)
	* @return the range of video entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoEntry> getVideoEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.getVideoEntries(start, end);
	}

	/**
	* Returns the number of video entries.
	*
	* @return the number of video entries
	* @throws SystemException if a system exception occurred
	*/
	public int getVideoEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.getVideoEntriesCount();
	}

	/**
	* Updates the video entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @return the video entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoEntry updateVideoEntry(
		vn.com.fis.portal.model.VideoEntry videoEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.updateVideoEntry(videoEntry);
	}

	/**
	* Updates the video entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @param merge whether to merge the video entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the video entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoEntry updateVideoEntry(
		vn.com.fis.portal.model.VideoEntry videoEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.updateVideoEntry(videoEntry, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _videoEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_videoEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Returns all the video entries where date_ = &#63;.
	*
	* @param date_ the date_
	* @return the matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoEntry> findByDateUpload(
		java.util.Date date_)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.findByDateUpload(date_);
	}

	/**
	* Returns a range of all the video entries where date_ = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param date_ the date_
	* @param start the lower bound of the range of video entries
	* @param end the upper bound of the range of video entries (not inclusive)
	* @return the range of matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoEntry> findByDateUpload(
		java.util.Date date_, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.findByDateUpload(date_, start, end);
	}

	/**
	* Returns the number of video entries where date_ = &#63;.
	*
	* @param date_ the date_
	* @return the number of matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByDateUpload(java.util.Date date_)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.countByDateUpload(date_);
	}

	/**
	* Returns all the video entries where uploaderId = &#63;.
	*
	* @param uploaderId the uploader ID
	* @return the matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId(
		long uploaderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.findByUploaderId(uploaderId);
	}

	/**
	* Returns a range of all the video entries where uploaderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uploaderId the uploader ID
	* @param start the lower bound of the range of video entries
	* @param end the upper bound of the range of video entries (not inclusive)
	* @return the range of matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId(
		long uploaderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.findByUploaderId(uploaderId, start, end);
	}

	/**
	* Returns all the video entries where uploaderId = &#63; and folderId = &#63;.
	*
	* @param uploaderId the uploader ID
	* @param folderId the folder ID
	* @return the matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId_Folder(
		long uploaderId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.findByUploaderId_Folder(uploaderId,
			folderId);
	}

	/**
	* Returns a range of all the video entries where uploaderId = &#63; and folderId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param uploaderId the uploader ID
	* @param folderId the folder ID
	* @param start the lower bound of the range of video entries
	* @param end the upper bound of the range of video entries (not inclusive)
	* @return the range of matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId_Folder(
		long uploaderId, long folderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.findByUploaderId_Folder(uploaderId,
			folderId, start, end);
	}

	/**
	* Returns the number of video entries where uploaderId = &#63; and folderId = &#63;.
	*
	* @param uploaderId the uploader ID
	* @param folderId the folder ID
	* @return the number of matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByUploaderId_Folder(long uploaderId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _videoEntryLocalService.countByUploaderId_Folder(uploaderId,
			folderId);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public VideoEntryLocalService getWrappedVideoEntryLocalService() {
		return _videoEntryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedVideoEntryLocalService(
		VideoEntryLocalService videoEntryLocalService) {
		_videoEntryLocalService = videoEntryLocalService;
	}

	public VideoEntryLocalService getWrappedService() {
		return _videoEntryLocalService;
	}

	public void setWrappedService(VideoEntryLocalService videoEntryLocalService) {
		_videoEntryLocalService = videoEntryLocalService;
	}

	private VideoEntryLocalService _videoEntryLocalService;
}