package com.uber.booking.system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.uber.booking.system.entity.DriverDetails;
import com.uber.booking.system.entity.RideDetails;
import com.uber.booking.system.exception.InvalidIdException;
import com.uber.booking.system.repository.RideRepo;
import com.uber.booking.system.request.RideInfo;
@Service
public class RideServiceImplementation implements IRideServices{
	@Autowired
	RideRepo repo;

	@Override
	public void booking(DriverDetails driver, RideInfo ride) {
		RideDetails rideDetail=new RideDetails();
		rideDetail.setDestination(ride.getDestination());
		rideDetail.setDriver(driver);
		rideDetail.setPrice(ride.getFare());
		rideDetail.setSource(ride.getSource());
		rideDetail.setStaus(ride.getStatus());
		
		repo.save(rideDetail);
		
		
	}

	@Override
	public ResponseEntity rideDetails(int id) {
		 if (!repo.existsById(id)) {
		        throw new InvalidIdException("id not found with id: " + id);
		    }
		RideDetails details=repo.findById(id).get();
		return ResponseEntity.ok(details);
	}

	@Override
	public String updateRideStatus(int id, String status) {
		 if (!repo.existsById(id)) {
		        throw new InvalidIdException("id not found with id: " + id);
		    }
		RideDetails details=repo.findById(id).get();
		details.setStaus(status);
		RideDetails ride=repo.save(details);
		return String.valueOf(ride.getRideId());
	}

}
