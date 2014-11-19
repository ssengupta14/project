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
					<div class="heading4">
						<h4><img src="<%=request.getContextPath() %>/images/address-book-icon.png" alt=""> Your Address book </h4>
						<h6>Select an address from your address book or <a href="#">add a new address</a>.Items can be shipped to a <a href="#" >single address</a> or <a href="#" >multiple addresses </a></h6>
						
					</div>
					<c:choose>
						<c:when test="${modal.getShippingAddressDvos().size() > 0}">
							<c:forEach var="shippingAddress" items="${modal.getShippingAddressDvos()}">
								<div class="col-md-3">
									<div class="price-table small">
										<ul>
											<li class="price-head">
												<h2><i class="fa fa-home"></i></h2>
												<span>${shippingAddress.id}</span>
											</li>
											<li class="price-features name">
												<h4>${shippingAddress.fullName}</h4>
											</li>
											<li class="price-features content">
												<p>${shippingAddress.streetNo}&nbsp;${shippingAddress.streetName}</p> 
												<p>#${shippingAddress.unitType} </p>
												<p>${shippingAddress.city}, &nbsp;${shippingAddress.state} &nbsp; ${shippingAddress.zip} </p>
												<p>${shippingAddress.country}</p> 
												<p>Phone: 898-979-7301</p><!--${shippingAddress.country}</p> -->
												<input type="hidden" id="addressTag" value="${shippingAddress.streetNo}&nbsp;${shippingAddress.streetName}&nbsp;#${shippingAddress.unitType},${shippingAddress.city}, &nbsp;${shippingAddress.state} &nbsp; ${shippingAddress.zip} ">
											</li>
											<li class="price-features control">
												<span class="left"><i class="fa fa-pencil"></i><a href="#" title="">Edit</a></span>
												<span class="right"><i class="fa fa-trash-o"></i><a href="#" title="">Delete</a></span>
											</li>

											<li class="price-features content">
											 <p>Sending items to more than one address?  <a href="/elenverve/selectProduct" class="test">Select items here</a></p>

											 <div><input type="hidden" id="${shippingAddress.id}" readonly="readonly" /></div>
											 <div id="somediv" title="Select Products" class ="productBox">
											   <iframe id="thedialog" class="selectProduct" width="100%" height="100%" style="overflow:hidden; display:block; position: absolute; height: 100%; width: 100%"></iframe>
										             	
											</div>
											 
											</li>
											<li class="price-features">
												<input type="submit" value="Ship to this address" class="checkout-btn"/>
											</li>
											<li class="price-footer">
												
											<!--<a href="#" title=""><i class="fa fa-check"></i>Ship to this address</a> -->
											</li>
										</ul>
									</div>
								</div>
							</c:forEach>
						</c:when>									
																
						<c:otherwise>
							<div class="col-md-12">
								<ul>
									<li class="price-features general">
										<h2>Your address book is empty,<a href="#"> add a new address</a></h2>

									</li>
								</ul>
							</div> 
						</c:otherwise>
					</c:choose>
					
						
						
					
					<div class="heading4">
						<ul>
							<li class="price-features general">
								<h3>General address guidelines</h3>
								<h6>We know how much you are excited !!</h6>
								<h6>
									<p>We will always try to provide you seemless shopping experience.</p>
									<p>With your little help we can deliver your package in time. Incorrect or incomplete address can not only delay the shipping of your order but also your package might be undelivered or even may have to cancel your order and you might have to place a new order. A little care while entering address information and double-checking for any typos or errors could save your time and avoid inconvinience.</p>
									<p> Need help? Click for address tips:</p>
									<p><a href="">General address tips</a></p>
									<p><a href="">APO/FPO/DPO Guidelines and Restrictions</a></p>
								</h6>
								
							</li>
						</ul>
					</div>
				</div>
			</div>
		</section>		
	</div>
	<!--
	<a class="dialog_trigger"  href="#">open the dialog <input type="hidden" value="0-50"/></a>
	<a class="dialog_trigger"  href="#">o dialog <input type="hidden" value="0100-50"/></a>
	
	<div id="dialog"></div>
	<div><input type="text" id="txtName" readonly="readonly" /></div>
	-->
</body>

<script type="text/javascript">
 	$(document).ready(function() {
	    $("#showAddress").change(function() {
	    	selectedvalue = $('option:selected', $(this)).val();
	    	$("#showAddress > option").each(function() {	    		
	    		$("#"+this.value).hide();	    	    
	    	});
	    	$("#addressId").val(document.getElementById('addressTag').value);
	    	$("#"+selectedvalue).show();
	    });
	    
	    $( 'a.dialog_trigger' ).click(function() {
	    		alert(this.text);	
	   	 	$("#dialog").load("selectProduct");
	   	 	$( "#dialog" ).dialog( 'open' );
	   	 	var tag = $(this).text()+ '('+$(this).children('input[type=hidden]').val() + ')';   	 	
	   	 	
	   	});
	    $("#dialog").dialog({
	        autoOpen: false,
	        position: 'relative' ,
	         display: 'none',
	        title: 'Select Product',
	        draggable: true,
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
<script>
$(document).ready(function () {
    $(".test").click(function () {
        $("#thedialog").attr('src', $(this).attr("href"));
        $("#somediv").dialog({
            width: 600,
            height: 450,
            resizable : false,
            display: 'inline',
            draggable: false,
	    overlay : '0.1',	
            show: 'fade',
            position: 'relative' ,
            modal: true,
            
            buttons: {
	                "Select": function() {
	                alert($(this).children().find("#somediv").children().length);
	                $('#thedialog.form#myform').submit();
	                },
          		"Cancel": function() {$(this).dialog("close");},
	                    
            },
            open: function() {
	            $('.ui-widget-overlay').addClass('custom-overlay');
	            $('.ui-widget').addClass('custom-overlay');
	            $('.ui-widget-header').addClass('custom-overlay');
	            
    	    },
            close: function () {
            	$('.ui-widget-overlay').removeClass('custom-overlay');
            	$('.ui-widget').removeClass('custom-overlay');
            	 $('.ui-widget-header').removeClass('custom-overlay');
                $("#thedialog").attr('src', "about:blank");
            }
            
        }).dialog( "option", "position", { my: "center", at: "center", of: window } );
        return false;
    });
    
    $('#createNew').click(function() {
        $dialog.dialog('open');
        // prevent the default action, e.g., following a link
        return false;
    });
    
    $('form#myform').submit(function(){
    alert("hi");
        $(this).find(':checkbox').each(function(){
            if(this.checked)
                alert(this.name + ' is checked');
            else
                alert(this.name + ' is not checked');
        });
        $dialog.dialog('close');
});        
    
});

</script>


</html>
