package com.vsquare.audit.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.admin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
