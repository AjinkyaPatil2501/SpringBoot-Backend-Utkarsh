package com.utkarsh.core.dto;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor

public class DepositDTO {

	    
	    @NotBlank(message = "Account number is required")
	    @Size(max = 20, message = "Account number must not exceed 20 characters")
	    private String accountNo;
	    
	    @Size(max = 10)
	    private String joint;
	    
	    @Size(max = 200)
	    private String address;
	    
	    @Pattern(regexp = "^[0-9+\\-\\s()]*$", message = "Invalid phone number format")
	    @Size(max = 15)
	    private String phone;
	    
	    @Size(max = 20)
	    private String memberNo;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private LocalDate startDate;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private LocalDate firstDate;
	    
	    @Size(max = 200)
	    private String nomineeName;
	    
	    private BigDecimal maturityAmount;
	    
	    @Size(max = 100)
	    private String fdReceipt;
	    
	    @Size(max = 6)
	    private String intTransferG;
	    
	    @Size(max = 8)
	    private String intTransferS;
	    
	    @Size(max = 1)
	    private String printFd;
	    
	    @Size(max = 100)
	    private String autoRenewal;
	    
	    @Size(max = 1)
	    private String memberType;
	    
	    @Size(max = 6)
	    private String directorCode;
	    
	    @Size(max = 200)
	    private String introducerName;
	    
	    @Size(max = 200)
	    private String introducerAddress;
	    
	    @Size(max = 6)
	    private String introducerCityCode;
	    
	    @Size(max = 1)
	    private String procRec2;
	    
	    @Size(max = 1)
	    private String procRec1;
	    
	    @Size(max = 200)
	    private String relation;
	    
	    @Size(max = 200)
	    private String accountName;
	    
	    @Size(max = 200)
	    private String directorName;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private LocalDate dueDate;
	    
	    private BigDecimal savingsIntRate;
	    private BigDecimal intRate;
	    private BigDecimal simpleTodLimit;
	    private BigDecimal dailyTodLimit;
	    private BigDecimal savingsTodInt;
	    
	    @Size(max = 1)
	    private String chequeAllow;
	    
	    private BigDecimal depositAmount;
	    private BigDecimal savingsDepositAmount;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private LocalDate thisDate;
	    
	    @Size(max = 45)
	    private String intTransferGn;
	    
	    @Size(max = 45)
	    private String intTransferSn;
	    
	    @Size(max = 200)
	    private String cityName;
	    
	    @Size(max = 200)
	    private String introducerCityName;
	    
	    @Size(max = 200)
	    private String specialInstruction;
	    
	    @Size(max = 50)
	    private String interestDuration;
	    
	    @Size(max = 1)
	    private String withInterest;
	    
	    @Size(max = 200)
	    private String loanInfo;
	    
	    @Size(max = 200)
	    private String memName;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private LocalDate endDate;
	    
	    @Size(max = 20)
	    private String memNo;
	    
	    @Size(max = 200)
	    private String memName2;
	    
	    @Size(max = 6)
	    private String months;
	    
	    @Size(max = 6)
	    private String days;
	    
	    @Size(max = 12)
	    private String customerId;
	    
	    @Size(max = 1)
	    private String isForm15h;
	    
	    @Size(max = 1)
	    private String chequeBookFlag;
	    
	    @Size(max = 1)
	    private String category;
	    
	    @Size(max = 6)
	    private String acCode;
	    
	    @Size(max = 1)
	    private String intCalculation;
	    
	    private BigDecimal intTransferFreq;
	    private BigDecimal idNo;
	    
	    @Size(max = 1)
	    private String lienMark;
	    
	    private BigDecimal loanAmount;
	    
	    @Size(max = 20)
	    private String loanAccountNo;
	    
	    @Size(max = 1)
	    private String smsApply;

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

		public BigDecimal getSavingsTodInt() {
			return savingsTodInt;
		}

		public void setSavingsTodInt(BigDecimal savingsTodInt) {
			this.savingsTodInt = savingsTodInt;
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
