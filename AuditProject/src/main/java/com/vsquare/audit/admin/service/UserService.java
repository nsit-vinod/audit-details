package com.vsquare.audit.admin.service;

import java.util.List;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.admin.model.vo.UserVo;

public interface UserService {

	public UserVo getAuditUserByUser(String userName);
	
	public UserVo createUser(UserVo userVo);
	
	public UserVo updateUser(UserVo userVo);
	
	public void deleteUser(long userId);
	
	public List<UserVo> findAllUsers();

	public void createUser(AuditUser user);
	
}
