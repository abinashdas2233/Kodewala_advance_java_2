package com.uber.booking.system.request;

public class DriverInfo {
	
	
	private String name;
	private String phone;
	private String vehicleNo;
	private String availability;
	public DriverInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DriverInfo( String name, String phone, String vehicleNo, String availability) {
		super();
		
		this.name = name;
		this.phone = phone;
		this.vehicleNo = vehicleNo;
		this.availability = availability;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
	

}
