package com.utkarsh.core.dto;

import java.time.LocalDate;

public class UpdateUserDTO {

	    private Integer cuserId;
	    private String cuserName;
	    private String mobno;
	    private String cuserInit;
	    private String cuserStat;
	    private String ccashier;
	    private String cteller;
	    private String cpassword;
	    private LocalDate frDate;
	    private LocalDate toDate;
	    private String frTime;
	    private String toTime;
	   
//	    private LocalTime frTime;       
//	    private LocalTime toTime;
	    
	    private String etime;
	    private byte[] photo;
		public UpdateUserDTO() {
			super();
		}
		
		public UpdateUserDTO(Integer cuserId, String cuserName, String mobno, String cuserInit, String cuserStat,
				String ccashier, String cteller, LocalDate frDate, LocalDate toDate, String frTime, String toTime,
				String cpassword, String etime, byte[] photo) {
			super();
			this.cuserId = cuserId;
			this.cuserName = cuserName;
			this.mobno = mobno;
			this.cuserInit = cuserInit;
			this.cuserStat = cuserStat;
			this.ccashier = ccashier;
			this.cteller = cteller;
			this.frDate = frDate;
			this.toDate = toDate;
			this.frTime = frTime;
			this.toTime = toTime;
			this.cpassword = cpassword;
			this.etime = etime;
			this.photo = photo;
		}

		public String getCpassword() {
			return cpassword;
		}
		
		public void setCpassword(String cpassword) {
			this.cpassword = cpassword;
		}

		public String getCuserInit() {
			return cuserInit;
		}

		public void setCuserInit(String cuserInit) {
			this.cuserInit = cuserInit;
		}

		public Integer getCuserId() {
			return cuserId;
		}
		public void setCuserId(Integer cuserid) {
			this.cuserId = cuserid;
		}
		public String getCuserName() {
			return cuserName;
		}
		public void setCuserName(String cuserName) {
			this.cuserName = cuserName;
		}
		public String getMobno() {
			return mobno;
		}
		public void setMobno(String mobno) {
			this.mobno = mobno;
		}
		public String getCuserStat() {
			return cuserStat;
		}
		public void setCuserStat(String cuserStat) {
			this.cuserStat = cuserStat;
		}
		public String getCcashier() {
			return ccashier;
		}
		public void setCcashier(String ccashier) {
			this.ccashier = ccashier;
		}
		public String getCteller() {
			return cteller;
		}
		public void setCteller(String cteller) {
			this.cteller = cteller;
		}
		public LocalDate getFrDate() {
			return frDate;
		}
		public void setFrDate(LocalDate frDate) {
			this.frDate = frDate;
		}
		public LocalDate getToDate() {
			return toDate;
		}
		public void setToDate(LocalDate toDate) {
			this.toDate = toDate;
		}
		public String getFrTime() {
			return frTime;
		}
		public void setFrTime(String frTime) {
			this.frTime = frTime;
		}
		public String getToTime() {
			return toTime;
		}
		public void setToTime(String toTime) {
			this.toTime = toTime;
		}
		public String getEtime() {
			return etime;
		}
		public void setEtime(String etime) {
			this.etime = etime;
		}
		public byte[] getPhoto() {
			return photo;
		}
		public void setPhoto(byte[] photo) {
			this.photo = photo;
		}
	    
	   
	    
}
