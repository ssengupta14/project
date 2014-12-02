package com.elenverve.dvo;

import java.io.Serializable;

public class UserSettingsDvo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6475691167740714417L;
	private boolean eReciepts=true;
	private boolean eAlerts=true;
	private boolean eReminders=true;
	private boolean eNotifications=true;
	private boolean eSuscriptions=true;
	private boolean browsingHistoryEnabled=true;
	private boolean adPreferencesEnabled=true;
	private boolean recomendationsEnabled=true;
	private boolean signInNotification=true;
	private boolean recognizeDeviceEnabled=true;
	
	public boolean iseReciepts() {
		return eReciepts;
	}
	public void seteReciepts(boolean eReciepts) {
		this.eReciepts = eReciepts;
	}
	public boolean iseAlerts() {
		return eAlerts;
	}
	public void seteAlerts(boolean eAlerts) {
		this.eAlerts = eAlerts;
	}
	public boolean iseReminders() {
		return eReminders;
	}
	public void seteReminders(boolean eReminders) {
		this.eReminders = eReminders;
	}
	public boolean iseNotifications() {
		return eNotifications;
	}
	public void seteNotifications(boolean eNotifications) {
		this.eNotifications = eNotifications;
	}
	public boolean iseSuscriptions() {
		return eSuscriptions;
	}
	public void seteSuscriptions(boolean eSuscriptions) {
		this.eSuscriptions = eSuscriptions;
	}
	public boolean isBrowsingHistoryEnabled() {
		return browsingHistoryEnabled;
	}
	public void setBrowsingHistoryEnabled(boolean browsingHistoryEnabled) {
		this.browsingHistoryEnabled = browsingHistoryEnabled;
	}
	public boolean isAdPreferencesEnabled() {
		return adPreferencesEnabled;
	}
	public void setAdPreferencesEnabled(boolean adPreferencesEnabled) {
		this.adPreferencesEnabled = adPreferencesEnabled;
	}
	public boolean isRecomendationsEnabled() {
		return recomendationsEnabled;
	}
	public void setRecomendationsEnabled(boolean recomendationsEnabled) {
		this.recomendationsEnabled = recomendationsEnabled;
	}
	public boolean isSignInNotification() {
		return signInNotification;
	}
	public void setSignInNotification(boolean signInNotification) {
		this.signInNotification = signInNotification;
	}
	public boolean isRecognizeDeviceEnabled() {
		return recognizeDeviceEnabled;
	}
	public void setRecognizeDeviceEnabled(boolean recognizeDeviceEnabled) {
		this.recognizeDeviceEnabled = recognizeDeviceEnabled;
	}

}
