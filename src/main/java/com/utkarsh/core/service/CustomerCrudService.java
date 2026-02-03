package com.utkarsh.core.service;

import java.util.List;

import org.jspecify.annotations.Nullable;

import com.utkarsh.core.dto.CompanyCreateRequestDTO;
import com.utkarsh.core.dto.CompanyFullViewDto;
import com.utkarsh.core.dto.CustomerCreateRequest;
import com.utkarsh.core.dto.CustomerFullViewDto;
import com.utkarsh.core.dto.CustomerUpdateRequest;
import com.utkarsh.core.dto.PersonalDetailsDto;
import com.utkarsh.core.model.CompanyCustomerDetails;
import com.utkarsh.core.model.CustomerMaster;

public interface CustomerCrudService {

	@Nullable
	Object createIndividualCustomer(CustomerCreateRequest request);

	@Nullable
	Object updateCustomer(String customerId, CustomerUpdateRequest request);

	@Nullable
	Object getAllCustomers();

	@Nullable
	Object createCompanyCustomer(CompanyCreateRequestDTO request);

	@Nullable
	CustomerFullViewDto getFullCustomer(String customerId);

	@Nullable
	Object getAllCompanys();

	CompanyFullViewDto getFullCompanyData(String customerId);

	void deleteKycDocument(String customerId, String docNumber);

	@Nullable
	PersonalDetailsDto getPersonalDetails();

	List<CustomerMaster> search(String searchBy, String searchValue, int limit);

	
	@Nullable
	List<CompanyCustomerDetails> searchCompany(String searchBy, String searchValue, int limit);

	@Nullable
	List<CompanyCustomerDetails> getTopCompanies(int limit);

}
