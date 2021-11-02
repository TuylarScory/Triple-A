<%@ include file="/html/init.jsp" %>

<h3>View Customer</h3>

<%--- Render URL ---%>
<portlet:renderURL var="yCustomerRenderURL">
	<portlet:param name="mvcPath" value="/html/customer/customer.jsp"></portlet:param>
</portlet:renderURL>

<%--- Button ---%>
<aui:button name="addYCustomer" onClick="<%=yCustomerRenderURL.toString()%>" value="ADD CUSTOMER"></aui:button>

<%---  Search Container ---%>
<liferay-ui:search-container>
	<liferay-ui:search-container-results results="<%=YCustomerLocalServiceUtil.getYCustomers(scopeGroupId,searchContainer.getStart(),searchContainer.getEnd())%>"></liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="YCustomer" modelVar="customer">
		<liferay-ui:search-container-column-text name="customerName"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="customerEmail"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="customerAddress"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="customerNRC"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="customerContact"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="payment"></liferay-ui:search-container-column-text>
		
		<% 
			String servicesName = "";
			try {
				servicesName = YServicesLocalServiceUtil.getYServices(customer.getYServicesId()).getServicesName();
			} catch (Exception e) {
				
			}
		%>
		
		<liferay-ui:search-container-column-text name="servicesName" value="<%=servicesName%>"></liferay-ui:search-container-column-text>
		
		<liferay-ui:search-container-column-jsp align="right" path="/html/customer/customer_action.jsp"></liferay-ui:search-container-column-jsp>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator></liferay-ui:search-iterator>

</liferay-ui:search-container>