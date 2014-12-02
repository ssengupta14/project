package com.elenverve.dpo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.elenverve.dvo.BillingAddressDvo;
import com.elenverve.dvo.DiscountCouponDvo;
import com.elenverve.dvo.GiftCardDvo;
import com.elenverve.dvo.ShippingAddressDvo;
import com.elenverve.dvo.WishListDvo;


public class AccountSettingDpo {
	private AboutMe aboutMe;
	private SocialSettings socialSettings;
	private EmailSettings emailSettings;
	private PersonalSettings personalSettings;
	private SecuritySettings securitySettings; 
	private AddressBookSettings addressBookSettings;
	private CommunitySettings communitySettings;
	private AppsSettings appsSettings;
	
	private Map<String,Boolean> linkStatus = new HashMap<String,Boolean>();
	
	private String aboutMeInfo;
	private String socialSettingsInfo;
	private String emailSettingsInfo;
	private String yourOrderInfo;
	private String personalSettingsInfo;
	private String communityInfo;
	private String securitySettingsInfo;
	private String appsInfo;
	private String addressBookSettingsInfo;
	
	
	public AboutMe getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(AboutMe aboutMe) {
		this.aboutMe = aboutMe;
	}
	public SocialSettings getSocialSettings() {
		return socialSettings;
	}
	public void setSocialSettings(SocialSettings socialSettings) {
		this.socialSettings = socialSettings;
	}
	public EmailSettings getEmailSettings() {
		return emailSettings;
	}
	public void setEmailSettings(EmailSettings emailSettings) {
		this.emailSettings = emailSettings;
	}
	public PersonalSettings getPersonalSettings() {
		return personalSettings;
	}
	public void setPersonalSettings(PersonalSettings personalSettings) {
		this.personalSettings = personalSettings;
	}
	public SecuritySettings getSecuritySettings() {
		return securitySettings;
	}
	public void setSecuritySettings(SecuritySettings securitySettings) {
		this.securitySettings = securitySettings;
	}
	public AddressBookSettings getAddressBookSettings() {
		return addressBookSettings;
	}
	public void setAddressBookSettings(AddressBookSettings addressBookSettings) {
		this.addressBookSettings = addressBookSettings;
	}
	public CommunitySettings getCommunitySettings() {
		return communitySettings;
	}
	public void setCommunitySettings(CommunitySettings communitySettings) {
		this.communitySettings = communitySettings;
	}
	public AppsSettings getAppsSettings() {
		return appsSettings;
	}
	public void setAppsSettings(AppsSettings appsSettings) {
		this.appsSettings = appsSettings;
	}
	
	public String getAboutMeInfo() {
		return aboutMeInfo;
	}
	public void setAboutMeInfo(String aboutMeInfo) {
		this.aboutMeInfo = aboutMeInfo;
	}
	public String getSocialSettingsInfo() {
		return socialSettingsInfo;
	}
	public void setSocialSettingsInfo(String socialSettingsInfo) {
		this.socialSettingsInfo = socialSettingsInfo;
	}
	public String getEmailSettingsInfo() {
		return emailSettingsInfo;
	}
	public void setEmailSettingsInfo(String emailSettingsInfo) {
		this.emailSettingsInfo = emailSettingsInfo;
	}
	public String getYourOrderInfo() {
		return yourOrderInfo;
	}
	public void setYourOrderInfo(String yourOrderInfo) {
		this.yourOrderInfo = yourOrderInfo;
	}
	public String getPersonalSettingsInfo() {
		return personalSettingsInfo;
	}
	public void setPersonalSettingsInfo(String personalSettingsInfo) {
		this.personalSettingsInfo = personalSettingsInfo;
	}
	public String getCommunityInfo() {
		return communityInfo;
	}
	public void setCommunityInfo(String communityInfo) {
		this.communityInfo = communityInfo;
	}
	public String getSecuritySettingsInfo() {
		return securitySettingsInfo;
	}
	public void setSecuritySettingsInfo(String securitySettingsInfo) {
		this.securitySettingsInfo = securitySettingsInfo;
	}
	public String getAppsInfo() {
		return appsInfo;
	}
	public void setAppsInfo(String appsInfo) {
		this.appsInfo = appsInfo;
	}
	public String getAddressBookSettingsInfo() {
		return addressBookSettingsInfo;
	}
	public void setAddressBookSettingsInfo(String addressBookSettingsInfo) {
		this.addressBookSettingsInfo = addressBookSettingsInfo;
	}
	
	
	
	public Map<String,Boolean> getLinkStatus() {
		return linkStatus;
	}
	public void addLinkStatus(String key,Boolean value) {
		this.linkStatus.put(key, value);
	}



	public class AboutMe{

	private String displayName;
	private String username;
	private String password;
	private String phoneNumber;
	private String language;
	private String currency;
	private String verificationStatus;
	private String accountStatus;
	private String memberSince;
	private String membershipLevel;
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getVerificationStatus() {
		return verificationStatus;
	}
	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	public String getMemberSince() {
		return memberSince;
	}
	public void setMemberSince(String memberSince) {
		this.memberSince = memberSince;
	}
	public String getMembershipLevel() {
		return membershipLevel;
	}
	public void setMembershipLevel(String membershipLevel) {
		this.membershipLevel = membershipLevel;
	}
		
}

	public class SocialSettings{
	private int likes;
	private int shared;
	private int posts;
	private int comments;
	private Map<String,String> socialAccounts = new HashMap<String,String>();
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getShared() {
		return shared;
	}
	public void setShared(int shared) {
		this.shared = shared;
	}
	public int getPosts() {
		return posts;
	}
	public void setPosts(int posts) {
		this.posts = posts;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public Map<String, String> getSocialAccounts() {
		return socialAccounts;
	}
	public void setSocialAccounts(Map<String, String> socialAccounts) {
		this.socialAccounts = socialAccounts;
	}
	
	
	
}


	public class EmailSettings{
	private String primaryEmailId;
	private String secondaryEmailId;
	private String eReciepts;
	private String eAlerts;
	private String eReminders;
	private String eNotifications;
	private String eSuscriptions;
	public String getPrimaryEmailId() {
		return primaryEmailId;
	}
	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}
	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}
	public void setSecondaryEmailId(String secondaryEmailId) {
		this.secondaryEmailId = secondaryEmailId;
	}
	public String geteReciepts() {
		return eReciepts;
	}
	public void seteReciepts(String eReciepts) {
		this.eReciepts = eReciepts;
	}
	public String geteAlerts() {
		return eAlerts;
	}
	public void seteAlerts(String eAlerts) {
		this.eAlerts = eAlerts;
	}
	public String geteReminders() {
		return eReminders;
	}
	public void seteReminders(String eReminders) {
		this.eReminders = eReminders;
	}
	public String geteNotifications() {
		return eNotifications;
	}
	public void seteNotifications(String eNotifications) {
		this.eNotifications = eNotifications;
	}
	public String geteSuscriptions() {
		return eSuscriptions;
	}
	public void seteSuscriptions(String eSuscriptions) {
		this.eSuscriptions = eSuscriptions;
	}
	
	
}

	public class PersonalSettings{
	private String browsingHistoryEnabled;
	public String getBrowsingHistoryEnabled() {
		return browsingHistoryEnabled;
	}
	public void setBrowsingHistoryEnabled(String browsingHistoryEnabled) {
		this.browsingHistoryEnabled = browsingHistoryEnabled;
	}
	public String getAdPreferencesEnabled() {
		return adPreferencesEnabled;
	}
	public void setAdPreferencesEnabled(String adPreferencesEnabled) {
		this.adPreferencesEnabled = adPreferencesEnabled;
	}
	public String getRecomendationsEnabled() {
		return recomendationsEnabled;
	}
	public void setRecomendationsEnabled(String recomendationsEnabled) {
		this.recomendationsEnabled = recomendationsEnabled;
	}
	private String adPreferencesEnabled;
	private String recomendationsEnabled;
	private WishListDvo wishList;
	private List<GiftCardDvo> giftCards;
	private List<DiscountCouponDvo> coupons;
	
	
	public WishListDvo getWishList() {
		return wishList;
	}
	public void setWishList(WishListDvo wishList) {
		this.wishList = wishList;
	}
	public List<GiftCardDvo> getGiftCards() {
		return giftCards;
	}
	public void setGiftCards(List<GiftCardDvo> giftCards) {
		this.giftCards = giftCards;
	}
	public List<DiscountCouponDvo> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<DiscountCouponDvo> coupons) {
		this.coupons = coupons;
	}
	
}

	public class CommunitySettings{
	private Map<String,Boolean> linkStatus = new HashMap<String,Boolean>();

	public Map<String,Boolean> getLinkStatus() {
		return linkStatus;
	}

	public void addLinkStatus(String key,Boolean value) {
		this.linkStatus.put(key, value);
	}
	
}

	public class SecuritySettings{
	private String signInNotification;
	private String recognizeDeviceEnabled;
	public String getSignInNotification() {
		return signInNotification;
	}
	public void setSignInNotification(String signInNotification) {
		this.signInNotification = signInNotification;
	}
	public String getRecognizeDeviceEnabled() {
		return recognizeDeviceEnabled;
	}
	public void setRecognizeDeviceEnabled(String recognizeDeviceEnabled) {
		this.recognizeDeviceEnabled = recognizeDeviceEnabled;
	}
	
	
}

	public class AddressBookSettings{
	private List<ShippingAddressDvo> shippingAddresses = new ArrayList<ShippingAddressDvo>();
	private BillingAddressDvo billingAddress;
	public List<ShippingAddressDvo> getShippingAddresses() {
		return shippingAddresses;
	}
	public void addShippingAddresses(ShippingAddressDvo shippingAddresses) {
		this.shippingAddresses.add(shippingAddresses);
	}
	public void setShippingAddresses(List<ShippingAddressDvo> addresses) {
		this.shippingAddresses= addresses;
	}
	public BillingAddressDvo getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddressDvo billingAddress) {
		this.billingAddress = billingAddress;
	}
		
}
	
	public class AppsSettings{
		private Map<String,Boolean> linkStatus = new HashMap<String,Boolean>();
		public Map<String,Boolean> getLinkStatus() {
		return linkStatus;
	}

	public void addLinkStatus(String key,Boolean value) {
		this.linkStatus.put(key, value);
	}
}



}
