package com.uber.booking.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.booking.system.entity.RiderDetails;

public interface RiderRepo extends JpaRepository<RiderDetails, Integer>{

}
