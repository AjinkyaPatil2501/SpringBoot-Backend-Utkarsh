package com.utkarsh.core.dto;

public class PersonalInfoDto {

    // Customer address details
    private String address;
    private String city;
    private String phone;
    private String specialInstruction;
    // Nominee
    private String nomineeName;

    // Introducer details
    private String introducerName;
    private String introducerAddress;
    private String introducerCity;

    // Services
    private String checkBook;  // Yes/No
    private String form15H;    // Yes/No
    private String smsService; // Yes/No

    // Constructors
    public PersonalInfoDto() {}
  
    
 
    public PersonalInfoDto(String address, String city, String phone, String specialInstruction,
			String nomineeName, String introducerName, String introducerAddress, String introducerCity,
			String checkBook, String form15h, String smsService) {
		super();
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.specialInstruction = specialInstruction;
		this.nomineeName = nomineeName;
		this.introducerName = introducerName;
		this.introducerAddress = introducerAddress;
		this.introducerCity = introducerCity;
		this.checkBook = checkBook;
		form15H = form15h;
		this.smsService = smsService;
	}



	// Getters & Setters
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getSpecialInstruction() { return specialInstruction; }
    public void setSpecialInstruction(String specialInstruction) { this.specialInstruction = specialInstruction; }

    public String getNomineeName() { return nomineeName; }
    public void setNomineeName(String nomineeName) { this.nomineeName = nomineeName; }

    public String getIntroducerName() { return introducerName; }
    public void setIntroducerName(String introducerName) { this.introducerName = introducerName; }

    public String getIntroducerAddress() { return introducerAddress; }
    public void setIntroducerAddress(String introducerAddress) { this.introducerAddress = introducerAddress; }

    public String getIntroducerCity() { return introducerCity; }
    public void setIntroducerCity(String introducerCity) { this.introducerCity = introducerCity; }

    public String getCheckBook() { return checkBook; }
    public void setCheckBook(String checkBook) { this.checkBook = checkBook; }

    public String getForm15H() { return form15H; }
    public void setForm15H(String form15H) { this.form15H = form15H; }

    public String getSmsService() { return smsService; }
    public void setSmsService(String smsService) { this.smsService = smsService; }

}
