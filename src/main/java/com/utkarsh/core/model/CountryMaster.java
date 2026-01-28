package com.utkarsh.core.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "country_master")
public class CountryMaster {

    @Id
    @Column(name = "ccountry_id", length = 3, nullable = false)
    private String countryId;

    @Column(name = "ccountry_name", length = 45)
    private String countryName;


	public CountryMaster() {
		super();
	}

	public CountryMaster(String countryId, String countryName, List<StateMaster> states) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;

	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
    
    
}
