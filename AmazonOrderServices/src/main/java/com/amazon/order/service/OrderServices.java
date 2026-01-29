package com.amazon.order.service;

import org.springframework.http.ResponseEntity;

import com.amazon.order.entity.AmazonOrderData;
import com.amazon.order.request.OrderDetails;

public interface OrderServices {
	public String createOrder(OrderDetails orderDetail) ;
	public AmazonOrderData orderSearch(int id);
	public  String deleteData(int id);

}
