<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<head>
	<link rel="stylesheet" href="<c:url value="/resources/css/cart.css"/>"	type="text/css" />
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700"	rel="stylesheet" type="text/css">
	<link rel="stylesheet"	href="<c:url value="/resources/css/bootstrap.min.css"/>"	type="text/css" />
	<link rel="stylesheet"	href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>"	type="text/css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />
	<link rel="stylesheet"	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
	<link rel="stylesheet" href="<c:url value="/resources/css/address.css"/>"	type="text/css"  />	
	<link rel="stylesheet" href="<c:url value="/resources/css/login.css"/>"	type="text/css"  />	
	<%-- <script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script> --%>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
	<link rel="stylesheet" href="/resources/demos/style.css"> 	
  	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
</head>
<html>
<body>
	<div class="theme-layout">
		<section class="block" id="inner-head">
			<div class="fixed-img sec-bg4"></div>
			<div class="container">	
				<h1>PRICE TABLE</h1>
			</div>
			
		</section>
		<section class="block">
			<div class="container">
				<div class="row">
					<c:forEach var="shippingAddress" items="${modal.getShippingAddressDvos()}">
					<div class="col-md-3">
						<div class="price-table small">
							<ul>
								<li class="price-head"><h6>${shippingAddress.id}</h6>
									<span>${shippingAddress.fullName}</span>
								</li>
								<li class="price-features">${shippingAddress.streetNo} &nbsp; ${shippingAddress.streetName} # ${shippingAddress.unitType},${shippingAddress.city} ,${shippingAddress.state} ,${shippingAddress.zip},${shippingAddress.country} </li>
								<li class="price-features">
								 <a id="modal_trigger" href="#modal" style="color:#4d8cff;font-weight: 300;font-family: open sans;font-size: 12px;">Select products to ship to this address</a>
								 <div id="links"></div>
								</li>
								<li class="price-footer"><span><a href="#" title="">Edit</a></span><a href="#" title=""><i class="fa fa-truck"></i></a><span><a href="#" title="">Delete</a></span></li>
								
							</ul>
						</div>
					</div>
					</c:forEach>
					
					
				</div>
			</div>
		</section>
	</div>
	<a class="dialog_trigger"  href="#">open the dialog <input type="hidden" value="0-50"/></a>
	<a class="dialog_trigger"  href="#">o dialog <input type="hidden" value="0100-50"/></a>
	<div id="dialog"></div>
	<div><input type="text" id="txtName" readonly="readonly" /></div>
</body>

<script type="text/javascript">
 	$(document).ready(function() {
	    $("#showAddress").change(function() {
	    	selectedvalue = $('option:selected', $(this)).val();
	    	$("#showAddress > option").each(function() {	    		
	    		$("#"+this.value).hide();	    	    
	    	});
	    	$("#"+selectedvalue).show();
	    });
	    
	    $( ".dialog_trigger" ).click(function() {
	   	 	$("#dialog").load("selectProduct");
	   	 	$( "#dialog" ).dialog( 'open' );
	   	 	var tag = $(this).text()+ '('+$(this).children('input[type=hidden]').val() + ')';   	 	
	   	 	
	   	});
	    $("#dialog").dialog({
	        autoOpen: false,
	        //position: 'center' ,
	        title: 'Select Product',
	        draggable: false,
	        width : 300,
	        height : 300, 
	        resizable : true,
	        modal : true,
	    });
	});
</script>
<script type="text/javascript">
function openDialog() {
       $("#somediv").load('revieworder.jsp').dialog({modal:true}); 
    } 
</script>
</html>
