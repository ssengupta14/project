package com.elenverve.dvo;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Document
public class UserDvo extends BaseDvo implements UserDetails{
	@Id
	private String emailId;
	
	//private long id;
	private long accountId;
	//@NotEmpty
	//@Length(min = 2, max = 20)
	private String firstName;
	//@NotEmpty
	//@Length(min = 2, max = 20)
	private String lastName;
	
	private int gender;
	//@Pattern(regexp="\\(\\d{3}\\)-\\d{3}-\\d{4}")
	private String phoneNumber;
	private int phoneType;
	
	//@Email
	//@NotBlank
	//@Length(max=65)
	
	
	private CredentialsDvo credentials;
	private BrowserInfoDvo browserInfo;
	/*
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}*/
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}

	public CredentialsDvo getCredentials() {
		return credentials;
	}
	public void setCredentials(CredentialsDvo credentials) {
		this.credentials = credentials;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(int phoneType) {
		this.phoneType = phoneType;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return credentials.getAuthorities();
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return credentials.getPassword();
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return credentials.getUsername();
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	public BrowserInfoDvo getBrowserInfo() {
		return browserInfo;
	}
	public void setBrowserInfo(BrowserInfoDvo browserInfo) {
		this.browserInfo = browserInfo;
	}

}
