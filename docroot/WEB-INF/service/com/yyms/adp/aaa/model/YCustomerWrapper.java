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

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link YCustomer}.
 * </p>
 *
 * @author USER
 * @see YCustomer
 * @generated
 */
public class YCustomerWrapper implements YCustomer, ModelWrapper<YCustomer> {
	public YCustomerWrapper(YCustomer yCustomer) {
		_yCustomer = yCustomer;
	}

	@Override
	public Class<?> getModelClass() {
		return YCustomer.class;
	}

	@Override
	public String getModelClassName() {
		return YCustomer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("yCustomerId", getYCustomerId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("customerName", getCustomerName());
		attributes.put("customerEmail", getCustomerEmail());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("customerNRC", getCustomerNRC());
		attributes.put("customerContact", getCustomerContact());
		attributes.put("payment", getPayment());
		attributes.put("yServicesId", getYServicesId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long yCustomerId = (Long)attributes.get("yCustomerId");

		if (yCustomerId != null) {
			setYCustomerId(yCustomerId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String customerEmail = (String)attributes.get("customerEmail");

		if (customerEmail != null) {
			setCustomerEmail(customerEmail);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		String customerNRC = (String)attributes.get("customerNRC");

		if (customerNRC != null) {
			setCustomerNRC(customerNRC);
		}

		String customerContact = (String)attributes.get("customerContact");

		if (customerContact != null) {
			setCustomerContact(customerContact);
		}

		String payment = (String)attributes.get("payment");

		if (payment != null) {
			setPayment(payment);
		}

		Long yServicesId = (Long)attributes.get("yServicesId");

		if (yServicesId != null) {
			setYServicesId(yServicesId);
		}
	}

	/**
	* Returns the primary key of this y customer.
	*
	* @return the primary key of this y customer
	*/
	@Override
	public long getPrimaryKey() {
		return _yCustomer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this y customer.
	*
	* @param primaryKey the primary key of this y customer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_yCustomer.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this y customer.
	*
	* @return the uuid of this y customer
	*/
	@Override
	public java.lang.String getUuid() {
		return _yCustomer.getUuid();
	}

	/**
	* Sets the uuid of this y customer.
	*
	* @param uuid the uuid of this y customer
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_yCustomer.setUuid(uuid);
	}

	/**
	* Returns the y customer ID of this y customer.
	*
	* @return the y customer ID of this y customer
	*/
	@Override
	public long getYCustomerId() {
		return _yCustomer.getYCustomerId();
	}

	/**
	* Sets the y customer ID of this y customer.
	*
	* @param yCustomerId the y customer ID of this y customer
	*/
	@Override
	public void setYCustomerId(long yCustomerId) {
		_yCustomer.setYCustomerId(yCustomerId);
	}

	/**
	* Returns the group ID of this y customer.
	*
	* @return the group ID of this y customer
	*/
	@Override
	public long getGroupId() {
		return _yCustomer.getGroupId();
	}

	/**
	* Sets the group ID of this y customer.
	*
	* @param groupId the group ID of this y customer
	*/
	@Override
	public void setGroupId(long groupId) {
		_yCustomer.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this y customer.
	*
	* @return the company ID of this y customer
	*/
	@Override
	public long getCompanyId() {
		return _yCustomer.getCompanyId();
	}

	/**
	* Sets the company ID of this y customer.
	*
	* @param companyId the company ID of this y customer
	*/
	@Override
	public void setCompanyId(long companyId) {
		_yCustomer.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this y customer.
	*
	* @return the user ID of this y customer
	*/
	@Override
	public long getUserId() {
		return _yCustomer.getUserId();
	}

	/**
	* Sets the user ID of this y customer.
	*
	* @param userId the user ID of this y customer
	*/
	@Override
	public void setUserId(long userId) {
		_yCustomer.setUserId(userId);
	}

	/**
	* Returns the user uuid of this y customer.
	*
	* @return the user uuid of this y customer
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomer.getUserUuid();
	}

	/**
	* Sets the user uuid of this y customer.
	*
	* @param userUuid the user uuid of this y customer
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_yCustomer.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this y customer.
	*
	* @return the user name of this y customer
	*/
	@Override
	public java.lang.String getUserName() {
		return _yCustomer.getUserName();
	}

	/**
	* Sets the user name of this y customer.
	*
	* @param userName the user name of this y customer
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_yCustomer.setUserName(userName);
	}

	/**
	* Returns the create date of this y customer.
	*
	* @return the create date of this y customer
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _yCustomer.getCreateDate();
	}

	/**
	* Sets the create date of this y customer.
	*
	* @param createDate the create date of this y customer
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_yCustomer.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this y customer.
	*
	* @return the modified date of this y customer
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _yCustomer.getModifiedDate();
	}

	/**
	* Sets the modified date of this y customer.
	*
	* @param modifiedDate the modified date of this y customer
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_yCustomer.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the customer name of this y customer.
	*
	* @return the customer name of this y customer
	*/
	@Override
	public java.lang.String getCustomerName() {
		return _yCustomer.getCustomerName();
	}

	/**
	* Sets the customer name of this y customer.
	*
	* @param customerName the customer name of this y customer
	*/
	@Override
	public void setCustomerName(java.lang.String customerName) {
		_yCustomer.setCustomerName(customerName);
	}

	/**
	* Returns the customer email of this y customer.
	*
	* @return the customer email of this y customer
	*/
	@Override
	public java.lang.String getCustomerEmail() {
		return _yCustomer.getCustomerEmail();
	}

	/**
	* Sets the customer email of this y customer.
	*
	* @param customerEmail the customer email of this y customer
	*/
	@Override
	public void setCustomerEmail(java.lang.String customerEmail) {
		_yCustomer.setCustomerEmail(customerEmail);
	}

	/**
	* Returns the customer address of this y customer.
	*
	* @return the customer address of this y customer
	*/
	@Override
	public java.lang.String getCustomerAddress() {
		return _yCustomer.getCustomerAddress();
	}

	/**
	* Sets the customer address of this y customer.
	*
	* @param customerAddress the customer address of this y customer
	*/
	@Override
	public void setCustomerAddress(java.lang.String customerAddress) {
		_yCustomer.setCustomerAddress(customerAddress);
	}

	/**
	* Returns the customer n r c of this y customer.
	*
	* @return the customer n r c of this y customer
	*/
	@Override
	public java.lang.String getCustomerNRC() {
		return _yCustomer.getCustomerNRC();
	}

	/**
	* Sets the customer n r c of this y customer.
	*
	* @param customerNRC the customer n r c of this y customer
	*/
	@Override
	public void setCustomerNRC(java.lang.String customerNRC) {
		_yCustomer.setCustomerNRC(customerNRC);
	}

	/**
	* Returns the customer contact of this y customer.
	*
	* @return the customer contact of this y customer
	*/
	@Override
	public java.lang.String getCustomerContact() {
		return _yCustomer.getCustomerContact();
	}

	/**
	* Sets the customer contact of this y customer.
	*
	* @param customerContact the customer contact of this y customer
	*/
	@Override
	public void setCustomerContact(java.lang.String customerContact) {
		_yCustomer.setCustomerContact(customerContact);
	}

	/**
	* Returns the payment of this y customer.
	*
	* @return the payment of this y customer
	*/
	@Override
	public java.lang.String getPayment() {
		return _yCustomer.getPayment();
	}

	/**
	* Sets the payment of this y customer.
	*
	* @param payment the payment of this y customer
	*/
	@Override
	public void setPayment(java.lang.String payment) {
		_yCustomer.setPayment(payment);
	}

	/**
	* Returns the y services ID of this y customer.
	*
	* @return the y services ID of this y customer
	*/
	@Override
	public long getYServicesId() {
		return _yCustomer.getYServicesId();
	}

	/**
	* Sets the y services ID of this y customer.
	*
	* @param yServicesId the y services ID of this y customer
	*/
	@Override
	public void setYServicesId(long yServicesId) {
		_yCustomer.setYServicesId(yServicesId);
	}

	@Override
	public boolean isNew() {
		return _yCustomer.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_yCustomer.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _yCustomer.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_yCustomer.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _yCustomer.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _yCustomer.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_yCustomer.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _yCustomer.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_yCustomer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_yCustomer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_yCustomer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new YCustomerWrapper((YCustomer)_yCustomer.clone());
	}

	@Override
	public int compareTo(com.yyms.adp.aaa.model.YCustomer yCustomer) {
		return _yCustomer.compareTo(yCustomer);
	}

	@Override
	public int hashCode() {
		return _yCustomer.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.yyms.adp.aaa.model.YCustomer> toCacheModel() {
		return _yCustomer.toCacheModel();
	}

	@Override
	public com.yyms.adp.aaa.model.YCustomer toEscapedModel() {
		return new YCustomerWrapper(_yCustomer.toEscapedModel());
	}

	@Override
	public com.yyms.adp.aaa.model.YCustomer toUnescapedModel() {
		return new YCustomerWrapper(_yCustomer.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _yCustomer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _yCustomer.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_yCustomer.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof YCustomerWrapper)) {
			return false;
		}

		YCustomerWrapper yCustomerWrapper = (YCustomerWrapper)obj;

		if (Validator.equals(_yCustomer, yCustomerWrapper._yCustomer)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _yCustomer.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public YCustomer getWrappedYCustomer() {
		return _yCustomer;
	}

	@Override
	public YCustomer getWrappedModel() {
		return _yCustomer;
	}

	@Override
	public void resetOriginalValues() {
		_yCustomer.resetOriginalValues();
	}

	private YCustomer _yCustomer;
}