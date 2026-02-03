package com.utkarsh.core.model;

import com.utkarsh.core.modelseralizable.JointCustomerMasterId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "joint_customer_master")
@IdClass(JointCustomerMasterId.class)
public class JointCustomerMaster {

    @Id
    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

    @Id
    @Column(name = "caccount_no", length = 20, nullable = false)
    private String caccountNo;

    // Constructors
    public JointCustomerMaster() {}

    public JointCustomerMaster(String customerId, String caccountNo) {
        this.customerId = customerId;
        this.caccountNo = caccountNo;
    }

    // Getters & Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCaccountNo() {
        return caccountNo;
    }

    public void setCaccountNo(String caccountNo) {
        this.caccountNo = caccountNo;
    }
}