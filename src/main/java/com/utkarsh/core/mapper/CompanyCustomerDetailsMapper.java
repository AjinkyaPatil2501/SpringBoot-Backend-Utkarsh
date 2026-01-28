package com.utkarsh.core.mapper;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CompanyCustomerDetailsDto;
import com.utkarsh.core.model.CompanyCustomerDetails;

@Service
public class CompanyCustomerDetailsMapper {

    /* ================= CREATE ================= */
    public static CompanyCustomerDetails toEntity(CompanyCustomerDetailsDto dto) {
        if (dto == null) return null;

        CompanyCustomerDetails entity = new CompanyCustomerDetails();

        entity.setCompanyName(dto.getCompanyname());
        entity.setConstitutionType(dto.getConstitutionType());
        entity.setNatureOfBusiness(dto.getNatureOfBusiness());
        entity.setDateOfEstablishment(dto.getDateOfEstablishment());
        entity.setCountry(dto.getCountry());
        entity.setState(dto.getState());
        entity.setDistrict(dto.getDistrict());
        entity.setTaluka(dto.getTaluka());
        entity.setCityOrVillage(dto.getCityOrVillage());
        entity.setAddress(dto.getAddress());
        entity.setWardNo(dto.getWardNo());
        entity.setPincode(dto.getPincode());
        entity.setPhoneNo1(dto.getPhoneNo1());
        entity.setPhoneNo2(dto.getPhoneNo2());
        entity.setEmail(dto.getEmail());
        entity.setWebsite(dto.getWebsite());
        entity.setFaxNo(dto.getFaxNo());
        entity.setPanCardNo(dto.getPanCardNo());
        entity.setExciseNo(dto.getExciseNo());
        entity.setTanNo(dto.getTanNo());
        entity.setSalesNo(dto.getSalesNo());

        return entity;
    }

    /* ================= UPDATE (SAFE) ================= */
    public static void updateEntity(
            CompanyCustomerDetailsDto dto,
            CompanyCustomerDetails entity) {

        if (dto == null || entity == null) return;

        if (dto.getCompanyname() != null)
            entity.setCompanyName(dto.getCompanyname());

        if (dto.getConstitutionType() != null)
            entity.setConstitutionType(dto.getConstitutionType());

        if (dto.getNatureOfBusiness() != null)
            entity.setNatureOfBusiness(dto.getNatureOfBusiness());

        if (dto.getDateOfEstablishment() != null)
            entity.setDateOfEstablishment(dto.getDateOfEstablishment());

        if (dto.getCountry() != null)
            entity.setCountry(dto.getCountry());

        if (dto.getState() != null)
            entity.setState(dto.getState());

        if (dto.getDistrict() != null)
            entity.setDistrict(dto.getDistrict());

        if (dto.getTaluka() != null)
            entity.setTaluka(dto.getTaluka());

        if (dto.getCityOrVillage() != null)
            entity.setCityOrVillage(dto.getCityOrVillage());

        if (dto.getAddress() != null)
            entity.setAddress(dto.getAddress());

        if (dto.getWardNo() != null)
            entity.setWardNo(dto.getWardNo());

        if (dto.getPincode() != null)
            entity.setPincode(dto.getPincode());

        if (dto.getPhoneNo1() != null)
            entity.setPhoneNo1(dto.getPhoneNo1());

        if (dto.getPhoneNo2() != null)
            entity.setPhoneNo2(dto.getPhoneNo2());

        if (dto.getEmail() != null)
            entity.setEmail(dto.getEmail());

        if (dto.getWebsite() != null)
            entity.setWebsite(dto.getWebsite());

        if (dto.getFaxNo() != null)
            entity.setFaxNo(dto.getFaxNo());

        if (dto.getPanCardNo() != null)
            entity.setPanCardNo(dto.getPanCardNo());

        if (dto.getExciseNo() != null)
            entity.setExciseNo(dto.getExciseNo());

        if (dto.getTanNo() != null)
            entity.setTanNo(dto.getTanNo());

        if (dto.getSalesNo() != null)
            entity.setSalesNo(dto.getSalesNo());
    }

    public static CompanyCustomerDetailsDto toDto(CompanyCustomerDetails entity) {
        if (entity == null) return null;

        CompanyCustomerDetailsDto dto = new CompanyCustomerDetailsDto();

        dto.setCompanyname(entity.getCompanyName());
        dto.setConstitutionType(entity.getConstitutionType());
        dto.setNatureOfBusiness(entity.getNatureOfBusiness());
        dto.setDateOfEstablishment(entity.getDateOfEstablishment());
        dto.setCountry(entity.getCountry());
        dto.setState(entity.getState());
        dto.setDistrict(entity.getDistrict());
        dto.setTaluka(entity.getTaluka());
        dto.setCityOrVillage(entity.getCityOrVillage());
        dto.setAddress(entity.getAddress());
        dto.setWardNo(entity.getWardNo());
        dto.setPincode(entity.getPincode());
        dto.setPhoneNo1(entity.getPhoneNo1());
        dto.setPhoneNo2(entity.getPhoneNo2());
        dto.setEmail(entity.getEmail());
        dto.setWebsite(entity.getWebsite());
        dto.setFaxNo(entity.getFaxNo());
        dto.setPanCardNo(entity.getPanCardNo());
        dto.setExciseNo(entity.getExciseNo());
        dto.setTanNo(entity.getTanNo());
        dto.setSalesNo(entity.getSalesNo());

        return dto;
    }
}
