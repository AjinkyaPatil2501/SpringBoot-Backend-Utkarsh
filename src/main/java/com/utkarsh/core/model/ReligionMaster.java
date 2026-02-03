package com.utkarsh.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "religion_master")
public class ReligionMaster {

    @Id
    @Column(name = "creligion_id", length = 3)
    private String creligionId;

    @Column(name = "creligion_name", length = 45)
    private String creligionName;

    
    public ReligionMaster() {
		super();
	}

	public ReligionMaster(String creligionId, String creligionName) {
		super();
		this.creligionId = creligionId;
		this.creligionName = creligionName;
	}

	// Getters and Setters
    public String getCreligionId() {
        return creligionId;
    }

    public void setCreligionId(String creligionId) {
        this.creligionId = creligionId;
    }

    public String getCreligionName() {
        return creligionName;
    }

    public void setCreligionName(String creligionName) {
        this.creligionName = creligionName;
    }
}
