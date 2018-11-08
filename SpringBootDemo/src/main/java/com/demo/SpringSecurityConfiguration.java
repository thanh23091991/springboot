package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//@Configuration cho biết đây là lớp dùng để cấu hình(cấu hình user và password theo ý của bạn)
@Configuration
@EnableWebSecurity
//WebSecurityConfigurerAdapter để kích hoạt spring security
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter{
	//Ghi đè phương thức dùng đẻ cấu hình
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		//phân quyền cho mọi request đều phải xác thực (mọi chức năng hay url đều phải login)
//		http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//	}
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER");
	}
	@Autowired
	private AuthenticationEntryPoint entryPoint;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic()
		.authenticationEntryPoint(entryPoint);
	}
	
}
