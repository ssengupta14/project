package com.elenverve.controller.csrf;

import java.io.IOException;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;


/**
 * Creates a hidden input field with the CSRF Token
 * @author michael.simons, 2011-09-20
 */
@Configurable
public class CSRFTokenTag extends TagSupport {
	private final static Random random = new Random(System.currentTimeMillis());
 
	private static final long serialVersionUID = 745177955805541350L;
 
	private boolean plainToken = false;
	private String elementId;
 
	@Autowired
	private CsrfTokenRepository csrfTokenRepository;
 
	@Override
	public int doStartTag() throws JspException {	
		final CsrfToken token = csrfTokenRepository.loadToken((HttpServletRequest) super.pageContext.getRequest());
		if(token != null)
			try {
				if(plainToken)
					pageContext.getOut().write(token.getToken());
				else
					pageContext.getOut().write(String.format("<input type=\"hidden\" name=\"%s\" id=\"%s\" value=\"%s\" />", token.getParameterName(), StringUtils.isNotBlank(this.elementId) ? this.elementId : String.format("%s_%d", token.getParameterName(), random.nextInt()), token.getToken()));
			} catch (IOException e) {
			}
		return SKIP_BODY;
	}
 
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
 
	public boolean isPlainToken() {
		return plainToken;
	}
 
	public void setPlainToken(boolean plainToken) {
		this.plainToken = plainToken;
	}
 
	public String getElementId() {
		return elementId;
	}
 
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}	
}
