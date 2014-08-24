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

	<link href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800|Raleway:400,300,600,700,500|Noto+Sans:400,700|Ubuntu:300,400,500,700"
		rel="stylesheet" type="text/css">
	<!-- Styles -->
	<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" type="text/css" />
	<!-- Bootstrap -->
	<link rel="stylesheet" href="<c:url value="/resources/font-awesome-4.0.3/css/font-awesome.css"/>" type="text/css" />
	<!-- Font Awesome -->	
	<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>"	type="text/css" />	
	<link rel="stylesheet" type="text/css"	href="<c:url value="/resources/css/setting.css"/>" media="screen" />
	<%-- <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/mystyle.css"/>" media="screen" /> --%>	
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" />	
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>" media="screen" />
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/form-style-ie.css"/>" media="screen" />
	<%-- <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/form-style.css"/>" media="screen" /> --%>
	
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.11.0.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery.leanModal.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/resources/js/login.js"/>"></script>
		

</head>
<body>
<!-- If not logged in, display login & ajax login links -->
<security:authorize ifNotGranted="ROLE_USER">
	<a id="modal_trigger" href="#modal">Login</a>	
</security:authorize>

<!-- If logged in, display secure and logout link -->
<security:authorize ifAllGranted="ROLE_USER">	 
	 <%-- <a href="<c:url value="/j_spring_security_logout" />"><security:authentication property="principal.username"/> Logout</a> --%>	
	 
	<div class="fa fa-user">
		<ul class="profile bar-dropdown">
			<li>	
				<font color="#898787"> Hi <security:authentication property="principal.username"/>		</font>				
				<%-- <a href="<c:url value="/j_spring_security_logout" />"><security:authentication property="principal.username"/> Logout</a> --%> 
				<ul>
					<li><a href="#" title="">Profile</a></li>
					<li><a href="#" title="">Help</a></li>
					<li><a href="#" title="">Privacy</a></li>
					<li><a href="<c:url value="/j_spring_security_logout" />" title="">Logout</a></li>
				</ul>				
			</li> 						
		</ul>
	</div>
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
					<a class="btn-facebook" href="#">Connect with Facebook</a>					
        			<a class="btn-twitter" href="#">Connect with Twitter</a>  			
					
			        <input type="text" id="j_username" name="j_username" placeholder="E-mail"/>
			        <input type="password" id="j_password" name="j_password" placeholder="Password"/>
			        <a class="forgotten-password-link" href="#">Forgotten password</a>
			      	<div id="signup_div">
        			Don't have an account? <a href="#" id="register_form">Sign up</a>
      				</div>
			        	<input type="submit" class="btn-sign-in btn-orange" value="Sign in" id="loginButton"/>			        	        
			        </div>
			         <!-- FORGOTTEN PASSWORD -->

				</form>
				<div class="forgotten-password-box" style="position:absolute;top:350px;  width:400px; left:00px;">
			        <form class="input-form" id="forgotten-password-form" action="">
			          <span class="ie-placeholders">Email:</span><input type="text" id="ipt-fp-email" class="forgotten-password-email" placeholder="E-mail" />
			          <input type="submit" class="btn-orange" value="Send" /><br /><br />
			          We'll send you e-mail with password reset.
			        </form>
			    </div>
				 
			</div>
			<!-- Register Form -->
			<div class="user_register">
				<form class="input-form" id="registration-form">
					<span class="ie-placeholders">First Name:</span><input type="text" placeholder="First Name" id="regFirstfName" name="regFirstfName"/>
					<span class="ie-placeholders">Last Name:</span><input type="text" placeholder="Last Name" id="regLastfName" name="regLastfName"/>
			        <span class="ie-placeholders">E-mail:</span><input type="text" placeholder="E-mail" id="regEmail" name="regEmail"/>
			        <span class="ie-placeholders">Password:</span><input type="password" placeholder="Password" id="regPassword" name="regPassword"/>
			        <span class="ie-placeholders">Retype Pass:</span><input type="password" placeholder="Retype password" id="regRePassword" name="regRePassword"/><br />
			        <input type="checkbox" id="tac-checkbox" /><label for="tac-checkbox">I agree with <a href="#">terms and conditions</a></label>
			        <div>
			        <div class="one_half last">
			        	<input type="submit" class="btn-register btn-orange" value="Register" id="registerButton"/>			        	
			        </div>
			        <div class="one_half">
			        	<input type="submit" class="back_btn btn-register btn-orange" value="Back" />
			        	</div>
			        </div>
					<!-- 
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
					</div> -->
				</form>
			</div>
			<div class="error-box red" style="position:absolute;top:400px;  width:500px;">
        		<span class="error-message">Incorrect login or password.</span>
    		</div>		
	</div>


	<script type="text/javascript">
			
		$("#modal_trigger").leanModal({
			top : 200,
			overlay : 0.6,
			closeButton : ".modal_close"
		});
			
		$(function() {
			// Calling Login Form
			$("#login_form").click(function() {
				$(".social_login").hide();
				$(".user_login").show();
				$('.error-box').hide();
			    
				return false;
			});
		
			// Calling Register Form
			$("#register_form").click(function() {
				$(".social_login").hide();
				$(".user_register").show();
				$(".header_title").text('Register');
				$('.error-box').hide();
			    
				return false;
			});
		
			// Going back to Social Forms
			$(".back_btn").click(function() {
				$(".user_login").hide();
				$(".user_register").hide();
				$(".social_login").show();
				$(".header_title").text('Login');
				$('.error-box').hide();
			    
				return false;
			});
			
			/* $("#loginButton").click(function() {			
				performLogin($("form"));
				return false;
			}); */
			
			$("#registerButton").click(function() {
				register($("form"));
				return false;
			});
		
		});
	
		function performLogin(form) {	
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
						 $('.error-box').slideDown('slow').removeClass('green').addClass('red');
					     $(".error-message").text("Incorrect login or password.");
						/* var err = form.find(".error");
						err.html("Login Failed [" + data.error + "]");
						err.show(); */
					}
				}, "json");
		};
	
		function register(form) {	
			
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
						$('.error-box').slideDown('slow').removeClass('green').addClass('red');
					    $(".error-message").text("Login Failed [" + data.error + "]");
					}
				}, "json");
		};
	</script>
</body>