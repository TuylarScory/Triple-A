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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.yyms.adp.aaa.ServicesNameException;
import com.yyms.adp.aaa.ServicesPriceException;
import com.yyms.adp.aaa.model.YServices;
import com.yyms.adp.aaa.service.base.YServicesLocalServiceBaseImpl;



/**
 * The implementation of the y services local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.yyms.adp.aaa.service.YServicesLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author USER
 * @see com.yyms.adp.aaa.service.base.YServicesLocalServiceBaseImpl
 * @see com.yyms.adp.aaa.service.YServicesLocalServiceUtil
 */
public class YServicesLocalServiceImpl extends YServicesLocalServiceBaseImpl {
	
	//Finder Method
	public List<YServices> getYServe(long groupId) throws SystemException {
		return yServicesPersistence.findByServicesFinder(groupId);
	}
	
	//Finder Method with Pagination
	public List<YServices> getYServe(long groupId, int start, int end) throws SystemException {
		return yServicesPersistence.findByServicesFinder(groupId);
	}
	
	//Validation Method
	protected void validate(String servicesName, String servicesPrice) throws PortalException {
		if (Validator.isNull(servicesName))
			throw new ServicesNameException();
		
		if (Validator.isNull(servicesPrice))
			throw new ServicesPriceException();
	}
	
	//Add Services Method
	public YServices addYServices(long userId, String servicesName, String servicesPrice, String servicesDes, ServiceContext serviceContext) throws PortalException, SystemException {
		
		//Scope Column (uuid, groupId, companyId)
		//User Column (userId, userName)
		//Audit Column (createDate, modifiedDate)
		
		User user = userPersistence.findByPrimaryKey(userId);
		Date now = new Date();
		long yServicesId = counterLocalService.increment();
		
		YServices services = yServicesPersistence.create(yServicesId);
		
		services.setUuid(serviceContext.getUuid());
		services.setGroupId(serviceContext.getScopeGroupId());
		services.setCompanyId(serviceContext.getCompanyId());
		
		services.setUserId(user.getUserId());
		services.setUserName(user.getFullName());
		
		services.setCreateDate(serviceContext.getCreateDate(now));
		services.setModifiedDate(serviceContext.getModifiedDate(now));
		
		services.setServicesName(servicesName);
		services.setServicesPrice(servicesPrice);
		services.setServicesDes(servicesDes);
		
		services.setExpandoBridgeAttributes(serviceContext);
		
		yServicesPersistence.update(services);
		
		resourceLocalService.addResources(user.getCompanyId(), serviceContext.getScopeGroupId(), userId, YServices.class.getName(), yServicesId, false, true, true);
		
		return services;
		
	}
	
	//Update Services (servicesId which want to update or edit)
	public YServices updateYServices(long userId, long yServicesId, String servicesName, String servicesPrice, String servicesDes, ServiceContext serviceContext) throws PortalException, SystemException {
		
		User user = userPersistence.findByPrimaryKey(userId);
		
		//Get Current ServicesId
		YServices services = yServicesPersistence.findByPrimaryKey(yServicesId);
		
		//Set Modified Date
		services.setModifiedDate(serviceContext.getModifiedDate());
		
		//Allows to edit or update servicesName, servicesPrice, servicesDes
		services.setServicesName(servicesName);
		services.setServicesPrice(servicesPrice);
		services.setServicesDes(servicesDes);
		
		services.setExpandoBridgeAttributes(serviceContext);
		
		yServicesPersistence.update(services);
		
		resourceLocalService.updateResources(user.getCompanyId(), serviceContext.getScopeGroupId(), YServices.class.getName(), yServicesId, serviceContext.getGroupPermissions(), serviceContext.getGuestPermissions());
		
		return services;
		
	}
	
	//Delete Services
	@Override
	public YServices deleteYServices(long userId, long yServicesId, ServiceContext serviceContext) throws PortalException, SystemException {
		
		//Get servicesId which we want to Delete
		YServices services = getYServices(yServicesId);
		
		//Call deleteYServices Method by passing Current servicesId which want to Delete
		services = deleteYServices(yServicesId);
		
		//Return Current Services Object
		resourceLocalService.deleteResource(serviceContext.getCompanyId(), YServices.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, yServicesId);
		
		return services;
	}
	
	

}