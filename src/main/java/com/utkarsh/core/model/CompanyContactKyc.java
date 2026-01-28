package com.utkarsh.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "company_contact_kyc")
public class CompanyContactKyc {

    @Id
    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Column(name = "kyc_doc_name", length = 100)
    private String kycDocName;

    @Column(name = "kyc_doc_number", length = 50)
    private String kycDocNumber;

    @Lob
    @Column(name = "kyc_doc_image")
    private byte[] kycDocImage;

    public CompanyContactKyc() {
        super();
    }

    public CompanyContactKyc(String customerId,  String faxNo, String panCardNo,
                             String exciseNo, String tanNo, String salesNo,
                             String kycDocName, String kycDocNumber, byte[] kycDocImage) {
        this.customerId = customerId;
        
//        this.faxNo = faxNo;
//        this.panCardNo = panCardNo;
//        this.exciseNo = exciseNo;
//        this.tanNo = tanNo;
//        this.salesNo = salesNo;
        this.kycDocName = kycDocName;
        this.kycDocNumber = kycDocNumber;
        this.kycDocImage = kycDocImage;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

//    
//    public String getFaxNo() {
//        return faxNo;
//    }
//
//    public void setFaxNo(String faxNo) {
//        this.faxNo = faxNo;
//    }
//
//    public String getPanCardNo() {
//        return panCardNo;
//    }
//
//    public void setPanCardNo(String panCardNo) {
//        this.panCardNo = panCardNo;
//    }
//
//    public String getExciseNo() {
//        return exciseNo;
//    }
//
//    public void setExciseNo(String exciseNo) {
//        this.exciseNo = exciseNo;
//    }
//
//    public String getTanNo() {
//        return tanNo;
//    }
//
//    public void setTanNo(String tanNo) {
//        this.tanNo = tanNo;
//    }
//
//    public String getSalesNo() {
//        return salesNo;
//    }
//
//    public void setSalesNo(String salesNo) {
//        this.salesNo = salesNo;
//    }

    public String getKycDocName() {
        return kycDocName;
    }

    public void setKycDocName(String kycDocName) {
        this.kycDocName = kycDocName;
    }

    public String getKycDocNumber() {
        return kycDocNumber;
    }

    public void setKycDocNumber(String kycDocNumber) {
        this.kycDocNumber = kycDocNumber;
    }

    public byte[] getKycDocImage() {
        return kycDocImage;
    }

    public void setKycDocImage(byte[] kycDocImage) {
        this.kycDocImage = kycDocImage;
    }
}
