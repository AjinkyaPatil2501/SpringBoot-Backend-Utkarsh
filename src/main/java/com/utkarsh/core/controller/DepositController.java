package com.utkarsh.core.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh.core.dto.DepositDTO;
import com.utkarsh.core.dto.DepositDetailsDto;
import com.utkarsh.core.dto.PersonalInfoDto;
import com.utkarsh.core.model.Deposit;
import com.utkarsh.core.service.DepositService;

@RestController
@RequestMapping("/deposits/v1")
public class DepositController {

	@Autowired
	DepositService depositservice;

	@GetMapping("/alldetails")
	public ResponseEntity<DepositDetailsDto> allRequiredDetails() {
		return ResponseEntity.ok(depositservice.allRequiredDetails());
	}

	@GetMapping("/share")
	public ResponseEntity<String> searchCustomersShare(@RequestParam String customerId) {

		return ResponseEntity.ok(depositservice.searchByCustomerId(customerId));
	}
	
	@GetMapping("/address")
	public ResponseEntity<PersonalInfoDto> searchCustomerAddress(@RequestParam String customerId){
		return ResponseEntity.ok(depositservice.searchAddress(customerId));
	}

	// GET TOP 50 ACCOUNTS 
	@GetMapping("")
	public ResponseEntity<?> getAllAccounts() {
		return ResponseEntity.ok(depositservice.getAllAccounts());
	}
	
	@GetMapping("/search")
    public ResponseEntity<List<Deposit>> searchAccounts(
            @RequestParam String searchBy,
            @RequestParam String searchValue,
            @RequestParam(defaultValue = "50") int limit
    ) {
        return ResponseEntity.ok(depositservice.search(searchBy, searchValue, limit));
    }
}
