package com.utkarsh.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "bank_mst")
public class Bank {

	@Id @Column(name = "cbank_code", length = 3, nullable = false) 
	private String cbankCode;
	
	@Column(name = "cbank_name", length = 100, nullable = false)
	private String cbankName;

	public Bank(String cbankCode, String cbankName) {
		super();
		this.cbankCode = cbankCode;
		this.cbankName = cbankName;
	}

	public Bank() {
		super();
	}

	public String getCbankCode() {
		return cbankCode;
	}

	public void setCbankCode(String cbankCode) {
		this.cbankCode = cbankCode;
	}

	public String getCbankName() {
		return cbankName;
	}

	public void setCbankName(String cbankName) {
		this.cbankName = cbankName;
	}
	
	
}
