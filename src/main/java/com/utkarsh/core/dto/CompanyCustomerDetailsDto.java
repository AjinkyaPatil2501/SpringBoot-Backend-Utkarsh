package com.utkarsh.core.dto;

import java.time.LocalDate;

public class CompanyCustomerDetailsDto {

//	private String customerId;
	private String companyname;
    private String constitutionType;
    private String natureOfBusiness;
    private LocalDate dateOfEstablishment;
    private String country;
    private String state;
    private String district;
    private String taluka;
    private String cityOrVillage;
    private String address;
    private String wardNo;
    private String pincode;
    private String phoneNo1;
    private String phoneNo2;
    private String email;
    private String website;
    private String faxNo;
    private String panCardNo;
    private String exciseNo;
    private String tanNo;
    private String salesNo;

    public CompanyCustomerDetailsDto() {}

	
public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}




//	public String getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(String customerId) {
//		this.customerId = customerId;
//	}

	public CompanyCustomerDetailsDto(String companyname, String constitutionType, String natureOfBusiness,
			LocalDate dateOfEstablishment, String country, String state, String district, String taluka,
			String cityOrVillage, String address, String wardNo, String pincode, String phoneNo1, String phoneNo2,
			String email, String website, String faxNo, String panCardNo, String exciseNo, String tanNo,
			String salesNo) {
		super();
		this.companyname = companyname;
		this.constitutionType = constitutionType;
		this.natureOfBusiness = natureOfBusiness;
		this.dateOfEstablishment = dateOfEstablishment;
		this.country = country;
		this.state = state;
		this.district = district;
		this.taluka = taluka;
		this.cityOrVillage = cityOrVillage;
		this.address = address;
		this.wardNo = wardNo;
		this.pincode = pincode;
		this.phoneNo1 = phoneNo1;
		this.phoneNo2 = phoneNo2;
		this.email = email;
		this.website = website;
		this.faxNo = faxNo;
		this.panCardNo = panCardNo;
		this.exciseNo = exciseNo;
		this.tanNo = tanNo;
		this.salesNo = salesNo;
	}


	public String getConstitutionType() {
		return constitutionType;
	}

	public void setConstitutionType(String constitutionType) {
		this.constitutionType = constitutionType;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public LocalDate getDateOfEstablishment() {
		return dateOfEstablishment;
	}

	public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getCityOrVillage() {
		return cityOrVillage;
	}

	public void setCityOrVillage(String cityOrVillage) {
		this.cityOrVillage = cityOrVillage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWardNo() {
		return wardNo;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhoneNo1() {
		return phoneNo1;
	}

	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}

	public String getPhoneNo2() {
		return phoneNo2;
	}

	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}


	public String getFaxNo() {
		return faxNo;
	}


	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}


	public String getPanCardNo() {
		return panCardNo;
	}


	public void setPanCardNo(String panCardNo) {
		this.panCardNo = panCardNo;
	}


	public String getExciseNo() {
		return exciseNo;
	}


	public void setExciseNo(String exciseNo) {
		this.exciseNo = exciseNo;
	}


	public String getTanNo() {
		return tanNo;
	}


	public void setTanNo(String tanNo) {
		this.tanNo = tanNo;
	}


	public String getSalesNo() {
		return salesNo;
	}


	public void setSalesNo(String salesNo) {
		this.salesNo = salesNo;
	}
    
	
}
