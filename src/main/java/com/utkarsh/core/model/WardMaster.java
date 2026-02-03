package com.utkarsh.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "wardmaster")
public class WardMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wardid", nullable = false)
    private Integer wardId;

    @Column(name = "wardname", length = 45, nullable = false)
    private String wardName;

    @Column(name = "ccity_code", nullable = false)
    private Integer cityCode;
    

	public WardMaster() {
		super();
	}

	

	public WardMaster(Integer wardId, String wardName, Integer cityCode) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
		this.cityCode = cityCode;
	}



	public Integer getWardId() {
		return wardId;
	}

	public void setWardId(Integer wardId) {
		this.wardId = wardId;
	}

	public String getWardName() {
		return wardName;
	}

	public void setWardName(String wardName) {
		this.wardName = wardName;
	}

	public Integer getCityCode() {
		return cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	
    
}

