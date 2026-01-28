package com.utkarsh.core.mapper;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CustomerOccupationDto;
import com.utkarsh.core.model.CustomerOccupation;

@Service
public class CustomerOccupationMapper {

	public static  CustomerOccupation toEntity(CustomerOccupationDto dto) {
        if (dto == null) return null;

        CustomerOccupation entity = new CustomerOccupation();

        entity.setOccupationPk(dto.getOccupationPk());
        entity.setOccupationId(dto.getOccupationId());
        entity.setOccupationAddress(dto.getOccupationAddress());
        entity.setOccupationPhone1(dto.getOccupationPhone1());
        entity.setOccupationPhone2(dto.getOccupationPhone2());
        entity.setOccupationEmail(dto.getOccupationEmail());
        entity.setOccupationName(dto.getOccupationName());

        return entity;
    }

	public static  CustomerOccupationDto toDto(CustomerOccupation entity) {
        if (entity == null) return null;

        CustomerOccupationDto dto = new CustomerOccupationDto();

        dto.setOccupationPk(entity.getOccupationPk());
        dto.setOccupationId(entity.getOccupationId());
        dto.setOccupationAddress(entity.getOccupationAddress());
        dto.setOccupationPhone1(entity.getOccupationPhone1());
        dto.setOccupationPhone2(entity.getOccupationPhone2());
        dto.setOccupationEmail(entity.getOccupationEmail());
        dto.setOccupationName(entity.getOccupationName());

        return dto;
    }
    
	public static  void updateEntity(CustomerOccupationDto dto, CustomerOccupation entity) {
        if (dto == null || entity == null) return;

        if (dto.getOccupationId() != null)
            entity.setOccupationId(dto.getOccupationId());

        if (dto.getOccupationName() != null)
            entity.setOccupationName(dto.getOccupationName());

        if (dto.getOccupationAddress() != null)
            entity.setOccupationAddress(dto.getOccupationAddress());

        if (dto.getOccupationPhone1() != null)
            entity.setOccupationPhone1(dto.getOccupationPhone1());

        if (dto.getOccupationPhone2() != null)
            entity.setOccupationPhone2(dto.getOccupationPhone2());

        if (dto.getOccupationEmail() != null)
            entity.setOccupationEmail(dto.getOccupationEmail());
    }

}
