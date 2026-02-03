package com.utkarsh.core.mapper;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.DepositAccountRequest;
import com.utkarsh.core.dto.DepositDTO;
import com.utkarsh.core.model.DepositMaster;

@Service
public class DepositMasterMapper {

	/* ================= TO ENTITY ================= */
	public static DepositMaster toEntity(DepositAccountRequest dto, String accountNo) {
		if (dto == null)
			return null;

		DepositMaster entity = new DepositMaster();

		entity.setCaccountNo(accountNo);
		entity.setCjoint(dto.getJointAccount());
		entity.setCadd1(dto.getAddress());
		entity.setCphone(dto.getPhone());

		entity.setMemName(dto.getMemberNo());

		entity.setDstartDat(dto.getOpeningDate());
		entity.setDfirstDat(dto.getAsOnDate());

		entity.setCnomineenm(dto.getNomineeName());
		entity.setNmatuAmt(dto.getMaturityAmount());

		entity.setCfdReceip(dto.getDepositReceiptNo());

		entity.setCintTrfG(dto.getInterestLedgerNo());
		entity.setCintTrfGn(dto.getInterestLedgerName());
		entity.setCintTrfS(dto.getInterestAccountNo());
		entity.setCintTrfSn(dto.getInterestAccountName());

		entity.setCprintFd(dto.getIsPrinted() != null ? dto.getIsPrinted() : "N");
		entity.setCautoRene(dto.getAutoRenewal());

		entity.setCdirCode(dto.getDirectorCode());
		entity.setCdirName(dto.getDirectorName());

		entity.setIntrName(dto.getIntroducerName());
		entity.setIntrAdd1(dto.getIntroducerAddress());
		entity.setIntrCityc(null);
		entity.setIntrCityn(dto.getIntroducerCity());

		entity.setCprocRec1(dto.getIncludeInRecovery());
		entity.setCprocRec2(dto.getIsRecovery());

		entity.setCrelation(dto.getDepositType());
		entity.setAccName(dto.getCustomerName());

		entity.setSdueDate(dto.getMaturityDate());
		entity.setDendDat(dto.getMaturityDate());

		entity.setSintRate(dto.getInterestRate());
		entity.setFintRate(dto.getInterestRate());

		entity.setStodLimit(dto.getTempLoanLimit());
		entity.setDtodLimit(dto.getTempLoanLimit());
		entity.setStodInt(dto.getTempLoanInterestRate());

		entity.setSchqAllow(dto.getCheckBook());

		entity.setFdepoAmt(dto.getDepositAmount());
		entity.setSdepoAmt(dto.getSavingsAmount());

		entity.setThisDate(dto.getOpeningDate());
		entity.setCcityn(dto.getCity());

		entity.setCsplintrc(dto.getSpecialInstruction());
		entity.setCintDura(dto.getInterestPeriodMonths());
		entity.setCwint(dto.getWithInterest());

		entity.setCloanInfo(null);

		entity.setMemno(dto.getMemberNo());
		entity.setMemname(dto.getCustomerName());

		// ✅ SAFE null handling
		entity.setNmonth(dto.getTermMonths() != null ? dto.getTermMonths().toString() : "0");
		entity.setNday(dto.getTermDays() != null ? dto.getTermDays().toString() : "0");

		entity.setCustomerId(dto.getCustomerNumber());
		entity.setIsform15h(dto.getForm15H());
		entity.setChequebookflag(dto.getCheckBook());
		entity.setCcatagory(dto.getDepositType());

		entity.setCacode(null);
		entity.setCintCal(null);
		entity.setCidNo(null);

		// ✅ SAFE BigDecimal creation
		entity.setNintTranFrq(
			    dto.getInterestPeriodMonths() != null && !dto.getInterestPeriodMonths().trim().isEmpty()
			        ? new BigDecimal(dto.getInterestPeriodMonths().trim())
			        : BigDecimal.ZERO
			);

		entity.setLienmark("N");
		entity.setLoanamt(BigDecimal.ZERO);
		entity.setLoanaccno(null);

		entity.setSmsApply(dto.getSmsService());

		return entity;
	}
	
	public DepositDTO toDTO(DepositMaster deposit) {
	    if (deposit == null) {
	        return null;
	    }

	    DepositDTO dto = new DepositDTO();

	    dto.setAccountNo(deposit.getCaccountNo());
	    dto.setJoint(deposit.getCjoint());
	    dto.setAddress(deposit.getCadd1());
	    dto.setPhone(deposit.getCphone());
	    dto.setMemberNo(deposit.getCmemberNo());

	    dto.setStartDate(deposit.getDstartDat());
	    dto.setFirstDate(deposit.getDfirstDat());

	    dto.setNomineeName(deposit.getCnomineenm());
	    dto.setMaturityAmount(deposit.getNmatuAmt());

	    dto.setFdReceipt(deposit.getCfdReceip());
	    dto.setIntTransferG(deposit.getCintTrfG());
	    dto.setIntTransferS(deposit.getCintTrfS());
	    dto.setPrintFd(deposit.getCprintFd());
	    dto.setAutoRenewal(deposit.getCautoRene());

	    dto.setMemberType(deposit.getCmembType());
	    dto.setDirectorCode(deposit.getCdirCode());
	    dto.setDirectorName(deposit.getCdirName());

	    dto.setIntroducerName(deposit.getIntrName());
	    dto.setIntroducerAddress(deposit.getIntrAdd1());
	    dto.setIntroducerCityCode(deposit.getIntrCityc());
	    dto.setIntroducerCityName(deposit.getIntrCityn());

	    dto.setProcRec1(deposit.getCprocRec1());
	    dto.setProcRec2(deposit.getCprocRec2());

	    dto.setRelation(deposit.getCrelation());
	    dto.setAccountName(deposit.getAccName());

	    dto.setDueDate(deposit.getSdueDate());
	    dto.setEndDate(deposit.getDendDat());

	    dto.setSavingsIntRate(deposit.getSintRate());
	    dto.setIntRate(deposit.getFintRate());

	    dto.setSimpleTodLimit(deposit.getStodLimit());
	    dto.setDailyTodLimit(deposit.getDtodLimit());
	    dto.setSavingsTodInt(deposit.getStodInt());

	    dto.setChequeAllow(deposit.getSchqAllow());

	    dto.setDepositAmount(deposit.getFdepoAmt());
	    dto.setSavingsDepositAmount(deposit.getSdepoAmt());

	    dto.setThisDate(deposit.getThisDate());

	    dto.setIntTransferGn(deposit.getCintTrfGn());
	    dto.setIntTransferSn(deposit.getCintTrfSn());

	    dto.setCityName(deposit.getCcityn());
	    dto.setSpecialInstruction(deposit.getCsplintrc());
	    dto.setInterestDuration(deposit.getCintDura());
	    dto.setWithInterest(deposit.getCwint());

	    dto.setLoanInfo(deposit.getCloanInfo());

	    dto.setMemName(deposit.getMemName());
	    dto.setMemNo(deposit.getMemno());
	    dto.setMemName2(deposit.getMemname());

	    dto.setMonths(deposit.getNmonth());
	    dto.setDays(deposit.getNday());

	    dto.setCustomerId(deposit.getCustomerId());
	    dto.setIsForm15h(deposit.getIsform15h());
	    dto.setChequeBookFlag(deposit.getChequebookflag());
	    dto.setCategory(deposit.getCcatagory());

	    dto.setAcCode(deposit.getCacode());
	    dto.setIntCalculation(deposit.getCintCal());

	    dto.setIntTransferFreq(deposit.getNintTranFrq());
	    dto.setIdNo(deposit.getCidNo());

	    dto.setLienMark(deposit.getLienmark());
	    dto.setLoanAmount(deposit.getLoanamt());
	    dto.setLoanAccountNo(deposit.getLoanaccno());

	    dto.setSmsApply(deposit.getSmsApply());

	    return dto;
	}

	    
}
