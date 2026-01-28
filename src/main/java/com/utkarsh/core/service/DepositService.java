package com.utkarsh.core.service;



import java.util.List;

import org.jspecify.annotations.Nullable;

import com.utkarsh.core.dto.DepositDetailsDto;
import com.utkarsh.core.dto.PersonalInfoDto;
import com.utkarsh.core.model.Deposit;

public interface DepositService {

	@Nullable
	DepositDetailsDto allRequiredDetails();

	@Nullable
	String searchByCustomerId(String customerId);

	@Nullable
	PersonalInfoDto searchAddress(String customerId);

	@Nullable
	Object getAllAccounts();

	@Nullable
	List<Deposit> search(String searchBy, String searchValue, int limit);


}
