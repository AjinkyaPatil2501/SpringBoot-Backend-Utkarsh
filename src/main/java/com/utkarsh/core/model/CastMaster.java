package com.utkarsh.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cast_master")
public class CastMaster {

    @Id
    @Column(name = "ccast_code", length = 5)
    private String ccastCode;

    @Column(name = "ccast_name", nullable = false, length = 100)
    private String ccastName;

    
    public CastMaster() {
		super();
	}

	public CastMaster(String ccastCode, String ccastName) {
		super();
		this.ccastCode = ccastCode;
		this.ccastName = ccastName;
	}

	// Getters and Setters
    public String getCcastCode() {
        return ccastCode;
    }

    public void setCcastCode(String ccastCode) {
        this.ccastCode = ccastCode;
    }

    public String getCcastName() {
        return ccastName;
    }

    public void setCcastName(String ccastName) {
        this.ccastName = ccastName;
    }
}
