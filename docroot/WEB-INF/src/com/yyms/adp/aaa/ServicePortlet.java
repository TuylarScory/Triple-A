package com.yyms.adp.aaa;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.yyms.adp.aaa.model.YServices;
import com.yyms.adp.aaa.service.YServicesLocalServiceUtil;

/**
 * Portlet implementation class ServicePortlet
 */
public class ServicePortlet extends MVCPortlet {
 
	//Add Services
	public void addYServices(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(YServices.class.getName(), actionRequest);
		
		String servicesName = ParamUtil.getString(actionRequest, "servicesName");
		String servicesPrice = ParamUtil.getString(actionRequest, "servicesPrice");
		String servicesDes = ParamUtil.getString(actionRequest, "servicesDes");
		
		//yServicesId which want to Edit (from Services.jsp)
		Long yServicesId = ParamUtil.getLong(actionRequest, "yServicesId");
		
		if (yServicesId > 0) {
			try {
				YServicesLocalServiceUtil.updateYServices(serviceContext.getUserId(), yServicesId, servicesName, servicesPrice, servicesDes, serviceContext);
				System.out.println(yServicesId + " " + " is updated successfully!");
			} catch (Exception e) {
				e.printStackTrace();
				actionResponse.setRenderParameter("mvcPath", "/html/service/services.jsp");
			}
		}
		
		else {
			try {
				YServicesLocalServiceUtil.addYServices(serviceContext.getUserId(), servicesName, servicesPrice, servicesDes, serviceContext);
				System.out.println("Services is added successfully!");
			} catch (Exception e) {
				e.printStackTrace();
				actionResponse.setRenderParameter("mvcPath", "/html/service/services.jsp");
			}
		}
		
	}
	
	//Delete Services
	public void deleteYServices(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		
		long yServicesId = ParamUtil.getLong(actionRequest, "yServicesId");
		
		try {
			YServicesLocalServiceUtil.deleteYServices(yServicesId);
			System.out.println(yServicesId + " " + " is deleted!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
