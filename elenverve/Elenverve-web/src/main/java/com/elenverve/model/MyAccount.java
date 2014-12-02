package com.elenverve.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import com.elenverve.common.IConstants;
import com.elenverve.common.Parameters;
import com.elenverve.dpo.AccountSettingDpo;
import com.elenverve.dpo.AccountSettingDpo.AboutMe;
import com.elenverve.dpo.AccountSettingDpo.AddressBookSettings;
import com.elenverve.dpo.AccountSettingDpo.EmailSettings;
import com.elenverve.dpo.AccountSettingDpo.PersonalSettings;
import com.elenverve.dpo.AccountSettingDpo.SecuritySettings;
import com.elenverve.dpo.AccountSettingDpo.SocialSettings;
import com.elenverve.dvo.CustomerDvo;
import com.elenverve.dvo.DiscountCouponDvo;
import com.elenverve.dvo.FbUserDvo;
import com.elenverve.dvo.GiftCardDvo;
import com.elenverve.dvo.GplusUserDvo;
import com.elenverve.dvo.ShippingAddressDvo;
import com.elenverve.dvo.SocialUserDvo;
import com.elenverve.dvo.TwitterUserDvo;
import com.elenverve.dvo.WishListDvo;
import com.elenverve.util.CommonUtils;

public class MyAccount extends Default{
	
	private AccountSettingDpo settingsDpo;
	private AboutMe aboutMe;
	private SocialSettings socialSettings;
	private EmailSettings emailSettings;
	private PersonalSettings personalSettings;
	private SecuritySettings securitySettings;
	private AddressBookSettings addressBookSettings;
	
	
	
	public AboutMe getAboutMe() {
		return this.settingsDpo.getAboutMe();
	}
	public SocialSettings getSocialSettings() {
		return this.settingsDpo.getSocialSettings();
	}
	public EmailSettings getEmailSettings() {
		return this.settingsDpo.getEmailSettings();
	}
	public PersonalSettings getPersonalSettings() {
		return this.settingsDpo.getPersonalSettings();
	}
	public SecuritySettings getSecuritySettings() {
		return this.settingsDpo.getSecuritySettings();
	}
	public AddressBookSettings getAddressBookSettings() {
		return this.settingsDpo.getAddressBookSettings();
	}
	
	public MyAccount(Parameters parameters){
		this.parameters = parameters;
		createMyAccount();
	}
	private void createMyAccount(){
	 CustomerDvo customer = (CustomerDvo)parameters.getParameter(CUSTOMER);
	 settingsDpo = new AccountSettingDpo();
	 
	 //fill About me - customer info
	 
	 AboutMe aboutMe = settingsDpo.new AboutMe();
	 aboutMe.setUsername(customer.getUsername());
	 aboutMe.setPhoneNumber(customer.getPhoneNumber());
	 aboutMe.setDisplayName(customer.getFirstName() +" " + customer.getLastName());
	 Calendar cal = Calendar.getInstance();
	 cal.setTime(customer.getCreateDate());
	 int year = cal.get(Calendar.YEAR);
	 int memberYrs= cal.get(Calendar.YEAR) -year;
	 aboutMe.setMemberSince(""+year);
	 aboutMe.setMembershipLevel(CommonUtils.getMembershipLevel(memberYrs));
	 aboutMe.setVerificationStatus(CommonUtils.getAccountVerificationStatus(customer.getCredentials().getVeriStat()));
	 String accountStatus = "Active";
	 if (customer.getFraudCheck().isAccountActive()==false){
		 accountStatus = "InActive";
	 }
	 if (customer.getFraudCheck().isAccountEnabled()==false){
		 accountStatus = "Disabled";
	 }
	 if (customer.getFraudCheck().isAccountNonLocked()==false){
		 accountStatus = "Locked";
	 }
	 if (customer.getFraudCheck().isIsfraudAccount()==true){
		 accountStatus = "Disabled";
	 }
	 aboutMe.setAccountStatus(accountStatus);
	 aboutMe.setLanguage(customer.getLanguage());
	 aboutMe.setCurrency(customer.getCurrency());
	 
	 settingsDpo.setAboutMe(aboutMe);
	 
	 //fill social settings
	 
	 SocialSettings social = settingsDpo.new SocialSettings();
	 SocialUserDvo socialUser = customer.getCredentials().getSocialUser();
	 if(socialUser instanceof FbUserDvo){
		 
	 }
	 if(socialUser instanceof TwitterUserDvo){
		 
	 }
	 if(socialUser instanceof GplusUserDvo){
		
	 }
	 settingsDpo.setSocialSettings(social);
	 
	 
	 // fill email settings
	 
	 EmailSettings emailSettings = settingsDpo.new EmailSettings();
	 emailSettings.seteAlerts(CommonUtils.toggleSwitch(customer.getSettings().iseAlerts()));
	 emailSettings.seteNotifications(CommonUtils.toggleSwitch(customer.getSettings().iseNotifications()));
	 emailSettings.seteReciepts(CommonUtils.toggleSwitch(customer.getSettings().iseReciepts()));
	 emailSettings.seteReminders(CommonUtils.toggleSwitch(customer.getSettings().iseReminders()));
	 emailSettings.seteSuscriptions(CommonUtils.toggleSwitch(customer.getSettings().iseSuscriptions()));
	 emailSettings.setPrimaryEmailId(customer.getEmailId());
	 emailSettings.setSecondaryEmailId(customer.getSecondaryEmailId());
	 
	 settingsDpo.setEmailSettings(emailSettings);
	 
	 // fill personal settings
	 
	 PersonalSettings personalSettings = settingsDpo.new PersonalSettings();
	 personalSettings.setAdPreferencesEnabled(CommonUtils.toggleSwitch(customer.getSettings().isAdPreferencesEnabled()));
	 personalSettings.setBrowsingHistoryEnabled(CommonUtils.toggleSwitch(customer.getSettings().isBrowsingHistoryEnabled()));
	 personalSettings.setRecomendationsEnabled(CommonUtils.toggleSwitch(customer.getSettings().isRecomendationsEnabled()));
	 personalSettings.setWishList((WishListDvo)parameters.getParameter(IConstants.WISHLIST));
	 personalSettings.setCoupons((List<DiscountCouponDvo>)parameters.getParameter(IConstants.DISCOUNTS));
	 personalSettings.setGiftCards((List<GiftCardDvo>)parameters.getParameter(IConstants.GIFTS));
	 
	 settingsDpo.setPersonalSettings(personalSettings);
	 
	 // fill security settings
	 
	 SecuritySettings securitySettings = settingsDpo.new SecuritySettings();
	 securitySettings.setRecognizeDeviceEnabled(CommonUtils.toggleSwitch(customer.getSettings().isRecognizeDeviceEnabled()));
	 securitySettings.setSignInNotification(CommonUtils.toggleSwitch(customer.getSettings().isSignInNotification()));
	 
	 settingsDpo.setSecuritySettings(securitySettings); 
	 
	 
	 // fill Address book
	 AddressBookSettings addressSettings = settingsDpo.new AddressBookSettings();
	 addressSettings.setBillingAddress(customer.getBillingAddress());
	 Set<ShippingAddressDvo> addresses = customer.getShipingAddresses();
	 List <ShippingAddressDvo> shippingAddresses= new ArrayList<ShippingAddressDvo>();
	 shippingAddresses.addAll(addresses);
	 addressSettings.setShippingAddresses(shippingAddresses);
	 
	 settingsDpo.setAddressBookSettings(addressSettings);
	 
	}
	
	
}
