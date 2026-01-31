package com.uber.booking.system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RideDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rideId;
	 private String source;
	 private String destination;
	 private double price;
	 private String staus;
	 @ManyToOne
	 @JoinColumn(name = "driver_id")
	 private DriverDetails driver;

	 public int getRideId() {
		 return rideId;
	 }

	 public void setRideId(int rideId) {
		 this.rideId = rideId;
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

	 public double getPrice() {
		 return price;
	 }

	 public void setPrice(double price) {
		 this.price = price;
	 }

	 public String getStaus() {
		 return staus;
	 }

	 public void setStaus(String staus) {
		 this.staus = staus;
	 }

	 public DriverDetails getDriver() {
		 return driver;
	 }

	 public void setDriver(DriverDetails driver) {
		 this.driver = driver;
	 }

	 public RideDetails() {
		super();
		// TODO Auto-generated constructor stub
	 }

	 public RideDetails(int rideId, String source, String destination, double price, String staus,
			DriverDetails driver) {
		super();
		this.rideId = rideId;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.staus = staus;
		this.driver = driver;
	 }
	 
	 
	

}
