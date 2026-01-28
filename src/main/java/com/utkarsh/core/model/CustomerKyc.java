package com.utkarsh.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_kyc")
public class CustomerKyc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_id")
    private Integer docId;

    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Column(name = "doc_name", length = 100, nullable = false)
    private String docName;

    @Column(name = "doc_number", length = 50)
    private String docNumber;

    @Lob
    @Column(name = "doc_photo")
    private byte[] docPhoto;

    public CustomerKyc() {
        super();
    }

    public CustomerKyc(Integer docId, String customerId, String docName, String docNumber, byte[] docPhoto) {
        this.docId = docId;
        this.customerId = customerId;
        this.docName = docName;
        this.docNumber = docNumber;
        this.docPhoto = docPhoto;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public byte[] getDocPhoto() {
        return docPhoto;
    }

    public void setDocPhoto(byte[] docPhoto) {
        this.docPhoto = docPhoto;
    }
}
