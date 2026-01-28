package com.utkarsh.core.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login_details")
public class UserLoginDetails {

    @Id
    @Column(name = "user_id", length = 4)
    private String userId;

    @Column(name = "pasword", length = 45, nullable = false)
    private String password;

    @Column(name = "login_date_d", nullable = true)//, nullable = false
    private LocalDate loginDate;

    @Column(name = "login_time", length = 45, nullable = false)
    private String loginTime;

    @Column(name = "logout_date_d", nullable = true) //, nullable = false
    private LocalDate logoutDate;

    @Column(name = "logout_time", length = 45, nullable = false)
    private String logoutTime;

    @Column(name = "login_flag", length = 1, nullable = false)
    private String loginFlag;

    @Column(name = "logout_flag", length = 1, nullable = false)
    private String logoutFlag;

    @Column(name = "bank_id", length = 3, nullable = false)
    private String bankId;

    @Column(name = "branch_id", length = 3, nullable = false)
    private String branchId;

    @Column(name = "user_name", length = 45, nullable = false)
    private String userName;

    public UserLoginDetails(String userId, String password, LocalDate loginDate, String loginTime, LocalDate logoutDate,
			String logoutTime, String loginFlag, String logoutFlag, String bankId, String branchId, String userName) {
		super();
		this.userId = userId;
		this.password = password;
		this.loginDate = loginDate;
		this.loginTime = loginTime;
		this.logoutDate = logoutDate;
		this.logoutTime = logoutTime;
		this.loginFlag = loginFlag;
		this.logoutFlag = logoutFlag;
		this.bankId = bankId;
		this.branchId = branchId;
		this.userName = userName;
	}

	public UserLoginDetails() {
		super();
	}

	public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public LocalDate getLogoutDate() {
        return logoutDate;
    }

    public void setLogoutDate(LocalDate logoutDate) {
        this.logoutDate = logoutDate;
    }

    public String getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(String logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag;
    }

    public String getLogoutFlag() {
        return logoutFlag;
    }

    public void setLogoutFlag(String logoutFlag) {
        this.logoutFlag = logoutFlag;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
