package com.utkarsh.core.serviceimpl;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.utkarsh.core.dao.AuthDao;
import com.utkarsh.core.dao.SysCtrlDao;
import com.utkarsh.core.dao.UserLoginDetailsDao;
import com.utkarsh.core.dto.LoginRequestDto;
import com.utkarsh.core.model.User;
import com.utkarsh.core.model.UserLoginDetails;
import com.utkarsh.core.service.AuthService;

import jakarta.transaction.Transactional;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired AuthDao authdao;
	@Autowired PasswordEncoder passwordEncoder;
	@Autowired UserLoginDetailsDao userlogindetailsdao;
	@Autowired SysCtrlDao sysctrldao;
	
	@Override
	public User getUserDetails(LoginRequestDto login) {
		
		User user = authdao.getUserDetails(login.getCuserId());
//	    if (user == null) {
//	        return null;
//	    }

	    boolean status = passwordEncoder.matches(login.getCpassword(), user.getCpassword());
	    if (!status) {
	        return null;
	    }

//	    if (user.getFingerprint() == null || login.getFingerprint() == null) {
//	        return false;
//	    }
//
//	    if (!user.getFingerprint().equals(login.getFingerprint())) {
//	        return false;
//	    }
	    
	    UserLoginDetails log = new UserLoginDetails();
	    log.setUserId(user.getCuserId().toString());
	    log.setUserName(user.getCuserName());
	    log.setBankId(user.getCbankId());
	    log.setBranchId(user.getCbranId());
        log.setPassword(user.getCpassword());
	    log.setLoginDate(LocalDate.now());
	    log.setLoginTime(LocalTime.now().toString());
	    log.setLoginFlag("Y");
	    log.setLogoutFlag("N");

	    userlogindetailsdao.save(log);

	    return user;
	}
	
	@Override
	@Transactional
	public void updateDeviceId(Integer cuserId, String deviceId) {
		authdao.updateDeviceId(cuserId, deviceId);
	}

	@Override
	public User findByUserId(String userId) {
	    return authdao.getUserDetails(Integer.parseInt(userId));
	}

	@Override
	public String getLanguage() {
		String  lang  = sysctrldao.getLanguage();
		System.out.println(lang);
		return lang;
	}
}
