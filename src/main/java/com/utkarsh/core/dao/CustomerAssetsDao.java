package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh.core.model.CustomerAssets;

public interface CustomerAssetsDao extends JpaRepository<CustomerAssets, Integer> {

	void deleteByCustomerId(String customerId);
	
	 List<CustomerAssets> findByCustomerId(String customerId);

	 CustomerAssets findByCustomerIdAndAssetName(String customerId, String assetName);
}
