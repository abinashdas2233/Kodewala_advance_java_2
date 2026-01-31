package com.uber.booking.system.request;

public class RideInfo {
	private int customerId;
	private String source;
	private String destination;
	private double fare;
	private String status;
	public RideInfo(int customerId, String source, String destination, double fare, String status) {
		super();
		this.customerId = customerId;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.status = status;
	}
	public RideInfo() {
		super();
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
