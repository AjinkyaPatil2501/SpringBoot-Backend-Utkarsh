package com.utkarsh.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh.core.model.CompanyPartners;

public interface CompanyPartnersDao extends JpaRepository<CompanyPartners, String> {

	void deleteByCustomerId(String customerId);
	
	@Modifying
    @Transactional
    @Query(value = """
        INSERT INTO company_partners
        (partner_id, customer_id, partner_name, pan_no, mobile_no)
        VALUES (:partnerId, :customerId, :partnerName, :panNo, :mobileNo)
        """, nativeQuery = true)
    void insertPartners(
            @Param("partnerId") String partnerId,
            @Param("customerId") String customerId,
            @Param("partnerName") String partnerName,
            @Param("panNo") String panNo,
            @Param("mobileNo") String mobileNo
    );
	 Optional<CompanyPartners> findByCustomerIdAndPartnerId(
		        String customerId,
		        String partnerId
		    );

	 List<CompanyPartners> findByCustomerId(String customerId);
}
