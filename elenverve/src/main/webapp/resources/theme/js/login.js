$(document).ready(function() {

  // Forgotten password open / close
  $('.forgotten-password-link').click(function() {
    $('.forgotten-password-box').slideToggle('slow');
    $('.error-box').slideUp('slow');
    $('#ipt-fp-email').val(''); 
  });
  
  // Validation Sign in
  
 // $("#sign-in-form").submit(function() {
  $("#loginButton").click(function() {	
	
    var value_login = $("#j_username").val();
    var value_password = $("#j_password").val();
    
    // If login is email
    
     var login_values = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;

    // Email format validation    
       if (!login_values.test(value_login)) {
         $('#j_username').addClass('ipt-error');      
         $('.error-box').slideDown('slow').removeClass('green').addClass('red');
         $(".error-message").text("Please, fill your correct email.");
         return false;
    }
    

    // Everything is all right
    if (value_login != "" && value_password != "")
    {
      $('#j_username').removeClass('ipt-error');
      $('#j_password').removeClass('ipt-error');
      $('.error-box').slideUp('slow');
     
      performLogin($("form"));
	  return false;
      //return true;
    }    
    // If its not ok
    else {
    	
    	if (value_login == "" && value_password == ""){
    		$('.error-box').slideDown('slow').removeClass('green').addClass('red');
            $(".error-message").text("Please enter login and password."); 
            
    	}    	
        // If login isn't ok
	    if (value_login == ""){
	        $('#j_username').addClass('ipt-error');      
	        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
	        $(".error-message").text("Please enter login");
	    }      
        // If login is ok but password not
        else if (value_login != "") {
        	$('#j_username').removeClass('ipt-error');      
        }
      
        // If password isn't ok
        if (value_password == ""){
	        $('#j_password').addClass('ipt-error');      
	        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
	        $(".error-message").text("Please enter password.");
        }      
        // If password is ok but login not
        else if (value_password != ""){
        	$('#j_password').removeClass('ipt-error');      
        }

      return false;
    }

   });
   
   // Validation Registration
  
  /*$("#registration-form").submit(function() {*/
  $("#registerButton").click(function() {
    
    var regFirstfName = $("#regFirstfName").val();
    var regLastfName = $("#regLastfName").val();
    var regEmail = $("#regEmail").val();
    var regPassword = $("#regPassword").val();
    var regRePassword = $("#regRePassword").val();
    
    // Email format validation
    
    var email_values = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
        
    if (regFirstfName != ""){ 
    	$('#regFirstfName').removeClass('ipt-error'); 
    }
    if (regLastfName != ""){ 
    	$('#regLastfName').removeClass('ipt-error'); 
    }
    if (regEmail != ""){ 
    	$('#regEmail').removeClass('ipt-error'); 
    }
    if (regPassword != "") { 
    	$('#regPassword').removeClass('ipt-error'); 
    }
    if (regRePassword != "") { 
    	$('#regRePassword').removeClass('ipt-error'); 
    }
    
    if (!email_values.test(regEmail)) {
       $('#regEmail').addClass('ipt-error');      
       $('.error-box').slideDown('slow').removeClass('green').addClass('red');
       $(".error-message").text("Please, fill your correct email.");
       return false;
    }
    
    // Everything is all right
    if (regFirstfName != "" && regLastfName != "" && regEmail != "" && regPassword != "" && regPassword == regRePassword && ($('#tac-checkbox:checked').val() !== undefined))
    {
      $('#regFirstfName').removeClass('ipt-error');
      $('#regLastfName').removeClass('ipt-error');
      $('#regEmail').removeClass('ipt-error');
      $('#regPassword').removeClass('ipt-error');
      $('#regRePassword').removeClass('ipt-error');
      $('.error-box').slideUp('slow');
      
      register($("form"));     
      
    }
    
    // If its not ok
    else {
    	
      // If login isn't ok
      if (regFirstfName == ""){
        $('#regFirstfName').addClass('ipt-error');      
        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
        $(".error-message").text("Please, fill all informations.");
      }
      // If login is ok
      else if (regFirstfName != ""){
        $('#regFirstfName').removeClass('ipt-error');      
      }
      
   // If login isn't ok
      if (regLastfName == ""){
        $('#regLastfName').addClass('ipt-error');      
        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
        $(".error-message").text("Please, fill all informations.");
      }
      // If login is ok
      else if (regLastfName != ""){
        $('#regLastfName').removeClass('ipt-error');      
      }
      
      // If email isn't ok
      if (regEmail == "")
      {
        $('#regEmail').addClass('ipt-error');      
        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
        $(".error-message").text("Please, fill all informations.");
      }
      
      // If email is ok
      else if (regEmail != "")
      {
        $('#regEmail').removeClass('ipt-error');      
      }
      
      // If password isn't ok
      if (regPassword == "")
      {
        $('#regPassword').addClass('ipt-error');      
        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
        $(".error-message").text("Please, fill all informations.");
      }
      
      // If password is ok
      else if (regPassword != "")
      {
        $('#regPassword').removeClass('ipt-error');      
      }
      
      // If repassword isn't same
      if (regPassword != regRePassword)
      {
        $('#regRePassword').addClass('ipt-error');      
        $('#regPassword').addClass('ipt-error'); 
        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
        $(".error-message").text("Retyped password doesn't match.");
      }
      
      // If repassword is ok
      else if (regPassword == regRePassword)
      {
        $('#regRePassword').removeClass('ipt-error');      
      }
      
      if (($('#tac-checkbox:checked').val() == undefined) && regFirstfName != "" && regEmail != "" && regPassword != "" && regPassword == regRePassword)
      {
        $('.error-box').slideDown('slow');
        $(".error-message").text("You have to agree with terms and conditions.");
      }

      return false;
    }

   });
  $.ajaxPrefilter(function(options, originalOptions, jqXHR) {
		var token = $("meta[name='_csrf']").attr("content");
		var header = $("meta[name='_csrf_header']").attr("content");		  
		jqXHR.setRequestHeader(header, token);
	});
   // Validation Forgotten Password
  
  $("#forgotten-password-form").submit(function() {

    var email_values = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
    var value_email = $("#ipt-fp-email").val();
    
    // Email format validation    
    if (!email_values.test(value_email)) {
      $('#ipt-fp-email').addClass('ipt-error');      
      $('.error-box').slideDown('slow').removeClass('green').addClass('red');
      // Change message
      $(".error-message").text("Please, fill your correct email.");
      return false;
    }
    
    // Everything is all right
    if ((value_email != "") && (email_values.test(value_email)))
    {
      $('#ipt-fp-email').removeClass('ipt-error');
      $('.forgotten-password-box').slideUp('slow');
      $('.error-box').removeClass('red').addClass('green').slideDown('slow');
      // Change message
      $(".error-message").text("We have successfully sent the password reset email.");
      return true;
    }
    
    // If its not ok
    else {
      // If email isn't ok
      var value_email = $("#ipt-fp-email").val();
      if (value_email == "")
      {
        $('#ipt-fp-email').addClass('ipt-error');      
        $('.error-box').slideDown('slow').removeClass('green').addClass('red');
        $(".error-message").text("Please, fill your email.");
      }
      
      else if (email_values.test(value_email)) {
        $('.forgotten-password-box').slideUp('slow');
        $('.error-box').slideDown('slow');
        $(".error-message").text("We have successfully sent the password reset email.");
      }
      
      // If email is ok
      else if (value_email != "")
      {
        $('#ipt-fp-email').removeClass('ipt-error');
        $('.error-box').slideUp('slow');
        return true;      
      }
      
      return false;
    }

   });

});