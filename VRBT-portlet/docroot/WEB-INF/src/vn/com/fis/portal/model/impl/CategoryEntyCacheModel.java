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

package vn.com.fis.portal.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.fis.portal.model.CategoryEnty;

import java.io.Serializable;

/**
 * The cache model class for representing CategoryEnty in entity cache.
 *
 * @author loind
 * @see CategoryEnty
 * @generated
 */
public class CategoryEntyCacheModel implements CacheModel<CategoryEnty>,
	Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{categoryId=");
		sb.append(categoryId);
		sb.append(", categoryName=");
		sb.append(categoryName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	public CategoryEnty toEntityModel() {
		CategoryEntyImpl categoryEntyImpl = new CategoryEntyImpl();

		categoryEntyImpl.setCategoryId(categoryId);

		if (categoryName == null) {
			categoryEntyImpl.setCategoryName(StringPool.BLANK);
		}
		else {
			categoryEntyImpl.setCategoryName(categoryName);
		}

		if (description == null) {
			categoryEntyImpl.setDescription(StringPool.BLANK);
		}
		else {
			categoryEntyImpl.setDescription(description);
		}

		categoryEntyImpl.setStatus(status);

		categoryEntyImpl.resetOriginalValues();

		return categoryEntyImpl;
	}

	public long categoryId;
	public String categoryName;
	public String description;
	public int status;
}