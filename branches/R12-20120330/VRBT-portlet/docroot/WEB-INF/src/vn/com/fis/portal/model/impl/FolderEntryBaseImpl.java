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

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.fis.portal.model.FolderEntry;
import vn.com.fis.portal.service.FolderEntryLocalServiceUtil;

/**
 * The extended model base implementation for the FolderEntry service. Represents a row in the &quot;TBL_FOLDER&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link FolderEntryImpl}.
 * </p>
 *
 * @author loind
 * @see FolderEntryImpl
 * @see vn.com.fis.portal.model.FolderEntry
 * @generated
 */
public abstract class FolderEntryBaseImpl extends FolderEntryModelImpl
	implements FolderEntry {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a folder entry model instance should use the {@link FolderEntry} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			FolderEntryLocalServiceUtil.addFolderEntry(this);
		}
		else {
			FolderEntryLocalServiceUtil.updateFolderEntry(this);
		}
	}
}