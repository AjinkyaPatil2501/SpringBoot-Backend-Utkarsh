package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.ShareMaster;
import com.utkarsh.core.modelseralizable.ShareMasterId;

@Repository
public interface ShareMasterDao extends JpaRepository<ShareMaster, ShareMasterId> {

	@Query(value = "SELECT cname, caccount_no FROM share_master LIMIT 50", nativeQuery = true)
	List<Object[]> fetchSharesDetails();

	@Query(value = """
			SELECT cname, caccount_no
			FROM share_master
			WHERE LOWER(cname) LIKE LOWER(CONCAT('%', :search, '%'))
			LIMIT 50
			""", nativeQuery = true)
	List<Object[]> searchSharesByName(@Param("search") String search);

	@Query(value = "SELECT caccount_no FROM share_master WHERE cust_id = :customerId", nativeQuery = true)
	String findAccountNoByCustomerId(@Param("customerId") String customerId);

}
