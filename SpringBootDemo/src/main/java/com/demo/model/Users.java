package com.demo.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usersId", columnDefinition="int", nullable=false)
	private int usersId;
	@Column(name = "username",columnDefinition="varchar(30)", nullable = false)
	private String username;
	@Column(name = "password",columnDefinition="varchar(30)", nullable = false)
	private String password;
	@OneToMany(targetEntity = Address.class, mappedBy ="users", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Address> addresses;
	public int getUsersId() {
		return usersId;
	}
	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
