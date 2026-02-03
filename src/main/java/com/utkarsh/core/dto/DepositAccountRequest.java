package com.utkarsh.core.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.utkarsh.core.model.JointCustomerMaster;

public class DepositAccountRequest {

	// General
	public String bankId;
	public String branchId;
	public String ledgerNo;
	public String agentCode;
	public String accountNumber;
	public String customerNumber;
	public String englishName;
	public String memberType;
	public String memberNo;
	public String depositType;
	public String jointAccount;

	// Personal
	public String address;
	public String city;
	public String phone;
	public String nomineeName;
	public String checkBook;
	public String form15H;
	public String smsService;

	// Financial
	public LocalDate openingDate;
	public Integer termMonths;
	public Integer termDays;
	public LocalDate maturityDate;
	public BigDecimal depositAmount;
	public BigDecimal interestRate;
	public BigDecimal maturityAmount;
	public String interestLedgerNo;
	public String interestAccountNo;
	public String autoRenewal;
	
	// Others
	public String depositReceiptNo;
	public String isPrinted;

	public String directorCode;
	public String introducerName;
	public String introducerAddress;
	public String introducerCity;
	public String customerName;
	public String directorName;
	public LocalDate asOnDate;
	public BigDecimal savingsAmount;
	public LocalDate savingsOpeningDate;
	public BigDecimal savingsInterestRate;
	public String isTemporaryLoan;
	public BigDecimal tempLoanLimit;
	public BigDecimal tempLoanInterestRate;
	public LocalDate tempLoanEndDate;
	public String isRecovery;
	public String interestAccountName;
	public String interestLedgerName;
	public List<JointCustomerMaster> jointcustomers;
	public String specialInstruction;
	public String withInterest;
	public String includeInRecovery;
	public String interestPeriodMonths;
	public String deductInterest;
	
	
	
	public String getDeductInterest() {
		return deductInterest;
	}

	public String getInterestPeriodMonths() {
		return interestPeriodMonths;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public String getWithInterest() {
		return withInterest;
	}

	public String getIncludeInRecovery() {
		return includeInRecovery;
	}

	public List<JointCustomerMaster> getJointcustomers() {
		return jointcustomers;
	}

	public String getInterestAccountName() {
		return interestAccountName;
	}

	public String getInterestLedgerName() {
		return interestLedgerName;
	}

	public LocalDate getAsOnDate() {
		return asOnDate;
	}

	public BigDecimal getSavingsAmount() {
		return savingsAmount;
	}

	public LocalDate getSavingsOpeningDate() {
		return savingsOpeningDate;
	}

	public BigDecimal getSavingsInterestRate() {
		return savingsInterestRate;
	}

	public String getIsTemporaryLoan() {
		return isTemporaryLoan;
	}

	public BigDecimal getTempLoanLimit() {
		return tempLoanLimit;
	}

	public BigDecimal getTempLoanInterestRate() {
		return tempLoanInterestRate;
	}

	public LocalDate getTempLoanEndDate() {
		return tempLoanEndDate;
	}

	public String getIsRecovery() {
		return isRecovery;
	}

	public String getDirectorName() {
		return directorName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getIntroducerAddress() {
		return introducerAddress;
	}

	public String getIntroducerCity() {
		return introducerCity;
	}

	public String getIntroducerName() {
		return introducerName;
	}

	public String getDirectorCode() {
		return directorCode;
	}

	public String getAutoRenewal() {
		return autoRenewal;
	}

	public String getBankId() {
		return bankId;
	}

	public String getBranchId() {
		return branchId;
	}

	public String getLedgerNo() {
		return ledgerNo;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public String getEnglishName() {
		return englishName;
	}

	public String getMemberType() {
		return memberType;
	}

	public String getMemberNo() {
		return memberNo;
	}

	public String getDepositType() {
		return depositType;
	}

	public String getJointAccount() {
		return jointAccount;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getPhone() {
		return phone;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public String getCheckBook() {
		return checkBook;
	}

	public String getForm15H() {
		return form15H;
	}

	public String getSmsService() {
		return smsService;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public Integer getTermMonths() {
		return termMonths;
	}

	public Integer getTermDays() {
		return termDays;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public BigDecimal getDepositAmount() {
		return depositAmount;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public BigDecimal getMaturityAmount() {
		return maturityAmount;
	}

	public String getInterestLedgerNo() {
		return interestLedgerNo;
	}

	public String getInterestAccountNo() {
		return interestAccountNo;
	}

	public String getDepositReceiptNo() {
		return depositReceiptNo;
	}

	public String getIsPrinted() {
		return isPrinted;
	}

}
