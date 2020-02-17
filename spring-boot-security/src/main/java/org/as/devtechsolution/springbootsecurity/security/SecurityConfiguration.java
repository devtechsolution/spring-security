package org.as.devtechsolution.springbootsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	
	/*
	 	Used by the default implementation of authenticationManager() to attemptto obtain an AuthenticationManager. 
	 	If overridden, the AuthenticationManagerBuilder should be used to specify the AuthenticationManager. 
		The authenticationManagerBean() method can be used to expose the resulting AuthenticationManager as a Bean. 
		The userDetailsServiceBean() canbe used to expose the last populated UserDetailsService that is createdwith the AuthenticationManagerBuilder as a Bean.
		The UserDetailsService will also automatically be populated on HttpSecurity.getSharedObject(Class) for use with other SecurityContextConfigurer
		 (i.e. RememberMeConfigurer ) 
		
		For example, the following configuration could be used to register in memoryauthentication that exposes an in memory UserDetailsService: 
		 @Override
		 protected void configure(AuthenticationManagerBuilder auth) {
		 	auth
		 	// enable in memory based authentication with a user named
		 	// "user" and "admin"
		 	.inMemoryAuthentication().withUser("user").password("password").roles("USER").and()
		 			.withUser("admin").password("password").roles("USER", "ADMIN");
		 }
		
		 // Expose the UserDetailsService as a Bean
		 @Bean
		 @Override
		 public UserDetailsService userDetailsServiceBean() throws Exception {
		 	return super.userDetailsServiceBean();
		 }
		
		 
		Parameters:auth the AuthenticationManagerBuilder to useThrows:Exception
	 * 
	 * */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Set our cofiguration on the auth object
		auth.inMemoryAuthentication()
		.withUser("rama")
		.password("rama")
		.roles("USER")
		.and()
		.withUser("shiva")
		.password("shiva")
		.roles("ADMIN");
	
		
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/**").hasRole("ADMIN")
		.and()
		.formLogin();
	}
	

}
