package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.connection.Dbconn;
import com.model.User;
import com.model.User_login;

public class Datadao implements DatadaoI{

	Dbconn db = new Dbconn();
	Connection con = db.getConnection();
	@Override
	public String InsertData(User user) {
		// TODO Auto-generated method stub
		// con = db.gConnection();
		
		try {
			PreparedStatement psmt= con.prepareStatement("insert into bank_app(username,password,phone,email,image) values (?,?,?,?,?)");
			psmt.setString(1, user.getUsername());
			psmt.setString(2, user.getPassword());
			psmt.setString(3, user.getPhone());
			psmt.setString(4, user.getEmail());
			psmt.setBytes(5, user.getImage());
			int i = psmt.executeUpdate();
			
			if(i>0) {
				
					return "success";
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<User> showalldata(){
		ArrayList<User> al = new ArrayList<User>();
		try {
			PreparedStatement psmt = con.prepareStatement("SELECT * FROM bank_app;");
			ResultSet rs = psmt.executeQuery();
			User u;
			while(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("phone"));
				u.setImage(rs.getBytes("image"));
				
				al.add(u);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return al;
		
	}
	
	public List<User> showData(){
		ArrayList<User> al = new ArrayList<User>();
		try {
			PreparedStatement psmt = con.prepareStatement("SELECT * FROM bank_app;");
			ResultSet rs = psmt.executeQuery();
			User u;
			while(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("phone"));
				al.add(u);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return al;
 	}
	
	@Override
	public User fetchData(int id) {
		// TODO Auto-generated method stub
		User u = null;
		try {
		PreparedStatement psmt = con.prepareStatement("SELECT * FROM bank_app WHERE ID=?;");
		psmt.setInt(1, id);
		ResultSet rs = psmt.executeQuery();
		
			while(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("phone"));
				u.setImage(rs.getBytes("image"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	public String UpdateData(User u) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement psmt= con.prepareStatement("update bank_app set username=?,password=?,phone=?,email=?,image=? where id=?");
			psmt.setString(1, u.getUsername());
			psmt.setString(2, u.getPassword());
			psmt.setString(3, u.getPhone());
			psmt.setString(4, u.getEmail());
			psmt.setBytes(5, u.getImage());
			
			psmt.setInt(6, u.getId());
			int i=psmt.executeUpdate();
			if(i>0)
			{
				return "success";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}

	@Override
	public String DeleteId(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("DELETE FROM bank_app WHERE id=?");
			ps.setInt(1, id);
			int i=ps.executeUpdate();
			if(i>0) {
				return"Delete";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public String LoginData(User u) {
	    try {
	        PreparedStatement ps = con.prepareStatement(
	            "SELECT * FROM bank_app WHERE email=? AND password=?"
	        );
	        ps.setString(1, u.getEmail());
	        ps.setString(2,u.getPassword());

	        ResultSet rs = ps.executeQuery(); // ✅ Correct method

	        if (rs.next()) {  // ✅ Check if any record found
	            return "success";
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return "Invalid";
	}
	public Optional<User> findByCredentials(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
