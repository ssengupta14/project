package com.elenverve.controller.interceptor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.mobile.device.Device;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.elenverve.common.IConstants;
import com.elenverve.dvo.BrowserInfoDvo;
import com.elenverve.dvo.UserDvo;

public class DefaultHandlerInterceptor extends HandlerInterceptorAdapter {
	private static final Logger logger = Logger.getLogger(DefaultHandlerInterceptor.class);
	/**
	   * The name of the mobile view that the viewer is re-directed to
	   * in the event that a mobile device is detected.
	   */
	  private static final String MOBILE_VIEWER_VIEW_NAME = "mobile";

	  /**
	   * The User-Agent Http header.
	   */
	  private static final String USER_AGENT_HEADER = "User-Agent";

	  private List<String> mobileAgents_;
	  private List<String> normalAgents_;
	  private List<Pattern> uaPatterns_;
	  private List<Pattern> normPatterns_;

	  public void init() {
		    uaPatterns_ = new ArrayList<Pattern>();
		    normPatterns_= new ArrayList<Pattern>();
		    // Pre-compile the user-agent patterns as specified in mvc.xml
		    for(final String ua : mobileAgents_) {
		      try {
		        uaPatterns_.add(Pattern.compile(ua, Pattern.CASE_INSENSITIVE));
		      } catch (PatternSyntaxException e) {
		        // Ignore the pattern, if it failed to compile
		        // for whatever reason.
		      }
		    }
		    for(final String ua : normalAgents_) {
			      try {
			    	  normPatterns_.add(Pattern.compile(ua, Pattern.CASE_INSENSITIVE));
			      } catch (PatternSyntaxException e) {
			        // Ignore the pattern, if it failed to compile
			        // for whatever reason.
			      }
			 }
		    
		  }
	  @Override
	  public void postHandle(HttpServletRequest request,
	    HttpServletResponse response, Object handler,
	    ModelAndView mav) throws Exception {
		/*  
	    final String userAgent = request.getHeader(USER_AGENT_HEADER);
	    if(userAgent != null) {
	      // If the User-Agent matches a mobile device, then we set
	      // the view name to the mobile view JSP so that a mobile
	      // JSP is rendered instead of a normal view.
	      if(isMobile(userAgent)) {
	        final String view = mav.getViewName();
	        // If the incoming view was "homepage" then this interceptor
	        // changes the view name to "homepage-mobile" which, depending
	        // on your Spring configuration would probably resolve to
	        // "homepage-mobile.jsp" to render a mobile version of your
	        // site.
	        mav.setViewName(view + "-" + MOBILE_VIEWER_VIEW_NAME);
	      }
	    }
	    */
	  }
	  /**
	   * Returns true of the given User-Agent string matches a suspected
	   * mobile device.
	   * @param agent
	   * @return
	   */
	  private final String getDeviceType(final String agent) {
	    for(final Pattern p : uaPatterns_) {
	      final Matcher m = p.matcher(agent);
	      if(m.find()) {
	        return m.group();
	      }
	    }
	    for(final Pattern p : normPatterns_) {
		      final Matcher m = p.matcher(agent);
		      if(m.find()) {
		        return p.pattern();
		      }
		}
	    return null;
	  }

	  public void setMobileUserAgents(List<String> agents) {
	    mobileAgents_ = agents;
	  } 
	  public void setNormalUserAgents(List<String> agents) {
		  normalAgents_ = agents;
	  }
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
		super.preHandle(request, response, handler);
		Object user=request.getSession().getAttribute(IConstants.ANONYMOUS_USER);
		if (user==null){
			logger.debug("Browser information from controller [DefaultHandlerInterceptor] for context [/]");
			UserDvo aUser = new UserDvo(); 
			Enumeration headerNames = request.getHeaderNames();
			Map<String, String> map = new HashMap<String, String>();
			BrowserInfoDvo browserInfo = new BrowserInfoDvo();
			StringBuilder str = new StringBuilder();
			while (headerNames.hasMoreElements()) {
				
				String key = (String) headerNames.nextElement();
				String value = request.getHeader(key);
				if(key.equals("user-agent")){
					browserInfo.setUserAgent(value);
				}
				if(key.equals("cookie")){
					browserInfo.setCookie(value);
				}
				if(key.equals("host")){
					browserInfo.setHost(value);
				}
				str.append(key+" =[" + value+"]");
				logger.debug(key+" =[" + value+"]");
				map.put(key, value);
			}
				browserInfo.setHeaderInfo(str.toString());
				String ipAddress = request.getHeader("X-FORWARDED-FOR");  
			   if (ipAddress == null) {  
				   ipAddress = request.getRemoteAddr();  
			   }
			browserInfo.setIpAddress(ipAddress);   
			logger.debug("ipAddress :"+ipAddress);
			final String userAgent = request.getHeader(USER_AGENT_HEADER);
			String deviceType = "unknown";
			if(userAgent != null) {
				 deviceType = getDeviceType(userAgent);
			 }
			/*
		    if (device.isNormal()) {
		        deviceType = "normal";
		    } else if (device.isMobile()) {
		        deviceType = "mobile";
		    } else if (device.isTablet()) {
		        deviceType = "tablet";
		    } */
		    browserInfo.setDeviceType(deviceType);
		    logger.debug("Detected ["+deviceType+"] from controller [HomeController] for context [/]");
			aUser.setBrowserInfo(browserInfo);
			request.getSession().setAttribute(IConstants.ANONYMOUS_USER, aUser);
		}
        return true;
    }

}
