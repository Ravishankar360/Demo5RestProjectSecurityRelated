package com.spring.demo.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.spring.demo.Entity.Users;

@SuppressWarnings("serial")
public class UserPrincipal implements UserDetails{
	
	private static final long serialVersionUid = 1L;
	
	@Autowired
	private Users users;

	public UserPrincipal(Users users) {
		super();
		this.users = users;
	}
	
	@Override
	public Collection<? extends GrantedAuthority > getAuthorities(){
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}
	
	public String getUserName() {
		return users.getUserName();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return users.getPassWord();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return users.getUserName();
	}
	

}
