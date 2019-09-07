package com.vsquare.audit.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vsquare.audit.admin.model.AuditUser;
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
        CustomUserDetails customUserDetails = new CustomUserDetails(user);
        return customUserDetails;
	}
}
