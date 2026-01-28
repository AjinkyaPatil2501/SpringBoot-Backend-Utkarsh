package com.utkarsh.core.dto;

public class BankDto {
    private String cbankCode;
    private String cbankName;
    
    public BankDto() {
		super();
	}
	public BankDto(String cbankCode, String cbankName) {
		super();
		this.cbankCode = cbankCode;
		this.cbankName = cbankName;
	}
	public String getCbankCode() { return cbankCode; }
    public void setCbankCode(String cbankCode) { this.cbankCode = cbankCode; }

    public String getCbankName() { return cbankName; }
    public void setCbankName(String cbankName) { this.cbankName = cbankName; }
    
    
}
