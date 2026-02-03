package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utkarsh.core.model.UserLoginDetails;

@Repository
public interface UserLoginDetailsDao extends JpaRepository<UserLoginDetails, String> {

}
