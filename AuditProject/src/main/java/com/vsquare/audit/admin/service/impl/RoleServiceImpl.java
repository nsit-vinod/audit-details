package com.vsquare.audit.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vsquare.audit.admin.model.Role;
import com.vsquare.audit.admin.repository.RoleRepository;
import com.vsquare.audit.admin.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

}
