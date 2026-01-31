package com.uber.booking.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.booking.system.entity.RideDetails;

public interface RideRepo extends JpaRepository<RideDetails, Integer> {

}
