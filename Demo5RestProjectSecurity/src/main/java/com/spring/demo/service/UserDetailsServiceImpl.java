package com.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.demo.Entity.Users;
import com.spring.demo.repo.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepo userepo;
    
    public UserPrincipal loadUserByUserName(String username)throws UsernameNotFoundException{
    	
    	Users users = userepo.findByUserName(username);
    	
    	if(users == null) {
    		throw new UsernameNotFoundException("UserName not Found");
    	}
    	return new UserPrincipal(users);
    }
    


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}}