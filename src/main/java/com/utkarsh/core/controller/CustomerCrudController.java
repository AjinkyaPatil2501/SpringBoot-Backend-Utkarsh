package com.utkarsh.core.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh.core.dto.CompanyCreateRequestDTO;
import com.utkarsh.core.dto.CompanyFullViewDto;
import com.utkarsh.core.dto.CustomerCreateRequest;
import com.utkarsh.core.dto.CustomerFullViewDto;
import com.utkarsh.core.dto.CustomerUpdateRequest;
import com.utkarsh.core.dto.PersonalDetailsDto;
import com.utkarsh.core.model.CompanyCustomerDetails;
import com.utkarsh.core.model.CustomerMaster;
import com.utkarsh.core.service.CustomerCrudService;

@RestController
@RequestMapping("/customers/v1")
public class CustomerCrudController {

	@Autowired
	CustomerCrudService customercrudsevice;

	// CREATE CUSTOMER
	@PostMapping("/create/individual")
	public ResponseEntity<?> createIndividualCustomer(@RequestBody CustomerCreateRequest request) {

		return ResponseEntity.ok(Map.of("message", customercrudsevice.createIndividualCustomer(request)));
	}

	@PostMapping("/create/company")
	public ResponseEntity<?> createCompanyCustomer(@RequestBody CompanyCreateRequestDTO request) {

		return ResponseEntity.ok(Map.of("message", customercrudsevice.createCompanyCustomer(request)));
	}

	// UPDATE CUSTOMER
	@PatchMapping("/update/{customerId}")
	public ResponseEntity<?> updateCustomer(@PathVariable String customerId,
			@RequestBody CustomerUpdateRequest request) {

		return ResponseEntity.ok(Map.of("message", customercrudsevice.updateCustomer(customerId, request)));
	}


	// GET ALL CUSTOMERS
	@GetMapping("")
	public ResponseEntity<?> getAllCustomers() {
		return ResponseEntity.ok(customercrudsevice.getAllCustomers());
	}

	   @GetMapping("/search")
	    public ResponseEntity<List<CustomerMaster>> searchCustomers(
	            @RequestParam String searchBy,
	            @RequestParam String searchValue,
	            @RequestParam(defaultValue = "50") int limit
	    ) {
	        return ResponseEntity.ok(customercrudsevice.search(searchBy, searchValue, limit));
	    }
	   
	   
	@GetMapping("/fullCustomer/{customerId}")
	public ResponseEntity<CustomerFullViewDto> getFullCustomer(@PathVariable String customerId) {

		return ResponseEntity.ok(customercrudsevice.getFullCustomer(customerId));
	}

	// GET ALL COMPANYS
	@GetMapping("/fullCompany")
	public ResponseEntity<?> getAllCompanys() {

		return ResponseEntity.ok(customercrudsevice.getAllCompanys());
	}

	@GetMapping("/fullCompany/{customerId}")
	public ResponseEntity<CompanyFullViewDto> getFullCompanyData(@PathVariable String customerId) {
		return ResponseEntity.ok(customercrudsevice.getFullCompanyData(customerId));
	}


	@GetMapping("/company/search")
	public ResponseEntity<List<CompanyCustomerDetails>> searchCompanies(
	        @RequestParam String searchBy,
	        @RequestParam String searchValue,
	        @RequestParam(defaultValue = "50") int limit
	) {
	    return ResponseEntity.ok(customercrudsevice.searchCompany(searchBy, searchValue, limit));
	}

	@GetMapping("/company")
	public ResponseEntity<List<CompanyCustomerDetails>> getCompanies(
	        @RequestParam(defaultValue = "50") int limit
	) {
	    List<CompanyCustomerDetails> list =
	    		customercrudsevice.getTopCompanies(limit);

	    return ResponseEntity.ok(list); // ✅ even if empty
	}
	
	@DeleteMapping("/kyc")
	public ResponseEntity<?> deleteKycDocument(@RequestParam String customerId, @RequestParam String docNumber) {

		customercrudsevice.deleteKycDocument(customerId, docNumber);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/personaldetails")
	public ResponseEntity<PersonalDetailsDto> getPersonalDetails() {
		return ResponseEntity.ok(customercrudsevice.getPersonalDetails());
	}

}
