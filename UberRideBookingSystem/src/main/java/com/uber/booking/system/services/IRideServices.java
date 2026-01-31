package com.uber.booking.system.services;

import org.springframework.http.ResponseEntity;

import com.uber.booking.system.entity.DriverDetails;
import com.uber.booking.system.request.RideInfo;

public interface IRideServices {
	public void booking(DriverDetails driver,RideInfo ride);
	
	public ResponseEntity rideDetails(int id);
	
	public String updateRideStatus(int id,String status);
	

}
