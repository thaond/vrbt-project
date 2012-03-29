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

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.fis.portal.model.CategoryEnty;

/**
 * The persistence interface for the category enty service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author loind
 * @see CategoryEntyPersistenceImpl
 * @see CategoryEntyUtil
 * @generated
 */
public interface CategoryEntyPersistence extends BasePersistence<CategoryEnty> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CategoryEntyUtil} to access the category enty persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the category enty in the entity cache if it is enabled.
	*
	* @param categoryEnty the category enty
	*/
	public void cacheResult(vn.com.fis.portal.model.CategoryEnty categoryEnty);

	/**
	* Caches the category enties in the entity cache if it is enabled.
	*
	* @param categoryEnties the category enties
	*/
	public void cacheResult(
		java.util.List<vn.com.fis.portal.model.CategoryEnty> categoryEnties);

	/**
	* Creates a new category enty with the primary key. Does not add the category enty to the database.
	*
	* @param categoryId the primary key for the new category enty
	* @return the new category enty
	*/
	public vn.com.fis.portal.model.CategoryEnty create(long categoryId);

	/**
	* Removes the category enty with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param categoryId the primary key of the category enty
	* @return the category enty that was removed
	* @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.CategoryEnty remove(long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException;

	public vn.com.fis.portal.model.CategoryEnty updateImpl(
		vn.com.fis.portal.model.CategoryEnty categoryEnty, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the category enty with the primary key or throws a {@link vn.com.fis.portal.NoSuchCategoryEntyException} if it could not be found.
	*
	* @param categoryId the primary key of the category enty
	* @return the category enty
	* @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.CategoryEnty findByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException;

	/**
	* Returns the category enty with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param categoryId the primary key of the category enty
	* @return the category enty, or <code>null</code> if a category enty with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.fis.portal.model.CategoryEnty fetchByPrimaryKey(
		long categoryId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the category enties where categoryName = &#63;.
	*
	* @param categoryName the category name
	* @return the matching category enties
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.CategoryEnty> findByCategoryName(
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
	public java.util.List<vn.com.fis.portal.model.CategoryEnty> findByCategoryName(
		java.lang.String categoryName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.com.fis.portal.model.CategoryEnty> findByCategoryName(
		java.lang.String categoryName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public vn.com.fis.portal.model.CategoryEnty findByCategoryName_First(
		java.lang.String categoryName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException;

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
	public vn.com.fis.portal.model.CategoryEnty findByCategoryName_Last(
		java.lang.String categoryName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException;

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
	public vn.com.fis.portal.model.CategoryEnty[] findByCategoryName_PrevAndNext(
		long categoryId, java.lang.String categoryName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.fis.portal.NoSuchCategoryEntyException;

	/**
	* Returns all the category enties.
	*
	* @return the category enties
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.fis.portal.model.CategoryEnty> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.com.fis.portal.model.CategoryEnty> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<vn.com.fis.portal.model.CategoryEnty> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the category enties where categoryName = &#63; from the database.
	*
	* @param categoryName the category name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCategoryName(java.lang.String categoryName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the category enties from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
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
	* Returns the number of category enties.
	*
	* @return the number of category enties
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}