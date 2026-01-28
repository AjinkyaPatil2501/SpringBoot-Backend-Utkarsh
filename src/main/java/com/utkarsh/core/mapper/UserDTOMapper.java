package com.utkarsh.core.mapper;

import com.utkarsh.core.dto.UserDTO;
import com.utkarsh.core.model.User;

public class UserDTOMapper {
	public static UserDTO mapToUserDTO(User u) {
        return new UserDTO(
                u.getCbankId(),
                u.getCbranId(),
                u.getCuserId(),
                u.getCuserName(),
                u.getMobno(),
                u.getCuserStat(),
                u.getCuserInit()
        );
    }

    public static User mapToUser(UserDTO dto) {
        User u = new User();

        u.setCbankId(dto.getCbankId());
        u.setCbranId(dto.getCbranId());
        u.setCuserId(dto.getCuserId());
        u.setCuserName(dto.getCuserName());
        u.setMobno(dto.getMobno());
        u.setCuserStat(dto.getCuserStat());
        u.setCcashier(dto.getCuserinit());
        return u;
    }
}
