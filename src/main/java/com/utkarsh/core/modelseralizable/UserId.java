package com.utkarsh.core.modelseralizable;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("unused")
public class UserId implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cbankId;
    private String cbranId;
    private Integer cuserId;

    public UserId() {}

    public UserId(String cbankId, String cbranId, Integer cuserId) {
        this.cbankId = cbankId;
        this.cbranId = cbranId;
        this.cuserId = cuserId;
    }
   
}
