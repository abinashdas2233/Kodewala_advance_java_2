package com.uber.booking.system.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.uber.booking.system.exception.RiderNotFoundException;
import com.uber.booking.system.request.RideInfo;

import com.uber.booking.system.services.IDriverService;
import com.uber.booking.system.services.IRideServices;


@RestController
@RequestMapping("/uberride")

public class RideController {
	
	
	@Autowired
	IDriverService rservice;
	@Autowired
	IRideServices rideService;
	
	
	@PostMapping("/bookride")
	public String bookingRide(@RequestBody RideInfo info) {
		List<DriverDetails>riderData=rservice.findAllDrivers();
		if(riderData.stream().filter(i->i.getAvailability().equalsIgnoreCase("AVAILABLE")).collect(Collectors.toList()).size()==0) {
			throw new RiderNotFoundException("Rider Not available");
			
		}
		
		DriverDetails assignedRider=riderData.stream().filter((i)->i.getAvailability().equalsIgnoreCase("AVAILABLE")).limit(1).collect(Collectors.toList()).get(0);	
		System.out.println(info.getCustomerId()+info.getDestination()+info.getFare()+info.getStatus());
		//after rider assigned to customer status will updated to busy
		rservice.updateStatus(assignedRider);
		
		rideService.booking(assignedRider, info);
		
		
		
		
		
		return "booking done";
		
	}
	@GetMapping("/fetchride/{id}")
public ResponseEntity fetchRider(int id) {
	
	return rideService.rideDetails(id);
	
	
}
	
	@PutMapping("/updateride")
	public String updateRideStatus(@RequestParam("id") int id,@RequestParam("status")String status) {
		
		String statusUpdate=rideService.updateRideStatus(id,status);
		return "updated status-"+statusUpdate;
	}
	
	@PutMapping("/cancelride")
	public String cancelRide(@RequestParam("id") int id,@RequestParam("status")String status) {
		
		String statusUpdate=rideService.updateRideStatus(id,status);
		return "updated status-"+statusUpdate;
	}
	

}
