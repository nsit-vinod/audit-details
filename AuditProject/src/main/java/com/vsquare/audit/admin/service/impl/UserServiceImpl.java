package com.vsquare.audit.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.admin.repository.AuditUserRepository;
import com.vsquare.audit.admin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private AuditUserRepository auditUserRepository;
	@Override
	public AuditUser getAuditUserByUser(String username) {
		// TODO Auto-generated method stub
		return auditUserRepository.findByUserName(username).get();
	}

	@Override
	public AuditUser createUser(AuditUser auditUser) {
		// TODO Auto-generated method stub
		return auditUserRepository.save(auditUser);
	}

	@Override
	public AuditUser updateUser(AuditUser auditUser) {
		// TODO Auto-generated method stub
		return auditUserRepository.save(auditUser);
	}

	@Override
	public void deleteUser(long userId) {
		auditUserRepository.deleteById(userId);

	}

	@Override
	public List<AuditUser> findAllUsers() {
		// TODO Auto-generated method stub
		return auditUserRepository.findAll();
	}

}
