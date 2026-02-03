package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh.core.model.GlParam;
import com.utkarsh.core.modelseralizable.GlParamId;

public interface GlParamDao extends JpaRepository<GlParam, GlParamId> {

	@Query(value = "SELECT cgl_code, chead_shor, cshort_cod " + "FROM gl_param " + "WHERE cgl_code LIKE '23%' "
			+ "GROUP BY cgl_code,chead_shor, cshort_cod", nativeQuery = true)
	List<Object[]> fetchLedgerDetails();

	@Query(value = "SELECT DISTINCT interest_type " + "FROM gl_param " + "WHERE cgl_code = :glCode "
			+ "AND interest_type IS NOT NULL " + "AND interest_type <> ''", nativeQuery = true)
	String getInterestType(@Param("glCode") String glCode);

	@Modifying
	@Transactional
	@Query(value = "UPDATE gl_param " + "SET clast_ac_n = :lastAccountNo " + "WHERE cbank_id = :bankId "
			+ "AND cbran_id = :branchId " + "AND cgl_code = :ledgerNo", nativeQuery = true)
	void updateLastAccountNo(@Param("lastAccountNo") String lastAccountNo, @Param("bankId") String bankId,
			@Param("branchId") String branchId, @Param("ledgerNo") String ledgerNo);
}