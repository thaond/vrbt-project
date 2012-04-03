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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the video entry local service. This utility wraps {@link vn.com.fis.portal.service.impl.VideoEntryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author loind
 * @see VideoEntryLocalService
 * @see vn.com.fis.portal.service.base.VideoEntryLocalServiceBaseImpl
 * @see vn.com.fis.portal.service.impl.VideoEntryLocalServiceImpl
 * @generated
 */
public class VideoEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.com.fis.portal.service.impl.VideoEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the video entry to the database. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @return the video entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.VideoEntry addVideoEntry(
		vn.com.fis.portal.model.VideoEntry videoEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addVideoEntry(videoEntry);
	}

	/**
	* Creates a new video entry with the primary key. Does not add the video entry to the database.
	*
	* @param videoId the primary key for the new video entry
	* @return the new video entry
	*/
	public static vn.com.fis.portal.model.VideoEntry createVideoEntry(
		long videoId) {
		return getService().createVideoEntry(videoId);
	}

	/**
	* Deletes the video entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param videoId the primary key of the video entry
	* @throws PortalException if a video entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVideoEntry(long videoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVideoEntry(videoId);
	}

	/**
	* Deletes the video entry from the database. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteVideoEntry(
		vn.com.fis.portal.model.VideoEntry videoEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteVideoEntry(videoEntry);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static vn.com.fis.portal.model.VideoEntry fetchVideoEntry(
		long videoId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchVideoEntry(videoId);
	}

	/**
	* Returns the video entry with the primary key.
	*
	* @param videoId the primary key of the video entry
	* @return the video entry
	* @throws PortalException if a video entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.VideoEntry getVideoEntry(long videoId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getVideoEntry(videoId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<vn.com.fis.portal.model.VideoEntry> getVideoEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVideoEntries(start, end);
	}

	/**
	* Returns the number of video entries.
	*
	* @return the number of video entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getVideoEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getVideoEntriesCount();
	}

	/**
	* Updates the video entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @return the video entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.VideoEntry updateVideoEntry(
		vn.com.fis.portal.model.VideoEntry videoEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVideoEntry(videoEntry);
	}

	/**
	* Updates the video entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param videoEntry the video entry
	* @param merge whether to merge the video entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the video entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.VideoEntry updateVideoEntry(
		vn.com.fis.portal.model.VideoEntry videoEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVideoEntry(videoEntry, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	/**
	* Returns all the video entries where date_ = &#63;.
	*
	* @param date_ the date_
	* @return the matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.VideoEntry> findByDateUpload(
		java.util.Date date_)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDateUpload(date_);
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
	public static java.util.List<vn.com.fis.portal.model.VideoEntry> findByDateUpload(
		java.util.Date date_, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByDateUpload(date_, start, end);
	}

	/**
	* Returns the number of video entries where date_ = &#63;.
	*
	* @param date_ the date_
	* @return the number of matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByDateUpload(java.util.Date date_)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByDateUpload(date_);
	}

	/**
	* Returns all the video entries where uploaderId = &#63;.
	*
	* @param uploaderId the uploader ID
	* @return the matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId(
		long uploaderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUploaderId(uploaderId);
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
	public static java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId(
		long uploaderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUploaderId(uploaderId, start, end);
	}

	/**
	* Returns all the video entries where uploaderId = &#63; and folderId = &#63;.
	*
	* @param uploaderId the uploader ID
	* @param folderId the folder ID
	* @return the matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId_Folder(
		long uploaderId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findByUploaderId_Folder(uploaderId, folderId);
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
	public static java.util.List<vn.com.fis.portal.model.VideoEntry> findByUploaderId_Folder(
		long uploaderId, long folderId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByUploaderId_Folder(uploaderId, folderId, start, end);
	}

	/**
	* Returns the number of video entries where uploaderId = &#63; and folderId = &#63;.
	*
	* @param uploaderId the uploader ID
	* @param folderId the folder ID
	* @return the number of matching video entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUploaderId_Folder(long uploaderId, long folderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByUploaderId_Folder(uploaderId, folderId);
	}

	public static void clearService() {
		_service = null;
	}

	public static VideoEntryLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					VideoEntryLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					VideoEntryLocalService.class.getName(), portletClassLoader);

			_service = new VideoEntryLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(VideoEntryLocalServiceUtil.class,
				"_service");
			MethodCache.remove(VideoEntryLocalService.class);
		}

		return _service;
	}

	public void setService(VideoEntryLocalService service) {
		MethodCache.remove(VideoEntryLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(VideoEntryLocalServiceUtil.class,
			"_service");
		MethodCache.remove(VideoEntryLocalService.class);
	}

	private static VideoEntryLocalService _service;
}