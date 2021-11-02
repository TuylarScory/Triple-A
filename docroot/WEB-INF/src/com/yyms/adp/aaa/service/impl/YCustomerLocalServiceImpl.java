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

package com.yyms.adp.aaa.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.yyms.adp.aaa.CustomerAddressException;
import com.yyms.adp.aaa.CustomerNameException;
import com.yyms.adp.aaa.model.YCustomer;
import com.yyms.adp.aaa.service.base.YCustomerLocalServiceBaseImpl;

/**
 * The implementation of the y customer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.yyms.adp.aaa.service.YCustomerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author USER
 * @see com.yyms.adp.aaa.service.base.YCustomerLocalServiceBaseImpl
 * @see com.yyms.adp.aaa.service.YCustomerLocalServiceUtil
 */
public class YCustomerLocalServiceImpl extends YCustomerLocalServiceBaseImpl {
	
	//Finder Method
	public List<YCustomer> getYCustomers(long groupId) throws SystemException {
		return yCustomerPersistence.findByCustomerFinder(groupId);
	}
	
	//Finder Method with Pagination
	public List<YCustomer> getYCustomers(long groupId, int start, int end) throws SystemException {
		return yCustomerPersistence.findByCustomerFinder(groupId, start, end);
	}
	
	//Validation
	protected void validate(String customerName, String customerAddress) throws PortalException {
		if (Validator.isNull(customerName))
			throw new CustomerNameException();
		
		if (Validator.isNull(customerAddress))
			throw new CustomerAddressException();
	}
	
	//Add Customer
	public YCustomer addYCustomer(long userId, String customerName, String customerEmail, String customerAddress, String customerNRC, String customerContact, String payment, long yServicesId, ServiceContext serviceContext) throws PortalException, SystemException {
		
		//Scope Column (uuid, groupId, companyId)
		//User Column (userId, userName)
		//Audit Column (createDate, modifiedDate)
		
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		
		long yCustomerId = counterLocalService.increment();
		YCustomer customer = yCustomerPersistence.create(yCustomerId);
		
		customer.setUuid(serviceContext.getUuid());
		customer.setGroupId(serviceContext.getScopeGroupId());
		customer.setCompanyId(serviceContext.getCompanyId());
		
		customer.setUserId(user.getUserId());
		customer.setUserName(user.getFullName());
		
		customer.setCreateDate(serviceContext.getCreateDate(now));
		customer.setModifiedDate(serviceContext.getModifiedDate(now));
		
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerNRC(customerNRC);
		customer.setCustomerContact(customerContact);
		customer.setPayment(payment);
		customer.setYServicesId(yServicesId);
		
		customer.setExpandoBridgeAttributes(serviceContext);
		
		yCustomerPersistence.update(customer);
		
		return customer;
	}
	

	//Update Customer
	public YCustomer updateYCustomer(long userId, long yCustomerId, String customerName, String customerEmail, String customerAddress, String customerNRC, String customerContact, String payment, long yServicesId, ServiceContext serviceContext) throws PortalException, SystemException {
		
		YCustomer customer = yCustomerPersistence.findByPrimaryKey(yCustomerId);
		
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		
		customer.setModifiedDate(serviceContext.getModifiedDate(now));
		
		customer.setCustomerName(customerName);
		customer.setCustomerEmail(customerEmail);
		customer.setCustomerAddress(customerAddress);
		customer.setCustomerNRC(customerNRC);
		customer.setCustomerContact(customerContact);
		customer.setPayment(payment);
		customer.setYServicesId(yServicesId);
		
		customer.setExpandoBridgeAttributes(serviceContext);
		
		yCustomerPersistence.update(customer);
		
		return customer;
	}
	
	//Delete Customer
	public YCustomer deleteYCustomer(long yCustomerId) throws PortalException, SystemException {
		
		YCustomer customer = getYCustomer(yCustomerId);
		customer = deleteYCustomer(customer);
		return customer;
	}
	
}