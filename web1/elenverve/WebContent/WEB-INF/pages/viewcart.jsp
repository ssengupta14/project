<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="imagesPath" value="${contextPath}/images"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<html>
	<head>
		<title>Checkout</title>
	</head>
	<body>
		<div style="float: left;">
			<div class="page-title">
				<h1 style="padding-right:20px;float:left">Checkout</h1>
				<div style="padding-top:3px"><a href="${flowExecutionUrl}&_eventId=cancelCheckout">[cancel checkout]</a></div>
				<div style="clear:both"></div>
			</div>
			<div id="yui-main">
				<div class="yui-b">
					<h2>Your Cart - ${shoppingCart.itemCount} items</h2>
					<jsp:include page="carttable.jsp"/>		
					
				</div> <%-- end yui-b --%>
			</div> <%-- end yui-main --%>
		</div>
		<div style="float: right;top:350px;  width:400px; left:00px;">
			<div class="yui-b">				
				<jsp:include page="account/signin.jsp"/>				
			</div> <%-- end yui-b --%>
		</div>
		
	</body>
</html>
