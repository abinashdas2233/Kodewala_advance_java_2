package com.uber.booking.system.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.booking.system.entity.DriverDetails;
import com.uber.booking.system.exception.InvalidIdException;
import com.uber.booking.system.repository.DriverRepo;
import com.uber.booking.system.request.DriverInfo;


@Service

public class DriverServiceImplementation implements IDriverService {
	@Autowired
	DriverRepo drepo;

	

	@Override
	public String register(DriverInfo info) {
		DriverDetails driver=new DriverDetails();
		driver.setAvailability(info.getAvailability());
		driver.setName(info.getName());
		driver.setPhone(info.getPhone());
		driver.setVehicleNo(info.getVehicleNo());
		drepo.save(driver);
		
		
		
		return "registration Done id is -"+driver.getId();
	}



	@Override
	public void updateAvilability(int id, String status) {

	    if (!drepo.existsById(id)) {
	        throw new InvalidIdException("Driver not found with id: " + id);
	    }

	    DriverDetails detail = drepo.findById(id).get();
	    detail.setAvailability(status);
	    drepo.save(detail);
	}



	@Override
	public DriverDetails fetchDriver(int id) {
		 if (!drepo.existsById(id)) {
		        throw new InvalidIdException("Driver not found with id: " + id);
		    }
		DriverDetails driver=drepo.findById(id).get();
		return driver ;
	}



	@Override
	public String deleteDrive(int id) {
		 if (!drepo.existsById(id)) {
		        throw new InvalidIdException("Driver not found with id: " + id);
		    }
		drepo.deleteById(id);
		return "Successfully Deleted";
	}



	
	
	
	@Override
	public List<DriverDetails> findAllDrivers() {
		List<DriverDetails>riderRecord=drepo.findAll();
		return riderRecord;
	}



	@Override
	public void updateStatus(DriverDetails driver) {
		driver.setAvailability("BUSY");
		drepo.save(driver);
		
		
	}

}
