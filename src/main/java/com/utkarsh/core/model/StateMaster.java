package com.utkarsh.core.model;
import jakarta.persistence.*;

@Entity
@Table(name = "statemaster")
public class StateMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stateid", nullable = false)
    private Integer stateId;

    @Column(name = "statename", length = 45, nullable = false)
    private String stateName;

    @Column(name = "ccountry_id", nullable = false, length = 3)
    private String countryId;

	public StateMaster() {
		super();
	}

	

	public StateMaster(Integer stateId, String stateName, String countryId) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.countryId = countryId;
	}



	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}



	public String getCountryId() {
		return countryId;
	}



	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}


    
    
}
