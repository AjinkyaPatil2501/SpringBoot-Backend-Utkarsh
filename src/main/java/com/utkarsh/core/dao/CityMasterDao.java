package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utkarsh.core.model.CityMaster;

public interface CityMasterDao extends JpaRepository<CityMaster, Integer>{

	
	@Query(value = "select ccity_name from citymast where ccity_code =:cityCode",nativeQuery = true)
	String findCityById(int cityCode);

}
