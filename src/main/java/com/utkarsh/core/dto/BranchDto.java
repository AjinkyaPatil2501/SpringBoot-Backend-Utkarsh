package com.utkarsh.core.dto;

public class BranchDto {
    private String cbranCode;
    private String cbranName;
    private String cbankCode;
	public BranchDto(String cbranCode, String cbranName, String cbankCode) {
		super();
		this.cbranCode = cbranCode;
		this.cbranName = cbranName;
		this.cbankCode = cbankCode;
	}
	public BranchDto() {
		super();
	}
	public String getCbranCode() {
		return cbranCode;
	}
	public void setCbranCode(String cbranCode) {
		this.cbranCode = cbranCode;
	}
	public String getCbranName() {
		return cbranName;
	}
	public void setCbranName(String cbranName) {
		this.cbranName = cbranName;
	}
	public String getCbankCode() {
		return cbankCode;
	}
	public void setCbankCode(String cbankCode) {
		this.cbankCode = cbankCode;
	}

    
}

