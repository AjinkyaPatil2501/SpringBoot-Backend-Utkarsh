package com.utkarsh.core.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import com.utkarsh.core.dao.AgentMasterDao;
import com.utkarsh.core.dao.CityMasterDao;
import com.utkarsh.core.dao.CustomerAddressDao;
import com.utkarsh.core.dao.CustomerMasterDao;
import com.utkarsh.core.dao.DepositDao;
import com.utkarsh.core.dao.DirectorMasterDao;
import com.utkarsh.core.dao.GlParamDao;
import com.utkarsh.core.dao.ShareMasterDao;
import com.utkarsh.core.dto.AgentDto;
import com.utkarsh.core.dto.DepositDetailsDto;
import com.utkarsh.core.dto.DirectorDto;
import com.utkarsh.core.dto.GeneralLedgerCodeDto;
import com.utkarsh.core.dto.PersonalInfoDto;
import com.utkarsh.core.model.CustomerAddress;
import com.utkarsh.core.model.CustomerMaster;
import com.utkarsh.core.model.Deposit;
import com.utkarsh.core.service.DepositService;

import jakarta.transaction.Transactional;

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

	@Override
	public @Nullable DepositDetailsDto allRequiredDetails() {
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
	public @Nullable String searchByCustomerId(String customerId) {

		String accountNo = shareMasterDao.findAccountNoByCustomerId(customerId);

		if (accountNo == null) {
			return null;
		}
		return accountNo.length() > 8 ? accountNo.substring(accountNo.length() - 8) : accountNo;
	}

	@Override
	public @Nullable PersonalInfoDto searchAddress(String customerId) {
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
		return dto;
	}

	
	
	@Override
	@Transactional
	public @Nullable Object getAllAccounts() {
		
		return depositDao.findAll(PageRequest.of(0, 50)).getContent();
	}

	
	
	@Override
	public @Nullable List<Deposit> search(String searchBy, String searchValue, int limit) {
		
		 if (searchValue == null || searchValue.trim().isEmpty()) {
	            return List.of();
	        }

	        List<Deposit> result;

	        if ("id".equalsIgnoreCase(searchBy)) {
	            result = depositDao.searchByAccNo(searchValue);
	        } else {
	            result = depositDao.searchByAccHolderName(searchValue);
	        }

	        // return only TOP N records
	        return result.stream()
	                     .limit(limit)
	                     .toList();
	}

}
