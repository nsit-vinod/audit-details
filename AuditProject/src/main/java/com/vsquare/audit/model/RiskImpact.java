package com.vsquare.audit.model;

public enum RiskImpact {

	CRITICAL("Critical"),
	HIGH("High"),
	MEDIUM("Medium"),
	LOW("Low");
	
	private String riskValue;
	
	private RiskImpact(String riskValue) {
		this.riskValue = riskValue;
	}
	
	public String getRiskValue() {
		return riskValue;
	}
}
