package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.core.model.CustomerOccupation;

public interface CustomerOccupationDao extends JpaRepository<CustomerOccupation, Integer>{

	CustomerOccupation findByCustomerId(String customerId);
}
