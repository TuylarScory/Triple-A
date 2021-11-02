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

import com.yyms.adp.aaa.model.YService;

/**
 * The persistence interface for the y service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see YServicePersistenceImpl
 * @see YServiceUtil
 * @generated
 */
public interface YServicePersistence extends BasePersistence<YService> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link YServiceUtil} to access the y service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the y services where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the y services where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @return the range of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y services where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the first y service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the last y service in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y services before and after the current y service in the ordered set where uuid = &#63;.
	*
	* @param yServiceId the primary key of the current y service
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a y service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService[] findByUuid_PrevAndNext(
		long yServiceId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Removes all the y services where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y services where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y service where uuid = &#63; and groupId = &#63; or throws a {@link com.yyms.adp.aaa.NoSuchYServiceException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByUUID_G(java.lang.String uuid,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the y service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the y service where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the y service that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the number of y services where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y services where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the y services where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @return the range of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y services where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the first y service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the last y service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y services before and after the current y service in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param yServiceId the primary key of the current y service
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a y service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService[] findByUuid_C_PrevAndNext(
		long yServiceId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Removes all the y services where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y services where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y services where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByServiceName(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the y services where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @return the range of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByServiceName(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y services where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findByServiceName(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByServiceName_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the first y service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByServiceName_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByServiceName_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the last y service in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y service, or <code>null</code> if a matching y service could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByServiceName_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y services before and after the current y service in the ordered set where groupId = &#63;.
	*
	* @param yServiceId the primary key of the current y service
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a y service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService[] findByServiceName_PrevAndNext(
		long yServiceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Removes all the y services where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByServiceName(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y services where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching y services
	* @throws SystemException if a system exception occurred
	*/
	public int countByServiceName(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the y service in the entity cache if it is enabled.
	*
	* @param yService the y service
	*/
	public void cacheResult(com.yyms.adp.aaa.model.YService yService);

	/**
	* Caches the y services in the entity cache if it is enabled.
	*
	* @param yServices the y services
	*/
	public void cacheResult(
		java.util.List<com.yyms.adp.aaa.model.YService> yServices);

	/**
	* Creates a new y service with the primary key. Does not add the y service to the database.
	*
	* @param yServiceId the primary key for the new y service
	* @return the new y service
	*/
	public com.yyms.adp.aaa.model.YService create(long yServiceId);

	/**
	* Removes the y service with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param yServiceId the primary key of the y service
	* @return the y service that was removed
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a y service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService remove(long yServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	public com.yyms.adp.aaa.model.YService updateImpl(
		com.yyms.adp.aaa.model.YService yService)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y service with the primary key or throws a {@link com.yyms.adp.aaa.NoSuchYServiceException} if it could not be found.
	*
	* @param yServiceId the primary key of the y service
	* @return the y service
	* @throws com.yyms.adp.aaa.NoSuchYServiceException if a y service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService findByPrimaryKey(long yServiceId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYServiceException;

	/**
	* Returns the y service with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param yServiceId the primary key of the y service
	* @return the y service, or <code>null</code> if a y service with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YService fetchByPrimaryKey(long yServiceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y services.
	*
	* @return the y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YService> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y services.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YServiceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of y services
	* @param end the upper bound of the range of y services (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of y services
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YService> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the y services from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y services.
	*
	* @return the number of y services
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}