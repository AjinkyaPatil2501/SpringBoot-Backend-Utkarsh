package com.utkarsh.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "districtmaster")
public class DistrictMaster {

    @Id
    @Column(name = "districtid", nullable = false)
    private Integer districtId;

    @Column(name = "districtname", length = 45, nullable = false)
    private String districtName;

    @Column(name = "stateid", nullable = false)
    private Integer stateId;
    

	public DistrictMaster(Integer districtId, String districtName, Integer stateId) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
		this.stateId = stateId;
	}


	public DistrictMaster() {
		super();
	}


	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}


	public Integer getStateId() {
		return stateId;
	}


	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

    
    
}
