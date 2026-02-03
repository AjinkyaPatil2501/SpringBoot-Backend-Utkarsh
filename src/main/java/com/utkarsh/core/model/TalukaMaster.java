package com.utkarsh.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "talukamaster")
public class TalukaMaster {

    @Id
    @Column(name = "talukaid")
    private Integer talukaId;

    @Column(name = "Talukaname", nullable = false)
    private String talukaName;

    @Column(name = "districtid", nullable = false)
    private Integer districtId; // reference to DistrictMaster

    // Constructors
    public TalukaMaster() {}
    
    

    public TalukaMaster(Integer talukaId, String talukaName, Integer districtId) {
		super();
		this.talukaId = talukaId;
		this.talukaName = talukaName;
		this.districtId = districtId;
	}



	// Getters and Setters
    public Integer getTalukaId() {
        return talukaId;
    }

    public void setTalukaId(Integer talukaId) {
        this.talukaId = talukaId;
    }

    public String getTalukaName() {
        return talukaName;
    }

    public void setTalukaName(String talukaName) {
        this.talukaName = talukaName;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }
}

