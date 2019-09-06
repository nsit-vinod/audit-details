package com.vsquare.audit.admin.service;

import org.springframework.security.core.Authentication;

public interface AuthenticationFacadeService {

	public Authentication getAuthentication();
}
