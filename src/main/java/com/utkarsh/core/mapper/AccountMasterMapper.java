package com.utkarsh.core.mapper;

import java.math.BigDecimal;

import com.utkarsh.core.dto.DepositAccountRequest;
import com.utkarsh.core.model.AccountMaster;

public class AccountMasterMapper {

	/* ================= TO ENTITY ================= */
	public static AccountMaster toEntity(DepositAccountRequest dto, String accountNo) {
		if (dto == null)
			return null;

		AccountMaster entity = new AccountMaster();

		entity.setCaccountNo(accountNo);
		entity.setCacType("S");
		entity.setCheadShor(dto.getCustomerName());

		entity.setNytdCr(BigDecimal.ZERO);
		entity.setNytdDr(BigDecimal.ZERO);

		entity.setCintType("");
		entity.setCloanType("");
		entity.setCacStatus("A");

		entity.setNunpassDr(BigDecimal.ZERO);
		entity.setNunpassCr(BigDecimal.ZERO);

		entity.setCallowTod("");

		// ❌ FIXED: never pass empty string to BigDecimal
		entity.setNtodLimit(BigDecimal.ZERO);
		entity.setNtodInt(BigDecimal.ZERO);

		entity.setDtodDueD(null);
		entity.setDlastTrD(dto.getOpeningDate());
		entity.setDlastInt(dto.getOpeningDate());

		entity.setCintApply(dto.getDeductInterest());

		entity.setNacBal(BigDecimal.ZERO);
		entity.setNinterest(BigDecimal.ZERO);
		entity.setNodInt(BigDecimal.ZERO);

		entity.setCshortCod("");
		entity.setCshortNam(dto.getEnglishName());

		entity.setNfreezeAm(BigDecimal.ZERO);

		entity.setCfrztype("");
		entity.setCfrzreason("");

		entity.setNnoticeCr(BigDecimal.ZERO);
		entity.setNrecCrg(BigDecimal.ZERO);
		entity.setNstampCrg(BigDecimal.ZERO);
		entity.setNinsurance(BigDecimal.ZERO);

		entity.setDlastPnl(null);
		entity.setDlastintrc(null);

		entity.setCprocessR(dto.getIsRecovery());
		entity.setCmemberNo(dto.getMemberNo());

		entity.setNotherCrg(BigDecimal.ZERO);

		entity.setCposting("");
		entity.setTrading("");
		entity.setCcity("");

		entity.setCustomerId(dto.getCustomerNumber());

		return entity;
	}
}
