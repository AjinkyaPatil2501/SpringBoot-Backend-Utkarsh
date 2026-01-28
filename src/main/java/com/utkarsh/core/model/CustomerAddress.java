package com.utkarsh.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_address")
public class CustomerAddress {

    @Id
    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Column(name = "local_country", length = 50)
    private String localCountry;

    @Column(name = "local_state", length = 50)
    private String localState;

    @Column(name = "local_district", length = 50)
    private String localDistrict;

    @Column(name = "local_taluka", length = 50)
    private String localTaluka;

    @Column(name = "local_city_or_village", length = 100)
    private String localCityOrVillage;

    @Column(name = "local_address", columnDefinition = "TEXT")
    private String localAddress;

    @Column(name = "local_ward_no", length = 10)
    private String localWardNo;

    @Column(name = "local_pincode", length = 10)
    private String localPincode;

    @Column(name = "local_phone_1", length = 15)
    private String localPhone1;

    @Column(name = "local_phone_2", length = 15)
    private String localPhone2;

    @Column(name = "local_mobile_1", length = 15)
    private String localMobile1;

    @Column(name = "local_mobile_2", length = 15)
    private String localMobile2;

    @Column(name = "permanent_country", length = 50)
    private String permanentCountry;

    @Column(name = "permanent_state", length = 50)
    private String permanentState;

    @Column(name = "permanent_district", length = 50)
    private String permanentDistrict;

    @Column(name = "permanent_taluka", length = 50)
    private String permanentTaluka;

    @Column(name = "permanent_city_or_village", length = 100)
    private String permanentCityOrVillage;

    @Column(name = "permanent_address", columnDefinition = "TEXT")
    private String permanentAddress;

    @Column(name = "permanent_ward_no", length = 10)
    private String permanentWardNo;

    @Column(name = "permanent_pincode", length = 10)
    private String permanentPincode;

    @Column(name = "permanent_phone_1", length = 15)
    private String permanentPhone1;

    @Column(name = "permanent_phone_2", length = 15)
    private String permanentPhone2;

    @Column(name = "permanent_mobile_1", length = 15)
    private String permanentMobile1;

    @Column(name = "permanent_mobile_2", length = 15)
    private String permanentMobile2;

    public CustomerAddress() {
        super();
    }

    public CustomerAddress(String customerId, String localCountry, String localState, String localDistrict,
                           String localTaluka, String localCityOrVillage, String localAddress, String localWardNo,
                           String localPincode, String localPhone1, String localPhone2, String localMobile1,
                           String localMobile2, String permanentCountry, String permanentState, String permanentDistrict,
                           String permanentTaluka, String permanentCityOrVillage, String permanentAddress,
                           String permanentWardNo, String permanentPincode, String permanentPhone1, String permanentPhone2,
                           String permanentMobile1, String permanentMobile2) {
        this.customerId = customerId;
        this.localCountry = localCountry;
        this.localState = localState;
        this.localDistrict = localDistrict;
        this.localTaluka = localTaluka;
        this.localCityOrVillage = localCityOrVillage;
        this.localAddress = localAddress;
        this.localWardNo = localWardNo;
        this.localPincode = localPincode;
        this.localPhone1 = localPhone1;
        this.localPhone2 = localPhone2;
        this.localMobile1 = localMobile1;
        this.localMobile2 = localMobile2;
        this.permanentCountry = permanentCountry;
        this.permanentState = permanentState;
        this.permanentDistrict = permanentDistrict;
        this.permanentTaluka = permanentTaluka;
        this.permanentCityOrVillage = permanentCityOrVillage;
        this.permanentAddress = permanentAddress;
        this.permanentWardNo = permanentWardNo;
        this.permanentPincode = permanentPincode;
        this.permanentPhone1 = permanentPhone1;
        this.permanentPhone2 = permanentPhone2;
        this.permanentMobile1 = permanentMobile1;
        this.permanentMobile2 = permanentMobile2;
    }

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getLocalCountry() {
		return localCountry;
	}

	public void setLocalCountry(String localCountry) {
		this.localCountry = localCountry;
	}

	public String getLocalState() {
		return localState;
	}

	public void setLocalState(String localState) {
		this.localState = localState;
	}

	public String getLocalDistrict() {
		return localDistrict;
	}

	public void setLocalDistrict(String localDistrict) {
		this.localDistrict = localDistrict;
	}

	public String getLocalTaluka() {
		return localTaluka;
	}

	public void setLocalTaluka(String localTaluka) {
		this.localTaluka = localTaluka;
	}

	public String getLocalCityOrVillage() {
		return localCityOrVillage;
	}

	public void setLocalCityOrVillage(String localCityOrVillage) {
		this.localCityOrVillage = localCityOrVillage;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public String getLocalWardNo() {
		return localWardNo;
	}

	public void setLocalWardNo(String localWardNo) {
		this.localWardNo = localWardNo;
	}

	public String getLocalPincode() {
		return localPincode;
	}

	public void setLocalPincode(String localPincode) {
		this.localPincode = localPincode;
	}

	public String getLocalPhone1() {
		return localPhone1;
	}

	public void setLocalPhone1(String localPhone1) {
		this.localPhone1 = localPhone1;
	}

	public String getLocalPhone2() {
		return localPhone2;
	}

	public void setLocalPhone2(String localPhone2) {
		this.localPhone2 = localPhone2;
	}

	public String getLocalMobile1() {
		return localMobile1;
	}

	public void setLocalMobile1(String localMobile1) {
		this.localMobile1 = localMobile1;
	}

	public String getLocalMobile2() {
		return localMobile2;
	}

	public void setLocalMobile2(String localMobile2) {
		this.localMobile2 = localMobile2;
	}

	public String getPermanentCountry() {
		return permanentCountry;
	}

	public void setPermanentCountry(String permanentCountry) {
		this.permanentCountry = permanentCountry;
	}

	public String getPermanentState() {
		return permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public String getPermanentDistrict() {
		return permanentDistrict;
	}

	public void setPermanentDistrict(String permanentDistrict) {
		this.permanentDistrict = permanentDistrict;
	}

	public String getPermanentTaluka() {
		return permanentTaluka;
	}

	public void setPermanentTaluka(String permanentTaluka) {
		this.permanentTaluka = permanentTaluka;
	}

	public String getPermanentCityOrVillage() {
		return permanentCityOrVillage;
	}

	public void setPermanentCityOrVillage(String permanentCityOrVillage) {
		this.permanentCityOrVillage = permanentCityOrVillage;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getPermanentWardNo() {
		return permanentWardNo;
	}

	public void setPermanentWardNo(String permanentWardNo) {
		this.permanentWardNo = permanentWardNo;
	}

	public String getPermanentPincode() {
		return permanentPincode;
	}

	public void setPermanentPincode(String permanentPincode) {
		this.permanentPincode = permanentPincode;
	}

	public String getPermanentPhone1() {
		return permanentPhone1;
	}

	public void setPermanentPhone1(String permanentPhone1) {
		this.permanentPhone1 = permanentPhone1;
	}

	public String getPermanentPhone2() {
		return permanentPhone2;
	}

	public void setPermanentPhone2(String permanentPhone2) {
		this.permanentPhone2 = permanentPhone2;
	}

	public String getPermanentMobile1() {
		return permanentMobile1;
	}

	public void setPermanentMobile1(String permanentMobile1) {
		this.permanentMobile1 = permanentMobile1;
	}

	public String getPermanentMobile2() {
		return permanentMobile2;
	}

	public void setPermanentMobile2(String permanentMobile2) {
		this.permanentMobile2 = permanentMobile2;
	}

  
}
