package com.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import com.example.security.CustomLogoutSuccessHandler;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean(name="passwordEncoder") public PasswordEncoder passwordencoder(){
	return new BCryptPasswordEncoder(); }
	 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		 auth.userDetailsService(userDetailsService).passwordEncoder(passwordencoder());

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
		 http.authorizeRequests()
		  .antMatchers("/admin/*").access("hasRole('admin')")
		  .antMatchers("/user/*").access("hasAnyRole('customer','admin')")
		  .anyRequest().permitAll()
		  .and()
		    .formLogin().loginPage("/login")
		    .usernameParameter("username").passwordParameter("password")
		    .defaultSuccessUrl("/index2", true)
		  .and()
		    .logout().logoutSuccessUrl("/") 
            .logoutSuccessHandler(logoutSuccessHandler())
		   .and()
		   .exceptionHandling().accessDeniedPage("/403")
		  .and()
		    .csrf();
	}
	
	@Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return new CustomLogoutSuccessHandler();
    }


}
