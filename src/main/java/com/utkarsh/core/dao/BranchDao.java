package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.core.model.Branch;

public interface BranchDao extends JpaRepository<Branch, String>{

	List<Branch> findByCbankCode(String cbankCode);
}
