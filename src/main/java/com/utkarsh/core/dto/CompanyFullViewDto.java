package com.utkarsh.core.dto;

import java.util.List;

public class CompanyFullViewDto {
	
	private CompanyCustomerDetailsDto companyDetails;
	private List<CompanyContactKycDto> companyContact;
	private List<CompanyPartnersDto> partners;
	
	public CompanyFullViewDto() {
		super();
	}

	public CompanyFullViewDto(CompanyCustomerDetailsDto companyDetails, List<CompanyContactKycDto> companyContact,
			List<CompanyPartnersDto> partners) {
		super();
		this.companyDetails = companyDetails;
		this.companyContact = companyContact;
		this.partners = partners;
	}

	public CompanyCustomerDetailsDto getCompanyDetails() {
		return companyDetails;
	}

	public void setCompanyDetails(CompanyCustomerDetailsDto companyDetails) {
		this.companyDetails = companyDetails;
	}

	public List<CompanyContactKycDto> getCompanyContact() {
		return companyContact;
	}

	public void setCompanyContact(List<CompanyContactKycDto> companyContact) {
		this.companyContact = companyContact;
	}

	public List<CompanyPartnersDto> getPartners() {
		return partners;
	}

	public void setPartners(List<CompanyPartnersDto> partners) {
		this.partners = partners;
	}
	
	

}
