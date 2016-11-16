package com.example.service;

import com.example.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
