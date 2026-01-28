package com.utkarsh.core.dto;

public class GeneralLedgerCodeDto {

	private String glcode;
	private String glname;
	private String shortcode;
	
	public GeneralLedgerCodeDto() {
		super();
	}
	public GeneralLedgerCodeDto(String glcode, String glname, String shortcode) {
		super();
		this.glcode = glcode;
		this.glname = glname;
		this.shortcode = shortcode;
	}
	public String getGlcode() {
		return glcode;
	}
	public void setGlcode(String glcode) {
		this.glcode = glcode;
	}
	public String getGlname() {
		return glname;
	}
	public void setGlname(String glname) {
		this.glname = glname;
	}
	public String getShortcode() {
		return shortcode;
	}
	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}
	
	
}
