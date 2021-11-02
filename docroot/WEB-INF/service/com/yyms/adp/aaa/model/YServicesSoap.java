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
 * This class is used by SOAP remote services, specifically {@link com.yyms.adp.aaa.service.http.YServicesServiceSoap}.
 *
 * @author USER
 * @see com.yyms.adp.aaa.service.http.YServicesServiceSoap
 * @generated
 */
public class YServicesSoap implements Serializable {
	public static YServicesSoap toSoapModel(YServices model) {
		YServicesSoap soapModel = new YServicesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setYServicesId(model.getYServicesId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setServicesName(model.getServicesName());
		soapModel.setServicesPrice(model.getServicesPrice());
		soapModel.setServicesDes(model.getServicesDes());

		return soapModel;
	}

	public static YServicesSoap[] toSoapModels(YServices[] models) {
		YServicesSoap[] soapModels = new YServicesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static YServicesSoap[][] toSoapModels(YServices[][] models) {
		YServicesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new YServicesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new YServicesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static YServicesSoap[] toSoapModels(List<YServices> models) {
		List<YServicesSoap> soapModels = new ArrayList<YServicesSoap>(models.size());

		for (YServices model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new YServicesSoap[soapModels.size()]);
	}

	public YServicesSoap() {
	}

	public long getPrimaryKey() {
		return _yServicesId;
	}

	public void setPrimaryKey(long pk) {
		setYServicesId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getYServicesId() {
		return _yServicesId;
	}

	public void setYServicesId(long yServicesId) {
		_yServicesId = yServicesId;
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

	public String getServicesName() {
		return _servicesName;
	}

	public void setServicesName(String servicesName) {
		_servicesName = servicesName;
	}

	public String getServicesPrice() {
		return _servicesPrice;
	}

	public void setServicesPrice(String servicesPrice) {
		_servicesPrice = servicesPrice;
	}

	public String getServicesDes() {
		return _servicesDes;
	}

	public void setServicesDes(String servicesDes) {
		_servicesDes = servicesDes;
	}

	private String _uuid;
	private long _yServicesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicesName;
	private String _servicesPrice;
	private String _servicesDes;
}