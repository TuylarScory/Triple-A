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

import com.yyms.adp.aaa.model.YCustomer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing YCustomer in entity cache.
 *
 * @author USER
 * @see YCustomer
 * @generated
 */
public class YCustomerCacheModel implements CacheModel<YCustomer>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", yCustomerId=");
		sb.append(yCustomerId);
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
		sb.append(", customerName=");
		sb.append(customerName);
		sb.append(", customerEmail=");
		sb.append(customerEmail);
		sb.append(", customerAddress=");
		sb.append(customerAddress);
		sb.append(", customerNRC=");
		sb.append(customerNRC);
		sb.append(", customerContact=");
		sb.append(customerContact);
		sb.append(", payment=");
		sb.append(payment);
		sb.append(", yServicesId=");
		sb.append(yServicesId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public YCustomer toEntityModel() {
		YCustomerImpl yCustomerImpl = new YCustomerImpl();

		if (uuid == null) {
			yCustomerImpl.setUuid(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setUuid(uuid);
		}

		yCustomerImpl.setYCustomerId(yCustomerId);
		yCustomerImpl.setGroupId(groupId);
		yCustomerImpl.setCompanyId(companyId);
		yCustomerImpl.setUserId(userId);

		if (userName == null) {
			yCustomerImpl.setUserName(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			yCustomerImpl.setCreateDate(null);
		}
		else {
			yCustomerImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			yCustomerImpl.setModifiedDate(null);
		}
		else {
			yCustomerImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (customerName == null) {
			yCustomerImpl.setCustomerName(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setCustomerName(customerName);
		}

		if (customerEmail == null) {
			yCustomerImpl.setCustomerEmail(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setCustomerEmail(customerEmail);
		}

		if (customerAddress == null) {
			yCustomerImpl.setCustomerAddress(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setCustomerAddress(customerAddress);
		}

		if (customerNRC == null) {
			yCustomerImpl.setCustomerNRC(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setCustomerNRC(customerNRC);
		}

		if (customerContact == null) {
			yCustomerImpl.setCustomerContact(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setCustomerContact(customerContact);
		}

		if (payment == null) {
			yCustomerImpl.setPayment(StringPool.BLANK);
		}
		else {
			yCustomerImpl.setPayment(payment);
		}

		yCustomerImpl.setYServicesId(yServicesId);

		yCustomerImpl.resetOriginalValues();

		return yCustomerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		yCustomerId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		customerName = objectInput.readUTF();
		customerEmail = objectInput.readUTF();
		customerAddress = objectInput.readUTF();
		customerNRC = objectInput.readUTF();
		customerContact = objectInput.readUTF();
		payment = objectInput.readUTF();
		yServicesId = objectInput.readLong();
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

		objectOutput.writeLong(yCustomerId);
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

		if (customerName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerName);
		}

		if (customerEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerEmail);
		}

		if (customerAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerAddress);
		}

		if (customerNRC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerNRC);
		}

		if (customerContact == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(customerContact);
		}

		if (payment == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(payment);
		}

		objectOutput.writeLong(yServicesId);
	}

	public String uuid;
	public long yCustomerId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String customerName;
	public String customerEmail;
	public String customerAddress;
	public String customerNRC;
	public String customerContact;
	public String payment;
	public long yServicesId;
}