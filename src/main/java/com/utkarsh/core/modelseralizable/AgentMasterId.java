package com.utkarsh.core.modelseralizable;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("unused")
public class AgentMasterId implements Serializable {


	private static final long serialVersionUID = 1L;
    private String cheadDtl;
    private String cadd1;
    private String ccityc;
    private String cphone;
    private BigDecimal ncomm;
    private String trGl;
    private String trSl;
    private String secGl;
    private String secSl;
    private BigDecimal secAmt;
    private String ccityn;
    private String caccountNo;
	public AgentMasterId(String cheadDtl, String cadd1, String ccityc, String cphone, BigDecimal ncomm, String trGl,
			String trSl, String secGl, String secSl, BigDecimal secAmt, String ccityn, String caccountNo) {
		super();
		this.cheadDtl = cheadDtl;
		this.cadd1 = cadd1;
		this.ccityc = ccityc;
		this.cphone = cphone;
		this.ncomm = ncomm;
		this.trGl = trGl;
		this.trSl = trSl;
		this.secGl = secGl;
		this.secSl = secSl;
		this.secAmt = secAmt;
		this.ccityn = ccityn;
		this.caccountNo = caccountNo;
	}
	public AgentMasterId() {
		super();
	}
}
