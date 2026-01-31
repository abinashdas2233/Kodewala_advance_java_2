package com.uber.booking.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uber.booking.system.entity.RiderDetails;
import com.uber.booking.system.request.RiderInfo;
import com.uber.booking.system.services.RiderServices;

@RestController
@RequestMapping("/uberRider")
public class RiderController {
	@Autowired
	RiderServices riderservice;
	
	@PostMapping("/riderRegister")
	public ResponseEntity CreateRider(@RequestBody RiderInfo rider) {
		
		String id=riderservice.createRider(rider);
		
		
		
		
		
		
		return ResponseEntity.ok("new Rider created with id-"+id);
		
	}
	
	@GetMapping("/fetchrider/{id}")
	public ResponseEntity FetchingRider(@PathVariable int id) {
		
		RiderDetails rider=riderservice.fetchRider(id);
		
		
		
		
		return ResponseEntity.ok(rider);
	}
	@PutMapping("/updateprofile")
	public ResponseEntity updateRider(@RequestParam("id")int id,@RequestParam("email" )String email) {
		
		riderservice.updateProfile(id,email);
		
		return ResponseEntity.ok("succesfully updated");
	}
	
	
	@DeleteMapping("/del")
public ResponseEntity deleteRider(@RequestParam("id")int id) {
		
		riderservice.deleteProfile(id);
		
		return ResponseEntity.ok("succesfully deleted");
	}
	
	
	
	

}
