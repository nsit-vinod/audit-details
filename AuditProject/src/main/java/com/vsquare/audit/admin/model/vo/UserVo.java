package com.vsquare.audit.admin.model.vo;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vsquare.audit.admin.model.Role;

public class UserVo {

	private long userId;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private String emailId;
	
	private String userName;
	
	private String password;
	
    private Set<Role> roles;
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getPassword() {
		return password;
	}

	@JsonIgnore
	public void setPassword(String password) {
		this.password = password;
	}
}
