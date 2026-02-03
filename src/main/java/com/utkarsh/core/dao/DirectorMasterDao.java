package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.utkarsh.core.model.DepositMaster;
import com.utkarsh.core.model.DirectorMaster;

public interface DirectorMasterDao extends JpaRepository<DirectorMaster, Integer> {
  
	@Query(value = "SELECT  cdir_code , cdir_name  " + "FROM director_master ", nativeQuery = true)
	List<Object[]> fetchDirectorDetails();
	
	
	
}
