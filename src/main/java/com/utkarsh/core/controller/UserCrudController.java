package com.utkarsh.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.utkarsh.core.dto.UpdateUserDTO;
import com.utkarsh.core.dto.UserDTO;
import com.utkarsh.core.model.User;
import com.utkarsh.core.service.UserCrudService;

@RestController
@RequestMapping("/users/v1")
public class UserCrudController {

	@Autowired
	UserCrudService usercrudservice;
	
	
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user) {
		

		
		boolean status = usercrudservice.registerUser(user);
		if(status) return ResponseEntity.ok("user register successfully") ;
		else return ResponseEntity.ok("user register failed");
	}
	
	@GetMapping("")
	public ResponseEntity<List<User>> getAllUsers() {
		List<User> users = usercrudservice.getAllUsers();

        if (users.isEmpty()) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(users);
	}
	
	@GetMapping("/userid/{userid}")
	public ResponseEntity<User> getByUserId(@PathVariable int userid){
		
		User user = usercrudservice.getByUserId(userid);
		if(user == null) {
			 return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(user);
	}
	
//	@GetMapping("/username/{username}")
//	public ResponseEntity<UserDTO> getByUserName(@PathVariable String username){
//		UserDTO user = usercrudservice.getByUserName(username);
//		if(user == null) {
//			 return ResponseEntity.noContent().build();
//		}
//		return ResponseEntity.ok(user);
//	}
	
	@GetMapping("/username/{username}")
	public ResponseEntity<List<User>> getByUserName(@PathVariable String username) {
	    List<User> users = usercrudservice.getByUserName(username);

	    if (users.isEmpty()) {
	        return ResponseEntity.noContent().build();
	    }

	    return ResponseEntity.ok(users);
	}

	
	@PatchMapping("/update")
	public String updateUser(@RequestBody UpdateUserDTO dto) {
		 UserDTO updated = usercrudservice.updateUser( dto);
		 if(updated!=null)
		    return "User updated successfully";
		 else 
			 return "user updation failed";
	}
	
	@DeleteMapping("/delete/{userid}")
	public String deleteUser(@PathVariable int userid) {
		boolean status = usercrudservice.deleteUser(userid);
		if(status) return "User deleted successfully";
		else return "user deletion failed";
	}
	
	
	
}
