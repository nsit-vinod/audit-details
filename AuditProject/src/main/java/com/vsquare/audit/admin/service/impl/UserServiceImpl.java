package com.vsquare.audit.admin.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.admin.model.Role;
import com.vsquare.audit.admin.model.vo.UserVo;
import com.vsquare.audit.admin.repository.AuditUserRepository;
import com.vsquare.audit.admin.repository.RoleRepository;
import com.vsquare.audit.admin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private AuditUserRepository auditUserRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public UserVo getAuditUserByUser(String username) {
		AuditUser user = auditUserRepository.findByUserName(username).get();
		UserVo userVo = auditUserToUserVo(user);
		return userVo;
	}

	private UserVo auditUserToUserVo(AuditUser user) {
		UserVo userVo = new UserVo();
		userVo.setUserId(user.getUserId());
		userVo.setUserName(user.getUserName());
		userVo.setEmailId(user.getEmailId());
		userVo.setFirstName(user.getFirstName());
		userVo.setLastName(user.getLastName());
		userVo.setMiddleName(user.getMiddleName());
		userVo.setRoles(user.getRoles());
		return userVo;
	}

	@Override
	public UserVo createUser(UserVo auditUser) {
		AuditUser userWithDuplicateUsername = auditUserRepository.findByUserName(auditUser.getUserName()).get();
		if (userWithDuplicateUsername != null) {
			log.error(String.format("Duplicate username %", auditUser.getUserName()));
			throw new RuntimeException("Duplicate username.");
		}
		AuditUser userWithDuplicateEmail = auditUserRepository.findByEmailId(auditUser.getEmailId());
		if (userWithDuplicateEmail != null) {
			log.error(String.format("Duplicate email %", auditUser.getEmailId()));
			throw new RuntimeException("Duplicate email.");
		}

		AuditUser user = new AuditUser();
		user.setEmailId(auditUser.getEmailId());
		user.setFirstName(auditUser.getFirstName());
		user.setLastName(auditUser.getLastName());
		user.setUserName(auditUser.getUserName());
		user.setPassword(bCryptPasswordEncoder.encode(auditUser.getPassword()));
		List<Integer> rolesId = new ArrayList<>();
		auditUser.getRoles().forEach(p -> rolesId.add(p.getRoleId()));
		Set<Role> roles = roleRepository.findByRoleIdIn(rolesId);
		user.setRoles(roles);
		AuditUser savedUser = auditUserRepository.save(user);
		UserVo userVo = auditUserToUserVo(savedUser);
		return userVo;
	}

	@Override
	public UserVo updateUser(UserVo userVo) {
		Optional<AuditUser> existedUserOptional = auditUserRepository.findById(userVo.getUserId());

		if (!existedUserOptional.isPresent()) {
			throw new RuntimeException("User does not exist");
		}
		AuditUser user = existedUserOptional.get();
		user.setFirstName(userVo.getFirstName());
		user.setLastName(userVo.getLastName());
		List<Integer> rolesId = new ArrayList<>();
		userVo.getRoles().forEach(p -> rolesId.add(p.getRoleId()));
		Set<Role> roles = roleRepository.findByRoleIdIn(rolesId);
		user.getRoles().clear();
		user.setRoles(roles);
		user = auditUserRepository.save(user);
		UserVo userVoToReturn = auditUserToUserVo(user);
		return userVoToReturn;
	}

	@Override
	public void deleteUser(long userId) {
		auditUserRepository.deleteById(userId);

	}

	@Override
	public List<UserVo> findAllUsers() {
		List<AuditUser> users = auditUserRepository.findAll();
		List<UserVo> userVos = new ArrayList<>();
		users.forEach(user -> userVos.add(auditUserToUserVo(user)));
		return userVos;
	}

	@Override
	public void createUser(AuditUser user) {
		auditUserRepository.save(user);
		
	}

}
