package com.utkarsh.core.model;


import jakarta.persistence.*;

@Entity
@Table(name = "occupation_master")
public class OccupationMaster {

    @Id
    @Column(name = "occupation_code")
    private Integer occupationCode;

    @Column(name = "occupation_name", nullable = false, length = 45)
    private String occupationName;

    // Getters and Setters
    public Integer getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(Integer occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }
}
