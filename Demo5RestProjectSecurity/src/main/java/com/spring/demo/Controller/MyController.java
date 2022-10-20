package com.spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.demo.Entity.Users;
import com.spring.demo.repo.UserRepo;

@Controller
public class MyController {
	
	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@GetMapping("/getUser")
	public List<Users> getUser() {
		return userRepo.findAll();
	}
	
	@PostMapping("/addUser")
	public Users home(@RequestBody Users users) {
		return userRepo.save(users);
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String logOutPage() {
		return "logout.jsp";
	}
	
	

}
