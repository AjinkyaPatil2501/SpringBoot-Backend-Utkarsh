package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utkarsh.core.model.SysCtrl;

public interface SysCtrlDao extends JpaRepository<SysCtrl, String>{

	@Query(value = "select clang from sysctrl" , nativeQuery = true)
	String getLanguage();

}
