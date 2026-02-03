package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utkarsh.core.model.Bank;

public interface BankDao extends JpaRepository<Bank, String> {
}
