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

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.com.fis.portal.NoSuchCategoryEntyException;
import vn.com.fis.portal.model.CategoryEnty;
import vn.com.fis.portal.model.impl.CategoryEntyImpl;
import vn.com.fis.portal.model.impl.CategoryEntyModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the category enty service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author loind
 * @see CategoryEntyPersistence
 * @see CategoryEntyUtil
 * @generated
 */
public class CategoryEntyPersistenceImpl extends BasePersistenceImpl<CategoryEnty>
	implements CategoryEntyPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CategoryEntyUtil} to access the category enty persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CategoryEntyImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYNAME =
		new FinderPath(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyModelImpl.FINDER_CACHE_ENABLED, CategoryEntyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCategoryName",
			new String[] {
				String.class.getName(),
				
			"java.lang.Integer", "java.lang.Integer",
				"com.liferay.portal.kernel.util.OrderByComparator"
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYNAME =
		new FinderPath(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyModelImpl.FINDER_CACHE_ENABLED, CategoryEntyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCategoryName",
			new String[] { String.class.getName() },
			CategoryEntyModelImpl.CATEGORYNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATEGORYNAME = new FinderPath(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCategoryName",
			new String[] { String.class.getName() });
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyModelImpl.FINDER_CACHE_ENABLED, CategoryEntyImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyModelImpl.FINDER_CACHE_ENABLED, CategoryEntyImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the category enty in the entity cache if it is enabled.
	 *
	 * @param categoryEnty the category enty
	 */
	public void cacheResult(CategoryEnty categoryEnty) {
		EntityCacheUtil.putResult(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyImpl.class, categoryEnty.getPrimaryKey(), categoryEnty);

		categoryEnty.resetOriginalValues();
	}

	/**
	 * Caches the category enties in the entity cache if it is enabled.
	 *
	 * @param categoryEnties the category enties
	 */
	public void cacheResult(List<CategoryEnty> categoryEnties) {
		for (CategoryEnty categoryEnty : categoryEnties) {
			if (EntityCacheUtil.getResult(
						CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
						CategoryEntyImpl.class, categoryEnty.getPrimaryKey()) == null) {
				cacheResult(categoryEnty);
			}
			else {
				categoryEnty.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all category enties.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(CategoryEntyImpl.class.getName());
		}

		EntityCacheUtil.clearCache(CategoryEntyImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the category enty.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CategoryEnty categoryEnty) {
		EntityCacheUtil.removeResult(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyImpl.class, categoryEnty.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CategoryEnty> categoryEnties) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CategoryEnty categoryEnty : categoryEnties) {
			EntityCacheUtil.removeResult(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
				CategoryEntyImpl.class, categoryEnty.getPrimaryKey());
		}
	}

	/**
	 * Creates a new category enty with the primary key. Does not add the category enty to the database.
	 *
	 * @param categoryId the primary key for the new category enty
	 * @return the new category enty
	 */
	public CategoryEnty create(long categoryId) {
		CategoryEnty categoryEnty = new CategoryEntyImpl();

		categoryEnty.setNew(true);
		categoryEnty.setPrimaryKey(categoryId);

		return categoryEnty;
	}

	/**
	 * Removes the category enty with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param categoryId the primary key of the category enty
	 * @return the category enty that was removed
	 * @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CategoryEnty remove(long categoryId)
		throws NoSuchCategoryEntyException, SystemException {
		return remove(Long.valueOf(categoryId));
	}

	/**
	 * Removes the category enty with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the category enty
	 * @return the category enty that was removed
	 * @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryEnty remove(Serializable primaryKey)
		throws NoSuchCategoryEntyException, SystemException {
		Session session = null;

		try {
			session = openSession();

			CategoryEnty categoryEnty = (CategoryEnty)session.get(CategoryEntyImpl.class,
					primaryKey);

			if (categoryEnty == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCategoryEntyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(categoryEnty);
		}
		catch (NoSuchCategoryEntyException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected CategoryEnty removeImpl(CategoryEnty categoryEnty)
		throws SystemException {
		categoryEnty = toUnwrappedModel(categoryEnty);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, categoryEnty);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(categoryEnty);

		return categoryEnty;
	}

	@Override
	public CategoryEnty updateImpl(
		vn.com.fis.portal.model.CategoryEnty categoryEnty, boolean merge)
		throws SystemException {
		categoryEnty = toUnwrappedModel(categoryEnty);

		boolean isNew = categoryEnty.isNew();

		CategoryEntyModelImpl categoryEntyModelImpl = (CategoryEntyModelImpl)categoryEnty;

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, categoryEnty, merge);

			categoryEnty.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !CategoryEntyModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((categoryEntyModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						categoryEntyModelImpl.getOriginalCategoryName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYNAME,
					args);

				args = new Object[] { categoryEntyModelImpl.getCategoryName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATEGORYNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
			CategoryEntyImpl.class, categoryEnty.getPrimaryKey(), categoryEnty);

		return categoryEnty;
	}

	protected CategoryEnty toUnwrappedModel(CategoryEnty categoryEnty) {
		if (categoryEnty instanceof CategoryEntyImpl) {
			return categoryEnty;
		}

		CategoryEntyImpl categoryEntyImpl = new CategoryEntyImpl();

		categoryEntyImpl.setNew(categoryEnty.isNew());
		categoryEntyImpl.setPrimaryKey(categoryEnty.getPrimaryKey());

		categoryEntyImpl.setCategoryId(categoryEnty.getCategoryId());
		categoryEntyImpl.setCategoryName(categoryEnty.getCategoryName());
		categoryEntyImpl.setDescription(categoryEnty.getDescription());
		categoryEntyImpl.setStatus(categoryEnty.getStatus());

		return categoryEntyImpl;
	}

	/**
	 * Returns the category enty with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the category enty
	 * @return the category enty
	 * @throws com.liferay.portal.NoSuchModelException if a category enty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryEnty findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the category enty with the primary key or throws a {@link vn.com.fis.portal.NoSuchCategoryEntyException} if it could not be found.
	 *
	 * @param categoryId the primary key of the category enty
	 * @return the category enty
	 * @throws vn.com.fis.portal.NoSuchCategoryEntyException if a category enty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CategoryEnty findByPrimaryKey(long categoryId)
		throws NoSuchCategoryEntyException, SystemException {
		CategoryEnty categoryEnty = fetchByPrimaryKey(categoryId);

		if (categoryEnty == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + categoryId);
			}

			throw new NoSuchCategoryEntyException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				categoryId);
		}

		return categoryEnty;
	}

	/**
	 * Returns the category enty with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the category enty
	 * @return the category enty, or <code>null</code> if a category enty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public CategoryEnty fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the category enty with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param categoryId the primary key of the category enty
	 * @return the category enty, or <code>null</code> if a category enty with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public CategoryEnty fetchByPrimaryKey(long categoryId)
		throws SystemException {
		CategoryEnty categoryEnty = (CategoryEnty)EntityCacheUtil.getResult(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
				CategoryEntyImpl.class, categoryId);

		if (categoryEnty == _nullCategoryEnty) {
			return null;
		}

		if (categoryEnty == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				categoryEnty = (CategoryEnty)session.get(CategoryEntyImpl.class,
						Long.valueOf(categoryId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (categoryEnty != null) {
					cacheResult(categoryEnty);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(CategoryEntyModelImpl.ENTITY_CACHE_ENABLED,
						CategoryEntyImpl.class, categoryId, _nullCategoryEnty);
				}

				closeSession(session);
			}
		}

		return categoryEnty;
	}

	/**
	 * Returns all the category enties where categoryName = &#63;.
	 *
	 * @param categoryName the category name
	 * @return the matching category enties
	 * @throws SystemException if a system exception occurred
	 */
	public List<CategoryEnty> findByCategoryName(String categoryName)
		throws SystemException {
		return findByCategoryName(categoryName, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	public List<CategoryEnty> findByCategoryName(String categoryName,
		int start, int end) throws SystemException {
		return findByCategoryName(categoryName, start, end, null);
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
	public List<CategoryEnty> findByCategoryName(String categoryName,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATEGORYNAME;
			finderArgs = new Object[] { categoryName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATEGORYNAME;
			finderArgs = new Object[] {
					categoryName,
					
					start, end, orderByComparator
				};
		}

		List<CategoryEnty> list = (List<CategoryEnty>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_CATEGORYENTY_WHERE);

			if (categoryName == null) {
				query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_1);
			}
			else {
				if (categoryName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_2);
				}
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}

			else {
				query.append(CategoryEntyModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (categoryName != null) {
					qPos.add(categoryName);
				}

				list = (List<CategoryEnty>)QueryUtil.list(q, getDialect(),
						start, end);
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
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
	public CategoryEnty findByCategoryName_First(String categoryName,
		OrderByComparator orderByComparator)
		throws NoSuchCategoryEntyException, SystemException {
		List<CategoryEnty> list = findByCategoryName(categoryName, 0, 1,
				orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("categoryName=");
			msg.append(categoryName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchCategoryEntyException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public CategoryEnty findByCategoryName_Last(String categoryName,
		OrderByComparator orderByComparator)
		throws NoSuchCategoryEntyException, SystemException {
		int count = countByCategoryName(categoryName);

		List<CategoryEnty> list = findByCategoryName(categoryName, count - 1,
				count, orderByComparator);

		if (list.isEmpty()) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("categoryName=");
			msg.append(categoryName);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			throw new NoSuchCategoryEntyException(msg.toString());
		}
		else {
			return list.get(0);
		}
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
	public CategoryEnty[] findByCategoryName_PrevAndNext(long categoryId,
		String categoryName, OrderByComparator orderByComparator)
		throws NoSuchCategoryEntyException, SystemException {
		CategoryEnty categoryEnty = findByPrimaryKey(categoryId);

		Session session = null;

		try {
			session = openSession();

			CategoryEnty[] array = new CategoryEntyImpl[3];

			array[0] = getByCategoryName_PrevAndNext(session, categoryEnty,
					categoryName, orderByComparator, true);

			array[1] = categoryEnty;

			array[2] = getByCategoryName_PrevAndNext(session, categoryEnty,
					categoryName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CategoryEnty getByCategoryName_PrevAndNext(Session session,
		CategoryEnty categoryEnty, String categoryName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CATEGORYENTY_WHERE);

		if (categoryName == null) {
			query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_1);
		}
		else {
			if (categoryName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_3);
			}
			else {
				query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_2);
			}
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}

		else {
			query.append(CategoryEntyModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (categoryName != null) {
			qPos.add(categoryName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(categoryEnty);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CategoryEnty> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the category enties.
	 *
	 * @return the category enties
	 * @throws SystemException if a system exception occurred
	 */
	public List<CategoryEnty> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<CategoryEnty> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	public List<CategoryEnty> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<CategoryEnty> list = (List<CategoryEnty>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_CATEGORYENTY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CATEGORYENTY.concat(CategoryEntyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<CategoryEnty>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<CategoryEnty>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the category enties where categoryName = &#63; from the database.
	 *
	 * @param categoryName the category name
	 * @throws SystemException if a system exception occurred
	 */
	public void removeByCategoryName(String categoryName)
		throws SystemException {
		for (CategoryEnty categoryEnty : findByCategoryName(categoryName)) {
			remove(categoryEnty);
		}
	}

	/**
	 * Removes all the category enties from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (CategoryEnty categoryEnty : findAll()) {
			remove(categoryEnty);
		}
	}

	/**
	 * Returns the number of category enties where categoryName = &#63;.
	 *
	 * @param categoryName the category name
	 * @return the number of matching category enties
	 * @throws SystemException if a system exception occurred
	 */
	public int countByCategoryName(String categoryName)
		throws SystemException {
		Object[] finderArgs = new Object[] { categoryName };

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CATEGORYNAME,
				finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CATEGORYENTY_WHERE);

			if (categoryName == null) {
				query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_1);
			}
			else {
				if (categoryName.equals(StringPool.BLANK)) {
					query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_3);
				}
				else {
					query.append(_FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_2);
				}
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (categoryName != null) {
					qPos.add(categoryName);
				}

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CATEGORYNAME,
					finderArgs, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Returns the number of category enties.
	 *
	 * @return the number of category enties
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CATEGORYENTY);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the category enty persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.com.fis.portal.model.CategoryEnty")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<CategoryEnty>> listenersList = new ArrayList<ModelListener<CategoryEnty>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<CategoryEnty>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(CategoryEntyImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = CategoryEntyPersistence.class)
	protected CategoryEntyPersistence categoryEntyPersistence;
	@BeanReference(type = CategoryVideoEntryPersistence.class)
	protected CategoryVideoEntryPersistence categoryVideoEntryPersistence;
	@BeanReference(type = ContactEntryPersistence.class)
	protected ContactEntryPersistence contactEntryPersistence;
	@BeanReference(type = ContactGroupContactEntryPersistence.class)
	protected ContactGroupContactEntryPersistence contactGroupContactEntryPersistence;
	@BeanReference(type = ContactGroupEntryPersistence.class)
	protected ContactGroupEntryPersistence contactGroupEntryPersistence;
	@BeanReference(type = ContactGroupVideoGroupEntryPersistence.class)
	protected ContactGroupVideoGroupEntryPersistence contactGroupVideoGroupEntryPersistence;
	@BeanReference(type = FolderEntryPersistence.class)
	protected FolderEntryPersistence folderEntryPersistence;
	@BeanReference(type = NotificationEntryPersistence.class)
	protected NotificationEntryPersistence notificationEntryPersistence;
	@BeanReference(type = RatingEntryPersistence.class)
	protected RatingEntryPersistence ratingEntryPersistence;
	@BeanReference(type = ServiceEntryPersistence.class)
	protected ServiceEntryPersistence serviceEntryPersistence;
	@BeanReference(type = ServicePackageEntryPersistence.class)
	protected ServicePackageEntryPersistence servicePackageEntryPersistence;
	@BeanReference(type = ServiceTransactionEntryPersistence.class)
	protected ServiceTransactionEntryPersistence serviceTransactionEntryPersistence;
	@BeanReference(type = UserEntryPersistence.class)
	protected UserEntryPersistence userEntryPersistence;
	@BeanReference(type = UserServiceEntryPersistence.class)
	protected UserServiceEntryPersistence userServiceEntryPersistence;
	@BeanReference(type = VideoEntryPersistence.class)
	protected VideoEntryPersistence videoEntryPersistence;
	@BeanReference(type = VideoGroupEntryPersistence.class)
	protected VideoGroupEntryPersistence videoGroupEntryPersistence;
	@BeanReference(type = VideoUserContactEntryPersistence.class)
	protected VideoUserContactEntryPersistence videoUserContactEntryPersistence;
	@BeanReference(type = VideoUserEntryPersistence.class)
	protected VideoUserEntryPersistence videoUserEntryPersistence;
	@BeanReference(type = VideoUserTransactionEntryPersistence.class)
	protected VideoUserTransactionEntryPersistence videoUserTransactionEntryPersistence;
	@BeanReference(type = VideoUserVideoGroupEntryPersistence.class)
	protected VideoUserVideoGroupEntryPersistence videoUserVideoGroupEntryPersistence;
	@BeanReference(type = ViolationEntryPersistence.class)
	protected ViolationEntryPersistence violationEntryPersistence;
	@BeanReference(type = ViolationVideoEntryPersistence.class)
	protected ViolationVideoEntryPersistence violationVideoEntryPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_CATEGORYENTY = "SELECT categoryEnty FROM CategoryEnty categoryEnty";
	private static final String _SQL_SELECT_CATEGORYENTY_WHERE = "SELECT categoryEnty FROM CategoryEnty categoryEnty WHERE ";
	private static final String _SQL_COUNT_CATEGORYENTY = "SELECT COUNT(categoryEnty) FROM CategoryEnty categoryEnty";
	private static final String _SQL_COUNT_CATEGORYENTY_WHERE = "SELECT COUNT(categoryEnty) FROM CategoryEnty categoryEnty WHERE ";
	private static final String _FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_1 = "categoryEnty.categoryName IS NULL";
	private static final String _FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_2 = "categoryEnty.categoryName = ?";
	private static final String _FINDER_COLUMN_CATEGORYNAME_CATEGORYNAME_3 = "(categoryEnty.categoryName IS NULL OR categoryEnty.categoryName = ?)";
	private static final String _ORDER_BY_ENTITY_ALIAS = "categoryEnty.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CategoryEnty exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CategoryEnty exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(CategoryEntyPersistenceImpl.class);
	private static CategoryEnty _nullCategoryEnty = new CategoryEntyImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<CategoryEnty> toCacheModel() {
				return _nullCategoryEntyCacheModel;
			}
		};

	private static CacheModel<CategoryEnty> _nullCategoryEntyCacheModel = new CacheModel<CategoryEnty>() {
			public CategoryEnty toEntityModel() {
				return _nullCategoryEnty;
			}
		};
}