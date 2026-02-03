package com.utkarsh.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company_partners")
public class CompanyPartners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partner_id")
    private String partnerId;

    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Column(name = "partner_name", length = 100, nullable = false)
    private String partnerName;

    @Column(name = "pan_no", length = 20)
    private String panNo;

    @Column(name = "mobile_no", length = 15)
    private String mobileNo;

//    @Column(name = "has_individual_account")
//    private Boolean hasIndividualAccount;

    public CompanyPartners() {
        super();
    }

    public CompanyPartners(String partnerId, String customerId, String partnerName,
                           String panNo, String mobileNo, Boolean hasIndividualAccount) {
        this.partnerId = partnerId;
        this.customerId = customerId;
        this.partnerName = partnerName;
        this.panNo = panNo;
        this.mobileNo = mobileNo;
//        this.hasIndividualAccount = hasIndividualAccount;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

//    public Boolean getHasIndividualAccount() {
//        return hasIndividualAccount;
//    }
//
//    public void setHasIndividualAccount(Boolean hasIndividualAccount) {
//        this.hasIndividualAccount = hasIndividualAccount;
//    }
}
