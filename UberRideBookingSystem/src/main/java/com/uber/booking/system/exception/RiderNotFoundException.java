package com.uber.booking.system.exception;

public class RiderNotFoundException extends RuntimeException{
	public RiderNotFoundException(String msg) {
		super(msg);
	}

}
