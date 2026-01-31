package com.uber.booking.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.booking.system.entity.DriverDetails;

public interface DriverRepo extends JpaRepository<DriverDetails, Integer> {

}
