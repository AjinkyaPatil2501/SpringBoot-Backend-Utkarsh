package com.utkarsh.core.dto;

public class LoginRequestDto {
	
	private String cpassword;
	private Integer cuserId; 
	private String fingerprint; // Base64 / encrypted template
	private String deviceId;
	public LoginRequestDto() {
		super();
	}
	public LoginRequestDto(String cpassword, Integer cuserId, String fingerprint, String deviceId) {
		super();
		this.cpassword = cpassword;
		this.cuserId = cuserId;
		this.fingerprint = fingerprint;
		this.deviceId = deviceId;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public Integer getCuserId() {
		return cuserId;
	}
	public void setCuserId(Integer cuserId) {
		this.cuserId = cuserId;
	}
	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	
}
