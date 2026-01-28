package com.utkarsh.core.dto;

import java.util.List;

public class CustomerUpdateRequest {

	private int userId;
	private int officerId;
	private String type;
	private CustomerMasterDto master;
	private CustomerAddressDto address;
	private List<CustomerKycDTO> kyc;
	private List<CustomerAssetsDto> assets;
	private CompanyCustomerDetailsDto companyDetails;
	private List<CompanyContactKycDto> companyContact;
	private List<CompanyPartnersDto> partners;
	private CustomerOccupationDto occupation;

	public CustomerUpdateRequest() {
	}


	public CustomerUpdateRequest(int userId, int officerId, String type, CustomerMasterDto master,
			CustomerAddressDto address, List<CustomerKycDTO> kyc, List<CustomerAssetsDto> assets,
			CompanyCustomerDetailsDto companyDetails, List<CompanyContactKycDto> companyContact,
			List<CompanyPartnersDto> partners, CustomerOccupationDto occupation) {
		super();
		this.userId = userId;
		this.officerId = officerId;
		this.type = type;
		this.master = master;
		this.address = address;
		this.kyc = kyc;
		this.assets = assets;
		this.companyDetails = companyDetails;
		this.companyContact = companyContact;
		this.partners = partners;
		this.occupation = occupation;
	}


	public CustomerOccupationDto getOccupation() {
		return occupation;
	}


	public void setOccupation(CustomerOccupationDto occupation) {
		this.occupation = occupation;
	}


	public int getOfficerId() {
		return officerId;
	}

	public void setOfficerId(int officerId) {
		this.officerId = officerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CustomerMasterDto getMaster() {
		return master;
	}

	public void setMaster(CustomerMasterDto master) {
		this.master = master;
	}

	public CustomerAddressDto getAddress() {
		return address;
	}

	public void setAddress(CustomerAddressDto address) {
		this.address = address;
	}

	public List<CustomerKycDTO> getKyc() {
		return kyc;
	}

	public void setKyc(List<CustomerKycDTO> kyc) {
		this.kyc = kyc;
	}

	public List<CustomerAssetsDto> getAssets() {
		return assets;
	}

	public void setAssets(List<CustomerAssetsDto> assets) {
		this.assets = assets;
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
