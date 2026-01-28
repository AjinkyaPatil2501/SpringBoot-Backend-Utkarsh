package com.utkarsh.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "education_master")
public class EducationMaster {

    @Id
    @Column(name = "ceducation_id")
    private Integer ceducationId;

    @Column(name = "ceducation_name", nullable = false, length = 100)
    private String ceducationName;
    

    public EducationMaster() {
		super();
	}

	public EducationMaster(Integer ceducationId, String ceducationName) {
		super();
		this.ceducationId = ceducationId;
		this.ceducationName = ceducationName;
	}

	// Getters and Setters
    public Integer getCeducationId() {
        return ceducationId;
    }

    public void setCeducationId(Integer ceducationId) {
        this.ceducationId = ceducationId;
    }

    public String getCeducationName() {
        return ceducationName;
    }

    public void setCeducationName(String ceducationName) {
        this.ceducationName = ceducationName;
    }
}
