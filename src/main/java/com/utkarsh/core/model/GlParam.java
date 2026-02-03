package com.utkarsh.core.model;

import java.math.BigDecimal;

import com.utkarsh.core.modelseralizable.GlParamId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "gl_param")
@IdClass(GlParamId.class) // Since multiple primary keys
public class GlParam {

    @Id
    @Column(name = "cbank_id", nullable = false, length = 3)
    private String cbankId;

    @Id
    @Column(name = "cbran_id", nullable = false, length = 3)
    private String cbranId;

    @Id
    @Column(name = "cgl_code", nullable = false, length = 20)
    private String cglCode;

    @Column(name = "cshort_cod", length = 30)
    private String cshortCod;

    @Column(name = "trading", length = 1)
    private String trading;

    @Column(name = "chead_shor", length = 70)
    private String cheadShor;

    @Column(name = "clast_ac_n", length = 8)
    private String clastAcN;

    @Column(name = "nchq_bal", precision = 10, scale = 2)
    private BigDecimal nchqBal;

    @Column(name = "nmin_bal", precision = 10, scale = 3)
    private BigDecimal nminBal;

    @Column(name = "cint_dr_gl", length = 6)
    private String cintDrGl;

    @Column(name = "cint_cr_gl", length = 6)
    private String cintCrGl;

    @Column(name = "cpint_gl", length = 6)
    private String cpintGl;

    @Column(name = "cseq_code", length = 6)
    private String cseqCode;

    @Column(name = "cnormal_gl", length = 6)
    private String cnormalGl;

    @Column(name = "cabnormal_", length = 6)
    private String cabnormal;

    @Column(name = "csch_coden", length = 6)
    private String cschCoden;

    @Column(name = "csch_codea", length = 6)
    private String cschCodea;

    @Column(name = "cfd_report", length = 20)
    private String cfdReport;

    @Column(name = "nmatu_type", precision = 10, scale = 2)
    private BigDecimal nmatuType;

    @Column(name = "cnotice_fo", length = 30)
    private String cnoticeFo;

    @Column(name = "cauto_gl", length = 6)
    private String cautoGl;

    @Column(name = "int_freq", length = 6)
    private String intFreq;

    @Column(name = "ccommissio", length = 6)
    private String ccommissio;

    @Column(name = "clos_bal", precision = 10, scale = 2)
    private BigDecimal closBal;

    @Column(name = "tot_cr", precision = 10, scale = 2)
    private BigDecimal totCr;

    @Column(name = "tot_dr", precision = 10, scale = 2)
    private BigDecimal totDr;

    @Column(name = "loan_type", length = 45)
    private String loanType;

    @Column(name = "interest_type", length = 45)
    private String interestType;

    @Column(name = "code", length = 6)
    private String code;

    @Column(name = "min_depo_amt", length = 10)
    private String minDepoAmt;

    @Column(name = "max_depo_amt", length = 10)
    private String maxDepoAmt;

    @Column(name = "depo_receipt_gen", length = 1)
    private String depoReceiptGen;

    @Column(name = "depo_month", length = 6)
    private String depoMonth;

    @Column(name = "depo_day", length = 6)
    private String depoDay;

    @Column(name = "chequebook", length = 1)
    private String chequebook;

    @Column(name = "min_chequebook_bal", length = 45)
    private String minChequebookBal;

    @Column(name = "credit_cash", length = 1)
    private String creditCash;

    @Column(name = "credit_transfer", length = 1)
    private String creditTransfer;

    @Column(name = "credit_clearing", length = 1)
    private String creditClearing;

    @Column(name = "debit_cash", length = 1)
    private String debitCash;

    @Column(name = "debit_transfer", length = 1)
    private String debitTransfer;

    @Column(name = "debit_clearing", length = 1)
    private String debitClearing;

    @Column(name = "cauto_rctno", length = 1)
    private String cautoRctno;

    @Column(name = "clast_fd_no", length = 6)
    private String clastFdNo;

    @Column(name = "cauto_renew", length = 1)
    private String cautoRenew;

    @Column(name = "nof_execute", precision = 3, scale = 0)
    private Integer nofExecute;

    @Column(name = "nint_tran_frq", precision = 2, scale = 0)
    private Integer nintTranFrq;

    @Column(name = "npamnth", precision = 2, scale = 0)
    private Integer npamnth;

    @Column(name = "astech", precision = 3, scale = 0)
    private Integer astech;

    @Column(name = "cintreceivable", length = 6)
    private String cintReceivable;

    @Column(name = "cintpayble", length = 6)
    private String cintPayble;

    @Column(name = "cintonint", length = 1)
    private String cintOnInt;

    @Column(name = "ndefaultage", precision = 3, scale = 0)
    private Integer ndefaultAge;

    @Column(name = "vs_name", length = 60)
    private String vsName;

    @Column(name = "pnl_int_cal", length = 1)
    private String pnlIntCal;

    @Column(name = "Swanidhi", length = 45)
    private String swanidhi;

    @Column(name = "CRR", length = 45)
    private String crr;

    @Column(name = "CDRATIO", length = 45)
    private String cdRatio;

    // Default constructor
    public GlParam() {
    }

	public GlParam(String cbankId, String cbranId, String cglCode, String cshortCod, String trading, String cheadShor,
			String clastAcN, BigDecimal nchqBal, BigDecimal nminBal, String cintDrGl, String cintCrGl, String cpintGl,
			String cseqCode, String cnormalGl, String cabnormal, String cschCoden, String cschCodea, String cfdReport,
			BigDecimal nmatuType, String cnoticeFo, String cautoGl, String intFreq, String ccommissio,
			BigDecimal closBal, BigDecimal totCr, BigDecimal totDr, String loanType, String interestType, String code,
			String minDepoAmt, String maxDepoAmt, String depoReceiptGen, String depoMonth, String depoDay,
			String chequebook, String minChequebookBal, String creditCash, String creditTransfer, String creditClearing,
			String debitCash, String debitTransfer, String debitClearing, String cautoRctno, String clastFdNo,
			String cautoRenew, Integer nofExecute, Integer nintTranFrq, Integer npamnth, Integer astech,
			String cintReceivable, String cintPayble, String cintOnInt, Integer ndefaultAge, String vsName,
			String pnlIntCal, String swanidhi, String crr, String cdRatio) {
		super();
		this.cbankId = cbankId;
		this.cbranId = cbranId;
		this.cglCode = cglCode;
		this.cshortCod = cshortCod;
		this.trading = trading;
		this.cheadShor = cheadShor;
		this.clastAcN = clastAcN;
		this.nchqBal = nchqBal;
		this.nminBal = nminBal;
		this.cintDrGl = cintDrGl;
		this.cintCrGl = cintCrGl;
		this.cpintGl = cpintGl;
		this.cseqCode = cseqCode;
		this.cnormalGl = cnormalGl;
		this.cabnormal = cabnormal;
		this.cschCoden = cschCoden;
		this.cschCodea = cschCodea;
		this.cfdReport = cfdReport;
		this.nmatuType = nmatuType;
		this.cnoticeFo = cnoticeFo;
		this.cautoGl = cautoGl;
		this.intFreq = intFreq;
		this.ccommissio = ccommissio;
		this.closBal = closBal;
		this.totCr = totCr;
		this.totDr = totDr;
		this.loanType = loanType;
		this.interestType = interestType;
		this.code = code;
		this.minDepoAmt = minDepoAmt;
		this.maxDepoAmt = maxDepoAmt;
		this.depoReceiptGen = depoReceiptGen;
		this.depoMonth = depoMonth;
		this.depoDay = depoDay;
		this.chequebook = chequebook;
		this.minChequebookBal = minChequebookBal;
		this.creditCash = creditCash;
		this.creditTransfer = creditTransfer;
		this.creditClearing = creditClearing;
		this.debitCash = debitCash;
		this.debitTransfer = debitTransfer;
		this.debitClearing = debitClearing;
		this.cautoRctno = cautoRctno;
		this.clastFdNo = clastFdNo;
		this.cautoRenew = cautoRenew;
		this.nofExecute = nofExecute;
		this.nintTranFrq = nintTranFrq;
		this.npamnth = npamnth;
		this.astech = astech;
		this.cintReceivable = cintReceivable;
		this.cintPayble = cintPayble;
		this.cintOnInt = cintOnInt;
		this.ndefaultAge = ndefaultAge;
		this.vsName = vsName;
		this.pnlIntCal = pnlIntCal;
		this.swanidhi = swanidhi;
		this.crr = crr;
		this.cdRatio = cdRatio;
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

	public String getCglCode() {
		return cglCode;
	}

	public void setCglCode(String cglCode) {
		this.cglCode = cglCode;
	}

	public String getCshortCod() {
		return cshortCod;
	}

	public void setCshortCod(String cshortCod) {
		this.cshortCod = cshortCod;
	}

	public String getTrading() {
		return trading;
	}

	public void setTrading(String trading) {
		this.trading = trading;
	}

	public String getCheadShor() {
		return cheadShor;
	}

	public void setCheadShor(String cheadShor) {
		this.cheadShor = cheadShor;
	}

	public String getClastAcN() {
		return clastAcN;
	}

	public void setClastAcN(String clastAcN) {
		this.clastAcN = clastAcN;
	}

	public BigDecimal getNchqBal() {
		return nchqBal;
	}

	public void setNchqBal(BigDecimal nchqBal) {
		this.nchqBal = nchqBal;
	}

	public BigDecimal getNminBal() {
		return nminBal;
	}

	public void setNminBal(BigDecimal nminBal) {
		this.nminBal = nminBal;
	}

	public String getCintDrGl() {
		return cintDrGl;
	}

	public void setCintDrGl(String cintDrGl) {
		this.cintDrGl = cintDrGl;
	}

	public String getCintCrGl() {
		return cintCrGl;
	}

	public void setCintCrGl(String cintCrGl) {
		this.cintCrGl = cintCrGl;
	}

	public String getCpintGl() {
		return cpintGl;
	}

	public void setCpintGl(String cpintGl) {
		this.cpintGl = cpintGl;
	}

	public String getCseqCode() {
		return cseqCode;
	}

	public void setCseqCode(String cseqCode) {
		this.cseqCode = cseqCode;
	}

	public String getCnormalGl() {
		return cnormalGl;
	}

	public void setCnormalGl(String cnormalGl) {
		this.cnormalGl = cnormalGl;
	}

	public String getCabnormal() {
		return cabnormal;
	}

	public void setCabnormal(String cabnormal) {
		this.cabnormal = cabnormal;
	}

	public String getCschCoden() {
		return cschCoden;
	}

	public void setCschCoden(String cschCoden) {
		this.cschCoden = cschCoden;
	}

	public String getCschCodea() {
		return cschCodea;
	}

	public void setCschCodea(String cschCodea) {
		this.cschCodea = cschCodea;
	}

	public String getCfdReport() {
		return cfdReport;
	}

	public void setCfdReport(String cfdReport) {
		this.cfdReport = cfdReport;
	}

	public BigDecimal getNmatuType() {
		return nmatuType;
	}

	public void setNmatuType(BigDecimal nmatuType) {
		this.nmatuType = nmatuType;
	}

	public String getCnoticeFo() {
		return cnoticeFo;
	}

	public void setCnoticeFo(String cnoticeFo) {
		this.cnoticeFo = cnoticeFo;
	}

	public String getCautoGl() {
		return cautoGl;
	}

	public void setCautoGl(String cautoGl) {
		this.cautoGl = cautoGl;
	}

	public String getIntFreq() {
		return intFreq;
	}

	public void setIntFreq(String intFreq) {
		this.intFreq = intFreq;
	}

	public String getCcommissio() {
		return ccommissio;
	}

	public void setCcommissio(String ccommissio) {
		this.ccommissio = ccommissio;
	}

	public BigDecimal getClosBal() {
		return closBal;
	}

	public void setClosBal(BigDecimal closBal) {
		this.closBal = closBal;
	}

	public BigDecimal getTotCr() {
		return totCr;
	}

	public void setTotCr(BigDecimal totCr) {
		this.totCr = totCr;
	}

	public BigDecimal getTotDr() {
		return totDr;
	}

	public void setTotDr(BigDecimal totDr) {
		this.totDr = totDr;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getInterestType() {
		return interestType;
	}

	public void setInterestType(String interestType) {
		this.interestType = interestType;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMinDepoAmt() {
		return minDepoAmt;
	}

	public void setMinDepoAmt(String minDepoAmt) {
		this.minDepoAmt = minDepoAmt;
	}

	public String getMaxDepoAmt() {
		return maxDepoAmt;
	}

	public void setMaxDepoAmt(String maxDepoAmt) {
		this.maxDepoAmt = maxDepoAmt;
	}

	public String getDepoReceiptGen() {
		return depoReceiptGen;
	}

	public void setDepoReceiptGen(String depoReceiptGen) {
		this.depoReceiptGen = depoReceiptGen;
	}

	public String getDepoMonth() {
		return depoMonth;
	}

	public void setDepoMonth(String depoMonth) {
		this.depoMonth = depoMonth;
	}

	public String getDepoDay() {
		return depoDay;
	}

	public void setDepoDay(String depoDay) {
		this.depoDay = depoDay;
	}

	public String getChequebook() {
		return chequebook;
	}

	public void setChequebook(String chequebook) {
		this.chequebook = chequebook;
	}

	public String getMinChequebookBal() {
		return minChequebookBal;
	}

	public void setMinChequebookBal(String minChequebookBal) {
		this.minChequebookBal = minChequebookBal;
	}

	public String getCreditCash() {
		return creditCash;
	}

	public void setCreditCash(String creditCash) {
		this.creditCash = creditCash;
	}

	public String getCreditTransfer() {
		return creditTransfer;
	}

	public void setCreditTransfer(String creditTransfer) {
		this.creditTransfer = creditTransfer;
	}

	public String getCreditClearing() {
		return creditClearing;
	}

	public void setCreditClearing(String creditClearing) {
		this.creditClearing = creditClearing;
	}

	public String getDebitCash() {
		return debitCash;
	}

	public void setDebitCash(String debitCash) {
		this.debitCash = debitCash;
	}

	public String getDebitTransfer() {
		return debitTransfer;
	}

	public void setDebitTransfer(String debitTransfer) {
		this.debitTransfer = debitTransfer;
	}

	public String getDebitClearing() {
		return debitClearing;
	}

	public void setDebitClearing(String debitClearing) {
		this.debitClearing = debitClearing;
	}

	public String getCautoRctno() {
		return cautoRctno;
	}

	public void setCautoRctno(String cautoRctno) {
		this.cautoRctno = cautoRctno;
	}

	public String getClastFdNo() {
		return clastFdNo;
	}

	public void setClastFdNo(String clastFdNo) {
		this.clastFdNo = clastFdNo;
	}

	public String getCautoRenew() {
		return cautoRenew;
	}

	public void setCautoRenew(String cautoRenew) {
		this.cautoRenew = cautoRenew;
	}

	public Integer getNofExecute() {
		return nofExecute;
	}

	public void setNofExecute(Integer nofExecute) {
		this.nofExecute = nofExecute;
	}

	public Integer getNintTranFrq() {
		return nintTranFrq;
	}

	public void setNintTranFrq(Integer nintTranFrq) {
		this.nintTranFrq = nintTranFrq;
	}

	public Integer getNpamnth() {
		return npamnth;
	}

	public void setNpamnth(Integer npamnth) {
		this.npamnth = npamnth;
	}

	public Integer getAstech() {
		return astech;
	}

	public void setAstech(Integer astech) {
		this.astech = astech;
	}

	public String getCintReceivable() {
		return cintReceivable;
	}

	public void setCintReceivable(String cintReceivable) {
		this.cintReceivable = cintReceivable;
	}

	public String getCintPayble() {
		return cintPayble;
	}

	public void setCintPayble(String cintPayble) {
		this.cintPayble = cintPayble;
	}

	public String getCintOnInt() {
		return cintOnInt;
	}

	public void setCintOnInt(String cintOnInt) {
		this.cintOnInt = cintOnInt;
	}

	public Integer getNdefaultAge() {
		return ndefaultAge;
	}

	public void setNdefaultAge(Integer ndefaultAge) {
		this.ndefaultAge = ndefaultAge;
	}

	public String getVsName() {
		return vsName;
	}

	public void setVsName(String vsName) {
		this.vsName = vsName;
	}

	public String getPnlIntCal() {
		return pnlIntCal;
	}

	public void setPnlIntCal(String pnlIntCal) {
		this.pnlIntCal = pnlIntCal;
	}

	public String getSwanidhi() {
		return swanidhi;
	}

	public void setSwanidhi(String swanidhi) {
		this.swanidhi = swanidhi;
	}

	public String getCrr() {
		return crr;
	}

	public void setCrr(String crr) {
		this.crr = crr;
	}

	public String getCdRatio() {
		return cdRatio;
	}

	public void setCdRatio(String cdRatio) {
		this.cdRatio = cdRatio;
	}

  
}
