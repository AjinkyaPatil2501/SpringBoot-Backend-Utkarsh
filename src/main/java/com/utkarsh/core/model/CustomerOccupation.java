package com.utkarsh.core.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_occupation")
public class CustomerOccupation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OCCUPATION_PK")
    private Integer occupationPk;

    @Column(name = "OCCUPATION_ID")
    private String occupationId;
    
    @Column(name = "OCCUPATION_NAME")
    private String occupationName;


    @Column(name = "OCCUPATION_ADDRESS")
    private String occupationAddress;

    @Column(name = "OCCUPATION_PHONE1")
    private String occupationPhone1;

    @Column(name = "OCCUPATION_PHONE2")
    private String occupationPhone2;

    @Column(name = "OCCUPATION_EMAIL")
    private String occupationEmail;

    @Column(name = "customer_id", nullable = false)
    private String customerId;
      
    public CustomerOccupation() {
		super();
	}
	
	public CustomerOccupation(Integer occupationPk, String occupationId, String occupationName,
			String occupationAddress, String occupationPhone1, String occupationPhone2, String occupationEmail,
			String customerId) {
		super();
		this.occupationPk = occupationPk;
		this.occupationId = occupationId;
		this.occupationName = occupationName;
		this.occupationAddress = occupationAddress;
		this.occupationPhone1 = occupationPhone1;
		this.occupationPhone2 = occupationPhone2;
		this.occupationEmail = occupationEmail;
		this.customerId = customerId;
	}

	// Getters and Setters
	
    public Integer getOccupationPk() { return occupationPk; }
    public String getOccupationName() {
		return occupationName;
	}
	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}
	public void setOccupationPk(Integer occupationPk) { this.occupationPk = occupationPk; }

    public String getOccupationId() { return occupationId; }
    public void setOccupationId(String occupationId) { this.occupationId = occupationId; }

    public String getOccupationAddress() { return occupationAddress; }
    public void setOccupationAddress(String occupationAddress) { this.occupationAddress = occupationAddress; }

    public String getOccupationPhone1() { return occupationPhone1; }
    public void setOccupationPhone1(String occupationPhone1) { this.occupationPhone1 = occupationPhone1; }

    public String getOccupationPhone2() { return occupationPhone2; }
    public void setOccupationPhone2(String occupationPhone2) { this.occupationPhone2 = occupationPhone2; }

    public String getOccupationEmail() { return occupationEmail; }
    public void setOccupationEmail(String occupationEmail) { this.occupationEmail = occupationEmail; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
}
