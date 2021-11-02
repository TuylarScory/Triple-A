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

import com.yyms.adp.aaa.model.YCustomer;

/**
 * The persistence interface for the y customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see YCustomerPersistenceImpl
 * @see YCustomerUtil
 * @generated
 */
public interface YCustomerPersistence extends BasePersistence<YCustomer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link YCustomerUtil} to access the y customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the y customers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByUuid(
		java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the y customers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @return the range of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByUuid(
		java.lang.String uuid, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y customers where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y customer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the first y customer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByUuid_First(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y customer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the last y customer in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByUuid_Last(
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y customers before and after the current y customer in the ordered set where uuid = &#63;.
	*
	* @param yCustomerId the primary key of the current y customer
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer[] findByUuid_PrevAndNext(
		long yCustomerId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Removes all the y customers where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y customers where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid(java.lang.String uuid)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y customer where uuid = &#63; and groupId = &#63; or throws a {@link com.yyms.adp.aaa.NoSuchYCustomerException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the y customer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y customer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByUUID_G(
		java.lang.String uuid, long groupId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the y customer where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the y customer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer removeByUUID_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the number of y customers where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y customers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByUuid_C(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the y customers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @return the range of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y customers where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByUuid_C(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y customer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the first y customer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByUuid_C_First(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y customer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the last y customer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByUuid_C_Last(
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y customers before and after the current y customer in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param yCustomerId the primary key of the current y customer
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer[] findByUuid_C_PrevAndNext(
		long yCustomerId, java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Removes all the y customers where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y customers where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y customers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByCustomerFinder(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the y customers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @return the range of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByCustomerFinder(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y customers where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findByCustomerFinder(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first y customer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByCustomerFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the first y customer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByCustomerFinder_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last y customer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByCustomerFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the last y customer in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching y customer, or <code>null</code> if a matching y customer could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByCustomerFinder_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y customers before and after the current y customer in the ordered set where groupId = &#63;.
	*
	* @param yCustomerId the primary key of the current y customer
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer[] findByCustomerFinder_PrevAndNext(
		long yCustomerId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Removes all the y customers where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCustomerFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y customers where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching y customers
	* @throws SystemException if a system exception occurred
	*/
	public int countByCustomerFinder(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the y customer in the entity cache if it is enabled.
	*
	* @param yCustomer the y customer
	*/
	public void cacheResult(com.yyms.adp.aaa.model.YCustomer yCustomer);

	/**
	* Caches the y customers in the entity cache if it is enabled.
	*
	* @param yCustomers the y customers
	*/
	public void cacheResult(
		java.util.List<com.yyms.adp.aaa.model.YCustomer> yCustomers);

	/**
	* Creates a new y customer with the primary key. Does not add the y customer to the database.
	*
	* @param yCustomerId the primary key for the new y customer
	* @return the new y customer
	*/
	public com.yyms.adp.aaa.model.YCustomer create(long yCustomerId);

	/**
	* Removes the y customer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param yCustomerId the primary key of the y customer
	* @return the y customer that was removed
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer remove(long yCustomerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	public com.yyms.adp.aaa.model.YCustomer updateImpl(
		com.yyms.adp.aaa.model.YCustomer yCustomer)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the y customer with the primary key or throws a {@link com.yyms.adp.aaa.NoSuchYCustomerException} if it could not be found.
	*
	* @param yCustomerId the primary key of the y customer
	* @return the y customer
	* @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer findByPrimaryKey(long yCustomerId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.yyms.adp.aaa.NoSuchYCustomerException;

	/**
	* Returns the y customer with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param yCustomerId the primary key of the y customer
	* @return the y customer, or <code>null</code> if a y customer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.yyms.adp.aaa.model.YCustomer fetchByPrimaryKey(long yCustomerId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the y customers.
	*
	* @return the y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the y customers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.yyms.adp.aaa.model.impl.YCustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of y customers
	* @param end the upper bound of the range of y customers (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of y customers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.yyms.adp.aaa.model.YCustomer> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the y customers from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of y customers.
	*
	* @return the number of y customers
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}