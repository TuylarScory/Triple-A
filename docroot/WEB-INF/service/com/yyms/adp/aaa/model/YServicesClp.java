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
import com.yyms.adp.aaa.service.YServicesLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author USER
 */
public class YServicesClp extends BaseModelImpl<YServices> implements YServices {
	public YServicesClp() {
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
	public long getPrimaryKey() {
		return _yServicesId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setYServicesId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _yServicesId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public String getUuid() {
		return _uuid;
	}

	@Override
	public void setUuid(String uuid) {
		_uuid = uuid;

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setUuid", String.class);

				method.invoke(_yServicesRemoteModel, uuid);
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

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setYServicesId", long.class);

				method.invoke(_yServicesRemoteModel, yServicesId);
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

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_yServicesRemoteModel, groupId);
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

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_yServicesRemoteModel, companyId);
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

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_yServicesRemoteModel, userId);
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

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_yServicesRemoteModel, userName);
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

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_yServicesRemoteModel, createDate);
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

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_yServicesRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicesName() {
		return _servicesName;
	}

	@Override
	public void setServicesName(String servicesName) {
		_servicesName = servicesName;

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesName", String.class);

				method.invoke(_yServicesRemoteModel, servicesName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicesPrice() {
		return _servicesPrice;
	}

	@Override
	public void setServicesPrice(String servicesPrice) {
		_servicesPrice = servicesPrice;

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesPrice", String.class);

				method.invoke(_yServicesRemoteModel, servicesPrice);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getServicesDes() {
		return _servicesDes;
	}

	@Override
	public void setServicesDes(String servicesDes) {
		_servicesDes = servicesDes;

		if (_yServicesRemoteModel != null) {
			try {
				Class<?> clazz = _yServicesRemoteModel.getClass();

				Method method = clazz.getMethod("setServicesDes", String.class);

				method.invoke(_yServicesRemoteModel, servicesDes);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				YServices.class.getName()));
	}

	public BaseModel<?> getYServicesRemoteModel() {
		return _yServicesRemoteModel;
	}

	public void setYServicesRemoteModel(BaseModel<?> yServicesRemoteModel) {
		_yServicesRemoteModel = yServicesRemoteModel;
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

		Class<?> remoteModelClass = _yServicesRemoteModel.getClass();

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

		Object returnValue = method.invoke(_yServicesRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			YServicesLocalServiceUtil.addYServices(this);
		}
		else {
			YServicesLocalServiceUtil.updateYServices(this);
		}
	}

	@Override
	public YServices toEscapedModel() {
		return (YServices)ProxyUtil.newProxyInstance(YServices.class.getClassLoader(),
			new Class[] { YServices.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		YServicesClp clone = new YServicesClp();

		clone.setUuid(getUuid());
		clone.setYServicesId(getYServicesId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setServicesName(getServicesName());
		clone.setServicesPrice(getServicesPrice());
		clone.setServicesDes(getServicesDes());

		return clone;
	}

	@Override
	public int compareTo(YServices yServices) {
		int value = 0;

		value = getServicesName().compareTo(yServices.getServicesName());

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

		if (!(obj instanceof YServicesClp)) {
			return false;
		}

		YServicesClp yServices = (YServicesClp)obj;

		long primaryKey = yServices.getPrimaryKey();

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
		sb.append(", yServicesId=");
		sb.append(getYServicesId());
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
		sb.append(", servicesName=");
		sb.append(getServicesName());
		sb.append(", servicesPrice=");
		sb.append(getServicesPrice());
		sb.append(", servicesDes=");
		sb.append(getServicesDes());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.yyms.adp.aaa.model.YServices");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>yServicesId</column-name><column-value><![CDATA[");
		sb.append(getYServicesId());
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
			"<column><column-name>servicesName</column-name><column-value><![CDATA[");
		sb.append(getServicesName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicesPrice</column-name><column-value><![CDATA[");
		sb.append(getServicesPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>servicesDes</column-name><column-value><![CDATA[");
		sb.append(getServicesDes());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _yServicesId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _servicesName;
	private String _servicesPrice;
	private String _servicesDes;
	private BaseModel<?> _yServicesRemoteModel;
	private Class<?> _clpSerializerClass = com.yyms.adp.aaa.service.ClpSerializer.class;
}