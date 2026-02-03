package com.utkarsh.core.Enum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum BloodGroup {

	 A_POS("A+"),
	    A_NEG("A-"),
	    B_POS("B+"),
	    B_NEG("B-"),
	    AB_POS("AB+"),
	    AB_NEG("AB-"),
	    O_POS("O+"),
	    O_NEG("O-");

	    private final String value;

	    BloodGroup(String value) {
	        this.value = value;
	    }

	    @JsonValue
	    public String getValue() {
	        return value;
	    }
	    @JsonCreator
	    public static BloodGroup fromValue(String value) {
	        for (BloodGroup bg : BloodGroup.values()) {
	            if (bg.value.equalsIgnoreCase(value)) {
	                return bg;
	            }
	        }
	        throw new IllegalArgumentException("Invalid blood group: " + value);
	    }
}
