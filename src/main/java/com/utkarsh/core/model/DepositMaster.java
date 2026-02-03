package com.utkarsh.core.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "deposit")
public class DepositMaster {

    @Id
    @Column(name = "caccount_no", length = 20, nullable = false)
    private String caccountNo;

    @Column(name = "cjoint", length = 10)
    private String cjoint;

    @Column(name = "cadd1", length = 200)
    private String cadd1;

    @Column(name = "cphone", length = 15)
    private String cphone;

    @Column(name = "cmember_no", length = 20)
    private String cmemberNo;

    @Column(name = "dstart_dat")
    private LocalDate dstartDat;

    @Column(name = "dfirst_dat")
    private LocalDate dfirstDat;

    @Column(name = "cnomineenm", length = 200)
    private String cnomineenm;

    @Column(name = "nmatu_amt", precision = 15, scale = 2)
    private BigDecimal nmatuAmt;

    @Column(name = "cfd_receip", length = 100)
    private String cfdReceip;

    @Column(name = "cint_trf_g", length = 6)
    private String cintTrfG;

    @Column(name = "cint_trf_s", length = 8)
    private String cintTrfS;

    @Column(name = "cprint_fd", length = 1)
    private String cprintFd;

    @Column(name = "cauto_rene", length = 100)
    private String cautoRene;

    @Column(name = "cmemb_type", length = 1)
    private String cmembType;

    @Column(name = "cdir_code", length = 6)
    private String cdirCode;

    @Column(name = "intr_name", length = 200)
    private String intrName;

    @Column(name = "intr_add1", length = 200)
    private String intrAdd1;

    @Column(name = "intr_cityc", length = 6)
    private String intrCityc;

    @Column(name = "cproc_rec2", length = 1)
    private String cprocRec2;

    @Column(name = "cproc_rec1", length = 1)
    private String cprocRec1;

    @Column(name = "crelation", length = 200)
    private String crelation;

    @Column(name = "acc_name", length = 200)
    private String accName;

    @Column(name = "cdir_name", length = 200)
    private String cdirName;

    @Column(name = "sdue_date")
    private LocalDate sdueDate;

    @Column(name = "sint_rate", precision = 15, scale = 2)
    private BigDecimal sintRate;

    @Column(name = "fint_rate", precision = 15, scale = 2)
    private BigDecimal fintRate;

    @Column(name = "stod_limit", precision = 15, scale = 2)
    private BigDecimal stodLimit;

    @Column(name = "dtod_limit", precision = 15, scale = 2)
    private BigDecimal dtodLimit;

    @Column(name = "stod_int", precision = 15, scale = 2)
    private BigDecimal stodInt;

    @Column(name = "schq_allow", length = 1)
    private String schqAllow;

    @Column(name = "fdepo_amt", precision = 15, scale = 2)
    private BigDecimal fdepoAmt;

    @Column(name = "sdepo_amt", precision = 15, scale = 2)
    private BigDecimal sdepoAmt;

    @Column(name = "this_date")
    private LocalDate thisDate;

    @Column(name = "cint_trf_gn", length = 45)
    private String cintTrfGn;

    @Column(name = "cint_trf_sn", length = 45)
    private String cintTrfSn;

    @Column(name = "ccityn", length = 200)
    private String ccityn;

    @Column(name = "intr_cityn", length = 200)
    private String intrCityn;

    @Column(name = "csplintrc", length = 200)
    private String csplintrc;

    @Column(name = "cint_dura", length = 50)
    private String cintDura;

    @Column(name = "cwint", length = 1)
    private String cwint;

    @Column(name = "cloan_info", length = 200)
    private String cloanInfo;

    @Column(name = "mem_name", length = 200)
    private String memName;

    @Column(name = "dend_dat")
    private LocalDate dendDat;

    @Column(name = "memno", length = 20)
    private String memno;

    @Column(name = "memname", length = 200)
    private String memname;

    @Column(name = "nmonth", length = 6)
    private String nmonth;

    @Column(name = "nday", length = 6)
    private String nday;

    @Column(name = "customer_id", length = 12)
    private String customerId;

    @Column(name = "isform15h", length = 1)
    private String isform15h;

    @Column(name = "chequebookflag", length = 1)
    private String chequebookflag;

    @Column(name = "ccatagory", length = 1)
    private String ccatagory;

    @Column(name = "cacode", length = 6)
    private String cacode;

    @Column(name = "cint_cal", length = 1)
    private String cintCal;

    @Column(name = "nint_tran_frq", precision = 2)
    private BigDecimal nintTranFrq;

    @Column(name = "cid_no", precision = 5)
    private BigDecimal cidNo;

    @Column(name = "lienmark", length = 1)
    private String lienmark;

    @Column(name = "Loanamt", precision = 15, scale = 2)
    private BigDecimal loanamt;

    @Column(name = "Loanaccno", length = 20)
    private String loanaccno;

    @Column(name = "SMS_APPLY", length = 1)
    private String smsApply;

	public DepositMaster() {
		super();
	}

	public DepositMaster(String caccountNo, String cjoint, String cadd1, String cphone, String cmemberNo,
			LocalDate dstartDat, LocalDate dfirstDat, String cnomineenm, BigDecimal nmatuAmt, String cfdReceip,
			String cintTrfG, String cintTrfS, String cprintFd, String cautoRene, String cmembType, String cdirCode,
			String intrName, String intrAdd1, String intrCityc, String cprocRec2, String cprocRec1, String crelation,
			String accName, String cdirName, LocalDate sdueDate, BigDecimal sintRate, BigDecimal fintRate,
			BigDecimal stodLimit, BigDecimal dtodLimit, BigDecimal stodInt, String schqAllow, BigDecimal fdepoAmt,
			BigDecimal sdepoAmt, LocalDate thisDate, String cintTrfGn, String cintTrfSn, String ccityn,
			String intrCityn, String csplintrc, String cintDura, String cwint, String cloanInfo, String memName,
			LocalDate dendDat, String memno, String memname2, String nmonth, String nday, String customerId,
			String isform15h, String chequebookflag, String ccatagory, String cacode, String cintCal,
			BigDecimal nintTranFrq, BigDecimal cidNo, String lienmark, BigDecimal loanamt, String loanaccno,
			String smsApply) {
		super();
		this.caccountNo = caccountNo;
		this.cjoint = cjoint;
		this.cadd1 = cadd1;
		this.cphone = cphone;
		this.cmemberNo = cmemberNo;
		this.dstartDat = dstartDat;
		this.dfirstDat = dfirstDat;
		this.cnomineenm = cnomineenm;
		this.nmatuAmt = nmatuAmt;
		this.cfdReceip = cfdReceip;
		this.cintTrfG = cintTrfG;
		this.cintTrfS = cintTrfS;
		this.cprintFd = cprintFd;
		this.cautoRene = cautoRene;
		this.cmembType = cmembType;
		this.cdirCode = cdirCode;
		this.intrName = intrName;
		this.intrAdd1 = intrAdd1;
		this.intrCityc = intrCityc;
		this.cprocRec2 = cprocRec2;
		this.cprocRec1 = cprocRec1;
		this.crelation = crelation;
		this.accName = accName;
		this.cdirName = cdirName;
		this.sdueDate = sdueDate;
		this.sintRate = sintRate;
		this.fintRate = fintRate;
		this.stodLimit = stodLimit;
		this.dtodLimit = dtodLimit;
		this.stodInt = stodInt;
		this.schqAllow = schqAllow;
		this.fdepoAmt = fdepoAmt;
		this.sdepoAmt = sdepoAmt;
		this.thisDate = thisDate;
		this.cintTrfGn = cintTrfGn;
		this.cintTrfSn = cintTrfSn;
		this.ccityn = ccityn;
		this.intrCityn = intrCityn;
		this.csplintrc = csplintrc;
		this.cintDura = cintDura;
		this.cwint = cwint;
		this.cloanInfo = cloanInfo;
		this.memName = memName;
		this.dendDat = dendDat;
		this.memno = memno;
		memname = memname2;
		this.nmonth = nmonth;
		this.nday = nday;
		this.customerId = customerId;
		this.isform15h = isform15h;
		this.chequebookflag = chequebookflag;
		this.ccatagory = ccatagory;
		this.cacode = cacode;
		this.cintCal = cintCal;
		this.nintTranFrq = nintTranFrq;
		this.cidNo = cidNo;
		this.lienmark = lienmark;
		this.loanamt = loanamt;
		this.loanaccno = loanaccno;
		this.smsApply = smsApply;
	}

	public String getCaccountNo() {
		return caccountNo;
	}

	public void setCaccountNo(String caccountNo) {
		this.caccountNo = caccountNo;
	}

	public String getCjoint() {
		return cjoint;
	}

	public void setCjoint(String cjoint) {
		this.cjoint = cjoint;
	}

	public String getCadd1() {
		return cadd1;
	}

	public void setCadd1(String cadd1) {
		this.cadd1 = cadd1;
	}

	public String getCphone() {
		return cphone;
	}

	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	public String getCmemberNo() {
		return cmemberNo;
	}

	public void setCmemberNo(String cmemberNo) {
		this.cmemberNo = cmemberNo;
	}

	public LocalDate getDstartDat() {
		return dstartDat;
	}

	public void setDstartDat(LocalDate dstartDat) {
		this.dstartDat = dstartDat;
	}

	public LocalDate getDfirstDat() {
		return dfirstDat;
	}

	public void setDfirstDat(LocalDate dfirstDat) {
		this.dfirstDat = dfirstDat;
	}

	public String getCnomineenm() {
		return cnomineenm;
	}

	public void setCnomineenm(String cnomineenm) {
		this.cnomineenm = cnomineenm;
	}

	public BigDecimal getNmatuAmt() {
		return nmatuAmt;
	}

	public void setNmatuAmt(BigDecimal nmatuAmt) {
		this.nmatuAmt = nmatuAmt;
	}

	public String getCfdReceip() {
		return cfdReceip;
	}

	public void setCfdReceip(String cfdReceip) {
		this.cfdReceip = cfdReceip;
	}

	public String getCintTrfG() {
		return cintTrfG;
	}

	public void setCintTrfG(String cintTrfG) {
		this.cintTrfG = cintTrfG;
	}

	public String getCintTrfS() {
		return cintTrfS;
	}

	public void setCintTrfS(String cintTrfS) {
		this.cintTrfS = cintTrfS;
	}

	public String getCprintFd() {
		return cprintFd;
	}

	public void setCprintFd(String cprintFd) {
		this.cprintFd = cprintFd;
	}

	public String getCautoRene() {
		return cautoRene;
	}

	public void setCautoRene(String cautoRene) {
		this.cautoRene = cautoRene;
	}

	public String getCmembType() {
		return cmembType;
	}

	public void setCmembType(String cmembType) {
		this.cmembType = cmembType;
	}

	public String getCdirCode() {
		return cdirCode;
	}

	public void setCdirCode(String cdirCode) {
		this.cdirCode = cdirCode;
	}

	public String getIntrName() {
		return intrName;
	}

	public void setIntrName(String intrName) {
		this.intrName = intrName;
	}

	public String getIntrAdd1() {
		return intrAdd1;
	}

	public void setIntrAdd1(String intrAdd1) {
		this.intrAdd1 = intrAdd1;
	}

	public String getIntrCityc() {
		return intrCityc;
	}

	public void setIntrCityc(String intrCityc) {
		this.intrCityc = intrCityc;
	}

	public String getCprocRec2() {
		return cprocRec2;
	}

	public void setCprocRec2(String cprocRec2) {
		this.cprocRec2 = cprocRec2;
	}

	public String getCprocRec1() {
		return cprocRec1;
	}

	public void setCprocRec1(String cprocRec1) {
		this.cprocRec1 = cprocRec1;
	}

	public String getCrelation() {
		return crelation;
	}

	public void setCrelation(String crelation) {
		this.crelation = crelation;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getCdirName() {
		return cdirName;
	}

	public void setCdirName(String cdirName) {
		this.cdirName = cdirName;
	}

	public LocalDate getSdueDate() {
		return sdueDate;
	}

	public void setSdueDate(LocalDate sdueDate) {
		this.sdueDate = sdueDate;
	}

	public BigDecimal getSintRate() {
		return sintRate;
	}

	public void setSintRate(BigDecimal sintRate) {
		this.sintRate = sintRate;
	}

	public BigDecimal getFintRate() {
		return fintRate;
	}

	public void setFintRate(BigDecimal fintRate) {
		this.fintRate = fintRate;
	}

	public BigDecimal getStodLimit() {
		return stodLimit;
	}

	public void setStodLimit(BigDecimal stodLimit) {
		this.stodLimit = stodLimit;
	}

	public BigDecimal getDtodLimit() {
		return dtodLimit;
	}

	public void setDtodLimit(BigDecimal dtodLimit) {
		this.dtodLimit = dtodLimit;
	}

	public BigDecimal getStodInt() {
		return stodInt;
	}

	public void setStodInt(BigDecimal stodInt) {
		this.stodInt = stodInt;
	}

	public String getSchqAllow() {
		return schqAllow;
	}

	public void setSchqAllow(String schqAllow) {
		this.schqAllow = schqAllow;
	}

	public BigDecimal getFdepoAmt() {
		return fdepoAmt;
	}

	public void setFdepoAmt(BigDecimal fdepoAmt) {
		this.fdepoAmt = fdepoAmt;
	}

	public BigDecimal getSdepoAmt() {
		return sdepoAmt;
	}

	public void setSdepoAmt(BigDecimal sdepoAmt) {
		this.sdepoAmt = sdepoAmt;
	}

	public LocalDate getThisDate() {
		return thisDate;
	}

	public void setThisDate(LocalDate thisDate) {
		this.thisDate = thisDate;
	}

	public String getCintTrfGn() {
		return cintTrfGn;
	}

	public void setCintTrfGn(String cintTrfGn) {
		this.cintTrfGn = cintTrfGn;
	}

	public String getCintTrfSn() {
		return cintTrfSn;
	}

	public void setCintTrfSn(String cintTrfSn) {
		this.cintTrfSn = cintTrfSn;
	}

	public String getCcityn() {
		return ccityn;
	}

	public void setCcityn(String ccityn) {
		this.ccityn = ccityn;
	}

	public String getIntrCityn() {
		return intrCityn;
	}

	public void setIntrCityn(String intrCityn) {
		this.intrCityn = intrCityn;
	}

	public String getCsplintrc() {
		return csplintrc;
	}

	public void setCsplintrc(String csplintrc) {
		this.csplintrc = csplintrc;
	}

	public String getCintDura() {
		return cintDura;
	}

	public void setCintDura(String cintDura) {
		this.cintDura = cintDura;
	}

	public String getCwint() {
		return cwint;
	}

	public void setCwint(String cwint) {
		this.cwint = cwint;
	}

	public String getCloanInfo() {
		return cloanInfo;
	}

	public void setCloanInfo(String cloanInfo) {
		this.cloanInfo = cloanInfo;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public LocalDate getDendDat() {
		return dendDat;
	}

	public void setDendDat(LocalDate dendDat) {
		this.dendDat = dendDat;
	}

	public String getMemno() {
		return memno;
	}

	public void setMemno(String memno) {
		this.memno = memno;
	}

	public String getMemname() {
		return memname;
	}

	public void setMemname(String memname) {
		this.memname = memname;
	}

	public String getNmonth() {
		return nmonth;
	}

	public void setNmonth(String nmonth) {
		this.nmonth = nmonth;
	}

	public String getNday() {
		return nday;
	}

	public void setNday(String nday) {
		this.nday = nday;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getIsform15h() {
		return isform15h;
	}

	public void setIsform15h(String isform15h) {
		this.isform15h = isform15h;
	}

	public String getChequebookflag() {
		return chequebookflag;
	}

	public void setChequebookflag(String chequebookflag) {
		this.chequebookflag = chequebookflag;
	}

	public String getCcatagory() {
		return ccatagory;
	}

	public void setCcatagory(String ccatagory) {
		this.ccatagory = ccatagory;
	}

	public String getCacode() {
		return cacode;
	}

	public void setCacode(String cacode) {
		this.cacode = cacode;
	}

	public String getCintCal() {
		return cintCal;
	}

	public void setCintCal(String cintCal) {
		this.cintCal = cintCal;
	}

	public BigDecimal getNintTranFrq() {
		return nintTranFrq;
	}

	public void setNintTranFrq(BigDecimal nintTranFrq) {
		this.nintTranFrq = nintTranFrq;
	}

	public BigDecimal getCidNo() {
		return cidNo;
	}

	public void setCidNo(BigDecimal cidNo) {
		this.cidNo = cidNo;
	}

	public String getLienmark() {
		return lienmark;
	}

	public void setLienmark(String lienmark) {
		this.lienmark = lienmark;
	}

	public BigDecimal getLoanamt() {
		return loanamt;
	}

	public void setLoanamt(BigDecimal loanamt) {
		this.loanamt = loanamt;
	}

	public String getLoanaccno() {
		return loanaccno;
	}

	public void setLoanaccno(String loanaccno) {
		this.loanaccno = loanaccno;
	}

	public String getSmsApply() {
		return smsApply;
	}

	public void setSmsApply(String smsApply) {
		this.smsApply = smsApply;
	}
    
    
}
