package com.utkarsh.core.mapper;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CustomerAddressDto;
import com.utkarsh.core.model.CustomerAddress;

@Service
public class CustomerAddressMapper {

	public static  CustomerAddress toEntity(CustomerAddressDto dto) {
        if (dto == null) return null;

        CustomerAddress entity = new CustomerAddress();

//        entity.setCustomerId(dto.getCustomerId());
        entity.setLocalCountry(dto.getLocalCountry());
        entity.setLocalState(dto.getLocalState());
        entity.setLocalDistrict(dto.getLocalDistrict());
        entity.setLocalTaluka(dto.getLocalTaluka());
        entity.setLocalCityOrVillage(dto.getLocalCityOrVillage());
        entity.setLocalAddress(dto.getLocalAddress());
        entity.setLocalWardNo(dto.getLocalWardNo());
        entity.setLocalPincode(dto.getLocalPincode());
        entity.setLocalPhone1(dto.getLocalPhone1());
        entity.setLocalPhone2(dto.getLocalPhone2());
        entity.setLocalMobile1(dto.getLocalMobile1());
        entity.setLocalMobile2(dto.getLocalMobile2());

        entity.setPermanentCountry(dto.getPermanentCountry());
        entity.setPermanentState(dto.getPermanentState());
        entity.setPermanentDistrict(dto.getPermanentDistrict());
        entity.setPermanentTaluka(dto.getPermanentTaluka());
        entity.setPermanentCityOrVillage(dto.getPermanentCityOrVillage());
        entity.setPermanentAddress(dto.getPermanentAddress());
        entity.setPermanentWardNo(dto.getPermanentWardNo());
        entity.setPermanentPincode(dto.getPermanentPincode());
        entity.setPermanentPhone1(dto.getPermanentPhone1());
        entity.setPermanentPhone2(dto.getPermanentPhone2());
        entity.setPermanentMobile1(dto.getPermanentMobile1());
        entity.setPermanentMobile2(dto.getPermanentMobile2());

        return entity;
    }

    public static  CustomerAddressDto toDto(CustomerAddress entity) {
        if (entity == null) return null;

        CustomerAddressDto dto = new CustomerAddressDto();

//        dto.setCustomerId(entity.getCustomerId());
        dto.setLocalCountry(entity.getLocalCountry());
        dto.setLocalState(entity.getLocalState());
        dto.setLocalDistrict(entity.getLocalDistrict());
        dto.setLocalTaluka(entity.getLocalTaluka());
        dto.setLocalCityOrVillage(entity.getLocalCityOrVillage());
        dto.setLocalAddress(entity.getLocalAddress());
        dto.setLocalWardNo(entity.getLocalWardNo());
        dto.setLocalPincode(entity.getLocalPincode());
        dto.setLocalPhone1(entity.getLocalPhone1());
        dto.setLocalPhone2(entity.getLocalPhone2());
        dto.setLocalMobile1(entity.getLocalMobile1());
        dto.setLocalMobile2(entity.getLocalMobile2());

        dto.setPermanentCountry(entity.getPermanentCountry());
        dto.setPermanentState(entity.getPermanentState());
        dto.setPermanentDistrict(entity.getPermanentDistrict());
        dto.setPermanentTaluka(entity.getPermanentTaluka());
        dto.setPermanentCityOrVillage(entity.getPermanentCityOrVillage());
        dto.setPermanentAddress(entity.getPermanentAddress());
        dto.setPermanentWardNo(entity.getPermanentWardNo());
        dto.setPermanentPincode(entity.getPermanentPincode());
        dto.setPermanentPhone1(entity.getPermanentPhone1());
        dto.setPermanentPhone2(entity.getPermanentPhone2());
        dto.setPermanentMobile1(entity.getPermanentMobile1());
        dto.setPermanentMobile2(entity.getPermanentMobile2());

        return dto;
    }
    
    public static  void updateEntity(
            CustomerAddressDto dto,
            CustomerAddress entity) {

        if (dto == null || entity == null) return;

        /* ========== LOCAL ADDRESS ========== */
        if (dto.getLocalCountry() != null)
            entity.setLocalCountry(dto.getLocalCountry());

        if (dto.getLocalState() != null)
            entity.setLocalState(dto.getLocalState());

        if (dto.getLocalDistrict() != null)
            entity.setLocalDistrict(dto.getLocalDistrict());

        if (dto.getLocalTaluka() != null)
            entity.setLocalTaluka(dto.getLocalTaluka());

        if (dto.getLocalCityOrVillage() != null)
            entity.setLocalCityOrVillage(dto.getLocalCityOrVillage());

        if (dto.getLocalAddress() != null)
            entity.setLocalAddress(dto.getLocalAddress());

        if (dto.getLocalWardNo() != null)
            entity.setLocalWardNo(dto.getLocalWardNo());

        if (dto.getLocalPincode() != null)
            entity.setLocalPincode(dto.getLocalPincode());

        if (dto.getLocalPhone1() != null)
            entity.setLocalPhone1(dto.getLocalPhone1());

        if (dto.getLocalPhone2() != null)
            entity.setLocalPhone2(dto.getLocalPhone2());

        if (dto.getLocalMobile1() != null)
            entity.setLocalMobile1(dto.getLocalMobile1());

        if (dto.getLocalMobile2() != null)
            entity.setLocalMobile2(dto.getLocalMobile2());

        /* ========== PERMANENT ADDRESS ========== */
        if (dto.getPermanentCountry() != null)
            entity.setPermanentCountry(dto.getPermanentCountry());

        if (dto.getPermanentState() != null)
            entity.setPermanentState(dto.getPermanentState());

        if (dto.getPermanentDistrict() != null)
            entity.setPermanentDistrict(dto.getPermanentDistrict());

        if (dto.getPermanentTaluka() != null)
            entity.setPermanentTaluka(dto.getPermanentTaluka());

        if (dto.getPermanentCityOrVillage() != null)
            entity.setPermanentCityOrVillage(dto.getPermanentCityOrVillage());

        if (dto.getPermanentAddress() != null)
            entity.setPermanentAddress(dto.getPermanentAddress());

        if (dto.getPermanentWardNo() != null)
            entity.setPermanentWardNo(dto.getPermanentWardNo());

        if (dto.getPermanentPincode() != null)
            entity.setPermanentPincode(dto.getPermanentPincode());

        if (dto.getPermanentPhone1() != null)
            entity.setPermanentPhone1(dto.getPermanentPhone1());

        if (dto.getPermanentPhone2() != null)
            entity.setPermanentPhone2(dto.getPermanentPhone2());

        if (dto.getPermanentMobile1() != null)
            entity.setPermanentMobile1(dto.getPermanentMobile1());

        if (dto.getPermanentMobile2() != null)
            entity.setPermanentMobile2(dto.getPermanentMobile2());
    }

}
