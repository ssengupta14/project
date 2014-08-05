package com.elenverve.dvo;

import java.util.Date;


public class CredentialsDvo {

	public int VMAIL_SENT =0;
	public int VMAIL_NOT_RECVD =1;
	public int VMAIL_VERIFIED =2;
	public int VMAIL_EXPIRED =-1;
	private String username;
	private String password;
	private int veriStat;
	private Date vmailLastSentDate;
	private boolean isSocialLogin;	
	private String authToken;
	private SocialUserDvo socialUser;
	private String securityAnswer1;
	private String securityAnswer2;
	private String securityAnswer3;
	
	
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
	
}
