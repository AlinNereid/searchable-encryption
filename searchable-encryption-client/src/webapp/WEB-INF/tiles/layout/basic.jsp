<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="_csrf" content="${_csrf.token}"/>
        <meta name="_csrf_header" content="${_csrf.headerName}"/>
		<link href="<c:url value="/resources/lib/bootstrap-3.3.4-dist/css/bootstrap.min.css" />" rel="stylesheet" type="text/css"/>
        <link href="<c:url value="/resources/lib/bootstrap-3.3.4-dist/css/bootstrap-theme.min.css" />" rel="stylesheet" type="text/css"/>

        <title><tiles:getAsString name="title" /></title>

        <script>window.contextPath = "${pageContext.request.contextPath}";</script>
        <script src="<c:url value="/resources/lib/jquery/jquery-2.1.3.min.js" />"></script>
        <script src="<c:url value="/resources/lib/bootstrap-3.3.4-dist/js/bootstrap.min.js" />"></script>

        <script src="<c:url value="/resources/js/auctionUtils.js" />"></script>
        <link href="<c:url value="/resources/css/mainStyle.css" />" rel="stylesheet" type="text/css"/>
         <link href="<c:url value="/resources/css/listItem.css" />" rel="stylesheet" type="text/css"/>
         <link href="<c:url value="/resources/css/login.css" />" rel="stylesheet" type="text/css"/>
         <link href="<c:url value="/resources/css/succesLogin.css" />" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <tiles:insertAttribute name="header" />
        <tiles:insertAttribute name="content" />
        <tiles:insertAttribute name="footer" />
    </body>
</html>


