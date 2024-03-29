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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the video user entry local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author loind
 * @see VideoUserEntryLocalServiceUtil
 * @see vn.com.fis.portal.service.base.VideoUserEntryLocalServiceBaseImpl
 * @see vn.com.fis.portal.service.impl.VideoUserEntryLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface VideoUserEntryLocalService extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VideoUserEntryLocalServiceUtil} to access the video user entry local service. Add custom service methods to {@link vn.com.fis.portal.service.impl.VideoUserEntryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the video user entry to the database. Also notifies the appropriate model listeners.
	*
	* @param videoUserEntry the video user entry
	* @return the video user entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoUserEntry addVideoUserEntry(
		vn.com.fis.portal.model.VideoUserEntry videoUserEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new video user entry with the primary key. Does not add the video user entry to the database.
	*
	* @param videoUserId the primary key for the new video user entry
	* @return the new video user entry
	*/
	public vn.com.fis.portal.model.VideoUserEntry createVideoUserEntry(
		long videoUserId);

	/**
	* Deletes the video user entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param videoUserId the primary key of the video user entry
	* @throws PortalException if a video user entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVideoUserEntry(long videoUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the video user entry from the database. Also notifies the appropriate model listeners.
	*
	* @param videoUserEntry the video user entry
	* @throws SystemException if a system exception occurred
	*/
	public void deleteVideoUserEntry(
		vn.com.fis.portal.model.VideoUserEntry videoUserEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.com.fis.portal.model.VideoUserEntry fetchVideoUserEntry(
		long videoUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the video user entry with the primary key.
	*
	* @param videoUserId the primary key of the video user entry
	* @return the video user entry
	* @throws PortalException if a video user entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.com.fis.portal.model.VideoUserEntry getVideoUserEntry(
		long videoUserId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the video user entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of video user entries
	* @param end the upper bound of the range of video user entries (not inclusive)
	* @return the range of video user entries
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.com.fis.portal.model.VideoUserEntry> getVideoUserEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of video user entries.
	*
	* @return the number of video user entries
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVideoUserEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the video user entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoUserEntry the video user entry
	* @return the video user entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoUserEntry updateVideoUserEntry(
		vn.com.fis.portal.model.VideoUserEntry videoUserEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the video user entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoUserEntry the video user entry
	* @param merge whether to merge the video user entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the video user entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.VideoUserEntry updateVideoUserEntry(
		vn.com.fis.portal.model.VideoUserEntry videoUserEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	/**
	* Returns all the video user entries where userId = &#63; and videoId = &#63;.
	*
	* @param userId the user ID
	* @param videoId the video ID
	* @return the matching video user entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoUserEntry> findByUserId_VideoId(
		long userId, long videoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the video user entries where userId = &#63; and videoId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param videoId the video ID
	* @param start the lower bound of the range of video user entries
	* @param end the upper bound of the range of video user entries (not inclusive)
	* @return the range of matching video user entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.VideoUserEntry> findByUserId_VideoId(
		long userId, long videoId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the video user entries where userId = &#63; and videoId = &#63; from the database.
	*
	* @param userId the user ID
	* @param videoId the video ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId_VideoId(long userId, long videoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of video user entries where userId = &#63; and videoId = &#63;.
	*
	* @param userId the user ID
	* @param videoId the video ID
	* @return the number of matching video user entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId_VideoId(long userId, long videoId)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<vn.com.fis.portal.model.VideoUserEntry> findByUserId_VideoId_Status(
		long userId, long videoId, int status)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countByUserId_VideoId_Status(long userId, long videoId,
		int status) throws com.liferay.portal.kernel.exception.SystemException;
}