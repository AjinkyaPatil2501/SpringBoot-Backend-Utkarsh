package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh.core.model.CustomerKyc;

public interface CustomerKycDao extends JpaRepository<CustomerKyc, Integer> {

	void deleteByCustomerId(String customerId);
	
	List<CustomerKyc> findByCustomerId(String customerId);

	CustomerKyc findByCustomerIdAndDocNumber(String customerId, String docNumber);

	void deleteByCustomerIdAndDocNumber(String customerId, String docNumber);
	}
