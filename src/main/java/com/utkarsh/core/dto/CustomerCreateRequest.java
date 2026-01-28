package com.utkarsh.core.dto;

import java.util.List;

public class CustomerCreateRequest {
	
	 private CustomerMasterDto master;
	    private CustomerAddressDto address;
	    private List<CustomerKycDTO> kyc;
	    private List<CustomerAssetsDto> assets;
	    public CustomerOccupationDto occupation;
	    public CustomerCreateRequest() {}

	    
		public CustomerCreateRequest(CustomerMasterDto master, CustomerAddressDto address, List<CustomerKycDTO> kyc,
				List<CustomerAssetsDto> assets, CustomerOccupationDto occupation) {
			super();
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
