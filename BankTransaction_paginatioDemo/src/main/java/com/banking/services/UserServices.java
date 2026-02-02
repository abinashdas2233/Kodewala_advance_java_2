package com.banking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.banking.entity.UserDetails;
import com.banking.repo.UserRepo;
import com.banking.request.UserRequest;

@Service
public class UserServices {
	@Autowired
	UserRepo repo;
	public String registerUser(UserRequest req) {
		UserDetails detail=new UserDetails();
		detail.setFirstName(req.getFirstName());
		detail.setLastName(req.getLastName());
		detail.setAddress(req.getAddress());
		repo.save(detail);
		
		
		return "user id -"+String.valueOf(detail.getId());
		
	}
	
	public Page<UserDetails>  getUser() {
		Page<UserDetails>data=repo.findAll(PageRequest.of(3, 10));
		return data;
	}
	
	public UserDetails fetchData(String lastName) {
		return repo.findBylastName(lastName).get();
	}

}
