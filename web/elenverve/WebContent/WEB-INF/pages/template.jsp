<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>

<title>ElenVerve collections - Online store, some things are worth waiting for</title>
</head>
<body>
<!-- 
from template : ${_csrf.headerName} &nbsp;&nbsp;&nbsp;&nbsp; ${_csrf.token}
-->
<c:choose>
	<c:when test="${noHeader=='true'}"></c:when>
	<c:otherwise><jsp:include page="header.jsp" /></c:otherwise>	
</c:choose>
 <jsp:include page="${page}.jsp" />
<c:choose>
	<c:when test="${noFooter=='true'}"></c:when>
	<c:otherwise><jsp:include page="footer.jsp" /></c:otherwise>
</c:choose>
 
</body>
</html>