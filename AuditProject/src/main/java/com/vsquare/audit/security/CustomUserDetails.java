package com.vsquare.audit.security;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.vsquare.audit.admin.model.AuditUser;

public class CustomUserDetails extends AuditUser implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private AuditUser auditUser;
	public CustomUserDetails(final AuditUser users) {
        super(users);
        this.auditUser = users;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

	public AuditUser getAuditUser() {
		return auditUser;
	}

}
