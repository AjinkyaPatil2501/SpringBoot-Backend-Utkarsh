package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.CustomerMaster;
import com.utkarsh.core.model.Deposit;

@Repository
public interface DepositDao extends JpaRepository<Deposit, String>{

	// 🔹 Search by ID
    @Query(value = """
        SELECT * FROM deposit 
        WHERE caccount_no LIKE CONCAT('%', :value, '%') 
        ORDER BY caccount_no 
        LIMIT 50
        """, nativeQuery = true)
	List<Deposit> searchByAccNo(@Param("value") String searchValue);

	 
	 
	    @Query(value = """
        SELECT * FROM deposit 
        WHERE LOWER(acc_name)
        LIKE LOWER(CONCAT('%', :value, '%'))
        ORDER BY acc_name
        LIMIT 50
        """, nativeQuery = true)
	List<Deposit> searchByAccHolderName(@Param("value") String searchValue);
	
	
}
