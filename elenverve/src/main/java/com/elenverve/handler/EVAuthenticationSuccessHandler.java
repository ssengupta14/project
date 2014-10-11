package com.elenverve.handler;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.SavedRequest;

import com.elenverve.common.IConstants;
import com.elenverve.dvo.BrowserInfoDvo;
import com.elenverve.dvo.CustomerDvo;
import com.elenverve.dvo.UserDvo;
import com.elenverve.service.LoginService;

public class EVAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	
	@Autowired LoginService loginService;
	
    //protected Log logger = LogFactory.getLog(this.getClass());
    private final Logger logger = Logger.getLogger(this.getClass());
 
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
 
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        handle(request, response, authentication);
        clearAuthenticationAttributes(request);
    }
 
    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
    	CustomerDvo dvo = (CustomerDvo) authentication.getPrincipal();
    	Object aUser = request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
    	logger.debug("Inside EVAuthenticationSuccessHandler , retrieved user : ["+dvo.getEmailId()+"], ["+dvo.getLastName()+"]");
    	if(aUser!=null){
    		BrowserInfoDvo browserInfo = ((UserDvo)aUser).getBrowserInfo();
    		dvo.getFraudCheck().addBrowserInfo(browserInfo.getKey());
    		loginService.updateCustomer(dvo);
    		 request.getSession().setAttribute(IConstants.ANONYMOUS_USER, dvo);
    	}
    	logger.debug("Inside EVAuthenticationSuccessHandler , retrieved user : ["+dvo.getEmailId()+"], ["+dvo.getLastName()+"]");
    	
    	String targetUrl = determineTargetUrl(authentication,request,response);
        logger.debug("Inside handle method of EVAuthenticationSuccessHandler with ["+authentication.getDetails().toString()+"]" );
        if (response.isCommitted()) {
            logger.debug("Response has already been committed. Unable to redirect to " + targetUrl);
            return;
        } 
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }
 
    /** Builds the target URL according to the logic defined in the main class Javadoc. */
    protected String determineTargetUrl(Authentication authentication , HttpServletRequest request, HttpServletResponse response) {
        boolean isUser = false;
        boolean isAdmin = false;
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
        	logger.debug("Inside determineTargetUrl role ="+grantedAuthority.getAuthority());
            if (grantedAuthority.getAuthority().equals("ROLE_USER")) {
                isUser = true;
                break;
            } else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
                isAdmin = true;
                break;
            }
        }
        logger.debug("Inside determineTargetUrl isUser ="+isUser);
		if (isUser) {
			SavedRequest savedRequest = (SavedRequest) request.getSession().getAttribute("SPRING_SECURITY_SAVED_REQUEST");
			if (savedRequest == null) {

				return "/";

			} else {

				return savedRequest.getRedirectUrl();

			}
		} else if (isAdmin) {
            return "/console.html";
        } else {
            throw new IllegalStateException();
        }
    }
 
    protected void clearAuthenticationAttributes(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null) {
            return;
        }
        session.removeAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
    }
 
    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.redirectStrategy = redirectStrategy;
    }
    protected RedirectStrategy getRedirectStrategy() {
        return redirectStrategy;
    }
}
