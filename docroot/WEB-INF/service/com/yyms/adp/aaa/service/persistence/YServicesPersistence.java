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

import com.liferay.portal.service.persistence.BasePersistence;

import com.yyms.adp.aaa.model.YServices;

/**
 * The persistence interface for the y services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see YServicesPersistenceImpl
 * @see YServicesUtil
 * @generated
 */
public interface YServicesPersistence extends BasePersistence<YServices> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link YServicesUtil} to access the y services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the y serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the first y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the last y services in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.yyms.adp.aaa.model.YServices[] findByUuid_PrevAndNext(
		long yServicesId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Removes all the y serviceses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y serviceses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y services where uuid = &#63; and groupId = &#63; or throws a {@link com.yyms.adp.aaa.NoSuchYServicesException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the y services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the y services where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the y services that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the number of y serviceses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.yyms.adp.aaa.model.YServices findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the first y services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.yyms.adp.aaa.model.YServices findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the last y services in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.yyms.adp.aaa.model.YServices[] findByUuid_C_PrevAndNext(
		long yServicesId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Removes all the y serviceses where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y serviceses where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByServicesFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByServicesFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findByServicesFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices findByServicesFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the first y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByServicesFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices findByServicesFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the last y services in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y services, or <code>null</code> if a matching y services could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByServicesFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.yyms.adp.aaa.model.YServices[] findByServicesFinder_PrevAndNext(
		long yServicesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns all the y serviceses that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching y serviceses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YServices> filterFindByServicesFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> filterFindByServicesFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> filterFindByServicesFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.yyms.adp.aaa.model.YServices[] filterFindByServicesFinder_PrevAndNext(
		long yServicesId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Removes all the y serviceses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByServicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y serviceses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countByServicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y serviceses that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching y serviceses that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByServicesFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the y services in the entity cache if it is enabled.
	*
	* @param yServices the y services
	*/
	public void cacheResult(com.yyms.adp.aaa.model.YServices yServices);

	/**
	* Caches the y serviceses in the entity cache if it is enabled.
	*
	* @param yServiceses the y serviceses
	*/
	public void cacheResult(
		java.util.List<com.yyms.adp.aaa.model.YServices> yServiceses);

	/**
	* Creates a new y services with the primary key. Does not add the y services to the database.
	*
	* @param yServicesId the primary key for the new y services
	* @return the new y services
	*/
	public com.yyms.adp.aaa.model.YServices create(long yServicesId);

	/**
	* Removes the y services with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services that was removed
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices remove(long yServicesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	public com.yyms.adp.aaa.model.YServices updateImpl(
		com.yyms.adp.aaa.model.YServices yServices)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y services with the primary key or throws a {@link com.yyms.adp.aaa.NoSuchYServicesException} if it could not be found.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services
	* @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices findByPrimaryKey(long yServicesId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServicesException;

	/**
	* Returns the y services with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param yServicesId the primary key of the y services
	* @return the y services, or <code>null</code> if a y services with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YServices fetchByPrimaryKey(long yServicesId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y serviceses.
	*
	* @return the y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YServices> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YServices> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the y serviceses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y serviceses.
	*
	* @return the number of y serviceses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}