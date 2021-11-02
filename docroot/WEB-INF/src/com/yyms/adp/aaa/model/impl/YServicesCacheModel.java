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

package com.yyms.adp.aaa.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.yyms.adp.aaa.model.YServices;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing YServices in entity cache.
 *
 * @author USER
 * @see YServices
 * @generated
 */
public class YServicesCacheModel implements CacheModel<YServices>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", yServicesId=");
		sb.append(yServicesId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", servicesName=");
		sb.append(servicesName);
		sb.append(", servicesPrice=");
		sb.append(servicesPrice);
		sb.append(", servicesDes=");
		sb.append(servicesDes);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public YServices toEntityModel() {
		YServicesImpl yServicesImpl = new YServicesImpl();

		if (uuid == null) {
			yServicesImpl.setUuid(StringPool.BLANK);
		}
		else {
			yServicesImpl.setUuid(uuid);
		}

		yServicesImpl.setYServicesId(yServicesId);
		yServicesImpl.setGroupId(groupId);
		yServicesImpl.setCompanyId(companyId);
		yServicesImpl.setUserId(userId);

		if (userName == null) {
			yServicesImpl.setUserName(StringPool.BLANK);
		}
		else {
			yServicesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			yServicesImpl.setCreateDate(null);
		}
		else {
			yServicesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			yServicesImpl.setModifiedDate(null);
		}
		else {
			yServicesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (servicesName == null) {
			yServicesImpl.setServicesName(StringPool.BLANK);
		}
		else {
			yServicesImpl.setServicesName(servicesName);
		}

		if (servicesPrice == null) {
			yServicesImpl.setServicesPrice(StringPool.BLANK);
		}
		else {
			yServicesImpl.setServicesPrice(servicesPrice);
		}

		if (servicesDes == null) {
			yServicesImpl.setServicesDes(StringPool.BLANK);
		}
		else {
			yServicesImpl.setServicesDes(servicesDes);
		}

		yServicesImpl.resetOriginalValues();

		return yServicesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		yServicesId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		servicesName = objectInput.readUTF();
		servicesPrice = objectInput.readUTF();
		servicesDes = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(yServicesId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (servicesName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicesName);
		}

		if (servicesPrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicesPrice);
		}

		if (servicesDes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(servicesDes);
		}
	}

	public String uuid;
	public long yServicesId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String servicesName;
	public String servicesPrice;
	public String servicesDes;
}