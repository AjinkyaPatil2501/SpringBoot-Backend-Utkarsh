package com.utkarsh.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh.core.dto.BankDto;
import com.utkarsh.core.dto.BranchDto;
import com.utkarsh.core.service.BankService;

@RestController
@RequestMapping("/bank/v1")
public class BankController {

	@Autowired
	BankService bankservice;
	
	@GetMapping("/banks")
	public List<BankDto> getBanks() {
		return bankservice.getAllBanks(); 
		}
	
	@GetMapping("/{bankCode}") 
	public List<BranchDto> getBranches(@PathVariable String bankCode) { 
		return bankservice.getBranchesByBank(bankCode); 
		}
}
