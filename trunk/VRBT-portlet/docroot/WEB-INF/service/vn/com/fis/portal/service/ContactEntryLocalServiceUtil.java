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
 * The utility for the contact entry local service. This utility wraps {@link vn.com.fis.portal.service.impl.ContactEntryLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author loind
 * @see ContactEntryLocalService
 * @see vn.com.fis.portal.service.base.ContactEntryLocalServiceBaseImpl
 * @see vn.com.fis.portal.service.impl.ContactEntryLocalServiceImpl
 * @generated
 */
public class ContactEntryLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link vn.com.fis.portal.service.impl.ContactEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the contact entry to the database. Also notifies the appropriate model listeners.
	*
	* @param contactEntry the contact entry
	* @return the contact entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ContactEntry addContactEntry(
		vn.com.fis.portal.model.ContactEntry contactEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addContactEntry(contactEntry);
	}

	/**
	* Creates a new contact entry with the primary key. Does not add the contact entry to the database.
	*
	* @param contactId the primary key for the new contact entry
	* @return the new contact entry
	*/
	public static vn.com.fis.portal.model.ContactEntry createContactEntry(
		long contactId) {
		return getService().createContactEntry(contactId);
	}

	/**
	* Deletes the contact entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param contactId the primary key of the contact entry
	* @throws PortalException if a contact entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteContactEntry(long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteContactEntry(contactId);
	}

	/**
	* Deletes the contact entry from the database. Also notifies the appropriate model listeners.
	*
	* @param contactEntry the contact entry
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteContactEntry(
		vn.com.fis.portal.model.ContactEntry contactEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteContactEntry(contactEntry);
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

	public static vn.com.fis.portal.model.ContactEntry fetchContactEntry(
		long contactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchContactEntry(contactId);
	}

	/**
	* Returns the contact entry with the primary key.
	*
	* @param contactId the primary key of the contact entry
	* @return the contact entry
	* @throws PortalException if a contact entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ContactEntry getContactEntry(
		long contactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getContactEntry(contactId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the contact entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of contact entries
	* @param end the upper bound of the range of contact entries (not inclusive)
	* @return the range of contact entries
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.ContactEntry> getContactEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getContactEntries(start, end);
	}

	/**
	* Returns the number of contact entries.
	*
	* @return the number of contact entries
	* @throws SystemException if a system exception occurred
	*/
	public static int getContactEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getContactEntriesCount();
	}

	/**
	* Updates the contact entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contactEntry the contact entry
	* @return the contact entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ContactEntry updateContactEntry(
		vn.com.fis.portal.model.ContactEntry contactEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateContactEntry(contactEntry);
	}

	/**
	* Updates the contact entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param contactEntry the contact entry
	* @param merge whether to merge the contact entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the contact entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ContactEntry updateContactEntry(
		vn.com.fis.portal.model.ContactEntry contactEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateContactEntry(contactEntry, merge);
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
	* Returns the contact entry where userId = &#63; and mobileNumber = &#63; or throws a {@link vn.com.fis.portal.NoSuchContactEntryException} if it could not be found.
	*
	* @param userId the user ID
	* @param mobileNumber the mobile number
	* @return the matching contact entry
	* @throws vn.com.fis.portal.NoSuchContactEntryException if a matching contact entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.ContactEntry findByUserId_MobileNumber(
		long userId, java.lang.String mobileNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchContactEntryException {
		return getService().findByUserId_MobileNumber(userId, mobileNumber);
	}

	/**
	* Returns the number of contact entries where userId = &#63; and mobileNumber = &#63;.
	*
	* @param userId the user ID
	* @param mobileNumber the mobile number
	* @return the number of matching contact entries
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId_MobileNumber(long userId,
		java.lang.String mobileNumber)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().countByUserId_MobileNumber(userId, mobileNumber);
	}

	public static void clearService() {
		_service = null;
	}

	public static ContactEntryLocalService getService() {
		if (_service == null) {
			Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ContactEntryLocalService.class.getName());
			ClassLoader portletClassLoader = (ClassLoader)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					"portletClassLoader");

			ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
					ContactEntryLocalService.class.getName(), portletClassLoader);

			_service = new ContactEntryLocalServiceClp(classLoaderProxy);

			ClpSerializer.setClassLoader(portletClassLoader);

			ReferenceRegistry.registerReference(ContactEntryLocalServiceUtil.class,
				"_service");
			MethodCache.remove(ContactEntryLocalService.class);
		}

		return _service;
	}

	public void setService(ContactEntryLocalService service) {
		MethodCache.remove(ContactEntryLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(ContactEntryLocalServiceUtil.class,
			"_service");
		MethodCache.remove(ContactEntryLocalService.class);
	}

	private static ContactEntryLocalService _service;
}