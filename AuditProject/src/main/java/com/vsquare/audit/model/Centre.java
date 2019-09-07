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
@Table(name="centre")
public class Centre extends Auditable<AuditUser> {

	@Id
	@Column(name="centre_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int centreId;
	
	@Column(name="centre_name")
	private String centreName;
	
	@Column(name="centre_code")
	private String centreCode;
	
	@ManyToOne
	@JoinColumn(name="branch_id")
	private Branch branch;
	
	public int getCentreId() {
		return centreId;
	}

	public void setCentreId(int centreId) {
		this.centreId = centreId;
	}

	public String getCentreName() {
		return centreName;
	}

	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}

	public String getCentreCode() {
		return centreCode;
	}

	public void setCentreCode(String centreCode) {
		this.centreCode = centreCode;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
