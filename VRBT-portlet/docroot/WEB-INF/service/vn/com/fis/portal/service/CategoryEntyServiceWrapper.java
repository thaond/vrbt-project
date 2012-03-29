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
 * This class is a wrapper for {@link CategoryEntyService}.
 * </p>
 *
 * @author    loind
 * @see       CategoryEntyService
 * @generated
 */
public class CategoryEntyServiceWrapper implements CategoryEntyService,
	ServiceWrapper<CategoryEntyService> {
	public CategoryEntyServiceWrapper(CategoryEntyService categoryEntyService) {
		_categoryEntyService = categoryEntyService;
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public CategoryEntyService getWrappedCategoryEntyService() {
		return _categoryEntyService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedCategoryEntyService(
		CategoryEntyService categoryEntyService) {
		_categoryEntyService = categoryEntyService;
	}

	public CategoryEntyService getWrappedService() {
		return _categoryEntyService;
	}

	public void setWrappedService(CategoryEntyService categoryEntyService) {
		_categoryEntyService = categoryEntyService;
	}

	private CategoryEntyService _categoryEntyService;
}