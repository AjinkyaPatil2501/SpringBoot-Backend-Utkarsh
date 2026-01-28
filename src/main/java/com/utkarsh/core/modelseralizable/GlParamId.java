package com.utkarsh.core.modelseralizable;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("unused")
public class GlParamId implements Serializable {


	private static final long serialVersionUID = 1L;
    private String cbankId;
    private String cbranId;
    private String cglCode;

    // Default constructor
    public GlParamId() {
    }

    // All-args constructor
    public GlParamId(String cbankId, String cbranId, String cglCode) {
        this.cbankId = cbankId;
        this.cbranId = cbranId;
        this.cglCode = cglCode;
    }
}
