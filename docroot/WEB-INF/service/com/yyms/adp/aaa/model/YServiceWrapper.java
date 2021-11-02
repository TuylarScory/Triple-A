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
 * This class is a wrapper for {@link YService}.
 * </p>
 *
 * @author USER
 * @see YService
 * @generated
 */
public class YServiceWrapper implements YService, ModelWrapper<YService> {
	public YServiceWrapper(YService yService) {
		_yService = yService;
	}

	@Override
	public Class<?> getModelClass() {
		return YService.class;
	}

	@Override
	public String getModelClassName() {
		return YService.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("yServiceId", getYServiceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceName", getServiceName());
		attributes.put("servicePrice", getServicePrice());
		attributes.put("serviceDes", getServiceDes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long yServiceId = (Long)attributes.get("yServiceId");

		if (yServiceId != null) {
			setYServiceId(yServiceId);
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

		String serviceName = (String)attributes.get("serviceName");

		if (serviceName != null) {
			setServiceName(serviceName);
		}

		String servicePrice = (String)attributes.get("servicePrice");

		if (servicePrice != null) {
			setServicePrice(servicePrice);
		}

		String serviceDes = (String)attributes.get("serviceDes");

		if (serviceDes != null) {
			setServiceDes(serviceDes);
		}
	}

	/**
	* Returns the primary key of this y service.
	*
	* @return the primary key of this y service
	*/
	@Override
	public long getPrimaryKey() {
		return _yService.getPrimaryKey();
	}

	/**
	* Sets the primary key of this y service.
	*
	* @param primaryKey the primary key of this y service
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_yService.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this y service.
	*
	* @return the uuid of this y service
	*/
	@Override
	public java.lang.String getUuid() {
		return _yService.getUuid();
	}

	/**
	* Sets the uuid of this y service.
	*
	* @param uuid the uuid of this y service
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_yService.setUuid(uuid);
	}

	/**
	* Returns the y service ID of this y service.
	*
	* @return the y service ID of this y service
	*/
	@Override
	public long getYServiceId() {
		return _yService.getYServiceId();
	}

	/**
	* Sets the y service ID of this y service.
	*
	* @param yServiceId the y service ID of this y service
	*/
	@Override
	public void setYServiceId(long yServiceId) {
		_yService.setYServiceId(yServiceId);
	}

	/**
	* Returns the group ID of this y service.
	*
	* @return the group ID of this y service
	*/
	@Override
	public long getGroupId() {
		return _yService.getGroupId();
	}

	/**
	* Sets the group ID of this y service.
	*
	* @param groupId the group ID of this y service
	*/
	@Override
	public void setGroupId(long groupId) {
		_yService.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this y service.
	*
	* @return the company ID of this y service
	*/
	@Override
	public long getCompanyId() {
		return _yService.getCompanyId();
	}

	/**
	* Sets the company ID of this y service.
	*
	* @param companyId the company ID of this y service
	*/
	@Override
	public void setCompanyId(long companyId) {
		_yService.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this y service.
	*
	* @return the user ID of this y service
	*/
	@Override
	public long getUserId() {
		return _yService.getUserId();
	}

	/**
	* Sets the user ID of this y service.
	*
	* @param userId the user ID of this y service
	*/
	@Override
	public void setUserId(long userId) {
		_yService.setUserId(userId);
	}

	/**
	* Returns the user uuid of this y service.
	*
	* @return the user uuid of this y service
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yService.getUserUuid();
	}

	/**
	* Sets the user uuid of this y service.
	*
	* @param userUuid the user uuid of this y service
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_yService.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this y service.
	*
	* @return the user name of this y service
	*/
	@Override
	public java.lang.String getUserName() {
		return _yService.getUserName();
	}

	/**
	* Sets the user name of this y service.
	*
	* @param userName the user name of this y service
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_yService.setUserName(userName);
	}

	/**
	* Returns the create date of this y service.
	*
	* @return the create date of this y service
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _yService.getCreateDate();
	}

	/**
	* Sets the create date of this y service.
	*
	* @param createDate the create date of this y service
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_yService.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this y service.
	*
	* @return the modified date of this y service
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _yService.getModifiedDate();
	}

	/**
	* Sets the modified date of this y service.
	*
	* @param modifiedDate the modified date of this y service
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_yService.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the service name of this y service.
	*
	* @return the service name of this y service
	*/
	@Override
	public java.lang.String getServiceName() {
		return _yService.getServiceName();
	}

	/**
	* Sets the service name of this y service.
	*
	* @param serviceName the service name of this y service
	*/
	@Override
	public void setServiceName(java.lang.String serviceName) {
		_yService.setServiceName(serviceName);
	}

	/**
	* Returns the service price of this y service.
	*
	* @return the service price of this y service
	*/
	@Override
	public java.lang.String getServicePrice() {
		return _yService.getServicePrice();
	}

	/**
	* Sets the service price of this y service.
	*
	* @param servicePrice the service price of this y service
	*/
	@Override
	public void setServicePrice(java.lang.String servicePrice) {
		_yService.setServicePrice(servicePrice);
	}

	/**
	* Returns the service des of this y service.
	*
	* @return the service des of this y service
	*/
	@Override
	public java.lang.String getServiceDes() {
		return _yService.getServiceDes();
	}

	/**
	* Sets the service des of this y service.
	*
	* @param serviceDes the service des of this y service
	*/
	@Override
	public void setServiceDes(java.lang.String serviceDes) {
		_yService.setServiceDes(serviceDes);
	}

	@Override
	public boolean isNew() {
		return _yService.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_yService.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _yService.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_yService.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _yService.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _yService.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_yService.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _yService.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_yService.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_yService.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_yService.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new YServiceWrapper((YService)_yService.clone());
	}

	@Override
	public int compareTo(com.yyms.adp.aaa.model.YService yService) {
		return _yService.compareTo(yService);
	}

	@Override
	public int hashCode() {
		return _yService.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.yyms.adp.aaa.model.YService> toCacheModel() {
		return _yService.toCacheModel();
	}

	@Override
	public com.yyms.adp.aaa.model.YService toEscapedModel() {
		return new YServiceWrapper(_yService.toEscapedModel());
	}

	@Override
	public com.yyms.adp.aaa.model.YService toUnescapedModel() {
		return new YServiceWrapper(_yService.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _yService.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _yService.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_yService.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof YServiceWrapper)) {
			return false;
		}

		YServiceWrapper yServiceWrapper = (YServiceWrapper)obj;

		if (Validator.equals(_yService, yServiceWrapper._yService)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _yService.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public YService getWrappedYService() {
		return _yService;
	}

	@Override
	public YService getWrappedModel() {
		return _yService;
	}

	@Override
	public void resetOriginalValues() {
		_yService.resetOriginalValues();
	}

	private YService _yService;
}