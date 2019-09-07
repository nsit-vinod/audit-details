package com.vsquare.audit.core;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.security.CustomUserDetails;

@Component(value = "auditorAware")
public class SpringSecurityAuditorAware implements AuditorAware<AuditUser> {

	@Override
	public Optional<AuditUser> getCurrentAuditor() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		  if (authentication == null || !authentication.isAuthenticated()) {
		   return null;
		  }
		
		  return Optional.of(((CustomUserDetails) authentication.getPrincipal()).getAuditUser());
	}

}
