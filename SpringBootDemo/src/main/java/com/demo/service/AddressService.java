package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Address;

public interface AddressService {
	List<Address> findAll();

	Optional<Address> findById(Integer id);
	
	String deleteById(Integer id);
	
	

}
