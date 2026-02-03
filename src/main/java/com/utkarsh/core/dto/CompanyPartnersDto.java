package com.utkarsh.core.dto;

public class CompanyPartnersDto {

	  private String partnerId;
	    private String customerId;
	    private String partnerName;
	    private String panNo;
	    private String mobileNo;
//	    private Boolean hasIndividualAccount;

	    public CompanyPartnersDto() {}

		public CompanyPartnersDto(String partnerId, String customerId, String partnerName, String panNo,
				String mobileNo, Boolean hasIndividualAccount) {
			super();
			this.partnerId = partnerId;
			this.customerId = customerId;
			this.partnerName = partnerName;
			this.panNo = panNo;
			this.mobileNo = mobileNo;
//			this.hasIndividualAccount = hasIndividualAccount;
		}

		public String getPartnerId() {
			return partnerId;
		}

		public void setPartnerId(String partnerId) {
			this.partnerId = partnerId;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getPartnerName() {
			return partnerName;
		}

		public void setPartnerName(String partnerName) {
			this.partnerName = partnerName;
		}

		public String getPanNo() {
			return panNo;
		}

		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}

		public String getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}

//		public Boolean getHasIndividualAccount() {
//			return hasIndividualAccount;
//		}
//
//		public void setHasIndividualAccount(Boolean hasIndividualAccount) {
//			this.hasIndividualAccount = hasIndividualAccount;
//		}
	    
}
