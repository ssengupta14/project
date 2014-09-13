package com.elenverve.dvo;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserDvo extends BaseDvo{
	
	private long id;
	private long accountId;
	@NotEmpty
	@Length(min = 2, max = 20)
	private String firstName;
	@NotEmpty
	@Length(min = 2, max = 20)
	private String lastName;
	
	private int gender;
	@Pattern(regexp="\\(\\d{3}\\)-\\d{3}-\\d{4}")
	private String phoneNumber;
	private int phoneType;
	@Id
	@Email
	@NotBlank
	@Length(max=65)
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
