package com.utkarsh.core.dto;

public class DirectorDto {

	private String directorName;
	private String directorCode;
	public DirectorDto(String directorName, String directorCode) {
		super();
		this.directorName = directorName;
		this.directorCode = directorCode;
	}
	public DirectorDto() {
		super();
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public String getDirectorCode() {
		return directorCode;
	}
	public void setDirectorCode(String directorCode) {
		this.directorCode = directorCode;
	}
	
}
