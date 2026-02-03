package com.utkarsh.core.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "account_master")
public class AccountMaster {

    @Id
    @Column(name = "caccount_no", length = 20, nullable = false)
    private String caccountNo;

    @Column(name = "cac_type", length = 1, nullable = false)
    private String cacType;

    @Column(name = "chead_shor", length = 100, nullable = false)
    private String cheadShor;

    @Column(name = "nytd_cr", precision = 14, scale = 2, nullable = false)
    private BigDecimal nytdCr;

    @Column(name = "nytd_dr", precision = 14, scale = 2, nullable = false)
    private BigDecimal nytdDr;

    @Column(name = "cint_type", length = 1)
    private String cintType;

    @Column(name = "cloan_type", length = 1)
    private String cloanType;

    @Column(name = "cac_status", length = 1)
    private String cacStatus;

    @Column(name = "nunpass_dr", precision = 14, scale = 2)
    private BigDecimal nunpassDr;

    @Column(name = "nunpass_cr", precision = 14, scale = 2)
    private BigDecimal nunpassCr;

    @Column(name = "callow_tod", length = 1)
    private String callowTod;

    @Column(name = "ntod_limit", precision = 12, scale = 2)
    private BigDecimal ntodLimit;

    @Column(name = "ntod_int", precision = 5, scale = 2)
    private BigDecimal ntodInt;

    @Column(name = "dtod_due_d")
    private LocalDate dtodDueD;

    @Column(name = "dlast_tr_d")
    private LocalDate dlastTrD;

    @Column(name = "dlast_int_")
    private LocalDate dlastInt;

    @Column(name = "cint_apply", length = 1)
    private String cintApply;

    @Column(name = "nac_bal", precision = 14, scale = 2)
    private BigDecimal nacBal;

    @Column(name = "ninterest", precision = 10, scale = 2)
    private BigDecimal ninterest;

    @Column(name = "nod_int", precision = 10, scale = 2)
    private BigDecimal nodInt;

    @Column(name = "cshort_cod", length = 2)
    private String cshortCod;

    @Column(name = "cshort_nam", length = 116)
    private String cshortNam;

    @Column(name = "nfreeze_am", precision = 10, scale = 2)
    private BigDecimal nfreezeAm;

    @Column(name = "cfrztype", length = 1)
    private String cfrztype;

    @Column(name = "cfrzreason", length = 50)
    private String cfrzreason;

    @Column(name = "nnotice_cr", precision = 10, scale = 3)
    private BigDecimal nnoticeCr;

    @Column(name = "nrec_crg", precision = 10, scale = 3)
    private BigDecimal nrecCrg;

    @Column(name = "nstamp_crg", precision = 10, scale = 3)
    private BigDecimal nstampCrg;

    @Column(name = "ninsurance", precision = 10, scale = 3)
    private BigDecimal ninsurance;

    @Column(name = "dlast_pnl_")
    private LocalDate dlastPnl;

    @Column(name = "dlastintrc")
    private LocalDate dlastintrc;

    @Column(name = "cprocess_r", length = 1)
    private String cprocessR;

    @Column(name = "cmember_no", length = 8)
    private String cmemberNo;

    @Column(name = "nother_crg", precision = 5, scale = 2)
    private BigDecimal notherCrg;

    @Column(name = "cposting", length = 1)
    private String cposting;

    @Column(name = "trading", length = 2)
    private String trading;

    @Column(name = "ccity", length = 20)
    private String ccity;

    @Column(name = "customer_id", length = 12, nullable = false)
    private String customerId;

	public AccountMaster() {
		super();
	}

	public AccountMaster(String caccountNo, String cacType, String cheadShor, BigDecimal nytdCr, BigDecimal nytdDr,
			String cintType, String cloanType, String cacStatus, BigDecimal nunpassDr, BigDecimal nunpassCr,
			String callowTod, BigDecimal ntodLimit, BigDecimal ntodInt, LocalDate dtodDueD, LocalDate dlastTrD,
			LocalDate dlastInt, String cintApply, BigDecimal nacBal, BigDecimal ninterest, BigDecimal nodInt,
			String cshortCod, String cshortNam, BigDecimal nfreezeAm, String cfrztype, String cfrzreason,
			BigDecimal nnoticeCr, BigDecimal nrecCrg, BigDecimal nstampCrg, BigDecimal ninsurance, LocalDate dlastPnl,
			LocalDate dlastintrc, String cprocessR, String cmemberNo, BigDecimal notherCrg, String cposting,
			String trading, String ccity, String customerId) {
		super();
		this.caccountNo = caccountNo;
		this.cacType = cacType;
		this.cheadShor = cheadShor;
		this.nytdCr = nytdCr;
		this.nytdDr = nytdDr;
		this.cintType = cintType;
		this.cloanType = cloanType;
		this.cacStatus = cacStatus;
		this.nunpassDr = nunpassDr;
		this.nunpassCr = nunpassCr;
		this.callowTod = callowTod;
		this.ntodLimit = ntodLimit;
		this.ntodInt = ntodInt;
		this.dtodDueD = dtodDueD;
		this.dlastTrD = dlastTrD;
		this.dlastInt = dlastInt;
		this.cintApply = cintApply;
		this.nacBal = nacBal;
		this.ninterest = ninterest;
		this.nodInt = nodInt;
		this.cshortCod = cshortCod;
		this.cshortNam = cshortNam;
		this.nfreezeAm = nfreezeAm;
		this.cfrztype = cfrztype;
		this.cfrzreason = cfrzreason;
		this.nnoticeCr = nnoticeCr;
		this.nrecCrg = nrecCrg;
		this.nstampCrg = nstampCrg;
		this.ninsurance = ninsurance;
		this.dlastPnl = dlastPnl;
		this.dlastintrc = dlastintrc;
		this.cprocessR = cprocessR;
		this.cmemberNo = cmemberNo;
		this.notherCrg = notherCrg;
		this.cposting = cposting;
		this.trading = trading;
		this.ccity = ccity;
		this.customerId = customerId;
	}

	public String getCaccountNo() {
		return caccountNo;
	}

	public void setCaccountNo(String caccountNo) {
		this.caccountNo = caccountNo;
	}

	public String getCacType() {
		return cacType;
	}

	public void setCacType(String cacType) {
		this.cacType = cacType;
	}

	public String getCheadShor() {
		return cheadShor;
	}

	public void setCheadShor(String cheadShor) {
		this.cheadShor = cheadShor;
	}

	public BigDecimal getNytdCr() {
		return nytdCr;
	}

	public void setNytdCr(BigDecimal nytdCr) {
		this.nytdCr = nytdCr;
	}

	public BigDecimal getNytdDr() {
		return nytdDr;
	}

	public void setNytdDr(BigDecimal nytdDr) {
		this.nytdDr = nytdDr;
	}

	public String getCintType() {
		return cintType;
	}

	public void setCintType(String cintType) {
		this.cintType = cintType;
	}

	public String getCloanType() {
		return cloanType;
	}

	public void setCloanType(String cloanType) {
		this.cloanType = cloanType;
	}

	public String getCacStatus() {
		return cacStatus;
	}

	public void setCacStatus(String cacStatus) {
		this.cacStatus = cacStatus;
	}

	public BigDecimal getNunpassDr() {
		return nunpassDr;
	}

	public void setNunpassDr(BigDecimal nunpassDr) {
		this.nunpassDr = nunpassDr;
	}

	public BigDecimal getNunpassCr() {
		return nunpassCr;
	}

	public void setNunpassCr(BigDecimal nunpassCr) {
		this.nunpassCr = nunpassCr;
	}

	public String getCallowTod() {
		return callowTod;
	}

	public void setCallowTod(String callowTod) {
		this.callowTod = callowTod;
	}

	public BigDecimal getNtodLimit() {
		return ntodLimit;
	}

	public void setNtodLimit(BigDecimal ntodLimit) {
		this.ntodLimit = ntodLimit;
	}

	public BigDecimal getNtodInt() {
		return ntodInt;
	}

	public void setNtodInt(BigDecimal ntodInt) {
		this.ntodInt = ntodInt;
	}

	public LocalDate getDtodDueD() {
		return dtodDueD;
	}

	public void setDtodDueD(LocalDate dtodDueD) {
		this.dtodDueD = dtodDueD;
	}

	public LocalDate getDlastTrD() {
		return dlastTrD;
	}

	public void setDlastTrD(LocalDate dlastTrD) {
		this.dlastTrD = dlastTrD;
	}

	public LocalDate getDlastInt() {
		return dlastInt;
	}

	public void setDlastInt(LocalDate dlastInt) {
		this.dlastInt = dlastInt;
	}

	public String getCintApply() {
		return cintApply;
	}

	public void setCintApply(String cintApply) {
		this.cintApply = cintApply;
	}

	public BigDecimal getNacBal() {
		return nacBal;
	}

	public void setNacBal(BigDecimal nacBal) {
		this.nacBal = nacBal;
	}

	public BigDecimal getNinterest() {
		return ninterest;
	}

	public void setNinterest(BigDecimal ninterest) {
		this.ninterest = ninterest;
	}

	public BigDecimal getNodInt() {
		return nodInt;
	}

	public void setNodInt(BigDecimal nodInt) {
		this.nodInt = nodInt;
	}

	public String getCshortCod() {
		return cshortCod;
	}

	public void setCshortCod(String cshortCod) {
		this.cshortCod = cshortCod;
	}

	public String getCshortNam() {
		return cshortNam;
	}

	public void setCshortNam(String cshortNam) {
		this.cshortNam = cshortNam;
	}

	public BigDecimal getNfreezeAm() {
		return nfreezeAm;
	}

	public void setNfreezeAm(BigDecimal nfreezeAm) {
		this.nfreezeAm = nfreezeAm;
	}

	public String getCfrztype() {
		return cfrztype;
	}

	public void setCfrztype(String cfrztype) {
		this.cfrztype = cfrztype;
	}

	public String getCfrzreason() {
		return cfrzreason;
	}

	public void setCfrzreason(String cfrzreason) {
		this.cfrzreason = cfrzreason;
	}

	public BigDecimal getNnoticeCr() {
		return nnoticeCr;
	}

	public void setNnoticeCr(BigDecimal nnoticeCr) {
		this.nnoticeCr = nnoticeCr;
	}

	public BigDecimal getNrecCrg() {
		return nrecCrg;
	}

	public void setNrecCrg(BigDecimal nrecCrg) {
		this.nrecCrg = nrecCrg;
	}

	public BigDecimal getNstampCrg() {
		return nstampCrg;
	}

	public void setNstampCrg(BigDecimal nstampCrg) {
		this.nstampCrg = nstampCrg;
	}

	public BigDecimal getNinsurance() {
		return ninsurance;
	}

	public void setNinsurance(BigDecimal ninsurance) {
		this.ninsurance = ninsurance;
	}

	public LocalDate getDlastPnl() {
		return dlastPnl;
	}

	public void setDlastPnl(LocalDate dlastPnl) {
		this.dlastPnl = dlastPnl;
	}

	public LocalDate getDlastintrc() {
		return dlastintrc;
	}

	public void setDlastintrc(LocalDate dlastintrc) {
		this.dlastintrc = dlastintrc;
	}

	public String getCprocessR() {
		return cprocessR;
	}

	public void setCprocessR(String cprocessR) {
		this.cprocessR = cprocessR;
	}

	public String getCmemberNo() {
		return cmemberNo;
	}

	public void setCmemberNo(String cmemberNo) {
		this.cmemberNo = cmemberNo;
	}

	public BigDecimal getNotherCrg() {
		return notherCrg;
	}

	public void setNotherCrg(BigDecimal notherCrg) {
		this.notherCrg = notherCrg;
	}

	public String getCposting() {
		return cposting;
	}

	public void setCposting(String cposting) {
		this.cposting = cposting;
	}

	public String getTrading() {
		return trading;
	}

	public void setTrading(String trading) {
		this.trading = trading;
	}

	public String getCcity() {
		return ccity;
	}

	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
    
    
}
