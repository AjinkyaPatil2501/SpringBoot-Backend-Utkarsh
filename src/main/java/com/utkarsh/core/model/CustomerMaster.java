package com.utkarsh.core.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "customer_master")
public class CustomerMaster {

    @Id
    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Column(name = "customer_type", length = 10, nullable = false)
    private String customerType;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "middle_name", length = 50)
    private String middleName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "father_or_husband_name", length = 100)
    private String fatherOrHusbandName;

    @Column(name = "gender", length = 10)
    private String gender;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "is_minor")
    private Boolean isMinor;

    @Column(name = "parent_name", length = 100)
    private String parentName;

    @Column(name = "marital_status", length = 20)
    private String maritalStatus;

    @Column(name = "education", length = 50)
    private String education;

    @Column(name = "religion", length = 50)
    private String religion;

    @Column(name = "caste", length = 50)
    private String caste;

    @Column(name = "sub_caste", length = 50)
    private String subCaste;

    @Column(name = "blood_group", length = 5)
    private String bloodGroup;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "phone_no", length = 15)
    private String phoneNo;

    @Column(name = "email_id", length = 100)
    private String emailId;

    @Column(name = "email_id_1", length = 100)
    private String emailId1;

    @Column(name = "email_id_2", length = 100)
    private String emailId2;

    @Column(name = "pan_card_no", length = 20)
    private String panCardNo;

    @Column(name = "aadhaar_card_no", length = 20)
    private String aadhaarCardNo;

    @Column(name = "gst_no", length = 20)
    private String gstNo;

    @Column(name = "introducer_id", length = 20)
    private String introducerId;

    @Lob
    @Column(name = "photo")
    private byte[] photo;

    @Lob
    @Column(name = "signature")
    private byte[] signature;

	public CustomerMaster() {
		super();
	}

	public CustomerMaster(String customerId, String customerType, String firstName, String middleName, String lastName,
			String fatherOrHusbandName, String gender, LocalDate dateOfBirth, Boolean isMinor, String parentName,
			String maritalStatus, String education, String religion, String caste, String subCaste, String bloodGroup,
			String address, String phoneNo, String emailId, String emailId1, String emailId2, String panCardNo,
			String aadhaarCardNo, String gstNo, String introducerId, byte[] photo, byte[] signature) {
		super();
		this.customerId = customerId;
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
		this.photo = photo;
		this.signature = signature;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
    
    
}
