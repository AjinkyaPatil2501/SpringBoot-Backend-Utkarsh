package com.utkarsh.core.dto;

import java.util.List;

public class DepositDetailsDto {

	private List<AgentDto> agents;
	private List<GeneralLedgerCodeDto> gldetails;
	private List<DirectorDto> directors;
	
	public DepositDetailsDto() {
		super();
	}

	public DepositDetailsDto(List<AgentDto> agents, List<GeneralLedgerCodeDto> gldetails, List<DirectorDto> directors) {
		super();
		this.agents = agents;
		this.gldetails = gldetails;
		this.directors = directors;
	}

	public List<AgentDto> getAgents() {
		return agents;
	}

	public void setAgents(List<AgentDto> agents) {
		this.agents = agents;
	}

	public List<GeneralLedgerCodeDto> getGldetails() {
		return gldetails;
	}

	public void setGldetails(List<GeneralLedgerCodeDto> gldetails) {
		this.gldetails = gldetails;
	}

	public List<DirectorDto> getDirectors() {
		return directors;
	}

	public void setDirectors(List<DirectorDto> directors) {
		this.directors = directors;
	}
	
}
