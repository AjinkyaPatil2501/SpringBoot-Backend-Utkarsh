package com.utkarsh.core.dto;

import java.util.List;

public class CustomerFullViewDto {
	
	@Override
	public String toString() {
		return "CustomerFullViewDto [customerType=" + customerType + ", master=" + master + ", address=" + address
				+ ", kyc=" + kyc + ", assets=" + assets + ", occupation=" + occupation + "]";
	}

	private String customerType;
	
//	private String customerId;

    private CustomerMasterDto master;

    private CustomerAddressDto address;

    private List<CustomerKycDTO> kyc;

    private List<CustomerAssetsDto> assets;
    
    private CustomerOccupationDto occupation;

    // Only for Company customers
   
	
    public CustomerFullViewDto() {}
	

	public CustomerFullViewDto(String customerType, CustomerMasterDto master, CustomerAddressDto address,
			List<CustomerKycDTO> kyc, List<CustomerAssetsDto> assets, CustomerOccupationDto occupation) {
		super();
		this.customerType = customerType;
		this.master = master;
		this.address = address;
		this.kyc = kyc;
		this.assets = assets;
		this.occupation = occupation;
		
	}


	public CustomerOccupationDto getOccupation() {
		return occupation;
	}

	public void setOccupation(CustomerOccupationDto occupation) {
		this.occupation = occupation;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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

	
}
