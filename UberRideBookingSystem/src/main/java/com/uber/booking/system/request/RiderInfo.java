package com.uber.booking.system.request;


public class RiderInfo {
	
	private String name;
	private String phone;
	private String email;
	private String currentLocation;
	public RiderInfo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
	public RiderInfo( String name, String phone, String email, String currentLocation) {
		super();
		
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.currentLocation = currentLocation;
	}
	
	

}
