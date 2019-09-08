package com.vsquare.audit.admin.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vsquare.audit.admin.constant.RoleConstants;
import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.admin.model.vo.UserVo;
import com.vsquare.audit.admin.service.AuthenticationFacadeService;
import com.vsquare.audit.admin.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);


	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationFacadeService authenticationFacadeService;

	@Secured({RoleConstants.ROLE_SUPER_USER, RoleConstants.ROLE_REGIONAL_MANAGER})
	@GetMapping
	public List<UserVo> getAllUsers() {
		 log.info(String.format("received request to list user %s", authenticationFacadeService.getAuthentication().getPrincipal()));
		return userService.findAllUsers();
	}

	@Secured({RoleConstants.ROLE_SUPER_USER, RoleConstants.ROLE_REGIONAL_MANAGER})
	@GetMapping(path="/", params= {"userName"})
	public UserVo getAuditUserByUser(String userName) {
        return userService.getAuditUserByUser(userName);
	}
	@Secured({RoleConstants.ROLE_SUPER_USER, RoleConstants.ROLE_REGIONAL_MANAGER})
	@PostMapping
	public UserVo createUser(UserVo user) {
       return userService.createUser(user);
	}
	@Secured({RoleConstants.ROLE_SUPER_USER, RoleConstants.ROLE_REGIONAL_MANAGER})
	@PutMapping
	public UserVo updateUser(UserVo user) {
       return userService.updateUser(user);
	}
	@Secured({RoleConstants.ROLE_SUPER_USER})
	@DeleteMapping
	public void deleteUser(long userId) {
		userService.deleteUser(userId);
	}

}
