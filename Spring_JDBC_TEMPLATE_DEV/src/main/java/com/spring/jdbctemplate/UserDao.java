package com.spring.jdbctemplate;

import java.util.List;

public interface UserDao {
	//insert user
	void register(User user);
	
	//show all users
	List<User> getAllUsers();
}