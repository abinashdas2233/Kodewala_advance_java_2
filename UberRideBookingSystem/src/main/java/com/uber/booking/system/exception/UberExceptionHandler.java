package com.uber.booking.system.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.uber.booking.system.response.ErrorResponse;

@ControllerAdvice
public class UberExceptionHandler {
	@ExceptionHandler(InvalidIdException.class)
	public ResponseEntity<ErrorResponse> idHandleException(InvalidIdException ex){
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setError(ex.getMessage());
		errorResponse.setMessageCode("ub-001");
		return ResponseEntity.ok(errorResponse);
	}
	
	@ExceptionHandler(RiderNotFoundException.class)
	
	public ResponseEntity<ErrorResponse> riderNotFoundException(RiderNotFoundException rd){
		ErrorResponse error= new ErrorResponse();
		error.setError(rd.getMessage());
		error.setMessageCode("ub-002");
		return ResponseEntity.ok(error);
		
	}

}
