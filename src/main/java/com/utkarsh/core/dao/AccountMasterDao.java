package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.AccountMaster;
import java.util.Optional;

@Repository
public interface AccountMasterDao extends JpaRepository<AccountMaster, String> {

	// Find by account number (caccountNo is the @Id)
    @Query("SELECT a FROM AccountMaster a WHERE a.caccountNo = :accountNo")
    Optional<AccountMaster> findByAccountNo(@Param("accountNo") String accountNo);
    

	@Query(value = """
		    SELECT *
		    FROM account_master
		    WHERE caccount_no LIKE CONCAT('%', :branchId,  :glCode, '%')
		      AND RIGHT(caccount_no, 8) != '00000000'
		    LIMIT 50
		    """, nativeQuery = true)
		List<AccountMaster> findTop50ByGlCode( @Param("branchId") String branchId,@Param("glCode") String glCode);


    // 🔹 Search by Account Number
	@Query(value = """
		    SELECT *
		    FROM account_master
		    WHERE caccount_no LIKE CONCAT('%', :branchId,  :glCode, '%')
		      AND caccount_no LIKE CONCAT('%', :value, '%')
		      AND RIGHT(caccount_no, 8) != '00000000'
		    ORDER BY caccount_no
		    LIMIT 50
		    """, nativeQuery = true)
		List<AccountMaster> searchByAccountNumber(
				 @Param("branchId") String branchId,
		    @Param("glCode") String glCode,
		    @Param("value") String value
		);


    // 🔹 Search by Account Holder Name (first / middle / last / full)
	@Query(value = """
		    SELECT *
		    FROM account_master
		    WHERE caccount_no LIKE CONCAT('%', :branchId,  :glCode, '%')
		      AND LOWER(chead_shor) LIKE LOWER(CONCAT('%', :value, '%'))
		      AND RIGHT(caccount_no, 8) != '00000000'
		    ORDER BY chead_shor
		    LIMIT 50
		    """, nativeQuery = true)
		List<AccountMaster> searchByAccountName(
				 @Param("branchId") String branchId,
		    @Param("glCode") String glCode,
		    @Param("value") String value
		);


	@Query(value = """
		    SELECT caccount_no
		    FROM account_master
		    WHERE caccount_no LIKE CONCAT(:prefix, '%')
		    ORDER BY caccount_no DESC
		    LIMIT 1
			""", nativeQuery = true)
	String getLastAccountNo(@Param("prefix") String prefix);

}
