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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for YServices. This utility wraps
 * {@link com.yyms.adp.aaa.service.impl.YServicesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author USER
 * @see YServicesLocalService
 * @see com.yyms.adp.aaa.service.base.YServicesLocalServiceBaseImpl
 * @see com.yyms.adp.aaa.service.impl.YServicesLocalServiceImpl
 * @generated
 */
public class YServicesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.yyms.adp.aaa.service.impl.YServicesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the y services to the database. Also notifies the appropriate model listeners.
	*
	* @param yServices the y services
	* @return the y services that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices addYServices(
		com.yyms.adp.aaa.model.YServices yServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addYServices(yServices);
	}

	/**
	* Creates a new y services with the primary key. Does not add the y services to the database.
	*
	* @param yServicesId the primary key for the new y services
	* @return the new y services
	*/
	public static com.yyms.adp.aaa.model.YServices createYServices(
		long yServicesId) {
		return getService().createYServices(yServicesId);
	}

	/**
	* Deletes the y services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services that was removed
	* @throws PortalException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices deleteYServices(
		long yServicesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteYServices(yServicesId);
	}

	/**
	* Deletes the y services from the database. Also notifies the appropriate model listeners.
	*
	* @param yServices the y services
	* @return the y services that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices deleteYServices(
		com.yyms.adp.aaa.model.YServices yServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteYServices(yServices);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.yyms.adp.aaa.model.YServices fetchYServices(
		long yServicesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchYServices(yServicesId);
	}

	/**
	* Returns the y services with the matching UUID and company.
	*
	* @param uuid the y services's UUID
	* @param companyId the primary key of the company
	* @return the matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchYServicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchYServicesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the y services matching the UUID and group.
	*
	* @param uuid the y services's UUID
	* @param groupId the primary key of the group
	* @return the matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchYServicesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchYServicesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the y services with the primary key.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services
	* @throws PortalException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices getYServices(
		long yServicesId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getYServices(yServicesId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the y services with the matching UUID and company.
	*
	* @param uuid the y services's UUID
	* @param companyId the primary key of the company
	* @return the matching y services
	* @throws PortalException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices getYServicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getYServicesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns the y services matching the UUID and group.
	*
	* @param uuid the y services's UUID
	* @param groupId the primary key of the group
	* @return the matching y services
	* @throws PortalException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices getYServicesByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getYServicesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the y serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @return the range of y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> getYServiceses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getYServiceses(start, end);
	}

	/**
	* Returns the number of y serviceses.
	*
	* @return the number of y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int getYServicesesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getYServicesesCount();
	}

	/**
	* Updates the y services in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param yServices the y services
	* @return the y services that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices updateYServices(
		com.yyms.adp.aaa.model.YServices yServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateYServices(yServices);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static java.util.List<com.yyms.adp.aaa.model.YServices> getYServe(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getYServe(groupId);
	}

	public static java.util.List<com.yyms.adp.aaa.model.YServices> getYServe(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getYServe(groupId, start, end);
	}

	public static com.yyms.adp.aaa.model.YServices addYServices(long userId,
		java.lang.String servicesName, java.lang.String servicesPrice,
		java.lang.String servicesDes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addYServices(userId, servicesName, servicesPrice,
			servicesDes, serviceContext);
	}

	public static com.yyms.adp.aaa.model.YServices updateYServices(
		long userId, long yServicesId, java.lang.String servicesName,
		java.lang.String servicesPrice, java.lang.String servicesDes,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateYServices(userId, yServicesId, servicesName,
			servicesPrice, servicesDes, serviceContext);
	}

	public static com.yyms.adp.aaa.model.YServices deleteYServices(
		long userId, long yServicesId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteYServices(userId, yServicesId, serviceContext);
	}

	public static void clearService() {
		_service = null;
	}

	public static YServicesLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					YServicesLocalService.class.getName());

			if (invokableLocalService instanceof YServicesLocalService) {
				_service = (YServicesLocalService)invokableLocalService;
			}
			else {
				_service = new YServicesLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(YServicesLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setService(YServicesLocalService service) {
	}

	private static YServicesLocalService _service;
}