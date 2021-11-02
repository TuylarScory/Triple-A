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
 * This class is used by SOAP remote services, specifically {@link com.yyms.adp.aaa.service.http.YCustomerServiceSoap}.
 *
 * @author USER
 * @see com.yyms.adp.aaa.service.http.YCustomerServiceSoap
 * @generated
 */
public class YCustomerSoap implements Serializable {
	public static YCustomerSoap toSoapModel(YCustomer model) {
		YCustomerSoap soapModel = new YCustomerSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setYCustomerId(model.getYCustomerId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setCustomerName(model.getCustomerName());
		soapModel.setCustomerEmail(model.getCustomerEmail());
		soapModel.setCustomerAddress(model.getCustomerAddress());
		soapModel.setCustomerNRC(model.getCustomerNRC());
		soapModel.setCustomerContact(model.getCustomerContact());
		soapModel.setPayment(model.getPayment());
		soapModel.setYServicesId(model.getYServicesId());

		return soapModel;
	}

	public static YCustomerSoap[] toSoapModels(YCustomer[] models) {
		YCustomerSoap[] soapModels = new YCustomerSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static YCustomerSoap[][] toSoapModels(YCustomer[][] models) {
		YCustomerSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new YCustomerSoap[models.length][models[0].length];
		}
		else {
			soapModels = new YCustomerSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static YCustomerSoap[] toSoapModels(List<YCustomer> models) {
		List<YCustomerSoap> soapModels = new ArrayList<YCustomerSoap>(models.size());

		for (YCustomer model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new YCustomerSoap[soapModels.size()]);
	}

	public YCustomerSoap() {
	}

	public long getPrimaryKey() {
		return _yCustomerId;
	}

	public void setPrimaryKey(long pk) {
		setYCustomerId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getYCustomerId() {
		return _yCustomerId;
	}

	public void setYCustomerId(long yCustomerId) {
		_yCustomerId = yCustomerId;
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

	public String getCustomerName() {
		return _customerName;
	}

	public void setCustomerName(String customerName) {
		_customerName = customerName;
	}

	public String getCustomerEmail() {
		return _customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		_customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return _customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		_customerAddress = customerAddress;
	}

	public String getCustomerNRC() {
		return _customerNRC;
	}

	public void setCustomerNRC(String customerNRC) {
		_customerNRC = customerNRC;
	}

	public String getCustomerContact() {
		return _customerContact;
	}

	public void setCustomerContact(String customerContact) {
		_customerContact = customerContact;
	}

	public String getPayment() {
		return _payment;
	}

	public void setPayment(String payment) {
		_payment = payment;
	}

	public long getYServicesId() {
		return _yServicesId;
	}

	public void setYServicesId(long yServicesId) {
		_yServicesId = yServicesId;
	}

	private String _uuid;
	private long _yCustomerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _customerName;
	private String _customerEmail;
	private String _customerAddress;
	private String _customerNRC;
	private String _customerContact;
	private String _payment;
	private long _yServicesId;
}