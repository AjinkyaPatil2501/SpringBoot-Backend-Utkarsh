package com.utkarsh.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh.core.model.CompanyContactKyc;

public interface CompanyContactKycDao extends JpaRepository<CompanyContactKyc, String> {
	
	 @Modifying
	    @Transactional
	    @Query(value = """
	        INSERT INTO company_contact_kyc
	        (customer_id, kyc_doc_name, kyc_doc_number, kyc_doc_image)
	        VALUES (:customerId, :docName, :docNumber, :docImage)
	        """, nativeQuery = true)
	    void insertCompanyContactKyc(
	            @Param("customerId") String customerId,
	            @Param("docName") String docName,
	            @Param("docNumber") String docNumber,
	            @Param("docImage") byte[] docImage
	    );
	 
	 Optional<CompanyContactKyc> findByCustomerIdAndKycDocNumber(
		        String customerId,
		        String kycDocNumber
		    );

	 List<CompanyContactKyc> findByCustomerId(String customerId);
}
