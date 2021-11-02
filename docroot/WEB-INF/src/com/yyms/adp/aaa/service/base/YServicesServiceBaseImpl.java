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

package com.yyms.adp.aaa.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.yyms.adp.aaa.model.YServices;
import com.yyms.adp.aaa.service.YServicesService;
import com.yyms.adp.aaa.service.persistence.YCustomerPersistence;
import com.yyms.adp.aaa.service.persistence.YServicesPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the y services remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.yyms.adp.aaa.service.impl.YServicesServiceImpl}.
 * </p>
 *
 * @author USER
 * @see com.yyms.adp.aaa.service.impl.YServicesServiceImpl
 * @see com.yyms.adp.aaa.service.YServicesServiceUtil
 * @generated
 */
public abstract class YServicesServiceBaseImpl extends BaseServiceImpl
	implements YServicesService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.yyms.adp.aaa.service.YServicesServiceUtil} to access the y services remote service.
	 */

	/**
	 * Returns the y customer local service.
	 *
	 * @return the y customer local service
	 */
	public com.yyms.adp.aaa.service.YCustomerLocalService getYCustomerLocalService() {
		return yCustomerLocalService;
	}

	/**
	 * Sets the y customer local service.
	 *
	 * @param yCustomerLocalService the y customer local service
	 */
	public void setYCustomerLocalService(
		com.yyms.adp.aaa.service.YCustomerLocalService yCustomerLocalService) {
		this.yCustomerLocalService = yCustomerLocalService;
	}

	/**
	 * Returns the y customer remote service.
	 *
	 * @return the y customer remote service
	 */
	public com.yyms.adp.aaa.service.YCustomerService getYCustomerService() {
		return yCustomerService;
	}

	/**
	 * Sets the y customer remote service.
	 *
	 * @param yCustomerService the y customer remote service
	 */
	public void setYCustomerService(
		com.yyms.adp.aaa.service.YCustomerService yCustomerService) {
		this.yCustomerService = yCustomerService;
	}

	/**
	 * Returns the y customer persistence.
	 *
	 * @return the y customer persistence
	 */
	public YCustomerPersistence getYCustomerPersistence() {
		return yCustomerPersistence;
	}

	/**
	 * Sets the y customer persistence.
	 *
	 * @param yCustomerPersistence the y customer persistence
	 */
	public void setYCustomerPersistence(
		YCustomerPersistence yCustomerPersistence) {
		this.yCustomerPersistence = yCustomerPersistence;
	}

	/**
	 * Returns the y services local service.
	 *
	 * @return the y services local service
	 */
	public com.yyms.adp.aaa.service.YServicesLocalService getYServicesLocalService() {
		return yServicesLocalService;
	}

	/**
	 * Sets the y services local service.
	 *
	 * @param yServicesLocalService the y services local service
	 */
	public void setYServicesLocalService(
		com.yyms.adp.aaa.service.YServicesLocalService yServicesLocalService) {
		this.yServicesLocalService = yServicesLocalService;
	}

	/**
	 * Returns the y services remote service.
	 *
	 * @return the y services remote service
	 */
	public com.yyms.adp.aaa.service.YServicesService getYServicesService() {
		return yServicesService;
	}

	/**
	 * Sets the y services remote service.
	 *
	 * @param yServicesService the y services remote service
	 */
	public void setYServicesService(
		com.yyms.adp.aaa.service.YServicesService yServicesService) {
		this.yServicesService = yServicesService;
	}

	/**
	 * Returns the y services persistence.
	 *
	 * @return the y services persistence
	 */
	public YServicesPersistence getYServicesPersistence() {
		return yServicesPersistence;
	}

	/**
	 * Sets the y services persistence.
	 *
	 * @param yServicesPersistence the y services persistence
	 */
	public void setYServicesPersistence(
		YServicesPersistence yServicesPersistence) {
		this.yServicesPersistence = yServicesPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return YServices.class;
	}

	protected String getModelClassName() {
		return YServices.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = yServicesPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.yyms.adp.aaa.service.YCustomerLocalService.class)
	protected com.yyms.adp.aaa.service.YCustomerLocalService yCustomerLocalService;
	@BeanReference(type = com.yyms.adp.aaa.service.YCustomerService.class)
	protected com.yyms.adp.aaa.service.YCustomerService yCustomerService;
	@BeanReference(type = YCustomerPersistence.class)
	protected YCustomerPersistence yCustomerPersistence;
	@BeanReference(type = com.yyms.adp.aaa.service.YServicesLocalService.class)
	protected com.yyms.adp.aaa.service.YServicesLocalService yServicesLocalService;
	@BeanReference(type = com.yyms.adp.aaa.service.YServicesService.class)
	protected com.yyms.adp.aaa.service.YServicesService yServicesService;
	@BeanReference(type = YServicesPersistence.class)
	protected YServicesPersistence yServicesPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private YServicesServiceClpInvoker _clpInvoker = new YServicesServiceClpInvoker();
}