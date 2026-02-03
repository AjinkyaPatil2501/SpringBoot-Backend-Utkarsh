package com.utkarsh.core.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.utkarsh.core.model.JointCustomerMaster;




public class DepositAccountDetailsDto {
    
    // General Tab
    private String ledgerNo;
    private String accountNumber;
    private String customerNumber;
    private String englishName;
    private String memberType;
    private String memberNo;
    private String depositType;
    private String jointAccount;
    
    // Personal Info Tab
    private String address;
    private String city;
    private String phone;
    private String specialInstruction;
    private String nomineeName;
    private String introducerName;
    private String introducerAddress;
    private String introducerCity;
    private String checkBook;
    private String form15H;
    private String smsService;
    
    // Financial Info Tab
    private LocalDate openingDate;
    private LocalDate asOnDate;
    private Integer termMonths;
    private Integer termDays;
    private LocalDate maturityDate;
    private String interestPeriodMonths;
    private BigDecimal depositAmount;
    private BigDecimal interestRate;
    private BigDecimal maturityAmount;
    private String autoRenewal;
    private String withInterest;
    private String interestLedgerNo;
    private String interestLedgerName;
    private String interestAccountNo;
    private String interestAccountName;
    private String includeInRecovery;
    private String customerName;
    private String directorCode;
    private String directorName;
    
    // Deposit Tab
    private String depositReceiptNo;
    private String deductInterest;
    private String isPrinted;
    
    // Savings/Current Tab
    private LocalDate savingsOpeningDate;
    private BigDecimal savingsAmount;
    private BigDecimal savingsInterestRate;
    private String isTemporaryLoan;
    private BigDecimal tempLoanLimit;
    private BigDecimal tempLoanInterestRate;
    private LocalDate tempLoanEndDate;
    private String isRecovery;
    
    // Joint Customers
    private List<JointCustomerMaster> jointcustomers;

	public DepositAccountDetailsDto() {
		super();
	}

	public DepositAccountDetailsDto(String ledgerNo, String accountNumber, String customerNumber, String englishName,
			String memberType, String memberNo, String depositType, String jointAccount, String address, String city,
			String phone, String specialInstruction, String nomineeName, String introducerName,
			String introducerAddress, String introducerCity, String checkBook, String form15h, String smsService,
			LocalDate openingDate, LocalDate asOnDate, Integer termMonths, Integer termDays, LocalDate maturityDate,
			String interestPeriodMonths, BigDecimal depositAmount, BigDecimal interestRate, BigDecimal maturityAmount,
			String autoRenewal, String withInterest, String interestLedgerNo, String interestLedgerName,
			String interestAccountNo, String interestAccountName, String includeInRecovery, String customerName,
			String directorCode, String directorName, String depositReceiptNo, String deductInterest, String isPrinted,
			LocalDate savingsOpeningDate, BigDecimal savingsAmount, BigDecimal savingsInterestRate,
			String isTemporaryLoan, BigDecimal tempLoanLimit, BigDecimal tempLoanInterestRate,
			LocalDate tempLoanEndDate, String isRecovery, List<JointCustomerMaster> jointcustomers) {
		super();
		this.ledgerNo = ledgerNo;
		this.accountNumber = accountNumber;
		this.customerNumber = customerNumber;
		this.englishName = englishName;
		this.memberType = memberType;
		this.memberNo = memberNo;
		this.depositType = depositType;
		this.jointAccount = jointAccount;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.specialInstruction = specialInstruction;
		this.nomineeName = nomineeName;
		this.introducerName = introducerName;
		this.introducerAddress = introducerAddress;
		this.introducerCity = introducerCity;
		this.checkBook = checkBook;
		form15H = form15h;
		this.smsService = smsService;
		this.openingDate = openingDate;
		this.asOnDate = asOnDate;
		this.termMonths = termMonths;
		this.termDays = termDays;
		this.maturityDate = maturityDate;
		this.interestPeriodMonths = interestPeriodMonths;
		this.depositAmount = depositAmount;
		this.interestRate = interestRate;
		this.maturityAmount = maturityAmount;
		this.autoRenewal = autoRenewal;
		this.withInterest = withInterest;
		this.interestLedgerNo = interestLedgerNo;
		this.interestLedgerName = interestLedgerName;
		this.interestAccountNo = interestAccountNo;
		this.interestAccountName = interestAccountName;
		this.includeInRecovery = includeInRecovery;
		this.customerName = customerName;
		this.directorCode = directorCode;
		this.directorName = directorName;
		this.depositReceiptNo = depositReceiptNo;
		this.deductInterest = deductInterest;
		this.isPrinted = isPrinted;
		this.savingsOpeningDate = savingsOpeningDate;
		this.savingsAmount = savingsAmount;
		this.savingsInterestRate = savingsInterestRate;
		this.isTemporaryLoan = isTemporaryLoan;
		this.tempLoanLimit = tempLoanLimit;
		this.tempLoanInterestRate = tempLoanInterestRate;
		this.tempLoanEndDate = tempLoanEndDate;
		this.isRecovery = isRecovery;
		this.jointcustomers = jointcustomers;
	}

	public String getLedgerNo() {
		return ledgerNo;
	}

	public void setLedgerNo(String ledgerNo) {
		this.ledgerNo = ledgerNo;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}

	public String getDepositType() {
		return depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public String getJointAccount() {
		return jointAccount;
	}

	public void setJointAccount(String jointAccount) {
		this.jointAccount = jointAccount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
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

	public String getIntroducerCity() {
		return introducerCity;
	}

	public void setIntroducerCity(String introducerCity) {
		this.introducerCity = introducerCity;
	}

	public String getCheckBook() {
		return checkBook;
	}

	public void setCheckBook(String checkBook) {
		this.checkBook = checkBook;
	}

	public String getForm15H() {
		return form15H;
	}

	public void setForm15H(String form15h) {
		form15H = form15h;
	}

	public String getSmsService() {
		return smsService;
	}

	public void setSmsService(String smsService) {
		this.smsService = smsService;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public LocalDate getAsOnDate() {
		return asOnDate;
	}

	public void setAsOnDate(LocalDate asOnDate) {
		this.asOnDate = asOnDate;
	}

	public Integer getTermMonths() {
		return termMonths;
	}

	public void setTermMonths(Integer termMonths) {
		this.termMonths = termMonths;
	}

	public Integer getTermDays() {
		return termDays;
	}

	public void setTermDays(Integer termDays) {
		this.termDays = termDays;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getInterestPeriodMonths() {
		return interestPeriodMonths;
	}

	public void setInterestPeriodMonths(String interestPeriodMonths) {
		this.interestPeriodMonths = interestPeriodMonths;
	}

	public BigDecimal getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public BigDecimal getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(BigDecimal maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public String getAutoRenewal() {
		return autoRenewal;
	}

	public void setAutoRenewal(String autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	public String getWithInterest() {
		return withInterest;
	}

	public void setWithInterest(String withInterest) {
		this.withInterest = withInterest;
	}

	public String getInterestLedgerNo() {
		return interestLedgerNo;
	}

	public void setInterestLedgerNo(String interestLedgerNo) {
		this.interestLedgerNo = interestLedgerNo;
	}

	public String getInterestLedgerName() {
		return interestLedgerName;
	}

	public void setInterestLedgerName(String interestLedgerName) {
		this.interestLedgerName = interestLedgerName;
	}

	public String getInterestAccountNo() {
		return interestAccountNo;
	}

	public void setInterestAccountNo(String interestAccountNo) {
		this.interestAccountNo = interestAccountNo;
	}

	public String getInterestAccountName() {
		return interestAccountName;
	}

	public void setInterestAccountName(String interestAccountName) {
		this.interestAccountName = interestAccountName;
	}

	public String getIncludeInRecovery() {
		return includeInRecovery;
	}

	public void setIncludeInRecovery(String includeInRecovery) {
		this.includeInRecovery = includeInRecovery;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDirectorCode() {
		return directorCode;
	}

	public void setDirectorCode(String directorCode) {
		this.directorCode = directorCode;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDepositReceiptNo() {
		return depositReceiptNo;
	}

	public void setDepositReceiptNo(String depositReceiptNo) {
		this.depositReceiptNo = depositReceiptNo;
	}

	public String getDeductInterest() {
		return deductInterest;
	}

	public void setDeductInterest(String deductInterest) {
		this.deductInterest = deductInterest;
	}

	public String getIsPrinted() {
		return isPrinted;
	}

	public void setIsPrinted(String isPrinted) {
		this.isPrinted = isPrinted;
	}

	public LocalDate getSavingsOpeningDate() {
		return savingsOpeningDate;
	}

	public void setSavingsOpeningDate(LocalDate savingsOpeningDate) {
		this.savingsOpeningDate = savingsOpeningDate;
	}

	public BigDecimal getSavingsAmount() {
		return savingsAmount;
	}

	public void setSavingsAmount(BigDecimal savingsAmount) {
		this.savingsAmount = savingsAmount;
	}

	public BigDecimal getSavingsInterestRate() {
		return savingsInterestRate;
	}

	public void setSavingsInterestRate(BigDecimal savingsInterestRate) {
		this.savingsInterestRate = savingsInterestRate;
	}

	public String getIsTemporaryLoan() {
		return isTemporaryLoan;
	}

	public void setIsTemporaryLoan(String isTemporaryLoan) {
		this.isTemporaryLoan = isTemporaryLoan;
	}

	public BigDecimal getTempLoanLimit() {
		return tempLoanLimit;
	}

	public void setTempLoanLimit(BigDecimal tempLoanLimit) {
		this.tempLoanLimit = tempLoanLimit;
	}

	public BigDecimal getTempLoanInterestRate() {
		return tempLoanInterestRate;
	}

	public void setTempLoanInterestRate(BigDecimal tempLoanInterestRate) {
		this.tempLoanInterestRate = tempLoanInterestRate;
	}

	public LocalDate getTempLoanEndDate() {
		return tempLoanEndDate;
	}

	public void setTempLoanEndDate(LocalDate tempLoanEndDate) {
		this.tempLoanEndDate = tempLoanEndDate;
	}

	public String getIsRecovery() {
		return isRecovery;
	}

	public void setIsRecovery(String isRecovery) {
		this.isRecovery = isRecovery;
	}

	public List<JointCustomerMaster> getJointcustomers() {
		return jointcustomers;
	}

	public void setJointcustomers(List<JointCustomerMaster> jointcustomers) {
		this.jointcustomers = jointcustomers;
	}
    
    
}