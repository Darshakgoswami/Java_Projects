package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.User;
import com.util.Dbconn1;

public class Datadao {
	Dbconn1 db=new Dbconn1();
	Session s = db.gSession();
	
	// insert query
	Transaction t=s.beginTransaction();
	// method for insert data
	public void InsertData(User user)
	{
		s=db.gSession();
		t=s.beginTransaction();
		s.save(user);
		t.commit();
		s.close();
	}
	
	public void UpdateData(User user)
	{
		s=db.gSession();
		t=s.beginTransaction();
		s.update(user);
		t.commit();
		s.close();
	}
	
	public void DeleteData(User user)
	{
		s=db.gSession();
		t=s.beginTransaction();
		s.delete(user);
		t.commit();
		s.close();
	}
	
	public User FetchData(int id)
	{
		s=db.gSession();
		User u=(User) s.get(User.class, id);
		return u;
	}
	
	public List<User> FetchAllData()
	
	{
		s=db.gSession();
		List<User> list=s.createQuery("from User").list();
		return list;
	}
	
}
