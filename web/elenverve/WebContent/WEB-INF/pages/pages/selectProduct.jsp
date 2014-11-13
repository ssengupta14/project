<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
<link rel="stylesheet" href="<c:url value="/resources/css/cart.css"/>"	type="text/css" />
<!-- Style -->
</head>
<html>	
	<body>


	<select name="ddlNames" id="ddlNames">
	    <option value="Mudassar Khan">ABC</option>
	    <option value="John Hammond">John Hammond</option>
	    <option value="Mike Stanley">Mike Stanley</option>
</select>
<br />
<br />
	<input type="button" value="Select" onclick="SetName();" />
	<div id="selectproductmodel" class="selectproductmodel" style="display: none;">
	Select productsdfdsf
	</div>
	
	</body>
</html>