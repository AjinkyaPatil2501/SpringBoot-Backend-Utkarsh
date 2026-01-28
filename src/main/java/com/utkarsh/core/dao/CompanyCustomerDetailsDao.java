package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.utkarsh.core.model.CompanyCustomerDetails;

public interface CompanyCustomerDetailsDao extends JpaRepository<CompanyCustomerDetails, String> {

	CompanyCustomerDetails findTopByOrderByCustomerIdDesc();
	
	CompanyCustomerDetails findByCustomerId(String customerId);
	
	@Query(value = """
		    SELECT * FROM company_customer_details
		    WHERE LOWER(company_name)
		    LIKE LOWER(CONCAT('%', :value, '%'))
		    ORDER BY company_name
		    LIMIT 50
		    """, nativeQuery = true)
		List<CompanyCustomerDetails> searchByCompanyName(@Param("value") String value);

	@Query(value = """
		    SELECT * FROM company_customer_details
		    WHERE customer_id LIKE CONCAT('%', :value, '%')
		    ORDER BY customer_id
		    LIMIT 50
		    """, nativeQuery = true)
		List<CompanyCustomerDetails> searchByCompanyId(@Param("value") String value);
	
	@Query(
		    value = "SELECT * FROM company_customer_details ORDER BY customer_id",
		    nativeQuery = true
		)
		List<CompanyCustomerDetails> findTopCompanies(PageRequest pageRequest);


}
