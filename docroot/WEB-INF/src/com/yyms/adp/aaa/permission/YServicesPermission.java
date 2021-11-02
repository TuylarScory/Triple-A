package com.yyms.adp.aaa.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;
import com.yyms.adp.aaa.model.YServices;
import com.yyms.adp.aaa.service.YServicesLocalServiceUtil;

public class YServicesPermission {
	
	public static void check(PermissionChecker permissionChecker, long groupId, String actionId) throws PortalException, SystemException {
		
		if (!contains(permissionChecker, groupId, actionId))
			throw new PrincipalException();
		
	}
	
	public static boolean contains(PermissionChecker permissionChecker, long yServicesId, String actionId) throws PortalException, SystemException {
		
		YServices services = YServicesLocalServiceUtil.getYServices(yServicesId);
		
		return permissionChecker.hasPermission(services.getGroupId(), YServices.class.getName(), services.getYServicesId(), actionId);
		
	}

}
