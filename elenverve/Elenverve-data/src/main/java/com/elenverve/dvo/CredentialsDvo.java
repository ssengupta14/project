package com.elenverve.dvo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

@Document
public class CredentialsDvo implements Serializable{

	public int VMAIL_SENT =0;
	public int VMAIL_NOT_RECVD =1;
	public int VMAIL_VERIFIED =2;
	public int VMAIL_EXPIRED =-1;
	private String username;
	private String password;
	private int veriStat;
	private Date vmailLastSentDate;
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public Long getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	private boolean isSocialLogin;	
	private String authToken;
	private String secret;
	private String refreshToken;
	private Long expireTime;
	private SocialUserDvo socialUser;
	private String securityAnswer1;
	private String securityAnswer2;
	private String securityAnswer3;
	private Collection<GrantedAuthority> authorities= new ArrayList<GrantedAuthority>();
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getVeriStat() {
		return veriStat;
	}
	public void setVeriStat(int veriStat) {
		this.veriStat = veriStat;
	}
	public Date getVmailLastSentDate() {
		return vmailLastSentDate;
	}
	public void setVmailLastSentDate(Date vmailLastSentDate) {
		this.vmailLastSentDate = vmailLastSentDate;
	}
	public boolean isSocialLogin() {
		return isSocialLogin;
	}
	public void setSocialLogin(boolean isSocialLogin) {
		this.isSocialLogin = isSocialLogin;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public SocialUserDvo getSocialUser() {
		return socialUser;
	}
	public void setSocialUser(SocialUserDvo socialUser) {
		this.socialUser = socialUser;
	}	
	public String getSecurityAnswer1() {
		return securityAnswer1;
	}
	public void setSecurityAnswer1(String securityAnswer1) {
		this.securityAnswer1 = securityAnswer1;
	}
	public String getSecurityAnswer2() {
		return securityAnswer2;
	}
	public void setSecurityAnswer2(String securityAnswer2) {
		this.securityAnswer2 = securityAnswer2;
	}
	public String getSecurityAnswer3() {
		return securityAnswer3;
	}
	public void setSecurityAnswer3(String securityAnswer3) {
		this.securityAnswer3 = securityAnswer3;
	}
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}
	public void addAuthority(GrantedAuthority authority) {
		this.authorities.add(authority);
	}
	
	public class RoleUser implements GrantedAuthority{

		/**
		 * 
		 */
		private static final long serialVersionUID = -6193630574798727375L;

		@Override
		public String getAuthority() {
			// TODO Auto-generated method stub
			return "ROLE_USER";
		}
		
	}
	
	public class RoleAdmin implements GrantedAuthority{

		/**
		 * 
		 */
		private static final long serialVersionUID = 2474377195507516630L;

		@Override
		public String getAuthority() {
			// TODO Auto-generated method stub
			return "ROLE_ADMIN";
		}
		
	}
	
}
