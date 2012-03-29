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

package vn.com.fis.portal.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the CategoryEnty service. Represents a row in the &quot;TBL_CATEGORY&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.fis.portal.model.impl.CategoryEntyModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.fis.portal.model.impl.CategoryEntyImpl}.
 * </p>
 *
 * @author loind
 * @see CategoryEnty
 * @see vn.com.fis.portal.model.impl.CategoryEntyImpl
 * @see vn.com.fis.portal.model.impl.CategoryEntyModelImpl
 * @generated
 */
public interface CategoryEntyModel extends BaseModel<CategoryEnty> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a category enty model instance should use the {@link CategoryEnty} interface instead.
	 */

	/**
	 * Returns the primary key of this category enty.
	 *
	 * @return the primary key of this category enty
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this category enty.
	 *
	 * @param primaryKey the primary key of this category enty
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the category ID of this category enty.
	 *
	 * @return the category ID of this category enty
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this category enty.
	 *
	 * @param categoryId the category ID of this category enty
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Returns the category name of this category enty.
	 *
	 * @return the category name of this category enty
	 */
	@AutoEscape
	public String getCategoryName();

	/**
	 * Sets the category name of this category enty.
	 *
	 * @param categoryName the category name of this category enty
	 */
	public void setCategoryName(String categoryName);

	/**
	 * Returns the description of this category enty.
	 *
	 * @return the description of this category enty
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this category enty.
	 *
	 * @param description the description of this category enty
	 */
	public void setDescription(String description);

	/**
	 * Returns the status of this category enty.
	 *
	 * @return the status of this category enty
	 */
	public int getStatus();

	/**
	 * Sets the status of this category enty.
	 *
	 * @param status the status of this category enty
	 */
	public void setStatus(int status);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(CategoryEnty categoryEnty);

	public int hashCode();

	public CacheModel<CategoryEnty> toCacheModel();

	public CategoryEnty toEscapedModel();

	public String toString();

	public String toXmlString();
}