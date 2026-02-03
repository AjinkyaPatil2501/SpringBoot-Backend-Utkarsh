package com.utkarsh.core.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.User;
import com.utkarsh.core.modelseralizable.UserId;

@Repository
public interface UserCrudDao extends JpaRepository<User, UserId> {

	@Query(value = "select * from pass where cuser_id =:userid",nativeQuery = true)
	User getByUserId(int userid);

	
//	@Query(value = "select * from pass where cuser_name =:username",nativeQuery = true)
//	User getByUserName(String username);
	
	@Query(value="SELECT * FROM pass  WHERE cuser_name =:username",nativeQuery = true)
	List<User> getByUserName( String username);
	
	@Query(value = "SELECT * FROM pass WHERE cbran_id = :branchId ORDER BY cuser_id DESC LIMIT 1" , nativeQuery = true)
	User findLastUserInBranch(String branchId);
	
	@Query(value = "SELECT * FROM pass WHERE cuser_name = :cuserName AND mobno = :mobno" , nativeQuery = true)
	User findSameUser(String cuserName, String mobno);

}
