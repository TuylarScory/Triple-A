/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.yyms.adp.aaa;

import com.liferay.portal.kernel.exception.PortalException;

/**
 * @author USER
 */
public class ServicesPriceException extends PortalException {

	public ServicesPriceException() {
		super();
	}

	public ServicesPriceException(String msg) {
		super(msg);
	}

	public ServicesPriceException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ServicesPriceException(Throwable cause) {
		super(cause);
	}

}