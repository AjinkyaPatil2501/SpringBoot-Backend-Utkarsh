package com.utkarsh.core.service;

import java.util.List;
import com.utkarsh.core.dto.BankDto;
import com.utkarsh.core.dto.BranchDto;

public interface BankService {

	List<BankDto> getAllBanks();

	List<BranchDto> getBranchesByBank(String bankCode);
}
