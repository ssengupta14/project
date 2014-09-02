<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd" >

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="cs" lang="cs" >
<head>

  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <title>Clean CSS Form</title>
  
  <!-- Free google font -->
  <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300,600' rel='stylesheet' type='text/css' />
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
  
       
    <!-- <div class='form'> -->
      <h1>Sign in</h1>
      <div class='line'></div>
      
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
      
      <!-- FORGOTTEN PASSWORD -->
      <div class='forgotten-password-box'>
        <form class='input-form' id='forgotten-password-form' action=''>
          <span class='ie-placeholders'>Email:</span><input type='text' id='ipt-fp-email' class='forgotten-password-email' placeholder='E-mail' />
          <input type='submit' class='btn-orange' value='Send' /><br /><br />
          We'll send you e-mail with password reset.
        </form>
      </div>
      
      <!-- ERROR STATE -->
      <div class='error-box red'>
        <span class='error-message'>Incorrect login or password.</span>
      </div>
           
      <div class='sign-link'>
        Don't have an account? <a href='registration.html'>Sign up</a>
      </div> 
   <!--  </div> -->
    
  </body>
</html>