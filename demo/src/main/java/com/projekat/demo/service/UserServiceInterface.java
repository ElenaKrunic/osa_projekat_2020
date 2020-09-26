package com.projekat.demo.service;

import com.projekat.demo.entity.User;

public interface UserServiceInterface {
	public User findByUsername(String username);
	
	public User findByUsernameAndPassword(String username, String password);
}
