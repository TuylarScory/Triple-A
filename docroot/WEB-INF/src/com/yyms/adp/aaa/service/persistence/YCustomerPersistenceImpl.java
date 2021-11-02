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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.yyms.adp.aaa.NoSuchYCustomerException;
import com.yyms.adp.aaa.model.YCustomer;
import com.yyms.adp.aaa.model.impl.YCustomerImpl;
import com.yyms.adp.aaa.model.impl.YCustomerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the y customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see YCustomerPersistence
 * @see YCustomerUtil
 * @generated
 */
public class YCustomerPersistenceImpl extends BasePersistenceImpl<YCustomer>
	implements YCustomerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link YCustomerUtil} to access the y customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = YCustomerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			YCustomerModelImpl.UUID_COLUMN_BITMASK |
			YCustomerModelImpl.CUSTOMERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the y customers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YCustomer> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<YCustomer> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<YCustomer> findByUuid(String uuid, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<YCustomer> list = (List<YCustomer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (YCustomer yCustomer : list) {
				if (!Validator.equals(uuid, yCustomer.getUuid())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_YCUSTOMER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(YCustomerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YCustomer>(list);
				}
				else {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first y customer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y customer
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByUuid_First(uuid, orderByComparator);

		if (yCustomer != null) {
			return yCustomer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYCustomerException(msg.toString());
	}

	/**
	 * Returns the first y customer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<YCustomer> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last y customer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching y customer
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByUuid_Last(uuid, orderByComparator);

		if (yCustomer != null) {
			return yCustomer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYCustomerException(msg.toString());
	}

	/**
	 * Returns the last y customer in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<YCustomer> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public YCustomer[] findByUuid_PrevAndNext(long yCustomerId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = findByPrimaryKey(yCustomerId);

		Session session = null;

		try {
			session = openSession();

			YCustomer[] array = new YCustomerImpl[3];

			array[0] = getByUuid_PrevAndNext(session, yCustomer, uuid,
					orderByComparator, true);

			array[1] = yCustomer;

			array[2] = getByUuid_PrevAndNext(session, yCustomer, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected YCustomer getByUuid_PrevAndNext(Session session,
		YCustomer yCustomer, String uuid, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_YCUSTOMER_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(YCustomerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(yCustomer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<YCustomer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the y customers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (YCustomer yCustomer : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(yCustomer);
		}
	}

	/**
	 * Returns the number of y customers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid(String uuid) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_YCUSTOMER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "yCustomer.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "yCustomer.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(yCustomer.uuid IS NULL OR yCustomer.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			YCustomerModelImpl.UUID_COLUMN_BITMASK |
			YCustomerModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the y customer where uuid = &#63; and groupId = &#63; or throws a {@link com.yyms.adp.aaa.NoSuchYCustomerException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching y customer
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer findByUUID_G(String uuid, long groupId)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByUUID_G(uuid, groupId);

		if (yCustomer == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchYCustomerException(msg.toString());
		}

		return yCustomer;
	}

	/**
	 * Returns the y customer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the y customer where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof YCustomer) {
			YCustomer yCustomer = (YCustomer)result;

			if (!Validator.equals(uuid, yCustomer.getUuid()) ||
					(groupId != yCustomer.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_YCUSTOMER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<YCustomer> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					YCustomer yCustomer = list.get(0);

					result = yCustomer;

					cacheResult(yCustomer);

					if ((yCustomer.getUuid() == null) ||
							!yCustomer.getUuid().equals(uuid) ||
							(yCustomer.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, yCustomer);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (YCustomer)result;
		}
	}

	/**
	 * Removes the y customer where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the y customer that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer removeByUUID_G(String uuid, long groupId)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = findByUUID_G(uuid, groupId);

		return remove(yCustomer);
	}

	/**
	 * Returns the number of y customers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_YCUSTOMER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "yCustomer.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "yCustomer.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(yCustomer.uuid IS NULL OR yCustomer.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "yCustomer.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			YCustomerModelImpl.UUID_COLUMN_BITMASK |
			YCustomerModelImpl.COMPANYID_COLUMN_BITMASK |
			YCustomerModelImpl.CUSTOMERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the y customers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YCustomer> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<YCustomer> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<YCustomer> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<YCustomer> list = (List<YCustomer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (YCustomer yCustomer : list) {
				if (!Validator.equals(uuid, yCustomer.getUuid()) ||
						(companyId != yCustomer.getCompanyId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_YCUSTOMER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(YCustomerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YCustomer>(list);
				}
				else {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

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
	@Override
	public YCustomer findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (yCustomer != null) {
			return yCustomer;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYCustomerException(msg.toString());
	}

	/**
	 * Returns the first y customer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<YCustomer> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public YCustomer findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (yCustomer != null) {
			return yCustomer;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYCustomerException(msg.toString());
	}

	/**
	 * Returns the last y customer in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<YCustomer> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public YCustomer[] findByUuid_C_PrevAndNext(long yCustomerId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = findByPrimaryKey(yCustomerId);

		Session session = null;

		try {
			session = openSession();

			YCustomer[] array = new YCustomerImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, yCustomer, uuid,
					companyId, orderByComparator, true);

			array[1] = yCustomer;

			array[2] = getByUuid_C_PrevAndNext(session, yCustomer, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected YCustomer getByUuid_C_PrevAndNext(Session session,
		YCustomer yCustomer, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_YCUSTOMER_WHERE);

		boolean bindUuid = false;

		if (uuid == null) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_1);
		}
		else if (uuid.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(YCustomerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(yCustomer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<YCustomer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the y customers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (YCustomer yCustomer : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(yCustomer);
		}
	}

	/**
	 * Returns the number of y customers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_YCUSTOMER_WHERE);

			boolean bindUuid = false;

			if (uuid == null) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_1);
			}
			else if (uuid.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "yCustomer.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "yCustomer.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(yCustomer.uuid IS NULL OR yCustomer.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "yCustomer.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMERFINDER =
		new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCustomerFinder",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERFINDER =
		new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, YCustomerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCustomerFinder",
			new String[] { Long.class.getName() },
			YCustomerModelImpl.GROUPID_COLUMN_BITMASK |
			YCustomerModelImpl.CUSTOMERNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CUSTOMERFINDER = new FinderPath(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCustomerFinder",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the y customers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YCustomer> findByCustomerFinder(long groupId)
		throws SystemException {
		return findByCustomerFinder(groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<YCustomer> findByCustomerFinder(long groupId, int start, int end)
		throws SystemException {
		return findByCustomerFinder(groupId, start, end, null);
	}

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
	@Override
	public List<YCustomer> findByCustomerFinder(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERFINDER;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CUSTOMERFINDER;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<YCustomer> list = (List<YCustomer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (YCustomer yCustomer : list) {
				if ((groupId != yCustomer.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_YCUSTOMER_WHERE);

			query.append(_FINDER_COLUMN_CUSTOMERFINDER_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(YCustomerModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YCustomer>(list);
				}
				else {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first y customer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y customer
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer findByCustomerFinder_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByCustomerFinder_First(groupId,
				orderByComparator);

		if (yCustomer != null) {
			return yCustomer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYCustomerException(msg.toString());
	}

	/**
	 * Returns the first y customer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByCustomerFinder_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<YCustomer> list = findByCustomerFinder(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last y customer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching y customer
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer findByCustomerFinder_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByCustomerFinder_Last(groupId,
				orderByComparator);

		if (yCustomer != null) {
			return yCustomer;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYCustomerException(msg.toString());
	}

	/**
	 * Returns the last y customer in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching y customer, or <code>null</code> if a matching y customer could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByCustomerFinder_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCustomerFinder(groupId);

		if (count == 0) {
			return null;
		}

		List<YCustomer> list = findByCustomerFinder(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public YCustomer[] findByCustomerFinder_PrevAndNext(long yCustomerId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = findByPrimaryKey(yCustomerId);

		Session session = null;

		try {
			session = openSession();

			YCustomer[] array = new YCustomerImpl[3];

			array[0] = getByCustomerFinder_PrevAndNext(session, yCustomer,
					groupId, orderByComparator, true);

			array[1] = yCustomer;

			array[2] = getByCustomerFinder_PrevAndNext(session, yCustomer,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected YCustomer getByCustomerFinder_PrevAndNext(Session session,
		YCustomer yCustomer, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_YCUSTOMER_WHERE);

		query.append(_FINDER_COLUMN_CUSTOMERFINDER_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(YCustomerModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(yCustomer);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<YCustomer> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the y customers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCustomerFinder(long groupId) throws SystemException {
		for (YCustomer yCustomer : findByCustomerFinder(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(yCustomer);
		}
	}

	/**
	 * Returns the number of y customers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCustomerFinder(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CUSTOMERFINDER;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_YCUSTOMER_WHERE);

			query.append(_FINDER_COLUMN_CUSTOMERFINDER_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CUSTOMERFINDER_GROUPID_2 = "yCustomer.groupId = ?";

	public YCustomerPersistenceImpl() {
		setModelClass(YCustomer.class);
	}

	/**
	 * Caches the y customer in the entity cache if it is enabled.
	 *
	 * @param yCustomer the y customer
	 */
	@Override
	public void cacheResult(YCustomer yCustomer) {
		EntityCacheUtil.putResult(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerImpl.class, yCustomer.getPrimaryKey(), yCustomer);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { yCustomer.getUuid(), yCustomer.getGroupId() },
			yCustomer);

		yCustomer.resetOriginalValues();
	}

	/**
	 * Caches the y customers in the entity cache if it is enabled.
	 *
	 * @param yCustomers the y customers
	 */
	@Override
	public void cacheResult(List<YCustomer> yCustomers) {
		for (YCustomer yCustomer : yCustomers) {
			if (EntityCacheUtil.getResult(
						YCustomerModelImpl.ENTITY_CACHE_ENABLED,
						YCustomerImpl.class, yCustomer.getPrimaryKey()) == null) {
				cacheResult(yCustomer);
			}
			else {
				yCustomer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all y customers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(YCustomerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(YCustomerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the y customer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(YCustomer yCustomer) {
		EntityCacheUtil.removeResult(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerImpl.class, yCustomer.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(yCustomer);
	}

	@Override
	public void clearCache(List<YCustomer> yCustomers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (YCustomer yCustomer : yCustomers) {
			EntityCacheUtil.removeResult(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
				YCustomerImpl.class, yCustomer.getPrimaryKey());

			clearUniqueFindersCache(yCustomer);
		}
	}

	protected void cacheUniqueFindersCache(YCustomer yCustomer) {
		if (yCustomer.isNew()) {
			Object[] args = new Object[] {
					yCustomer.getUuid(), yCustomer.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				yCustomer);
		}
		else {
			YCustomerModelImpl yCustomerModelImpl = (YCustomerModelImpl)yCustomer;

			if ((yCustomerModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yCustomer.getUuid(), yCustomer.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					yCustomer);
			}
		}
	}

	protected void clearUniqueFindersCache(YCustomer yCustomer) {
		YCustomerModelImpl yCustomerModelImpl = (YCustomerModelImpl)yCustomer;

		Object[] args = new Object[] { yCustomer.getUuid(), yCustomer.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((yCustomerModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					yCustomerModelImpl.getOriginalUuid(),
					yCustomerModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new y customer with the primary key. Does not add the y customer to the database.
	 *
	 * @param yCustomerId the primary key for the new y customer
	 * @return the new y customer
	 */
	@Override
	public YCustomer create(long yCustomerId) {
		YCustomer yCustomer = new YCustomerImpl();

		yCustomer.setNew(true);
		yCustomer.setPrimaryKey(yCustomerId);

		String uuid = PortalUUIDUtil.generate();

		yCustomer.setUuid(uuid);

		return yCustomer;
	}

	/**
	 * Removes the y customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param yCustomerId the primary key of the y customer
	 * @return the y customer that was removed
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer remove(long yCustomerId)
		throws NoSuchYCustomerException, SystemException {
		return remove((Serializable)yCustomerId);
	}

	/**
	 * Removes the y customer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the y customer
	 * @return the y customer that was removed
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer remove(Serializable primaryKey)
		throws NoSuchYCustomerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			YCustomer yCustomer = (YCustomer)session.get(YCustomerImpl.class,
					primaryKey);

			if (yCustomer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchYCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(yCustomer);
		}
		catch (NoSuchYCustomerException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected YCustomer removeImpl(YCustomer yCustomer)
		throws SystemException {
		yCustomer = toUnwrappedModel(yCustomer);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(yCustomer)) {
				yCustomer = (YCustomer)session.get(YCustomerImpl.class,
						yCustomer.getPrimaryKeyObj());
			}

			if (yCustomer != null) {
				session.delete(yCustomer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (yCustomer != null) {
			clearCache(yCustomer);
		}

		return yCustomer;
	}

	@Override
	public YCustomer updateImpl(com.yyms.adp.aaa.model.YCustomer yCustomer)
		throws SystemException {
		yCustomer = toUnwrappedModel(yCustomer);

		boolean isNew = yCustomer.isNew();

		YCustomerModelImpl yCustomerModelImpl = (YCustomerModelImpl)yCustomer;

		if (Validator.isNull(yCustomer.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			yCustomer.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (yCustomer.isNew()) {
				session.save(yCustomer);

				yCustomer.setNew(false);
			}
			else {
				session.merge(yCustomer);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !YCustomerModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((yCustomerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yCustomerModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { yCustomerModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((yCustomerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yCustomerModelImpl.getOriginalUuid(),
						yCustomerModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						yCustomerModelImpl.getUuid(),
						yCustomerModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((yCustomerModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERFINDER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yCustomerModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERFINDER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERFINDER,
					args);

				args = new Object[] { yCustomerModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CUSTOMERFINDER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CUSTOMERFINDER,
					args);
			}
		}

		EntityCacheUtil.putResult(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
			YCustomerImpl.class, yCustomer.getPrimaryKey(), yCustomer);

		clearUniqueFindersCache(yCustomer);
		cacheUniqueFindersCache(yCustomer);

		return yCustomer;
	}

	protected YCustomer toUnwrappedModel(YCustomer yCustomer) {
		if (yCustomer instanceof YCustomerImpl) {
			return yCustomer;
		}

		YCustomerImpl yCustomerImpl = new YCustomerImpl();

		yCustomerImpl.setNew(yCustomer.isNew());
		yCustomerImpl.setPrimaryKey(yCustomer.getPrimaryKey());

		yCustomerImpl.setUuid(yCustomer.getUuid());
		yCustomerImpl.setYCustomerId(yCustomer.getYCustomerId());
		yCustomerImpl.setGroupId(yCustomer.getGroupId());
		yCustomerImpl.setCompanyId(yCustomer.getCompanyId());
		yCustomerImpl.setUserId(yCustomer.getUserId());
		yCustomerImpl.setUserName(yCustomer.getUserName());
		yCustomerImpl.setCreateDate(yCustomer.getCreateDate());
		yCustomerImpl.setModifiedDate(yCustomer.getModifiedDate());
		yCustomerImpl.setCustomerName(yCustomer.getCustomerName());
		yCustomerImpl.setCustomerEmail(yCustomer.getCustomerEmail());
		yCustomerImpl.setCustomerAddress(yCustomer.getCustomerAddress());
		yCustomerImpl.setCustomerNRC(yCustomer.getCustomerNRC());
		yCustomerImpl.setCustomerContact(yCustomer.getCustomerContact());
		yCustomerImpl.setPayment(yCustomer.getPayment());
		yCustomerImpl.setYServicesId(yCustomer.getYServicesId());

		return yCustomerImpl;
	}

	/**
	 * Returns the y customer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the y customer
	 * @return the y customer
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchYCustomerException, SystemException {
		YCustomer yCustomer = fetchByPrimaryKey(primaryKey);

		if (yCustomer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchYCustomerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return yCustomer;
	}

	/**
	 * Returns the y customer with the primary key or throws a {@link com.yyms.adp.aaa.NoSuchYCustomerException} if it could not be found.
	 *
	 * @param yCustomerId the primary key of the y customer
	 * @return the y customer
	 * @throws com.yyms.adp.aaa.NoSuchYCustomerException if a y customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer findByPrimaryKey(long yCustomerId)
		throws NoSuchYCustomerException, SystemException {
		return findByPrimaryKey((Serializable)yCustomerId);
	}

	/**
	 * Returns the y customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the y customer
	 * @return the y customer, or <code>null</code> if a y customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		YCustomer yCustomer = (YCustomer)EntityCacheUtil.getResult(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
				YCustomerImpl.class, primaryKey);

		if (yCustomer == _nullYCustomer) {
			return null;
		}

		if (yCustomer == null) {
			Session session = null;

			try {
				session = openSession();

				yCustomer = (YCustomer)session.get(YCustomerImpl.class,
						primaryKey);

				if (yCustomer != null) {
					cacheResult(yCustomer);
				}
				else {
					EntityCacheUtil.putResult(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
						YCustomerImpl.class, primaryKey, _nullYCustomer);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(YCustomerModelImpl.ENTITY_CACHE_ENABLED,
					YCustomerImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return yCustomer;
	}

	/**
	 * Returns the y customer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param yCustomerId the primary key of the y customer
	 * @return the y customer, or <code>null</code> if a y customer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YCustomer fetchByPrimaryKey(long yCustomerId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)yCustomerId);
	}

	/**
	 * Returns all the y customers.
	 *
	 * @return the y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YCustomer> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<YCustomer> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

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
	@Override
	public List<YCustomer> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<YCustomer> list = (List<YCustomer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_YCUSTOMER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_YCUSTOMER;

				if (pagination) {
					sql = sql.concat(YCustomerModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YCustomer>(list);
				}
				else {
					list = (List<YCustomer>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the y customers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (YCustomer yCustomer : findAll()) {
			remove(yCustomer);
		}
	}

	/**
	 * Returns the number of y customers.
	 *
	 * @return the number of y customers
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_YCUSTOMER);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the y customer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.yyms.adp.aaa.model.YCustomer")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<YCustomer>> listenersList = new ArrayList<ModelListener<YCustomer>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<YCustomer>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(YCustomerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_YCUSTOMER = "SELECT yCustomer FROM YCustomer yCustomer";
	private static final String _SQL_SELECT_YCUSTOMER_WHERE = "SELECT yCustomer FROM YCustomer yCustomer WHERE ";
	private static final String _SQL_COUNT_YCUSTOMER = "SELECT COUNT(yCustomer) FROM YCustomer yCustomer";
	private static final String _SQL_COUNT_YCUSTOMER_WHERE = "SELECT COUNT(yCustomer) FROM YCustomer yCustomer WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "yCustomer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No YCustomer exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No YCustomer exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(YCustomerPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static YCustomer _nullYCustomer = new YCustomerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<YCustomer> toCacheModel() {
				return _nullYCustomerCacheModel;
			}
		};

	private static CacheModel<YCustomer> _nullYCustomerCacheModel = new CacheModel<YCustomer>() {
			@Override
			public YCustomer toEntityModel() {
				return _nullYCustomer;
			}
		};
}