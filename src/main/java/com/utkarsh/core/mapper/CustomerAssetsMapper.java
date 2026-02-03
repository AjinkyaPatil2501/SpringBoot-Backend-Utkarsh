package com.utkarsh.core.mapper;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CustomerAssetsDto;
import com.utkarsh.core.model.CustomerAssets;

@Service
public class CustomerAssetsMapper {

	public static  CustomerAssets toEntity(CustomerAssetsDto dto) {
        if (dto == null) return null;

        CustomerAssets entity = new CustomerAssets();

        entity.setAssetId(dto.getAssetId());
//        entity.setCustomerId(dto.getCustomerId());
        entity.setAssetName(dto.getAssetName());
        entity.setAssetValue(dto.getAssetValue());
        entity.setAssetPhoto(dto.getAssetPhoto());
        entity.setAnnualIncome(dto.getAnnualIncome());
        entity.setNetWorth(dto.getNetWorth());
        entity.setUsableLandAcre(dto.getUsableLandAcre());
        entity.setUsableLandGuntha(dto.getUsableLandGuntha());
        entity.setTotalLandAcre(dto.getTotalLandAcre());
        entity.setTotalLandGuntha(dto.getTotalLandGuntha());
        entity.setEAgreementEndDate(dto.geteAgreementEndDate());
       
        
        return entity;
    }

    public static  CustomerAssetsDto toDto(CustomerAssets entity) {
        if (entity == null) return null;

        CustomerAssetsDto dto = new CustomerAssetsDto();

        dto.setAssetId(entity.getAssetId());
//        dto.setCustomerId(entity.getCustomerId());
        dto.setAssetName(entity.getAssetName());
        dto.setAssetValue(entity.getAssetValue());
        dto.setAssetPhoto(entity.getAssetPhoto());
        dto.setAnnualIncome(entity.getAnnualIncome());
        dto.setNetWorth(entity.getNetWorth());
        dto.setUsableLandAcre(entity.getUsableLandAcre());
        dto.setUsableLandGuntha(entity.getUsableLandGuntha());
        dto.setTotalLandAcre(entity.getTotalLandAcre());
        dto.setTotalLandGuntha(entity.getTotalLandGuntha());
        dto.seteAgreementEndDate(entity.getEAgreementEndDate());

       
        return dto;
    }
    
    public static  void updateEntity(
            CustomerAssetsDto dto,
            CustomerAssets entity) {

        if (dto == null || entity == null) return;

        if (dto.getAssetName() != null)
            entity.setAssetName(dto.getAssetName());

        if (dto.getAssetValue() != null)
            entity.setAssetValue(dto.getAssetValue());

        if (dto.getAssetPhoto() != null)
            entity.setAssetPhoto(dto.getAssetPhoto());

        if (dto.getAnnualIncome() != null)
            entity.setAnnualIncome(dto.getAnnualIncome());

        if (dto.getNetWorth() != null)
            entity.setNetWorth(dto.getNetWorth());

        if (dto.getUsableLandAcre() != null)
            entity.setUsableLandAcre(dto.getUsableLandAcre());

        if (dto.getUsableLandGuntha() != null)
            entity.setUsableLandGuntha(dto.getUsableLandGuntha());

        if (dto.getTotalLandAcre() != null)
            entity.setTotalLandAcre(dto.getTotalLandAcre());

        if (dto.getTotalLandGuntha() != null)
            entity.setTotalLandGuntha(dto.getTotalLandGuntha());

        if (dto.geteAgreementEndDate() != null)
            entity.setEAgreementEndDate(dto.geteAgreementEndDate());
    }

}
