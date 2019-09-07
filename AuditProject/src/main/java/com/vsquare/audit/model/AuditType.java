package com.vsquare.audit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.vsquare.audit.admin.model.AuditUser;

@Entity
@Table(name="audit_type")
public class AuditType extends Auditable<AuditUser> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="audit_type_id")
	private int auditTypeId;
	
	@Column(name= "audit_type_name")
	private String auditTypeName;

	public int getAuditTypeId() {
		return auditTypeId;
	}

	public void setAuditTypeId(int auditTypeId) {
		this.auditTypeId = auditTypeId;
	}

	public String getAuditTypeName() {
		return auditTypeName;
	}

	public void setAuditTypeName(String auditTypeName) {
		this.auditTypeName = auditTypeName;
	}
}
