package com.utkarsh.core.dto;

public class CompanyContactKycDto {

//	private String customerId;
  
//    private String faxNo;
//    private String panCardNo;
//    private String exciseNo;
//    private String tanNo;
//    private String salesNo;
    private String kycDocName;
    private String kycDocNumber;
    private byte[] kycDocImage;

    public CompanyContactKycDto() {}

	
//	public String getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(String customerId) {
//		this.customerId = customerId;
//	}

	


	public CompanyContactKycDto(String faxNo, String panCardNo, String exciseNo, String tanNo, String salesNo,
		String kycDocName, String kycDocNumber, byte[] kycDocImage) {
	super();
//	this.faxNo = faxNo;
//	this.panCardNo = panCardNo;
//	this.exciseNo = exciseNo;
//	this.tanNo = tanNo;
//	this.salesNo = salesNo;
	this.kycDocName = kycDocName;
	this.kycDocNumber = kycDocNumber;
	this.kycDocImage = kycDocImage;
}

	
//
//	public String getFaxNo() {
//		return faxNo;
//	}
//
//	public void setFaxNo(String faxNo) {
//		this.faxNo = faxNo;
//	}
//
//	public String getPanCardNo() {
//		return panCardNo;
//	}
//
//	public void setPanCardNo(String panCardNo) {
//		this.panCardNo = panCardNo;
//	}
//
//	public String getExciseNo() {
//		return exciseNo;
//	}
//
//	public void setExciseNo(String exciseNo) {
//		this.exciseNo = exciseNo;
//	}
//
//	public String getTanNo() {
//		return tanNo;
//	}
//
//	public void setTanNo(String tanNo) {
//		this.tanNo = tanNo;
//	}
//
//	public String getSalesNo() {
//		return salesNo;
//	}
//
//	public void setSalesNo(String salesNo) {
//		this.salesNo = salesNo;
//	}

	public String getKycDocName() {
		return kycDocName;
	}

	public void setKycDocName(String kycDocName) {
		this.kycDocName = kycDocName;
	}

	public String getKycDocNumber() {
		return kycDocNumber;
	}

	public void setKycDocNumber(String kycDocNumber) {
		this.kycDocNumber = kycDocNumber;
	}

	public byte[] getKycDocImage() {
		return kycDocImage;
	}

	public void setKycDocImage(byte[] kycDocImage) {
		this.kycDocImage = kycDocImage;
	}
    
}
