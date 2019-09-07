package com.vsquare.audit.service;

import java.util.List;

import com.vsquare.audit.model.AuditType;

public interface AuditTypeService {

	public AuditType createAuditType(AuditType auditType);
	
	public AuditType updateAuditType(AuditType auditType);
	
	public List<AuditType> findAllAuditType();
	
	public void deleteAuditType(int id);
	
}
