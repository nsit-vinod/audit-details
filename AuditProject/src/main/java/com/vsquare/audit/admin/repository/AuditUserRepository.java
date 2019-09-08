package com.vsquare.audit.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.admin.model.AuditUser;

public interface AuditUserRepository extends JpaRepository<AuditUser, Long> {

	Optional<AuditUser> findByUserName(String username);

	AuditUser findByEmailId(String emailId);

}
