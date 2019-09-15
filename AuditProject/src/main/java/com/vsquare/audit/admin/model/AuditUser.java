package com.vsquare.audit.admin.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="audit_user")
public class AuditUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private long userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="middle_name")
	private String middleName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String emailId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(fetch = FetchType.EAGER,mappedBy = "auditUser")
	private Set<UserAddress> address;

	@OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "role_id"))
    private Set<Role> roles;
	
	public AuditUser() {
	}

	public AuditUser(AuditUser auditUser) {
		super();
		this.userId = auditUser.getUserId();
		this.firstName = auditUser.getFirstName();
		this.middleName = auditUser.getMiddleName();
		this.lastName = auditUser.lastName;
		this.emailId = auditUser.getEmailId();
		this.userName = auditUser.getUserName();
		this.address = auditUser.getAddress();
		this.password = auditUser.getPassword();
	}

	public AuditUser(AuditUserBuilder auditUserBuilder) {
		
		this.firstName = auditUserBuilder.firstName;
		this.middleName = auditUserBuilder.middleName;
		this.lastName = auditUserBuilder.lastName;
		this.emailId = auditUserBuilder.emailId;
		this.userName = auditUserBuilder.userName;
		this.address = auditUserBuilder.address;
		this.roles = auditUserBuilder.roles;
		this.password = auditUserBuilder.password;
	}

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

	public Set<UserAddress> getAddress() {
		return address;
	}

	public void setAddress(Set<UserAddress> address) {
		this.address = address;
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

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static class AuditUserBuilder {
		
		String firstName;
		
		String middleName;
		
		String lastName;
		
		String emailId;
		
		String userName;
		
		String password;
		
		private Set<UserAddress> address;
		
	    private Set<Role> roles;
		
	    public AuditUserBuilder firstName(String firstName) {
	    	 this.firstName = firstName;
	    	 return this;
	    }
	    
	    public AuditUserBuilder middleName(String middleName) {
	    	 this.middleName = middleName;
	    	 return this;
	    }
	    public AuditUserBuilder lastName(String lastName) {
	    	 this.lastName = lastName;
	    	 return this;
	    }
	    
	    public AuditUserBuilder emailId(String emailId) {
	    	 this.emailId = emailId;
	    	 return this;
	    }
	    
	    public AuditUserBuilder password(String password) {
	    	 this.password = password;
	    	 return this;
	    }
	    
	    public AuditUserBuilder userName(String userName) {
	    	 this.userName = userName;
	    	 return this;
	    }
	    
	    public AuditUserBuilder address(Set<UserAddress> address) {
	    	 this.address = address;
	    	 return this;
	    }
	    
	    public AuditUserBuilder roles(Set<Role> roles) {
	    	 this.roles = roles;
	    	 return this;
	    }
	    
	    public AuditUser build() {
	    	return new AuditUser(this);
	    }
	}
}
