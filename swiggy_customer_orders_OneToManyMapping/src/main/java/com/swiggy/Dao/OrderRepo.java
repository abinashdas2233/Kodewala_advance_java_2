package com.swiggy.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swiggy.entity.CustomerDetails;

public interface OrderRepo extends JpaRepository<CustomerDetails, Integer>{

}
