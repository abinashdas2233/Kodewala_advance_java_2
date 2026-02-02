package com.banking.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.UserDetails;

public interface UserRepo  extends JpaRepository<UserDetails, Integer>{
	public Optional<UserDetails>findBylastName(String lastName);

}
