package com.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.entity.UserDetails;
import com.banking.request.UserRequest;
import com.banking.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServices userService;
	@PostMapping("/createuser")
	public String userRegister(@RequestBody UserRequest user) {
		
		
		return userService.registerUser(user);
		
	}
	
	@GetMapping("/userData")
	public ResponseEntity fetchUser() {
		Page<UserDetails>res=userService.getUser();
		return ResponseEntity.ok(res);
		
	}
	@GetMapping("/fetchlastname/{lastname}")
	public ResponseEntity fetchResult(@PathVariable String lastname) {
		
		
		UserDetails data=userService.fetchData(lastname);
		
		return ResponseEntity.ok(data);
	}

}
