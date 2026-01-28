package com.utkarsh.core.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh.core.model.OccupationMaster;

public interface OccupationMasterDao extends JpaRepository<OccupationMaster, Integer> {
    
}
