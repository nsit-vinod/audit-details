package com.vsquare.audit.admin.service;

import java.util.List;

import com.vsquare.audit.admin.model.AuditUser;

public interface UserService {

	public AuditUser getAuditUserByUser(String userName);
	
	public AuditUser createUser(AuditUser auditUser);
	
	public AuditUser updateUser(AuditUser auditUser);
	
	public void deleteUser(long userId);
	
	public List<AuditUser> findAllUsers();
	
}
