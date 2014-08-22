<!-- This JSP page displays the links section -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security"%>
<%@ page session="false"%>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Index</title>
	<meta name="description" content="" />
	<meta name="keywords" content="" />

	<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700'
		rel='stylesheet' type='text/css'>

	<!-- Styles -->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" />
	<!-- Bootstrap -->
	<link rel="stylesheet" href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>" type="text/css" />
	<!-- Font Awesome -->	
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />	
	<link rel="stylesheet" type="text/css"	href="<c:url value="/resources/css/setting.css"/>" media="screen" />
	<%-- <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/mystyle.css"/>" media="screen" /> --%>
	
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.leanModal.min.js"/>"></script>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />
	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>" media="screen" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/form-style-ie.css"/>" media="screen" />
	<%-- <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/form-style.css"/>" media="screen" /> --%>
		

</head>
<body>
<!-- If not logged in, display login & ajax login links -->
<security:authorize ifNotGranted="ROLE_USER">
	<a id="modal_trigger" href="#modal">Login</a>	
</security:authorize>

<!-- If logged in, display secure and logout link -->
<security:authorize ifAllGranted="ROLE_USER">	 
	 		<a href="<c:url value="/j_spring_security_logout" />"><security:authentication property="principal.username"/> Logout</a>	
</security:authorize>

	<div id="modal" class="popupContainer" style="display: none;">
		<header class="popupHeader">
			<span class="header_title">Login</span> 
			<span class="modal_close"><i class="fa fa-times"></i></span>
		</header>
		
			<!-- Social Login -->
			<div class="social_login">	
				 <form>		
				
					<div id="social_login_div"> 
					<a class='btn-facebook' href='#'>Connect with Facebook</a>					
        			<a class='btn-twitter' href='#'>Connect with Twitter</a>  			
					<!-- 
					<input type='text' id='ipt-login' placeholder='Login' />
			        <input type='password' id='ipt-password' placeholder='Password' /> 
			        -->
			        <input type='text' id="j_username" name='j_username' placeholder='Login'/>
			        <input type="password" id="j_password" name="j_password" placeholder='Password'/>
			        <a class='forgotten-password-link' href='#'>Forgotten password</a>
			      	<div id="signup_div">
        			Don't have an account? <a href='registration.html'>Sign up</a>
      				</div>
			        	<input type='submit' class='btn-sign-in btn-orange' value='Sign in' id="loginButton"/>
			        	        
			        </div>
				</form>
			</div>

			<!-- Username & Password Login form -->
			<div class="user_login">
				<form>
					<!-- <div class="message" style="display: none;">&nbsp;</div>
					<div class="error" style="display: none;">&nbsp;</div>
					<div>
						<label for="j_username" class="popuptext">User:</label> 
						<input type='text' id="j_username" name='j_username' />
					</div>
					<div style="clear: both;"></div>
					<div>
						<label for="j_password" class="popuptext">Password:</label> 
						<input type="password" id="j_password" name="j_password" />
					</div>
					<div style="clear: both;"></div>
					<div id="rememberMe">
						<input type="checkbox" name="_spring_security_remember_me" id="_spring_security_remember_me" /> 
						<label for="_spring_security_remember_me">Don't ask for my password for two weeks</label>
					</div>

					<div class="action_btns">
						<div class="one_half">
							<a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a>
						</div>
						<div class="one_half last">
							<a href="#" class="btn btn_red" id="loginButton">Login</a>
						</div>
					</div> -->
				</form>
				<a href="#" class="forgot_password">Forgot password?</a>
			</div>
			<!-- Register Form -->
			<div class="user_register">
				<form>
					<label>First Name</label> 			<input type="text" id="fName" name="fName"/> <br /> 
					<label>Last Name</label> 			<input type="text" id="lName" name="lName"/> <br />
					<label>Email Address</label> 		<input type="email" id="email" name="email"/> <br /> 
					<label>Password</label>				<input type="password" id="rPassword" name ="rPassword"/> <br />

					<div class="checkbox">
						<input id="send_updates" type="checkbox" /> 
						<label for="send_updates">Send me occasional email updates</label>
					</div>

					<div class="action_btns">
						<div class="one_half">
							<a href="#" class="btn back_btn"><i class="fa fa-angle-double-left"></i> Back</a>
						</div>
						<div class="one_half last">
							<a href="#" class="btn btn_red" id="registerButton">Register</a>
						</div>
					</div>
				</form>
			</div>
		
	</div>

<script type="text/javascript">
		
$("#modal_trigger").leanModal({
	top : 200,
	overlay : 0.6,
	closeButton : ".modal_close"
});
$("#ajaxLogin").leanModal({
	top : 200,
	overlay : 0.6,
	closeButton : ".modal_close"
});

$(function() {
	// Calling Login Form
	$("#login_form").click(function() {
		$(".social_login").hide();
		$(".user_login").show();
		return false;
	});

	// Calling Register Form
	$("#register_form").click(function() {
		$(".social_login").hide();
		$(".user_register").show();
		$(".header_title").text('Register');
		return false;
	});

	// Going back to Social Forms
	$(".back_btn").click(function() {
		$(".user_login").hide();
		$(".user_register").hide();
		$(".social_login").show();
		$(".header_title").text('Login');
		return false;
	});
	$("#loginButton").click(function() {			
		performLogin($("form"));
		return false;
	});
	
	$("#registerButton").click(function() {
		register($("form"));
		return false;
	});

});

function performLogin(form) {
	//form.find(".message").hide();
	//form.find(".error").hide();
	
	$.post(
		'<c:url value="/login" />',
		form.serialize(),
		function (data, textStatus) {
			var modal_id = $(this).attr("#modal");			
			if (data.status) {
				//window.location.reload(true);				
				//$(document).off('keydown.leanModal');
				loadLinks();
				
			} else {
				var err = form.find(".error");
				err.html("Login Failed [" + data.error + "]");
				err.show();
			}
		}, "json");
};

function register(form) {
	//form.find(".message").hide();
	//form.find(".error").hide();
	
	$.post(
		'<c:url value="/register" />',
		form.serialize(),
		function (data, textStatus) {
			var modal_id = $(this).attr("#modal");			
			if (data.status) {
				window.location.reload(true);				
				//$(document).off('keydown.leanModal');
				loadLinks();
				
			} else {
				var err = form.find(".error");
				err.html("Login Failed [" + data.error + "]");
				err.show();
			}
		}, "json");
};


		</script>
</body>