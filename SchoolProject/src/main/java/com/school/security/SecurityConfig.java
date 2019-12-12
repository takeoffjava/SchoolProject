package com.school.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http) throws Exception 
    {
    	 http.csrf().disable()
         .authorizeRequests()
         .antMatchers("/C_Job_Role/*").hasRole("ADMIN")
         .antMatchers("/C_Job_Role/getAllJobRoles").hasRole("USER")
         .anyRequest().fullyAuthenticated()
         .and().httpBasic();    	 
		
    }
 
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
    	  auth.inMemoryAuthentication()
          .withUser("admin").password("{noop}password")
          .roles("ADMIN")
          .and().withUser("raj").password("{noop}raj")
          .roles("USER");
    }
}