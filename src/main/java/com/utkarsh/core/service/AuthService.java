package com.utkarsh.core.service;

import com.utkarsh.core.dto.LoginRequestDto;
import com.utkarsh.core.model.User;

public interface AuthService {

	User getUserDetails(LoginRequestDto login);

	void updateDeviceId(Integer cuserId, String deviceId);

	User findByUserId(String userId);

	String getLanguage();

}
