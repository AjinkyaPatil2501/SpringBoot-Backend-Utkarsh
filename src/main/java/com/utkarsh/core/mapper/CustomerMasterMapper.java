package com.utkarsh.core.mapper;

import java.util.Base64;

import org.springframework.stereotype.Service;

import com.utkarsh.core.dto.CustomerMasterDto;
import com.utkarsh.core.model.CustomerMaster;

@Service
public class CustomerMasterMapper {

	public static  CustomerMaster toEntity(CustomerMasterDto dto) {
		if (dto == null)
			return null;

		CustomerMaster entity = new CustomerMaster();

		entity.setCustomerType(dto.getCustomerType());
		entity.setFirstName(dto.getFirstName());
		entity.setMiddleName(dto.getMiddleName());
		entity.setLastName(dto.getLastName());
		entity.setFatherOrHusbandName(dto.getFatherOrHusbandName());
		entity.setGender(dto.getGender());
		entity.setDateOfBirth(dto.getDateOfBirth());
		entity.setIsMinor(dto.getIsMinor());
		entity.setParentName(dto.getParentName());
		entity.setMaritalStatus(dto.getMaritalStatus());
		entity.setEducation(dto.getEducation());
		entity.setReligion(dto.getReligion());
		entity.setCaste(dto.getCaste());
		entity.setSubCaste(dto.getSubCaste());
		entity.setBloodGroup(dto.getBloodGroup());
		entity.setAddress(dto.getAddress());
		entity.setPhoneNo(dto.getPhoneNo());
		entity.setEmailId(dto.getEmailId());
		entity.setEmailId1(dto.getEmailId1());
		entity.setEmailId2(dto.getEmailId2());
		entity.setPanCardNo(dto.getPanCardNo());
		entity.setAadhaarCardNo(dto.getAadhaarCardNo());
		entity.setGstNo(dto.getGstNo());
		entity.setIntroducerId(dto.getIntroducerId());

		if (dto.getPhotoBase64() != null)
			entity.setPhoto(Base64.getDecoder().decode(dto.getPhotoBase64()));

		if (dto.getSignatureBase64() != null)
			entity.setSignature(Base64.getDecoder().decode(dto.getSignatureBase64()));

		return entity;
	}

	public static  CustomerMasterDto toDto(CustomerMaster entity) {
		if (entity == null)
			return null;

		CustomerMasterDto dto = new CustomerMasterDto();

//	        dto.setCustomerId(entity.getCustomerId());
		dto.setCustomerType(entity.getCustomerType());
		dto.setFirstName(entity.getFirstName());
		dto.setMiddleName(entity.getMiddleName());
		dto.setLastName(entity.getLastName());
		dto.setFatherOrHusbandName(entity.getFatherOrHusbandName());
		dto.setGender(entity.getGender());
		dto.setDateOfBirth(entity.getDateOfBirth());
		dto.setIsMinor(entity.getIsMinor());
		dto.setParentName(entity.getParentName());
		dto.setMaritalStatus(entity.getMaritalStatus());
		dto.setEducation(entity.getEducation());
		dto.setReligion(entity.getReligion());
		dto.setCaste(entity.getCaste());
		dto.setSubCaste(entity.getSubCaste());
		dto.setBloodGroup(entity.getBloodGroup());
		dto.setAddress(entity.getAddress());
		dto.setPhoneNo(entity.getPhoneNo());
		dto.setEmailId(entity.getEmailId());
		dto.setEmailId1(entity.getEmailId1());
		dto.setEmailId2(entity.getEmailId2());
		dto.setPanCardNo(entity.getPanCardNo());
		dto.setAadhaarCardNo(entity.getAadhaarCardNo());
		dto.setGstNo(entity.getGstNo());
		dto.setIntroducerId(entity.getIntroducerId());

		if (entity.getPhoto() != null)
			dto.setPhotoBase64(Base64.getEncoder().encodeToString(entity.getPhoto()));

		if (entity.getSignature() != null)
			dto.setSignatureBase64(Base64.getEncoder().encodeToString(entity.getSignature()));

		return dto;
	}

	public static  void updateEntity(CustomerMasterDto dto, CustomerMaster entity) {
		if (dto == null || entity == null)
			return;

		if (dto.getCustomerType() != null)
			entity.setCustomerType(dto.getCustomerType());

		if (dto.getFirstName() != null)
			entity.setFirstName(dto.getFirstName());

		if (dto.getMiddleName() != null)
			entity.setMiddleName(dto.getMiddleName());

		if (dto.getLastName() != null)
			entity.setLastName(dto.getLastName());

		if (dto.getFatherOrHusbandName() != null)
			entity.setFatherOrHusbandName(dto.getFatherOrHusbandName());

		if (dto.getGender() != null)
			entity.setGender(dto.getGender());

		if (dto.getDateOfBirth() != null)
			entity.setDateOfBirth(dto.getDateOfBirth());

		if (dto.getIsMinor() != null)
			entity.setIsMinor(dto.getIsMinor());

		if (dto.getParentName() != null)
			entity.setParentName(dto.getParentName());

		if (dto.getMaritalStatus() != null)
			entity.setMaritalStatus(dto.getMaritalStatus());

		if (dto.getEducation() != null)
			entity.setEducation(dto.getEducation());

		if (dto.getReligion() != null)
			entity.setReligion(dto.getReligion());

		if (dto.getCaste() != null)
			entity.setCaste(dto.getCaste());

		if (dto.getSubCaste() != null)
			entity.setSubCaste(dto.getSubCaste());

		if (dto.getBloodGroup() != null)
			entity.setBloodGroup(dto.getBloodGroup());

		if (dto.getAddress() != null)
			entity.setAddress(dto.getAddress());

		if (dto.getPhoneNo() != null)
			entity.setPhoneNo(dto.getPhoneNo());

		if (dto.getEmailId() != null)
			entity.setEmailId(dto.getEmailId());

		if (dto.getEmailId1() != null)
			entity.setEmailId1(dto.getEmailId1());

		if (dto.getEmailId2() != null)
			entity.setEmailId2(dto.getEmailId2());

		if (dto.getPanCardNo() != null)
			entity.setPanCardNo(dto.getPanCardNo());

		if (dto.getAadhaarCardNo() != null)
			entity.setAadhaarCardNo(dto.getAadhaarCardNo());

		if (dto.getGstNo() != null)
			entity.setGstNo(dto.getGstNo());

		if (dto.getIntroducerId() != null)
			entity.setIntroducerId(dto.getIntroducerId());

		if (dto.getPhotoBase64() != null)
			entity.setPhoto(Base64.getDecoder().decode(dto.getPhotoBase64()));

		if (dto.getSignatureBase64() != null)
			entity.setSignature(Base64.getDecoder().decode(dto.getSignatureBase64()));
	}

}
