package com.librarymgt.security;

import javax.sql.DataSource;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandlerImpl;

@Configuration
@EnableWebSecurity
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
    private DataSource dataSource;
	
	public SecurityConfig() {
		//log.debug("creating spring security configuration");
	}
	
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

    	 auth
         .jdbcAuthentication()
         	 .dataSource(dataSource)
         	
         	 .usersByUsernameQuery(" select email AS username, PASSWORD, TRUE FROM tbl_user WHERE email=? AND enabled=TRUE")
         	 .authoritiesByUsernameQuery("select email as username, role from tbl_user where email = ? and enabled=true");
    	
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
      web
        .ignoring()
           .antMatchers("/resource/**"); // #3
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	AccessDeniedHandlerImpl hl = new AccessDeniedHandlerImpl();
    	hl.setErrorPage("/accessdenied");
    	
        http
        	.csrf().disable()
        	.authorizeRequests()
          
            	.antMatchers("/register/**").permitAll()
            	.anyRequest().authenticated()
                .and()
            .logout()
            	.logoutSuccessUrl("/login")
            	.and()
            .formLogin()
                .loginPage("/login")
                .permitAll();
          
        http.exceptionHandling().accessDeniedHandler(hl);
    	
    }

}