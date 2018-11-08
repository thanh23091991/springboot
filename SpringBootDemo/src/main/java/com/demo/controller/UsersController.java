package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Users;
import com.demo.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	private UsersService usersService;
	@Autowired
	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return usersService.deleteByUsersId(id);
	}
	@RequestMapping("/{id}")
	public Optional<Users> findById(@PathVariable int id) {
		return usersService.findByUsersId(id);
	}
	
	@RequestMapping("/add")
	public Users addUsers(@RequestBody Users users) {
		return usersService.addUsers(users);
	}
	
	@RequestMapping("/list")
	public List<Users> findAll(){
		return usersService.findAll();
	}
}
