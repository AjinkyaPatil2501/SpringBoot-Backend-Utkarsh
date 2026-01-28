package com.utkarsh.core.dto;

import java.time.LocalDate;

public class CustomerMasterDto {

//	private String customerId;
   
	private String customerType;
    private String firstName;
    private String middleName;
    private String lastName;
    private String fatherOrHusbandName;
    private String gender;
    private LocalDate dateOfBirth;
    private Boolean isMinor;
    private String parentName;
    private String maritalStatus;
    private String education;
    private String religion;
    private String caste;
    private String subCaste;
    private String bloodGroup;
    private String address;
    private String phoneNo;
    private String emailId;
    private String emailId1;
    private String emailId2;
    private String panCardNo;
    private String aadhaarCardNo;
    private String gstNo;
    private String introducerId;
    private String photoBase64;     
    private String signatureBase64;
    public CustomerMasterDto() {}
	public CustomerMasterDto( String customerType, String firstName, String middleName,
			String lastName, String fatherOrHusbandName, String gender, LocalDate dateOfBirth, Boolean isMinor,
			String parentName, String maritalStatus, String education, String religion, String caste, String subCaste,
			String bloodGroup, String address, String phoneNo, String emailId, String emailId1, String emailId2,
			String panCardNo, String aadhaarCardNo, String gstNo, String introducerId, String photoBase64,
			String signatureBase64) {
		super();
//		this.customerId = customerId;
		this.customerType = customerType;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fatherOrHusbandName = fatherOrHusbandName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.isMinor = isMinor;
		this.parentName = parentName;
		this.maritalStatus = maritalStatus;
		this.education = education;
		this.religion = religion;
		this.caste = caste;
		this.subCaste = subCaste;
		this.bloodGroup = bloodGroup;
		this.address = address;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.emailId1 = emailId1;
		this.emailId2 = emailId2;
		this.panCardNo = panCardNo;
		this.aadhaarCardNo = aadhaarCardNo;
		this.gstNo = gstNo;
		this.introducerId = introducerId;
		this.photoBase64 = photoBase64;
		this.signatureBase64 = signatureBase64;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherOrHusbandName() {
		return fatherOrHusbandName;
	}
	public void setFatherOrHusbandName(String fatherOrHusbandName) {
		this.fatherOrHusbandName = fatherOrHusbandName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Boolean getIsMinor() {
		return isMinor;
	}
	public void setIsMinor(Boolean isMinor) {
		this.isMinor = isMinor;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getSubCaste() {
		return subCaste;
	}
	public void setSubCaste(String subCaste) {
		this.subCaste = subCaste;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getEmailId1() {
		return emailId1;
	}
	public void setEmailId1(String emailId1) {
		this.emailId1 = emailId1;
	}
	public String getEmailId2() {
		return emailId2;
	}
	public void setEmailId2(String emailId2) {
		this.emailId2 = emailId2;
	}
	public String getPanCardNo() {
		return panCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}
	public String getAadhaarCardNo() {
		return aadhaarCardNo;
	}
	public void setAadhaarCardNo(String aadhaarCardNo) {
		this.aadhaarCardNo = aadhaarCardNo;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getIntroducerId() {
		return introducerId;
	}
	public void setIntroducerId(String introducerId) {
		this.introducerId = introducerId;
	}
	public String getPhotoBase64() {
		return photoBase64;
	}
	public void setPhotoBase64(String photoBase64) {
		this.photoBase64 = photoBase64;
	}
	public String getSignatureBase64() {
		return signatureBase64;
	}
	public void setSignatureBase64(String signatureBase64) {
		this.signatureBase64 = signatureBase64;
	}
    
}
