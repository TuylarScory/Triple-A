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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.yyms.adp.aaa.service.ClpSerializer;
import com.yyms.adp.aaa.service.YCustomerLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author USER
 */
public class YCustomerClp extends BaseModelImpl<YCustomer> implements YCustomer {
	public YCustomerClp() {
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
	public long getPrimaryKey() {
		return _yCustomerId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setYCustomerId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _yCustomerId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_yCustomerRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getYCustomerId() {
		return _yCustomerId;
	}

	@Override
	public void setYCustomerId(long yCustomerId) {
		_yCustomerId = yCustomerId;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setYCustomerId", long.class);

				method.invoke(_yCustomerRemoteModel, yCustomerId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_yCustomerRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_yCustomerRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_yCustomerRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_yCustomerRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_yCustomerRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_yCustomerRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerName() {
		return _customerName;
	}

	@Override
	public void setCustomerName(String customerName) {
		_customerName = customerName;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerName", String.class);

				method.invoke(_yCustomerRemoteModel, customerName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerEmail() {
		return _customerEmail;
	}

	@Override
	public void setCustomerEmail(String customerEmail) {
		_customerEmail = customerEmail;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerEmail", String.class);

				method.invoke(_yCustomerRemoteModel, customerEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerAddress() {
		return _customerAddress;
	}

	@Override
	public void setCustomerAddress(String customerAddress) {
		_customerAddress = customerAddress;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerAddress",
						String.class);

				method.invoke(_yCustomerRemoteModel, customerAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerNRC() {
		return _customerNRC;
	}

	@Override
	public void setCustomerNRC(String customerNRC) {
		_customerNRC = customerNRC;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerNRC", String.class);

				method.invoke(_yCustomerRemoteModel, customerNRC);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCustomerContact() {
		return _customerContact;
	}

	@Override
	public void setCustomerContact(String customerContact) {
		_customerContact = customerContact;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setCustomerContact",
						String.class);

				method.invoke(_yCustomerRemoteModel, customerContact);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPayment() {
		return _payment;
	}

	@Override
	public void setPayment(String payment) {
		_payment = payment;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setPayment", String.class);

				method.invoke(_yCustomerRemoteModel, payment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getYServicesId() {
		return _yServicesId;
	}

	@Override
	public void setYServicesId(long yServicesId) {
		_yServicesId = yServicesId;

		if (_yCustomerRemoteModel != null) {
			try {
				Class<?> clazz = _yCustomerRemoteModel.getClass();

				Method method = clazz.getMethod("setYServicesId", long.class);

				method.invoke(_yCustomerRemoteModel, yServicesId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				YCustomer.class.getName()));
	}

	public BaseModel<?> getYCustomerRemoteModel() {
		return _yCustomerRemoteModel;
	}

	public void setYCustomerRemoteModel(BaseModel<?> yCustomerRemoteModel) {
		_yCustomerRemoteModel = yCustomerRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _yCustomerRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_yCustomerRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			YCustomerLocalServiceUtil.addYCustomer(this);
		}
		else {
			YCustomerLocalServiceUtil.updateYCustomer(this);
		}
	}

	@Override
	public YCustomer toEscapedModel() {
		return (YCustomer)ProxyUtil.newProxyInstance(YCustomer.class.getClassLoader(),
			new Class[] { YCustomer.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		YCustomerClp clone = new YCustomerClp();

		clone.setUuid(getUuid());
		clone.setYCustomerId(getYCustomerId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setCustomerName(getCustomerName());
		clone.setCustomerEmail(getCustomerEmail());
		clone.setCustomerAddress(getCustomerAddress());
		clone.setCustomerNRC(getCustomerNRC());
		clone.setCustomerContact(getCustomerContact());
		clone.setPayment(getPayment());
		clone.setYServicesId(getYServicesId());

		return clone;
	}

	@Override
	public int compareTo(YCustomer yCustomer) {
		int value = 0;

		value = getCustomerName().compareTo(yCustomer.getCustomerName());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof YCustomerClp)) {
			return false;
		}

		YCustomerClp yCustomer = (YCustomerClp)obj;

		long primaryKey = yCustomer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", yCustomerId=");
		sb.append(getYCustomerId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", customerName=");
		sb.append(getCustomerName());
		sb.append(", customerEmail=");
		sb.append(getCustomerEmail());
		sb.append(", customerAddress=");
		sb.append(getCustomerAddress());
		sb.append(", customerNRC=");
		sb.append(getCustomerNRC());
		sb.append(", customerContact=");
		sb.append(getCustomerContact());
		sb.append(", payment=");
		sb.append(getPayment());
		sb.append(", yServicesId=");
		sb.append(getYServicesId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("com.yyms.adp.aaa.model.YCustomer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yCustomerId</column-name><column-value><![CDATA[");
		sb.append(getYCustomerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerName</column-name><column-value><![CDATA[");
		sb.append(getCustomerName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerEmail</column-name><column-value><![CDATA[");
		sb.append(getCustomerEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerAddress</column-name><column-value><![CDATA[");
		sb.append(getCustomerAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerNRC</column-name><column-value><![CDATA[");
		sb.append(getCustomerNRC());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>customerContact</column-name><column-value><![CDATA[");
		sb.append(getCustomerContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payment</column-name><column-value><![CDATA[");
		sb.append(getPayment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yServicesId</column-name><column-value><![CDATA[");
		sb.append(getYServicesId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _yCustomerId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
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
	private BaseModel<?> _yCustomerRemoteModel;
	private Class<?> _clpSerializerClass = com.yyms.adp.aaa.service.ClpSerializer.class;
}