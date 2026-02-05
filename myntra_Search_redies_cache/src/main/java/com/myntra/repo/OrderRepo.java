package com.myntra.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myntra.entity.MyntraOrder;

public interface OrderRepo extends JpaRepository<MyntraOrder, Integer>{

}
