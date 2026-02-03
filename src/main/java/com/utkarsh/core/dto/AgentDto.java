package com.utkarsh.core.dto;

public class AgentDto {

	private String agentName;
	private String agentCode;
	public AgentDto(String agentName, String agentCode) {
		super();
		this.agentName = agentName;
		this.agentCode = agentCode;
	}
	public AgentDto() {
		super();
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	
	
}
