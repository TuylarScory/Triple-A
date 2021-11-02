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

package com.yyms.adp.aaa.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link YServiceLocalService}.
 *
 * @author USER
 * @see YServiceLocalService
 * @generated
 */
public class YServiceLocalServiceWrapper implements YServiceLocalService,
	ServiceWrapper<YServiceLocalService> {
	public YServiceLocalServiceWrapper(
		YServiceLocalService yServiceLocalService) {
		_yServiceLocalService = yServiceLocalService;
	}

	/**
	* Adds the y service to the database. Also notifies the appropriate model listeners.
	*
	* @param yService the y service
	* @return the y service that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService addYService(
		com.yyms.adp.aaa.model.YService yService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.addYService(yService);
	}

	/**
	* Creates a new y service with the primary key. Does not add the y service to the database.
	*
	* @param yServiceId the primary key for the new y service
	* @return the new y service
	*/
	@Override
	public com.yyms.adp.aaa.model.YService createYService(long yServiceId) {
		return _yServiceLocalService.createYService(yServiceId);
	}

	/**
	* Deletes the y service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param yServiceId the primary key of the y service
	* @return the y service that was removed
	* @throws PortalException if a y service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService deleteYService(long yServiceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.deleteYService(yServiceId);
	}

	/**
	* Deletes the y service from the database. Also notifies the appropriate model listeners.
	*
	* @param yService the y service
	* @return the y service that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService deleteYService(
		com.yyms.adp.aaa.model.YService yService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.deleteYService(yService);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _yServiceLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.yyms.adp.aaa.model.YService fetchYService(long yServiceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.fetchYService(yServiceId);
	}

	/**
	* Returns the y service with the matching UUID and company.
	*
	* @param uuid the y service's UUID
	* @param companyId the primary key of the company
	* @return the matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService fetchYServiceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.fetchYServiceByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the y service matching the UUID and group.
	*
	* @param uuid the y service's UUID
	* @param groupId the primary key of the group
	* @return the matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService fetchYServiceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.fetchYServiceByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the y service with the matching UUID and company.
	*
	* @param uuid the y service's UUID
	* @param companyId the primary key of the company
	* @return the matching y service
	* @throws PortalException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService getYServiceByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.getYServiceByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the y service matching the UUID and group.
	*
	* @param uuid the y service's UUID
	* @param groupId the primary key of the group
	* @return the matching y service
	* @throws PortalException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService getYServiceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.getYServiceByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the y services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @return the range of y services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.yyms.adp.aaa.model.YService> getYServices(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.getYServices(start, end);
	}

	/**
	* Returns the number of y services.
	*
	* @return the number of y services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getYServicesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.getYServicesCount();
	}

	/**
	* Updates the y service in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param yService the y service
	* @return the y service that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YService updateYService(
		com.yyms.adp.aaa.model.YService yService)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yServiceLocalService.updateYService(yService);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _yServiceLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_yServiceLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _yServiceLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public YServiceLocalService getWrappedYServiceLocalService() {
		return _yServiceLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedYServiceLocalService(
		YServiceLocalService yServiceLocalService) {
		_yServiceLocalService = yServiceLocalService;
	}

	@Override
	public YServiceLocalService getWrappedService() {
		return _yServiceLocalService;
	}

	@Override
	public void setWrappedService(YServiceLocalService yServiceLocalService) {
		_yServiceLocalService = yServiceLocalService;
	}

	private YServiceLocalService _yServiceLocalService;
}