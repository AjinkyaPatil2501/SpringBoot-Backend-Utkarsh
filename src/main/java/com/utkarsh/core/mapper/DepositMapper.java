package com.utkarsh.core.mapper;


import com.utkarsh.core.dto.DepositDTO;
import com.utkarsh.core.model.Deposit;
import org.springframework.stereotype.Component;

@Component
public class DepositMapper {
    
    public DepositDTO toDTO(Deposit deposit) {
        if (deposit == null) {
            return null;
        }
        
        DepositDTO dto = new DepositDTO();
        dto.setAccountNo(deposit.getAccountNo());
        dto.setJoint(deposit.getJoint());
        dto.setAddress(deposit.getAddress());
        dto.setPhone(deposit.getPhone());
        dto.setMemberNo(deposit.getMemberNo());
        dto.setStartDate(deposit.getStartDate());
        dto.setFirstDate(deposit.getFirstDate());
        dto.setNomineeName(deposit.getNomineeName());
        dto.setMaturityAmount(deposit.getMaturityAmount());
        dto.setFdReceipt(deposit.getFdReceipt());
        dto.setIntTransferG(deposit.getIntTransferG());
        dto.setIntTransferS(deposit.getIntTransferS());
        dto.setPrintFd(deposit.getPrintFd());
        dto.setAutoRenewal(deposit.getAutoRenewal());
        dto.setMemberType(deposit.getMemberType());
        dto.setDirectorCode(deposit.getDirectorCode());
        dto.setIntroducerName(deposit.getIntroducerName());
        dto.setIntroducerAddress(deposit.getIntroducerAddress());
        dto.setIntroducerCityCode(deposit.getIntroducerCityCode());
        dto.setProcRec2(deposit.getProcRec2());
        dto.setProcRec1(deposit.getProcRec1());
        dto.setRelation(deposit.getRelation());
        dto.setAccountName(deposit.getAccountName());
        dto.setDirectorName(deposit.getDirectorName());
        dto.setDueDate(deposit.getDueDate());
        dto.setSavingsIntRate(deposit.getSavingsIntRate());
        dto.setIntRate(deposit.getIntRate());
        dto.setSimpleTodLimit(deposit.getSimpleTodLimit());
        dto.setDailyTodLimit(deposit.getDailyTodLimit());
        dto.setSimpleTodInt(deposit.getSimpleTodInt());
        dto.setChequeAllow(deposit.getChequeAllow());
        dto.setDepositAmount(deposit.getDepositAmount());
        dto.setSavingsDepositAmount(deposit.getSavingsDepositAmount());
        dto.setThisDate(deposit.getThisDate());
        dto.setIntTransferGn(deposit.getIntTransferGn());
        dto.setIntTransferSn(deposit.getIntTransferSn());
        dto.setCityName(deposit.getCityName());
        dto.setIntroducerCityName(deposit.getIntroducerCityName());
        dto.setSpecialInstruction(deposit.getSpecialInstruction());
        dto.setInterestDuration(deposit.getInterestDuration());
        dto.setWithInterest(deposit.getWithInterest());
        dto.setLoanInfo(deposit.getLoanInfo());
        dto.setMemName(deposit.getMemName());
        dto.setEndDate(deposit.getEndDate());
        dto.setMemNo(deposit.getMemNo());
        dto.setMemName2(deposit.getMemName2());
        dto.setMonths(deposit.getMonths());
        dto.setDays(deposit.getDays());
        dto.setCustomerId(deposit.getCustomerId());
        dto.setIsForm15h(deposit.getIsForm15h());
        dto.setChequeBookFlag(deposit.getChequeBookFlag());
        dto.setCategory(deposit.getCategory());
        dto.setAcCode(deposit.getAcCode());
        dto.setIntCalculation(deposit.getIntCalculation());
        dto.setIntTransferFreq(deposit.getIntTransferFreq());
        dto.setIdNo(deposit.getIdNo());
        dto.setLienMark(deposit.getLienMark());
        dto.setLoanAmount(deposit.getLoanAmount());
        dto.setLoanAccountNo(deposit.getLoanAccountNo());
        dto.setSmsApply(deposit.getSmsApply());
        
        return dto;
    }
    
    public Deposit toEntity(DepositDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Deposit deposit = new Deposit();
        deposit.setAccountNo(dto.getAccountNo());
        deposit.setJoint(dto.getJoint());
        deposit.setAddress(dto.getAddress());
        deposit.setPhone(dto.getPhone());
        deposit.setMemberNo(dto.getMemberNo());
        deposit.setStartDate(dto.getStartDate());
        deposit.setFirstDate(dto.getFirstDate());
        deposit.setNomineeName(dto.getNomineeName());
        deposit.setMaturityAmount(dto.getMaturityAmount());
        deposit.setFdReceipt(dto.getFdReceipt());
        deposit.setIntTransferG(dto.getIntTransferG());
        deposit.setIntTransferS(dto.getIntTransferS());
        deposit.setPrintFd(dto.getPrintFd());
        deposit.setAutoRenewal(dto.getAutoRenewal());
        deposit.setMemberType(dto.getMemberType());
        deposit.setDirectorCode(dto.getDirectorCode());
        deposit.setIntroducerName(dto.getIntroducerName());
        deposit.setIntroducerAddress(dto.getIntroducerAddress());
        deposit.setIntroducerCityCode(dto.getIntroducerCityCode());
        deposit.setProcRec2(dto.getProcRec2());
        deposit.setProcRec1(dto.getProcRec1());
        deposit.setRelation(dto.getRelation());
        deposit.setAccountName(dto.getAccountName());
        deposit.setDirectorName(dto.getDirectorName());
        deposit.setDueDate(dto.getDueDate());
        deposit.setSavingsIntRate(dto.getSavingsIntRate());
        deposit.setIntRate(dto.getIntRate());
        deposit.setSimpleTodLimit(dto.getSimpleTodLimit());
        deposit.setDailyTodLimit(dto.getDailyTodLimit());
        deposit.setSimpleTodInt(dto.getSimpleTodInt());
        deposit.setChequeAllow(dto.getChequeAllow());
        deposit.setDepositAmount(dto.getDepositAmount());
        deposit.setSavingsDepositAmount(dto.getSavingsDepositAmount());
        deposit.setThisDate(dto.getThisDate());
        deposit.setIntTransferGn(dto.getIntTransferGn());
        deposit.setIntTransferSn(dto.getIntTransferSn());
        deposit.setCityName(dto.getCityName());
        deposit.setIntroducerCityName(dto.getIntroducerCityName());
        deposit.setSpecialInstruction(dto.getSpecialInstruction());
        deposit.setInterestDuration(dto.getInterestDuration());
        deposit.setWithInterest(dto.getWithInterest());
        deposit.setLoanInfo(dto.getLoanInfo());
        deposit.setMemName(dto.getMemName());
        deposit.setEndDate(dto.getEndDate());
        deposit.setMemNo(dto.getMemNo());
        deposit.setMemName2(dto.getMemName2());
        deposit.setMonths(dto.getMonths());
        deposit.setDays(dto.getDays());
        deposit.setCustomerId(dto.getCustomerId());
        deposit.setIsForm15h(dto.getIsForm15h());
        deposit.setChequeBookFlag(dto.getChequeBookFlag());
        deposit.setCategory(dto.getCategory());
        deposit.setAcCode(dto.getAcCode());
        deposit.setIntCalculation(dto.getIntCalculation());
        deposit.setIntTransferFreq(dto.getIntTransferFreq());
        deposit.setIdNo(dto.getIdNo());
        deposit.setLienMark(dto.getLienMark());
        deposit.setLoanAmount(dto.getLoanAmount());
        deposit.setLoanAccountNo(dto.getLoanAccountNo());
        deposit.setSmsApply(dto.getSmsApply());
        
        return deposit;
    }
    
    public void updateEntityFromDTO(DepositDTO dto, Deposit deposit) {
        if (dto == null || deposit == null) {
            return;
        }
        
        // Don't update primary key
        deposit.setJoint(dto.getJoint());
        deposit.setAddress(dto.getAddress());
        deposit.setPhone(dto.getPhone());
        deposit.setMemberNo(dto.getMemberNo());
        deposit.setStartDate(dto.getStartDate());
        deposit.setFirstDate(dto.getFirstDate());
        deposit.setNomineeName(dto.getNomineeName());
        deposit.setMaturityAmount(dto.getMaturityAmount());
        deposit.setFdReceipt(dto.getFdReceipt());
        deposit.setIntTransferG(dto.getIntTransferG());
        deposit.setIntTransferS(dto.getIntTransferS());
        deposit.setPrintFd(dto.getPrintFd());
        deposit.setAutoRenewal(dto.getAutoRenewal());
        deposit.setMemberType(dto.getMemberType());
        deposit.setDirectorCode(dto.getDirectorCode());
        deposit.setIntroducerName(dto.getIntroducerName());
        deposit.setIntroducerAddress(dto.getIntroducerAddress());
        deposit.setIntroducerCityCode(dto.getIntroducerCityCode());
        deposit.setProcRec2(dto.getProcRec2());
        deposit.setProcRec1(dto.getProcRec1());
        deposit.setRelation(dto.getRelation());
        deposit.setAccountName(dto.getAccountName());
        deposit.setDirectorName(dto.getDirectorName());
        deposit.setDueDate(dto.getDueDate());
        deposit.setSavingsIntRate(dto.getSavingsIntRate());
        deposit.setIntRate(dto.getIntRate());
        deposit.setSimpleTodLimit(dto.getSimpleTodLimit());
        deposit.setDailyTodLimit(dto.getDailyTodLimit());
        deposit.setSimpleTodInt(dto.getSimpleTodInt());
        deposit.setChequeAllow(dto.getChequeAllow());
        deposit.setDepositAmount(dto.getDepositAmount());
        deposit.setSavingsDepositAmount(dto.getSavingsDepositAmount());
        deposit.setThisDate(dto.getThisDate());
        deposit.setIntTransferGn(dto.getIntTransferGn());
        deposit.setIntTransferSn(dto.getIntTransferSn());
        deposit.setCityName(dto.getCityName());
        deposit.setIntroducerCityName(dto.getIntroducerCityName());
        deposit.setSpecialInstruction(dto.getSpecialInstruction());
        deposit.setInterestDuration(dto.getInterestDuration());
        deposit.setWithInterest(dto.getWithInterest());
        deposit.setLoanInfo(dto.getLoanInfo());
        deposit.setMemName(dto.getMemName());
        deposit.setEndDate(dto.getEndDate());
        deposit.setMemNo(dto.getMemNo());
        deposit.setMemName2(dto.getMemName2());
        deposit.setMonths(dto.getMonths());
        deposit.setDays(dto.getDays());
        deposit.setCustomerId(dto.getCustomerId());
        deposit.setIsForm15h(dto.getIsForm15h());
        deposit.setChequeBookFlag(dto.getChequeBookFlag());
        deposit.setCategory(dto.getCategory());
        deposit.setAcCode(dto.getAcCode());
        deposit.setIntCalculation(dto.getIntCalculation());
        deposit.setIntTransferFreq(dto.getIntTransferFreq());
        deposit.setIdNo(dto.getIdNo());
        deposit.setLienMark(dto.getLienMark());
        deposit.setLoanAmount(dto.getLoanAmount());
        deposit.setLoanAccountNo(dto.getLoanAccountNo());
        deposit.setSmsApply(dto.getSmsApply());
    }
}