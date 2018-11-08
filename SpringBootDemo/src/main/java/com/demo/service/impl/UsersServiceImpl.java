package com.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Users;
import com.demo.repository.UsersRepository;
import com.demo.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	private UsersRepository usersRepository;
	@Autowired
	public UsersServiceImpl(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@Override
	public List<Users> findAll() {
		return usersRepository.findAll();
	}

	@Override
	public Optional<Users> findByUsersId(Integer id) {
		return usersRepository.findById(id);
	}

	@Override
	public String deleteByUsersId(Integer id) {
		usersRepository.deleteById(id);
		return "'users':'Delete successfully!'";
	}

	@Override
	public Users addUsers(Users users) {	
		return usersRepository.save(users);
	}

	
	
}
