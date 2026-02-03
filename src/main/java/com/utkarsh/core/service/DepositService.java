package com.utkarsh.core.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.jspecify.annotations.Nullable;

import com.utkarsh.core.dto.DepositAccountDetailsDto;
import com.utkarsh.core.dto.DepositAccountRequest;
import com.utkarsh.core.dto.DepositDTO;
import com.utkarsh.core.dto.DepositDetailsDto;
import com.utkarsh.core.dto.PersonalInfoDto;
import com.utkarsh.core.model.AccountMaster;

public interface DepositService {

	@Nullable
	DepositDetailsDto allRequiredDetails();

	@Nullable
	String searchByCustomerId(String customerId);

	@Nullable
	PersonalInfoDto searchAddress(String customerId);

	@Nullable
	LocalDate getStartDate(String branchId);

	@Nullable
	BigDecimal getInterest( String glCode, Integer forTime, String dayOrMonth);  //BigDecimal depositAmount,

	List<AccountMaster> searchAccounts(String branchId, String glCode, String searchBy, String searchValue, int limit);

	@Nullable
	BigDecimal getSavingsInterestRate(String glCode, String depositAmount);

	@Nullable
	BigDecimal getMaturityAmount(String glCode, String month, String days, String depositAmount, String frequency,
			String type, String interestRate);

	
	void createDepositAccount(DepositAccountRequest request);
	
	void updateDepositAccount(String accountNo, DepositAccountRequest request);
	DepositAccountDetailsDto getDepositByAccountNo(String accountNo);

	List<DepositDTO> search(String searchBy, String searchValue, int limit);

	List<DepositDTO> getAllAccounts();

}
