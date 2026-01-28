package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.core.model.CountryMaster;

public interface CountryMasterDao extends JpaRepository<CountryMaster, String>{

}
