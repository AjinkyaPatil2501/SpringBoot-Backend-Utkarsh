package com.utkarsh.core.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "deposit_interest_rate")
public class DepositInterestRate {

    @Id
    @Column(name = "cgl_code", length = 6, nullable = false)
    private String cglCode;

    @Column(name = "dfr_date")
    private LocalDate dfrDate;

    @Column(name = "cfr_month", length = 5)
    private String cfrMonth;

    @Column(name = "cday_month", length = 1)
    private String cdayMonth;

    @Column(name = "nint_rate", precision = 10, scale = 2)
    private BigDecimal nintRate;

    @Column(name = "nfr_amt", precision = 14, scale = 2)
    private BigDecimal nfrAmt;

    @Column(name = "nto_amt", precision = 14, scale = 2)
    private BigDecimal ntoAmt;

    @Column(name = "cto_month", length = 5)
    private String ctoMonth;

    @Column(name = "Renewal_Flag", length = 1)
    private String renewalFlag;

	public DepositInterestRate() {
		super();
	}

	public DepositInterestRate(String cglCode, LocalDate dfrDate, String cfrMonth, String cdayMonth,
			BigDecimal nintRate, BigDecimal nfrAmt, BigDecimal ntoAmt, String ctoMonth, String renewalFlag) {
		super();
		this.cglCode = cglCode;
		this.dfrDate = dfrDate;
		this.cfrMonth = cfrMonth;
		this.cdayMonth = cdayMonth;
		this.nintRate = nintRate;
		this.nfrAmt = nfrAmt;
		this.ntoAmt = ntoAmt;
		this.ctoMonth = ctoMonth;
		this.renewalFlag = renewalFlag;
	}

	public String getCglCode() {
		return cglCode;
	}

	public void setCglCode(String cglCode) {
		this.cglCode = cglCode;
	}

	public LocalDate getDfrDate() {
		return dfrDate;
	}

	public void setDfrDate(LocalDate dfrDate) {
		this.dfrDate = dfrDate;
	}

	public String getCfrMonth() {
		return cfrMonth;
	}

	public void setCfrMonth(String cfrMonth) {
		this.cfrMonth = cfrMonth;
	}

	public String getCdayMonth() {
		return cdayMonth;
	}

	public void setCdayMonth(String cdayMonth) {
		this.cdayMonth = cdayMonth;
	}

	public BigDecimal getNintRate() {
		return nintRate;
	}

	public void setNintRate(BigDecimal nintRate) {
		this.nintRate = nintRate;
	}

	public BigDecimal getNfrAmt() {
		return nfrAmt;
	}

	public void setNfrAmt(BigDecimal nfrAmt) {
		this.nfrAmt = nfrAmt;
	}

	public BigDecimal getNtoAmt() {
		return ntoAmt;
	}

	public void setNtoAmt(BigDecimal ntoAmt) {
		this.ntoAmt = ntoAmt;
	}

	public String getCtoMonth() {
		return ctoMonth;
	}

	public void setCtoMonth(String ctoMonth) {
		this.ctoMonth = ctoMonth;
	}

	public String getRenewalFlag() {
		return renewalFlag;
	}

	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}
    
    
}
