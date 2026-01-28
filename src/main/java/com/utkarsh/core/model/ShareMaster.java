package com.utkarsh.core.model;

import java.math.BigDecimal;
import java.util.Date;

import com.utkarsh.core.modelseralizable.ShareMasterId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "share_master")
@IdClass(ShareMasterId.class)
public class ShareMaster {

    @Id @Column(name = "cbank_id", length = 3, nullable = false)
    private String cbankId;

    @Id @Column(name = "cbran_id", length = 3, nullable = false)
    private String cbranId;

    @Id @Column(name = "cmember_no", length = 8, nullable = false)
    private String cmemberNo;

    @Column(name = "caccount_no", length = 20)
    private String caccountNo;

    @Column(name = "cname", length = 70)
    private String cname;

    @Column(name = "cint_membe", length = 45)
    private String cintMembe;

    @Column(name = "token_name", length = 45)
    private String tokenName;

    @Column(name = "dapl_date")
    private Date daplDate;

    @Column(name = "dres_date")
    private Date dresDate;

    @Column(name = "dsan_date")
    private Date dsanDate;

    @Column(name = "dcan_date")
    private Date dcanDate;

    @Column(name = "dnom_dat")
    private Date dnomDat;

    @Column(name = "cmemb_type", length = 1)
    private String cmembType;

    @Column(name = "nshr_amt", precision = 10, scale = 2)
    private BigDecimal nshrAmt;

    @Column(name = "clf_no", length = 6)
    private String clfNo;

    @Column(name = "resign_flag", length = 1)
    private String resignFlag;

    @Column(name = "cdir_code")
    private Integer cdirCode;

    @Column(name = "nominee_name", length = 100)
    private String nomineeName;

    @Column(name = "relation_name", length = 45)
    private String relationName;

    @Column(name = "cbr_name", length = 45)
    private String cbrName;

    @Column(name = "czone_name", length = 45)
    private String czoneName;

    @Column(name = "cdep_name", length = 45)
    private String cdepName;

    @Column(name = "csdep_name", length = 45)
    private String csdepName;

    @Column(name = "cdir_name", length = 45)
    private String cdirName;

    @Column(name = "cgrp_name", length = 45)
    private String cgrpName;

    @Column(name = "cgl_code", length = 6)
    private String cglCode;

    @Column(name = "cgl_name", length = 45)
    private String cglName;

    @Column(name = "ref_cgl", length = 8)
    private String refCgl;

    @Column(name = "ref_csl", length = 45)
    private String refCsl;

    @Column(name = "cust_id", length = 12)
    private String custId;

    @Column(name = "SMS_APPLY", length = 1)
    private String smsApply;

	public ShareMaster(String cbankId, String cbranId, String cmemberNo, String caccountNo, String cname,
			String cintMembe, String tokenName, Date daplDate, Date dresDate, Date dsanDate, Date dcanDate,
			Date dnomDat, String cmembType, BigDecimal nshrAmt, String clfNo, String resignFlag, Integer cdirCode,
			String nomineeName, String relationName, String cbrName, String czoneName, String cdepName,
			String csdepName, String cdirName, String cgrpName, String cglCode, String cglName, String refCgl,
			String refCsl, String custId, String smsApply) {
		super();
		this.cbankId = cbankId;
		this.cbranId = cbranId;
		this.cmemberNo = cmemberNo;
		this.caccountNo = caccountNo;
		this.cname = cname;
		this.cintMembe = cintMembe;
		this.tokenName = tokenName;
		this.daplDate = daplDate;
		this.dresDate = dresDate;
		this.dsanDate = dsanDate;
		this.dcanDate = dcanDate;
		this.dnomDat = dnomDat;
		this.cmembType = cmembType;
		this.nshrAmt = nshrAmt;
		this.clfNo = clfNo;
		this.resignFlag = resignFlag;
		this.cdirCode = cdirCode;
		this.nomineeName = nomineeName;
		this.relationName = relationName;
		this.cbrName = cbrName;
		this.czoneName = czoneName;
		this.cdepName = cdepName;
		this.csdepName = csdepName;
		this.cdirName = cdirName;
		this.cgrpName = cgrpName;
		this.cglCode = cglCode;
		this.cglName = cglName;
		this.refCgl = refCgl;
		this.refCsl = refCsl;
		this.custId = custId;
		this.smsApply = smsApply;
	}

	public ShareMaster() {
		super();
	}

	public String getCbankId() {
		return cbankId;
	}

	public void setCbankId(String cbankId) {
		this.cbankId = cbankId;
	}

	public String getCbranId() {
		return cbranId;
	}

	public void setCbranId(String cbranId) {
		this.cbranId = cbranId;
	}

	public String getCmemberNo() {
		return cmemberNo;
	}

	public void setCmemberNo(String cmemberNo) {
		this.cmemberNo = cmemberNo;
	}

	public String getCaccountNo() {
		return caccountNo;
	}

	public void setCaccountNo(String caccountNo) {
		this.caccountNo = caccountNo;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCintMembe() {
		return cintMembe;
	}

	public void setCintMembe(String cintMembe) {
		this.cintMembe = cintMembe;
	}

	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public Date getDaplDate() {
		return daplDate;
	}

	public void setDaplDate(Date daplDate) {
		this.daplDate = daplDate;
	}

	public Date getDresDate() {
		return dresDate;
	}

	public void setDresDate(Date dresDate) {
		this.dresDate = dresDate;
	}

	public Date getDsanDate() {
		return dsanDate;
	}

	public void setDsanDate(Date dsanDate) {
		this.dsanDate = dsanDate;
	}

	public Date getDcanDate() {
		return dcanDate;
	}

	public void setDcanDate(Date dcanDate) {
		this.dcanDate = dcanDate;
	}

	public Date getDnomDat() {
		return dnomDat;
	}

	public void setDnomDat(Date dnomDat) {
		this.dnomDat = dnomDat;
	}

	public String getCmembType() {
		return cmembType;
	}

	public void setCmembType(String cmembType) {
		this.cmembType = cmembType;
	}

	public BigDecimal getNshrAmt() {
		return nshrAmt;
	}

	public void setNshrAmt(BigDecimal nshrAmt) {
		this.nshrAmt = nshrAmt;
	}

	public String getClfNo() {
		return clfNo;
	}

	public void setClfNo(String clfNo) {
		this.clfNo = clfNo;
	}

	public String getResignFlag() {
		return resignFlag;
	}

	public void setResignFlag(String resignFlag) {
		this.resignFlag = resignFlag;
	}

	public Integer getCdirCode() {
		return cdirCode;
	}

	public void setCdirCode(Integer cdirCode) {
		this.cdirCode = cdirCode;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getRelationName() {
		return relationName;
	}

	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}

	public String getCbrName() {
		return cbrName;
	}

	public void setCbrName(String cbrName) {
		this.cbrName = cbrName;
	}

	public String getCzoneName() {
		return czoneName;
	}

	public void setCzoneName(String czoneName) {
		this.czoneName = czoneName;
	}

	public String getCdepName() {
		return cdepName;
	}

	public void setCdepName(String cdepName) {
		this.cdepName = cdepName;
	}

	public String getCsdepName() {
		return csdepName;
	}

	public void setCsdepName(String csdepName) {
		this.csdepName = csdepName;
	}

	public String getCdirName() {
		return cdirName;
	}

	public void setCdirName(String cdirName) {
		this.cdirName = cdirName;
	}

	public String getCgrpName() {
		return cgrpName;
	}

	public void setCgrpName(String cgrpName) {
		this.cgrpName = cgrpName;
	}

	public String getCglCode() {
		return cglCode;
	}

	public void setCglCode(String cglCode) {
		this.cglCode = cglCode;
	}

	public String getCglName() {
		return cglName;
	}

	public void setCglName(String cglName) {
		this.cglName = cglName;
	}

	public String getRefCgl() {
		return refCgl;
	}

	public void setRefCgl(String refCgl) {
		this.refCgl = refCgl;
	}

	public String getRefCsl() {
		return refCsl;
	}

	public void setRefCsl(String refCsl) {
		this.refCsl = refCsl;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getSmsApply() {
		return smsApply;
	}

	public void setSmsApply(String smsApply) {
		this.smsApply = smsApply;
	}

    	
}
