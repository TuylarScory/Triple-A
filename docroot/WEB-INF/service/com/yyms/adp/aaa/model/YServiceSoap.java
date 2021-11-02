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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.yyms.adp.aaa.service.http.YServiceServiceSoap}.
 *
 * @author USER
 * @see com.yyms.adp.aaa.service.http.YServiceServiceSoap
 * @generated
 */
public class YServiceSoap implements Serializable {
	public static YServiceSoap toSoapModel(YService model) {
		YServiceSoap soapModel = new YServiceSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setYServiceId(model.getYServiceId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setServiceName(model.getServiceName());
		soapModel.setServicePrice(model.getServicePrice());
		soapModel.setServiceDes(model.getServiceDes());

		return soapModel;
	}

	public static YServiceSoap[] toSoapModels(YService[] models) {
		YServiceSoap[] soapModels = new YServiceSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static YServiceSoap[][] toSoapModels(YService[][] models) {
		YServiceSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new YServiceSoap[models.length][models[0].length];
		}
		else {
			soapModels = new YServiceSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static YServiceSoap[] toSoapModels(List<YService> models) {
		List<YServiceSoap> soapModels = new ArrayList<YServiceSoap>(models.size());

		for (YService model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new YServiceSoap[soapModels.size()]);
	}

	public YServiceSoap() {
	}

	public long getPrimaryKey() {
		return _yServiceId;
	}

	public void setPrimaryKey(long pk) {
		setYServiceId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getYServiceId() {
		return _yServiceId;
	}

	public void setYServiceId(long yServiceId) {
		_yServiceId = yServiceId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getServiceName() {
		return _serviceName;
	}

	public void setServiceName(String serviceName) {
		_serviceName = serviceName;
	}

	public String getServicePrice() {
		return _servicePrice;
	}

	public void setServicePrice(String servicePrice) {
		_servicePrice = servicePrice;
	}

	public String getServiceDes() {
		return _serviceDes;
	}

	public void setServiceDes(String serviceDes) {
		_serviceDes = serviceDes;
	}

	private String _uuid;
	private long _yServiceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _serviceName;
	private String _servicePrice;
	private String _serviceDes;
}