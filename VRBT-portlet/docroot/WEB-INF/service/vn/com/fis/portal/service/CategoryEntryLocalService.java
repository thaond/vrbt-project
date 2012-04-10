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
 * The interface for the category entry local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author loind
 * @see CategoryEntryLocalServiceUtil
 * @see vn.com.fis.portal.service.base.CategoryEntryLocalServiceBaseImpl
 * @see vn.com.fis.portal.service.impl.CategoryEntryLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CategoryEntryLocalService extends PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CategoryEntryLocalServiceUtil} to access the category entry local service. Add custom service methods to {@link vn.com.fis.portal.service.impl.CategoryEntryLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the category entry to the database. Also notifies the appropriate model listeners.
	*
	* @param categoryEntry the category entry
	* @return the category entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.CategoryEntry addCategoryEntry(
		vn.com.fis.portal.model.CategoryEntry categoryEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new category entry with the primary key. Does not add the category entry to the database.
	*
	* @param categoryId the primary key for the new category entry
	* @return the new category entry
	*/
	public vn.com.fis.portal.model.CategoryEntry createCategoryEntry(
		long categoryId);

	/**
	* Deletes the category entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the category entry
	* @throws PortalException if a category entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCategoryEntry(long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the category entry from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryEntry the category entry
	* @throws SystemException if a system exception occurred
	*/
	public void deleteCategoryEntry(
		vn.com.fis.portal.model.CategoryEntry categoryEntry)
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
	public vn.com.fis.portal.model.CategoryEntry fetchCategoryEntry(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the category entry with the primary key.
	*
	* @param categoryId the primary key of the category entry
	* @return the category entry
	* @throws PortalException if a category entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public vn.com.fis.portal.model.CategoryEntry getCategoryEntry(
		long categoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the category entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of category entries
	* @param end the upper bound of the range of category entries (not inclusive)
	* @return the range of category entries
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<vn.com.fis.portal.model.CategoryEntry> getCategoryEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of category entries.
	*
	* @return the number of category entries
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCategoryEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the category entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param categoryEntry the category entry
	* @return the category entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.CategoryEntry updateCategoryEntry(
		vn.com.fis.portal.model.CategoryEntry categoryEntry)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the category entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param categoryEntry the category entry
	* @param merge whether to merge the category entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the category entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.CategoryEntry updateCategoryEntry(
		vn.com.fis.portal.model.CategoryEntry categoryEntry, boolean merge)
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
	* Returns all the category entries where categoryName = &#63;.
	*
	* @param categoryName the category name
	* @return the matching category entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.CategoryEntry> findByCategoryName(
		java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the category enties where categoryName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryName the category name
	* @param start the lower bound of the range of category enties
	* @param end the upper bound of the range of category enties (not inclusive)
	* @return the range of matching category enties
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.CategoryEntry> findByCategoryName(
		java.lang.String categoryName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of category enties where categoryName = &#63;.
	*
	* @param categoryName the category name
	* @return the number of matching category enties
	* @throws SystemException if a system exception occurred
	*/
	public int countByCategoryName(java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the category entry where categoryName = &#63; or throws a {@link vn.com.fis.portal.NoSuchCategoryEntryException} if it could not be found.
	*
	* @param categoryName the category name
	* @return the matching category entry
	* @throws vn.com.fis.portal.NoSuchCategoryEntryException if a matching category entry could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.CategoryEntry findByCategoryNameAbsolute(
		java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntryException;

	/**
	* Returns the number of category entries where categoryName = &#63;.
	*
	* @param categoryName the category name
	* @return the number of matching category entries
	* @throws SystemException if a system exception occurred
	*/
	public int countByCategoryNameAbsolute(java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the category entry where categoryName = &#63; from the database.
	*
	* @param categoryName the category name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCategoryNameAbsolute(java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntryException;
}