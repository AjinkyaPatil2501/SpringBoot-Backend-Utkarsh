package com.utkarsh.core.model;
	import jakarta.persistence.*;
	import java.math.BigDecimal;
	import java.time.LocalDate;

	@Entity
	@Table(name = "sysctrl")
	public class SysCtrl {

		   @Id
		    @Column(name = "caddress", length = 100, nullable = false)
		    private String caddress;

		    @Column(name = "cbank_id", length = 3, nullable = false)
		    private String cbankId;

		    @Column(name = "cbank_name", length = 100, nullable = false)
		    private String cbankName;

		    @Column(name = "cbran_id", length = 3, nullable = false)
		    private String cbranId;

		    @Column(name = "cbranch", length = 100, nullable = false)
		    private String cbranch;

		    @Column(name = "ccash_code", length = 6, nullable = false)
		    private String ccashCode;

		    @Column(name = "dstart_dt")
		    private LocalDate dstartDt;

		    @Column(name = "dend_dt")
		    private LocalDate dendDt;

		    @Column(name = "dcurrent_d")
		    private LocalDate dcurrentD;

		    @Column(name = "lr_mod")
		    private Boolean lrMod;

		    @Column(name = "ncr_lst_no", length = 6)
		    private String ncrLstNo;

		    @Column(name = "ndr_lst_no", length = 6)
		    private String ndrLstNo;

		    @Column(name = "cday_beg", length = 1)
		    private String cdayBeg;

		    @Column(name = "nshr_amt", precision = 10, scale = 2)
		    private BigDecimal nshrAmt;

		    @Column(name = "nbatch_no", length = 6)
		    private String nbatchNo;

		    @Column(name = "lnormal_ex")
		    private Boolean lnormalEx;

		    @Column(name = "cweekly_of", length = 10)
		    private String cweeklyOf;

		    @Column(name = "ctran_tall", length = 1)
		    private String ctranTall;

		    @Column(name = "clang", length = 1)
		    private String clang;

		    @Column(name = "cfnt_name", length = 20)
		    private String cfntName;

		    @Column(name = "nfnt_size", precision = 1, scale = 0)
		    private Integer nfntSize;

		    @Column(name = "cman", length = 5)
		    private String cman;

		    @Column(name = "npint_day", precision = 1, scale = 0)
		    private Integer npintDay;

		    @Column(name = "nrint_day", precision = 1, scale = 0)
		    private Integer nrintDay;

		    @Column(name = "npinal_int", precision = 1, scale = 0)
		    private Integer npinalInt;

		    @Column(name = "cot_inf", length = 1)
		    private String cotInf;

		    @Column(name = "ctips", length = 1)
		    private String ctips;

		    @Column(name = "cauto_ac", length = 1)
		    private String cautoAc;

		    @Column(name = "cpatsansth", length = 4)
		    private String cpatsansth;

		    @Column(name = "cphoto_pat", length = 50)
		    private String cphotoPat;

		    @Column(name = "csign_path", length = 50)
		    private String csignPath;

		    @Column(name = "crepo_path", length = 60)
		    private String crepoPath;

		    @Column(name = "ccashier", length = 1)
		    private String ccashier;

		    @Column(name = "npsheader", precision = 1, scale = 0)
		    private Integer npsheader;

		    @Column(name = "npslnprint", precision = 2, scale = 0)
		    private Integer npslnprint;

		    @Column(name = "ninst_fact", precision = 3, scale = 2)
		    private BigDecimal ninstFact;

		    @Column(name = "dps_date")
		    private LocalDate dpsDate;

		    @Column(name = "utktype", length = 1)
		    private String utktype;

		    @Column(name = "ncapital_a", precision = 14, scale = 2)
		    private BigDecimal ncapitalA;

		    @Column(name = "cpigmy_ver", length = 8)
		    private String cpigmyVer;

		    @Column(name = "covdtype", length = 1)
		    private String covdtype;

		    @Column(name = "advmatrate", precision = 14, scale = 2)
		    private BigDecimal advmatrate;

		    @Column(name = "advintrate", precision = 14, scale = 2)
		    private BigDecimal advintrate;

		    @Column(name = "npinaltype", length = 1)
		    private String npinaltype;

		    @Column(name = "dateflag", length = 1)
		    private String dateflag;

		    @Column(name = "cpigmynm", length = 20)
		    private String cpigmynm;

		    @Column(name = "thumbprnt", length = 1)
		    private String thumbprnt;

		    @Column(name = "npa", length = 1)
		    private String npa;

		    @Column(name = "printfsize", length = 1)
		    private String printfsize;

		    @Column(name = "skippass", length = 1)
		    private String skippass;

		    @Column(name = "prov_int", length = 1)
		    private String provInt;

		    @Column(name = "npamaxamt", precision = 4, scale = 0)
		    private Integer npamaxamt;

		    @Column(name = "invreg", precision = 4, scale = 0)
		    private Integer invreg;

		    @Column(name = "clg", length = 1)
		    private String clg;

		    @Column(name = "cauto_shar", length = 1)
		    private String cautoShar;

		    @Column(name = "npre_bal", precision = 13, scale = 2)
		    private BigDecimal npreBal;

		    @Column(name = "nsh_val", precision = 9, scale = 0)
		    private BigDecimal nshVal;

		    @Column(name = "clst_dvw_n", length = 6)
		    private String clstDvwN;

		    @Column(name = "clst_dvw_s", length = 6)
		    private String clstDvwS;

		    @Column(name = "clst_sh_sr", length = 10)
		    private String clstShSr;

		    @Column(name = "clst_cert_", length = 6)
		    private String clstCert;

		    @Column(name = "cdiv_flag", length = 1)
		    private String cdivFlag;

		    @Column(name = "backpict", length = 16)
		    private String backpict;

		    @Column(name = "backtext", length = 16)
		    private String backtext;

		    @Column(name = "foretext", length = 16)
		    private String foretext;

		    @Column(name = "forelab", length = 16)
		    private String forelab;

		    @Column(name = "buttoncol", length = 16)
		    private String buttoncol;

		    @Column(name = "nbal_amt", precision = 12, scale = 2)
		    private BigDecimal nbalAmt;

		    @Column(name = "dd_pprint", length = 1)
		    private String ddPprint;

		    @Column(name = "ovdctypein", length = 1)
		    private String ovdctypein;

		    @Column(name = "ovd_atint", length = 1)
		    private String ovdAtint;

		    @Column(name = "ovd_atpint", length = 1)
		    private String ovdAtpint;

		    @Column(name = "ovd_atrint", length = 1)
		    private String ovdAtrint;

		    @Column(name = "vs_bsheet", length = 1)
		    private String vsBsheet;

		    @Column(name = "vikas", length = 1)
		    private String vikas;

		    @Column(name = "cplus", length = 1)
		    private String cplus;

		    @Column(name = "minor_age", length = 2)
		    private String minorAge;

		    @Column(name = "ccountry_name", length = 100)
		    private String ccountryName;

		    @Column(name = "cstate_name", length = 100)
		    private String cstateName;

		    @Column(name = "cdistrict_name", length = 100)
		    private String cdistrictName;

		    @Column(name = "ctaluka_name", length = 100)
		    private String ctalukaName;

		    @Column(name = "ccity_name", length = 100)
		    private String ccityName;

		    @Column(name = "denomination", length = 1)
		    private String denomination;

		    @Column(name = "cheque_validity", length = 2)
		    private String chequeValidity;

		    @Column(name = "pergrmgoldloan", precision = 7, scale = 2)
		    private BigDecimal pergrmgoldloan;

		    @Column(name = "entryinpasbokpage", length = 2)
		    private String entryinpasbokpage;

		    @Column(name = "loan_rcpt_int_date")
		    private Integer loanRcptIntDate;

		    @Column(name = "pnl_prem_depo_rate", precision = 4, scale = 2)
		    private BigDecimal pnlPremDepoRate;

		    @Column(name = "rd_pnl_flag", length = 1)
		    private String rdPnlFlag;

		    @Column(name = "rd_pnl_amt", precision = 12, scale = 2)
		    private BigDecimal rdPnlAmt;

		    @Column(name = "depo_save", length = 1)
		    private String depoSave;

		    @Column(name = "depo_term", length = 1)
		    private String depoTerm;

		    @Column(name = "tran_effect_M", length = 1)
		    private String tranEffectM;

		    @Column(name = "Flag_21", length = 1)
		    private String flag21;

		    @Column(name = "withdepoMasik", length = 1)
		    private String withdepoMasik;

		    @Column(name = "Flag_Rd", length = 1)
		    private String flagRd;

		    @Column(name = "Flag_Masik", length = 1)
		    private String flagMasik;

		    @Column(name = "Flag_Pigmy", length = 1)
		    private String flagPigmy;

		    @Column(name = "FLAG_26", length = 1)
		    private String flag26;

		    @Column(name = "Tran_Masik_M", length = 1)
		    private String tranMasikM;

		    @Column(name = "CRR", precision = 12, scale = 2)
		    private BigDecimal crr;

		    @Column(name = "SLR", precision = 12, scale = 2)
		    private BigDecimal slr;

		    @Column(name = "sms", length = 1)
		    private String sms;

			public SysCtrl(String caddress, String cbankId, String cbankName, String cbranId, String cbranch,
					String ccashCode, LocalDate dstartDt, LocalDate dendDt, LocalDate dcurrentD, Boolean lrMod,
					String ncrLstNo, String ndrLstNo, String cdayBeg, BigDecimal nshrAmt, String nbatchNo,
					Boolean lnormalEx, String cweeklyOf, String ctranTall, String clang, String cfntName,
					Integer nfntSize, String cman, Integer npintDay, Integer nrintDay, Integer npinalInt, String cotInf,
					String ctips, String cautoAc, String cpatsansth, String cphotoPat, String csignPath,
					String crepoPath, String ccashier, Integer npsheader, Integer npslnprint, BigDecimal ninstFact,
					LocalDate dpsDate, String utktype, BigDecimal ncapitalA, String cpigmyVer, String covdtype,
					BigDecimal advmatrate, BigDecimal advintrate, String npinaltype, String dateflag, String cpigmynm,
					String thumbprnt, String npa, String printfsize, String skippass, String provInt, Integer npamaxamt,
					Integer invreg, String clg, String cautoShar, BigDecimal npreBal, BigDecimal nshVal,
					String clstDvwN, String clstDvwS, String clstShSr, String clstCert, String cdivFlag,
					String backpict, String backtext, String foretext, String forelab, String buttoncol,
					BigDecimal nbalAmt, String ddPprint, String ovdctypein, String ovdAtint, String ovdAtpint,
					String ovdAtrint, String vsBsheet, String vikas, String cplus, String minorAge, String ccountryName,
					String cstateName, String cdistrictName, String ctalukaName, String ccityName, String denomination,
					String chequeValidity, BigDecimal pergrmgoldloan, String entryinpasbokpage, Integer loanRcptIntDate,
					BigDecimal pnlPremDepoRate, String rdPnlFlag, BigDecimal rdPnlAmt, String depoSave, String depoTerm,
					String tranEffectM, String flag21, String withdepoMasik, String flagRd, String flagMasik,
					String flagPigmy, String flag26, String tranMasikM, BigDecimal crr, BigDecimal slr, String sms) {
				super();
				this.caddress = caddress;
				this.cbankId = cbankId;
				this.cbankName = cbankName;
				this.cbranId = cbranId;
				this.cbranch = cbranch;
				this.ccashCode = ccashCode;
				this.dstartDt = dstartDt;
				this.dendDt = dendDt;
				this.dcurrentD = dcurrentD;
				this.lrMod = lrMod;
				this.ncrLstNo = ncrLstNo;
				this.ndrLstNo = ndrLstNo;
				this.cdayBeg = cdayBeg;
				this.nshrAmt = nshrAmt;
				this.nbatchNo = nbatchNo;
				this.lnormalEx = lnormalEx;
				this.cweeklyOf = cweeklyOf;
				this.ctranTall = ctranTall;
				this.clang = clang;
				this.cfntName = cfntName;
				this.nfntSize = nfntSize;
				this.cman = cman;
				this.npintDay = npintDay;
				this.nrintDay = nrintDay;
				this.npinalInt = npinalInt;
				this.cotInf = cotInf;
				this.ctips = ctips;
				this.cautoAc = cautoAc;
				this.cpatsansth = cpatsansth;
				this.cphotoPat = cphotoPat;
				this.csignPath = csignPath;
				this.crepoPath = crepoPath;
				this.ccashier = ccashier;
				this.npsheader = npsheader;
				this.npslnprint = npslnprint;
				this.ninstFact = ninstFact;
				this.dpsDate = dpsDate;
				this.utktype = utktype;
				this.ncapitalA = ncapitalA;
				this.cpigmyVer = cpigmyVer;
				this.covdtype = covdtype;
				this.advmatrate = advmatrate;
				this.advintrate = advintrate;
				this.npinaltype = npinaltype;
				this.dateflag = dateflag;
				this.cpigmynm = cpigmynm;
				this.thumbprnt = thumbprnt;
				this.npa = npa;
				this.printfsize = printfsize;
				this.skippass = skippass;
				this.provInt = provInt;
				this.npamaxamt = npamaxamt;
				this.invreg = invreg;
				this.clg = clg;
				this.cautoShar = cautoShar;
				this.npreBal = npreBal;
				this.nshVal = nshVal;
				this.clstDvwN = clstDvwN;
				this.clstDvwS = clstDvwS;
				this.clstShSr = clstShSr;
				this.clstCert = clstCert;
				this.cdivFlag = cdivFlag;
				this.backpict = backpict;
				this.backtext = backtext;
				this.foretext = foretext;
				this.forelab = forelab;
				this.buttoncol = buttoncol;
				this.nbalAmt = nbalAmt;
				this.ddPprint = ddPprint;
				this.ovdctypein = ovdctypein;
				this.ovdAtint = ovdAtint;
				this.ovdAtpint = ovdAtpint;
				this.ovdAtrint = ovdAtrint;
				this.vsBsheet = vsBsheet;
				this.vikas = vikas;
				this.cplus = cplus;
				this.minorAge = minorAge;
				this.ccountryName = ccountryName;
				this.cstateName = cstateName;
				this.cdistrictName = cdistrictName;
				this.ctalukaName = ctalukaName;
				this.ccityName = ccityName;
				this.denomination = denomination;
				this.chequeValidity = chequeValidity;
				this.pergrmgoldloan = pergrmgoldloan;
				this.entryinpasbokpage = entryinpasbokpage;
				this.loanRcptIntDate = loanRcptIntDate;
				this.pnlPremDepoRate = pnlPremDepoRate;
				this.rdPnlFlag = rdPnlFlag;
				this.rdPnlAmt = rdPnlAmt;
				this.depoSave = depoSave;
				this.depoTerm = depoTerm;
				this.tranEffectM = tranEffectM;
				this.flag21 = flag21;
				this.withdepoMasik = withdepoMasik;
				this.flagRd = flagRd;
				this.flagMasik = flagMasik;
				this.flagPigmy = flagPigmy;
				this.flag26 = flag26;
				this.tranMasikM = tranMasikM;
				this.crr = crr;
				this.slr = slr;
				this.sms = sms;
			}

			public SysCtrl() {
				super();
			}

			public String getCaddress() {
				return caddress;
			}

			public void setCaddress(String caddress) {
				this.caddress = caddress;
			}

			public String getCbankId() {
				return cbankId;
			}

			public void setCbankId(String cbankId) {
				this.cbankId = cbankId;
			}

			public String getCbankName() {
				return cbankName;
			}

			public void setCbankName(String cbankName) {
				this.cbankName = cbankName;
			}

			public String getCbranId() {
				return cbranId;
			}

			public void setCbranId(String cbranId) {
				this.cbranId = cbranId;
			}

			public String getCbranch() {
				return cbranch;
			}

			public void setCbranch(String cbranch) {
				this.cbranch = cbranch;
			}

			public String getCcashCode() {
				return ccashCode;
			}

			public void setCcashCode(String ccashCode) {
				this.ccashCode = ccashCode;
			}

			public LocalDate getDstartDt() {
				return dstartDt;
			}

			public void setDstartDt(LocalDate dstartDt) {
				this.dstartDt = dstartDt;
			}

			public LocalDate getDendDt() {
				return dendDt;
			}

			public void setDendDt(LocalDate dendDt) {
				this.dendDt = dendDt;
			}

			public LocalDate getDcurrentD() {
				return dcurrentD;
			}

			public void setDcurrentD(LocalDate dcurrentD) {
				this.dcurrentD = dcurrentD;
			}

			public Boolean getLrMod() {
				return lrMod;
			}

			public void setLrMod(Boolean lrMod) {
				this.lrMod = lrMod;
			}

			public String getNcrLstNo() {
				return ncrLstNo;
			}

			public void setNcrLstNo(String ncrLstNo) {
				this.ncrLstNo = ncrLstNo;
			}

			public String getNdrLstNo() {
				return ndrLstNo;
			}

			public void setNdrLstNo(String ndrLstNo) {
				this.ndrLstNo = ndrLstNo;
			}

			public String getCdayBeg() {
				return cdayBeg;
			}

			public void setCdayBeg(String cdayBeg) {
				this.cdayBeg = cdayBeg;
			}

			public BigDecimal getNshrAmt() {
				return nshrAmt;
			}

			public void setNshrAmt(BigDecimal nshrAmt) {
				this.nshrAmt = nshrAmt;
			}

			public String getNbatchNo() {
				return nbatchNo;
			}

			public void setNbatchNo(String nbatchNo) {
				this.nbatchNo = nbatchNo;
			}

			public Boolean getLnormalEx() {
				return lnormalEx;
			}

			public void setLnormalEx(Boolean lnormalEx) {
				this.lnormalEx = lnormalEx;
			}

			public String getCweeklyOf() {
				return cweeklyOf;
			}

			public void setCweeklyOf(String cweeklyOf) {
				this.cweeklyOf = cweeklyOf;
			}

			public String getCtranTall() {
				return ctranTall;
			}

			public void setCtranTall(String ctranTall) {
				this.ctranTall = ctranTall;
			}

			public String getClang() {
				return clang;
			}

			public void setClang(String clang) {
				this.clang = clang;
			}

			public String getCfntName() {
				return cfntName;
			}

			public void setCfntName(String cfntName) {
				this.cfntName = cfntName;
			}

			public Integer getNfntSize() {
				return nfntSize;
			}

			public void setNfntSize(Integer nfntSize) {
				this.nfntSize = nfntSize;
			}

			public String getCman() {
				return cman;
			}

			public void setCman(String cman) {
				this.cman = cman;
			}

			public Integer getNpintDay() {
				return npintDay;
			}

			public void setNpintDay(Integer npintDay) {
				this.npintDay = npintDay;
			}

			public Integer getNrintDay() {
				return nrintDay;
			}

			public void setNrintDay(Integer nrintDay) {
				this.nrintDay = nrintDay;
			}

			public Integer getNpinalInt() {
				return npinalInt;
			}

			public void setNpinalInt(Integer npinalInt) {
				this.npinalInt = npinalInt;
			}

			public String getCotInf() {
				return cotInf;
			}

			public void setCotInf(String cotInf) {
				this.cotInf = cotInf;
			}

			public String getCtips() {
				return ctips;
			}

			public void setCtips(String ctips) {
				this.ctips = ctips;
			}

			public String getCautoAc() {
				return cautoAc;
			}

			public void setCautoAc(String cautoAc) {
				this.cautoAc = cautoAc;
			}

			public String getCpatsansth() {
				return cpatsansth;
			}

			public void setCpatsansth(String cpatsansth) {
				this.cpatsansth = cpatsansth;
			}

			public String getCphotoPat() {
				return cphotoPat;
			}

			public void setCphotoPat(String cphotoPat) {
				this.cphotoPat = cphotoPat;
			}

			public String getCsignPath() {
				return csignPath;
			}

			public void setCsignPath(String csignPath) {
				this.csignPath = csignPath;
			}

			public String getCrepoPath() {
				return crepoPath;
			}

			public void setCrepoPath(String crepoPath) {
				this.crepoPath = crepoPath;
			}

			public String getCcashier() {
				return ccashier;
			}

			public void setCcashier(String ccashier) {
				this.ccashier = ccashier;
			}

			public Integer getNpsheader() {
				return npsheader;
			}

			public void setNpsheader(Integer npsheader) {
				this.npsheader = npsheader;
			}

			public Integer getNpslnprint() {
				return npslnprint;
			}

			public void setNpslnprint(Integer npslnprint) {
				this.npslnprint = npslnprint;
			}

			public BigDecimal getNinstFact() {
				return ninstFact;
			}

			public void setNinstFact(BigDecimal ninstFact) {
				this.ninstFact = ninstFact;
			}

			public LocalDate getDpsDate() {
				return dpsDate;
			}

			public void setDpsDate(LocalDate dpsDate) {
				this.dpsDate = dpsDate;
			}

			public String getUtktype() {
				return utktype;
			}

			public void setUtktype(String utktype) {
				this.utktype = utktype;
			}

			public BigDecimal getNcapitalA() {
				return ncapitalA;
			}

			public void setNcapitalA(BigDecimal ncapitalA) {
				this.ncapitalA = ncapitalA;
			}

			public String getCpigmyVer() {
				return cpigmyVer;
			}

			public void setCpigmyVer(String cpigmyVer) {
				this.cpigmyVer = cpigmyVer;
			}

			public String getCovdtype() {
				return covdtype;
			}

			public void setCovdtype(String covdtype) {
				this.covdtype = covdtype;
			}

			public BigDecimal getAdvmatrate() {
				return advmatrate;
			}

			public void setAdvmatrate(BigDecimal advmatrate) {
				this.advmatrate = advmatrate;
			}

			public BigDecimal getAdvintrate() {
				return advintrate;
			}

			public void setAdvintrate(BigDecimal advintrate) {
				this.advintrate = advintrate;
			}

			public String getNpinaltype() {
				return npinaltype;
			}

			public void setNpinaltype(String npinaltype) {
				this.npinaltype = npinaltype;
			}

			public String getDateflag() {
				return dateflag;
			}

			public void setDateflag(String dateflag) {
				this.dateflag = dateflag;
			}

			public String getCpigmynm() {
				return cpigmynm;
			}

			public void setCpigmynm(String cpigmynm) {
				this.cpigmynm = cpigmynm;
			}

			public String getThumbprnt() {
				return thumbprnt;
			}

			public void setThumbprnt(String thumbprnt) {
				this.thumbprnt = thumbprnt;
			}

			public String getNpa() {
				return npa;
			}

			public void setNpa(String npa) {
				this.npa = npa;
			}

			public String getPrintfsize() {
				return printfsize;
			}

			public void setPrintfsize(String printfsize) {
				this.printfsize = printfsize;
			}

			public String getSkippass() {
				return skippass;
			}

			public void setSkippass(String skippass) {
				this.skippass = skippass;
			}

			public String getProvInt() {
				return provInt;
			}

			public void setProvInt(String provInt) {
				this.provInt = provInt;
			}

			public Integer getNpamaxamt() {
				return npamaxamt;
			}

			public void setNpamaxamt(Integer npamaxamt) {
				this.npamaxamt = npamaxamt;
			}

			public Integer getInvreg() {
				return invreg;
			}

			public void setInvreg(Integer invreg) {
				this.invreg = invreg;
			}

			public String getClg() {
				return clg;
			}

			public void setClg(String clg) {
				this.clg = clg;
			}

			public String getCautoShar() {
				return cautoShar;
			}

			public void setCautoShar(String cautoShar) {
				this.cautoShar = cautoShar;
			}

			public BigDecimal getNpreBal() {
				return npreBal;
			}

			public void setNpreBal(BigDecimal npreBal) {
				this.npreBal = npreBal;
			}

			public BigDecimal getNshVal() {
				return nshVal;
			}

			public void setNshVal(BigDecimal nshVal) {
				this.nshVal = nshVal;
			}

			public String getClstDvwN() {
				return clstDvwN;
			}

			public void setClstDvwN(String clstDvwN) {
				this.clstDvwN = clstDvwN;
			}

			public String getClstDvwS() {
				return clstDvwS;
			}

			public void setClstDvwS(String clstDvwS) {
				this.clstDvwS = clstDvwS;
			}

			public String getClstShSr() {
				return clstShSr;
			}

			public void setClstShSr(String clstShSr) {
				this.clstShSr = clstShSr;
			}

			public String getClstCert() {
				return clstCert;
			}

			public void setClstCert(String clstCert) {
				this.clstCert = clstCert;
			}

			public String getCdivFlag() {
				return cdivFlag;
			}

			public void setCdivFlag(String cdivFlag) {
				this.cdivFlag = cdivFlag;
			}

			public String getBackpict() {
				return backpict;
			}

			public void setBackpict(String backpict) {
				this.backpict = backpict;
			}

			public String getBacktext() {
				return backtext;
			}

			public void setBacktext(String backtext) {
				this.backtext = backtext;
			}

			public String getForetext() {
				return foretext;
			}

			public void setForetext(String foretext) {
				this.foretext = foretext;
			}

			public String getForelab() {
				return forelab;
			}

			public void setForelab(String forelab) {
				this.forelab = forelab;
			}

			public String getButtoncol() {
				return buttoncol;
			}

			public void setButtoncol(String buttoncol) {
				this.buttoncol = buttoncol;
			}

			public BigDecimal getNbalAmt() {
				return nbalAmt;
			}

			public void setNbalAmt(BigDecimal nbalAmt) {
				this.nbalAmt = nbalAmt;
			}

			public String getDdPprint() {
				return ddPprint;
			}

			public void setDdPprint(String ddPprint) {
				this.ddPprint = ddPprint;
			}

			public String getOvdctypein() {
				return ovdctypein;
			}

			public void setOvdctypein(String ovdctypein) {
				this.ovdctypein = ovdctypein;
			}

			public String getOvdAtint() {
				return ovdAtint;
			}

			public void setOvdAtint(String ovdAtint) {
				this.ovdAtint = ovdAtint;
			}

			public String getOvdAtpint() {
				return ovdAtpint;
			}

			public void setOvdAtpint(String ovdAtpint) {
				this.ovdAtpint = ovdAtpint;
			}

			public String getOvdAtrint() {
				return ovdAtrint;
			}

			public void setOvdAtrint(String ovdAtrint) {
				this.ovdAtrint = ovdAtrint;
			}

			public String getVsBsheet() {
				return vsBsheet;
			}

			public void setVsBsheet(String vsBsheet) {
				this.vsBsheet = vsBsheet;
			}

			public String getVikas() {
				return vikas;
			}

			public void setVikas(String vikas) {
				this.vikas = vikas;
			}

			public String getCplus() {
				return cplus;
			}

			public void setCplus(String cplus) {
				this.cplus = cplus;
			}

			public String getMinorAge() {
				return minorAge;
			}

			public void setMinorAge(String minorAge) {
				this.minorAge = minorAge;
			}

			public String getCcountryName() {
				return ccountryName;
			}

			public void setCcountryName(String ccountryName) {
				this.ccountryName = ccountryName;
			}

			public String getCstateName() {
				return cstateName;
			}

			public void setCstateName(String cstateName) {
				this.cstateName = cstateName;
			}

			public String getCdistrictName() {
				return cdistrictName;
			}

			public void setCdistrictName(String cdistrictName) {
				this.cdistrictName = cdistrictName;
			}

			public String getCtalukaName() {
				return ctalukaName;
			}

			public void setCtalukaName(String ctalukaName) {
				this.ctalukaName = ctalukaName;
			}

			public String getCcityName() {
				return ccityName;
			}

			public void setCcityName(String ccityName) {
				this.ccityName = ccityName;
			}

			public String getDenomination() {
				return denomination;
			}

			public void setDenomination(String denomination) {
				this.denomination = denomination;
			}

			public String getChequeValidity() {
				return chequeValidity;
			}

			public void setChequeValidity(String chequeValidity) {
				this.chequeValidity = chequeValidity;
			}

			public BigDecimal getPergrmgoldloan() {
				return pergrmgoldloan;
			}

			public void setPergrmgoldloan(BigDecimal pergrmgoldloan) {
				this.pergrmgoldloan = pergrmgoldloan;
			}

			public String getEntryinpasbokpage() {
				return entryinpasbokpage;
			}

			public void setEntryinpasbokpage(String entryinpasbokpage) {
				this.entryinpasbokpage = entryinpasbokpage;
			}

			public Integer getLoanRcptIntDate() {
				return loanRcptIntDate;
			}

			public void setLoanRcptIntDate(Integer loanRcptIntDate) {
				this.loanRcptIntDate = loanRcptIntDate;
			}

			public BigDecimal getPnlPremDepoRate() {
				return pnlPremDepoRate;
			}

			public void setPnlPremDepoRate(BigDecimal pnlPremDepoRate) {
				this.pnlPremDepoRate = pnlPremDepoRate;
			}

			public String getRdPnlFlag() {
				return rdPnlFlag;
			}

			public void setRdPnlFlag(String rdPnlFlag) {
				this.rdPnlFlag = rdPnlFlag;
			}

			public BigDecimal getRdPnlAmt() {
				return rdPnlAmt;
			}

			public void setRdPnlAmt(BigDecimal rdPnlAmt) {
				this.rdPnlAmt = rdPnlAmt;
			}

			public String getDepoSave() {
				return depoSave;
			}

			public void setDepoSave(String depoSave) {
				this.depoSave = depoSave;
			}

			public String getDepoTerm() {
				return depoTerm;
			}

			public void setDepoTerm(String depoTerm) {
				this.depoTerm = depoTerm;
			}

			public String getTranEffectM() {
				return tranEffectM;
			}

			public void setTranEffectM(String tranEffectM) {
				this.tranEffectM = tranEffectM;
			}

			public String getFlag21() {
				return flag21;
			}

			public void setFlag21(String flag21) {
				this.flag21 = flag21;
			}

			public String getWithdepoMasik() {
				return withdepoMasik;
			}

			public void setWithdepoMasik(String withdepoMasik) {
				this.withdepoMasik = withdepoMasik;
			}

			public String getFlagRd() {
				return flagRd;
			}

			public void setFlagRd(String flagRd) {
				this.flagRd = flagRd;
			}

			public String getFlagMasik() {
				return flagMasik;
			}

			public void setFlagMasik(String flagMasik) {
				this.flagMasik = flagMasik;
			}

			public String getFlagPigmy() {
				return flagPigmy;
			}

			public void setFlagPigmy(String flagPigmy) {
				this.flagPigmy = flagPigmy;
			}

			public String getFlag26() {
				return flag26;
			}

			public void setFlag26(String flag26) {
				this.flag26 = flag26;
			}

			public String getTranMasikM() {
				return tranMasikM;
			}

			public void setTranMasikM(String tranMasikM) {
				this.tranMasikM = tranMasikM;
			}

			public BigDecimal getCrr() {
				return crr;
			}

			public void setCrr(BigDecimal crr) {
				this.crr = crr;
			}

			public BigDecimal getSlr() {
				return slr;
			}

			public void setSlr(BigDecimal slr) {
				this.slr = slr;
			}

			public String getSms() {
				return sms;
			}

			public void setSms(String sms) {
				this.sms = sms;
			}

}
