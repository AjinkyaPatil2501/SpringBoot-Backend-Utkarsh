package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.utkarsh.core.model.AgentMaster;
import com.utkarsh.core.modelseralizable.AgentMasterId;

public interface AgentMasterDao extends JpaRepository<AgentMaster, AgentMasterId> {

	@Query(value = "SELECT  chead_dtl, caccount_no " + "FROM agent_master ", nativeQuery = true)
	List<Object[]> fetchAgentDetails();

}
