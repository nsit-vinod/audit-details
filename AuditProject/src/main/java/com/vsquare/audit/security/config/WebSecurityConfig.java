package com.vsquare.audit.security.config;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.vsquare.audit.admin.model.AuditUser;
import com.vsquare.audit.admin.model.AuditUser.AuditUserBuilder;
import com.vsquare.audit.admin.model.Role;
import com.vsquare.audit.admin.model.vo.UserVo;
import com.vsquare.audit.admin.repository.RoleRepository;
import com.vsquare.audit.admin.service.UserService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService auditUserDetailsService;
	@Autowired
	private UserService userService;
	@Autowired
	private RoleRepository roleRepository;
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Autowired
	public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(auditUserDetailsService).passwordEncoder(encoder());
		List<UserVo> users = userService.findAllUsers();
		
		if(users.isEmpty()) {
			Role role = roleRepository.findById(1).get();
			Set<Role> roles = new HashSet<>();
			roles.add(role);
			AuditUserBuilder userBuilder = new AuditUser.AuditUserBuilder();
			AuditUser user = userBuilder.firstName("super").lastName("user")
					.userName("super_user").emailId("super_user@vsquire.com")
					.roles(roles).password(encoder().encode("password")).build();
			userService.createUser(user);
		}
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().anonymous().disable().authorizeRequests().antMatchers("/oauth/token","/api-docs/**").permitAll();
	}

	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

}
