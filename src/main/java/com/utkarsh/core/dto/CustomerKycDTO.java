package com.utkarsh.core.dto;

public class CustomerKycDTO {

//	private Integer docId;
//    private String customerId;
    private String docName;
    private String docNumber;
    private byte[] docPhoto;

    public CustomerKycDTO() {}

	public CustomerKycDTO(Integer docId, String customerId, String docName, String docNumber, byte[] docPhoto) {
		super();
//		this.docId = docId;
//		this.customerId = customerId;
		this.docName = docName;
		this.docNumber = docNumber;
		this.docPhoto = docPhoto;
	}

//	public Integer getDocId() {
//		return docId;
//	}
//
//	public void setDocId(Integer docId) {
//		this.docId = docId;
//	}

//	public String getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(String customerId) {
//		this.customerId = customerId;
//	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public byte[] getDocPhoto() {
		return docPhoto;
	}

	public void setDocPhoto(byte[] docPhoto) {
		this.docPhoto = docPhoto;
	}
    
}
