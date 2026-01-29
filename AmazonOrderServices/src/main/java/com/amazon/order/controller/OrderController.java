package com.amazon.order.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.order.entity.AmazonOrderData;
import com.amazon.order.request.OrderDetails;
import com.amazon.order.service.OrderServices;

@RestController
@RequestMapping("/amazon")

public class OrderController {
	@Autowired
	OrderServices service;
	@PostMapping("/placeorder")
	public ResponseEntity placeOrder(@RequestBody OrderDetails order) {
		String id=service.createOrder(order);
		HashMap<String, String>bill=new HashMap<String, String>();
		bill.put("id", id);
		bill.put("order status-", "success");
		
		
		
		return ResponseEntity.ok(bill);
	}
	@GetMapping("/orderfind/{id}")
	public  ResponseEntity findOrder(@PathVariable String id) {
		
		AmazonOrderData data=service.orderSearch(Integer.parseInt(id));
		
		HashMap<String, String>hm=new HashMap<String, String>();
		
		
		
		
		hm.put("orderId", String.valueOf(data.getOrderId()));
		hm.put("itemName", data.getItemName());
		hm.put("price", String.valueOf(data.getPrice()));
		hm.put("description", data.getDescription());
		
		return ResponseEntity.ok(hm);
	}
	@DeleteMapping("/datadelete")
	public String removeData(@RequestParam("userId") int id) {
		String resp=service.deleteData(id);
		
		return resp;
	}


}
