package com.myntra.Services;

import com.myntra.entity.MyntraOrder;
import com.myntra.request.OrderDetails;

public interface OrderService {
	public String createOrder(OrderDetails details);
	public MyntraOrder fetchOrder(int id);
}
