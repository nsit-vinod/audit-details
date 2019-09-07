package com.vsquare.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vsquare.audit.admin.model.AuditUser;

@Entity
@Table(name="division")
public class Division extends Auditable<AuditUser> {


	@Id
	@Column(name="division_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int divisionId;
	
	@Column(name="division_name")
	private String divisionName;
	
	@Column(name="division_code")
	private String divisionCode;
	
	@ManyToOne
	@JoinColumn(name="state_id")
	private State state;

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
