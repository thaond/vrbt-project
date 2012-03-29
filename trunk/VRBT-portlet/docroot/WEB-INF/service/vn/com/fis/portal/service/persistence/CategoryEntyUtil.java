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

import vn.com.fis.portal.model.CategoryEnty;

import java.util.List;

/**
 * The persistence utility for the category enty service. This utility wraps {@link CategoryEntyPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author loind
 * @see CategoryEntyPersistence
 * @see CategoryEntyPersistenceImpl
 * @generated
 */
public class CategoryEntyUtil {
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
	public static void clearCache(CategoryEnty categoryEnty) {
		getPersistence().clearCache(categoryEnty);
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
	public static List<CategoryEnty> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CategoryEnty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CategoryEnty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static CategoryEnty update(CategoryEnty categoryEnty, boolean merge)
		throws SystemException {
		return getPersistence().update(categoryEnty, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static CategoryEnty update(CategoryEnty categoryEnty, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(categoryEnty, merge, serviceContext);
	}

	/**
	* Caches the category enty in the entity cache if it is enabled.
	*
	* @param categoryEnty the category enty
	*/
	public static void cacheResult(
		vn.com.fis.portal.model.CategoryEnty categoryEnty) {
		getPersistence().cacheResult(categoryEnty);
	}

	/**
	* Caches the category enties in the entity cache if it is enabled.
	*
	* @param categoryEnties the category enties
	*/
	public static void cacheResult(
		java.util.List<vn.com.fis.portal.model.CategoryEnty> categoryEnties) {
		getPersistence().cacheResult(categoryEnties);
	}

	/**
	* Creates a new category enty with the primary key. Does not add the category enty to the database.
	*
	* @param categoryId the primary key for the new category enty
	* @return the new category enty
	*/
	public static vn.com.fis.portal.model.CategoryEnty create(long categoryId) {
		return getPersistence().create(categoryId);
	}

	/**
	* Removes the category enty with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the category enty
	* @return the category enty that was removed
	* @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.CategoryEnty remove(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException {
		return getPersistence().remove(categoryId);
	}

	public static vn.com.fis.portal.model.CategoryEnty updateImpl(
		vn.com.fis.portal.model.CategoryEnty categoryEnty, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(categoryEnty, merge);
	}

	/**
	* Returns the category enty with the primary key or throws a {@link vn.com.fis.portal.NoSuchCategoryEntyException} if it could not be found.
	*
	* @param categoryId the primary key of the category enty
	* @return the category enty
	* @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.CategoryEnty findByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException {
		return getPersistence().findByPrimaryKey(categoryId);
	}

	/**
	* Returns the category enty with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the category enty
	* @return the category enty, or <code>null</code> if a category enty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.CategoryEnty fetchByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(categoryId);
	}

	/**
	* Returns all the category enties where categoryName = &#63;.
	*
	* @param categoryName the category name
	* @return the matching category enties
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.CategoryEnty> findByCategoryName(
		java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCategoryName(categoryName);
	}

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
	public static java.util.List<vn.com.fis.portal.model.CategoryEnty> findByCategoryName(
		java.lang.String categoryName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCategoryName(categoryName, start, end);
	}

	/**
	* Returns an ordered range of all the category enties where categoryName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryName the category name
	* @param start the lower bound of the range of category enties
	* @param end the upper bound of the range of category enties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching category enties
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.CategoryEnty> findByCategoryName(
		java.lang.String categoryName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCategoryName(categoryName, start, end,
			orderByComparator);
	}

	/**
	* Returns the first category enty in the ordered set where categoryName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryName the category name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching category enty
	* @throws vn.com.fis.portal.NoSuchCategoryEntyException if a matching category enty could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.CategoryEnty findByCategoryName_First(
		java.lang.String categoryName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException {
		return getPersistence()
				   .findByCategoryName_First(categoryName, orderByComparator);
	}

	/**
	* Returns the last category enty in the ordered set where categoryName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryName the category name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching category enty
	* @throws vn.com.fis.portal.NoSuchCategoryEntyException if a matching category enty could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.CategoryEnty findByCategoryName_Last(
		java.lang.String categoryName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException {
		return getPersistence()
				   .findByCategoryName_Last(categoryName, orderByComparator);
	}

	/**
	* Returns the category enties before and after the current category enty in the ordered set where categoryName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param categoryId the primary key of the current category enty
	* @param categoryName the category name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next category enty
	* @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static vn.com.fis.portal.model.CategoryEnty[] findByCategoryName_PrevAndNext(
		long categoryId, java.lang.String categoryName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException {
		return getPersistence()
				   .findByCategoryName_PrevAndNext(categoryId, categoryName,
			orderByComparator);
	}

	/**
	* Returns all the category enties.
	*
	* @return the category enties
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.CategoryEnty> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the category enties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of category enties
	* @param end the upper bound of the range of category enties (not inclusive)
	* @return the range of category enties
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.CategoryEnty> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the category enties.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of category enties
	* @param end the upper bound of the range of category enties (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of category enties
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<vn.com.fis.portal.model.CategoryEnty> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the category enties where categoryName = &#63; from the database.
	*
	* @param categoryName the category name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCategoryName(java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCategoryName(categoryName);
	}

	/**
	* Removes all the category enties from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of category enties where categoryName = &#63;.
	*
	* @param categoryName the category name
	* @return the number of matching category enties
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCategoryName(java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCategoryName(categoryName);
	}

	/**
	* Returns the number of category enties.
	*
	* @return the number of category enties
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static CategoryEntyPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (CategoryEntyPersistence)PortletBeanLocatorUtil.locate(vn.com.fis.portal.service.ClpSerializer.getServletContextName(),
					CategoryEntyPersistence.class.getName());

			ReferenceRegistry.registerReference(CategoryEntyUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	public void setPersistence(CategoryEntyPersistence persistence) {
		_persistence = persistence;

		ReferenceRegistry.registerReference(CategoryEntyUtil.class,
			"_persistence");
	}

	private static CategoryEntyPersistence _persistence;
}