package com.myntra.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.myntra.entity.MyntraOrder;
import com.myntra.repo.OrderRepo;
import com.myntra.request.OrderDetails;
@Service
public class OrderServiceImplementation implements OrderService {
	@Autowired
	OrderRepo repo;

	@Override
	public String createOrder(OrderDetails details) {
		MyntraOrder myntra=new MyntraOrder();
		myntra.setItemName(details.getItemName());
		myntra.setPrice(details.getPrice());
		repo.save(myntra);
		
		return "successfull created";
	}

	@Override
	@Cacheable(value = "products-new", key = "#id", unless = "#result == null")
	public MyntraOrder fetchOrder(int id) {
		System.out.println("database called");
		
		return repo.findById(id).get();
	}

}
