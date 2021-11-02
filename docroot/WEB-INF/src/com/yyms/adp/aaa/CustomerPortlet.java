package com.yyms.adp.aaa;

import java.util.Calendar;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.yyms.adp.aaa.model.YCustomer;
import com.yyms.adp.aaa.service.YCustomerLocalServiceUtil;

/**
 * Portlet implementation class CustomerPortlet
 */
public class CustomerPortlet extends MVCPortlet {
 
	//Add Customer
	public void addYCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(YCustomer.class.getName(), actionRequest);
		
		String customerName = ParamUtil.getString(actionRequest, "customerName");
		String customerEmail = ParamUtil.getString(actionRequest, "customerEmail");
		String customerAddress = ParamUtil.getString(actionRequest, "customerAddress");
		String customerNRC = ParamUtil.getString(actionRequest, "customerNRC");
		String customerContact = ParamUtil.getString(actionRequest, "customerContact");	
		String payment = ParamUtil.getString(actionRequest, "payment");
		Long yServicesId = ParamUtil.getLong(actionRequest, "yServicesId");
		
		Long yCustomerId = ParamUtil.getLong(actionRequest, "yCustomerId");
		
		if (yCustomerId > 0) {
			try {
				YCustomerLocalServiceUtil.updateYCustomer(serviceContext.getUserId(), yCustomerId, customerName, customerEmail, customerAddress, customerNRC, customerContact, payment, yServicesId, serviceContext);
				System.out.println(yCustomerId + " " + " is updated successfully!");
			} catch (Exception e) {
				e.printStackTrace();
				actionResponse.setRenderParameter("mvcPath", "/html/customer/customer.jsp");
			}
		}
		
		else {
			try {
				YCustomerLocalServiceUtil.addYCustomer(serviceContext.getUserId(), customerName, customerEmail, customerAddress, customerNRC, customerContact, payment, yServicesId, serviceContext);
				System.out.println("Customer is added to the database!");
			} catch (Exception e) {
				e.printStackTrace();
				actionResponse.setRenderParameter("mvcPath", "/html/customer/customer.jsp");
			}
		}
	}
	
	//Delete Customer
	public void deleteYCustomer(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		
		long yCustomerId = ParamUtil.getLong(actionRequest, "yCustomerId");
		
		try {
			YCustomerLocalServiceUtil.deleteYCustomer(yCustomerId);
			System.out.println(yCustomerId + " " + " is deleted successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}