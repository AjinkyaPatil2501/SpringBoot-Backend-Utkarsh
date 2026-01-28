package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh.core.model.CastMaster;

public interface CastMasterDao extends JpaRepository<CastMaster, String> {
   
}
