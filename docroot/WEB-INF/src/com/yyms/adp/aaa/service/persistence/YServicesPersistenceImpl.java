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
import com.liferay.portal.kernel.dao.orm.SQLQuery;
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
import com.liferay.portal.security.permission.InlineSQLHelperUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.yyms.adp.aaa.NoSuchYServicesException;
import com.yyms.adp.aaa.model.YServices;
import com.yyms.adp.aaa.model.impl.YServicesImpl;
import com.yyms.adp.aaa.model.impl.YServicesModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the y services service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author USER
 * @see YServicesPersistence
 * @see YServicesUtil
 * @generated
 */
public class YServicesPersistenceImpl extends BasePersistenceImpl<YServices>
	implements YServicesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link YServicesUtil} to access the y services persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = YServicesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			YServicesModelImpl.UUID_COLUMN_BITMASK |
			YServicesModelImpl.SERVICESNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the y serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching y serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YServices> findByUuid(String uuid) throws SystemException {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<YServices> findByUuid(String uuid, int start, int end)
		throws SystemException {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<YServices> findByUuid(String uuid, int start, int end,
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

		List<YServices> list = (List<YServices>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (YServices yServices : list) {
				if (!Validator.equals(uuid, yServices.getUuid())) {
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

			query.append(_SQL_SELECT_YSERVICES_WHERE);

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
				query.append(YServicesModelImpl.ORDER_BY_JPQL);
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
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YServices>(list);
				}
				else {
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first y services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y services
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices findByUuid_First(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByUuid_First(uuid, orderByComparator);

		if (yServices != null) {
			return yServices;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYServicesException(msg.toString());
	}

	/**
	 * Returns the first y services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y services, or <code>null</code> if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices fetchByUuid_First(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		List<YServices> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public YServices findByUuid_Last(String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByUuid_Last(uuid, orderByComparator);

		if (yServices != null) {
			return yServices;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYServicesException(msg.toString());
	}

	/**
	 * Returns the last y services in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching y services, or <code>null</code> if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices fetchByUuid_Last(String uuid,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<YServices> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public YServices[] findByUuid_PrevAndNext(long yServicesId, String uuid,
		OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = findByPrimaryKey(yServicesId);

		Session session = null;

		try {
			session = openSession();

			YServices[] array = new YServicesImpl[3];

			array[0] = getByUuid_PrevAndNext(session, yServices, uuid,
					orderByComparator, true);

			array[1] = yServices;

			array[2] = getByUuid_PrevAndNext(session, yServices, uuid,
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

	protected YServices getByUuid_PrevAndNext(Session session,
		YServices yServices, String uuid, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_YSERVICES_WHERE);

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
			query.append(YServicesModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(yServices);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<YServices> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the y serviceses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid(String uuid) throws SystemException {
		for (YServices yServices : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(yServices);
		}
	}

	/**
	 * Returns the number of y serviceses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching y serviceses
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

			query.append(_SQL_COUNT_YSERVICES_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "yServices.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "yServices.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(yServices.uuid IS NULL OR yServices.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			YServicesModelImpl.UUID_COLUMN_BITMASK |
			YServicesModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the y services where uuid = &#63; and groupId = &#63; or throws a {@link com.yyms.adp.aaa.NoSuchYServicesException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching y services
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices findByUUID_G(String uuid, long groupId)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByUUID_G(uuid, groupId);

		if (yServices == null) {
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

			throw new NoSuchYServicesException(msg.toString());
		}

		return yServices;
	}

	/**
	 * Returns the y services where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching y services, or <code>null</code> if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices fetchByUUID_G(String uuid, long groupId)
		throws SystemException {
		return fetchByUUID_G(uuid, groupId, true);
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
	@Override
	public YServices fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) throws SystemException {
		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof YServices) {
			YServices yServices = (YServices)result;

			if (!Validator.equals(uuid, yServices.getUuid()) ||
					(groupId != yServices.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_YSERVICES_WHERE);

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

				List<YServices> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					YServices yServices = list.get(0);

					result = yServices;

					cacheResult(yServices);

					if ((yServices.getUuid() == null) ||
							!yServices.getUuid().equals(uuid) ||
							(yServices.getGroupId() != groupId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
							finderArgs, yServices);
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
			return (YServices)result;
		}
	}

	/**
	 * Removes the y services where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the y services that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices removeByUUID_G(String uuid, long groupId)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = findByUUID_G(uuid, groupId);

		return remove(yServices);
	}

	/**
	 * Returns the number of y serviceses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching y serviceses
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

			query.append(_SQL_COUNT_YSERVICES_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "yServices.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "yServices.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(yServices.uuid IS NULL OR yServices.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "yServices.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			YServicesModelImpl.UUID_COLUMN_BITMASK |
			YServicesModelImpl.COMPANYID_COLUMN_BITMASK |
			YServicesModelImpl.SERVICESNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the y serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching y serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YServices> findByUuid_C(String uuid, long companyId)
		throws SystemException {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<YServices> findByUuid_C(String uuid, long companyId, int start,
		int end) throws SystemException {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<YServices> findByUuid_C(String uuid, long companyId, int start,
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

		List<YServices> list = (List<YServices>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (YServices yServices : list) {
				if (!Validator.equals(uuid, yServices.getUuid()) ||
						(companyId != yServices.getCompanyId())) {
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

			query.append(_SQL_SELECT_YSERVICES_WHERE);

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
				query.append(YServicesModelImpl.ORDER_BY_JPQL);
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
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YServices>(list);
				}
				else {
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first y services in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y services
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices findByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByUuid_C_First(uuid, companyId,
				orderByComparator);

		if (yServices != null) {
			return yServices;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYServicesException(msg.toString());
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
	@Override
	public YServices fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		List<YServices> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public YServices findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByUuid_C_Last(uuid, companyId,
				orderByComparator);

		if (yServices != null) {
			return yServices;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYServicesException(msg.toString());
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
	@Override
	public YServices fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<YServices> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public YServices[] findByUuid_C_PrevAndNext(long yServicesId, String uuid,
		long companyId, OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = findByPrimaryKey(yServicesId);

		Session session = null;

		try {
			session = openSession();

			YServices[] array = new YServicesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, yServices, uuid,
					companyId, orderByComparator, true);

			array[1] = yServices;

			array[2] = getByUuid_C_PrevAndNext(session, yServices, uuid,
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

	protected YServices getByUuid_C_PrevAndNext(Session session,
		YServices yServices, String uuid, long companyId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_YSERVICES_WHERE);

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
			query.append(YServicesModelImpl.ORDER_BY_JPQL);
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
			Object[] values = orderByComparator.getOrderByConditionValues(yServices);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<YServices> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the y serviceses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId)
		throws SystemException {
		for (YServices yServices : findByUuid_C(uuid, companyId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(yServices);
		}
	}

	/**
	 * Returns the number of y serviceses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching y serviceses
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

			query.append(_SQL_COUNT_YSERVICES_WHERE);

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

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "yServices.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "yServices.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(yServices.uuid IS NULL OR yServices.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "yServices.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICESFINDER =
		new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByServicesFinder",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICESFINDER =
		new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, YServicesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByServicesFinder",
			new String[] { Long.class.getName() },
			YServicesModelImpl.GROUPID_COLUMN_BITMASK |
			YServicesModelImpl.SERVICESNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SERVICESFINDER = new FinderPath(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByServicesFinder",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the y serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching y serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YServices> findByServicesFinder(long groupId)
		throws SystemException {
		return findByServicesFinder(groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<YServices> findByServicesFinder(long groupId, int start, int end)
		throws SystemException {
		return findByServicesFinder(groupId, start, end, null);
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
	@Override
	public List<YServices> findByServicesFinder(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICESFINDER;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SERVICESFINDER;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<YServices> list = (List<YServices>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (YServices yServices : list) {
				if ((groupId != yServices.getGroupId())) {
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

			query.append(_SQL_SELECT_YSERVICES_WHERE);

			query.append(_FINDER_COLUMN_SERVICESFINDER_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(YServicesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YServices>(list);
				}
				else {
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first y services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y services
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices findByServicesFinder_First(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByServicesFinder_First(groupId,
				orderByComparator);

		if (yServices != null) {
			return yServices;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYServicesException(msg.toString());
	}

	/**
	 * Returns the first y services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching y services, or <code>null</code> if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices fetchByServicesFinder_First(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<YServices> list = findByServicesFinder(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public YServices findByServicesFinder_Last(long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByServicesFinder_Last(groupId,
				orderByComparator);

		if (yServices != null) {
			return yServices;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchYServicesException(msg.toString());
	}

	/**
	 * Returns the last y services in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching y services, or <code>null</code> if a matching y services could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices fetchByServicesFinder_Last(long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByServicesFinder(groupId);

		if (count == 0) {
			return null;
		}

		List<YServices> list = findByServicesFinder(groupId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public YServices[] findByServicesFinder_PrevAndNext(long yServicesId,
		long groupId, OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = findByPrimaryKey(yServicesId);

		Session session = null;

		try {
			session = openSession();

			YServices[] array = new YServicesImpl[3];

			array[0] = getByServicesFinder_PrevAndNext(session, yServices,
					groupId, orderByComparator, true);

			array[1] = yServices;

			array[2] = getByServicesFinder_PrevAndNext(session, yServices,
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

	protected YServices getByServicesFinder_PrevAndNext(Session session,
		YServices yServices, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_YSERVICES_WHERE);

		query.append(_FINDER_COLUMN_SERVICESFINDER_GROUPID_2);

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
			query.append(YServicesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(yServices);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<YServices> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Returns all the y serviceses that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching y serviceses that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YServices> filterFindByServicesFinder(long groupId)
		throws SystemException {
		return filterFindByServicesFinder(groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<YServices> filterFindByServicesFinder(long groupId, int start,
		int end) throws SystemException {
		return filterFindByServicesFinder(groupId, start, end, null);
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
	@Override
	public List<YServices> filterFindByServicesFinder(long groupId, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByServicesFinder(groupId, start, end, orderByComparator);
		}

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(3 +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_YSERVICES_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_YSERVICES_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_SERVICESFINDER_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_YSERVICES_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			if (getDB().isSupportsInlineDistinct()) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator, true);
			}
			else {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_TABLE,
					orderByComparator, true);
			}
		}
		else {
			if (getDB().isSupportsInlineDistinct()) {
				query.append(YServicesModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(YServicesModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				YServices.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			if (getDB().isSupportsInlineDistinct()) {
				q.addEntity(_FILTER_ENTITY_ALIAS, YServicesImpl.class);
			}
			else {
				q.addEntity(_FILTER_ENTITY_TABLE, YServicesImpl.class);
			}

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			return (List<YServices>)QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
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
	@Override
	public YServices[] filterFindByServicesFinder_PrevAndNext(
		long yServicesId, long groupId, OrderByComparator orderByComparator)
		throws NoSuchYServicesException, SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return findByServicesFinder_PrevAndNext(yServicesId, groupId,
				orderByComparator);
		}

		YServices yServices = findByPrimaryKey(yServicesId);

		Session session = null;

		try {
			session = openSession();

			YServices[] array = new YServicesImpl[3];

			array[0] = filterGetByServicesFinder_PrevAndNext(session,
					yServices, groupId, orderByComparator, true);

			array[1] = yServices;

			array[2] = filterGetByServicesFinder_PrevAndNext(session,
					yServices, groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected YServices filterGetByServicesFinder_PrevAndNext(Session session,
		YServices yServices, long groupId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		if (getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_YSERVICES_WHERE);
		}
		else {
			query.append(_FILTER_SQL_SELECT_YSERVICES_NO_INLINE_DISTINCT_WHERE_1);
		}

		query.append(_FINDER_COLUMN_SERVICESFINDER_GROUPID_2);

		if (!getDB().isSupportsInlineDistinct()) {
			query.append(_FILTER_SQL_SELECT_YSERVICES_NO_INLINE_DISTINCT_WHERE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
				if (getDB().isSupportsInlineDistinct()) {
					query.append(_ORDER_BY_ENTITY_ALIAS);
				}
				else {
					query.append(_ORDER_BY_ENTITY_TABLE);
				}

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
			if (getDB().isSupportsInlineDistinct()) {
				query.append(YServicesModelImpl.ORDER_BY_JPQL);
			}
			else {
				query.append(YServicesModelImpl.ORDER_BY_SQL);
			}
		}

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				YServices.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		SQLQuery q = session.createSQLQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		if (getDB().isSupportsInlineDistinct()) {
			q.addEntity(_FILTER_ENTITY_ALIAS, YServicesImpl.class);
		}
		else {
			q.addEntity(_FILTER_ENTITY_TABLE, YServicesImpl.class);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(yServices);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<YServices> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the y serviceses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByServicesFinder(long groupId) throws SystemException {
		for (YServices yServices : findByServicesFinder(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(yServices);
		}
	}

	/**
	 * Returns the number of y serviceses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching y serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByServicesFinder(long groupId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SERVICESFINDER;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_YSERVICES_WHERE);

			query.append(_FINDER_COLUMN_SERVICESFINDER_GROUPID_2);

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

	/**
	 * Returns the number of y serviceses that the user has permission to view where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching y serviceses that the user has permission to view
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int filterCountByServicesFinder(long groupId)
		throws SystemException {
		if (!InlineSQLHelperUtil.isEnabled(groupId)) {
			return countByServicesFinder(groupId);
		}

		StringBundler query = new StringBundler(2);

		query.append(_FILTER_SQL_COUNT_YSERVICES_WHERE);

		query.append(_FINDER_COLUMN_SERVICESFINDER_GROUPID_2);

		String sql = InlineSQLHelperUtil.replacePermissionCheck(query.toString(),
				YServices.class.getName(),
				_FILTER_ENTITY_TABLE_FILTER_PK_COLUMN, groupId);

		Session session = null;

		try {
			session = openSession();

			SQLQuery q = session.createSQLQuery(sql);

			q.addScalar(COUNT_COLUMN_NAME,
				com.liferay.portal.kernel.dao.orm.Type.LONG);

			QueryPos qPos = QueryPos.getInstance(q);

			qPos.add(groupId);

			Long count = (Long)q.uniqueResult();

			return count.intValue();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	private static final String _FINDER_COLUMN_SERVICESFINDER_GROUPID_2 = "yServices.groupId = ?";

	public YServicesPersistenceImpl() {
		setModelClass(YServices.class);
	}

	/**
	 * Caches the y services in the entity cache if it is enabled.
	 *
	 * @param yServices the y services
	 */
	@Override
	public void cacheResult(YServices yServices) {
		EntityCacheUtil.putResult(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesImpl.class, yServices.getPrimaryKey(), yServices);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { yServices.getUuid(), yServices.getGroupId() },
			yServices);

		yServices.resetOriginalValues();
	}

	/**
	 * Caches the y serviceses in the entity cache if it is enabled.
	 *
	 * @param yServiceses the y serviceses
	 */
	@Override
	public void cacheResult(List<YServices> yServiceses) {
		for (YServices yServices : yServiceses) {
			if (EntityCacheUtil.getResult(
						YServicesModelImpl.ENTITY_CACHE_ENABLED,
						YServicesImpl.class, yServices.getPrimaryKey()) == null) {
				cacheResult(yServices);
			}
			else {
				yServices.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all y serviceses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(YServicesImpl.class.getName());
		}

		EntityCacheUtil.clearCache(YServicesImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the y services.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(YServices yServices) {
		EntityCacheUtil.removeResult(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesImpl.class, yServices.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(yServices);
	}

	@Override
	public void clearCache(List<YServices> yServiceses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (YServices yServices : yServiceses) {
			EntityCacheUtil.removeResult(YServicesModelImpl.ENTITY_CACHE_ENABLED,
				YServicesImpl.class, yServices.getPrimaryKey());

			clearUniqueFindersCache(yServices);
		}
	}

	protected void cacheUniqueFindersCache(YServices yServices) {
		if (yServices.isNew()) {
			Object[] args = new Object[] {
					yServices.getUuid(), yServices.getGroupId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
				Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
				yServices);
		}
		else {
			YServicesModelImpl yServicesModelImpl = (YServicesModelImpl)yServices;

			if ((yServicesModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yServices.getUuid(), yServices.getGroupId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
					Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
					yServices);
			}
		}
	}

	protected void clearUniqueFindersCache(YServices yServices) {
		YServicesModelImpl yServicesModelImpl = (YServicesModelImpl)yServices;

		Object[] args = new Object[] { yServices.getUuid(), yServices.getGroupId() };

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);

		if ((yServicesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			args = new Object[] {
					yServicesModelImpl.getOriginalUuid(),
					yServicesModelImpl.getOriginalGroupId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new y services with the primary key. Does not add the y services to the database.
	 *
	 * @param yServicesId the primary key for the new y services
	 * @return the new y services
	 */
	@Override
	public YServices create(long yServicesId) {
		YServices yServices = new YServicesImpl();

		yServices.setNew(true);
		yServices.setPrimaryKey(yServicesId);

		String uuid = PortalUUIDUtil.generate();

		yServices.setUuid(uuid);

		return yServices;
	}

	/**
	 * Removes the y services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param yServicesId the primary key of the y services
	 * @return the y services that was removed
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices remove(long yServicesId)
		throws NoSuchYServicesException, SystemException {
		return remove((Serializable)yServicesId);
	}

	/**
	 * Removes the y services with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the y services
	 * @return the y services that was removed
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices remove(Serializable primaryKey)
		throws NoSuchYServicesException, SystemException {
		Session session = null;

		try {
			session = openSession();

			YServices yServices = (YServices)session.get(YServicesImpl.class,
					primaryKey);

			if (yServices == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchYServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(yServices);
		}
		catch (NoSuchYServicesException nsee) {
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
	protected YServices removeImpl(YServices yServices)
		throws SystemException {
		yServices = toUnwrappedModel(yServices);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(yServices)) {
				yServices = (YServices)session.get(YServicesImpl.class,
						yServices.getPrimaryKeyObj());
			}

			if (yServices != null) {
				session.delete(yServices);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (yServices != null) {
			clearCache(yServices);
		}

		return yServices;
	}

	@Override
	public YServices updateImpl(com.yyms.adp.aaa.model.YServices yServices)
		throws SystemException {
		yServices = toUnwrappedModel(yServices);

		boolean isNew = yServices.isNew();

		YServicesModelImpl yServicesModelImpl = (YServicesModelImpl)yServices;

		if (Validator.isNull(yServices.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			yServices.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (yServices.isNew()) {
				session.save(yServices);

				yServices.setNew(false);
			}
			else {
				session.merge(yServices);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !YServicesModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((yServicesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yServicesModelImpl.getOriginalUuid()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { yServicesModelImpl.getUuid() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((yServicesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yServicesModelImpl.getOriginalUuid(),
						yServicesModelImpl.getOriginalCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						yServicesModelImpl.getUuid(),
						yServicesModelImpl.getCompanyId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((yServicesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICESFINDER.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						yServicesModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICESFINDER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICESFINDER,
					args);

				args = new Object[] { yServicesModelImpl.getGroupId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_SERVICESFINDER,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SERVICESFINDER,
					args);
			}
		}

		EntityCacheUtil.putResult(YServicesModelImpl.ENTITY_CACHE_ENABLED,
			YServicesImpl.class, yServices.getPrimaryKey(), yServices);

		clearUniqueFindersCache(yServices);
		cacheUniqueFindersCache(yServices);

		return yServices;
	}

	protected YServices toUnwrappedModel(YServices yServices) {
		if (yServices instanceof YServicesImpl) {
			return yServices;
		}

		YServicesImpl yServicesImpl = new YServicesImpl();

		yServicesImpl.setNew(yServices.isNew());
		yServicesImpl.setPrimaryKey(yServices.getPrimaryKey());

		yServicesImpl.setUuid(yServices.getUuid());
		yServicesImpl.setYServicesId(yServices.getYServicesId());
		yServicesImpl.setGroupId(yServices.getGroupId());
		yServicesImpl.setCompanyId(yServices.getCompanyId());
		yServicesImpl.setUserId(yServices.getUserId());
		yServicesImpl.setUserName(yServices.getUserName());
		yServicesImpl.setCreateDate(yServices.getCreateDate());
		yServicesImpl.setModifiedDate(yServices.getModifiedDate());
		yServicesImpl.setServicesName(yServices.getServicesName());
		yServicesImpl.setServicesPrice(yServices.getServicesPrice());
		yServicesImpl.setServicesDes(yServices.getServicesDes());

		return yServicesImpl;
	}

	/**
	 * Returns the y services with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the y services
	 * @return the y services
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices findByPrimaryKey(Serializable primaryKey)
		throws NoSuchYServicesException, SystemException {
		YServices yServices = fetchByPrimaryKey(primaryKey);

		if (yServices == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchYServicesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return yServices;
	}

	/**
	 * Returns the y services with the primary key or throws a {@link com.yyms.adp.aaa.NoSuchYServicesException} if it could not be found.
	 *
	 * @param yServicesId the primary key of the y services
	 * @return the y services
	 * @throws com.yyms.adp.aaa.NoSuchYServicesException if a y services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices findByPrimaryKey(long yServicesId)
		throws NoSuchYServicesException, SystemException {
		return findByPrimaryKey((Serializable)yServicesId);
	}

	/**
	 * Returns the y services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the y services
	 * @return the y services, or <code>null</code> if a y services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		YServices yServices = (YServices)EntityCacheUtil.getResult(YServicesModelImpl.ENTITY_CACHE_ENABLED,
				YServicesImpl.class, primaryKey);

		if (yServices == _nullYServices) {
			return null;
		}

		if (yServices == null) {
			Session session = null;

			try {
				session = openSession();

				yServices = (YServices)session.get(YServicesImpl.class,
						primaryKey);

				if (yServices != null) {
					cacheResult(yServices);
				}
				else {
					EntityCacheUtil.putResult(YServicesModelImpl.ENTITY_CACHE_ENABLED,
						YServicesImpl.class, primaryKey, _nullYServices);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(YServicesModelImpl.ENTITY_CACHE_ENABLED,
					YServicesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return yServices;
	}

	/**
	 * Returns the y services with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param yServicesId the primary key of the y services
	 * @return the y services, or <code>null</code> if a y services with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public YServices fetchByPrimaryKey(long yServicesId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)yServicesId);
	}

	/**
	 * Returns all the y serviceses.
	 *
	 * @return the y serviceses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<YServices> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<YServices> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<YServices> findAll(int start, int end,
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

		List<YServices> list = (List<YServices>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_YSERVICES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_YSERVICES;

				if (pagination) {
					sql = sql.concat(YServicesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<YServices>(list);
				}
				else {
					list = (List<YServices>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the y serviceses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (YServices yServices : findAll()) {
			remove(yServices);
		}
	}

	/**
	 * Returns the number of y serviceses.
	 *
	 * @return the number of y serviceses
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

				Query q = session.createQuery(_SQL_COUNT_YSERVICES);

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
	 * Initializes the y services persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.yyms.adp.aaa.model.YServices")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<YServices>> listenersList = new ArrayList<ModelListener<YServices>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<YServices>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(YServicesImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_YSERVICES = "SELECT yServices FROM YServices yServices";
	private static final String _SQL_SELECT_YSERVICES_WHERE = "SELECT yServices FROM YServices yServices WHERE ";
	private static final String _SQL_COUNT_YSERVICES = "SELECT COUNT(yServices) FROM YServices yServices";
	private static final String _SQL_COUNT_YSERVICES_WHERE = "SELECT COUNT(yServices) FROM YServices yServices WHERE ";
	private static final String _FILTER_ENTITY_TABLE_FILTER_PK_COLUMN = "yServices.yServicesId";
	private static final String _FILTER_SQL_SELECT_YSERVICES_WHERE = "SELECT DISTINCT {yServices.*} FROM CS_YServices yServices WHERE ";
	private static final String _FILTER_SQL_SELECT_YSERVICES_NO_INLINE_DISTINCT_WHERE_1 =
		"SELECT {CS_YServices.*} FROM (SELECT DISTINCT yServices.yServicesId FROM CS_YServices yServices WHERE ";
	private static final String _FILTER_SQL_SELECT_YSERVICES_NO_INLINE_DISTINCT_WHERE_2 =
		") TEMP_TABLE INNER JOIN CS_YServices ON TEMP_TABLE.yServicesId = CS_YServices.yServicesId";
	private static final String _FILTER_SQL_COUNT_YSERVICES_WHERE = "SELECT COUNT(DISTINCT yServices.yServicesId) AS COUNT_VALUE FROM CS_YServices yServices WHERE ";
	private static final String _FILTER_ENTITY_ALIAS = "yServices";
	private static final String _FILTER_ENTITY_TABLE = "CS_YServices";
	private static final String _ORDER_BY_ENTITY_ALIAS = "yServices.";
	private static final String _ORDER_BY_ENTITY_TABLE = "CS_YServices.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No YServices exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No YServices exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(YServicesPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid"
			});
	private static YServices _nullYServices = new YServicesImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<YServices> toCacheModel() {
				return _nullYServicesCacheModel;
			}
		};

	private static CacheModel<YServices> _nullYServicesCacheModel = new CacheModel<YServices>() {
			@Override
			public YServices toEntityModel() {
				return _nullYServices;
			}
		};
}