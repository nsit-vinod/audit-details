package com.vsquare.audit.admin.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.admin.model.Role;
import com.vsquare.audit.admin.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

	@Autowired
	private RoleService roleService;
	
	@GetMapping
	public List<Role> getAllRoles() {
		return roleService.getAllRoles();
	}
}
