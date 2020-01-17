package com.glb.training.restfullwebservices.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		//add an exception to h2-console context to permit requests to work with spring security
		httpSecurity.authorizeRequests().antMatchers("/h2-console/**").permitAll().anyRequest().authenticated().and()
				.formLogin();
		httpSecurity.csrf().ignoringAntMatchers("/h2-console/**");
		httpSecurity.headers().frameOptions().sameOrigin();
	}

}
