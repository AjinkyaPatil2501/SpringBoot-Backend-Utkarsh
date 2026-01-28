package com.utkarsh.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.utkarsh.core.model.CustomerAuditLog;

public interface CustomerAuditLogDao extends JpaRepository<CustomerAuditLog, Integer> {
}
