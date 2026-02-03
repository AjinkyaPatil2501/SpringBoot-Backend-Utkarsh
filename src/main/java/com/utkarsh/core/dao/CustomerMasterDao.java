package com.utkarsh.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.utkarsh.core.model.CustomerMaster;

public interface CustomerMasterDao extends JpaRepository<CustomerMaster, String> {

	List<CustomerMaster> findByFirstNameContainingIgnoreCase(String firstName);

	List<CustomerMaster> findByLastNameContainingIgnoreCase(String lastName);

	CustomerMaster findTopByOrderByCustomerIdDesc();

	Optional<CustomerMaster> findByCustomerId(String customerId);
	
	   // 🔹 Search by Name (any part, partial/full)
    @Query(value = """
        SELECT * FROM customer_master 
        WHERE LOWER(CONCAT_WS(' ', IFNULL(first_name,''), IFNULL(middle_name,''), IFNULL(last_name,'')))
        LIKE LOWER(CONCAT('%', :value, '%'))
        ORDER BY first_name
        LIMIT 50
        """, nativeQuery = true)
    List<CustomerMaster> searchByName(@Param("value") String value);

    // 🔹 Search by ID
    @Query(value = """
        SELECT * FROM customer_master 
        WHERE customer_id LIKE CONCAT('%', :value, '%') 
        ORDER BY customer_id 
        LIMIT 50
        """, nativeQuery = true)
    List<CustomerMaster> searchById(@Param("value") String value);
}
