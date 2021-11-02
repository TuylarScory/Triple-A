<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/init.jsp" %>

<% 
	//When Rendering to the services.jsp, Get Current servicesId which want to Edit
	long yServicesId = ParamUtil.getLong(renderRequest, "yServicesId");

	YServices services = null;

	if (yServicesId > 0) {
		services = YServicesLocalServiceUtil.getYServices(yServicesId);
	}
%>

<h2>Services Form</h2>
<h3>Please kindly add new services</h3>

<%--- Render URL  ---%>
<liferay-portlet:renderURL var="viewRenderURL">
	<liferay-portlet:param name="mvcPath" value="/html/service/view.jsp"></liferay-portlet:param>
</liferay-portlet:renderURL>

<%--- Action URL  ---%>
<liferay-portlet:actionURL name="addYServices" var="yServicesActionURL"></liferay-portlet:actionURL>

<%--- Form  ---%>
<aui:form action="<%=yServicesActionURL%>">
	<%--- Updated services is displaying in the form  ---%>
	<aui:model-context bean="<%=services%>" model="<%=YServices.class%>"></aui:model-context>
	
	<aui:input name="yServicesId" type="text" style="display:none;"></aui:input>
	<aui:input name="servicesName" type="text"></aui:input>
	<aui:input name="servicesPrice" type="text"></aui:input>
	<aui:input name="servicesDes" type="text"></aui:input>
	
	<aui:button type="submit" value="SUBMIT"></aui:button>
	<aui:button onClick="<%=viewRenderURL.toString()%>" type="cancel" value="CANCEL"></aui:button>
</aui:form>