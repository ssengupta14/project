package com.elenverve.db.beans;

import java.util.Date;

public class UserDetailBean {

	private String emailId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String gender;
	private String phone;
	private String userVerified;
	private Date verifiedEmailSent;
	private int userType;
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the userVerified
	 */
	public String getUserVerified() {
		return userVerified;
	}
	/**
	 * @param userVerified the userVerified to set
	 */
	public void setUserVerified(String userVerified) {
		this.userVerified = userVerified;
	}
	/**
	 * @return the verifiedEmailSent
	 */
	public Date getVerifiedEmailSent() {
		return verifiedEmailSent;
	}
	/**
	 * @param verifiedEmailSent the verifiedEmailSent to set
	 */
	public void setVerifiedEmailSent(Date verifiedEmailSent) {
		this.verifiedEmailSent = verifiedEmailSent;
	}
	/**
	 * @return the userType
	 */
	public int getUserType() {
		return userType;
	}
	/**
	 * @param userType the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}
}
