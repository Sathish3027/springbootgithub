package com.starmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starmart.model.User;
import com.starmart.repository.UserRepository;

@CrossOrigin(origins  = "*")
@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/register")
	public List<User>getAllUser(){
		return userRepository.findAll();
	}
	
	@PostMapping("/register")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	
}
