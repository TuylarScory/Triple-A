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

package com.yyms.adp.aaa.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.yyms.adp.aaa.model.YServices;

import java.util.List;

/**
 * The persistence utility for the y services service. This utility wraps {@link YServicesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see YServicesPersistence
 * @see YServicesPersistenceImpl
 * @generated
 */
public class YServicesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(YServices yServices) {
		getPersistence().clearCache(yServices);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<YServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<YServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<YServices> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static YServices update(YServices yServices)
		throws SystemException {
		return getPersistence().update(yServices);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static YServices update(YServices yServices,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(yServices, serviceContext);
	}

	/**
	* Returns all the y serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the y serviceses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @return the range of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the y serviceses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns the first y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the y serviceses before and after the current y services in the ordered set where uuid = &#63;.
	*
	* @param yServicesId the primary key of the current y services
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices[] findByUuid_PrevAndNext(
		long yServicesId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .findByUuid_PrevAndNext(yServicesId, uuid, orderByComparator);
	}

	/**
	* Removes all the y serviceses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of y serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the y services where uuid = &#63; and groupId = &#63; or throws a {@link com.yyms.adp.aaa.NoSuchYServicesException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the y services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the y services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the y services where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the y services that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of y serviceses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the y serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the y serviceses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @return the range of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the y serviceses where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns the first y services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first y services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last y services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last y services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the y serviceses before and after the current y services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param yServicesId the primary key of the current y services
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices[] findByUuid_C_PrevAndNext(
		long yServicesId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(yServicesId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the y serviceses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of y serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the y serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByServicesFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByServicesFinder(groupId);
	}

	/**
	* Returns a range of all the y serviceses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @return the range of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByServicesFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByServicesFinder(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the y serviceses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findByServicesFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByServicesFinder(groupId, start, end, orderByComparator);
	}

	/**
	* Returns the first y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByServicesFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .findByServicesFinder_First(groupId, orderByComparator);
	}

	/**
	* Returns the first y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByServicesFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServicesFinder_First(groupId, orderByComparator);
	}

	/**
	* Returns the last y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByServicesFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .findByServicesFinder_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByServicesFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByServicesFinder_Last(groupId, orderByComparator);
	}

	/**
	* Returns the y serviceses before and after the current y services in the ordered set where groupId = &#63;.
	*
	* @param yServicesId the primary key of the current y services
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices[] findByServicesFinder_PrevAndNext(
		long yServicesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .findByServicesFinder_PrevAndNext(yServicesId, groupId,
			orderByComparator);
	}

	/**
	* Returns all the y serviceses that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching y serviceses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> filterFindByServicesFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByServicesFinder(groupId);
	}

	/**
	* Returns a range of all the y serviceses that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @return the range of matching y serviceses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> filterFindByServicesFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByServicesFinder(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the y serviceses that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y serviceses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> filterFindByServicesFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByServicesFinder(groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the y serviceses before and after the current y services in the ordered set of y serviceses that the user has permission to view where groupId = &#63;.
	*
	* @param yServicesId the primary key of the current y services
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices[] filterFindByServicesFinder_PrevAndNext(
		long yServicesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence()
				   .filterFindByServicesFinder_PrevAndNext(yServicesId,
			groupId, orderByComparator);
	}

	/**
	* Removes all the y serviceses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByServicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByServicesFinder(groupId);
	}

	/**
	* Returns the number of y serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByServicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByServicesFinder(groupId);
	}

	/**
	* Returns the number of y serviceses that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching y serviceses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByServicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByServicesFinder(groupId);
	}

	/**
	* Caches the y services in the entity cache if it is enabled.
	*
	* @param yServices the y services
	*/
	public static void cacheResult(com.yyms.adp.aaa.model.YServices yServices) {
		getPersistence().cacheResult(yServices);
	}

	/**
	* Caches the y serviceses in the entity cache if it is enabled.
	*
	* @param yServiceses the y serviceses
	*/
	public static void cacheResult(
		java.util.List<com.yyms.adp.aaa.model.YServices> yServiceses) {
		getPersistence().cacheResult(yServiceses);
	}

	/**
	* Creates a new y services with the primary key. Does not add the y services to the database.
	*
	* @param yServicesId the primary key for the new y services
	* @return the new y services
	*/
	public static com.yyms.adp.aaa.model.YServices create(long yServicesId) {
		return getPersistence().create(yServicesId);
	}

	/**
	* Removes the y services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services that was removed
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices remove(long yServicesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence().remove(yServicesId);
	}

	public static com.yyms.adp.aaa.model.YServices updateImpl(
		com.yyms.adp.aaa.model.YServices yServices)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(yServices);
	}

	/**
	* Returns the y services with the primary key or throws a {@link com.yyms.adp.aaa.NoSuchYServicesException} if it could not be found.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices findByPrimaryKey(
		long yServicesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException {
		return getPersistence().findByPrimaryKey(yServicesId);
	}

	/**
	* Returns the y services with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services, or <code>null</code> if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.yyms.adp.aaa.model.YServices fetchByPrimaryKey(
		long yServicesId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(yServicesId);
	}

	/**
	* Returns all the y serviceses.
	*
	* @return the y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the y serviceses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServicesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of y serviceses
	* @param end the upper bound of the range of y serviceses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.yyms.adp.aaa.model.YServices> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the y serviceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of y serviceses.
	*
	* @return the number of y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static YServicesPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (YServicesPersistence)PortletBeanLocatorUtil.locate(com.yyms.adp.aaa.service.ClpSerializer.getServletContextName(),
					YServicesPersistence.class.getName());

			ReferenceRegistry.registerReference(YServicesUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(YServicesPersistence persistence) {
	}

	private static YServicesPersistence _persistence;
}