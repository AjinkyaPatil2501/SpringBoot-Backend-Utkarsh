package com.utkarsh.core.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.utkarsh.core.model.JointCustomerMaster;
import com.utkarsh.core.modelseralizable.JointCustomerMasterId;

@Repository
public interface JointCustomerMasterDao extends JpaRepository<JointCustomerMaster, JointCustomerMasterId>{

	@Query("SELECT j FROM JointCustomerMaster j WHERE j.caccountNo = :accountNo")
    List<JointCustomerMaster> findByAccountNo(@Param("accountNo") String accountNo);
    
    @Modifying
    @Transactional
    @Query("DELETE FROM JointCustomerMaster j WHERE j.caccountNo = :accountNo")
    void deleteByAccountNo(@Param("accountNo") String accountNo);
	

}
