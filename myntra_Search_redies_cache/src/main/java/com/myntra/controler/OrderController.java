package com.myntra.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myntra.Services.OrderService;
import com.myntra.request.OrderDetails;

@RestController
@RequestMapping("/myntra")
public class OrderController {
	@Autowired
	OrderService service;
	
	@PostMapping("/orderpost")
	public String createOrder(@RequestBody OrderDetails order) {
		System.out.println(order.getItemName()+" "+order.getPrice());
		service.createOrder(order);
		
		
		return "order created";
	}
	
	@GetMapping("/fetchorder/{id}")
	public ResponseEntity fetchingMyntraOrder(@PathVariable int id) {
		return ResponseEntity.ok(service.fetchOrder(id));
	}

}
