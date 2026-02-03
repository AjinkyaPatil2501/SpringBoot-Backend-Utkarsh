package com.utkarsh.core.modelseralizable;

import java.io.Serializable;

@SuppressWarnings("unused")
public class JointCustomerMasterId implements Serializable {

	private static final long serialVersionUID = 1L;
    private String customerId;
    private String caccountNo;

    public JointCustomerMasterId() {}

    public JointCustomerMasterId(String customerId, String caccountNo) {
        this.customerId = customerId;
        this.caccountNo = caccountNo;
    }

    // equals & hashCode (VERY IMPORTANT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JointCustomerMasterId)) return false;
        JointCustomerMasterId that = (JointCustomerMasterId) o;
        return customerId.equals(that.customerId) &&
               caccountNo.equals(that.caccountNo);
    }

    @Override
    public int hashCode() {
        return customerId.hashCode() + caccountNo.hashCode();
    }
}

