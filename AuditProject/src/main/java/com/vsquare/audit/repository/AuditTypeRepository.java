package com.vsquare.audit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.model.AuditType;

public interface AuditTypeRepository extends JpaRepository<AuditType, Integer> {

}
