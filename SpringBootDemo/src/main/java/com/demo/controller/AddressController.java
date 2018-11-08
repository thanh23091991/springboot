package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Address;
import com.demo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	private AddressService addressService;
	@Autowired
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}

	@RequestMapping("/list")
	public List<Address> findAll() {
		return addressService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<Address> findById(@PathVariable int id){
		return addressService.findById(id);
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return addressService.deleteById(id);
	}
}
