package com.utkarsh.core.dto;

public class LoginResponseDto {

	    private Integer userId;
	    private String userName;
	    private String bankId;
	    private String branchId;
	    private byte[] photo;
	    private String cuserStat;
	    
		public String getCuserStat() {
			return cuserStat;
		}
		public void setCuserStat(String cuserStat) {
			this.cuserStat = cuserStat;
		}
		public Integer getUserId() {
			return userId;
		}
		public void setUserId(Integer userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
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
		public byte[] getPhoto() {
			return photo;
		}
		public void setPhoto(byte[] photo) {
			this.photo = photo;
		}
	    
}
