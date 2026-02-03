package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh.core.model.ReligionMaster;

public interface ReligionMasterDao extends JpaRepository<ReligionMaster, String> {
    
}
