package com.elenverve.dvo;


public abstract class UserDvo extends BaseDvo{
	
	private long id;
	private long accountId;
	private String firstName;
	private String lastName;
	private int gender;
	private String phoneNumber;
	private int phoneType;
	private String emailId;
	
	private CredentialsDvo credentials;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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

}
