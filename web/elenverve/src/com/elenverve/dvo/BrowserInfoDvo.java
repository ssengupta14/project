package com.elenverve.dvo;

import java.io.Serializable;
import java.util.Calendar;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BrowserInfoDvo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5353662567091612783L;
	@Id
	private String key;
	private String host;
	private String userAgent;
	private String cookie;
	private String headerInfo;
	private String ipAddress;
	private String deviceType;
	
	public String getKey() {
		return Calendar.getInstance().getTime().getTime()+"_"+host+"_"+ipAddress+"_"+userAgent+"_"+deviceType;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getHeaderInfo() {
		return headerInfo;
	}
	public void setHeaderInfo(String headerInfo) {
		this.headerInfo = headerInfo;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	
	

}
