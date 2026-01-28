package com.utkarsh.core.model;

import jakarta.persistence.*;


@Entity
@Table(name = "citymast")
public class CityMaster {

    @Id
    @Column(name = "ccity_code", nullable = false)
    private Integer cityCode;

    @Column(name = "ccity_name", length = 40)
    private String cityName;

    @Column(name = "ctalukaid")
    private Integer talukaId;
    


	public CityMaster(Integer cityCode, String cityName, Integer talukaId) {
		super();
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.talukaId = talukaId;
	}



	public CityMaster() {
		super();
	}

	

	public Integer getCityCode() {
		return cityCode;
	}

	public void setCityCode(Integer cityCode) {
		this.cityCode = cityCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public Integer getTalukaId() {
		return talukaId;
	}



	public void setTalukaId(Integer talukaId) {
		this.talukaId = talukaId;
	}


    
    
}
