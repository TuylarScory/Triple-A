<%@ include file="/html/init.jsp" %>

<% 
	//Retrieve Current Row
	ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	//Get Current Row to Services Object
	YCustomer customer = (YCustomer)row.getObject();
%>

<%--- Delete Action URL ---%>
<liferay-portlet:actionURL name="deleteYCustomer" var="deleteYCustomerActionURL">
	<liferay-portlet:param name="yCustomerId" value="<%=String.valueOf(customer.getYCustomerId())%>"></liferay-portlet:param>
</liferay-portlet:actionURL>

<%--- Edit Render URL ---%>
<liferay-portlet:renderURL var="editYCustomerRenderURL">
	<liferay-portlet:param name="yCustomerId" value="<%=String.valueOf(customer.getYCustomerId())%>"></liferay-portlet:param>
	<liferay-portlet:param name="mvcPath" value="/html/customer/customer.jsp"></liferay-portlet:param>
</liferay-portlet:renderURL>

<%--- Permission Security URL ---%>
<liferay-security:permissionsURL modelResource="<%=YCustomer.class.getName()%>" modelResourceDescription="<%=customer.getCustomerName()%>" 
	resourcePrimKey="<%=String.valueOf(customer.getYCustomerId())%>" var="yCustomerSecurityURL">
</liferay-security:permissionsURL>

<%--- Liferay Action Icon Menu ---%>
<liferay-ui:icon-menu>
	<%--- Delete Action Button ---%>
	<liferay-ui:icon-delete url="<%=deleteYCustomerActionURL.toString()%>"></liferay-ui:icon-delete>
	
	<%--- Edit Action Button ---%>
	<liferay-ui:icon image="edit" message="Edit" url="<%=editYCustomerRenderURL.toString()%>"></liferay-ui:icon>
	
	<%--- Permission Action Button ---%>
	<liferay-ui:icon image="permissions" url="<%=yCustomerSecurityURL%>"></liferay-ui:icon>
</liferay-ui:icon-menu>