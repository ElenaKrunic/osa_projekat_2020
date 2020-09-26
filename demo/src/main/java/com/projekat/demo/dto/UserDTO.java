package com.projekat.demo.dto;

import com.projekat.demo.entity.User;

public class UserDTO {
	
	private Integer id; 
	private String username; 
	private String password; 
	private String firstName; 
	private String lastName;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User user) {
		this.id = user.getId(); 
		this.username = user.getUsername(); 
		this.password = user.getPassword(); 
		this.firstName = user.getFirstName(); 
		this.lastName = user.getLastName();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
