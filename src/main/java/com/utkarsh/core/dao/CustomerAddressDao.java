package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh.core.model.CustomerAddress;

public interface CustomerAddressDao extends JpaRepository<CustomerAddress, String> {
	
	 CustomerAddress findByCustomerId(String customerId);
}
