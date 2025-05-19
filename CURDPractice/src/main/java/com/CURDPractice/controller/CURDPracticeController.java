package com.CURDPractice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CURDPractice.entity.User;
import com.CURDPractice.exception.UserNotFoundException;
import com.CURDPractice.service.CURDPracticeService;

@RestController
@RequestMapping("/api")
public class CURDPracticeController {


	CURDPracticeService curdPracticeService;
	public CURDPracticeController(CURDPracticeService curdPracticeService) {
		this.curdPracticeService=curdPracticeService;
	}

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return curdPracticeService.saveUser(user);
	}

	@GetMapping("/getUser")
	public List<User> getUser(){
		return curdPracticeService.getUser();
	}

	@GetMapping("/getUser/{id}")
	public User getUserById(@PathVariable long id){
		return curdPracticeService.getUserById(id)
		        .orElseThrow(() -> new UserNotFoundException("User not found with id: " + id));
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable long id) {
		curdPracticeService.deleteUser(id);
		return "User Deleted";
	}

}
