package com.spring.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.spring.demo.service.UserDetailsServiceImpl;

@Configuration
@EnableScheduling
public class AppSecurityConfig {
	
	
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@Bean
	public AuthenticationProvider authProvide() {
		DaoAuthenticationProvider newProvider = new DaoAuthenticationProvider();
		newProvider.setUserDetailsService(userDetailsServiceImpl);
		newProvider.setPasswordEncoder(new BCryptPasswordEncoder());
		return newProvider;
		
	}
	
	protected void configure(HttpSecurity http) throws Exception{
		
		http
		.csrf().disable()
		.authorizeHttpRequests().antMatchers("/login").permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/login").permitAll()
		.and()
        .logout().invalidateHttpSession(true)
        .clearAuthentication(true)
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
        .logoutSuccessUrl("logout-success").permitAll();
	}
	
//    protected UserDetailsService userDetailsService() {
// 	List<UserDetailsService> s =new ArrayList<>();
//		s.add(Users.withDefaultPasswordEncoder().username("Santosh").password("123456").roles("user").build());
//		return null;	}

}
