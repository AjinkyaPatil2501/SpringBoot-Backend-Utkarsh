package com.utkarsh.core.mapper;

import com.utkarsh.core.dto.UpdateUserDTO;
import com.utkarsh.core.model.User;

public class UserUpdateMapper {

	public static void applyUpdates(User user, UpdateUserDTO dto) {

        if (dto.getCuserName() != null && !dto.getCuserName().trim().isEmpty())
            user.setCuserName(dto.getCuserName().trim());

        if (dto.getMobno() != null && !dto.getMobno().trim().isEmpty())
            user.setMobno(dto.getMobno().trim());

        if (dto.getCuserInit() != null && !dto.getCuserInit().trim().isEmpty())
        	user.setCuserInit(dto.getCuserInit().trim());
        	
        if (dto.getCuserStat() != null && !dto.getCuserStat().trim().isEmpty())
            user.setCuserStat(dto.getCuserStat().trim());

        if (dto.getCcashier() != null && !dto.getCcashier().trim().isEmpty())
            user.setCcashier(dto.getCcashier().trim());

        if (dto.getCteller() != null && !dto.getCteller().trim().isEmpty())
            user.setCteller(dto.getCteller().trim());

        if (dto.getFrDate() != null)
            user.setFrDate(dto.getFrDate());

        if (dto.getToDate() != null)
            user.setToDate(dto.getToDate());

        if (dto.getFrTime() != null && !dto.getFrTime().trim().isEmpty())
            user.setFrTime(dto.getFrTime().trim());

        if (dto.getToTime() != null && !dto.getToTime().trim().isEmpty())
            user.setToTime(dto.getToTime().trim());

        if (dto.getEtime() != null && !dto.getEtime().trim().isEmpty())
            user.setEtime(dto.getEtime().trim());

        if (dto.getPhoto() != null)
            user.setPhoto(dto.getPhoto());
    }
}
