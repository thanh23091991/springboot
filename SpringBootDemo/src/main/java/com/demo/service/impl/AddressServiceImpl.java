package com.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Address;
import com.demo.repository.AddressRepository;
import com.demo.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	private AddressRepository addressRepository;
	@Autowired
	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	@Override
	public List<Address> findAll() {
		return addressRepository.findAll();
	}
	@Override
	public Optional<Address> findById(Integer id) {
		return addressRepository.findById(id);
	}
	@Override
	public String deleteById(Integer id) {
		addressRepository.deleteById(id);
		return "Delete successfully";
	}
	
	
}
