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

package com.yyms.adp.aaa.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.yyms.adp.aaa.service.ClpSerializer;
import com.yyms.adp.aaa.service.YCustomerLocalServiceUtil;
import com.yyms.adp.aaa.service.YCustomerServiceUtil;
import com.yyms.adp.aaa.service.YServicesLocalServiceUtil;
import com.yyms.adp.aaa.service.YServicesServiceUtil;

/**
 * @author USER
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			YCustomerLocalServiceUtil.clearService();

			YCustomerServiceUtil.clearService();
			YServicesLocalServiceUtil.clearService();

			YServicesServiceUtil.clearService();
		}
	}
}