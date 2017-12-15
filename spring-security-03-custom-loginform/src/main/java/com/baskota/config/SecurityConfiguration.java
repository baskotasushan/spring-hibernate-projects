package com.baskota.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	//inbuilt login form , no logout , authentication roles
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("saskar").password("saskar").roles("EMPLOYEE");
		auth.inMemoryAuthentication().withUser("sangi").password("sangi").roles("MANAGER");
		auth.inMemoryAuthentication().withUser("sushan").password("sushan").roles("ADMIN");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin()
			.loginPage("/login")
			.loginProcessingUrl("/authenticateUser")     //here loginprocessingurl and logout functionality are auto handled by security filters, just need to assign them
			.permitAll()
		.and()
		.logout()
		.permitAll();
	}
}
