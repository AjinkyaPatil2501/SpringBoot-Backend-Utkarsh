package com.utkarsh.core.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "bran_mst")
public class Branch {

    @Id
    @Column(name = "cbran_code", length = 3, nullable = false)
    private String cbranCode;

    @Column(name = "cbran_name", length = 100, nullable = false)
    private String cbranName;

    @Column(name = "cbank_code", length = 3)
    private String cbankCode;

    @Column(name = "ncr_lst_no", length = 6)
    private String ncrLstNo;

    @Column(name = "ndr_lst_no", length = 6)
    private String ndrLstNo;

    @Column(name = "dstart_dt")
    private LocalDate dstartDt;

    @Column(name = "dend_dt")
    private LocalDate dendDt;

    @Column(name = "dcurrent_d")
    private LocalDate dcurrentD;

    @Column(name = "cday_beg", length = 1)
    private String cdayBeg;

	
	public Branch(String cbranCode, String cbranName, String cbankCode, String ncrLstNo, String ndrLstNo,
			LocalDate dstartDt, LocalDate dendDt, LocalDate dcurrentD, String cdayBeg) {
		super();
		this.cbranCode = cbranCode;
		this.cbranName = cbranName;
		this.cbankCode = cbankCode;
		this.ncrLstNo = ncrLstNo;
		this.ndrLstNo = ndrLstNo;
		this.dstartDt = dstartDt;
		this.dendDt = dendDt;
		this.dcurrentD = dcurrentD;
		this.cdayBeg = cdayBeg;
	}

	public Branch() {
		super();
	}

	public String getCbranCode() {
		return cbranCode;
	}

	public void setCbranCode(String cbranCode) {
		this.cbranCode = cbranCode;
	}

	public String getCbranName() {
		return cbranName;
	}

	public void setCbranName(String cbranName) {
		this.cbranName = cbranName;
	}

	public String getCbankCode() {
		return cbankCode;
	}

	public void setCbankCode(String cbankCode) {
		this.cbankCode = cbankCode;
	}

	public String getNcrLstNo() {
		return ncrLstNo;
	}

	public void setNcrLstNo(String ncrLstNo) {
		this.ncrLstNo = ncrLstNo;
	}

	public String getNdrLstNo() {
		return ndrLstNo;
	}

	public void setNdrLstNo(String ndrLstNo) {
		this.ndrLstNo = ndrLstNo;
	}

	public LocalDate getDstartDt() {
		return dstartDt;
	}

	public void setDstartDt(LocalDate dstartDt) {
		this.dstartDt = dstartDt;
	}

	public LocalDate getDendDt() {
		return dendDt;
	}

	public void setDendDt(LocalDate dendDt) {
		this.dendDt = dendDt;
	}

	public LocalDate getDcurrentD() {
		return dcurrentD;
	}

	public void setDcurrentD(LocalDate dcurrentD) {
		this.dcurrentD = dcurrentD;
	}

	public String getCdayBeg() {
		return cdayBeg;
	}

	public void setCdayBeg(String cdayBeg) {
		this.cdayBeg = cdayBeg;
	}

	
   
}
