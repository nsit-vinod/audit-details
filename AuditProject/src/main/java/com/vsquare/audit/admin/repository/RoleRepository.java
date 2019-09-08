package com.vsquare.audit.admin.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsquare.audit.admin.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Set<Role> findByRoleIdIn(List<Integer> rolesId);

}
