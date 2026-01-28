package com.utkarsh.core.modelseralizable;


import java.io.Serializable;

@SuppressWarnings("unused")
public class ShareMasterId implements Serializable {


	private static final long serialVersionUID = 1L;
    private String cbankId;
    private String cbranId;
    private String cmemberNo;
	public ShareMasterId(String cbankId, String cbranId, String cmemberNo) {
		super();
		this.cbankId = cbankId;
		this.cbranId = cbranId;
		this.cmemberNo = cmemberNo;
	}
	public ShareMasterId() {
		super();
	}

  
}
