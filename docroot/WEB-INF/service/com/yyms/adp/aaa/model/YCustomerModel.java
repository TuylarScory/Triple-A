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
 * The base model interface for the YCustomer service. Represents a row in the &quot;CS_YCustomer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.yyms.adp.aaa.model.impl.YCustomerImpl}.
 * </p>
 *
 * @author USER
 * @see YCustomer
 * @see com.yyms.adp.aaa.model.impl.YCustomerImpl
 * @see com.yyms.adp.aaa.model.impl.YCustomerModelImpl
 * @generated
 */
public interface YCustomerModel extends BaseModel<YCustomer>, StagedGroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a y customer model instance should use the {@link YCustomer} interface instead.
	 */

	/**
	 * Returns the primary key of this y customer.
	 *
	 * @return the primary key of this y customer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this y customer.
	 *
	 * @param primaryKey the primary key of this y customer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this y customer.
	 *
	 * @return the uuid of this y customer
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this y customer.
	 *
	 * @param uuid the uuid of this y customer
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the y customer ID of this y customer.
	 *
	 * @return the y customer ID of this y customer
	 */
	public long getYCustomerId();

	/**
	 * Sets the y customer ID of this y customer.
	 *
	 * @param yCustomerId the y customer ID of this y customer
	 */
	public void setYCustomerId(long yCustomerId);

	/**
	 * Returns the group ID of this y customer.
	 *
	 * @return the group ID of this y customer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this y customer.
	 *
	 * @param groupId the group ID of this y customer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this y customer.
	 *
	 * @return the company ID of this y customer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this y customer.
	 *
	 * @param companyId the company ID of this y customer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this y customer.
	 *
	 * @return the user ID of this y customer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this y customer.
	 *
	 * @param userId the user ID of this y customer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this y customer.
	 *
	 * @return the user uuid of this y customer
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this y customer.
	 *
	 * @param userUuid the user uuid of this y customer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this y customer.
	 *
	 * @return the user name of this y customer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this y customer.
	 *
	 * @param userName the user name of this y customer
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this y customer.
	 *
	 * @return the create date of this y customer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this y customer.
	 *
	 * @param createDate the create date of this y customer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this y customer.
	 *
	 * @return the modified date of this y customer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this y customer.
	 *
	 * @param modifiedDate the modified date of this y customer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the customer name of this y customer.
	 *
	 * @return the customer name of this y customer
	 */
	@AutoEscape
	public String getCustomerName();

	/**
	 * Sets the customer name of this y customer.
	 *
	 * @param customerName the customer name of this y customer
	 */
	public void setCustomerName(String customerName);

	/**
	 * Returns the customer email of this y customer.
	 *
	 * @return the customer email of this y customer
	 */
	@AutoEscape
	public String getCustomerEmail();

	/**
	 * Sets the customer email of this y customer.
	 *
	 * @param customerEmail the customer email of this y customer
	 */
	public void setCustomerEmail(String customerEmail);

	/**
	 * Returns the customer address of this y customer.
	 *
	 * @return the customer address of this y customer
	 */
	@AutoEscape
	public String getCustomerAddress();

	/**
	 * Sets the customer address of this y customer.
	 *
	 * @param customerAddress the customer address of this y customer
	 */
	public void setCustomerAddress(String customerAddress);

	/**
	 * Returns the customer n r c of this y customer.
	 *
	 * @return the customer n r c of this y customer
	 */
	@AutoEscape
	public String getCustomerNRC();

	/**
	 * Sets the customer n r c of this y customer.
	 *
	 * @param customerNRC the customer n r c of this y customer
	 */
	public void setCustomerNRC(String customerNRC);

	/**
	 * Returns the customer contact of this y customer.
	 *
	 * @return the customer contact of this y customer
	 */
	@AutoEscape
	public String getCustomerContact();

	/**
	 * Sets the customer contact of this y customer.
	 *
	 * @param customerContact the customer contact of this y customer
	 */
	public void setCustomerContact(String customerContact);

	/**
	 * Returns the payment of this y customer.
	 *
	 * @return the payment of this y customer
	 */
	@AutoEscape
	public String getPayment();

	/**
	 * Sets the payment of this y customer.
	 *
	 * @param payment the payment of this y customer
	 */
	public void setPayment(String payment);

	/**
	 * Returns the y services ID of this y customer.
	 *
	 * @return the y services ID of this y customer
	 */
	public long getYServicesId();

	/**
	 * Sets the y services ID of this y customer.
	 *
	 * @param yServicesId the y services ID of this y customer
	 */
	public void setYServicesId(long yServicesId);

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
	public int compareTo(com.yyms.adp.aaa.model.YCustomer yCustomer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.yyms.adp.aaa.model.YCustomer> toCacheModel();

	@Override
	public com.yyms.adp.aaa.model.YCustomer toEscapedModel();

	@Override
	public com.yyms.adp.aaa.model.YCustomer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}