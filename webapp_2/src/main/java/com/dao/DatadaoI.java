package com.dao;

import java.util.List;

import com.model.User;
import com.model.User_login;
public interface DatadaoI {

	//Insert query method
	public String InsertData(User user);
	List<User> showalldata();
	
	//fetch all data based on id;
	public User fetchData(int id);
	
	public String DeleteId(int id);
	public String LoginData(User u);
	


}