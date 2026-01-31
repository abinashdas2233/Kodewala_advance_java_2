package com.uber.booking.system.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.booking.system.entity.RiderDetails;
import com.uber.booking.system.exception.InvalidIdException;
import com.uber.booking.system.repository.RiderRepo;
import com.uber.booking.system.request.RiderInfo;
@Service

public class RiderServiceImplementation implements RiderServices{
	@Autowired
	RiderRepo repo;

	@Override
	public String createRider(RiderInfo rider) {
		
		RiderDetails riderDetail=new RiderDetails();
		riderDetail.setName(rider.getName());
		riderDetail.setEmail(rider.getEmail());
		riderDetail.setPhone(rider.getPhone());
		riderDetail.setCurrentLocation(rider.getCurrentLocation());
		
		repo.save(riderDetail);
		
		
		
		return String.valueOf(riderDetail.getId());
	}

	@Override
	public RiderDetails fetchRider(int id) {

	    Optional<RiderDetails> optionalRider = repo.findById(id);

	    if (!optionalRider.isPresent()) {
	        throw new InvalidIdException("Rider not found with id: " + id);
	    }

	    return optionalRider.get();
	}


	public String updateProfile(int id, String email) {

	    Optional<RiderDetails> optionalRider = repo.findById(id);

	    if (!optionalRider.isPresent()) {
	        throw new InvalidIdException("Rider not found with id: " + id);
	    }

	    RiderDetails rider = optionalRider.get();
	    rider.setEmail(email);
	    repo.save(rider);

	    return "Profile updated successfully";
	}



	@Override
	public String deleteProfile(int id) {

	    RiderDetails rider = repo.findById(id)
	            .orElseThrow(() ->
	                new InvalidIdException("Rider not found with id: " + id)
	            );

	    repo.delete(rider);
	    return "Profile deleted successfully";
	}


	
	

}
