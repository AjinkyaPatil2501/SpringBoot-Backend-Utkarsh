package com.utkarsh.core.dto;

public class UserDTO {
	
	private String cbankId;
    private String cbranId;
    private Integer cuserId;
    private String cuserName;
    private String mobno;
    private String cuserStat;
    private String cuserinit;
    
    public UserDTO() {
		super();
	}

	public UserDTO(String cbankId, String cbranId, Integer cuserId, String cuserName, String mobno, String cuserStat,
			String cuserinit) {
		super();
		this.cbankId = cbankId;
		this.cbranId = cbranId;
		this.cuserId = cuserId;
		this.cuserName = cuserName;
		this.mobno = mobno;
		this.cuserStat = cuserStat;
		this.cuserinit = cuserinit;
	}

	public String getCbankId() {
		return cbankId;
	}

	public void setCbankId(String cbankId) {
		this.cbankId = cbankId;
	}

	public String getCbranId() {
		return cbranId;
	}

	public void setCbranId(String cbranId) {
		this.cbranId = cbranId;
	}

	public Integer getCuserId() {
		return cuserId;
	}

	public void setCuserId(Integer cuserId) {
		this.cuserId = cuserId;
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

	public String getCuserinit() {
		return cuserinit;
	}

	public void setCuserinit(String cuserinit) {
		this.cuserinit = cuserinit;
	}
    
}
