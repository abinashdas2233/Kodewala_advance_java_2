package com.amazon.order.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.amazon.order.entity.AmazonOrderData;
import com.amazon.order.repository.OrderRepository;
import com.amazon.order.request.OrderDetails;
@Service
public class OrderServiceImplemantation  implements OrderServices{
	@Autowired
	OrderRepository orderrepo;

	@Override
	public String createOrder(OrderDetails orderDetail) {
		// TODO Auto-generated method stub
		AmazonOrderData order=new AmazonOrderData();
		order.setItemName(orderDetail.getItemName());
		order.setDescription(orderDetail.getDescription());
		order.setPrice(orderDetail.getPrice());
		order.setQuantity(orderDetail.getQuantity());
		
		AmazonOrderData detail=orderrepo.save(order);
		String id=String.valueOf(detail.getOrderId());
		
		return id;
	}

	@Override
	public AmazonOrderData orderSearch(int id) {
		// TODO Auto-generated method stub
		
		AmazonOrderData detail=orderrepo.findById(id).get();
		return detail;
	}

	@Override
	public String deleteData(int id) {
		// TODO Auto-generated method stub
		
		orderrepo.deleteById(id);
		return id+" deleted sucessfully";
	}
	

}
