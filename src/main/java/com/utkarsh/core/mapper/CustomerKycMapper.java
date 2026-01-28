package com.utkarsh.core.mapper;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CustomerKycDTO;
import com.utkarsh.core.model.CustomerKyc;

@Service
public class CustomerKycMapper {

	public static CustomerKyc toEntity(CustomerKycDTO dto) {
        if (dto == null) return null;

        CustomerKyc entity = new CustomerKyc();
        entity.setDocName(dto.getDocName());
        entity.setDocNumber(dto.getDocNumber());
        entity.setDocPhoto(dto.getDocPhoto());

        return entity;
    }

    public static  CustomerKycDTO toDto(CustomerKyc entity) {
        if (entity == null) return null;

        CustomerKycDTO dto = new CustomerKycDTO();
        dto.setDocName(entity.getDocName());
        dto.setDocNumber(entity.getDocNumber());
        dto.setDocPhoto(entity.getDocPhoto());

        return dto;
    }
    
    public static  void updateEntity(CustomerKycDTO dto, CustomerKyc entity) {
        if (dto == null || entity == null) return;

        if (dto.getDocName() != null)
            entity.setDocName(dto.getDocName());

        if (dto.getDocNumber() != null)
            entity.setDocNumber(dto.getDocNumber());

        if (dto.getDocPhoto() != null)
            entity.setDocPhoto(dto.getDocPhoto());
    }

}
