package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utkarsh.core.model.GlParam;
import com.utkarsh.core.modelseralizable.GlParamId;

public interface GlParamDao extends JpaRepository<GlParam, GlParamId> {

	@Query(value = "SELECT cgl_code, chead_shor, cshort_cod " + "FROM gl_param " + "WHERE cgl_code LIKE '23%' "
			+ "GROUP BY cgl_code,chead_shor, cshort_cod", nativeQuery = true)
	List<Object[]> fetchLedgerDetails();

}
