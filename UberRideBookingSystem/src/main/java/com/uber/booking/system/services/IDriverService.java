package com.uber.booking.system.services;
import java.util.List;

import com.uber.booking.system.entity.DriverDetails;
import com.uber.booking.system.request.DriverInfo;


public interface IDriverService {
	public String register(DriverInfo info);
	public void updateAvilability(int id ,String status);
	public DriverDetails fetchDriver(int id);
	public String deleteDrive(int id);
	
	public List<DriverDetails>findAllDrivers();
	
	public void updateStatus(DriverDetails driver);

}
