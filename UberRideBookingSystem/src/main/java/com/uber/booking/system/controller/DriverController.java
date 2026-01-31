package com.uber.booking.system.controller;

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

import com.uber.booking.system.entity.DriverDetails;
import com.uber.booking.system.entity.RiderDetails;
import com.uber.booking.system.request.DriverInfo;
import com.uber.booking.system.services.IDriverService;

@RestController
@RequestMapping("/uberDriver")

public class DriverController {
	@Autowired
	IDriverService driverService;
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody DriverInfo driver) {
		String status=driverService.register(driver);
		
		return ResponseEntity.ok(status);
		
		
	}
	
	@PutMapping("/updatestatus")
	public ResponseEntity updateAvilability(@RequestParam("id")int id,@RequestParam("status" )String status) {
		
		driverService.updateAvilability(id,status);
		
		return ResponseEntity.ok("succesfully updated");
	}
	
	

	@GetMapping("/fetchdriver/{id}")
	public ResponseEntity fetchingDriver(@PathVariable int id) {
		
		DriverDetails driver=driverService.fetchDriver(id);
		
		
		
		
		return ResponseEntity.ok("Rider Details-"+driver);
	}
	@DeleteMapping("/delDriver")
	public String deleteDriver(@RequestParam("id") int id) {
		driverService.deleteDrive(id);
		
		return "delete-Successfully";
	}

}
