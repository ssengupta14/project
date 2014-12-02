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
						<h1>Your Account Settings </h1>
					</div>
						<div class="col-md-4">
							<div class="price-table small">
								<ul>
									<li class="price-head">
										<h2><i class="fa fa-user"></i></h2>
										
									</li>
									<li class="price-features name">
										<h4>About me <i class="fa fa-info-circle"></i></h4>
										
									</li>
									<li class="price-features content medium">
										<p><span>Display name</span><span class="content"> ${model.aboutMe.displayName}</span></p> 
										<p><span>Username</span><span class="content"> ${model.aboutMe.username}</span></p>
										<p><span>Password</span> <span class="content">****  <a href="#">change</a></span></p>
										<c:choose>
											<c:when test="${empty model.aboutMe.phoneNumber}">
												<p><span>Phone Number</span> <span class="content"> Unavailable <a href="#">add</a></span></p> 
											</c:when>
											<c:otherwise>
												<p><span>Phone Number</span> <span class="content">${model.aboutMe.phoneNumber} <a href="#">change</a></span></span></p> 
											</c:otherwise>
										</c:choose>
										<input type="hidden" id="addressTag" value="abc">
									</li>
									<li class="price-features content medium">
										<p><span>Language</span><span class="content"> ${model.aboutMe.language} <a href="#">change</a></span></p> 
										<p><span>Currency</span><span class="content"> ${model.aboutMe.currency}<a href="#">change</a></span></p>
										<c:choose>
											<c:when test="${empty model.aboutMe.verificationStatus}">
												<p><span>Verification status</span> <span class="content"> Unknown <a href="#">verify</a></span></p> 
											</c:when>
											<c:otherwise>
												<p><span>Verification status</span> <span class="content">${model.aboutMe.verificationStatus} <a href="#">change</a></span></span></p> 
											</c:otherwise>
										</c:choose>
										<p><span>Account status</span><span class="content"> ${model.aboutMe.accountStatus}</span></p> 
										<p><span>Member since</span><span class="content">  ${model.aboutMe.memberSince}</span></p> 
										<input type="hidden" id="addressTag" value="abc">
									</li>
									
									<!--<!-- <li class="price-footer"></li> -->
								</ul>
							</div>
						</div>
						<div class="col-md-4">
							<div class="price-table small">
								<ul>
									<li class="price-head">
										<h2><i class="fa fa-globe"></i></h2>
										
									</li>
									<li class="price-features name">
										<h4>Social settings <i class="fa fa-info-circle"></i></h4>
									</li>
									<li class="price-features content medium">
										<p><span><i class="fa fa-facebook"></i>	Facebook </span><span class="content"><a href="#">Link account</a></span></p> 
										<p><span><i class="fa fa-twitter"></i>Twitter</span><span class="content"><a href="#">Link account</a></span></p>
										<p><span><i class="fa fa-google-plus"></i>Google</span><span class="content"><a href="#">Link account</a></span></p>
										<input type="hidden" id="addressTag" value="abc">
									</li>
									<li class="price-features content medium">
										<p><span>Likes</span> <span class="content">${customerDvo.phoneNumber} 20</span></p> 
										<p><span>Shared</span> <span class="content">${customerDvo.phoneNumber} 15</span></p>
										<p><span>Posts</span> <span class="content">${customerDvo.phoneNumber} 12</span></p> 
										<p><span>Comments</span> <span class="content">${customerDvo.phoneNumber} 32</span></p> 
										<p><span>Tweets</span> <span class="content">${customerDvo.phoneNumber} 1</span></p>
										<input type="hidden" id="addressTag" value="abc">
									</li>
									
									<!-- <li class="price-footer"></li> -->
								</ul>
							</div>
						</div>
						<div class="col-md-4">
							<div class="price-table small">
								<ul>
									<li class="price-head">
										<h2><i class="fa fa-envelope"></i></h2>
										
									</li>
									<li class="price-features name">
										<h4>Email preferences <i class="fa fa-info-circle"></i></h4>
									</li>
									<li class="price-features content medium">
										<p><span>Primary email</span><span class="content"> ${model.emailSettings.primaryEmailId}</span></p>
										<c:choose>
											<c:when test="${empty model.emailSettings.secondaryEmailId}">
												<p><span>Secondary email</span><span class="content">Unavailable<a href="#">add</a></span></p>
											</c:when>
											<c:otherwise>
												<p><span>Secondary email</span><span class="content"> ${model.emailSettings.secondaryEmailId} <a href="#">change</a></span></p> 
											</c:otherwise>
										</c:choose>
										
										
										<input type="hidden" id="addressTag" value="abc">
									</li>
									<li class="price-features content medium">
										<p><span>Email Reciepts</span><span class="content">  ${model.emailSettings.eReciepts} <a href="#">change</a></span></p>
										<p><span>Email Alerts</span><span class="content">  ${model.emailSettings.eAlerts} <a href="#">change</a></span></p>
										<p><span>Email Reminders</span><span class="content">  ${model.emailSettings.eReminders} <a href="#">change</a></span></p>
										<p><span>Email Notification</span><span class="content"> ${model.emailSettings.eNotifications}<a href="#">change</a></span></p>
										<p><span>Email Subcriptions</span> <span class="content"> ${model.emailSettings.eSuscriptions} <a href="#">change</a></span></p>
										<input type="hidden" id="addressTag" value="abc">
									</li>
									
									<!-- <li class="price-footer"></li> -->
								</ul>
							</div>
						</div>
						
					
					
				</div>
				<div class="row">
					<div class="heading2">

					</div>
						
						<div class="col-md-4">
							<div class="price-table small">
								<ul>
									<li class="price-head">
										<h2><i class="fa fa-shopping-cart"></i></h2>

									</li>
									<li class="price-features name">
										<h4>Your Orders <i class="fa fa-info-circle"></i></h4>
									</li>
									<li class="price-features content medium">
										<p><span><a href="#">View open orders</a></span></p> 
										<p><span><a href="#">View order history</a></span></p> 
										<p><span><a href="#">Change or cancel order</a></span></p>
										<p><span><a href="#">Track your package</a></span></p>
										<p><span><a href="#">Return or replace items</a></span></p>
										<input type="hidden" id="addressTag" value="abc">
									</li>
									<!-- <li class="price-footer"></li> -->
								</ul>
							</div>
						</div>
						<div class="col-md-4">
							<div class="price-table small">
								<ul>
									<li class="price-head">
										<h2><i class="fa fa-wrench"></i></h2>

									</li>
									<li class="price-features name">
										<h4>Personal settings <i class="fa fa-info-circle"></i></h4>
									</li>
									<li class="price-features content medium">
										<p><span>Browsing history </span><span class="content"> ${model.personalSettings.browsingHistoryEnabled} <a href="#">change</a></span></p>
										<p><span>Ad preferences </span><span class="content">${model.personalSettings.adPreferencesEnabled} <a href="#">change</a></span></p>
										<p><span>Recomendations </span><span class="content">${model.personalSettings.recomendationsEnabled} <a href="#">change</a></span></p>
										
										<p><span>Wishlist </span><span class="content">5 Items <a href="#">clear</a></span></p>
										
										<input type="hidden" id="addressTag" value="abc">
									</li>
									<li class="price-features content medium">
										<c:choose>
											<c:when test="${model.personalSettings.getGiftCards().size() > 0}">
												<p><span>Gift cards</span> <span class="content">${model.personalSettings.getGiftCards().size()} <a href="#">view or redeem</a></span></p>
											</c:when>
											<c:otherwise>
												<p><span>Gift cards</span> <span class="content">None <a href="#">Add a card</a></span></p>
											</c:otherwise>
										</c:choose>
										<c:choose>
											<c:when test="${model.personalSettings.getCoupons().size() > 0}">
												<p><span>Coupons</span> <span class="content">${model.personalSettings.getCoupons().size()} <a href="#">view or redeem</a></span></p>
											</c:when>
											<c:otherwise>
												<p><span>Coupons</span> <span class="content">None <a href="#">Add Coupon</a></span></p>
											</c:otherwise>
										</c:choose>
										 
										
										<input type="hidden" id="addressTag" value="abc">
									</li>

									<!-- <li class="price-footer"></li> -->
								</ul>
							</div>
						</div>
						<div class="col-md-4">
							<div class="price-table small">
								<ul>
									<li class="price-head">
										<h2><i class="fa fa-group"></i></h2>

									</li>
									<li class="price-features name">
										<h4>Community <i class="fa fa-info-circle"></i></h4>
									</li>
									<li class="price-features content medium">
										<p><span><a href="#">Design products for us</a></span></p> 
										<p><span><a href="#">Sell your stuff</a></span></p> 
										<p><span><a href="#">Suggest an idea</a></span></p>
										<p><span><a href="#">Open a online store with us</a></span></p>
										<p><span><a href="#">Recomend us</a></span></p>
										<input type="hidden" id="addressTag" value="abc">
									</li>
									<!-- <li class="price-footer"></li> -->
								</ul>
							</div>
						</div>
										
									
									
				</div>
			
					<div class="row">
						<div class="heading2">

						</div>
							<div class="col-md-4">
								<div class="price-table small">
									<ul>
										<li class="price-head">
											<h2><i class="fa fa-gears"></i></h2>

										</li>
										<li class="price-features name">
											<h4>Security settings <i class="fa fa-info-circle"></i></h4>
										</li>
										<li class="price-features content medium">
											<p><span>Sign in notification</span><span class="content">${model.securitySettings.signInNotification}<a href="#">change</a></span></p>
											<p><span>Recognize device</span><span class="content">${model.securitySettings.recognizeDeviceEnabled}<a href="#">change</a></span></p>
											<input type="hidden" id="addressTag" value="abc">
										</li>


										<!-- <li class="price-footer"></li> -->
									</ul>
								</div>
							</div>
							<div class="col-md-4">
								<div class="price-table small">
									<ul>
										<li class="price-head">
											<h2><i class="fa fa-book"></i></h2>
							
										</li>
										<li class="price-features name">
											<h4>Address book <i class="fa fa-info-circle"></i></h4>
										</li>
										<li class="price-features content medium">
											<p><span>Address 1</span><span class="content"> Home <a href="#">Edit</a></span></p>
											<p><span>Address 2</span><span class="content"> Mom's Home <a href="#">Edit</a></span></p>
											<p><span></span><span class="content"><a href="#">Add shipping address</a></span></p>
											<input type="hidden" id="addressTag" value="abc">
										</li>
							
							
										<!-- <li class="price-footer"></li> -->
									</ul>
								</div>
							</div>
							<div class="col-md-4">
								<div class="price-table small">
									<ul>
										<li class="price-head">
											<h2><i class="fa fa-code"></i></h2>

										</li>
										<li class="price-features name">
											<h4>Apps <i class="fa fa-info-circle"></i></h4>
										</li>
										<li class="price-features content medium">
											<p><span><a href="#">Download Elenverve mobile app</a></span></p>
											<p><span><a href="#">Download Elenverve Roku app</a></span></p>
											<p><span><a href="#">Developer zone</a></span></p> 
											<input type="hidden" id="addressTag" value="abc">
										</li>
										<!-- <li class="price-footer"></li> -->
									</ul>
								</div>
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
