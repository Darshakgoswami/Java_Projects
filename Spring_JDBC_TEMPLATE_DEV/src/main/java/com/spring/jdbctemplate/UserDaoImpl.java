package com.spring.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	 JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
	String sql = "insert into new(Username,Password) values(?,?)";
	jdbcTemplate.update(sql, new Object[] 
			{ user.getUsername(), user.getPassword()
			});
		
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		String sql = "select * from new";
		return jdbcTemplate.query(sql, (rs,rowNum)->
		{
			User user=new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("Username"));
			user.setPassword(rs.getString("Password"));
			return user;
		});
	}

}
