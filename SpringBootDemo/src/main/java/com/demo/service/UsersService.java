package com.demo.service;

import java.util.List;
import java.util.Optional;

import com.demo.model.Users;

public interface UsersService {
	List<Users> findAll();

	Optional<Users> findByUsersId(Integer id);
	
	String deleteByUsersId(Integer id);
	
	Users addUsers(Users users);
}
