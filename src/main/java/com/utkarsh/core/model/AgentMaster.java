package com.utkarsh.core.model;

import java.math.BigDecimal;

import com.utkarsh.core.modelseralizable.AgentMasterId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "agent_master")
@IdClass(AgentMasterId.class)
public class AgentMaster {

    @Id @Column(name = "chead_dtl", length = 60, nullable = false)
    private String cheadDtl;

    @Id @Column(name = "cadd1", length = 30, nullable = false)
    private String cadd1;

    @Id @Column(name = "ccityc", length = 20, nullable = false)
    private String ccityc;

    @Id @Column(name = "cphone", length = 15, nullable = false)
    private String cphone;

    @Id @Column(name = "ncomm", precision = 10, scale = 2, nullable = false)
    private BigDecimal ncomm;

    @Id @Column(name = "tr_gl", length = 6, nullable = false)
    private String trGl;

    @Id @Column(name = "tr_sl", length = 6, nullable = false)
    private String trSl;

    @Id @Column(name = "sec_gl", length = 6, nullable = false)
    private String secGl;

    @Id @Column(name = "sec_sl", length = 6, nullable = false)
    private String secSl;

    @Id @Column(name = "sec_amt", precision = 4, scale = 2, nullable = false)
    private BigDecimal secAmt;

    @Id @Column(name = "ccityn", length = 45, nullable = false)
    private String ccityn;

    @Id @Column(name = "caccount_no", length = 20, nullable = false)
    private String caccountNo;
    
    

	public AgentMaster(String cheadDtl, String cadd1, String ccityc, String cphone, BigDecimal ncomm, String trGl,
			String trSl, String secGl, String secSl, BigDecimal secAmt, String ccityn, String caccountNo) {
		super();
		this.cheadDtl = cheadDtl;
		this.cadd1 = cadd1;
		this.ccityc = ccityc;
		this.cphone = cphone;
		this.ncomm = ncomm;
		this.trGl = trGl;
		this.trSl = trSl;
		this.secGl = secGl;
		this.secSl = secSl;
		this.secAmt = secAmt;
		this.ccityn = ccityn;
		this.caccountNo = caccountNo;
	}

	public AgentMaster() {
		super();
	}

	public String getCheadDtl() {
		return cheadDtl;
	}

	public void setCheadDtl(String cheadDtl) {
		this.cheadDtl = cheadDtl;
	}

	public String getCadd1() {
		return cadd1;
	}

	public void setCadd1(String cadd1) {
		this.cadd1 = cadd1;
	}

	public String getCcityc() {
		return ccityc;
	}

	public void setCcityc(String ccityc) {
		this.ccityc = ccityc;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public BigDecimal getNcomm() {
		return ncomm;
	}

	public void setNcomm(BigDecimal ncomm) {
		this.ncomm = ncomm;
	}

	public String getTrGl() {
		return trGl;
	}

	public void setTrGl(String trGl) {
		this.trGl = trGl;
	}

	public String getTrSl() {
		return trSl;
	}

	public void setTrSl(String trSl) {
		this.trSl = trSl;
	}

	public String getSecGl() {
		return secGl;
	}

	public void setSecGl(String secGl) {
		this.secGl = secGl;
	}

	public String getSecSl() {
		return secSl;
	}

	public void setSecSl(String secSl) {
		this.secSl = secSl;
	}

	public BigDecimal getSecAmt() {
		return secAmt;
	}

	public void setSecAmt(BigDecimal secAmt) {
		this.secAmt = secAmt;
	}

	public String getCcityn() {
		return ccityn;
	}

	public void setCcityn(String ccityn) {
		this.ccityn = ccityn;
	}

	public String getCaccountNo() {
		return caccountNo;
	}

	public void setCaccountNo(String caccountNo) {
		this.caccountNo = caccountNo;
	}
    
    
}

