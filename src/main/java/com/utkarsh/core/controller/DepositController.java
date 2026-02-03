package com.utkarsh.core.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh.core.dto.DepositAccountDetailsDto;
import com.utkarsh.core.dto.DepositAccountRequest;
import com.utkarsh.core.dto.DepositDTO;
import com.utkarsh.core.dto.DepositDetailsDto;
import com.utkarsh.core.dto.PersonalInfoDto;
import com.utkarsh.core.model.AccountMaster;
import com.utkarsh.core.service.DepositService;

@RestController
@RequestMapping("/deposite/v1")
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
	public ResponseEntity<PersonalInfoDto> searchCustomerAddress(@RequestParam String customerId) {
		return ResponseEntity.ok(depositservice.searchAddress(customerId));
	}

	@GetMapping("/startdate")
	public ResponseEntity<LocalDate> getStartDate(@RequestParam String branchId) {
		return ResponseEntity.ok(depositservice.getStartDate(branchId));
	}

	@GetMapping("/interest")
	public ResponseEntity<BigDecimal> getInterest(@RequestParam String glCode, // @RequestParam BigDecimal
																				// depositAmount,
			@RequestParam Integer forTime, @RequestParam String dayOrMonth) {

		return ResponseEntity.ok(depositservice.getInterest(glCode, forTime, dayOrMonth)); // depositAmount,
	}

	@GetMapping("/accountsforglcode")
	public List<AccountMaster> searchAccounts(@RequestParam String branchId, @RequestParam String glCode,
			@RequestParam(required = false) String searchBy, @RequestParam(required = false) String searchValue,
			@RequestParam(defaultValue = "50") int limit) {

		return depositservice.searchAccounts(branchId, glCode, searchBy, searchValue, limit);
	}

	@GetMapping("/savingsrate")
	public ResponseEntity<BigDecimal> getSavingsInterestRate(@RequestParam String glCode,
			@RequestParam String depositAmount) {
		return ResponseEntity.ok(depositservice.getSavingsInterestRate(glCode, depositAmount));
	}

	@GetMapping("/maturityamount")
	public ResponseEntity<BigDecimal> getMaturityAmount(@RequestParam String glCode, @RequestParam String month,
			@RequestParam String days, @RequestParam String depositAmount, @RequestParam String frequency,
			@RequestParam String type, @RequestParam String interestRate) {
		return ResponseEntity.ok(
				depositservice.getMaturityAmount(glCode, month, days, depositAmount, frequency, type, interestRate));
	}

	@PostMapping("/create")
	public ResponseEntity<?> createDepositAccount(@RequestBody DepositAccountRequest request) {
		try {
			System.out.println("-------- in Create Deposit -----------------");
			depositservice.createDepositAccount(request);
			return ResponseEntity.ok(Map.of("status", "SUCCESS", "message", "Deposit account created successfully"));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("status", "FAILED", "message",
					e.getMessage() != null ? e.getMessage() : "Internal server error"));

		}
	}

	@PutMapping("/update/{accountNo}")
	public ResponseEntity<?> updateDepositAccount(@PathVariable String accountNo,
			@RequestBody DepositAccountRequest request) {
		try {
			System.out.println("-------- Updating Deposit Account: " + accountNo + " -----------------");
			depositservice.updateDepositAccount(accountNo, request);
			return ResponseEntity.ok(Map.of("status", "SUCCESS", "message", "Deposit account updated successfully"));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("status", "FAILED", "message",
					e.getMessage() != null ? e.getMessage() : "Account not found"));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("status", "FAILED", "message",
					e.getMessage() != null ? e.getMessage() : "Internal server error"));
		}
	}

	@GetMapping("/account/{accountNo}")
	public ResponseEntity<?> getDepositByAccountNo(@PathVariable String accountNo) {
		try {
			DepositAccountDetailsDto deposit = depositservice.getDepositByAccountNo(accountNo);
			if (deposit == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body(Map.of("status", "FAILED", "message", "Deposit account not found"));
			}
			return ResponseEntity.ok(deposit);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Map.of("status", "FAILED", "message",
					e.getMessage() != null ? e.getMessage() : "Internal server error"));
		}
	}
	
	// GET TOP 50 ACCOUNTS 
		@GetMapping("")
		public ResponseEntity<?> getAllAccounts() {
			return ResponseEntity.ok(depositservice.getAllAccounts());
		}
		
		@GetMapping("/search")
	    public ResponseEntity<List<DepositDTO>> searchAccounts(
	            @RequestParam String searchBy,
	            @RequestParam String searchValue,
	            @RequestParam(defaultValue = "50") int limit
	    ) {
	        return ResponseEntity.ok(depositservice.search(searchBy, searchValue, limit));
	    }
}
