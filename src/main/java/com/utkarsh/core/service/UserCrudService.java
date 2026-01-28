package com.utkarsh.core.service;

import java.util.List;

import com.utkarsh.core.dto.UpdateUserDTO;
import com.utkarsh.core.dto.UserDTO;
import com.utkarsh.core.model.User;

public interface UserCrudService {

	List<User> getAllUsers();

	User getByUserId(int userid);

//	UserDTO getByUserName(String username);

	UserDTO updateUser( UpdateUserDTO dto);

	boolean deleteUser(int userid);
	
	boolean registerUser(User user);

	List<User> getByUserName(String username);

}
