/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.yyms.adp.aaa.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the YServices service. Represents a row in the &quot;CS_YServices&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.yyms.adp.aaa.model.impl.YServicesImpl}.
 * </p>
 *
 * @author USER
 * @see YServices
 * @see com.yyms.adp.aaa.model.impl.YServicesImpl
 * @see com.yyms.adp.aaa.model.impl.YServicesModelImpl
 * @generated
 */
public interface YServicesModel extends BaseModel<YServices>, StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a y services model instance should use the {@link YServices} interface instead.
	 */

	/**
	 * Returns the primary key of this y services.
	 *
	 * @return the primary key of this y services
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this y services.
	 *
	 * @param primaryKey the primary key of this y services
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this y services.
	 *
	 * @return the uuid of this y services
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this y services.
	 *
	 * @param uuid the uuid of this y services
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the y services ID of this y services.
	 *
	 * @return the y services ID of this y services
	 */
	public long getYServicesId();

	/**
	 * Sets the y services ID of this y services.
	 *
	 * @param yServicesId the y services ID of this y services
	 */
	public void setYServicesId(long yServicesId);

	/**
	 * Returns the group ID of this y services.
	 *
	 * @return the group ID of this y services
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this y services.
	 *
	 * @param groupId the group ID of this y services
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this y services.
	 *
	 * @return the company ID of this y services
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this y services.
	 *
	 * @param companyId the company ID of this y services
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this y services.
	 *
	 * @return the user ID of this y services
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this y services.
	 *
	 * @param userId the user ID of this y services
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this y services.
	 *
	 * @return the user uuid of this y services
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this y services.
	 *
	 * @param userUuid the user uuid of this y services
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this y services.
	 *
	 * @return the user name of this y services
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this y services.
	 *
	 * @param userName the user name of this y services
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this y services.
	 *
	 * @return the create date of this y services
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this y services.
	 *
	 * @param createDate the create date of this y services
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this y services.
	 *
	 * @return the modified date of this y services
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this y services.
	 *
	 * @param modifiedDate the modified date of this y services
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the services name of this y services.
	 *
	 * @return the services name of this y services
	 */
	@AutoEscape
	public String getServicesName();

	/**
	 * Sets the services name of this y services.
	 *
	 * @param servicesName the services name of this y services
	 */
	public void setServicesName(String servicesName);

	/**
	 * Returns the services price of this y services.
	 *
	 * @return the services price of this y services
	 */
	@AutoEscape
	public String getServicesPrice();

	/**
	 * Sets the services price of this y services.
	 *
	 * @param servicesPrice the services price of this y services
	 */
	public void setServicesPrice(String servicesPrice);

	/**
	 * Returns the services des of this y services.
	 *
	 * @return the services des of this y services
	 */
	@AutoEscape
	public String getServicesDes();

	/**
	 * Sets the services des of this y services.
	 *
	 * @param servicesDes the services des of this y services
	 */
	public void setServicesDes(String servicesDes);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.yyms.adp.aaa.model.YServices yServices);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.yyms.adp.aaa.model.YServices> toCacheModel();

	@Override
	public com.yyms.adp.aaa.model.YServices toEscapedModel();

	@Override
	public com.yyms.adp.aaa.model.YServices toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}