package com.utkarsh.core.dto;

public class CustomerOccupationDto {


    private Integer occupationPk;
    private String occupationId;
    private String occupationAddress;
    private String occupationPhone1;
    private String occupationPhone2;
    private String occupationEmail;
    private String occupationName;
   

    
    
	public CustomerOccupationDto() {
		super();
	}
	
	
	
	public CustomerOccupationDto(Integer occupationPk, String occupationId, String occupationAddress,
			String occupationPhone1, String occupationPhone2, String occupationEmail, String occupationName) {
		super();
		this.occupationPk = occupationPk;
		this.occupationId = occupationId;
		this.occupationAddress = occupationAddress;
		this.occupationPhone1 = occupationPhone1;
		this.occupationPhone2 = occupationPhone2;
		this.occupationEmail = occupationEmail;
		this.occupationName = occupationName;
	}



	public Integer getOccupationPk() {
		return occupationPk;
	}
	public void setOccupationPk(Integer occupationPk) {
		this.occupationPk = occupationPk;
	}
	public String getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(String occupationId) {
		this.occupationId = occupationId;
	}
	public String getOccupationAddress() {
		return occupationAddress;
	}
	public void setOccupationAddress(String occupationAddress) {
		this.occupationAddress = occupationAddress;
	}
	public String getOccupationPhone1() {
		return occupationPhone1;
	}
	public void setOccupationPhone1(String occupationPhone1) {
		this.occupationPhone1 = occupationPhone1;
	}
	public String getOccupationPhone2() {
		return occupationPhone2;
	}
	public void setOccupationPhone2(String occupationPhone2) {
		this.occupationPhone2 = occupationPhone2;
	}
	public String getOccupationEmail() {
		return occupationEmail;
	}
	public void setOccupationEmail(String occupationEmail) {
		this.occupationEmail = occupationEmail;
	}
	public String getOccupationName() {
		return occupationName;
	}
	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}
	
    
}
