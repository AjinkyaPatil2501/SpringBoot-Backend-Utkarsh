package com.utkarsh.core.serviceimpl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.utkarsh.core.dao.BankDao;
import com.utkarsh.core.dao.BranchDao;
import com.utkarsh.core.dto.BankDto;
import com.utkarsh.core.dto.BranchDto;
import com.utkarsh.core.service.BankService;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	BankDao bankdao;
	
	@Autowired
	BranchDao branchdao;
	
	@Override public List<BankDto> getAllBanks() {
		return bankdao.findAll().stream() 
				.map(bank -> {
					BankDto dto = new BankDto(); 
					dto.setCbankCode(bank.getCbankCode()); 
					dto.setCbankName(bank.getCbankName()); 
					return dto; 
					})
				.collect(Collectors.toList());
		}

	@Override
	public List<BranchDto> getBranchesByBank(String cbankCode) {
		return branchdao.findByCbankCode(cbankCode).stream() 
				.map(branch -> { 
					BranchDto dto = new BranchDto(); 
					dto.setCbranCode(branch.getCbranCode()); 
					dto.setCbranName(branch.getCbranName()); 
					dto.setCbankCode(branch.getCbankCode()); 
					return dto; 
					}) 
				.collect(Collectors.toList());
	}
}
