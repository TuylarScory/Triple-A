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
 * Provides a wrapper for {@link YCustomerLocalService}.
 *
 * @author USER
 * @see YCustomerLocalService
 * @generated
 */
public class YCustomerLocalServiceWrapper implements YCustomerLocalService,
	ServiceWrapper<YCustomerLocalService> {
	public YCustomerLocalServiceWrapper(
		YCustomerLocalService yCustomerLocalService) {
		_yCustomerLocalService = yCustomerLocalService;
	}

	/**
	* Adds the y customer to the database. Also notifies the appropriate model listeners.
	*
	* @param yCustomer the y customer
	* @return the y customer that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer addYCustomer(
		com.yyms.adp.aaa.model.YCustomer yCustomer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.addYCustomer(yCustomer);
	}

	/**
	* Creates a new y customer with the primary key. Does not add the y customer to the database.
	*
	* @param yCustomerId the primary key for the new y customer
	* @return the new y customer
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer createYCustomer(long yCustomerId) {
		return _yCustomerLocalService.createYCustomer(yCustomerId);
	}

	/**
	* Deletes the y customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param yCustomerId the primary key of the y customer
	* @return the y customer that was removed
	* @throws PortalException if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer deleteYCustomer(long yCustomerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.deleteYCustomer(yCustomerId);
	}

	/**
	* Deletes the y customer from the database. Also notifies the appropriate model listeners.
	*
	* @param yCustomer the y customer
	* @return the y customer that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer deleteYCustomer(
		com.yyms.adp.aaa.model.YCustomer yCustomer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.deleteYCustomer(yCustomer);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _yCustomerLocalService.dynamicQuery();
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
		return _yCustomerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _yCustomerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _yCustomerLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _yCustomerLocalService.dynamicQueryCount(dynamicQuery);
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
		return _yCustomerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.yyms.adp.aaa.model.YCustomer fetchYCustomer(long yCustomerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.fetchYCustomer(yCustomerId);
	}

	/**
	* Returns the y customer with the matching UUID and company.
	*
	* @param uuid the y customer's UUID
	* @param companyId the primary key of the company
	* @return the matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer fetchYCustomerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.fetchYCustomerByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the y customer matching the UUID and group.
	*
	* @param uuid the y customer's UUID
	* @param groupId the primary key of the group
	* @return the matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer fetchYCustomerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.fetchYCustomerByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the y customer with the primary key.
	*
	* @param yCustomerId the primary key of the y customer
	* @return the y customer
	* @throws PortalException if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer getYCustomer(long yCustomerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getYCustomer(yCustomerId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the y customer with the matching UUID and company.
	*
	* @param uuid the y customer's UUID
	* @param companyId the primary key of the company
	* @return the matching y customer
	* @throws PortalException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer getYCustomerByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getYCustomerByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the y customer matching the UUID and group.
	*
	* @param uuid the y customer's UUID
	* @param groupId the primary key of the group
	* @return the matching y customer
	* @throws PortalException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer getYCustomerByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getYCustomerByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the y customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @return the range of y customers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> getYCustomers(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getYCustomers(start, end);
	}

	/**
	* Returns the number of y customers.
	*
	* @return the number of y customers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getYCustomersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getYCustomersCount();
	}

	/**
	* Updates the y customer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param yCustomer the y customer
	* @return the y customer that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.yyms.adp.aaa.model.YCustomer updateYCustomer(
		com.yyms.adp.aaa.model.YCustomer yCustomer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.updateYCustomer(yCustomer);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _yCustomerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_yCustomerLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _yCustomerLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> getYCustomers(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getYCustomers(groupId);
	}

	@Override
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> getYCustomers(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.getYCustomers(groupId, start, end);
	}

	@Override
	public com.yyms.adp.aaa.model.YCustomer addYCustomer(long userId,
		java.lang.String customerName, java.lang.String customerEmail,
		java.lang.String customerAddress, java.lang.String customerNRC,
		java.lang.String customerContact, java.lang.String payment,
		long yServicesId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.addYCustomer(userId, customerName,
			customerEmail, customerAddress, customerNRC, customerContact,
			payment, yServicesId, serviceContext);
	}

	@Override
	public com.yyms.adp.aaa.model.YCustomer updateYCustomer(long userId,
		long yCustomerId, java.lang.String customerName,
		java.lang.String customerEmail, java.lang.String customerAddress,
		java.lang.String customerNRC, java.lang.String customerContact,
		java.lang.String payment, long yServicesId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _yCustomerLocalService.updateYCustomer(userId, yCustomerId,
			customerName, customerEmail, customerAddress, customerNRC,
			customerContact, payment, yServicesId, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public YCustomerLocalService getWrappedYCustomerLocalService() {
		return _yCustomerLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedYCustomerLocalService(
		YCustomerLocalService yCustomerLocalService) {
		_yCustomerLocalService = yCustomerLocalService;
	}

	@Override
	public YCustomerLocalService getWrappedService() {
		return _yCustomerLocalService;
	}

	@Override
	public void setWrappedService(YCustomerLocalService yCustomerLocalService) {
		_yCustomerLocalService = yCustomerLocalService;
	}

	private YCustomerLocalService _yCustomerLocalService;
}