package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
