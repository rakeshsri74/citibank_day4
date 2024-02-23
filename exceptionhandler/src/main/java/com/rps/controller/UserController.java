package com.rps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rps.exception.ResourceNotFoundException;
import com.rps.model.User;
import com.rps.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		User user = userRepo.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("User Not Found with id:"+id));
		return user;
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		User userData = userRepo.save(user);
		return userData;
	}
	
	
}
