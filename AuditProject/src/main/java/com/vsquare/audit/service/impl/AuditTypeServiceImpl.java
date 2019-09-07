package com.vsquare.audit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.model.AuditType;
import com.vsquare.audit.repository.AuditTypeRepository;
import com.vsquare.audit.service.AuditTypeService;

@Service
public class AuditTypeServiceImpl implements AuditTypeService {

	@Autowired
	private AuditTypeRepository auditTypeRepository;
	@Override
	public AuditType createAuditType(AuditType auditType) {
		return auditTypeRepository.save(auditType);
	}

	@Override
	public AuditType updateAuditType(AuditType auditType) {
		return auditTypeRepository.save(auditType);
	}

	@Override
	public List<AuditType> findAllAuditType() {
		return auditTypeRepository.findAll();
	}

	@Override
	public void deleteAuditType(int id) {
		auditTypeRepository.deleteById(id);

	}

}
