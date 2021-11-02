<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/init.jsp" %>

<% 
	List<YServices> services = YServicesLocalServiceUtil.getYServe(scopeGroupId);

	YCustomer customer = null;
	long yCustomerId = ParamUtil.getLong(request, "yCustomerId");
	if (yCustomerId > 0) {
		customer = YCustomerLocalServiceUtil.getYCustomer(yCustomerId);
	}
%>
<h2>Customer Form</h2>
<h3>Please kindly add new customer</h3>

<!-- Liferay Render URL -->
<portlet:renderURL var="viewRenderURL">
	<portlet:param name="mvcPath" value="/html/customer/view.jsp"></portlet:param>
</portlet:renderURL>

<!-- Liferay Action URL -->
<portlet:actionURL name="addYCustomer" var="customerActionURL"></portlet:actionURL>

<!-- HTML Form -->
<aui:form action="<%=customerActionURL%>">
	<aui:model-context bean="<%=customer%>" model="<%=YCustomer.class%>"></aui:model-context>
	<aui:fieldset>
		<aui:input name="yCustomerId" type="text" style="display:none;"></aui:input>
		<aui:input name="customerName" type="text"></aui:input>
		<aui:input name="customerEmail" type="text"></aui:input>
		<aui:input name="customerAddress" type="text"></aui:input>
		<aui:input name="customerNRC" type="text"></aui:input>
		<aui:input name="customerContact" type="text"></aui:input>
		<aui:input name="payment" type="text"></aui:input>
		
		<aui:select label="YServices" name="yServicesId">
			<%
				for(YServices s: services){
			%>
			<aui:option selected="<%=customer!=null && s.getYServicesId()==customer.getYServicesId()%>" value="<%=s.getYServicesId()%>">
				<%=s.getServicesName() %>
			</aui:option>
			<%
				}
			%>
		</aui:select>
	</aui:fieldset>
	
	<aui:button type="submit" value="SUBMIT"></aui:button>
	<aui:button onClick="<%=viewRenderURL.toString()%>" type="cancel" value="CANCEL"></aui:button>
</aui:form>