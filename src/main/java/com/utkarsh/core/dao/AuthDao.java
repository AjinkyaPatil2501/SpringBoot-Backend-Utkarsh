package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.User;
import com.utkarsh.core.modelseralizable.UserId;

@Repository
public interface AuthDao extends JpaRepository<User, UserId> {

	@Query(value = "select * from pass where cuser_id =:uid ", nativeQuery = true)
	User getUserDetails(Integer uid);
	
	@Modifying
	@Query("UPDATE User u SET u.deviceId = :deviceId WHERE u.cuserId = :userId")
	void updateDeviceId(@Param("userId") Integer cuserId, @Param("deviceId") String deviceId);

}
