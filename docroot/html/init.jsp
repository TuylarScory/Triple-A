<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects></portlet:defineObjects>
<theme:defineObjects></theme:defineObjects>

<%@page import="java.util.List"%>

<%--- Model or Entity ---%>
<%@page import="com.yyms.adp.aaa.model.YCustomer"%>
<%@page import="com.yyms.adp.aaa.model.YServices"%>

<%--- Service Layer---%>
<%@page import="com.yyms.adp.aaa.service.YCustomerLocalServiceUtil"%>
<%@page import="com.yyms.adp.aaa.service.YServicesLocalServiceUtil"%>
<%@page import="com.yyms.adp.aaa.service.impl.YCustomerLocalServiceImpl"%>
<%@page import="com.yyms.adp.aaa.service.impl.YServicesLocalServiceImpl"%>

<%--- Action UPDATE, DELETE ---%>
<%@page import="com.liferay.portal.kernel.dao.search.SearchEntry"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.yyms.adp.aaa.util.WebKeys"%>

<%--- Action Security ---%>
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>

<%--- Liferay c.tld ---%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--- Permission Helper Classes ---%>
<%@page import="com.yyms.adp.aaa.permission.YServicesModelPermission"%>
<%@page import="com.yyms.adp.aaa.permission.YServicesPermission"%>