package com.utkarsh.core.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "director_master")
public class DirectorMaster {

    @Id @Column(name = "cdir_code", nullable = false)
    private Integer cdirCode;

    @Column(name = "cdir_name", length = 60, nullable = false)
    private String cdirName;

    @Column(name = "cdir_add", length = 100, nullable = false)
    private String cdirAdd;

    @Column(name = "cdir_city", length = 20, nullable = false)
    private String cdirCity;

    @Column(name = "cdir_phone", length = 15, nullable = false)
    private String cdirPhone;

    @Column(name = "cdir_mobi", length = 15, nullable = false)
    private String cdirMobi;

    @Column(name = "cdir_statu", length = 20, nullable = false)
    private String cdirStatu;

    @Column(name = "cexit", length = 1, nullable = false)
    private String cexit;

    @Column(name = "cdir_cityn", length = 45, nullable = false)
    private String cdirCityn;

    @Column(name = "cust_id", length = 12, nullable = false)
    private String custId;

	public DirectorMaster() {
		super();
	}

	public DirectorMaster(Integer cdirCode, String cdirName, String cdirAdd, String cdirCity, String cdirPhone,
			String cdirMobi, String cdirStatu, String cexit, String cdirCityn, String custId) {
		super();
		this.cdirCode = cdirCode;
		this.cdirName = cdirName;
		this.cdirAdd = cdirAdd;
		this.cdirCity = cdirCity;
		this.cdirPhone = cdirPhone;
		this.cdirMobi = cdirMobi;
		this.cdirStatu = cdirStatu;
		this.cexit = cexit;
		this.cdirCityn = cdirCityn;
		this.custId = custId;
	}

	public Integer getCdirCode() {
		return cdirCode;
	}

	public void setCdirCode(Integer cdirCode) {
		this.cdirCode = cdirCode;
	}

	public String getCdirName() {
		return cdirName;
	}

	public void setCdirName(String cdirName) {
		this.cdirName = cdirName;
	}

	public String getCdirAdd() {
		return cdirAdd;
	}

	public void setCdirAdd(String cdirAdd) {
		this.cdirAdd = cdirAdd;
	}

	public String getCdirCity() {
		return cdirCity;
	}

	public void setCdirCity(String cdirCity) {
		this.cdirCity = cdirCity;
	}

	public String getCdirPhone() {
		return cdirPhone;
	}

	public void setCdirPhone(String cdirPhone) {
		this.cdirPhone = cdirPhone;
	}

	public String getCdirMobi() {
		return cdirMobi;
	}

	public void setCdirMobi(String cdirMobi) {
		this.cdirMobi = cdirMobi;
	}

	public String getCdirStatu() {
		return cdirStatu;
	}

	public void setCdirStatu(String cdirStatu) {
		this.cdirStatu = cdirStatu;
	}

	public String getCexit() {
		return cexit;
	}

	public void setCexit(String cexit) {
		this.cexit = cexit;
	}

	public String getCdirCityn() {
		return cdirCityn;
	}

	public void setCdirCityn(String cdirCityn) {
		this.cdirCityn = cdirCityn;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}
  
    
}
