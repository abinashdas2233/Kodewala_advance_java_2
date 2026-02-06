package com.swiggy.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.Dao.OrderRepo;
import com.swiggy.entity.CustomerDetails;
import com.swiggy.entity.FoodItemsDetails;
import com.swiggy.request.CustomerRequest;
import com.swiggy.request.FoodItemRequest;

@Service
public class OrderServiceImplementation implements OrderService {

    @Autowired
    private OrderRepo repo;

    @Override
    public String createOrder(CustomerRequest customer) {

        
        CustomerDetails details = new CustomerDetails();
        details.setName(customer.getName());
        details.setPrice(customer.getPrice());

        
        List<FoodItemsDetails> foodItems = customer.getItemList()
                .stream()
                .map(item -> {
                    FoodItemsDetails food = new FoodItemsDetails();
                    food.setItemName(item.getItemName());
                    return food;
                })
                .collect(Collectors.toList());

       
        details.setItemList(foodItems);

        
        repo.save(details);

        return "Order Created Successfully";
    }
}
