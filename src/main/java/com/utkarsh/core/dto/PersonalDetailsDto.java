package com.utkarsh.core.dto;

import java.util.List;

import com.utkarsh.core.model.CastMaster;
import com.utkarsh.core.model.CityMaster;
import com.utkarsh.core.model.CountryMaster;
import com.utkarsh.core.model.DistrictMaster;
import com.utkarsh.core.model.EducationMaster;
import com.utkarsh.core.model.OccupationMaster;
import com.utkarsh.core.model.ReligionMaster;
import com.utkarsh.core.model.StateMaster;
import com.utkarsh.core.model.TalukaMaster;
import com.utkarsh.core.model.WardMaster;

public class PersonalDetailsDto {

	private List<EducationMaster> educationList;
    private List<CastMaster> castList;
    private List<ReligionMaster> religionList;
	private List<CountryMaster> countryList;
	private List<StateMaster> stateList;
	private List<DistrictMaster> districtList;
	private List<CityMaster> cityList;
	private List<TalukaMaster> talukaList;
	private List<WardMaster> wardList;
	private List<OccupationMaster> occupationList;
	
	public PersonalDetailsDto() {
		super();
	}

	public PersonalDetailsDto(List<EducationMaster> educationList, List<CastMaster> castList,
			List<ReligionMaster> religionList, List<CountryMaster> countryList, List<StateMaster> stateList,
			List<DistrictMaster> districtList, List<CityMaster> cityList, List<TalukaMaster> talukaList,
			List<WardMaster> wardList, List<OccupationMaster> occupationList) {
		super();
		this.educationList = educationList;
		this.castList = castList;
		this.religionList = religionList;
		this.countryList = countryList;
		this.stateList = stateList;
		this.districtList = districtList;
		this.cityList = cityList;
		this.talukaList = talukaList;
		this.wardList = wardList;
		this.occupationList = occupationList;
	}

	public List<EducationMaster> getEducationList() {
		return educationList;
	}

	public void setEducationList(List<EducationMaster> educationList) {
		this.educationList = educationList;
	}

	public List<CastMaster> getCastList() {
		return castList;
	}

	public void setCastList(List<CastMaster> castList) {
		this.castList = castList;
	}

	public List<ReligionMaster> getReligionList() {
		return religionList;
	}

	public void setReligionList(List<ReligionMaster> religionList) {
		this.religionList = religionList;
	}

	public List<CountryMaster> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<CountryMaster> countryList) {
		this.countryList = countryList;
	}

	public List<StateMaster> getStateList() {
		return stateList;
	}

	public void setStateList(List<StateMaster> stateList) {
		this.stateList = stateList;
	}

	public List<DistrictMaster> getDistrictList() {
		return districtList;
	}

	public void setDistrictList(List<DistrictMaster> districtList) {
		this.districtList = districtList;
	}

	public List<CityMaster> getCityList() {
		return cityList;
	}

	public void setCityList(List<CityMaster> cityList) {
		this.cityList = cityList;
	}

	public List<TalukaMaster> getTalukaList() {
		return talukaList;
	}

	public void setTalukaList(List<TalukaMaster> talukaList) {
		this.talukaList = talukaList;
	}

	public List<WardMaster> getWardList() {
		return wardList;
	}

	public void setWardList(List<WardMaster> wardList) {
		this.wardList = wardList;
	}

	public List<OccupationMaster> getOccupationList() {
		return occupationList;
	}

	public void setOccupationList(List<OccupationMaster> occupationList) {
		this.occupationList = occupationList;
	}

	
}
