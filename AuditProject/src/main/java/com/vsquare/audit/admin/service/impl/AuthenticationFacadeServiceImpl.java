package com.vsquare.audit.admin.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.vsquare.audit.admin.service.AuthenticationFacadeService;

@Service
public class AuthenticationFacadeServiceImpl implements AuthenticationFacadeService {

	@Override
	public Authentication getAuthentication() {
		 return SecurityContextHolder.getContext().getAuthentication();
	}

}
