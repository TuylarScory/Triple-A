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
import com.yyms.adp.aaa.service.YServiceLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author USER
 */
public class YServiceClp extends BaseModelImpl<YService> implements YService {
	public YServiceClp() {
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
	public long getPrimaryKey() {
		return _yServiceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setYServiceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _yServiceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_yServiceRemoteModel, uuid);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getYServiceId() {
		return _yServiceId;
	}

	@Override
	public void setYServiceId(long yServiceId) {
		_yServiceId = yServiceId;

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setYServiceId", long.class);

				method.invoke(_yServiceRemoteModel, yServiceId);
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

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_yServiceRemoteModel, groupId);
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

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_yServiceRemoteModel, companyId);
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

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_yServiceRemoteModel, userId);
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

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_yServiceRemoteModel, userName);
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

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_yServiceRemoteModel, createDate);
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

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_yServiceRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceName() {
		return _serviceName;
	}

	@Override
	public void setServiceName(String serviceName) {
		_serviceName = serviceName;

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceName", String.class);

				method.invoke(_yServiceRemoteModel, serviceName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicePrice() {
		return _servicePrice;
	}

	@Override
	public void setServicePrice(String servicePrice) {
		_servicePrice = servicePrice;

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setServicePrice", String.class);

				method.invoke(_yServiceRemoteModel, servicePrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServiceDes() {
		return _serviceDes;
	}

	@Override
	public void setServiceDes(String serviceDes) {
		_serviceDes = serviceDes;

		if (_yServiceRemoteModel != null) {
			try {
				Class<?> clazz = _yServiceRemoteModel.getClass();

				Method method = clazz.getMethod("setServiceDes", String.class);

				method.invoke(_yServiceRemoteModel, serviceDes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				YService.class.getName()));
	}

	public BaseModel<?> getYServiceRemoteModel() {
		return _yServiceRemoteModel;
	}

	public void setYServiceRemoteModel(BaseModel<?> yServiceRemoteModel) {
		_yServiceRemoteModel = yServiceRemoteModel;
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

		Class<?> remoteModelClass = _yServiceRemoteModel.getClass();

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

		Object returnValue = method.invoke(_yServiceRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			YServiceLocalServiceUtil.addYService(this);
		}
		else {
			YServiceLocalServiceUtil.updateYService(this);
		}
	}

	@Override
	public YService toEscapedModel() {
		return (YService)ProxyUtil.newProxyInstance(YService.class.getClassLoader(),
			new Class[] { YService.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		YServiceClp clone = new YServiceClp();

		clone.setUuid(getUuid());
		clone.setYServiceId(getYServiceId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setServiceName(getServiceName());
		clone.setServicePrice(getServicePrice());
		clone.setServiceDes(getServiceDes());

		return clone;
	}

	@Override
	public int compareTo(YService yService) {
		int value = 0;

		value = getServiceName().compareTo(yService.getServiceName());

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

		if (!(obj instanceof YServiceClp)) {
			return false;
		}

		YServiceClp yService = (YServiceClp)obj;

		long primaryKey = yService.getPrimaryKey();

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
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", yServiceId=");
		sb.append(getYServiceId());
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
		sb.append(", serviceName=");
		sb.append(getServiceName());
		sb.append(", servicePrice=");
		sb.append(getServicePrice());
		sb.append(", serviceDes=");
		sb.append(getServiceDes());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.yyms.adp.aaa.model.YService");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yServiceId</column-name><column-value><![CDATA[");
		sb.append(getYServiceId());
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
			"<column><column-name>serviceName</column-name><column-value><![CDATA[");
		sb.append(getServiceName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicePrice</column-name><column-value><![CDATA[");
		sb.append(getServicePrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>serviceDes</column-name><column-value><![CDATA[");
		sb.append(getServiceDes());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _yServiceId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _serviceName;
	private String _servicePrice;
	private String _serviceDes;
	private BaseModel<?> _yServiceRemoteModel;
	private Class<?> _clpSerializerClass = com.yyms.adp.aaa.service.ClpSerializer.class;
}