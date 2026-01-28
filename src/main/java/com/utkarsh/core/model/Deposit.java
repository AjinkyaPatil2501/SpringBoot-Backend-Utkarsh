package com.utkarsh.core.model;


import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "deposit")
public class Deposit {
	
	    @Id
	    @Column(name = "caccount_no", length = 20)
	    private String accountNo;
	    
	    @Column(name = "cjoint", length = 10)
	    private String joint;
	    
	    @Column(name = "cadd1", length = 200)
	    private String address;
	    
	    @Column(name = "cphone", length = 15)
	    private String phone;
	    
	    @Column(name = "cmember_no", length = 20)
	    private String memberNo;
	    
	    @Column(name = "dstart_dat")
	    private LocalDate startDate;
	    
	    @Column(name = "dfirst_dat")
	    private LocalDate firstDate;
	    
	    @Column(name = "cnomineenm", length = 200)
	    private String nomineeName;
	    
	    @Column(name = "nmatu_amt", precision = 15, scale = 2)
	    private BigDecimal maturityAmount;
	    
	    @Column(name = "cfd_receip", length = 100)
	    private String fdReceipt;
	    
	    @Column(name = "cint_trf_g", length = 6)
	    private String intTransferG;
	    
	    @Column(name = "cint_trf_s", length = 8)
	    private String intTransferS;
	    
	    @Column(name = "cprint_fd", length = 1)
	    private String printFd;
	    
	    @Column(name = "cauto_rene", length = 100)
	    private String autoRenewal;
	    
	    @Column(name = "cmemb_type", length = 1)
	    private String memberType;
	    
	    @Column(name = "cdir_code", length = 6)
	    private String directorCode;
	    
	    @Column(name = "intr_name", length = 200)
	    private String introducerName;
	    
	    @Column(name = "intr_add1", length = 200)
	    private String introducerAddress;
	    
	    @Column(name = "intr_cityc", length = 6)
	    private String introducerCityCode;
	    
	    @Column(name = "cproc_rec2", length = 1)
	    private String procRec2;
	    
	    @Column(name = "cproc_rec1", length = 1)
	    private String procRec1;
	    
	    @Column(name = "crelation", length = 200)
	    private String relation;
	    
	    @Column(name = "acc_name", length = 200)
	    private String accountName;
	    
	    @Column(name = "cdir_name", length = 200)
	    private String directorName;
	    
	    @Column(name = "sdue_date")
	    private LocalDate dueDate;
	    
	    @Column(name = "sint_rate", precision = 15, scale = 2)
	    private BigDecimal savingsIntRate;
	    
	    @Column(name = "fint_rate", precision = 15, scale = 2)
	    private BigDecimal intRate;
	    
	    @Column(name = "stod_limit", precision = 15, scale = 2)
	    private BigDecimal simpleTodLimit;
	    
	    @Column(name = "dtod_limit", precision = 15, scale = 2)
	    private BigDecimal dailyTodLimit;
	    
	    @Column(name = "stod_int", precision = 15, scale = 2)
	    private BigDecimal simpleTodInt;
	    
	    @Column(name = "schq_allow", length = 1)
	    private String chequeAllow;
	    
	    @Column(name = "fdepo_amt", precision = 15, scale = 2)
	    private BigDecimal depositAmount;
	    
	    @Column(name = "sdepo_amt", precision = 15, scale = 2)
	    private BigDecimal savingsDepositAmount;
	    
	    @Column(name = "this_date")
	    private LocalDate thisDate;
	    
	    @Column(name = "cint_trf_gn", length = 45)
	    private String intTransferGn;
	    
	    @Column(name = "cint_trf_sn", length = 45)
	    private String intTransferSn;
	    
	    @Column(name = "ccityn", length = 200)
	    private String cityName;
	    
	    @Column(name = "intr_cityn", length = 200)
	    private String introducerCityName;
	    
	    @Column(name = "csplintrc", length = 200)
	    private String specialInstruction;
	    
	    @Column(name = "cint_dura", length = 50)
	    private String interestDuration;
	    
	    @Column(name = "cwint", length = 1)
	    private String withInterest;
	    
	    @Column(name = "cloan_info", length = 200)
	    private String loanInfo;
	    
	    @Column(name = "mem_name", length = 200)
	    private String memName;
	    
	    @Column(name = "dend_dat")
	    private LocalDate endDate;
	    
	    @Column(name = "memno", length = 20)
	    private String memNo;
	    
	    @Column(name = "memname", length = 200)
	    private String memName2;
	    
	    @Column(name = "nmonth", length = 6)
	    private String months;
	    
	    @Column(name = "nday", length = 6)
	    private String days;
	    
	    @Column(name = "customer_id", length = 12)
	    private String customerId;
	    
	    @Column(name = "isform15h", length = 1)
	    private String isForm15h;
	    
	    @Column(name = "chequebookflag", length = 1)
	    private String chequeBookFlag;
	    
	    @Column(name = "ccatagory", length = 1)
	    private String category;
	    
	    @Column(name = "cacode", length = 6)
	    private String acCode;
	    
	    @Column(name = "cint_cal", length = 1)
	    private String intCalculation;
	    
	    @Column(name = "nint_tran_frq", precision = 2, scale = 0)
	    private BigDecimal intTransferFreq;
	    
	    @Column(name = "cid_no", precision = 5, scale = 0)
	    private BigDecimal idNo;
	    
	    @Column(name = "lienmark", length = 1)
	    private String lienMark;
	    
	    @Column(name = "Loanamt", precision = 15, scale = 2)
	    private BigDecimal loanAmount;
	    
	    @Column(name = "Loanaccno", length = 20)
	    private String loanAccountNo;
	    
	    @Column(name = "SMS_APPLY", length = 1)
	    private String smsApply;

		public Deposit() {
			super();
		}

		public Deposit(String accountNo, String joint, String address, String phone, String memberNo,
				LocalDate startDate, LocalDate firstDate, String nomineeName, BigDecimal maturityAmount,
				String fdReceipt, String intTransferG, String intTransferS, String printFd, String autoRenewal,
				String memberType, String directorCode, String introducerName, String introducerAddress,
				String introducerCityCode, String procRec2, String procRec1, String relation, String accountName,
				String directorName, LocalDate dueDate, BigDecimal savingsIntRate, BigDecimal intRate,
				BigDecimal simpleTodLimit, BigDecimal dailyTodLimit, BigDecimal simpleTodInt, String chequeAllow,
				BigDecimal depositAmount, BigDecimal savingsDepositAmount, LocalDate thisDate, String intTransferGn,
				String intTransferSn, String cityName, String introducerCityName, String specialInstruction,
				String interestDuration, String withInterest, String loanInfo, String memName, LocalDate endDate,
				String memNo, String memName2, String months, String days, String customerId, String isForm15h,
				String chequeBookFlag, String category, String acCode, String intCalculation,
				BigDecimal intTransferFreq, BigDecimal idNo, String lienMark, BigDecimal loanAmount,
				String loanAccountNo, String smsApply) {
			super();
			this.accountNo = accountNo;
			this.joint = joint;
			this.address = address;
			this.phone = phone;
			this.memberNo = memberNo;
			this.startDate = startDate;
			this.firstDate = firstDate;
			this.nomineeName = nomineeName;
			this.maturityAmount = maturityAmount;
			this.fdReceipt = fdReceipt;
			this.intTransferG = intTransferG;
			this.intTransferS = intTransferS;
			this.printFd = printFd;
			this.autoRenewal = autoRenewal;
			this.memberType = memberType;
			this.directorCode = directorCode;
			this.introducerName = introducerName;
			this.introducerAddress = introducerAddress;
			this.introducerCityCode = introducerCityCode;
			this.procRec2 = procRec2;
			this.procRec1 = procRec1;
			this.relation = relation;
			this.accountName = accountName;
			this.directorName = directorName;
			this.dueDate = dueDate;
			this.savingsIntRate = savingsIntRate;
			this.intRate = intRate;
			this.simpleTodLimit = simpleTodLimit;
			this.dailyTodLimit = dailyTodLimit;
			this.simpleTodInt = simpleTodInt;
			this.chequeAllow = chequeAllow;
			this.depositAmount = depositAmount;
			this.savingsDepositAmount = savingsDepositAmount;
			this.thisDate = thisDate;
			this.intTransferGn = intTransferGn;
			this.intTransferSn = intTransferSn;
			this.cityName = cityName;
			this.introducerCityName = introducerCityName;
			this.specialInstruction = specialInstruction;
			this.interestDuration = interestDuration;
			this.withInterest = withInterest;
			this.loanInfo = loanInfo;
			this.memName = memName;
			this.endDate = endDate;
			this.memNo = memNo;
			this.memName2 = memName2;
			this.months = months;
			this.days = days;
			this.customerId = customerId;
			this.isForm15h = isForm15h;
			this.chequeBookFlag = chequeBookFlag;
			this.category = category;
			this.acCode = acCode;
			this.intCalculation = intCalculation;
			this.intTransferFreq = intTransferFreq;
			this.idNo = idNo;
			this.lienMark = lienMark;
			this.loanAmount = loanAmount;
			this.loanAccountNo = loanAccountNo;
			this.smsApply = smsApply;
		}

		public String getAccountNo() {
			return accountNo;
		}

		public void setAccountNo(String accountNo) {
			this.accountNo = accountNo;
		}

		public String getJoint() {
			return joint;
		}

		public void setJoint(String joint) {
			this.joint = joint;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getMemberNo() {
			return memberNo;
		}

		public void setMemberNo(String memberNo) {
			this.memberNo = memberNo;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getFirstDate() {
			return firstDate;
		}

		public void setFirstDate(LocalDate firstDate) {
			this.firstDate = firstDate;
		}

		public String getNomineeName() {
			return nomineeName;
		}

		public void setNomineeName(String nomineeName) {
			this.nomineeName = nomineeName;
		}

		public BigDecimal getMaturityAmount() {
			return maturityAmount;
		}

		public void setMaturityAmount(BigDecimal maturityAmount) {
			this.maturityAmount = maturityAmount;
		}

		public String getFdReceipt() {
			return fdReceipt;
		}

		public void setFdReceipt(String fdReceipt) {
			this.fdReceipt = fdReceipt;
		}

		public String getIntTransferG() {
			return intTransferG;
		}

		public void setIntTransferG(String intTransferG) {
			this.intTransferG = intTransferG;
		}

		public String getIntTransferS() {
			return intTransferS;
		}

		public void setIntTransferS(String intTransferS) {
			this.intTransferS = intTransferS;
		}

		public String getPrintFd() {
			return printFd;
		}

		public void setPrintFd(String printFd) {
			this.printFd = printFd;
		}

		public String getAutoRenewal() {
			return autoRenewal;
		}

		public void setAutoRenewal(String autoRenewal) {
			this.autoRenewal = autoRenewal;
		}

		public String getMemberType() {
			return memberType;
		}

		public void setMemberType(String memberType) {
			this.memberType = memberType;
		}

		public String getDirectorCode() {
			return directorCode;
		}

		public void setDirectorCode(String directorCode) {
			this.directorCode = directorCode;
		}

		public String getIntroducerName() {
			return introducerName;
		}

		public void setIntroducerName(String introducerName) {
			this.introducerName = introducerName;
		}

		public String getIntroducerAddress() {
			return introducerAddress;
		}

		public void setIntroducerAddress(String introducerAddress) {
			this.introducerAddress = introducerAddress;
		}

		public String getIntroducerCityCode() {
			return introducerCityCode;
		}

		public void setIntroducerCityCode(String introducerCityCode) {
			this.introducerCityCode = introducerCityCode;
		}

		public String getProcRec2() {
			return procRec2;
		}

		public void setProcRec2(String procRec2) {
			this.procRec2 = procRec2;
		}

		public String getProcRec1() {
			return procRec1;
		}

		public void setProcRec1(String procRec1) {
			this.procRec1 = procRec1;
		}

		public String getRelation() {
			return relation;
		}

		public void setRelation(String relation) {
			this.relation = relation;
		}

		public String getAccountName() {
			return accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public String getDirectorName() {
			return directorName;
		}

		public void setDirectorName(String directorName) {
			this.directorName = directorName;
		}

		public LocalDate getDueDate() {
			return dueDate;
		}

		public void setDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
		}

		public BigDecimal getSavingsIntRate() {
			return savingsIntRate;
		}

		public void setSavingsIntRate(BigDecimal savingsIntRate) {
			this.savingsIntRate = savingsIntRate;
		}

		public BigDecimal getIntRate() {
			return intRate;
		}

		public void setIntRate(BigDecimal intRate) {
			this.intRate = intRate;
		}

		public BigDecimal getSimpleTodLimit() {
			return simpleTodLimit;
		}

		public void setSimpleTodLimit(BigDecimal simpleTodLimit) {
			this.simpleTodLimit = simpleTodLimit;
		}

		public BigDecimal getDailyTodLimit() {
			return dailyTodLimit;
		}

		public void setDailyTodLimit(BigDecimal dailyTodLimit) {
			this.dailyTodLimit = dailyTodLimit;
		}

		public BigDecimal getSimpleTodInt() {
			return simpleTodInt;
		}

		public void setSimpleTodInt(BigDecimal simpleTodInt) {
			this.simpleTodInt = simpleTodInt;
		}

		public String getChequeAllow() {
			return chequeAllow;
		}

		public void setChequeAllow(String chequeAllow) {
			this.chequeAllow = chequeAllow;
		}

		public BigDecimal getDepositAmount() {
			return depositAmount;
		}

		public void setDepositAmount(BigDecimal depositAmount) {
			this.depositAmount = depositAmount;
		}

		public BigDecimal getSavingsDepositAmount() {
			return savingsDepositAmount;
		}

		public void setSavingsDepositAmount(BigDecimal savingsDepositAmount) {
			this.savingsDepositAmount = savingsDepositAmount;
		}

		public LocalDate getThisDate() {
			return thisDate;
		}

		public void setThisDate(LocalDate thisDate) {
			this.thisDate = thisDate;
		}

		public String getIntTransferGn() {
			return intTransferGn;
		}

		public void setIntTransferGn(String intTransferGn) {
			this.intTransferGn = intTransferGn;
		}

		public String getIntTransferSn() {
			return intTransferSn;
		}

		public void setIntTransferSn(String intTransferSn) {
			this.intTransferSn = intTransferSn;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getIntroducerCityName() {
			return introducerCityName;
		}

		public void setIntroducerCityName(String introducerCityName) {
			this.introducerCityName = introducerCityName;
		}

		public String getSpecialInstruction() {
			return specialInstruction;
		}

		public void setSpecialInstruction(String specialInstruction) {
			this.specialInstruction = specialInstruction;
		}

		public String getInterestDuration() {
			return interestDuration;
		}

		public void setInterestDuration(String interestDuration) {
			this.interestDuration = interestDuration;
		}

		public String getWithInterest() {
			return withInterest;
		}

		public void setWithInterest(String withInterest) {
			this.withInterest = withInterest;
		}

		public String getLoanInfo() {
			return loanInfo;
		}

		public void setLoanInfo(String loanInfo) {
			this.loanInfo = loanInfo;
		}

		public String getMemName() {
			return memName;
		}

		public void setMemName(String memName) {
			this.memName = memName;
		}

		public LocalDate getEndDate() {
			return endDate;
		}

		public void setEndDate(LocalDate endDate) {
			this.endDate = endDate;
		}

		public String getMemNo() {
			return memNo;
		}

		public void setMemNo(String memNo) {
			this.memNo = memNo;
		}

		public String getMemName2() {
			return memName2;
		}

		public void setMemName2(String memName2) {
			this.memName2 = memName2;
		}

		public String getMonths() {
			return months;
		}

		public void setMonths(String months) {
			this.months = months;
		}

		public String getDays() {
			return days;
		}

		public void setDays(String days) {
			this.days = days;
		}

		public String getCustomerId() {
			return customerId;
		}

		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}

		public String getIsForm15h() {
			return isForm15h;
		}

		public void setIsForm15h(String isForm15h) {
			this.isForm15h = isForm15h;
		}

		public String getChequeBookFlag() {
			return chequeBookFlag;
		}

		public void setChequeBookFlag(String chequeBookFlag) {
			this.chequeBookFlag = chequeBookFlag;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getAcCode() {
			return acCode;
		}

		public void setAcCode(String acCode) {
			this.acCode = acCode;
		}

		public String getIntCalculation() {
			return intCalculation;
		}

		public void setIntCalculation(String intCalculation) {
			this.intCalculation = intCalculation;
		}

		public BigDecimal getIntTransferFreq() {
			return intTransferFreq;
		}

		public void setIntTransferFreq(BigDecimal intTransferFreq) {
			this.intTransferFreq = intTransferFreq;
		}

		public BigDecimal getIdNo() {
			return idNo;
		}

		public void setIdNo(BigDecimal idNo) {
			this.idNo = idNo;
		}

		public String getLienMark() {
			return lienMark;
		}

		public void setLienMark(String lienMark) {
			this.lienMark = lienMark;
		}

		public BigDecimal getLoanAmount() {
			return loanAmount;
		}

		public void setLoanAmount(BigDecimal loanAmount) {
			this.loanAmount = loanAmount;
		}

		public String getLoanAccountNo() {
			return loanAccountNo;
		}

		public void setLoanAccountNo(String loanAccountNo) {
			this.loanAccountNo = loanAccountNo;
		}

		public String getSmsApply() {
			return smsApply;
		}

		public void setSmsApply(String smsApply) {
			this.smsApply = smsApply;
		}

		
		   
	    
	
}
