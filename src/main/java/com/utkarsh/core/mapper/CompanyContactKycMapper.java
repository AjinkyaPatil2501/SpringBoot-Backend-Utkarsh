package com.utkarsh.core.mapper;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CompanyContactKycDto;
import com.utkarsh.core.model.CompanyContactKyc;

@Service
public class CompanyContactKycMapper {

    public static CompanyContactKyc toEntity(CompanyContactKycDto dto) {
        if (dto == null) return null;

        CompanyContactKyc entity = new CompanyContactKyc();
        entity.setKycDocName(dto.getKycDocName());
        entity.setKycDocNumber(dto.getKycDocNumber());
        entity.setKycDocImage(dto.getKycDocImage());

        return entity;
    }

    /* ================= UPDATE SAFE METHOD ================= */
    public static void updateEntity(CompanyContactKycDto dto, CompanyContactKyc entity) {
        if (dto == null || entity == null) return;

        if (dto.getKycDocName() != null)
            entity.setKycDocName(dto.getKycDocName());

        if (dto.getKycDocNumber() != null)
            entity.setKycDocNumber(dto.getKycDocNumber());

        // Only update image if frontend sends it
        if (dto.getKycDocImage() != null)
            entity.setKycDocImage(dto.getKycDocImage());
    }

    public static CompanyContactKycDto toDto(CompanyContactKyc entity) {
        if (entity == null) return null;

        CompanyContactKycDto dto = new CompanyContactKycDto();
        dto.setKycDocName(entity.getKycDocName());
        dto.setKycDocNumber(entity.getKycDocNumber());
        dto.setKycDocImage(entity.getKycDocImage());

        return dto;
    }
}
