package com.learning.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@EnableWebSecurity
@Component
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
                   .withUser("user").password("abc").roles("USER");
		
		auth.inMemoryAuthentication()
        .withUser("admin").password("admin").roles("ADMIN");
	}

	//.csrf() is optional, enabled by default, if using WebSecurityConfigurerAdapter constructor
	@Override
	protected void configure(HttpSecurity http) throws Exception {

	    http.authorizeRequests()
		.antMatchers("/home*").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
		.antMatchers("/student*").access("hasRole('ROLE_ADMIN')")
		.antMatchers("/addStudent*").access("hasRole('ROLE_ADMIN')")
		.antMatchers("/result*").access("hasRole('ROLE_ADMIN')")
		.and()
		    .formLogin().loginPage("/index").failureUrl("/index")
		    .usernameParameter("username").passwordParameter("password").loginProcessingUrl("/j_spring_security_check")		
		.and()
		    .logout().logoutUrl("/j_spring_security_logout").logoutSuccessUrl("/index")
		.and()
		    .csrf(); 		
	}
}
