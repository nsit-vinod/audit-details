package com.vsquare.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch extends Auditable<String> {

	@Id
	@Column(name="branch_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchId;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="branch_code")
	private String branchCode;
	
	@ManyToOne
	@JoinColumn(name="division_id")
	private Division division;

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public Division getDivision() {
		return division;
	}

	public void setDivision(Division division) {
		this.division = division;
	}
	
}
