package com.utkarsh.core.dao;

import java.math.BigDecimal;

import org.jspecify.annotations.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.DepositInterestRate;

@Repository
public interface DepositInterestRateDao extends JpaRepository<DepositInterestRate, String> {

	@Query(value = """
			SELECT nint_rate
			FROM deposit_interest_rate
			WHERE cgl_code = :glCode
			  AND cday_month = :dayOrMonth
			  AND :forTime BETWEEN cfr_month AND cto_month

			  AND dfr_date = (
			      SELECT MAX(dfr_date)
			      FROM deposit_interest_rate
			      WHERE cgl_code = :glCode
			  )
			""", nativeQuery = true) // AND :depositAmount BETWEEN nfr_amt AND nto_amt
	BigDecimal getInterest(String glCode, Integer forTime, String dayOrMonth); // BigDecimal depositAmount,

	@Query(value = """
			SELECT nint_rate
			FROM deposit_interest_rate
			WHERE cgl_code = :glCode
			  AND :depositAmount BETWEEN nfr_amt AND nto_amt
			ORDER BY dfr_date DESC
			LIMIT 1
			""", nativeQuery = true)
	@Nullable
	BigDecimal getSavingsInterestRate(@Param("glCode") String glCode, @Param("depositAmount") BigDecimal depositAmount);

}
