package com.amazon.order.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amazon.order.entity.AmazonOrderData;

@Repository

public interface OrderRepository extends CrudRepository<AmazonOrderData, Integer> {

}
