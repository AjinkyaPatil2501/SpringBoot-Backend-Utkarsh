package com.utkarsh.core.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utkarsh.core.model.Branch;

public interface BranchDao extends JpaRepository<Branch, String>{

	List<Branch> findByCbankCode(String cbankCode);

	@Query(value = "select dcurrent_d from bran_mst where cbran_code =:branchId",nativeQuery = true)
	LocalDate getStartDate(String branchId);

}
