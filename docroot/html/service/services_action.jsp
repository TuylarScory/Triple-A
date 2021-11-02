<%@page import="com.liferay.portal.security.permission.ActionKeys"%>
<%@ include file="/html/init.jsp" %>

<% 
	//Retrieve Current Row
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

	//Get Current row to Services Object
	YServices services = (YServices) row.getObject();
%>


<%--- Liferay Action Icon Menu ---%>
<liferay-ui:icon-menu>

	<%--- Delete ---%>
	<c:if test='<%=YServicesPermission.contains(permissionChecker, services.getYServicesId(), ActionKeys.DELETE)%>'>
		
		<%--- Delete Action URL ---%>
		<portlet:actionURL name="deleteYServices" var="deleteYServicesActionURL">
			<portlet:param name="yServicesId" value="<%=String.valueOf(services.getYServicesId())%>"></portlet:param>
		</portlet:actionURL>
		
		<%--- Delete Action Button ---%>
		<liferay-ui:icon-delete url="<%=deleteYServicesActionURL.toString()%>"></liferay-ui:icon-delete>
			
	</c:if>
	
	<%--- Update ---%>
	<c:if test='<%=YServicesPermission.contains(permissionChecker, services.getYServicesId(), ActionKeys.UPDATE)%>'> 
		
		<%--- Edit Action URL ---%>
		<portlet:renderURL var="editYServicesRenderURL">
			<portlet:param name="yServicesId" value="<%=String.valueOf(services.getYServicesId())%>"></portlet:param>
			<portlet:param name="mvcPath" value="/html/service/services.jsp"></portlet:param>
		</portlet:renderURL>
		
		<%--- Edit Action Button ---%>
		<liferay-ui:icon image="edit" message="Edit" url="<%=editYServicesRenderURL.toString()%>"></liferay-ui:icon>
	
	</c:if>
	
	<%--- Permissions ---%>
	<c:if test='<%=YServicesPermission.contains(permissionChecker, services.getYServicesId(), ActionKeys.PERMISSIONS)%>'>
	
		<%--- Permission Action URL ---%>
		<liferay-security:permissionsURL modelResource="<%=YServices.class.getName()%>" modelResourceDescription="<%=services.getServicesName()%>" 
			resourcePrimKey="<%=String.valueOf(services.getYServicesId())%>" var="yServicesSecurityURL">
		</liferay-security:permissionsURL>
	
		<%--- Permissions Action Button ---%>
		<liferay-ui:icon image="permissions" url="<%=yServicesSecurityURL%>"></liferay-ui:icon>
		
	</c:if>
	
</liferay-ui:icon-menu>