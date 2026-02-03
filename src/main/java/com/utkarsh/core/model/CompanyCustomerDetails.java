package com.utkarsh.core.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company_customer_details")
public class CompanyCustomerDetails {

    @Id
    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Column(name = "company_name", length = 50, nullable = false)
    private String companyName;
    
    @Column(name = "constitution_type", length = 50)
    private String constitutionType;

    @Column(name = "nature_of_business", length = 100)
    private String natureOfBusiness;

    @Column(name = "date_of_establishment")
    private LocalDate dateOfEstablishment;

    @Column(name = "country", length = 50)
    private String country;

    @Column(name = "state", length = 50)
    private String state;

    @Column(name = "district", length = 50)
    private String district;

    @Column(name = "taluka", length = 50)
    private String taluka;

    @Column(name = "city_or_village", length = 100)
    private String cityOrVillage;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "ward_no", length = 10)
    private String wardNo;

    @Column(name = "pincode", length = 10)
    private String pincode;

    @Column(name = "phone_no_1", length = 15)
    private String phoneNo1;

    @Column(name = "phone_no_2", length = 15)
    private String phoneNo2;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "website", length = 100)
    private String website;

    @Column(name = "fax_no", length = 20)
    private String faxNo;

    @Column(name = "pan_card_no", length = 20)
    private String panCardNo;

    @Column(name = "excise_no", length = 30)
    private String exciseNo;

    @Column(name = "tan_no", length = 20)
    private String tanNo;

    @Column(name = "sales_no", length = 30)
    private String salesNo;
    
    public CompanyCustomerDetails() {
        super();
    }

       
	public CompanyCustomerDetails(String customerId, String companyName, String constitutionType,
			String natureOfBusiness, LocalDate dateOfEstablishment, String country, String state, String district,
			String taluka, String cityOrVillage, String address, String wardNo, String pincode, String phoneNo1,
			String phoneNo2, String email, String website, String faxNo, String panCardNo, String exciseNo,
			String tanNo, String salesNo) {
		super();
		this.customerId = customerId;
		this.companyName = companyName;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
}
