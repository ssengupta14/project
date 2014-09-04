<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:set var="imagesPath" value="${contextPath}/images"/>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"> 
<html>
	<!-- Styles -->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" />
	<!-- Bootstrap -->
	<link rel="stylesheet" href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>" type="text/css" />
	<!-- Font Awesome -->
	<link rel="stylesheet" href="<c:url value="/resources/css/owl.carousel.css"/>" type="text/css" />
	<!-- Owl Carousal -->	
	<link rel="stylesheet" href="<c:url value="/resources/css/animate.css"/>" type="text/css" />
	<!-- Animation -->
	<link rel="stylesheet" href="<c:url value="/resources/css/ion.rangeSlider.css"/>" />
	<!-- Range Slider -->
	<link rel="stylesheet" href="<c:url value="/resources/css/ion.rangeSlider.skinFlat.css"/>" />
	<!-- Range Slider -->	
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />
	<!-- Style -->
	<link rel="stylesheet" href="<c:url value="/resources/css/revolution.css"/>" media="screen" />
	<!-- Style -->
	<link rel="stylesheet" href="<c:url value="/resources/css/responsive.css"/>" type="text/css" />
	<!-- Responsive -->
	<!--<link rel="alternate stylesheet" type="text/css" href="<c:url value="/resources/css/orange.css"/>" title="orange" />-->
	<!-- Orange -->
	<link rel="stylesheet" type="text/css"	href="<c:url value="/resources/css/setting.css"/>" media="screen" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/mystyle.css"/>" media="screen" />
	<%-- <script type="text/javascript"	src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script> --%>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.leanModal.min.js"/>"></script>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
	
	<head>
		<title>Checkout</title>
	</head>
	<body>
	<div id="links1"></div>
	<div id="login1" style="display: none;" title="Login checkout"></div>
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
					
				</div> 
			</div> 
		</div>
		 <div style="float: right;top:350px;  width:400px; left:00px;">
			<div class="yui-b">				
				<jsp:include page="account/signin.jsp"/>				
			</div> 
		</div> 
		
		
		<script type="text/javascript">

		function loadLinks1() {
			
			var links1 = $("#links1");
			links1.load(
				'<c:url value="/links1" />',
				function(responseText, textStatus, xhr) {
					
					if (xhr.status == 200) {
						$("#ajaxLogin1").click(function() {
							loadLogin1();
						});
					} else {
						links1.html('<h4 style="color: #F00">Could not load URL "/links1"</h4>');
						links1.show();
					}
				});
		}
		 
	    function loadLogin1() {	    	
			 $("#modal_trigger1").leanModal({
					top : 200,
					overlay : 0.6,
					closeButton : ".modal_close"
				});
			
		};  
		    	
		<%-- $(document).ready(function() {
			alert("<%=request.getAttribute("page") %>");
		}); --%>
			
		
		/*  $(document).ready(function() {
			loadLinks1();
			//loadLogin1();
			$("#modal_trigger1").click();
		});  */
		
	</script>
	</body>
	
</html>
