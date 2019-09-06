package com.vsquare.audit.security;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.admin.model.Role;
import com.vsquare.audit.admin.repository.AuditUserRepository;

@Service
public class AuditUserDetailsService implements UserDetailsService {

	@Autowired
	private AuditUserRepository auditUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AuditUser> usersOptional = auditUserRepository.findByUserName(username);
		usersOptional.orElseThrow(() -> new UsernameNotFoundException("Username not found!"));
        AuditUser user = usersOptional.get();
        Set<SimpleGrantedAuthority> grantedAuthorities = getAuthorities(user);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), grantedAuthorities);
	}

	private Set<SimpleGrantedAuthority> getAuthorities(AuditUser user) {
	        Set<Role> roleByUserId = user.getRoles();
	        final Set<SimpleGrantedAuthority> authorities = roleByUserId.stream().map(role -> new SimpleGrantedAuthority("ROLE_" + role.getRole().toUpperCase())).collect(Collectors.toSet());
	        return authorities;
	    }

	}
