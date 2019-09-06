package com.vsquare.audit.admin.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.admin.service.AuthenticationFacadeService;
import com.vsquare.audit.admin.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	public static final String SUCCESS = "success";
	public static final String ROLE_ADMIN = "ROLE_ADMIN";
	public static final String ROLE_USER = "ROLE_USER";

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationFacadeService authenticationFacadeService;

	@GetMapping
	public List<AuditUser> getAllUsers() {
		return userService.findAllUsers();
	}

}
