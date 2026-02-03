package com.utkarsh.core.serviceimpl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.utkarsh.core.dao.UserCrudDao;
import com.utkarsh.core.dto.UpdateUserDTO;
import com.utkarsh.core.dto.UserDTO;
import com.utkarsh.core.mapper.UserDTOMapper;
import com.utkarsh.core.mapper.UserUpdateMapper;
import com.utkarsh.core.model.User;
import com.utkarsh.core.service.UserCrudService;

@Service
public class UserCrudServiceImpl implements UserCrudService{

	@Autowired
	UserCrudDao usercruddao;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public List<User> getAllUsers() {
		return usercruddao.findAll();
	           
	}
	
	@Override
	public boolean registerUser(User user) {
	    String branchId = user.getCbranId();  
	    User sameUser = usercruddao.findSameUser(user.getCuserName(), user.getMobno());
	    User lastUser = usercruddao.findLastUserInBranch(branchId);

	    if (sameUser != null) return false;

	    int nextEmpNumber = 1;

	    // DEFAULT USER STATUS
	    if (user.getCuserStat() == null || user.getCuserStat().isBlank()) {
	        user.setCuserStat("A"); // Active
	    }

	    if (lastUser != null) {
	        // ------------------ CHANGED PART ------------------
	        // Ensure lastUser ID is treated as 4-digit string
	        String lastIdStr = String.format("%04d", lastUser.getCuserId());

	        // Extract the numeric part correctly (last 2 digits)
	        String numericPart = lastIdStr.substring(lastIdStr.length() - 2);
	        nextEmpNumber = Integer.parseInt(numericPart) + 1;
	        // --------------------------------------------------
	    }

	    // Generate new cuser_id
	    String newIdStr = branchId + String.format("%02d", nextEmpNumber);

	    System.out.println("branch-id : "+branchId+" new gen id : "+ newIdStr);
	    
	    // ------------------ CHANGED PART ------------------
	    // Safely parse new ID
	    int newUserId = Integer.parseInt(newIdStr);
	    user.setCuserId(newUserId);
	    // --------------------------------------------------

	    // Encode password
	    String hashed = passwordEncoder.encode(user.getCpassword());
	    user.setCpassword(hashed);

	    return usercruddao.save(user) != null;
	}

	
	
	@Override
	public User getByUserId(int userid) {
		User user = usercruddao.getByUserId(userid);
		
		if(user == null) {
			return null;
		}
//		return UserDTOMapper.mapToUserDTO(user);
		return user;
	}

//	@Override
//	public UserDTO getByUserName(String username) {
//        User user = usercruddao.getByUserName(username);
//		
//		if(user == null) {
//			return null;
//		}
//		return UserDTOMapper.mapToUserDTO(user);
//	}
	
	@Override
	public List<User> getByUserName(String username) {
	    List<User> users = usercruddao.getByUserName(username); // now returns a List<User>

	    if (users == null || users.isEmpty()) {
	        return Collections.emptyList();
	    }

	    // Map each User to UserDTO
	    return users;
	}


	@Override
	public UserDTO updateUser(UpdateUserDTO dto) {
		
	    User user = usercruddao.getByUserId(dto.getCuserId());

	    if (user == null) {
	        return null;   
	    }
	    if(dto.getCpassword()!=null) {
	    String hashed = passwordEncoder.encode(dto.getCpassword());
	    user.setCpassword(hashed);}
	    UserUpdateMapper.applyUpdates(user, dto);

	    User savedUser = usercruddao.save(user);

	    return UserDTOMapper.mapToUserDTO(savedUser);
	}

	@Override
	public boolean deleteUser(int userid) {
		
		User user = usercruddao.getByUserId(userid);

	    if (user == null) {
	        return false;   
	    }
		 usercruddao.delete(user);
		 return true;
	}
}
