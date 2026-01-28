package com.utkarsh.core.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.utkarsh.core.modelseralizable.UserId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@IdClass(UserId.class)
@Table(name = "pass")
public class User {
	@Id
    @Column(name = "cbank_id", length = 3, nullable = false)
    private String cbankId;

    @Id
    @Column(name = "cbran_id", length = 3, nullable = false)
    private String cbranId;

    @Id
    @Column(name = "cuser_id", nullable = false)
    private Integer cuserId;   

    @Column(name = "cuser_init", length = 2, nullable = false)
    private String cuserInit;

    @Column(name = "cuser_stat", length = 1, nullable = false)
    private String cuserStat;

    @Column(name = "cuser_name", length = 50)
    private String cuserName;

    @Column(name = "nuser_dr_c", precision = 10, scale = 2, nullable = false)
    private BigDecimal nuserDrC;

    @Column(name = "ccashier", length = 1, nullable = false)
    private String ccashier;

    @Column(name = "cteller", length = 1, nullable = false)
    private String cteller;

    @Column(name = "cpassword", length = 100, nullable = false)
    private String cpassword;

//    @Column(name = "mpassword", length = 55, nullable = false)
//    private String mpassword;
    
    @Column(name = "mpassword", length = 55)
    private String mpassword;

    @Column(name = "fingerprint", length = 500, nullable = true)
    private String fingerprint;
    
    @Column(name = "fr_date")
    private LocalDate frDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column(name = "fr_time", length = 20)
    private String frTime;

    @Column(name = "to_time", length = 20)
    private String toTime;

    @Column(name = "etime", length = 1)
    private String etime;

    @Column(name = "mobno", length = 10)
    private String mobno;

    @Lob
    @Column(name = "Photo")
    private byte[] photo;

    @Column(name = "pass", length = 45)
    private String pass;

    @Column(name = "Log_on", length = 45)
    private String logOn;

    @Column(name = "device_id", length = 255 , nullable = true)
    private String deviceId;
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public User() {
		super();
	}
 
	public User(String cbankId, String cbranId, Integer cuserId, String cuserInit, String cuserStat, String cuserName,
			BigDecimal nuserDrC, String ccashier, String cteller, String cpassword, String mpassword,
			String fingerprint, LocalDate frDate, LocalDate toDate, String frTime, String toTime, String etime,
			String mobno, byte[] photo, String pass, String logOn, String deviceId) {
		super();
		this.cbankId = cbankId;
		this.cbranId = cbranId;
		this.cuserId = cuserId;
		this.cuserInit = cuserInit;
		this.cuserStat = cuserStat;
		this.cuserName = cuserName;
		this.nuserDrC = nuserDrC;
		this.ccashier = ccashier;
		this.cteller = cteller;
		this.cpassword = cpassword;
		this.mpassword = mpassword;
		this.fingerprint = fingerprint;
		this.frDate = frDate;
		this.toDate = toDate;
		this.frTime = frTime;
		this.toTime = toTime;
		this.etime = etime;
		this.mobno = mobno;
		this.photo = photo;
		this.pass = pass;
		this.logOn = logOn;
		this.deviceId = deviceId;
	}
	public String getCbankId() {
		return cbankId;
	}

	public String getCbranId() {
		return cbranId;
	}

	public Integer getCuserId() {
		return cuserId;
	}

	public String getCuserInit() {
		return cuserInit;
	}

	public String getCuserStat() {
		return cuserStat;
	}

	public String getCuserName() {
		return cuserName;
	}

	public BigDecimal getNuserDrC() {
		return nuserDrC;
	}

	public String getCcashier() {
		return ccashier;
	}

	public String getCteller() {
		return cteller;
	}

	public String getCpassword() {
		return cpassword;
	}

	public String getMpassword() {
		return mpassword;
	}

	public LocalDate getFrDate() {
		return frDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public String getFrTime() {
		return frTime;
	}

	public String getToTime() {
		return toTime;
	}

	public String getEtime() {
		return etime;
	}

	public String getMobno() {
		return mobno;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public String getPass() {
		return pass;
	}

	public String getLogOn() {
		return logOn;
	}

	public void setCbankId(String cbankId) {
		this.cbankId = cbankId;
	}

	public void setCbranId(String cbranId) {
		this.cbranId = cbranId;
	}

	public void setCuserId(Integer cuserId) {
		this.cuserId = cuserId;
	}

	public void setCuserInit(String cuserInit) {
		this.cuserInit = cuserInit;
	}

	public void setCuserStat(String cuserStat) {
		this.cuserStat = cuserStat;
	}

	public void setCuserName(String cuserName) {
		this.cuserName = cuserName;
	}

	public void setNuserDrC(BigDecimal nuserDrC) {
		this.nuserDrC = nuserDrC;
	}

	public void setCcashier(String ccashier) {
		this.ccashier = ccashier;
	}

	public void setCteller(String cteller) {
		this.cteller = cteller;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public void setFrDate(LocalDate frDate) {
		this.frDate = frDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}

	public void setFrTime(String frTime) {
		this.frTime = frTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getFingerprint() {
		return fingerprint;
	}
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setLogOn(String logOn) {
		this.logOn = logOn;
	} 
}
