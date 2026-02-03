package com.utkarsh.core.serviceimpl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utkarsh.core.dao.AccountMasterDao;
import com.utkarsh.core.dao.AgentMasterDao;
import com.utkarsh.core.dao.BranchDao;
import com.utkarsh.core.dao.CityMasterDao;
import com.utkarsh.core.dao.CustomerAddressDao;
import com.utkarsh.core.dao.CustomerMasterDao;
import com.utkarsh.core.dao.DepositDao;
import com.utkarsh.core.dao.DepositInterestRateDao;
import com.utkarsh.core.dao.DirectorMasterDao;
import com.utkarsh.core.dao.GlParamDao;
import com.utkarsh.core.dao.JointCustomerMasterDao;
import com.utkarsh.core.dao.ShareMasterDao;
import com.utkarsh.core.dto.AgentDto;
import com.utkarsh.core.dto.DepositAccountDetailsDto;
import com.utkarsh.core.dto.DepositAccountRequest;
import com.utkarsh.core.dto.DepositDTO;
import com.utkarsh.core.dto.DepositDetailsDto;
import com.utkarsh.core.dto.DirectorDto;
import com.utkarsh.core.dto.GeneralLedgerCodeDto;
import com.utkarsh.core.dto.PersonalInfoDto;
import com.utkarsh.core.mapper.AccountMasterMapper;
import com.utkarsh.core.mapper.DepositMasterMapper;
import com.utkarsh.core.model.AccountMaster;
import com.utkarsh.core.model.CustomerAddress;
import com.utkarsh.core.model.CustomerMaster;
import com.utkarsh.core.model.DepositMaster;
import com.utkarsh.core.model.JointCustomerMaster;
import com.utkarsh.core.service.DepositService;

import org.jspecify.annotations.Nullable;

@Service
public class DepositServiceImpl implements DepositService {

	@Autowired
	DepositDao depositDao;
	@Autowired
	GlParamDao glParamDao;
	@Autowired
	AgentMasterDao agentMasterDao;
	@Autowired
	DirectorMasterDao directorMasterDao;
	@Autowired
	ShareMasterDao shareMasterDao;
	@Autowired
	CustomerAddressDao customerAddressDao;
	@Autowired
	CustomerMasterDao customerMasterDao;
	@Autowired
	CityMasterDao cityMasterDao;
	@Autowired
	BranchDao branchDao;
	@Autowired
	DepositInterestRateDao depositInterestRateDao;
	@Autowired
	AccountMasterDao accountMasterDao;
	@Autowired
	JointCustomerMasterDao jointCustomerMasterDao;
	@Autowired
	DepositMasterMapper depositMapper;

	@Override
	public DepositDetailsDto allRequiredDetails() {
		DepositDetailsDto depositDto = new DepositDetailsDto();
		List<GeneralLedgerCodeDto> ledgerDto = glParamDao.fetchLedgerDetails().stream().map(e -> {
			GeneralLedgerCodeDto dto = new GeneralLedgerCodeDto();
			dto.setGlcode((String) e[0]);
			dto.setGlname((String) e[1]);
			dto.setShortcode((String) e[2]);
			return dto;
		}).collect(Collectors.toList());

		List<AgentDto> agentDto = agentMasterDao.fetchAgentDetails().stream().map(e -> {
			AgentDto dto = new AgentDto();
			dto.setAgentName((String) e[0]);
			dto.setAgentCode((String) e[1]);
			return dto;
		}).collect(Collectors.toList());

		List<DirectorDto> directorDto = directorMasterDao.fetchDirectorDetails().stream().map(e -> {
			DirectorDto dto = new DirectorDto();
			dto.setDirectorCode(String.valueOf(e[0]));
			dto.setDirectorName((String) e[1]);
			return dto;
		}).collect(Collectors.toList());
		depositDto.setDirectors(directorDto);
		depositDto.setAgents(agentDto);
		depositDto.setGldetails(ledgerDto);
		return depositDto;
	}

	@Override
	public String searchByCustomerId(String customerId) {

		String accountNo = shareMasterDao.findAccountNoByCustomerId(customerId);

		if (accountNo == null) {
			return null;
		}
		return accountNo.length() > 8 ? accountNo.substring(accountNo.length() - 8) : accountNo;
	}

	@Override
	public PersonalInfoDto searchAddress(String customerId) {
		PersonalInfoDto dto = new PersonalInfoDto();
		Optional<CustomerMaster> customer = customerMasterDao.findByCustomerId(customerId);
		CustomerAddress customerAddress = customerAddressDao.findByCustomerId(customerId);
		int cityCode = Integer.parseInt(customerAddress.getPermanentCityOrVillage());
		String customerCity = cityMasterDao.findCityById(cityCode);

		dto.setAddress(customerAddress.getPermanentAddress());
		dto.setCity(customerCity);
		dto.setPhone(customerAddress.getLocalMobile1());

		Optional<CustomerMaster> intruducer = customerMasterDao.findByCustomerId(customer.get().getIntroducerId());
		if (intruducer != null) {
			CustomerAddress intruducerAddress = customerAddressDao.findByCustomerId(intruducer.get().getCustomerId());
			cityCode = Integer.parseInt(customerAddress.getPermanentCityOrVillage());
			String intuducerCity = cityMasterDao.findCityById(cityCode);
			dto.setIntroducerAddress(intruducerAddress.getPermanentAddress());
			dto.setIntroducerCity(intuducerCity);
			String introduceName = (intruducer.get().getFirstName() != null ? intruducer.get().getFirstName() : "")
					+ " " + (intruducer.get().getMiddleName() != null ? intruducer.get().getMiddleName() : "") + " "
					+ (intruducer.get().getLastName() != null ? intruducer.get().getLastName() : "");

			introduceName = introduceName.trim().replaceAll(" +", " "); // remove extra spaces

			dto.setIntroducerName(introduceName);
		}

//		dto.setAsOnDate(branchDao.getDate());
		return dto;
	}

	@Override
	public LocalDate getStartDate(String branchId) {

		return branchDao.getStartDate(branchId);
	}

	public BigDecimal getInterest(String glCode, Integer forTime, String dayOrMonth) {

		if ("D".equalsIgnoreCase(dayOrMonth)) {
			return depositInterestRateDao.getInterest(glCode, forTime, "D");
		}

		if ("M".equalsIgnoreCase(dayOrMonth)) {

			BigDecimal interestRate = depositInterestRateDao.getInterest(glCode, forTime, "M");

			if (interestRate != null) {
				return interestRate;
			}
			int days = forTime * 30;

			return depositInterestRateDao.getInterest(glCode, days, "D");
		}

		return BigDecimal.ZERO;
	}

	@Override
	public List<AccountMaster> searchAccounts(String branchId, String glCode, String searchBy, String searchValue,
			int limit) {

		if (searchValue == null || searchValue.trim().isEmpty()) {
			return accountMasterDao.findTop50ByGlCode(branchId, glCode);
		}

		List<AccountMaster> result;

		if ("accountNumber".equalsIgnoreCase(searchBy)) {
			result = accountMasterDao.searchByAccountNumber(branchId, glCode, searchValue);
		} else {
			result = accountMasterDao.searchByAccountName(branchId, glCode, searchValue);
		}

		// return only TOP N records
		return result.stream().limit(limit).toList();
	}

	@Override
	public BigDecimal getSavingsInterestRate(String glCode, String depositAmount) {

		if (depositAmount == null || depositAmount.trim().isEmpty()) {
			return null;
		}

		BigDecimal amount;
		try {
			amount = new BigDecimal(depositAmount.trim());
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid deposit amount: " + depositAmount);
		}

		return depositInterestRateDao.getSavingsInterestRate(glCode, amount);
	}

	@Override
	public BigDecimal getMaturityAmount(String glCode, String month, String days, String depositAmount,
			String frequency, String type, String interestRate) {

		BigDecimal principal = new BigDecimal(depositAmount);
		int months = (month == null || month.isBlank()) ? 0 : Integer.parseInt(month);
		int dayCount = (days == null || days.isBlank()) ? 0 : Integer.parseInt(days);
		int freq = (frequency == null || frequency.isBlank()) ? 0 : Integer.parseInt(frequency);

		/* ================= INTEREST RATE FROM FRONTEND ================= */
		BigDecimal rate = new BigDecimal(interestRate);

		// Senior citizen +0.5%
		if ("SENIOR".equalsIgnoreCase(type)) {
			rate = rate.add(BigDecimal.valueOf(0.5));
		}

		// Special offer +2%
		if ("SPECIAL".equalsIgnoreCase(type)) {
			rate = rate.add(BigDecimal.valueOf(2.0));
		}

		String interestType = glParamDao.getInterestType(glCode);
		if (interestType == null) {
			return principal;
		}

		interestType = interestType.toUpperCase();

		/* ================= SIMPLE INTEREST ================= */
		if ("S".equals(interestType)) {

			BigDecimal monthlyInterest = principal.multiply(rate).multiply(BigDecimal.valueOf(months))
					.divide(BigDecimal.valueOf(1200), 2, RoundingMode.HALF_UP);

			BigDecimal dailyInterest = principal.multiply(rate).multiply(BigDecimal.valueOf(dayCount))
					.divide(BigDecimal.valueOf(36500), 2, RoundingMode.HALF_UP);

			return principal.add(monthlyInterest).add(dailyInterest).setScale(0, RoundingMode.HALF_UP);
		}

		/* ================= COMPOUND INTEREST ================= */
		BigDecimal maturityAmount = principal;

		if (freq == 3) { // Quarterly
			int periods = months / 3;
			BigDecimal quarterlyRate = rate.divide(BigDecimal.valueOf(400), 10, RoundingMode.HALF_UP);

			for (int i = 0; i < periods; i++) {
				maturityAmount = maturityAmount.multiply(BigDecimal.ONE.add(quarterlyRate));
			}

		} else if (freq == 6) { // Half-Yearly
			int periods = months / 6;
			BigDecimal halfYearlyRate = rate.divide(BigDecimal.valueOf(200), 10, RoundingMode.HALF_UP);

			for (int i = 0; i < periods; i++) {
				maturityAmount = maturityAmount.multiply(BigDecimal.ONE.add(halfYearlyRate));
			}

		} else if (freq == 12) { // Yearly
			int periods = months / 12;
			BigDecimal yearlyRate = rate.divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

			for (int i = 0; i < periods; i++) {
				maturityAmount = maturityAmount.multiply(BigDecimal.ONE.add(yearlyRate));
			}
		}

		/* ================= REMAINING DAYS INTEREST ================= */
		BigDecimal remainingDayInterest = maturityAmount.multiply(rate).multiply(BigDecimal.valueOf(dayCount))
				.divide(BigDecimal.valueOf(36500), 2, RoundingMode.HALF_UP);

		return maturityAmount.add(remainingDayInterest).setScale(0, RoundingMode.HALF_UP);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void createDepositAccount(DepositAccountRequest request) {
		try {
			// ===== Generate new account number =====
			String prefix = request.getBankId() + request.getBranchId() + request.getLedgerNo();
			String lastAccountNo = accountMasterDao.getLastAccountNo(prefix);

			String newAccountNo;
			if (lastAccountNo == null || lastAccountNo.isBlank()) {
				newAccountNo = prefix + "00000001";
			} else {
				String last8Digits = lastAccountNo.substring(lastAccountNo.length() - 8);
				long nextNumber = Long.parseLong(last8Digits) + 1;
				newAccountNo = prefix + String.format("%08d", nextNumber);
			}

			// ===== Map DTO to AccountMaster entity =====
			AccountMaster accountEntity = AccountMasterMapper.toEntity(request, newAccountNo);
			accountMasterDao.save(accountEntity);

			// ===== Map DTO to DepositMaster entity =====
			DepositMaster depositEntity = DepositMasterMapper.toEntity(request, newAccountNo);
			depositDao.save(depositEntity);
			String last8Digits = newAccountNo.substring(newAccountNo.length() - 8);

			glParamDao.updateLastAccountNo(last8Digits, request.getBankId(), request.getBranchId(),
					request.getLedgerNo());

			// ===== 4. Save JointCustomerMaster (DTO → ENTITY directly) =====
			if (request.getJointcustomers() != null && !request.getJointcustomers().isEmpty()) {

				for (JointCustomerMaster joint : request.getJointcustomers()) {
					joint.setCaccountNo(newAccountNo); // ⭐ inject generated account no
				}

				jointCustomerMasterDao.saveAll(request.getJointcustomers());
			}

		} catch (Exception e) {
//			System.out.println("Deposit account creation failed" + e);
//			throw new RuntimeException("Deposit account creation failed", e);
			e.printStackTrace(); // 🔥 THIS IS CRITICAL
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void updateDepositAccount(String accountNo, DepositAccountRequest request) {
		try {
			// ===== 1. Find existing entities =====
			AccountMaster existingAccount = accountMasterDao.findByAccountNo(accountNo)
					.orElseThrow(() -> new RuntimeException("Account not found: " + accountNo));

			DepositMaster existingDeposit = depositDao.findByAccountNo(accountNo)
					.orElseThrow(() -> new RuntimeException("Deposit account not found: " + accountNo));

			// ===== 2. Update fields IN PLACE =====
			updateAccountMasterFields(existingAccount, request);
			updateDepositMasterFields(existingDeposit, request);

			// ===== 3. Save updated entities =====
			accountMasterDao.save(existingAccount);
			depositDao.save(existingDeposit);

			// ===== 4. Update joint customers =====
			if (request.getJointcustomers() != null) {
				jointCustomerMasterDao.deleteByAccountNo(accountNo);

				if (!request.getJointcustomers().isEmpty()) {
					for (JointCustomerMaster joint : request.getJointcustomers()) {
						joint.setCaccountNo(accountNo);
					}
					jointCustomerMasterDao.saveAll(request.getJointcustomers());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Deposit account update failed: " + e.getMessage(), e);
		}
	}

	private void updateAccountMasterFields(AccountMaster account, DepositAccountRequest request) {
		// Update only the fields that exist in AccountMaster
		if (request.getEnglishName() != null) {
			account.setCheadShor(request.getEnglishName());
		}
		if (request.getMemberNo() != null) {
			account.setCmemberNo(request.getMemberNo());
		}
		if (request.getCity() != null) {
			account.setCcity(request.getCity());
		}
		if (request.getCustomerNumber() != null) {
			account.setCustomerId(request.getCustomerNumber());
		}
		// Note: Many other fields in AccountMaster are system-managed
		// and should not be updated from user input
	}

	private void updateDepositMasterFields(DepositMaster deposit, DepositAccountRequest request) {
		// General Tab
		if (request.getJointAccount() != null) {
			deposit.setCjoint(request.getJointAccount());
		}
		if (request.getMemberNo() != null) {
			deposit.setMemno(request.getMemberNo());
		}
		if (request.getCustomerName() != null) {
			deposit.setMemname(request.getCustomerName());
			deposit.setMemName(request.getCustomerName());
			deposit.setAccName(request.getCustomerName());
		}
		if (request.getDepositType() != null) {
			deposit.setCcatagory(request.getDepositType());
		}
		if (request.getCustomerNumber() != null) {
			deposit.setCustomerId(request.getCustomerNumber());
		}

		// Personal Info Tab
		if (request.getAddress() != null) {
			deposit.setCadd1(request.getAddress());
		}
		if (request.getCity() != null) {
			deposit.setCcityn(request.getCity());
		}
		if (request.getPhone() != null) {
			deposit.setCphone(request.getPhone());
		}
		if (request.getNomineeName() != null) {
			deposit.setCnomineenm(request.getNomineeName());
		}
		if (request.getIntroducerName() != null) {
			deposit.setIntrName(request.getIntroducerName());
		}
		if (request.getIntroducerAddress() != null) {
			deposit.setIntrAdd1(request.getIntroducerAddress());
		}
		if (request.getIntroducerCity() != null) {
			deposit.setIntrCityn(request.getIntroducerCity());
			deposit.setIntrCityc(request.getIntroducerCity());
		}
		if (request.getCheckBook() != null) {
			deposit.setSchqAllow(request.getCheckBook());
			deposit.setChequebookflag(request.getCheckBook());
		}
		if (request.getForm15H() != null) {
			deposit.setIsform15h(request.getForm15H());
		}
		if (request.getSmsService() != null) {
			deposit.setSmsApply(request.getSmsService());
		}
		if (request.getSpecialInstruction() != null) {
			deposit.setCsplintrc(request.getSpecialInstruction());
		}

		// Financial Info Tab
		if (request.getOpeningDate() != null) {
			deposit.setDstartDat(request.getOpeningDate());
		}
		if (request.getAsOnDate() != null) {
			deposit.setDfirstDat(request.getAsOnDate());
		}
		if (request.getTermMonths() != null) {
			deposit.setNmonth(request.getTermMonths().toString());
		}
		if (request.getTermDays() != null) {
			deposit.setNday(request.getTermDays().toString());
		}
		if (request.getMaturityDate() != null) {
			deposit.setSdueDate(request.getMaturityDate());
			deposit.setDendDat(request.getMaturityDate());
		}
		if (request.getAutoRenewal() != null) {
			deposit.setCautoRene(request.getAutoRenewal());
		}
		if (request.getDirectorCode() != null) {
			deposit.setCdirCode(request.getDirectorCode());
		}
		if (request.getDirectorName() != null) {
			deposit.setCdirName(request.getDirectorName());
		}
		if (request.getDepositAmount() != null) {
			deposit.setFdepoAmt(request.getDepositAmount());
		}
		if (request.getInterestRate() != null) {
			deposit.setSintRate(request.getInterestRate());
			deposit.setFintRate(request.getInterestRate());
		}
		if (request.getMaturityAmount() != null) {
			deposit.setNmatuAmt(request.getMaturityAmount());
		}
		if (request.getInterestLedgerNo() != null) {
			deposit.setCintTrfG(request.getInterestLedgerNo());
		}
		if (request.getInterestLedgerName() != null) {
			deposit.setCintTrfGn(request.getInterestLedgerName());
		}
		if (request.getInterestAccountNo() != null) {
			deposit.setCintTrfS(request.getInterestAccountNo());
		}
		if (request.getInterestAccountName() != null) {
			deposit.setCintTrfSn(request.getInterestAccountName());
		}
		if (request.getIncludeInRecovery() != null) {
			deposit.setCprocRec1(request.getIncludeInRecovery());
		}
		if (request.getWithInterest() != null) {
			deposit.setCwint(request.getWithInterest());
		}
		if (request.getInterestPeriodMonths() != null) {
			deposit.setCintDura(request.getInterestPeriodMonths());
			if (!request.getInterestPeriodMonths().trim().isEmpty()) {
				deposit.setNintTranFrq(new BigDecimal(request.getInterestPeriodMonths().trim()));
			}
		}

		// Deposit Tab
		if (request.getDepositReceiptNo() != null) {
			deposit.setCfdReceip(request.getDepositReceiptNo());
		}
		if (request.getIsPrinted() != null) {
			deposit.setCprintFd(request.getIsPrinted());
		}

		// Savings/Current Tab
		if (request.getSavingsOpeningDate() != null) {
			deposit.setThisDate(request.getSavingsOpeningDate());
		}
		if (request.getSavingsAmount() != null) {
			deposit.setSdepoAmt(request.getSavingsAmount());
		}
		if (request.getTempLoanLimit() != null) {
			deposit.setStodLimit(request.getTempLoanLimit());
			deposit.setDtodLimit(request.getTempLoanLimit());
		}
		if (request.getTempLoanInterestRate() != null) {
			deposit.setStodInt(request.getTempLoanInterestRate());
		}
		if (request.getIsRecovery() != null) {
			deposit.setCprocRec2(request.getIsRecovery());
		}
	}

	@Override
	public DepositAccountDetailsDto getDepositByAccountNo(String accountNo) {
		try {
			AccountMaster account = accountMasterDao.findByAccountNo(accountNo)
					.orElseThrow(() -> new RuntimeException("Account not found"));

			DepositMaster deposit = depositDao.findByAccountNo(accountNo)
					.orElseThrow(() -> new RuntimeException("Deposit not found"));

			List<JointCustomerMaster> jointCustomers = jointCustomerMasterDao.findByAccountNo(accountNo);

			DepositAccountDetailsDto dto = new DepositAccountDetailsDto();

			// Extract GL code from account number
			String fullAccountNo = account.getCaccountNo();
			String ledgerNo = fullAccountNo.length() >= 12 ? fullAccountNo.substring(6, 12) : "";

			// General Tab
			dto.setLedgerNo(ledgerNo);
			dto.setAccountNumber(accountNo);
			dto.setCustomerNumber(deposit.getCustomerId());
			dto.setEnglishName(account.getCheadShor());
			dto.setDepositType(deposit.getCcatagory());
			dto.setMemberType(account.getCacType());
			dto.setMemberNo(deposit.getMemno());
			dto.setJointAccount(deposit.getCjoint());

			// Personal Info Tab
			dto.setAddress(deposit.getCadd1());
			dto.setCity(deposit.getCcityn());
			dto.setPhone(deposit.getCphone());
			dto.setNomineeName(deposit.getCnomineenm());
			dto.setIntroducerName(deposit.getIntrName());
			dto.setIntroducerAddress(deposit.getIntrAdd1());
			dto.setIntroducerCity(deposit.getIntrCityn());
			dto.setCheckBook(deposit.getSchqAllow());
			dto.setForm15H(deposit.getIsform15h());
			dto.setSmsService(deposit.getSmsApply());
			dto.setSpecialInstruction(deposit.getCsplintrc());

			// Financial Info Tab
			dto.setOpeningDate(deposit.getDstartDat());
			dto.setAsOnDate(deposit.getDfirstDat());
			dto.setTermMonths(parseInteger(deposit.getNmonth()));
			dto.setTermDays(parseInteger(deposit.getNday()));
			dto.setMaturityDate(deposit.getSdueDate());
			dto.setAutoRenewal(deposit.getCautoRene());
			dto.setDirectorCode(deposit.getCdirCode());
			dto.setDirectorName(deposit.getCdirName());
			dto.setCustomerName(deposit.getAccName());
			dto.setDepositAmount(deposit.getFdepoAmt());
			dto.setInterestRate(deposit.getSintRate());
			dto.setMaturityAmount(deposit.getNmatuAmt());
			dto.setInterestLedgerNo(deposit.getCintTrfG());
			dto.setInterestLedgerName(deposit.getCintTrfGn());
			dto.setInterestAccountNo(deposit.getCintTrfS());
			dto.setInterestAccountName(deposit.getCintTrfSn());
			dto.setIncludeInRecovery(deposit.getCprocRec1());
			dto.setWithInterest(deposit.getCwint());
			dto.setInterestPeriodMonths(deposit.getCintDura());

			// Deposit Tab
			dto.setDepositReceiptNo(deposit.getCfdReceip());
			dto.setIsPrinted(deposit.getCprintFd());

			// Savings/Current Tab
			dto.setSavingsOpeningDate(deposit.getThisDate());
			dto.setSavingsAmount(deposit.getSdepoAmt());
			dto.setSavingsInterestRate(deposit.getFintRate());
			dto.setIsTemporaryLoan(
					deposit.getStodLimit() != null && deposit.getStodLimit().compareTo(BigDecimal.ZERO) > 0 ? "Y"
							: "N");
			dto.setTempLoanLimit(deposit.getStodLimit());
			dto.setTempLoanInterestRate(deposit.getStodInt());
			dto.setIsRecovery(deposit.getCprocRec2());

			// Joint Customers
			dto.setJointcustomers(jointCustomers);

			return dto;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to fetch deposit details: " + e.getMessage(), e);
		}
	}

	private Integer parseInteger(String value) {
		if (value == null || value.trim().isEmpty()) {
			return null;
		}
		try {
			return Integer.parseInt(value.trim());
		} catch (NumberFormatException e) {
			return null;
		}
	}
	
	@Override
	@Transactional
	public @Nullable List<DepositDTO> getAllAccounts() {
		
//		return depositDao.findAll(PageRequest.of(0, 50)).getContent();
		return depositDao.findAll(PageRequest.of(0, 50))
		        .map(depositMapper::toDTO)
		        .getContent();

	}

	
	
	@Override
	public @Nullable List<DepositDTO> search(String searchBy, String searchValue, int limit) {
		
		 if (searchValue == null || searchValue.trim().isEmpty()) {
	            return List.of();
	        }

	        List<DepositMaster> result;

	        if ("id".equalsIgnoreCase(searchBy)) {
	            result = depositDao.searchByAccNo(searchValue);
	        } else {
	            result = depositDao.searchByAccHolderName(searchValue);
	        }

	        // return only TOP N records
	        return result.stream().map(depositMapper::toDTO)
	                     .limit(limit)
	                     .toList();
	}


}
