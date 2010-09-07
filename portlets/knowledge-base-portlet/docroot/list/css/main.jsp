<%
/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ include file="/css_init.jsp" %>

<liferay-util:buffer var="html">
	<liferay-util:include page="/admin/css/main.jsp" servletContext="<%= application %>" />
</liferay-util:buffer>

<%= StringUtil.replace(html, "knowledge-base-portlet-admin", "knowledge-base-portlet-list") %>

/* ---------- Configuration ---------- */

.portlet-configuration .aui-field-wrapper-content {
	margin: 0;
}

.portlet-configuration .kb-field-wrapper {
	margin: 10px 0;
}

/* ---------- Portlet ---------- */

.knowledge-base-portlet-list .kb-articles-panel .lfr-panel-titlebar {
	margin: 0 0 5px;
}

.knowledge-base-portlet-list .taglib-search-iterator .opens-new-window-accessible {
	display: none;
}