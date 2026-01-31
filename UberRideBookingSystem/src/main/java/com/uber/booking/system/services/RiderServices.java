package com.uber.booking.system.services;

import java.util.List;

import com.uber.booking.system.entity.RiderDetails;
import com.uber.booking.system.request.RiderInfo;

public interface RiderServices {
	public String createRider(RiderInfo rider);
	
	public RiderDetails fetchRider(int id);
	public String updateProfile(int id,String name);
	public String deleteProfile(int id);
	
	
	

}
