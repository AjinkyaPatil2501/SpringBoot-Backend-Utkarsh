package com.utkarsh.core.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.DepositMaster;

@Repository
public interface DepositDao extends JpaRepository<DepositMaster, String>{

	// Find by account number (caccountNo is the @Id)
    @Query("SELECT d FROM DepositMaster d WHERE d.caccountNo = :accountNo")
    Optional<DepositMaster> findByAccountNo(@Param("accountNo") String accountNo);
    	
 // 🔹 Search by ID
    @Query(value = """
        SELECT * FROM deposit 
        WHERE caccount_no LIKE CONCAT('%', :value, '%') 
        ORDER BY caccount_no 
        LIMIT 50
        """, nativeQuery = true)
	List<DepositMaster> searchByAccNo(@Param("value") String searchValue);

	 
	 
	    @Query(value = """
        SELECT * FROM deposit 
        WHERE LOWER(acc_name)
        LIKE LOWER(CONCAT('%', :value, '%'))
        ORDER BY acc_name
        LIMIT 50
        """, nativeQuery = true)
	List<DepositMaster> searchByAccHolderName(@Param("value") String searchValue);
    
}
