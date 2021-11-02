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
 * This class is a wrapper for {@link YServices}.
 * </p>
 *
 * @author USER
 * @see YServices
 * @generated
 */
public class YServicesWrapper implements YServices, ModelWrapper<YServices> {
	public YServicesWrapper(YServices yServices) {
		_yServices = yServices;
	}

	@Override
	public Class<?> getModelClass() {
		return YServices.class;
	}

	@Override
	public String getModelClassName() {
		return YServices.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("yServicesId", getYServicesId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("servicesName", getServicesName());
		attributes.put("servicesPrice", getServicesPrice());
		attributes.put("servicesDes", getServicesDes());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long yServicesId = (Long)attributes.get("yServicesId");

		if (yServicesId != null) {
			setYServicesId(yServicesId);
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

		String servicesName = (String)attributes.get("servicesName");

		if (servicesName != null) {
			setServicesName(servicesName);
		}

		String servicesPrice = (String)attributes.get("servicesPrice");

		if (servicesPrice != null) {
			setServicesPrice(servicesPrice);
		}

		String servicesDes = (String)attributes.get("servicesDes");

		if (servicesDes != null) {
			setServicesDes(servicesDes);
		}
	}

	/**
	* Returns the primary key of this y services.
	*
	* @return the primary key of this y services
	*/
	@Override
	public long getPrimaryKey() {
		return _yServices.getPrimaryKey();
	}

	/**
	* Sets the primary key of this y services.
	*
	* @param primaryKey the primary key of this y services
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_yServices.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this y services.
	*
	* @return the uuid of this y services
	*/
	@Override
	public java.lang.String getUuid() {
		return _yServices.getUuid();
	}

	/**
	* Sets the uuid of this y services.
	*
	* @param uuid the uuid of this y services
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_yServices.setUuid(uuid);
	}

	/**
	* Returns the y services ID of this y services.
	*
	* @return the y services ID of this y services
	*/
	@Override
	public long getYServicesId() {
		return _yServices.getYServicesId();
	}

	/**
	* Sets the y services ID of this y services.
	*
	* @param yServicesId the y services ID of this y services
	*/
	@Override
	public void setYServicesId(long yServicesId) {
		_yServices.setYServicesId(yServicesId);
	}

	/**
	* Returns the group ID of this y services.
	*
	* @return the group ID of this y services
	*/
	@Override
	public long getGroupId() {
		return _yServices.getGroupId();
	}

	/**
	* Sets the group ID of this y services.
	*
	* @param groupId the group ID of this y services
	*/
	@Override
	public void setGroupId(long groupId) {
		_yServices.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this y services.
	*
	* @return the company ID of this y services
	*/
	@Override
	public long getCompanyId() {
		return _yServices.getCompanyId();
	}

	/**
	* Sets the company ID of this y services.
	*
	* @param companyId the company ID of this y services
	*/
	@Override
	public void setCompanyId(long companyId) {
		_yServices.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this y services.
	*
	* @return the user ID of this y services
	*/
	@Override
	public long getUserId() {
		return _yServices.getUserId();
	}

	/**
	* Sets the user ID of this y services.
	*
	* @param userId the user ID of this y services
	*/
	@Override
	public void setUserId(long userId) {
		_yServices.setUserId(userId);
	}

	/**
	* Returns the user uuid of this y services.
	*
	* @return the user uuid of this y services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServices.getUserUuid();
	}

	/**
	* Sets the user uuid of this y services.
	*
	* @param userUuid the user uuid of this y services
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_yServices.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this y services.
	*
	* @return the user name of this y services
	*/
	@Override
	public java.lang.String getUserName() {
		return _yServices.getUserName();
	}

	/**
	* Sets the user name of this y services.
	*
	* @param userName the user name of this y services
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_yServices.setUserName(userName);
	}

	/**
	* Returns the create date of this y services.
	*
	* @return the create date of this y services
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _yServices.getCreateDate();
	}

	/**
	* Sets the create date of this y services.
	*
	* @param createDate the create date of this y services
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_yServices.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this y services.
	*
	* @return the modified date of this y services
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _yServices.getModifiedDate();
	}

	/**
	* Sets the modified date of this y services.
	*
	* @param modifiedDate the modified date of this y services
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_yServices.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the services name of this y services.
	*
	* @return the services name of this y services
	*/
	@Override
	public java.lang.String getServicesName() {
		return _yServices.getServicesName();
	}

	/**
	* Sets the services name of this y services.
	*
	* @param servicesName the services name of this y services
	*/
	@Override
	public void setServicesName(java.lang.String servicesName) {
		_yServices.setServicesName(servicesName);
	}

	/**
	* Returns the services price of this y services.
	*
	* @return the services price of this y services
	*/
	@Override
	public java.lang.String getServicesPrice() {
		return _yServices.getServicesPrice();
	}

	/**
	* Sets the services price of this y services.
	*
	* @param servicesPrice the services price of this y services
	*/
	@Override
	public void setServicesPrice(java.lang.String servicesPrice) {
		_yServices.setServicesPrice(servicesPrice);
	}

	/**
	* Returns the services des of this y services.
	*
	* @return the services des of this y services
	*/
	@Override
	public java.lang.String getServicesDes() {
		return _yServices.getServicesDes();
	}

	/**
	* Sets the services des of this y services.
	*
	* @param servicesDes the services des of this y services
	*/
	@Override
	public void setServicesDes(java.lang.String servicesDes) {
		_yServices.setServicesDes(servicesDes);
	}

	@Override
	public boolean isNew() {
		return _yServices.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_yServices.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _yServices.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_yServices.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _yServices.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _yServices.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_yServices.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _yServices.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_yServices.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_yServices.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_yServices.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new YServicesWrapper((YServices)_yServices.clone());
	}

	@Override
	public int compareTo(com.yyms.adp.aaa.model.YServices yServices) {
		return _yServices.compareTo(yServices);
	}

	@Override
	public int hashCode() {
		return _yServices.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.yyms.adp.aaa.model.YServices> toCacheModel() {
		return _yServices.toCacheModel();
	}

	@Override
	public com.yyms.adp.aaa.model.YServices toEscapedModel() {
		return new YServicesWrapper(_yServices.toEscapedModel());
	}

	@Override
	public com.yyms.adp.aaa.model.YServices toUnescapedModel() {
		return new YServicesWrapper(_yServices.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _yServices.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _yServices.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_yServices.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof YServicesWrapper)) {
			return false;
		}

		YServicesWrapper yServicesWrapper = (YServicesWrapper)obj;

		if (Validator.equals(_yServices, yServicesWrapper._yServices)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _yServices.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public YServices getWrappedYServices() {
		return _yServices;
	}

	@Override
	public YServices getWrappedModel() {
		return _yServices;
	}

	@Override
	public void resetOriginalValues() {
		_yServices.resetOriginalValues();
	}

	private YServices _yServices;
}