<%@ include file="/html/init.jsp" %>

<h3>VIEW SERVICES</h3>

<%--- Render URL ---%>
<portlet:renderURL var="yServicesRenderURL">
	<portlet:param name="mvcPath" value="/html/service/services.jsp"></portlet:param>
</portlet:renderURL>

<%--- Button ---%>
<c:if test='<%=YServicesModelPermission.contains(permissionChecker, scopeGroupId, "ADD_SERVICES")%>'>
	<aui:button name="addYServices" onClick="<%=yServicesRenderURL.toString()%>" value="ADD SERVICES"></aui:button>
</c:if>

<%--- Liferay Search Container ---%>
<liferay-ui:search-container>
	<liferay-ui:search-container-results results="<%=YServicesLocalServiceUtil.getYServe(scopeGroupId,searchContainer.getStart(),searchContainer.getEnd())%>"></liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="YServices" modelVar="services">
		<liferay-ui:search-container-column-text name="servicesName"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="servicesPrice"></liferay-ui:search-container-column-text>
		<liferay-ui:search-container-column-text name="servicesDes"></liferay-ui:search-container-column-text>
	
		<liferay-ui:search-container-column-jsp align="right" path="/html/service/services_action.jsp"></liferay-ui:search-container-column-jsp>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator></liferay-ui:search-iterator>
</liferay-ui:search-container>