package com.utkarsh.core.mapper;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CompanyPartnersDto;
import com.utkarsh.core.model.CompanyPartners;

@Service
public  class CompanyPartnersMapper {

	public static  CompanyPartners toEntity(CompanyPartnersDto dto) {
        if (dto == null) return null;

        CompanyPartners entity = new CompanyPartners();

        entity.setPartnerId(dto.getPartnerId());
        entity.setCustomerId(dto.getCustomerId());
        entity.setPartnerName(dto.getPartnerName());
        entity.setPanNo(dto.getPanNo());
        entity.setMobileNo(dto.getMobileNo());

        return entity;
    }

    public static  CompanyPartnersDto toDto(CompanyPartners entity) {
        if (entity == null) return null;

        CompanyPartnersDto dto = new CompanyPartnersDto();

        dto.setPartnerId(entity.getPartnerId());
        dto.setCustomerId(entity.getCustomerId());
        dto.setPartnerName(entity.getPartnerName());
        dto.setPanNo(entity.getPanNo());
        dto.setMobileNo(entity.getMobileNo());

        return dto;
    }
    
    /* ================= UPDATE (SAFE) ================= */
    public static  void updateEntity(
            CompanyPartnersDto dto,
            CompanyPartners entity) {

        if (dto == null || entity == null) return;

        // NEVER overwrite IDs blindly
        if (dto.getPartnerName() != null)
            entity.setPartnerName(dto.getPartnerName());

        if (dto.getPanNo() != null)
            entity.setPanNo(dto.getPanNo());

        if (dto.getMobileNo() != null)
            entity.setMobileNo(dto.getMobileNo());
    }
}
