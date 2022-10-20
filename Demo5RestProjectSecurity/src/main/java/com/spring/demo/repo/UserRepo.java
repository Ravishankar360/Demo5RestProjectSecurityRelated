package com.spring.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

	Users findByUserName(String userName);

}
