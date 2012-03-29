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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link vn.com.fis.portal.service.http.CategoryEntyServiceSoap}.
 *
 * @author    loind
 * @see       vn.com.fis.portal.service.http.CategoryEntyServiceSoap
 * @generated
 */
public class CategoryEntySoap implements Serializable {
	public static CategoryEntySoap toSoapModel(CategoryEnty model) {
		CategoryEntySoap soapModel = new CategoryEntySoap();

		soapModel.setCategoryId(model.getCategoryId());
		soapModel.setCategoryName(model.getCategoryName());
		soapModel.setDescription(model.getDescription());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static CategoryEntySoap[] toSoapModels(CategoryEnty[] models) {
		CategoryEntySoap[] soapModels = new CategoryEntySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CategoryEntySoap[][] toSoapModels(CategoryEnty[][] models) {
		CategoryEntySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CategoryEntySoap[models.length][models[0].length];
		}
		else {
			soapModels = new CategoryEntySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CategoryEntySoap[] toSoapModels(List<CategoryEnty> models) {
		List<CategoryEntySoap> soapModels = new ArrayList<CategoryEntySoap>(models.size());

		for (CategoryEnty model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CategoryEntySoap[soapModels.size()]);
	}

	public CategoryEntySoap() {
	}

	public long getPrimaryKey() {
		return _categoryId;
	}

	public void setPrimaryKey(long pk) {
		setCategoryId(pk);
	}

	public long getCategoryId() {
		return _categoryId;
	}

	public void setCategoryId(long categoryId) {
		_categoryId = categoryId;
	}

	public String getCategoryName() {
		return _categoryName;
	}

	public void setCategoryName(String categoryName) {
		_categoryName = categoryName;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private long _categoryId;
	private String _categoryName;
	private String _description;
	private int _status;
}